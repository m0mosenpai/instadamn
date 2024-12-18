package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.2wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64952wt {
    public final int A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public static final AndroidLink A00(ProductFeedItem productFeedItem) {
        AndroidLink androidLink;
        C38321qM A1e;
        AndroidLink androidLink2;
        C38321qM c38321qM = productFeedItem.A00;
        if (c38321qM != null && c38321qM.A5M()) {
            C38321qM c38321qM2 = productFeedItem.A00;
            if (c38321qM2 != null && (A1e = c38321qM2.A1e(0)) != null && (androidLink2 = (AndroidLink) AbstractC001800i.A0O(A1e.A3Y(), 0)) != null) {
                return androidLink2;
            }
            throw new IllegalStateException(AbstractC111324zv.A00(2033));
        }
        C38321qM c38321qM3 = productFeedItem.A00;
        if (c38321qM3 != null && (androidLink = (AndroidLink) AbstractC001800i.A0O(c38321qM3.A3Y(), 0)) != null) {
            return androidLink;
        }
        throw new IllegalStateException(AbstractC111324zv.A00(2693));
    }

    public final /* bridge */ /* synthetic */ INP A02(ProductFeedItem productFeedItem, int i, int i2) {
        C14360o3.A0B(productFeedItem, 0);
        return new INP(productFeedItem, productFeedItem.A02, this, i, i2);
    }

    public final void A03(Product product, String str) {
        String str2;
        boolean z;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_shopping_product_action");
        A00.A9K("product_id", Long.valueOf(Long.parseLong(product.A0H)));
        User user = product.A0B;
        if (user != null) {
            str2 = AbstractC76433bn.A00(user);
        } else {
            str2 = null;
        }
        A00.AAK(C4SX.A00(str2), "merchant_id");
        A00.AAP("action", str);
        A00.A7v("is_checkout_enabled", Boolean.valueOf(product.A04()));
        ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
        if (productCheckoutProperties != null) {
            z = C14360o3.A0K(productCheckoutProperties.A02, true);
        } else {
            z = false;
        }
        A00.A7v("can_add_to_bag", Boolean.valueOf(z));
        A00.AAP("shopping_session_id", this.A0D);
        A00.AAP("prior_submodule", this.A08);
        A00.AAP("prior_module", this.A07);
        A00.Cht();
    }

    public final void A04(Product product, String str, int i, int i2) {
        String str2;
        C14360o3.A0B(str, 3);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_shopping_product_card_dismiss");
        if (A00.isSampled()) {
            User user = product.A0B;
            if (user != null) {
                str2 = AbstractC76433bn.A00(user);
            } else {
                str2 = null;
            }
            A00.AAK(C4SX.A00(str2), "merchant_id");
            A00.A9K("product_id", Long.valueOf(Long.parseLong(product.A0H)));
            A00.A7v("is_checkout_enabled", Boolean.valueOf(product.A04()));
            A00.AAP("position", AbstractC154266wb.A01(i, i2));
            A00.AAP("prior_module", this.A07);
            A00.AAP("prior_submodule", this.A08);
            A00.AAP("submodule", str);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAP("shopping_session_id", this.A0D);
            A00.Cht();
        }
    }

    public /* synthetic */ C64952wt(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        String A0I = AbstractC41071vF.A0I(userSession, str2);
        C14360o3.A0B(A01, 25);
        this.A02 = userSession;
        this.A0D = str;
        this.A05 = str2;
        this.A0A = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A04 = str6;
        this.A06 = str7;
        this.A00 = i;
        this.A09 = str8;
        this.A0B = str9;
        this.A0C = str10;
        this.A03 = str11;
        this.A01 = A01;
        this.A0E = A0I;
    }

    public static final boolean A01(ProductFeedItem productFeedItem) {
        C38321qM c38321qM;
        if (productFeedItem.A02() == null && (c38321qM = productFeedItem.A00) != null && c38321qM.CdW()) {
            return true;
        }
        return false;
    }
}
