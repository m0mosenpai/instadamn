package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OKr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54816OKr {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final C22P A02;
    public final String A03;

    public final void A00(EnumC53371NjM enumC53371NjM, C38321qM c38321qM) {
        C38532Gwt c38532Gwt;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A01), "instagram_shopping_media_post");
        A0f.A8R(enumC53371NjM, "share_destination");
        if (c38321qM != null) {
            c38532Gwt = C128205qp.A00(this.A00, c38321qM);
        } else {
            c38532Gwt = null;
        }
        A0f.AAQ(c38532Gwt, "feed_item_info");
        A0f.A8R(this.A02, "prior_submodule");
        MSW.A1U(A0f, this.A03);
        A0f.Cht();
    }

    public final void A01(C38321qM c38321qM) {
        C38532Gwt c38532Gwt;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(this.A01), "instagram_shopping_product_tagging_impression");
        if (c38321qM != null) {
            c38532Gwt = C128205qp.A00(this.A00, c38321qM);
        } else {
            c38532Gwt = null;
        }
        A0f.AAQ(c38532Gwt, "feed_item_info");
        A0f.A8R(this.A02, "prior_submodule");
        MSW.A1U(A0f, this.A03);
        A0f.Cht();
    }

    public C54816OKr(C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = c22p;
        this.A01 = AbstractC09440dt.A01(new C57252Pba(44, interfaceC11380iw, this));
    }
}
