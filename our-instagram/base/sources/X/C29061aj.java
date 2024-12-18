package X;

@Deprecated
/* renamed from: X.1aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29061aj extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1ak
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29061aj c29061aj = (C29061aj) obj;
            anonymousClass182.A0d();
            if (c29061aj.A00 != null) {
                anonymousClass182.A0r("cta_link");
                IEQ ieq = c29061aj.A00;
                anonymousClass182.A0d();
                String str = ieq.A01;
                if (str != null) {
                    anonymousClass182.A0S("cta_link_type", str);
                }
                String str2 = ieq.A00;
                if (str2 != null) {
                    anonymousClass182.A0S("direct_app_status", str2);
                }
                anonymousClass182.A0a();
            }
            String str3 = c29061aj.A01;
            if (str3 != null) {
                anonymousClass182.A0S("invite_source", str3);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29061aj);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC40592HzC.parseFromJson(c16l);
        }
    };
    public IEQ A00;
    public String A01;

    @Override // X.C1OW
    public final String A02() {
        return "direct_app_invite";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0d;
    }
}
