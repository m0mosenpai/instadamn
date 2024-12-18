package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.user.model.Product;

/* renamed from: X.IqD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42410IqD implements GXX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C1YA A01;
    public final /* synthetic */ ShoppingNavigationInfo A02;
    public final /* synthetic */ Product A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C42410IqD(UserSession userSession, C1YA c1ya, ShoppingNavigationInfo shoppingNavigationInfo, Product product, String str, String str2) {
        this.A01 = c1ya;
        this.A03 = product;
        this.A00 = userSession;
        this.A02 = shoppingNavigationInfo;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.GXX
    public final void Dkf(String str) {
        Long l;
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            C42212Imy c42212Imy = new C42212Imy(this);
            Product product = this.A03;
            UserSession userSession = this.A00;
            C38683GzO A03 = C128205qp.A03(userSession, product);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c42212Imy, userSession), "instagram_shopping_pdp_message_merchant_send");
            C38683GzO.A02(A0f, A03);
            Boolean bool = A03.A04;
            bool.getClass();
            A0f.A7v("is_checkout_enabled", bool);
            Boolean bool2 = A03.A02;
            bool2.getClass();
            A0f.A7v("can_add_to_bag", bool2);
            AbstractC37304Gc5.A11(A0f, str.length());
            AbstractC37300Gc1.A0f(A0f, this.A02.A00());
            String str2 = this.A04;
            if (!AbstractC13670mt.A0B(str2)) {
                l = AbstractC25228BEl.A13(str2);
            } else {
                l = null;
            }
            A0f.A9K("collection_page_id", l);
            A0f.Cht();
            C28531Zo.A04.A0E(userSession, product, this.A05, "message_merchant", trim);
        }
    }
}
