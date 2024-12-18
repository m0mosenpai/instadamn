package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.KlN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46704KlN {
    public static final String A00(EnumC40111tc enumC40111tc, ShareType shareType) {
        boolean z = false;
        C14360o3.A0B(shareType, 0);
        C14360o3.A0B(enumC40111tc, 1);
        AbstractC53954NtR abstractC53954NtR = AbstractC53954NtR.$redex_init_class;
        int ordinal = enumC40111tc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                return "unknown_media";
            }
        } else {
            z = true;
        }
        int ordinal2 = shareType.ordinal();
        String str = MediaStreamTrack.VIDEO_TRACK_KIND;
        if (ordinal2 != 3 && ordinal2 != 4) {
            if (z) {
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            }
            return "photo";
        }
        if (!z) {
            str = "photo";
        }
        return AnonymousClass001.A0R("visual_", str);
    }
}
