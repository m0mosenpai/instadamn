package X;

/* renamed from: X.730, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass730 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "TransparencyLogger";
    public C18920wW A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC50532MSl.A01(207, 12, 77);
    }

    public final void A00(Rie rie, String str, String str2, String str3, boolean z) {
        RiZ riZ;
        if (z) {
            riZ = RiZ.A02;
        } else {
            riZ = RiZ.A06;
        }
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_authenticity_consumer");
        A00.A8R(riZ, "action");
        A00.A8R(rie, "screen");
        A00.A9K("target_user_id", Long.valueOf(Long.parseLong(str)));
        if (str2 != null) {
            A00.AAP("product", str2);
        }
        if (str3 != null) {
            A00.A9K("post_id", Long.valueOf(Long.parseLong(str3)));
        }
        A00.Cht();
    }

    public AnonymousClass730(AbstractC12990ll abstractC12990ll) {
        this.A00 = AbstractC12220kQ.A01(this, abstractC12990ll);
    }
}
