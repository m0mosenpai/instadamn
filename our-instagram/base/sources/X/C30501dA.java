package X;

/* renamed from: X.1dA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30501dA extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1dB
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C30501dA c30501dA = (C30501dA) obj;
            anonymousClass182.A0d();
            if (c30501dA.A00 != null) {
                anonymousClass182.A0r("voting_info_center");
                anonymousClass182.A0d();
                anonymousClass182.A0a();
            }
            AbstractC47856LCb.A00(anonymousClass182, c30501dA);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46982Kq1.parseFromJson(c16l);
        }
    };
    public C46852Knl A00 = new Object();

    @Override // X.C1OW
    public final String A02() {
        return "send_voting_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1n;
    }
}
