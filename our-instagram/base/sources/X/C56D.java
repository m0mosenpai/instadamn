package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;

/* renamed from: X.56D, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56D {
    public static int A00;

    public static final int A00(Context context) {
        C14360o3.A0B(context, 0);
        int i = A00;
        if (i == 0) {
            if (!BuildConstants.A02()) {
                A00 = -1;
                return -1;
            }
            try {
                int i2 = context.getPackageManager().getPackageInfo("com.google.ar.core", 128).versionCode;
                A00 = i2;
                return i2;
            } catch (Throwable unused) {
                A00 = -1;
                return -1;
            }
        }
        return i;
    }
}
