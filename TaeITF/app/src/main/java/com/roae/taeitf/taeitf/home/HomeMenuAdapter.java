package com.roae.taeitf.taeitf.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.roae.taeitf.taeitf.R;
import com.roae.taeitf.taeitf.common.base.ButterViewHolder;
import com.roae.taeitf.taeitf.common.base.MenuFactory;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

public class HomeMenuAdapter extends RecyclerView.Adapter<HomeMenuAdapter.MenuViewHolder> {

  interface HomeMenuListener {
    void onMenuItemClick(HomeMenuItem menuItem);
  }

  private List<HomeMenuItem> menuItems;
  private HomeMenuListener listener;

  @Inject
  HomeMenuAdapter(HomeMenuListener listener) {
    this.listener = listener;
    this.menuItems = MenuFactory.getMenus();
  }

  @Override
  public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View rootView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.home_menu_item_list, parent, false);
    return new MenuViewHolder(rootView);
  }

  @Override
  public void onBindViewHolder(MenuViewHolder holder, int position) {
    HomeMenuItem menuItem = menuItems.get(position);

    holder.icon.setImageResource(menuItem.getIconRes());
    holder.title.setText(menuItem.getTextRes());
  }

  @Override
  public int getItemCount() {
    return menuItems.size();
  }

  class MenuViewHolder extends ButterViewHolder implements View.OnClickListener {

    @BindView(R.id.menu_icon_image)
    ImageView icon;

    @BindView(R.id.menu_icon_title)
    TextView title;

    MenuViewHolder(View itemView) {
      super(itemView);

      itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      listener.onMenuItemClick(menuItems.get(getAdapterPosition()));
    }
  }
}
