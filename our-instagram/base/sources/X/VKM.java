package X;

import android.content.Context;
import android.content.res.Configuration;

/* loaded from: classes11.dex */
public abstract class VKM {
    public static int A00(Context context) {
        Configuration A08 = AbstractC58319PtB.A08(context);
        int i = A08.screenWidthDp;
        int i2 = A08.screenHeightDp;
        if (A08.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i < 500) {
                if (i > 480) {
                    if (i2 <= 640) {
                        return 3;
                    }
                } else {
                    if (i < 360) {
                        return 2;
                    }
                    return 3;
                }
            }
            return 4;
        }
        return 5;
    }
}
