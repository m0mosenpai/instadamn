package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class VQC {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        int i;
        String str;
        String str2;
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        HashMap A0H = C6BQ.A0H((HashMap) c6fw.A02());
        int intValue = ((Number) c6fw.A03(3)).intValue();
        int i2 = c102884kP.A05;
        if (AbstractC167007dF.A1P(i2, 13647)) {
            i = 45;
        } else if (AbstractC167007dF.A1P(i2, 13784)) {
            i = 46;
        } else {
            throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        long max = Math.max(c102884kP.A04(i, 0L), intValue);
        if (U5E.A0C(c102884kP)) {
            str = U5E.A07(c102884kP);
        } else {
            str = null;
        }
        Context context = C1LZ.A00().A00;
        if (str != null) {
            if (AbstractC167007dF.A1P(i2, 13784)) {
                str2 = c102884kP.A0L(55);
            } else {
                str2 = null;
            }
            AbstractC191798eb.A03(context, new C191778eZ(C6BQ.A0B(c6fq)), str, str2, A0H, max);
        }
        return null;
    }
}
