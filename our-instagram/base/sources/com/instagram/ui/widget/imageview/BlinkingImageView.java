package com.instagram.ui.widget.imageview;

import X.AbstractC167017dG;
import X.AbstractC43593JPy;
import X.C0f9;
import X.C128955sF;
import X.C14360o3;
import X.C1H4;
import X.JQ0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class BlinkingImageView extends C128955sF implements ValueAnimator.AnimatorUpdateListener {
    public boolean A00;
    public final ValueAnimator A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlinkingImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.2f).setDuration(800L);
        C14360o3.A07(duration);
        this.A01 = duration;
        duration.addUpdateListener(this);
        duration.setRepeatMode(2);
        duration.setRepeatCount(-1);
        AbstractC43593JPy.A18(duration);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        setImageAlpha(C1H4.A01(AbstractC167017dG.A00(valueAnimator) * 255.0f));
    }

    public final void setBlinking(boolean z) {
        this.A00 = z;
        ValueAnimator valueAnimator = this.A01;
        if (z) {
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            }
        } else {
            valueAnimator.cancel();
            setImageAlpha(255);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1087184377);
        super.onAttachedToWindow();
        if (this.A00) {
            ValueAnimator valueAnimator = this.A01;
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            }
        }
        C0f9.A0D(355755839, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1067989183);
        this.A01.cancel();
        super.onDetachedFromWindow();
        C0f9.A0D(-1428712358, A06);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlinkingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ BlinkingImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlinkingImageView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
