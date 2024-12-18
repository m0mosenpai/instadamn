package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7DS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DS extends AbstractC52922bZ {
    public final UserSession A00;
    public final C7DU A01;
    public final C19L A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final C0UO A0E;
    public final C0UO A0F;

    public C7DS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C008002u c008002u = new C008002u(new C9CL());
        this.A06 = c008002u;
        this.A0D = AbstractC208910l.A02(c008002u);
        C008002u c008002u2 = new C008002u(new C9BW(new C7DT(null, null, null, 0), C05F.A00));
        this.A05 = c008002u2;
        this.A0C = AbstractC208910l.A02(c008002u2);
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A03 = c24721Ip;
        this.A04 = AbstractC07080Za.A03(c24721Ip);
        this.A07 = new C008002u(false);
        this.A09 = C10E.A00(null);
        C008002u c008002u3 = new C008002u(false);
        this.A08 = c008002u3;
        C008002u c008002u4 = new C008002u(false);
        this.A0B = c008002u4;
        C008002u c008002u5 = new C008002u(false);
        this.A0A = c008002u5;
        this.A0F = AbstractC208910l.A02(c008002u5);
        this.A02 = AnonymousClass194.A02(C12L.A00.A04);
        this.A01 = (C7DU) userSession.A01(C7DU.class, new C50251MHg(userSession, 48));
        C15150pV A03 = C10Q.A03(new C206599Cq(3, null), c008002u4, c008002u3);
        this.A0E = AbstractC208910l.A01(new C7DV(false, false), AbstractC141776au.A00(this), A03, C10I.A01);
    }

    public static final int A00(C7DS c7ds) {
        return ((C7DT) ((C9BW) c7ds.A05.getValue()).A01).A00;
    }

    public static final String A01(C7DS c7ds) {
        return ((C7DT) ((C9BW) c7ds.A05.getValue()).A01).A02;
    }

    public static final String A02(C7DS c7ds) {
        return ((C7DT) ((C9BW) c7ds.A05.getValue()).A01).A03;
    }

    public static final void A03(C7DS c7ds, Integer num) {
        C19L c19l = c7ds.A02;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCE(c7ds, num, null, 42), c19l);
    }

    public final void A04() {
        C05A c05a = this.A0B;
        if (((Boolean) c05a.getValue()).booleanValue()) {
            c05a.Egh(false);
        }
        AbstractC23021Ah.A00(this.A00).A0L();
    }
}
