package X;

import org.webrtc.MediaStreamTrack;

/* loaded from: classes8.dex */
public abstract class LH6 {
    public static final String A01(Integer num) {
        C14360o3.A0B(num, 0);
        AbstractC34053F1g abstractC34053F1g = AbstractC34053F1g.$redex_init_class;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 1) {
                    return "unknown";
                }
                return "full_view";
            }
            return "thread_details";
        }
        return "chat_thread";
    }

    public static final String A02(Integer num) {
        C14360o3.A0B(num, 0);
        AbstractC34053F1g abstractC34053F1g = AbstractC34053F1g.$redex_init_class;
        switch (num.intValue()) {
            case 0:
                return "audio_music";
            case 1:
                return "audio_note";
            case 2:
                return "audio_voice_message";
            case 3:
                return "ephemeral_video";
            case 4:
                return "feed_video_reshare";
            case 5:
                return "other";
            case 6:
                return "permanent_video";
            case 7:
                return AbstractC111324zv.A00(2984);
            case 8:
                return "story_other";
            case 9:
                return AbstractC111324zv.A00(3171);
            default:
                return "unknown";
        }
    }

    public static final String A00(EnumC40111tc enumC40111tc) {
        if (enumC40111tc != null) {
            AbstractC34053F1g abstractC34053F1g = AbstractC34053F1g.$redex_init_class;
            int ordinal = enumC40111tc.ordinal();
            if (ordinal != 1) {
                if (ordinal == 7) {
                    return MediaStreamTrack.AUDIO_TRACK_KIND;
                }
                return "unknown";
            }
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        return "unknown";
    }
}
