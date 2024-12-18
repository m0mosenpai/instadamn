package X;

/* loaded from: classes6.dex */
public abstract class F2Z {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "plain mode";
            case 1:
                return "proton mode";
            case 2:
                return "vanish mode";
            case 3:
                return "mixed vanish mode";
            case 4:
                return "legacy_armadillo_cutover";
            case 5:
                return "maybe cutover";
            case 6:
                return "instamadillo_cutover";
            default:
                return "instamadillo_ttlc";
        }
    }
}
