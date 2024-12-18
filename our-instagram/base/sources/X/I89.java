package X;

/* loaded from: classes7.dex */
public abstract class I89 {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = "grid";
            } else {
                str2 = "h-scroll";
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return null;
    }
}
