package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;

/* renamed from: X.1bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29801bv extends AbstractC29011ae {
    public static final C1OZ A08 = new C1OZ() { // from class: X.1bw
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29801bv c29801bv = (C29801bv) obj;
            anonymousClass182.A0d();
            if (c29801bv.A07 != null) {
                C16V.A03(anonymousClass182, "p2b_order");
                for (C910143t c910143t : c29801bv.A07) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str = c29801bv.A04;
            if (str != null) {
                anonymousClass182.A0S("order_id", str);
            }
            String str2 = c29801bv.A03;
            if (str2 != null) {
                anonymousClass182.A0S("merchant_id", str2);
            }
            String str3 = c29801bv.A02;
            if (str3 != null) {
                anonymousClass182.A0S("customer_id", str3);
            }
            String str4 = c29801bv.A01;
            if (str4 != null) {
                anonymousClass182.A0S("currency_code", str4);
            }
            String str5 = c29801bv.A00;
            if (str5 != null) {
                anonymousClass182.A0S("amount", str5);
            }
            String str6 = c29801bv.A06;
            if (str6 != null) {
                anonymousClass182.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str6);
            }
            String str7 = c29801bv.A05;
            if (str7 != null) {
                anonymousClass182.A0S("order_notes", str7);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29801bv);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6J.parseFromJson(c16l);
        }
    };
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    @Override // X.C1OW
    public final String A02() {
        return "send_p2b_order_xma";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A07;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1K;
    }
}
