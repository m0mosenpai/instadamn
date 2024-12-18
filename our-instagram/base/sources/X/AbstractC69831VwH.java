package X;

/* renamed from: X.VwH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69831VwH {
    public static byte A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return (byte) 1;
            case 2:
                return (byte) 2;
            case 3:
                return (byte) -1;
            default:
                return (byte) 0;
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RSA2048_PSS";
            case 2:
                return "ECDSAP256";
            case 3:
                return "UNKNOWN";
            default:
                return "RSA2048_PKCS1_5";
        }
    }
}
