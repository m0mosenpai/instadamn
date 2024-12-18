package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.94e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2047094e {
    public final C2047394h A00;
    public final C73673Rt A01;
    public final C2047194f A02;
    public final C2047294g A03;
    public final C4QF A04;

    public C2047094e(UserSession userSession) {
        C2047194f c2047194f = new C2047194f(C195908lc.A00(userSession));
        this.A02 = c2047194f;
        C2047294g c2047294g = new C2047294g(userSession);
        this.A03 = c2047294g;
        C4QF c4qf = new C4QF(new SharedPreferencesC19650xs(C1AT.A01(userSession).A04(C1AV.A16, C4QF.class)), MSV.A00(1109));
        this.A04 = c4qf;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        C73673Rt c73673Rt = new C73673Rt(c006802i, 1011494143);
        this.A01 = c73673Rt;
        this.A00 = new C2047394h(c73673Rt, c2047194f, c2047294g, c4qf);
    }
}
