package X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Tsn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65714Tsn {
    public int A00;
    public boolean A01;
    public final Handler A02;
    public final QuickPerformanceLogger A03;
    public final C53262cA A04;

    public C65714Tsn(Handler handler, QuickPerformanceLogger quickPerformanceLogger, C53262cA c53262cA) {
        boolean A1U = AbstractC167007dF.A1U(quickPerformanceLogger);
        this.A02 = handler;
        this.A03 = quickPerformanceLogger;
        this.A04 = c53262cA;
        this.A00 = A1U ? 1 : 0;
    }
}
