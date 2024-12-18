package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.text.ExpandableTextView;

/* loaded from: classes8.dex */
public final class LM9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ ExpandableTextView A01;
    public final /* synthetic */ UPQ A02;
    public final /* synthetic */ C66483UJj A03;
    public final /* synthetic */ C69680VtQ A04;
    public final /* synthetic */ C15100pQ A05;

    public LM9(ValueAnimator valueAnimator, ExpandableTextView expandableTextView, UPQ upq, C66483UJj c66483UJj, C69680VtQ c69680VtQ, C15100pQ c15100pQ) {
        this.A00 = valueAnimator;
        this.A03 = c66483UJj;
        this.A05 = c15100pQ;
        this.A01 = expandableTextView;
        this.A04 = c69680VtQ;
        this.A02 = upq;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A0D = AbstractC25230BEn.A0D(this.A00.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        AbstractC43593JPy.A1C(this.A03.A01, A0D);
        C15100pQ c15100pQ = this.A05;
        int i = A0D - c15100pQ.A00;
        ExpandableTextView expandableTextView = this.A01;
        expandableTextView.setHeight(expandableTextView.getHeight() + i);
        this.A04.A01(this.A02, A0D, c15100pQ.A00);
        c15100pQ.A00 = A0D;
    }
}
