package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.HHg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39056HHg extends AbstractC61132qb {
    public final int A00;
    public final UserSession A01;
    public final ProductSource A02;
    public final EnumC39584Hdu A03;
    public final String A04;
    public final String A05;
    public final java.util.Set A06;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        java.util.Set set = this.A06;
        return new C38327GtM(userSession, this.A02, this.A03, this.A04, this.A05, set, this.A00);
    }

    public C39056HHg(UserSession userSession, ProductSource productSource, EnumC39584Hdu enumC39584Hdu, String str, String str2, java.util.Set set, int i) {
        AbstractC167017dG.A1P(userSession, set);
        this.A01 = userSession;
        this.A06 = set;
        this.A02 = productSource;
        this.A00 = i;
        this.A03 = enumC39584Hdu;
        this.A04 = str;
        this.A05 = str2;
    }
}
