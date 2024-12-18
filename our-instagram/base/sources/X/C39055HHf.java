package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HHf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39055HHf extends AbstractC61132qb {
    public final UserSession A00;
    public final AbstractC41190ILd A01;
    public final W58 A02;
    public final C55168OdW A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C39055HHf(UserSession userSession, AbstractC41190ILd abstractC41190ILd, W58 w58, C55168OdW c55168OdW, String str, String str2, String str3) {
        AbstractC167027dH.A0a(1, str, str2, str3, c55168OdW);
        C14360o3.A0B(w58, 7);
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = c55168OdW;
        this.A01 = abstractC41190ILd;
        this.A00 = userSession;
        this.A02 = w58;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        C55168OdW c55168OdW = this.A03;
        return new C51017MgP(this.A00, this.A01, this.A02, c55168OdW, str, str2, str3);
    }
}
