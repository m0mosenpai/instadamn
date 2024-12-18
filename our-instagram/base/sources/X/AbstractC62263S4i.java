package X;

/* renamed from: X.S4i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62263S4i {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "END_ARRAY";
            case 2:
                return "START_OBJECT";
            case 3:
                return "END_OBJECT";
            case 4:
                return "NAME";
            case 5:
                return "STRING";
            case 6:
                return "EXPRESSION";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "START_ARRAY";
        }
    }
}
