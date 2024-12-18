package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ExecutorService;

/* renamed from: X.VBy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68115VBy extends AbstractC71176WpF {
    public final QuickPerformanceLogger A00;
    public final C68867VdN A02;
    public final QuickPerformanceLogger A03;
    public final ExecutorService A04 = new C14140ne(1638846523, 3, false, false);
    public final C68359VNt A01 = new C68359VNt();

    public C68115VBy(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
        this.A02 = new C68867VdN(quickPerformanceLogger);
        this.A03 = quickPerformanceLogger;
    }

    @Override // X.XDz
    public final boolean BOn() {
        return true;
    }

    @Override // X.InterfaceC71964XCq
    public final C68867VdN BjL() {
        return this.A02;
    }

    @Override // X.InterfaceC71964XCq
    public final ExecutorService BtQ() {
        return this.A04;
    }

    @Override // X.XDz
    public final boolean CDU() {
        return true;
    }

    @Override // X.XDz
    public final int BPf() {
        return 42674874;
    }

    @Override // X.XDz
    public final int getMarkerId() {
        return 42663937;
    }
}
