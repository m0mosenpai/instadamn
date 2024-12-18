package X;

/* renamed from: X.VxG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69889VxG {
    public static Integer A00(String str) {
        if (str.equals("ONE_DAY")) {
            return C05F.A00;
        }
        if (str.equals("ONE_WEEK")) {
            return C05F.A01;
        }
        if (str.equals("TWO_WEEKS")) {
            return C05F.A0C;
        }
        if (str.equals("ONE_MONTH")) {
            return C05F.A0N;
        }
        if (str.equals("THREE_MONTHS")) {
            return C05F.A0Y;
        }
        if (str.equals("SIX_MONTHS")) {
            return C05F.A0j;
        }
        if (str.equals("SIX_WEEKS")) {
            return C05F.A0u;
        }
        if (str.equals("ONE_YEAR")) {
            return C05F.A15;
        }
        if (str.equals("TWO_YEARS")) {
            return C05F.A1F;
        }
        if (str.equals("LIFETIME")) {
            return C05F.A1I;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ONE_DAY";
            case 1:
                return "ONE_WEEK";
            case 2:
                return "TWO_WEEKS";
            case 3:
                return "ONE_MONTH";
            case 4:
                return "THREE_MONTHS";
            case 5:
                return "SIX_MONTHS";
            case 6:
                return "SIX_WEEKS";
            case 7:
                return "ONE_YEAR";
            case 8:
                return "TWO_YEARS";
            default:
                return "LIFETIME";
        }
    }
}
