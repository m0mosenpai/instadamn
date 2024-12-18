package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Sx1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63975Sx1 implements InterfaceC65203Tfm {
    public final SXE A00;
    public final QuickPerformanceLogger A01;
    public final ExecutorService A02;

    public C63975Sx1(SXE sxe, QuickPerformanceLogger quickPerformanceLogger, ExecutorService executorService) {
        if (sxe != null) {
            this.A00 = sxe;
            if (quickPerformanceLogger != null) {
                this.A01 = quickPerformanceLogger;
                this.A02 = executorService;
                return;
            }
            throw AbstractC166987dD.A14("qpl == null");
        }
        throw AbstractC166987dD.A14("client == null");
    }
}
