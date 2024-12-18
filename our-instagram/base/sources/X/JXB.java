package X;

/* loaded from: classes8.dex */
public abstract class JXB {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 2:
                return "CLIPS_DRAFT_NOTIFICATION_SCHEDULE";
            case 3:
                return "CLIPS_DRAFT_NOTIFICATION_CLICK";
            case 4:
                return "CLIPS_DRAFT_GALLERY";
            case 5:
                return "CLIPS_DRAFT_RESTORE";
            case 6:
                return "CLIPS_DRAFT_SAVE";
            case 7:
                return "CLIPS_UNSAVED_DRAFT";
            case 8:
                return "CLIPS_DRAFT_IMPORT";
            default:
                return "CLIPS_DRAFT_MIDCARD";
        }
    }
}
