package X;

import android.content.Context;
import android.os.storage.StorageManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class Rc5 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C124265jg A00;

    @Override // java.lang.Runnable
    public final void run() {
        C124265jg c124265jg = this.A00;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c124265jg.A05;
        lightweightQuickPerformanceLogger.markerStart(43257040);
        lightweightQuickPerformanceLogger.markerAnnotate(43257040, "max_alloc_bytes", c124265jg.A01);
        short s = 3;
        try {
            try {
                try {
                    Context context = AbstractC12290kX.A00;
                    StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
                    if (storageManager != null) {
                        UUID uuidForPath = storageManager.getUuidForPath(AbstractC166987dD.A11(context.getApplicationInfo().dataDir));
                        long allocatableBytes = storageManager.getAllocatableBytes(uuidForPath);
                        lightweightQuickPerformanceLogger.markerAnnotate(43257040, "allocatable_bytes", allocatableBytes);
                        if (allocatableBytes > 0) {
                            storageManager.allocateBytes(uuidForPath, Math.min(allocatableBytes, c124265jg.A01));
                            s = 2;
                        } else {
                            s = 4;
                        }
                    } else {
                        lightweightQuickPerformanceLogger.markerAnnotate(43257040, "error", "StorageManager not available");
                    }
                } catch (Throwable th) {
                    th = th;
                    c124265jg.A09.set(false);
                    lightweightQuickPerformanceLogger.markerEnd(43257040, s);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                s = 51;
                c124265jg.A09.set(false);
                lightweightQuickPerformanceLogger.markerEnd(43257040, s);
                throw th;
            }
        } catch (IOException e) {
            lightweightQuickPerformanceLogger.markerAnnotate(43257040, "error", e.toString());
        }
        c124265jg.A09.set(false);
        lightweightQuickPerformanceLogger.markerEnd(43257040, s);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc5(C124265jg c124265jg) {
        super(389273222);
        this.A00 = c124265jg;
    }
}
