package X;

/* renamed from: X.Koc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46895Koc {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "TEXT";
            case 1:
                return "AUDIO";
            case 2:
                return "PHOTO";
            case 3:
                return "VIDEO";
            case 4:
                return "REACTION";
            case 5:
                return "GIF";
            case 6:
                return "STICKER";
            case 7:
                return "COLLECTION";
            case 8:
                return "EPHEMERAL_PHOTO";
            default:
                return "EPHEMERAL_VIDEO";
        }
    }
}
