package X;

import android.animation.ValueAnimator;
import com.facebook.R;

/* renamed from: X.CiG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28522CiG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C76223bS A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ BVJ A04;
    public final /* synthetic */ boolean A05;

    public C28522CiG(C76223bS c76223bS, C2XI c2xi, BVJ bvj, float f, int i, boolean z) {
        this.A01 = i;
        this.A02 = c76223bS;
        this.A03 = c2xi;
        this.A04 = bvj;
        this.A00 = f;
        this.A05 = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        int i = this.A01;
        int A03 = AbstractC77623dm.A03(this.A02, R.color.primary_text_disabled_material_dark);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        this.A03.A00(BVJ.A03(this.A00, AbstractC13950nL.A02(f, i, A03), 0, 0, false, this.A05));
    }
}