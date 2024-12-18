package X;

/* renamed from: X.VPc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68394VPc {
    public static C69474Vnx A00(C6FG c6fg, C102884kP c102884kP, int i, int i2, int i3) {
        int A00;
        int A002;
        int A003;
        int A004;
        int A005;
        int size = c102884kP.A0O(35).size();
        float[] fArr = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            fArr[i4] = ((C102884kP) r5.get(i4)).A03(35, 0);
        }
        C102884kP A08 = c102884kP.A08(41);
        if (A08 == null) {
            A00 = -1;
        } else {
            A00 = C6BK.A00(c6fg, A08, 0);
        }
        int intValue = Integer.valueOf(A00).intValue();
        C102884kP A082 = c102884kP.A08(36);
        if (A082 == null) {
            A002 = -1;
        } else {
            A002 = C6BK.A00(c6fg, A082, 0);
        }
        int intValue2 = Integer.valueOf(A002).intValue();
        C102884kP A083 = c102884kP.A08(40);
        if (A083 == null) {
            A003 = -1;
        } else {
            A003 = C6BK.A00(c6fg, A083, 0);
        }
        int intValue3 = Integer.valueOf(A003).intValue();
        C102884kP A084 = c102884kP.A08(38);
        if (A084 == null) {
            A004 = -1;
        } else {
            A004 = C6BK.A00(c6fg, A084, 0);
        }
        int intValue4 = Integer.valueOf(A004).intValue();
        float f = i;
        float f2 = i2;
        float f3 = i3 - 1;
        C102884kP A085 = c102884kP.A08(36);
        if (A085 == null) {
            A005 = -1;
        } else {
            A005 = C6BK.A00(c6fg, A085, 0);
        }
        return new C69474Vnx(null, fArr, null, null, f, f2, 0.0f, f3, 2.0f, intValue, intValue2, intValue3, intValue4, MSY.A1S(Integer.valueOf(A005).intValue(), -1), false, false);
    }
}
