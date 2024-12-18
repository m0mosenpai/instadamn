package X;

/* renamed from: X.1be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29631be extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1bf
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29631be c29631be = (C29631be) obj;
            anonymousClass182.A0d();
            if (c29631be.A00 != null) {
                anonymousClass182.A0r("private_reply_info");
                AbstractC47855LCa.A00(anonymousClass182, c29631be.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29631be);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46963Kpi.parseFromJson(c16l);
        }
    };
    public C47588Kzy A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_like_message";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A18;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return "❤";
    }
}
