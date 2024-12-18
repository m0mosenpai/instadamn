package X;

import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.TPd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64672TPd implements Runnable {
    public final /* synthetic */ SNF A00;
    public final /* synthetic */ C63305ShB A01;
    public final /* synthetic */ boolean A02;

    public RunnableC64672TPd(SNF snf, C63305ShB c63305ShB, boolean z) {
        this.A01 = c63305ShB;
        this.A02 = z;
        this.A00 = snf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63305ShB c63305ShB = this.A01;
        int i = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        while (c63305ShB.A06 == null) {
            try {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                Thread.sleep(10L);
                i = i2;
            } catch (InterruptedException unused) {
            }
        }
        BrowserLiteCallback browserLiteCallback = c63305ShB.A06;
        if (browserLiteCallback != null) {
            try {
                this.A00.A00(browserLiteCallback);
                return;
            } catch (Exception e) {
                this.A00.A01(e);
                return;
            }
        }
        if (this.A02) {
            SNF snf = this.A00;
            LK0 lk0 = c63305ShB.A07;
            if (lk0 != null) {
                lk0.A04(new LSD(10, snf, c63305ShB));
                return;
            }
            return;
        }
        AbstractC63254SgB.A01("BrowserLiteCallbacker", "Callback service is not available.", AbstractC58318PtA.A1b());
        C0K8.A0E("BrowserLiteCallbacker", "Callback service is not available");
    }
}
