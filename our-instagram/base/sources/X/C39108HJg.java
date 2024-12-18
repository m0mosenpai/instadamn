package X;

/* renamed from: X.HJg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39108HJg extends AbstractC64162vb {
    public final C18920wW A00;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C4SX c4sx;
        IMR imr = (IMR) obj;
        C14360o3.A0B(imr, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_shopping_mini_shop_storefront_profile_entry_point_impression");
        String str = imr.A01;
        Long l = null;
        if (str != null) {
            c4sx = C4SX.A00(str);
        } else {
            c4sx = null;
        }
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            AbstractC37300Gc1.A0v(c0Zx, imr.A02);
            c0Zx.A06("submodule", imr.A08);
            AbstractC37300Gc1.A0w(c0Zx, imr.A03);
            AbstractC37303Gc4.A0z(c0Zx, "shopping_session_id", imr.A05);
            AbstractC37300Gc1.A0f(A0f, c0Zx);
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A06("m_pk", imr.A06);
            c0Zx2.A06("tracking_token", imr.A07);
            A0f.AAQ(c0Zx2, "feed_item_info");
            A0f.AAK(c4sx, "merchant_id");
            A0f.AAK(C4SX.A00(imr.A04), "ig_profile_user_id");
            A0f.AAK(null, "marketer_id");
            Integer num = imr.A00;
            if (num != null) {
                l = AbstractC25229BEm.A0n(num);
            }
            A0f.A9K("index", l);
            A0f.Cht();
        }
    }

    public C39108HJg(C18920wW c18920wW, C1BX c1bx, InterfaceC62702t9 interfaceC62702t9) {
        super(c1bx, interfaceC62702t9);
        this.A00 = c18920wW;
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
