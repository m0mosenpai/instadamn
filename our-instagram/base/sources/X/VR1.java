package X;

/* loaded from: classes11.dex */
public abstract class VR1 {
    public static C1338462s A00(C6FQ c6fq, C102884kP c102884kP) {
        int i;
        int i2 = c102884kP.A05;
        if (i2 == 13647) {
            i = 43;
        } else if (AbstractC167007dF.A1P(i2, 13784)) {
            i = 38;
        } else {
            throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        C102884kP A08 = c102884kP.A08(i);
        if (A08 == null) {
            return null;
        }
        return C1338462s.A00(c6fq, A08);
    }
}
