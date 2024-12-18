package X;

/* renamed from: X.KlS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46709KlS {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "AUDIO_NOTE";
                break;
            case 2:
                str = "AUDIO_VOICE_MESSAGE";
                break;
            case 3:
                str = "EPHEMERAL_VIDEO";
                break;
            case 4:
                str = "FEED_VIDEO_RESHARE";
                break;
            case 5:
                str = "OTHER";
                break;
            case 6:
                str = "PERMANENT_VIDEO";
                break;
            case 7:
                str = "REEL_RESHARE";
                break;
            case 8:
                str = "STORY_OTHER";
                break;
            case 9:
                str = "STORY_RESHARE";
                break;
            case 10:
                str = "UNKNOWN";
                break;
            default:
                str = "AUDIO_MUSIC";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
