package X;

import android.animation.ValueAnimator;
import com.facebook.R;

/* renamed from: X.CiF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28521CiF implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int i;
        int A03;
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        if (AbstractC166987dD.A1a(this.A03)) {
            i = AbstractC77623dm.A03((C76223bS) this.A04, R.color.fds_transparent);
            A03 = this.A01;
        } else {
            i = this.A01;
            A03 = AbstractC77623dm.A03((C76223bS) this.A04, R.color.fds_transparent);
        }
        ((C2XI) this.A05).A00(((InterfaceC16660sJ) this.A02).invoke(Integer.valueOf(AbstractC13950nL.A02(f, i, A03))));
    }

    public C28521CiF(C76223bS c76223bS, C2XI c2xi, Boolean bool, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A00 = i2;
        this.A03 = bool;
        this.A04 = c76223bS;
        this.A01 = i;
        this.A05 = c2xi;
        this.A02 = interfaceC16660sJ;
    }
}
