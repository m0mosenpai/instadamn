package X;

import android.app.Application;
import android.os.Build;
import java.io.IOException;

/* renamed from: X.1UY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1UY {
    public static volatile String A00;
    public static volatile boolean A01;

    public static final String A00() {
        String str;
        if (!A01) {
            try {
                str = "robolectric";
                if (!"robolectric".equals(Build.FINGERPRINT)) {
                    str = Application.getProcessName();
                    C14360o3.A07(str);
                }
            } catch (IOException unused) {
                str = null;
            }
            A00 = str;
            A01 = true;
        }
        return A00;
    }
}
