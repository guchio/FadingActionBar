package com.manuelpeinado.fadingactionbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FrameLayoutExtend extends FrameLayout {

  private int layoutOffset = 0;

  public FrameLayoutExtend(Context context) {
    super(context);
  }

  public FrameLayoutExtend(Context context, AttributeSet attrs ) {
    super(context, attrs);
  }

  @Override
  protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    super.onLayout(changed, left, top, right, bottom);

    offsetTopAndBottom(layoutOffset);
  }

  public void setLayoutOffset(int layoutOffset) {
    this.layoutOffset = layoutOffset;
  }

}
