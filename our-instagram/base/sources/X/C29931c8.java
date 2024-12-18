package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.1c8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29931c8 extends AbstractC29011ae {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1c9
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29931c8 c29931c8 = (C29931c8) obj;
            anonymousClass182.A0d();
            if (c29931c8.A01 != null) {
                anonymousClass182.A0r("share_target");
                C7NS.A00(anonymousClass182, c29931c8.A01);
            }
            String str = c29931c8.A03;
            if (str != null) {
                anonymousClass182.A0S("reel_id", str);
            }
            if (c29931c8.A00 != null) {
                anonymousClass182.A0r("live_video_share");
                FUW.A00(c29931c8.A00, anonymousClass182);
            }
            String str2 = c29931c8.A02;
            if (str2 != null) {
                anonymousClass182.A0S(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29931c8);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F6C.parseFromJson(c16l);
        }
    };
    public E71 A00;

    @Deprecated
    public DirectShareTarget A01;
    public String A02;
    public String A03;

    @Override // X.C1OW
    public final String A02() {
        return "send_live_video_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1A;
    }
}
