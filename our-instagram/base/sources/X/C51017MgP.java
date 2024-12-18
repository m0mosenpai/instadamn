package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MgP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51017MgP extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final UserSession A02;
    public final AbstractC41190ILd A03;
    public final W58 A04;
    public final C55168OdW A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final InterfaceC19390xP A09;

    public static final String A00(C51017MgP c51017MgP) {
        C55168OdW c55168OdW = c51017MgP.A05;
        String str = c51017MgP.A07;
        String str2 = c51017MgP.A08;
        if (C55168OdW.A00(c55168OdW, str, str2).A0A instanceof C52715NUb) {
            AbstractC53526Nls abstractC53526Nls = C55168OdW.A00(c55168OdW, str, str2).A0A;
            C14360o3.A0C(abstractC53526Nls, "null cannot be cast to non-null type com.instagram.search.surface.repository.SerpFeed.PaginationState.Incomplete");
            return ((C52715NUb) abstractC53526Nls).A00;
        }
        return null;
    }

    public C51017MgP(UserSession userSession, AbstractC41190ILd abstractC41190ILd, W58 w58, C55168OdW c55168OdW, String str, String str2, String str3) {
        JQ0.A1O(str, str2, str3, c55168OdW, abstractC41190ILd);
        AbstractC167017dG.A1U(userSession, w58);
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = c55168OdW;
        this.A03 = abstractC41190ILd;
        this.A02 = userSession;
        this.A04 = w58;
        C05A A02 = C55168OdW.A02(c55168OdW, str, str2);
        C14360o3.A0B(A02, 0);
        MZP mzp = new MZP(A02, 21);
        this.A09 = mzp;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, mzp);
        this.A01 = AbstractC58232lf.A00(anonymousClass191, new MZP(C55168OdW.A02(this.A05, this.A07, this.A08), 29));
    }

    public final void A01() {
        if (A00(this) != null) {
            PZC.A02(this, AbstractC141776au.A00(this), 32);
        }
    }
}
