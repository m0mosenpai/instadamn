package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

/* renamed from: X.HHh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39057HHh extends AbstractC61132qb {
    public final UserSession A00;
    public final C61582rL A01;
    public final IMF A02;
    public final ShoppingReconFeedEndpoint A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C39057HHh(UserSession userSession, C61582rL c61582rL, IMF imf, ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, String str, String str2) {
        AbstractC25234BEr.A0k(1, userSession, str2, imf, c61582rL);
        this.A00 = userSession;
        this.A03 = shoppingReconFeedEndpoint;
        this.A04 = "recon_destination_viewed";
        this.A05 = str;
        this.A06 = str2;
        this.A02 = imf;
        this.A01 = c61582rL;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        ShoppingReconFeedEndpoint shoppingReconFeedEndpoint = this.A03;
        C19270xB A0D = AbstractC31171DnF.A0D(this.A04);
        String str = this.A06;
        return new C38326GtL(A0D, userSession, this.A01, this.A02, shoppingReconFeedEndpoint, str, C43361JEc.A01(this, 13));
    }
}
