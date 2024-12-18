package X;

import java.util.List;

/* renamed from: X.1dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30961dz extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1e0
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30961dz c30961dz = (C30961dz) obj;
            anonymousClass182.A0d();
            if (c30961dz.A01 != null) {
                C16V.A03(anonymousClass182, "fbpay_referral");
                for (C910143t c910143t : c30961dz.A01) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str = c30961dz.A00;
            if (str != null) {
                anonymousClass182.A0S("referral_id", str);
            }
            AbstractC47856LCb.A00(anonymousClass182, c30961dz);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F66.parseFromJson(c16l);
        }
    };
    public String A00;
    public List A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_fbpay_referral";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A01;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0r;
    }
}
