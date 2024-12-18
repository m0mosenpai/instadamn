package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;

/* renamed from: X.HJw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39124HJw extends AbstractC64162vb {
    public final C38B A00;
    public final C38678GzJ A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final String A04;

    public C39124HJw(C38678GzJ c38678GzJ, InterfaceC11380iw interfaceC11380iw, C1BX c1bx, UserSession userSession, ShoppingNavigationInfo shoppingNavigationInfo, String str) {
        super(c1bx);
        this.A03 = userSession;
        this.A01 = c38678GzJ;
        this.A04 = str;
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = shoppingNavigationInfo.A00();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        long A0N = AbstractC166987dD.A0N(obj);
        C41768Iek.A05(this.A03, System.currentTimeMillis());
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_ig_funded_incentive_impression");
        A0f.AAk("ig_funded_discount_ids", AbstractC166987dD.A1J(Long.valueOf(A0N)));
        AbstractC37300Gc1.A0f(A0f, this.A00);
        C4SX c4sx = null;
        A0f.AAQ(this.A01.A00(), "bag_logging_info");
        A0f.AAQ(null, "pdp_logging_info");
        String str = this.A04;
        if (str != null) {
            c4sx = C4SX.A00(str);
        }
        A0f.AAK(c4sx, "merchant_id");
        A0f.Cht();
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        long A0N = AbstractC166987dD.A0N(obj);
        C41768Iek.A05(this.A03, System.currentTimeMillis());
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_ig_funded_incentive_sub_impression");
        A0f.AAk("ig_funded_discount_ids", AbstractC166987dD.A1J(Long.valueOf(A0N)));
        AbstractC37300Gc1.A0f(A0f, this.A00);
        C4SX c4sx = null;
        A0f.AAQ(this.A01.A00(), "bag_logging_info");
        A0f.AAQ(null, "pdp_logging_info");
        String str = this.A04;
        if (str != null) {
            c4sx = C4SX.A00(str);
        }
        A0f.AAK(c4sx, "merchant_id");
        A0f.Cht();
    }
}
