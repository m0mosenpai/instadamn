package X;

import androidx.biometric.BiometricFragment;

/* loaded from: classes10.dex */
public final class TJ6 implements Runnable {
    public final /* synthetic */ BiometricFragment A00;

    public TJ6(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58772Q8e c58772Q8e = this.A00.A01;
        AbstractC61269Rkf abstractC61269Rkf = c58772Q8e.A04;
        if (abstractC61269Rkf == null) {
            abstractC61269Rkf = new Q5f(c58772Q8e, 0);
            c58772Q8e.A04 = abstractC61269Rkf;
        }
        if (abstractC61269Rkf instanceof Q5g) {
            Q5g q5g = (Q5g) abstractC61269Rkf;
            q5g.A00.onFailure();
            q5g.A01.A00 = null;
        } else if (abstractC61269Rkf instanceof C58726Q5h) {
            C58726Q5h c58726Q5h = (C58726Q5h) abstractC61269Rkf;
            c58726Q5h.A01.CyJ(new C64864TXp("A biometric is valid but not recognized.", 104));
            C2FP.A03().A01.Chz("verify_biometric_fail", SSA.A01(c58726Q5h.A02.A01));
        } else {
            Q5f q5f = (Q5f) abstractC61269Rkf;
            if (1 - q5f.A00 != 0) {
                return;
            }
            ((SM5) q5f.A01).A00.F8s(SZz.A00);
        }
    }
}
