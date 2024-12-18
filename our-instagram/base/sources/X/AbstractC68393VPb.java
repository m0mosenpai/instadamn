package X;

import java.util.List;

/* renamed from: X.VPb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68393VPb {
    public static C69474Vnx A00(C6FG c6fg, C102884kP c102884kP, int i, int i2, int i3, int i4) {
        List A0O = c102884kP.A0O(35);
        float[] fArr = new float[A0O.size()];
        float[] fArr2 = new float[A0O.size()];
        String[] strArr = new String[A0O.size()];
        C68945Vej[] c68945VejArr = new C68945Vej[A0O.size()];
        for (int i5 = 0; i5 < A0O.size(); i5++) {
            C102884kP c102884kP2 = (C102884kP) A0O.get(i5);
            fArr[i5] = c102884kP2.A02(36, 0.0f);
            fArr2[i5] = c102884kP2.A02(38, 0.0f);
            strArr[i5] = c102884kP2.A0L(35);
            String A0L = c102884kP2.A0L(45);
            String A0L2 = c102884kP2.A0L(46);
            if (A0L != null && A0L2 != null) {
                c68945VejArr[i5] = new C68945Vej(A0L, A0L2);
            }
        }
        return new C69474Vnx(fArr, fArr2, c68945VejArr, strArr, i, i2, i3, i4, c102884kP.A02(50, 2.0f), AbstractC65702TsY.A0C(c6fg, c102884kP, 41), AbstractC65702TsY.A0C(c6fg, c102884kP, 36), AbstractC65702TsY.A0C(c6fg, c102884kP, 40), AbstractC65702TsY.A0C(c6fg, c102884kP, 38), MSY.A1S(AbstractC65702TsY.A0C(c6fg, c102884kP, 36), -1), c102884kP.A0S(48, false), c102884kP.A0S(49, false));
    }
}
