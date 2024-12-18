package X;

/* renamed from: X.Io4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42280Io4 implements C1OZ {
    @Override // X.C1OZ
    public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
        C42281Io5 c42281Io5 = (C42281Io5) obj;
        anonymousClass182.A0d();
        if (c42281Io5.A00 != null) {
            C16V.A03(anonymousClass182, "products");
            for (II0 ii0 : c42281Io5.A00) {
                if (ii0 != null) {
                    anonymousClass182.A0d();
                    String str = ii0.A03;
                    if (str != null) {
                        anonymousClass182.A0S("product_id", str);
                    }
                    anonymousClass182.A0Q("quantity", ii0.A00);
                    if (ii0.A01 != null) {
                        anonymousClass182.A0r("price");
                        AbstractC41329IQz.A00(anonymousClass182, ii0.A01);
                    }
                    String str2 = ii0.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("launch_date_unix_timestamp", str2);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }

    @Override // X.C1OZ
    public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
        return I2R.parseFromJson(c16l);
    }
}
