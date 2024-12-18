package X;

import com.instagram.common.session.UserSession;
import java.util.Currency;

/* renamed from: X.MgV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51023MgV extends AbstractC52922bZ {
    public static final C51685MsG A0D = new C51685MsG(null, null, null, null, null, null, 0, false);
    public EnumC53368NjJ A00;
    public final C2GT A01;
    public final UserSession A02;
    public final O2G A03;
    public final O2H A04;
    public final InterfaceC24731Iq A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final InterfaceC19390xP A0B;
    public final C05A A0C;

    public C51023MgV(UserSession userSession, O2G o2g, O2H o2h) {
        C14360o3.A0B(userSession, 3);
        this.A04 = o2h;
        this.A03 = o2g;
        this.A02 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A09 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A07 = A1H2;
        C008002u A00 = C10E.A00(null);
        this.A0A = A00;
        String str = "USD";
        C008002u A1H3 = AbstractC25225BEi.A1H("USD");
        this.A06 = A1H3;
        C008002u A002 = C10E.A00(null);
        this.A0C = A002;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A08 = A1A;
        this.A00 = EnumC53368NjJ.BIO_IG_POST;
        MV5 A003 = MV5.A00(this, AbstractC50522MSa.A1b(new C05A[]{A1H, A1H2, A1H3, A00, A002, A1A}), 2);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A003);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A0B = AbstractC07080Za.A03(A12);
        C23031Ai A004 = AbstractC23021Ah.A00(this.A02);
        Object A0Y = AbstractC31171DnF.A0Y(A004, A004.A7g, C23031Ai.A8c, 413);
        if (A0Y == null) {
            try {
                str = Currency.getInstance(C1Q2.A02()).getCurrencyCode();
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
            A0Y = str;
        }
        A1H3.Egh(A0Y);
        AbstractC23641Du.A05(anonymousClass191, new PYv(this, null, 17), AbstractC141776au.A00(this));
    }

    public final void A01(String str, String str2, String str3, String str4, boolean z) {
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        this.A09.Egh(str);
        this.A07.Egh(str2);
        this.A0A.Egh(str3);
        C05A c05a = this.A06;
        Object obj = str4;
        if (str4 == null) {
            obj = c05a.getValue();
        }
        c05a.Egh(obj);
        this.A0C.Egh(EnumC53223NgL.A06);
        AbstractC166987dD.A1Z(new MUV(this, str, null, A1a ? 1 : 0, z), AbstractC141776au.A00(this));
    }

    public final void A00() {
        this.A09.Egh("");
        this.A07.Egh("");
        this.A0A.Egh(null);
        this.A0C.Egh(null);
        AbstractC166987dD.A1Z(new PYX(this, null, 31), AbstractC141776au.A00(this));
    }
}
