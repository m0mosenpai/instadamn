package X;

/* renamed from: X.1ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31351ee extends AbstractC29011ae {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1ef
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31351ee c31351ee = (C31351ee) obj;
            anonymousClass182.A0d();
            if (c31351ee.A01 != null) {
                anonymousClass182.A0r("direct_voice_media");
                C4G1.A00(anonymousClass182, c31351ee.A01);
            }
            if (c31351ee.A00 != null) {
                anonymousClass182.A0r("replied_to_message");
                AbstractC43642JSa.A01(anonymousClass182, c31351ee.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c31351ee);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46935KpG.parseFromJson(c16l);
        }
    };
    public AnonymousClass442 A00;
    public C4G2 A01;

    @Override // X.C1OW
    public final String A02() {
        return "configure_voice_message";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A00;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A01;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1m;
    }
}
