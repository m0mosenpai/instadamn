package X;

import androidx.biometric.BiometricFragment;
import androidx.fragment.app.Fragment;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class SO8 {
    public C62922SXe A00;
    public final AbstractC61269Rkf A01;
    public final C63291Sgr A02;
    public final SH3 A03;
    public final InterfaceC65507Tlc A04;
    public final SE2 A05;
    public final Executor A06;

    public final void A00() {
        String str;
        C62922SXe c62922SXe = this.A00;
        if (c62922SXe != null) {
            AbstractC10360h2 abstractC10360h2 = c62922SXe.A00;
            if (abstractC10360h2 == null) {
                str = "Unable to start authentication. Client fragment manager was null.";
            } else {
                BiometricFragment biometricFragment = (BiometricFragment) abstractC10360h2.A0Q("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    str = "Unable to cancel authentication. BiometricFragment not found.";
                } else {
                    biometricFragment.A07(3);
                    return;
                }
            }
            android.util.Log.e("BiometricPromptCompat", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Tlc] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void A01(Fragment fragment) {
        ?? r0;
        SH3 sh3 = this.A03;
        if (sh3 != null) {
            Executor executor = this.A06;
            AbstractC61269Rkf abstractC61269Rkf = this.A01;
            abstractC61269Rkf.getClass();
            C62922SXe c62922SXe = new C62922SXe(abstractC61269Rkf, fragment, executor);
            this.A00 = c62922SXe;
            C63291Sgr c63291Sgr = this.A02;
            if (c63291Sgr == null) {
                C62922SXe.A00(null, sh3, c62922SXe);
                return;
            } else {
                c62922SXe.A01(c63291Sgr, sh3);
                return;
            }
        }
        C63345Si1 A01 = C2FP.A03().A01(fragment);
        SE2 se2 = this.A05;
        Executor executor2 = this.A06;
        InterfaceC65507Tlc interfaceC65507Tlc = this.A04;
        if (executor2 != null && interfaceC65507Tlc != null) {
            r0 = new T2v(interfaceC65507Tlc, executor2);
        } else {
            r0 = new Object();
        }
        C63345Si1.A02(r0, se2, A01);
    }

    public SO8(AbstractC61269Rkf abstractC61269Rkf, C63291Sgr c63291Sgr, SH3 sh3, InterfaceC65507Tlc interfaceC65507Tlc, SE2 se2, Executor executor) {
        this.A06 = executor;
        this.A03 = sh3;
        this.A01 = abstractC61269Rkf;
        this.A02 = c63291Sgr;
        this.A04 = interfaceC65507Tlc;
        this.A05 = se2;
    }
}
