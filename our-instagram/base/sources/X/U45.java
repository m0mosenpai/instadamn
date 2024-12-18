package X;

/* loaded from: classes11.dex */
public abstract class U45 {
    public static final int A00(C102884kP c102884kP) {
        String A0H = c102884kP.A0H();
        if (A0H == null || A0H.equals("column")) {
            return 1;
        }
        if (A0H.equals("row")) {
            return 0;
        }
        throw AbstractC167007dF.A0c("Unknown direction ", A0H);
    }
}
