package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138756Qf {
    public boolean A00;
    public final QuickPerformanceLogger A01;
    public final C139406Sv A02;
    public final ExecutorService A03;

    public C138756Qf(QuickPerformanceLogger quickPerformanceLogger, C139406Sv c139406Sv) {
        C14360o3.A0B(c139406Sv, 2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        this.A01 = quickPerformanceLogger;
        this.A02 = c139406Sv;
        this.A03 = newSingleThreadExecutor;
    }
}
