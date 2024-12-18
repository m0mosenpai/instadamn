package X;

/* renamed from: X.CKw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27729CKw {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "IMAGE";
            case 2:
                return "FLASH_IMAGE";
            case 3:
                return "VIDEO";
            case 4:
                return "UPLOADED_IMAGE";
            case 5:
                return "FLASH_RECAP_VIDEO";
            default:
                return "UNKNOWN";
        }
    }
}
