package X;

import android.os.StrictMode;
import java.util.UUID;

/* renamed from: X.2SD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2SD {
    public static final UUID A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return UUID.randomUUID();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
