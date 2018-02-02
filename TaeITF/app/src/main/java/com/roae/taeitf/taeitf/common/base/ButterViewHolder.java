package com.roae.taeitf.taeitf.common.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by eduardo.graciano on 1/31/18.
 */

public class ButterViewHolder extends RecyclerView.ViewHolder {

  public ButterViewHolder(View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }
}
