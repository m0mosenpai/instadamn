package X;

/* loaded from: classes10.dex */
public abstract class SSW {
    public static String A00(Integer num) {
        if (num != null) {
            return A01(num);
        }
        return "null";
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "END_ARRAY";
            case 2:
                return "BEGIN_OBJECT";
            case 3:
                return "END_OBJECT";
            case 4:
                return "NAME";
            case 5:
                return "STRING";
            case 6:
                return "NUMBER";
            case 7:
                return "BOOLEAN";
            case 8:
                return "NULL";
            case 9:
                return "END_DOCUMENT";
            default:
                return "BEGIN_ARRAY";
        }
    }
}
