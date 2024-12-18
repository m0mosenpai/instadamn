package X;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: X.S2c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62207S2c {
    public static Object A00(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
