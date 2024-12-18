package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FeF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35113FeF {
    public static boolean A00;
    public static final C35113FeF A01 = new Object();

    public static final EnumC33384EpH A00(UserSession userSession) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if (C18U.A06(A0j, userSession, 36317706584069609L)) {
            InterfaceC19630xq interfaceC19630xq = A002.A01;
            String A003 = AbstractC43591JPw.A00(744);
            if (interfaceC19630xq.getInt(A003, 0) < AbstractC25225BEi.A07(A0j, userSession, 36599181561171413L)) {
                AbstractC167007dF.A18(interfaceC19630xq, A003, interfaceC19630xq.getInt(A003, 0) + 1);
                return EnumC33384EpH.A04;
            }
        }
        if (C18U.A06(A0j, userSession, 36317706584724971L)) {
            return EnumC33384EpH.A05;
        }
        return EnumC33384EpH.A03;
    }
}
