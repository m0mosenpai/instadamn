package X;

import android.os.StrictMode;
import java.util.UUID;

/* renamed from: X.NoP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53674NoP {
    public static String A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            String obj = randomUUID.toString();
            C14360o3.A07(obj);
            return obj;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
