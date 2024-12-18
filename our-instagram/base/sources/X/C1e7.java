package X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

@Deprecated
/* renamed from: X.1e7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1e7 extends AbstractC29011ae {
    public static final C1OZ A03 = new C1OZ() { // from class: X.1e8
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C1e7 c1e7 = (C1e7) obj;
            anonymousClass182.A0d();
            if (c1e7.A02 != null) {
                anonymousClass182.A0r("animated_media");
                AbstractC47867LCn.A00(anonymousClass182, c1e7.A02);
            }
            if (c1e7.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c1e7.A00);
            }
            if (c1e7.A01 != null) {
                anonymousClass182.A0r("replied_to_message");
                AbstractC43642JSa.A01(anonymousClass182, c1e7.A01);
            }
            AbstractC47856LCb.A00(anonymousClass182, c1e7);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46956Kpb.parseFromJson(c16l);
        }
    };

    @Deprecated
    public DirectForwardingParams A00;
    public AnonymousClass442 A01;
    public DirectAnimatedMedia A02;

    @Override // X.C1OW
    public final String A02() {
        return "send_animated_media_message";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A01;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A02;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0K;
    }
}
