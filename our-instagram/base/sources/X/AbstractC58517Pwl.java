package X;

/* renamed from: X.Pwl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58517Pwl {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "OFF";
            case 1:
                return "ON";
            case 2:
                return "WHILE_IN_USE";
            default:
                return "ALWAYS";
        }
    }
}
