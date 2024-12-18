package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class JW6 implements InterfaceC43071ya {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final float A03;
    public final long A04;
    public final C4FR A05;

    public JW6(UserSession userSession, C4FR c4fr) {
        C14360o3.A0B(c4fr, 2);
        this.A02 = userSession;
        this.A05 = c4fr;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A04 = timeUnit.toMillis((long) C18U.A00(c06090Tz, userSession, 37166924697829822L));
        this.A03 = (float) C18U.A00(c06090Tz, userSession, 37166924697764285L);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                C4FR c4fr = this.A05;
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C4F5 c4f5 = (C4F5) obj;
                c4fr.FAD(c4f5, false);
                if (this.A00) {
                    c4fr.E0Z(c4f5);
                }
                if (this.A01) {
                    long B0m = interfaceC57162jr.B0m(c59062n7);
                    UserSession userSession = this.A02;
                    C14360o3.A0B(userSession, 0);
                    if (C18U.A06(C06090Tz.A05, userSession, 36327645138533113L)) {
                        c4fr.CkM(c4f5, B0m);
                        return;
                    } else {
                        c4fr.F89(c4f5, B0m);
                        return;
                    }
                }
                return;
            }
            long B0m2 = interfaceC57162jr.B0m(c59062n7);
            float CGk = interfaceC57162jr.CGk(c59062n7);
            if (B0m2 >= 250) {
                if (!C18U.A06(C06090Tz.A05, this.A02, 36327645138467576L) || CGk >= 0.5f) {
                    this.A01 = true;
                }
            }
            if (!C18U.A06(C06090Tz.A05, this.A02, 36322499767576844L) || B0m2 < this.A04 || CGk <= this.A03) {
                return;
            }
            this.A00 = true;
            this.A05.DNI((C4F5) c59062n7.A03, B0m2);
            return;
        }
        C4FR c4fr2 = this.A05;
        Object obj2 = c59062n7.A03;
        C14360o3.A06(obj2);
        c4fr2.FAD((C4F5) obj2, true);
    }
}
