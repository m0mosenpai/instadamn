package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.KqH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46998KqH {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    public static final String A00(C83403nh c83403nh) {
        C2EY c2ey = c83403nh.A10;
        AbstractC46997KqG abstractC46997KqG = AbstractC46997KqG.$redex_init_class;
        switch (c2ey.ordinal()) {
            case 2:
                return "text";
            case 3:
                if (c83403nh.A0W() != null) {
                    if (c83403nh.A0W() == EnumC40111tc.A0a) {
                        return MediaStreamTrack.VIDEO_TRACK_KIND;
                    }
                    if (c83403nh.A0W() == EnumC40111tc.A0Q) {
                        return "image";
                    }
                    return "location";
                }
                return "unknown";
            case 4:
                return "expiring_media";
            case 11:
                return "link";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C1120954b c1120954b = c83403nh.A12;
                if (c1120954b != null) {
                    boolean z = c1120954b.A05;
                    if (z) {
                        return "sticker";
                    }
                    if (!z) {
                        return "gif";
                    }
                }
                return "unknown";
            case 14:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 20:
                return "shared_post";
            default:
                return "unknown";
        }
    }
}
