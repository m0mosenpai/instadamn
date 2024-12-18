package X;

import androidx.biometric.BiometricFragment;

/* loaded from: classes10.dex */
public final class TPH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public TPH(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58772Q8e c58772Q8e = this.A01.A01;
        AbstractC61269Rkf abstractC61269Rkf = c58772Q8e.A04;
        if (abstractC61269Rkf == null) {
            abstractC61269Rkf = new Q5f(c58772Q8e, 0);
            c58772Q8e.A04 = abstractC61269Rkf;
        }
        int i = this.A00;
        CharSequence charSequence = this.A02;
        if (abstractC61269Rkf instanceof Q5g) {
            C14360o3.A0B(charSequence, 1);
            ((Q5g) abstractC61269Rkf).A01.A00 = null;
            return;
        }
        if (abstractC61269Rkf instanceof C58726Q5h) {
            C58726Q5h c58726Q5h = (C58726Q5h) abstractC61269Rkf;
            c58726Q5h.A01.CyJ(new C64864TXp(charSequence.toString(), i));
            C2FP.A03().A01.Chz("verify_biometric_fail", SSA.A01(c58726Q5h.A02.A01));
            return;
        }
        Q5f q5f = (Q5f) abstractC61269Rkf;
        if (1 - q5f.A00 != 0) {
            return;
        }
        C14360o3.A0B(charSequence, 1);
        SM5 sm5 = (SM5) q5f.A01;
        sm5.A00.F8s(new SON(charSequence.toString()));
        sm5.A00.AID(null);
        sm5.A02.Egh(AbstractC166997dE.A0a());
    }
}
