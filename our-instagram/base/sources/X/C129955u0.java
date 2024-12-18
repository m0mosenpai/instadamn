package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129955u0 {
    public final C41051vD A00;

    public C129955u0(C41051vD c41051vD) {
        C14360o3.A0B(c41051vD, 1);
        this.A00 = c41051vD;
    }

    public final C72122XOt A00(String str) {
        C14360o3.A0B(str, 1);
        C41051vD c41051vD = this.A00;
        UserSession userSession = c41051vD.A00;
        if (userSession != null) {
            C41051vD c41051vD2 = C41051vD.A01;
            c41051vD2.A00 = userSession;
            C1341564a c1341564a = new C1341564a(c41051vD2, 0, false);
            C6VS c6vs = C6VR.A01;
            UserSession userSession2 = c41051vD.A00;
            if (userSession2 != null) {
                return new C72122XOt(c1341564a.A01(), c6vs.A01(C6VS.A00(userSession2, str), userSession2, str), C6T2.A01);
            }
            throw new RuntimeException("Trying to access showreel without session init");
        }
        throw new RuntimeException("Trying to access showreel without session init");
    }
}
