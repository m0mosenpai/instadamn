package X;

@Deprecated
/* renamed from: X.1bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29681bj extends AbstractC29011ae {
    public static final C1OZ A01 = new C1OZ() { // from class: X.1bk
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29681bj c29681bj = (C29681bj) obj;
            anonymousClass182.A0d();
            if (c29681bj.A00 != null) {
                anonymousClass182.A0r("pending_media");
                AbstractC47865LCl.A00(anonymousClass182, c29681bj.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29681bj);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46966Kpl.parseFromJson(c16l);
        }
    };
    public C7Q4 A00;

    @Override // X.C1OW
    public final String A02() {
        return "send_media_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1C;
    }
}