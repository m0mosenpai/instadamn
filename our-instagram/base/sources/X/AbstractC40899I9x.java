package X;

/* renamed from: X.I9x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40899I9x {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "approved";
                    break;
                case 2:
                    str2 = "rejected";
                    break;
                case 3:
                    str2 = "pending";
                    break;
                case 4:
                    str2 = "outdated";
                    break;
                default:
                    str2 = "";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return null;
    }
}
