package X;

/* renamed from: X.IAe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40906IAe {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = "unknown";
            } else {
                str2 = "thumbs";
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C05F.A00;
    }
}
