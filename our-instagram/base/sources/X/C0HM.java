package X;

import android.os.StrictMode;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0HM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0HM {
    public static final AtomicReference A00 = new AtomicReference();

    public static UUID A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return UUID.randomUUID();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
