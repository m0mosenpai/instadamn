package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V54 extends AbstractC61132qb {
    public final UserSession A00;
    public final W99 A01;
    public final AbstractC41190ILd A02;
    public final W58 A03;
    public final C55168OdW A04;
    public final OCG A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public V54(UserSession userSession, W99 w99, AbstractC41190ILd abstractC41190ILd, W58 w58, C55168OdW c55168OdW, OCG ocg, String str, String str2, String str3) {
        AbstractC43594JPz.A1P(str2, c55168OdW);
        AbstractC167017dG.A1U(abstractC41190ILd, userSession);
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A04 = c55168OdW;
        this.A05 = ocg;
        this.A02 = abstractC41190ILd;
        this.A00 = userSession;
        this.A03 = w58;
        this.A01 = w99;
        this.A09 = true;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A08;
        String str2 = this.A07;
        String str3 = this.A06;
        C55168OdW c55168OdW = this.A04;
        OCG ocg = this.A05;
        AbstractC41190ILd abstractC41190ILd = this.A02;
        return new C51042Mgs(this.A00, this.A01, abstractC41190ILd, this.A03, c55168OdW, ocg, str, str2, str3, this.A09);
    }
}
