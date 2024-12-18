package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164387Xb {
    public final UserSession A00;
    public final C164397Xc A01;
    public final C164467Xl A02;

    public /* synthetic */ C164387Xb(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C164397Xc c164397Xc = (C164397Xc) userSession.A01(C164397Xc.class, new C50159MDm(userSession, 8));
        C164467Xl c164467Xl = (C164467Xl) userSession.A01(C164467Xl.class, new C50159MDm(userSession, 11));
        this.A00 = userSession;
        this.A01 = c164397Xc;
        this.A02 = c164467Xl;
    }

    public final boolean A01() {
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36317161123353419L)) {
            c06090Tz = C06090Tz.A05;
        }
        Boolean valueOf = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36317161123222345L));
        C14360o3.A0A(valueOf);
        return valueOf.booleanValue();
    }

    public final InterfaceC19390xP A00(EnumC44171Jfa enumC44171Jfa, EnumC44170JfZ enumC44170JfZ, EnumC44174Jfd enumC44174Jfd) {
        if (A01()) {
            C164397Xc c164397Xc = this.A01;
            C164417Xe c164417Xe = c164397Xc.A01;
            return new C44156JfL(c164397Xc, AnonymousClass111.A04(new C44153JfI(c164417Xe, enumC44174Jfd, new C44155JfK(c164417Xe, enumC44171Jfa, new C44154JfJ(c164417Xe, enumC44170JfZ, c164417Xe.A05))), C16450rq.A00));
        }
        return C16450rq.A00;
    }
}
