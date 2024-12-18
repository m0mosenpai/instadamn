package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class MX1 {
    public static final MYZ A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (MYZ) userSession.A01(MYZ.class, new C57242PbQ(userSession, 27));
    }

    public static AHF A00(UserSession userSession) {
        MYZ A01 = A01(userSession);
        C1QT c1qt = A01.A0A;
        long j = A01.A07;
        AHF ahf = new AHF(c1qt);
        ahf.A01 = j;
        return ahf;
    }
}
