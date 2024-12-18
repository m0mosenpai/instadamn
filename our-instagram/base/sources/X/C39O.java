package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.39O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39O implements C39P {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C38A A02;
    public final AnonymousClass389 A03;

    public C39O(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38A c38a, AnonymousClass389 anonymousClass389) {
        C14360o3.A0B(c38a, 3);
        C14360o3.A0B(anonymousClass389, 4);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A02 = c38a;
        this.A03 = anonymousClass389;
    }

    @Override // X.C39P
    public final void DxS(C38321qM c38321qM, C75113Zb c75113Zb) {
        C38A c38a = this.A02;
        C18920wW c18920wW = c38a.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_shopping_seller_featured_product_permission_media_request_tap");
        A00.AAQ(C128205qp.A00(c38a.A01, c38321qM), "feed_item_info");
        A00.Cht();
        if (!c38321qM.CdW()) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A05, userSession, 2342170985064905750L)) {
                AbstractC40635Hzt.A00(userSession, c38321qM, this.A01, c75113Zb);
            }
        }
        this.A03.A03(c38321qM, new C42921IyZ(this, c38321qM, c75113Zb), "media_upsell_cta");
    }
}
