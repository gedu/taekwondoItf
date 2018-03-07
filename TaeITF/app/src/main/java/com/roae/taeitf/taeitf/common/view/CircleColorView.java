package com.roae.taeitf.taeitf.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by edu on 3/6/18.
 */

public class CircleColorView extends View {

  private Paint mask;
  private Paint primaryColor;
  private Paint secondaryColor;

  private PorterDuffXfermode sourceInDuff;

  private Rect primaryRect;

  public CircleColorView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public CircleColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  private void init() {
    mask = new Paint(Paint.ANTI_ALIAS_FLAG);
    mask.setStyle(Paint.Style.FILL);
    mask.setColor(Color.BLUE);

    primaryColor = new Paint(Paint.ANTI_ALIAS_FLAG);
    primaryColor.setStyle(Paint.Style.FILL);
    primaryColor.setColor(Color.CYAN);

    primaryRect = new Rect();

    sourceInDuff = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    canvas.drawCircle(10, 10, 50, mask);

    primaryColor.setXfermode(sourceInDuff);
    primaryColor.setColor(Color.CYAN);
    primaryRect.set(20, 20, 100, 100);
    canvas.drawRect(primaryRect, primaryColor);
  }
}
