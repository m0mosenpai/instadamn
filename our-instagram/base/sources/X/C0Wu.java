package X;

/* renamed from: X.0Wu, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Wu {
    public static String A00(double... dArr) {
        int length = dArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(dArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static String A01(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(iArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static String A02(long... jArr) {
        int length = jArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(jArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static String A03(String... strArr) {
        int length = strArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(strArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }

    public static String A04(boolean... zArr) {
        int length = zArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(zArr[i]);
            sb.append(",,,");
            i++;
        } while (i < length);
        sb.setLength(sb.length() - 3);
        return sb.toString();
    }
}
