package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ISk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41357ISk {
    public static final C41206ILu A00(UserSession userSession, EnumC39583Hdt enumC39583Hdt) {
        C14360o3.A0B(userSession, 0);
        C1QT A00 = C1QS.A00(userSession);
        InterfaceC43417JGh A01 = A01(userSession);
        AbstractC167007dF.A1F(A00, 2, A01);
        return new C41206ILu(A00, enumC39583Hdt, A01, A00.generateNewFlowId(383984041));
    }

    public static final InterfaceC43417JGh A01(UserSession userSession) {
        InterfaceC43417JGh interfaceC43417JGh;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36314974985456567L) && AbstractC50712Us.A01.A06(1, 100) <= C18U.A00(c06090Tz, userSession, 37159399915520097L) * 100.0d) {
            interfaceC43417JGh = (C48522LdK) userSession.A01(C48522LdK.class, new J8U(userSession, 29));
        } else {
            interfaceC43417JGh = C42907IyL.A00;
        }
        return interfaceC43417JGh;
    }
}
