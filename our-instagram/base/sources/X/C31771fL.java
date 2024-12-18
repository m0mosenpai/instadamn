package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31771fL extends AbstractC31611f4 {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1fM
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31771fL c31771fL = (C31771fL) obj;
            anonymousClass182.A0d();
            if (c31771fL.A00 != null) {
                anonymousClass182.A0r("seen_marker");
                KVY kvy = c31771fL.A00;
                anonymousClass182.A0d();
                AbstractC81023jW.A00(anonymousClass182, kvy);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0T("is_ae", c31771fL.A01);
            AbstractC43669JTd.A00(anonymousClass182, c31771fL);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46942KpN.parseFromJson(c16l);
        }
    };
    public KVY A00;
    public boolean A01;

    @Override // X.C1OW
    public final String A02() {
        return "send_permanent_media_item_seen_marker";
    }

    @Override // X.AbstractC31611f4
    public final /* bridge */ /* synthetic */ AbstractC81003jU A03() {
        return this.A00;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        String str = this.A00.A04;
        str.getClass();
        return new DirectThreadKey(str);
    }
}
