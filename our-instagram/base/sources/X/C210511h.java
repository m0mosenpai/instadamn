package X;

import android.os.Environment;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.11h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C210511h {
    public static final C210611i A05 = new Object();
    public static final C210511h A06 = new C210511h();
    public final File A00;
    public final File A01;
    public final ScheduledExecutorService A02;
    public final C210711j A03;
    public final AtomicBoolean A04;

    public C210511h() {
        synchronized (C0eT.class) {
        }
        this.A00 = new File(new File(Environment.getExternalStorageDirectory(), "e2e/files"), AnonymousClass001.A0R("com.facebook.instagram.", "mock_connectivity.json"));
        synchronized (C0eT.class) {
        }
        this.A01 = new File(new File(Environment.getExternalStorageDirectory(), "e2e/files"), AnonymousClass001.A0R("com.facebook.instagram.", "mock_connectivity.ping"));
        this.A04 = new AtomicBoolean();
        this.A03 = C210711j.A00;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        C14360o3.A07(newSingleThreadScheduledExecutor);
        this.A02 = newSingleThreadScheduledExecutor;
    }
}
