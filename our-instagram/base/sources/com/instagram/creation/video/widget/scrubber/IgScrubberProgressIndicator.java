package com.instagram.creation.video.widget.scrubber;

import X.AbstractC43592JPx;
import X.C0f9;
import X.C14360o3;
import X.JQ0;
import X.LLs;
import X.M0J;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.facebook.R;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class IgScrubberProgressIndicator extends MediaFrameLayout {
    public AnimatorSet A00;
    public boolean A01;
    public boolean A02;
    public final Runnable A03;

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (this.A02) {
            if (i == 0) {
                this.A01 = true;
                AnimatorSet animatorSet = this.A00;
                C14360o3.A0A(animatorSet);
                if (!animatorSet.isStarted()) {
                    C14360o3.A0A(animatorSet);
                    animatorSet.start();
                    return;
                }
                return;
            }
            this.A01 = false;
        }
    }

    public /* synthetic */ IgScrubberProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // X.AbstractC43201yn, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-746607842);
        super.onAttachedToWindow();
        this.A02 = true;
        if (getVisibility() == 0) {
            this.A01 = true;
            AnimatorSet animatorSet = this.A00;
            C14360o3.A0A(animatorSet);
            if (!animatorSet.isStarted()) {
                C14360o3.A0A(animatorSet);
                animatorSet.start();
            }
        }
        C0f9.A0D(-1844312675, A06);
    }

    @Override // X.AbstractC43201yn, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1068222831);
        super.onDetachedFromWindow();
        this.A02 = false;
        this.A01 = false;
        C0f9.A0D(-309377377, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgScrubberProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = new M0J(this);
        LayoutInflater.from(context).inflate(R.layout.view_ig_scrubber_progress_indicator, this);
        View findViewById = findViewById(R.id.dot1);
        View findViewById2 = findViewById(R.id.dot2);
        View findViewById3 = findViewById(R.id.dot3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "scaleX", 1.0f, 1.33f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator clone = ofFloat.clone();
        C14360o3.A07(clone);
        clone.setPropertyName("scaleY");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, "scaleX", 1.33f, 1.0f);
        ofFloat2.setDuration(250L);
        AbstractC43592JPx.A1B(ofFloat2);
        ObjectAnimator clone2 = ofFloat2.clone();
        C14360o3.A07(clone2);
        clone2.setPropertyName("scaleY");
        ObjectAnimator clone3 = ofFloat.clone();
        C14360o3.A07(clone3);
        ObjectAnimator clone4 = clone.clone();
        C14360o3.A07(clone4);
        ObjectAnimator clone5 = ofFloat2.clone();
        C14360o3.A07(clone5);
        ObjectAnimator clone6 = clone2.clone();
        C14360o3.A07(clone6);
        clone3.setTarget(findViewById2);
        clone4.setTarget(findViewById2);
        clone5.setTarget(findViewById2);
        clone6.setTarget(findViewById2);
        ObjectAnimator clone7 = ofFloat.clone();
        C14360o3.A07(clone7);
        ObjectAnimator clone8 = clone.clone();
        C14360o3.A07(clone8);
        ObjectAnimator clone9 = ofFloat2.clone();
        C14360o3.A07(clone9);
        ObjectAnimator clone10 = clone2.clone();
        C14360o3.A07(clone10);
        clone7.setTarget(findViewById3);
        clone8.setTarget(findViewById3);
        clone9.setTarget(findViewById3);
        clone10.setTarget(findViewById3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.play(ofFloat).with(clone);
        AnimatorSet animatorSet2 = this.A00;
        C14360o3.A0A(animatorSet2);
        animatorSet2.play(clone3).with(clone4).with(ofFloat2).with(clone2).after(ofFloat);
        AnimatorSet animatorSet3 = this.A00;
        C14360o3.A0A(animatorSet3);
        animatorSet3.play(clone7).with(clone8).with(clone5).with(clone6).after(clone3);
        AnimatorSet animatorSet4 = this.A00;
        C14360o3.A0A(animatorSet4);
        animatorSet4.play(clone9).with(clone10).after(clone7);
        AnimatorSet animatorSet5 = this.A00;
        C14360o3.A0A(animatorSet5);
        LLs.A00(animatorSet5, this, 5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgScrubberProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgScrubberProgressIndicator(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
