package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OAl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54610OAl {
    public InterfaceC58274PsS A00;
    public final InterfaceC58182Pqn A01;
    public final UserSession A02;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.VWI] */
    public /* synthetic */ C54610OAl(UserSession userSession) {
        Object obj;
        C006802i c006802i = C006802i.A0p;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36313673609775299L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36314197595785712L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36315524740681068L);
        C69605Vs8 c69605Vs8 = new C69605Vs8(c006802i, new Object());
        if (A06) {
            obj = new C55749OpI(new C54675ODb(A062), c69605Vs8, A062, A063);
        } else {
            obj = new Object();
        }
        InterfaceC58182Pqn interfaceC58182Pqn = (InterfaceC58182Pqn) obj;
        AbstractC167017dG.A1Q(userSession, interfaceC58182Pqn);
        this.A02 = userSession;
        this.A01 = interfaceC58182Pqn;
    }
}
