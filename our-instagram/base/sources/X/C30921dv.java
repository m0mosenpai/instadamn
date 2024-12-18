package X;

import java.util.List;

/* renamed from: X.1dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30921dv extends AbstractC29011ae {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1dw
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30921dv c30921dv = (C30921dv) obj;
            anonymousClass182.A0d();
            if (c30921dv.A01 != null) {
                C16V.A03(anonymousClass182, "hscroll_share");
                for (C910143t c910143t : c30921dv.A01) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c30921dv.A02 != null) {
                C16V.A03(anonymousClass182, "product_ids");
                for (String str : c30921dv.A02) {
                    if (str != null) {
                        anonymousClass182.A0u(str);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str2 = c30921dv.A00;
            if (str2 != null) {
                anonymousClass182.A0S("merchant_id", str2);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30921dv);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F69.parseFromJson(c16l);
        }
    };
    public String A00;
    public List A01;
    public List A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_hscroll_product_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A01;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A11;
    }
}
