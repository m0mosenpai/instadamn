package X;

/* renamed from: X.1eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31111eG extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1eH
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31111eG c31111eG = (C31111eG) obj;
            anonymousClass182.A0d();
            if (c31111eG.A00 != null) {
                anonymousClass182.A0r("static_sticker");
                AbstractC201078up.A00(anonymousClass182, c31111eG.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c31111eG);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46975Kpu.parseFromJson(c16l);
        }
    };
    public C148276lx A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_static_sticker_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1d;
    }
}
