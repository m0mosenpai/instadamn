package X;

/* renamed from: X.4GU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4GU {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "READY_TO_UPLOAD";
            case 2:
                return "UPLOADING";
            case 3:
                return "UPLOAD_FAILED";
            case 4:
                return "WILL_NOT_UPLOAD";
            case 5:
                return "UPLOADED";
            default:
                return "UNSET";
        }
    }

    public static boolean A01(Integer num) {
        switch (num.intValue()) {
            case 4:
            case 5:
                return false;
            default:
                return true;
        }
    }
}
