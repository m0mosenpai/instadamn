package X;

/* renamed from: X.Rwa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61964Rwa {
    public static String A00(int i) {
        if (i == 4410) {
            return "IG_MEDIA_INGESTION_DRAFT_BACKUP_SAVE";
        }
        if (i == 4432) {
            return "IG_MEDIA_INGESTION_DRAFT_RESTORE";
        }
        if (i == 5246) {
            return "IG_MEDIA_INGESTION_DRAFT_BACKUP_RESTORE";
        }
        if (i == 12909) {
            return "IG_MEDIA_INGESTION_DRAFT_SAVE";
        }
        if (i == 14505) {
            return "IG_MEDIA_INGESTION_DRAFT_VALIDATION";
        }
        if (i == 15671) {
            return "IG_MEDIA_INGESTION_CREATE_MEDIASOURCE";
        }
        switch (i) {
            case 1:
                return "IG_MEDIA_INGESTION_INGEST";
            case 2:
                return "IG_MEDIA_INGESTION_RENDER";
            case 3:
                return "IG_MEDIA_INGESTION_UPLOAD";
            case 4:
                return "IG_MEDIA_INGESTION_CONFIGURE";
            case 5:
                return "IG_MEDIA_INGESTION_FINISH";
            case 6:
                return "IG_MEDIA_INGESTION_COVER_PHOTO_UPLOAD";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
