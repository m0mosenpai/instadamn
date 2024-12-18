package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6PU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PU {
    public static final Map A04 = AbstractC06930Yk.A06(new C09530e4("partially_enter_viewport", 1), new C09530e4("fully_enter_viewport", 1), new C09530e4("document_fetch_start", 1), new C09530e4("document_fetch_success", 1), new C09530e4("document_fetch_fail", 1), new C09530e4("assets_fetch_start", 1), new C09530e4("assets_fetch_success", 1), new C09530e4("assets_fetch_fail", 1));
    public final C9H8 A00;
    public final QuickPerformanceLogger A01;
    public final C9HA A02;
    public final ExecutorService A03;

    public static final void A00(C6PU c6pu, String str, String str2) {
        A01(c6pu, new C9HC(c6pu, str, str2, c6pu.A01.currentMonotonicTimestampNanos()));
    }

    public static final void A01(C6PU c6pu, final InterfaceC16820sZ interfaceC16820sZ) {
        ExecutorService executorService = c6pu.A03;
        if (!executorService.isTerminated() && !executorService.isShutdown()) {
            executorService.execute(new Runnable() { // from class: X.9H7
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC16820sZ.this.invoke();
                }
            });
        } else {
            C0w9.A03("ShowreelNativePerformanceLogger", "Trying to log, but executor is terminated or shutdown");
        }
    }

    public final void A02() {
        A01(this, new C207039Ei(this, this.A01.currentMonotonicTimestampNanos(), 1));
    }

    public final void A03() {
        A01(this, new C207039Ei(this, this.A01.currentMonotonicTimestampNanos(), 2));
    }

    public C6PU(C9H8 c9h8, QuickPerformanceLogger quickPerformanceLogger, C9HA c9ha, ExecutorService executorService) {
        this.A00 = c9h8;
        this.A02 = c9ha;
        this.A01 = quickPerformanceLogger;
        this.A03 = executorService;
    }
}
