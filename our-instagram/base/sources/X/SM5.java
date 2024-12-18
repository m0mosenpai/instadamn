package X;

import android.content.pm.PackageManager;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public final class SM5 {
    public InterfaceC24731Iq A00;
    public InterfaceC19390xP A01;
    public C05A A02;

    /* JADX WARN: Type inference failed for: r2v1, types: [X.SXe, java.lang.Object] */
    public final void A00(FragmentActivity fragmentActivity) {
        InterfaceC24731Iq interfaceC24731Iq;
        Object obj;
        int i;
        C14360o3.A0B(fragmentActivity, 0);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A00 = c24721Ip;
        this.A01 = AbstractC07080Za.A03(c24721Ip);
        this.A02 = C10E.A00(null);
        C58656PzT c58656PzT = new C58656PzT(new C58657PzU(fragmentActivity));
        SM8 sm8 = new SM8();
        sm8.A02 = fragmentActivity.getString(2131976587);
        sm8.A00 = 255;
        int A03 = c58656PzT.A03(255);
        boolean A1N = AbstractC167007dF.A1N(c58656PzT.A03(15));
        boolean A1N2 = AbstractC167007dF.A1N(A03);
        if (A1N) {
            PackageManager packageManager = fragmentActivity.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29 && packageManager != null && (packageManager.hasSystemFeature("android.hardware.biometrics.face") || packageManager.hasSystemFeature("android.hardware.biometrics.iris"))) {
                i = 2131976590;
            } else {
                i = 2131976589;
            }
        } else if (A1N2) {
            i = 2131976588;
        } else {
            if (A03 != -2) {
                if (A03 != -1) {
                    if (A03 != 1) {
                        if (A03 != 15) {
                            if (A03 != 11) {
                                if (A03 == 12) {
                                    interfaceC24731Iq = this.A00;
                                    obj = C62980Sa2.A00;
                                }
                                this.A00.AID(null);
                                this.A02.Egh(false);
                                return;
                            }
                            interfaceC24731Iq = this.A00;
                            obj = C62978Sa0.A00;
                        } else {
                            interfaceC24731Iq = this.A00;
                            obj = C62982Sa4.A00;
                        }
                    } else {
                        interfaceC24731Iq = this.A00;
                        obj = C62981Sa3.A00;
                    }
                } else {
                    interfaceC24731Iq = this.A00;
                    obj = C62983Sa5.A00;
                }
            } else {
                interfaceC24731Iq = this.A00;
                obj = C62984Sa6.A00;
            }
            interfaceC24731Iq.F8s(obj);
            this.A00.AID(null);
            this.A02.Egh(false);
            return;
        }
        sm8.A03 = fragmentActivity.getString(i);
        Q5f q5f = new Q5f(this, 1);
        ?? obj2 = new Object();
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C58772Q8e A0H = AbstractC58320PtC.A0H(fragmentActivity);
        obj2.A00 = supportFragmentManager;
        if (A0H != null) {
            A0H.A04 = q5f;
        }
        C62922SXe.A00(null, sm8.A00(), obj2);
    }

    public SM5() {
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A00 = c24721Ip;
        this.A01 = AbstractC07080Za.A03(c24721Ip);
        this.A02 = C10E.A00(null);
    }
}
