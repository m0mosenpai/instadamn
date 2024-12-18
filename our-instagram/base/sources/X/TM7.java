package X;

import android.os.Bundle;
import androidx.biometric.BiometricFragment;
import java.security.GeneralSecurityException;
import java.security.Signature;

/* loaded from: classes10.dex */
public final class TM7 implements Runnable {
    public final /* synthetic */ BiometricFragment A00;
    public final /* synthetic */ C62468SCv A01;

    public TM7(BiometricFragment biometricFragment, C62468SCv c62468SCv) {
        this.A00 = biometricFragment;
        this.A01 = c62468SCv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Signature signature;
        C58772Q8e c58772Q8e = this.A00.A01;
        AbstractC61269Rkf abstractC61269Rkf = c58772Q8e.A04;
        if (abstractC61269Rkf == null) {
            abstractC61269Rkf = new Q5f(c58772Q8e, 0);
            c58772Q8e.A04 = abstractC61269Rkf;
        }
        C62468SCv c62468SCv = this.A01;
        if (abstractC61269Rkf instanceof Q5g) {
            Q5g q5g = (Q5g) abstractC61269Rkf;
            q5g.A00.onSuccess();
            q5g.A01.A00 = null;
            return;
        }
        if (abstractC61269Rkf instanceof C58726Q5h) {
            C58726Q5h c58726Q5h = (C58726Q5h) abstractC61269Rkf;
            C2FP.A03().A01.Chz("verify_biometric", SSA.A01(c58726Q5h.A02.A01));
            C63291Sgr c63291Sgr = c62468SCv.A01;
            if (c63291Sgr == null || (signature = c63291Sgr.A00) == null) {
                try {
                    signature = C58770Q8c.A00(c58726Q5h.A00, c58726Q5h.A03);
                } catch (GeneralSecurityException unused) {
                    signature = null;
                }
            }
            c58726Q5h.A01.CyK(new SGB(Bundle.EMPTY, c58726Q5h.A03, signature));
            return;
        }
        Q5f q5f = (Q5f) abstractC61269Rkf;
        if (1 - q5f.A00 != 0) {
            return;
        }
        SM5 sm5 = (SM5) q5f.A01;
        sm5.A00.F8s(C62979Sa1.A00);
        sm5.A00.AID(null);
        sm5.A02.Egh(true);
    }
}
