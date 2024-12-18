package com.instagram.music.common.ui;

import X.AbstractC13630mp;
import X.AbstractC55922hc;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.MY0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* loaded from: classes3.dex */
public final class LoadingSpinnerView extends ColorFilterAlphaImageView {
    public ObjectAnimator A00;
    public boolean A01;
    public boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingSpinnerView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A01 = true;
        A00(context, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z = false;
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i == 0 && getVisibility() == 0 && this.A01) {
                if (getAnimation() == null) {
                    if (getMeasuredWidth() != 0) {
                        ObjectAnimator objectAnimator = this.A00;
                        if (objectAnimator != null) {
                            objectAnimator.start();
                            return;
                        }
                        C14360o3.A0F("animator");
                        throw C00O.createAndThrow();
                    }
                    z = true;
                    this.A02 = z;
                    return;
                }
                return;
            }
            ObjectAnimator objectAnimator2 = this.A00;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.A02 = z;
                return;
            }
            C14360o3.A0F("animator");
            throw C00O.createAndThrow();
        }
    }

    public final void setLoadingStatus(MY0 my0) {
        int i;
        C14360o3.A0B(my0, 0);
        int ordinal = my0.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 8;
            } else {
                throw new RuntimeException();
            }
        } else {
            this.A01 = true;
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator == null) {
                C14360o3.A0F("animator");
                throw C00O.createAndThrow();
            }
            objectAnimator.start();
            setBackgroundDrawableInternal(R.drawable.spinner_large);
            i = 0;
        }
        setVisibility(i);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        setScaleType(ImageView.ScaleType.CENTER);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 360.0f).setDuration(850L);
        this.A00 = duration;
        if (duration != null) {
            duration.setRepeatMode(1);
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator != null) {
                objectAnimator.setRepeatCount(-1);
                ObjectAnimator objectAnimator2 = this.A00;
                if (objectAnimator2 != null) {
                    objectAnimator2.setInterpolator(new LinearInterpolator());
                    if (attributeSet != null) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1h);
                        C14360o3.A07(obtainStyledAttributes);
                        if (obtainStyledAttributes.getBoolean(0, false)) {
                            setLoadingStatus(MY0.A02);
                        }
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F("animator");
        throw C00O.createAndThrow();
    }

    private final void setBackgroundDrawableInternal(int i) {
        Context context = getContext();
        C14360o3.A07(context);
        Drawable A00 = AbstractC13630mp.A00(context, i);
        A00.mutate().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        setBackground(A00);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(340399246);
        super.onAttachedToWindow();
        if (isShown() && this.A01) {
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator == null) {
                C14360o3.A0F("animator");
                throw C00O.createAndThrow();
            }
            objectAnimator.start();
        }
        C0f9.A0D(-380273420, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1937689460);
        this.A02 = false;
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator == null) {
            C14360o3.A0F("animator");
            throw C00O.createAndThrow();
        }
        objectAnimator.cancel();
        super.onDetachedFromWindow();
        C0f9.A0D(1221064863, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 && this.A01) {
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator == null) {
                C14360o3.A0F("animator");
                throw C00O.createAndThrow();
            }
            objectAnimator.start();
            this.A02 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingSpinnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = true;
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A01 = true;
        A00(context, attributeSet);
    }
}
