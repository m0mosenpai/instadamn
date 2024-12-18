package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166667cc extends AbstractC52922bZ {
    public final C167417dv A00;
    public final L5C A01;
    public final C7FT A02;
    public final UserSession A03;
    public final UserSession A04;
    public final String A05;
    public final C05A A06;
    public final C0UO A07;

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        if (!C14360o3.A0K(this.A01.A00, str)) {
            C141796aw A00 = AbstractC141776au.A00(this);
            AbstractC23641Du.A05(AnonymousClass191.A00, new C50120MBu(this, str, null, 15), A00);
        }
    }

    public /* synthetic */ C166667cc(UserSession userSession, String str) {
        EnumC143276dS enumC143276dS;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323655113780697L)) {
            enumC143276dS = EnumC143276dS.A0Y;
        } else {
            enumC143276dS = EnumC143276dS.A0P;
        }
        EnumC143286dT enumC143286dT = EnumC143286dT.A05;
        C7FT c7ft = new C7FT(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        L5C l5c = new L5C(enumC143276dS, enumC143286dT, userSession, str, (int) C18U.A01(c06090Tz, userSession, 36604464370619465L), C18U.A06(c06090Tz, userSession, 36322989393980224L));
        C167417dv c167417dv = new C167417dv(userSession);
        this.A03 = userSession;
        this.A05 = str;
        this.A01 = l5c;
        this.A00 = c167417dv;
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBq(this, null, 25), A00);
        C008002u A002 = C10E.A00(C45459KAu.A00);
        this.A06 = A002;
        this.A07 = A002;
        this.A04 = userSession;
        this.A02 = c7ft;
    }
}
