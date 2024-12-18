package X;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class FP4 {
    public static FP4 A00;

    public abstract void startDeviceValidation(Context context, String str);

    public static FP4 getInstance() {
        FP4 fp4 = A00;
        if (fp4 == null) {
            C32999Egm c32999Egm = new C32999Egm();
            A00 = c32999Egm;
            return c32999Egm;
        }
        return fp4;
    }
}
