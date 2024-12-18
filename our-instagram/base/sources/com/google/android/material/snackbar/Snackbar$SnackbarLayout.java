package com.google.android.material.snackbar;

import X.AbstractC43594JPz;
import X.AbstractC63123SdR;
import X.AbstractC65702TsY;
import X.UBZ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes11.dex */
public final class Snackbar$SnackbarLayout extends UBZ {
    public Snackbar$SnackbarLayout(Context context) {
        super(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int A08 = AbstractC43594JPz.A08(this, getMeasuredWidth());
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                AbstractC65702TsY.A12(childAt, childAt.getMeasuredHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(A08, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            }
        }
    }

    @Override // X.UBZ, android.view.View
    public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // X.UBZ, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // X.UBZ, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
    }

    @Override // X.UBZ, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
        super.setBackgroundTintMode(mode);
    }

    @Override // X.UBZ, android.view.View
    public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
