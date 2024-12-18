package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes11.dex */
public abstract class VM2 {
    public static final Integer A00(C6FQ c6fq, C6FW c6fw) {
        U4G u4g = (U4G) AnonymousClass634.A06(C103064kh.A00(c6fq, c6fw, 1), AbstractC65702TsY.A0O(c6fw));
        if (u4g != null) {
            Context context = C1LZ.A00().A00;
            if (AbstractC79383gk.A03()) {
                float f = u4g.A02.A05;
                DisplayMetrics A0K = AbstractC167007dF.A0K(context);
                C14360o3.A07(A0K);
                return Integer.valueOf((int) (f / A0K.density));
            }
            throw new RuntimeException("Cannot getScroll off the main thread!");
        }
        return null;
    }
}
