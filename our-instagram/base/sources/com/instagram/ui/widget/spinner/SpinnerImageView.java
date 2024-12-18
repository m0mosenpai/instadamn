package com.instagram.ui.widget.spinner;

import X.C0f9;
import X.C3T1;
import X.C72663Nn;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* loaded from: classes2.dex */
public class SpinnerImageView extends ColorFilterAlphaImageView {
    public ObjectAnimator A00;
    public boolean A01;
    public boolean A02;

    private void A00() {
        setScaleType(ImageView.ScaleType.CENTER);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 360.0f).setDuration(850L);
        this.A00 = duration;
        duration.setRepeatMode(1);
        this.A00.setRepeatCount(-1);
        this.A00.setInterpolator(new LinearInterpolator());
    }

    public SpinnerImageView(Context context) {
        super(context);
        this.A02 = true;
        A00();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-529678929);
        super.onAttachedToWindow();
        if (isShown() && this.A02) {
            this.A00.start();
        }
        C72663Nn.A00.A00(this);
        C0f9.A0D(249481618, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-2004292350);
        this.A01 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
        C72663Nn.A00.A01(this);
        C0f9.A0D(-2075401652, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 && this.A02) {
            this.A00.start();
            this.A01 = false;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i == 0 && getVisibility() == 0 && this.A02) {
                if (getAnimation() == null) {
                    if (getMeasuredWidth() != 0) {
                        this.A00.start();
                        return;
                    }
                    z = true;
                } else {
                    return;
                }
            } else {
                this.A00.cancel();
                z = false;
            }
            this.A01 = z;
        }
    }

    public void setLoadingStatus(C3T1 c3t1) {
        int i;
        int ordinal = c3t1.ordinal();
        int i2 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i2 = 4;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                setVisibility(i2);
            }
            this.A02 = false;
            this.A00.end();
            i = R.drawable.loadmore_icon_refresh_compound;
        } else {
            this.A02 = true;
            this.A00.start();
            i = R.drawable.spinner_large;
        }
        setBackgroundResource(i);
        setVisibility(i2);
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = true;
        A00();
    }

    public SpinnerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = true;
        A00();
    }
}
