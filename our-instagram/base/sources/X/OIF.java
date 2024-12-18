package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class OIF {
    public final int A00 = MSW.A01();
    public final QuickPerformanceLogger A01;
    public final C19L A02;

    public final void A00(AbstractC53419Nk8 abstractC53419Nk8, String str) {
        AbstractC167007dF.A1K(str, abstractC53419Nk8);
        AbstractC166987dD.A1Z(new JXO(abstractC53419Nk8, this, str, null, 0), this.A02);
    }

    public OIF() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        this.A02 = AnonymousClass194.A02(new C2LF(newSingleThreadExecutor));
        this.A01 = QuickPerformanceLoggerProvider.getQPLInstance();
    }
}
