package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.ILp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41201ILp {
    public final C18920wW A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final String A03;

    public final void A00(Product product, String str, String str2, String str3, String str4) {
        C38683GzO A03 = C128205qp.A03(this.A01, product);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_shopping_camera_action");
        C38683GzO.A02(A0f, A03);
        AbstractC31171DnF.A1C(A0f, str);
        if (str3 == null) {
            str3 = "unknown";
        }
        AbstractC37300Gc1.A0q(A0f, str3);
        AbstractC37300Gc1.A0t(A0f, this.A03);
        boolean z = false;
        AbstractC37301Gc2.A1B(A0f, AbstractC167007dF.A1T(A03.A04));
        Boolean bool = A03.A02;
        if (bool != null) {
            z = bool.booleanValue();
        }
        A0f.A7v("can_add_to_bag", Boolean.valueOf(z));
        AbstractC37300Gc1.A0n(A0f, str2);
        AbstractC37300Gc1.A0s(A0f, str4);
        A0f.A7v("has_drops_launched", A03.A03);
        A0f.A9K("drops_launch_date", A03.A06);
        A0f.AAP("url", product.A0F);
        A0f.Cht();
    }

    public C41201ILp(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A03 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }
}
