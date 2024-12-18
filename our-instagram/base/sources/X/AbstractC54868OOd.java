package X;

/* renamed from: X.OOd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54868OOd {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DOWNLOAD_TRACK_FAILED";
            case 2:
                return "DOWNLOAD_MUSIC_ASSET_FAILED";
            case 3:
                return "FAILED_TO_GENERATE_PENDING_MEDIA_FROM_CLIPS_DRAFT";
            case 4:
                return "UNKNOWN_ERROR";
            default:
                return "CLIPS_DRAFTS_NULL";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "download track failed";
            case 2:
                return "download music asset failed";
            case 3:
                return "failed to generate PendingMedia from ClipsDraft";
            case 4:
                return "unknown_error";
            default:
                return "clips_drafts_null";
        }
    }
}
