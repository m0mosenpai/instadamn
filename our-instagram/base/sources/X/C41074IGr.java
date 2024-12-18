package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.IGr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41074IGr {
    public final C25531Mh A00;
    public final C25531Mh A01;
    public final /* synthetic */ C64952wt A02;

    public /* synthetic */ C41074IGr(ProductFeedItem productFeedItem, C64952wt c64952wt, int i, int i2) {
        String str;
        User user;
        String A00;
        C4SX A002;
        boolean A04;
        String str2;
        FBProductItemDetailsDict A01;
        FBProductItemDetailsDict A012;
        ProductTile productTile = productFeedItem.A02;
        C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(c64952wt.A01, "instagram_shopping_product_card_impression"), 319);
        if (productTile != null && (A012 = AbstractC41709Idf.A01(productTile)) != null) {
            str = AbstractC37302Gc3.A0Z(A012);
        } else {
            Product A02 = productFeedItem.A02();
            if (A02 != null) {
                str = A02.A0H;
            } else {
                throw AbstractC166987dD.A14("product expected");
            }
        }
        c25531Mh.A0Q("product_id", AbstractC25228BEl.A13(str));
        if (productTile != null && AbstractC41709Idf.A01(productTile) != null) {
            A002 = null;
        } else {
            Product A022 = productFeedItem.A02();
            if (A022 != null && (user = A022.A0B) != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                A002 = C4SX.A00(A00);
            } else {
                throw AbstractC166987dD.A14("product expected");
            }
        }
        c25531Mh.A0d(A002);
        if (productTile != null && AbstractC41709Idf.A01(productTile) != null) {
            A04 = false;
        } else {
            Product A023 = productFeedItem.A02();
            if (A023 != null) {
                A04 = A023.A04();
            } else {
                throw AbstractC166987dD.A14("product expected");
            }
        }
        c25531Mh.A0O("is_checkout_enabled", Boolean.valueOf(A04));
        c25531Mh.A0R("search_session_id", AbstractC37303Gc4.A0R(c25531Mh, c64952wt, i, i2));
        String str3 = null;
        c25531Mh.A0R("central_pdp_version", null);
        if (productTile != null && (A01 = AbstractC41709Idf.A01(productTile)) != null) {
            str3 = AbstractC37302Gc3.A0Z(A01);
        }
        c25531Mh.A0R("page_id", str3);
        if (productTile != null && AbstractC41709Idf.A01(productTile) != null) {
            str2 = "fb";
        } else {
            str2 = null;
        }
        c25531Mh.A0R("redirect_app", str2);
        ProductTileBannerMetadataDecoration A013 = C41767Iej.A01(c64952wt.A02, productFeedItem);
        c25531Mh.A0R("label", A013 != null ? A013.AfT() : null);
        String str4 = c64952wt.A05;
        if (str4 != null) {
            c25531Mh.A0l(str4);
            c25531Mh.A0R("tracking_token", c64952wt.A0E);
        }
        String str5 = c64952wt.A0A;
        if (str5 != null) {
            c25531Mh.A0R("product_collection_type", str5);
        }
        AbstractC37303Gc4.A0u(c25531Mh, productTile);
        int i3 = c64952wt.A00;
        if (i3 != -1) {
            c25531Mh.A0Q("m_t", AbstractC31171DnF.A0V(i3));
        }
        if (productTile != null) {
            AbstractC37303Gc4.A0v(c25531Mh, productTile);
            ProductTileUCILoggingInfoImpl productTileUCILoggingInfoImpl = productTile.A03;
            if (productTileUCILoggingInfoImpl != null) {
                c25531Mh.A0N(AbstractC41709Idf.A00(productTileUCILoggingInfoImpl), "ranking_data_blob");
            }
            AbstractC37303Gc4.A0t(c25531Mh, productTile);
        }
        AbstractC37303Gc4.A0w(c25531Mh, c64952wt.A03);
        c25531Mh.A0O("is_dark_mode", Boolean.valueOf(C1H6.A03()));
        this.A02 = c64952wt;
        this.A00 = c25531Mh;
        this.A01 = c25531Mh;
    }
}
