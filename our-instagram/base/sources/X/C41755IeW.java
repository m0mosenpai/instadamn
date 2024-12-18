package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IeW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41755IeW {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public C41755IeW(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C14360o3.A0B(userSession, 2);
        String A14 = AbstractC25225BEi.A14();
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A01 = interfaceC11380iw;
        this.A03 = userSession;
        this.A0B = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A0C = str4;
        this.A05 = str5;
        this.A04 = str6;
        this.A09 = str7;
        this.A0A = str8;
        this.A06 = A14;
        this.A02 = A01;
    }

    public static C4SX A03(InterfaceC02590Ai interfaceC02590Ai, C5GU c5gu, C41755IeW c41755IeW, String str, String str2) {
        interfaceC02590Ai.AAQ(A00(c5gu, str, str2), "collections_logging_info");
        String str3 = c41755IeW.A0C;
        if (str3 == null || str3.length() == 0) {
            return null;
        }
        return C4SX.A00(str3);
    }

    public final void A05(C5GU c5gu, String str, String str2) {
        C25531Mh c25531Mh;
        C38532Gwt A01;
        String str3;
        C14360o3.A0B(c5gu, 1);
        String str4 = this.A0C;
        if (str4 != null && str4.length() != 0) {
            String str5 = this.A04;
            C18920wW c18920wW = this.A02;
            if (str5 == null) {
                c25531Mh = new C25531Mh(AbstractC166987dD.A0f(c18920wW, "instagram_shopping_product_collection_page_entry"), 322);
                if (AbstractC25226BEj.A1Z(c25531Mh)) {
                    c25531Mh.A0N(A02(this, null), "navigation_info");
                    c25531Mh.A0N(A00(c5gu, str, str2), "collections_logging_info");
                    c25531Mh.A0d(C4SX.A00(str4));
                    ((AbstractC02600Aj) c25531Mh).A00.AAK(null, "marketer_id");
                    A01 = A01(this);
                    str3 = "feed_item_info";
                } else {
                    return;
                }
            } else {
                c25531Mh = new C25531Mh(AbstractC166987dD.A0f(c18920wW, "shops_product_collection_page_entry"), 378);
                if (!AbstractC25226BEj.A1Z(c25531Mh)) {
                    return;
                }
                c25531Mh.A0R("container_module", "shops_product_collection");
                c25531Mh.A0N(A02(this, null), "navigation_info");
                c25531Mh.A0R("position", "0,0");
                ((AbstractC02600Aj) c25531Mh).A00.AAK(C4SX.A00(str4), "merchant_igid");
                ((AbstractC02600Aj) c25531Mh).A00.AAK(null, "marketer_igid");
                c25531Mh.A0N(A00(c5gu, str, str2), "collections_logging_info");
                c25531Mh.A0Q("discount_id", AbstractC37302Gc3.A0V(str2));
                c25531Mh.A0Q("link_id", AbstractC166997dE.A0j(str5));
                A01 = A01(this);
                str3 = "ig_media_info";
            }
            c25531Mh.A0N(A01, str3);
            c25531Mh.A0R("query_text", this.A09);
            c25531Mh.A0R("search_session_id", this.A0A);
            c25531Mh.Cht();
        }
    }

    public final void A06(C5GU c5gu, String str, String str2, String str3, String str4) {
        C14360o3.A0B(c5gu, 1);
        String str5 = null;
        if (str3.equals("shopping_incentive_mention")) {
            str5 = "header";
        } else if (str3.equals("shopping_incentive_user_picture")) {
            str5 = "account_image";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "instagram_shopping_product_collection_profile_navigation");
        if (A0f.isSampled()) {
            if (str2 == null) {
                str2 = "";
            }
            A0f.AAP(AbstractC111324zv.A00(1193), str2);
            AbstractC37300Gc1.A0f(A0f, A02(this, str5));
            A0f.AAQ(A00(c5gu, str, str4), "collections_logging_info");
            A0f.AAQ(A01(this), "feed_item_info");
            A0f.Cht();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.3mT] */
    public static final C82653mT A00(C5GU c5gu, String str, String str2) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("product_collection_id", str);
        c0Zx.A06("product_collection_type", c5gu.toString());
        if (str2 != null) {
            c0Zx.A05("incentive_id", AbstractC166997dE.A0j(str2));
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Gwt, X.0Zx] */
    public static final C38532Gwt A01(C41755IeW c41755IeW) {
        ?? c0Zx = new C0Zx();
        String str = c41755IeW.A05;
        c0Zx.A06("m_pk", str);
        c0Zx.A06("tracking_token", AbstractC41071vF.A0I(c41755IeW.A03, str));
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.38B] */
    public static final C38B A02(C41755IeW c41755IeW, String str) {
        ?? c0Zx = new C0Zx();
        AbstractC37300Gc1.A0v(c0Zx, c41755IeW.A07);
        AbstractC37300Gc1.A0w(c0Zx, c41755IeW.A08);
        c0Zx.A06("shopping_session_id", c41755IeW.A0B);
        AbstractC37301Gc2.A1C(c0Zx, "nav_chain", c41755IeW.A06, str);
        return c0Zx;
    }

    public static void A04(InterfaceC02580Ag interfaceC02580Ag, InterfaceC02590Ai interfaceC02590Ai, C41755IeW c41755IeW) {
        interfaceC02590Ai.AAK(interfaceC02580Ag, "merchant_id");
        interfaceC02590Ai.AAQ(A01(c41755IeW), "feed_item_info");
        interfaceC02590Ai.AAP("query_text", c41755IeW.A09);
        interfaceC02590Ai.AAP("search_session_id", c41755IeW.A0A);
        interfaceC02590Ai.Cht();
    }
}
