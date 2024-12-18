package com.instagram.friendmap.view.customview;

import X.AbstractC13890nF;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC25227BEk;
import X.AbstractC43593JPy;
import X.C00O;
import X.C128935sB;
import X.C14360o3;
import X.C153316v0;
import X.C50355MLh;
import X.C6RB;
import X.InterfaceC16820sZ;
import X.LLo;
import X.LLs;
import X.LMA;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class FriendMapAnimatedLikeView extends IgFrameLayout {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public IgSimpleImageView A02;
    public ValueAnimator A03;
    public final int A04;
    public final int A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendMapAnimatedLikeView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        this.A06 = AbstractC167017dG.A0C(context2);
        this.A05 = context2.getResources().getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A04 = AbstractC13890nF.A01(context2);
    }

    public final void A03(PointF pointF, PointF pointF2, InterfaceC16820sZ interfaceC16820sZ) {
        Float f;
        float A00;
        float[] fArr;
        long j;
        Float valueOf;
        IgSimpleImageView igSimpleImageView = this.A02;
        ValueAnimator valueAnimator = null;
        if (igSimpleImageView == null) {
            C14360o3.A0F("likeImageView");
            throw C00O.createAndThrow();
        }
        igSimpleImageView.clearAnimation();
        ValueAnimator valueAnimator2 = this.A03;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator3 = this.A01;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        setVisibility(0);
        A01(pointF, this);
        C50355MLh c50355MLh = new C50355MLh(this, 22);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(Arrays.copyOf(new float[]{0.2f, 0.6f, 0.0f}, 3));
        LMA.A01(ofFloat, c50355MLh, 27);
        ofFloat.setInterpolator(new C128935sB());
        ofFloat.setDuration(250L);
        LLs.A00(ofFloat, this, 9);
        this.A01 = ofFloat;
        AnimatorSet animatorSet2 = new AnimatorSet();
        float f2 = pointF.x;
        if (pointF2 != null) {
            f = Float.valueOf(pointF2.x);
        } else {
            f = null;
        }
        float[] fArr2 = new float[2];
        fArr2[0] = f2;
        if (f != null) {
            fArr2[1] = f.floatValue();
        } else {
            int i = this.A04;
            if (f2 > i / 2) {
                A00 = -(f2 / 2.0f);
            } else {
                A00 = f2 + AbstractC25227BEk.A00(i, f2);
            }
            fArr2[1] = A00;
        }
        float[] copyOf = Arrays.copyOf(fArr2, 2);
        C50355MLh c50355MLh2 = new C50355MLh(this, 23);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(Arrays.copyOf(copyOf, copyOf.length));
        LMA.A01(ofFloat2, c50355MLh2, 27);
        float f3 = pointF.y;
        if (pointF2 != null && (valueOf = Float.valueOf(pointF2.y)) != null) {
            fArr = new float[]{f3, valueOf.floatValue()};
        } else {
            fArr = new float[]{f3, 1.1f * f3, -(f3 * 1.2f)};
        }
        float[] copyOf2 = Arrays.copyOf(fArr, fArr.length);
        C50355MLh c50355MLh3 = new C50355MLh(this, 24);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(Arrays.copyOf(copyOf2, copyOf2.length));
        LMA.A01(ofFloat3, c50355MLh3, 27);
        C50355MLh c50355MLh4 = new C50355MLh(this, 25);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(Arrays.copyOf(new float[]{0.0f, -360.0f}, 2));
        LMA.A01(ofFloat4, c50355MLh4, 27);
        if (pointF2 != null) {
            ofFloat4 = null;
        }
        C50355MLh c50355MLh5 = new C50355MLh(this, 26);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(Arrays.copyOf(new float[]{0.8f, 0.2f}, 2));
        LMA.A01(ofFloat5, c50355MLh5, 27);
        if (pointF2 != null) {
            valueAnimator = ofFloat5;
        }
        ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) AbstractC16960so.A1R(ofFloat2, ofFloat3, ofFloat4, valueAnimator).toArray(new ValueAnimator[0]);
        animatorSet2.playTogether((Animator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length));
        animatorSet2.setInterpolator(new C153316v0());
        if (pointF2 != null) {
            j = 1;
        } else {
            j = 2;
        }
        animatorSet2.setDuration(j * 400);
        animatorSet2.setStartDelay(150L);
        animatorSet2.addListener(new LLo(1, interfaceC16820sZ, this));
        this.A00 = animatorSet2;
        C50355MLh c50355MLh6 = new C50355MLh(this, 27);
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(Arrays.copyOf(new float[]{0.0f, 0.6f, 2.0f, 0.8f}, 4));
        LMA.A01(ofFloat6, c50355MLh6, 27);
        ValueAnimator duration = ofFloat6.setDuration(300L);
        AbstractC43593JPy.A18(duration);
        LLs.A00(duration, this, 10);
        duration.start();
        this.A03 = duration;
    }

    private final void A00(Context context) {
        IgSimpleImageView igSimpleImageView = new IgSimpleImageView(context);
        this.A02 = igSimpleImageView;
        int i = this.A06;
        AbstractC43593JPy.A1B(igSimpleImageView, i);
        IgSimpleImageView igSimpleImageView2 = this.A02;
        if (igSimpleImageView2 != null) {
            C6RB c6rb = new C6RB(context, i);
            c6rb.A0A(this.A05);
            c6rb.A0M("❤️");
            igSimpleImageView2.setImageDrawable(c6rb);
            setVisibility(8);
            IgSimpleImageView igSimpleImageView3 = this.A02;
            if (igSimpleImageView3 != null) {
                addView(igSimpleImageView3);
                return;
            }
        }
        C14360o3.A0F("likeImageView");
        throw C00O.createAndThrow();
    }

    public static final void A01(PointF pointF, FriendMapAnimatedLikeView friendMapAnimatedLikeView) {
        float f;
        float f2;
        IgSimpleImageView igSimpleImageView = friendMapAnimatedLikeView.A02;
        if (igSimpleImageView == null) {
            C14360o3.A0F("likeImageView");
            throw C00O.createAndThrow();
        }
        igSimpleImageView.setTranslationX(0.0f);
        igSimpleImageView.setTranslationY(0.0f);
        if (pointF != null) {
            f = pointF.x;
        } else {
            f = 0.0f;
        }
        float A02 = AbstractC166987dD.A02(friendMapAnimatedLikeView.A06);
        igSimpleImageView.setX(f - A02);
        if (pointF != null) {
            f2 = pointF.y;
        } else {
            f2 = 0.0f;
        }
        igSimpleImageView.setY(f2 - A02);
        igSimpleImageView.setScaleX(0.0f);
        igSimpleImageView.setScaleY(0.0f);
        igSimpleImageView.setRotation(0.0f);
    }

    public final void setScale(float f) {
        IgSimpleImageView igSimpleImageView = this.A02;
        if (igSimpleImageView != null) {
            igSimpleImageView.setScaleX(f);
            IgSimpleImageView igSimpleImageView2 = this.A02;
            if (igSimpleImageView2 != null) {
                igSimpleImageView2.setScaleY(f);
                return;
            }
        }
        C14360o3.A0F("likeImageView");
        throw C00O.createAndThrow();
    }

    public static final /* synthetic */ void A02(FriendMapAnimatedLikeView friendMapAnimatedLikeView, float f) {
        friendMapAnimatedLikeView.setScale(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendMapAnimatedLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        this.A06 = AbstractC167017dG.A0C(context2);
        this.A05 = context2.getResources().getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A04 = AbstractC13890nF.A01(context2);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendMapAnimatedLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        this.A06 = AbstractC167017dG.A0C(context2);
        this.A05 = context2.getResources().getDimensionPixelSize(R.dimen.direct_row_message_emoji_text_size);
        this.A04 = AbstractC13890nF.A01(context2);
        A00(context);
    }
}
