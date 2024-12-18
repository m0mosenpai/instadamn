package X;

import android.app.Application;
import com.facebook.endtoend.EndToEnd;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0pZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15190pZ implements C0N9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15190pZ(C14690oh c14690oh, C05E c05e) {
        this.A00 = 9;
        this.A01 = c14690oh;
        this.A02 = c05e;
    }

    @Override // X.C0N9
    public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
        long j;
        long j2;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 1:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 2:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 3:
                Application application = (Application) this.A01;
                InterfaceC08830cm interfaceC08830cm = (InterfaceC08830cm) this.A02;
                return new C0C6(application, c0nk.A04(), c0nk.A05(), interfaceC08830cm);
            case 4:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 5:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 6:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 7:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 8:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 9:
                C0Pe A05 = c0nk.A05();
                C0LW A04 = c0nk.A04();
                if (EndToEnd.A05()) {
                    j = 12000;
                    j2 = 1;
                    i = 1;
                    i2 = Integer.MAX_VALUE;
                } else {
                    j = 120000;
                    j2 = 1000;
                    i = 50;
                    i2 = 10;
                }
                return new C05C(A04, (C14690oh) this.A01, new C04440Lk(i, i2, j, j2), (C05E) this.A02, A05);
            case 10:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
            case 11:
                return new C07160Zp((Application) this.A02, c0nk.A04(), c0nk.A05(), (InterfaceC08830cm) this.A01);
            default:
                return new C0L1((Application) this.A01, (C04230Kp) this.A02, (C0PI) c0nk.A06().get());
        }
    }

    public C15190pZ(Application application, InterfaceC08830cm interfaceC08830cm, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A02 = application;
            this.A01 = interfaceC08830cm;
        } else {
            this.A01 = application;
            this.A02 = interfaceC08830cm;
        }
    }

    public C15190pZ(Application application, C04230Kp c04230Kp, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 7:
            case 8:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                this.A01 = application;
                this.A02 = c04230Kp;
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 11:
            default:
                this.A01 = application;
                this.A02 = c04230Kp;
                return;
        }
    }
}
