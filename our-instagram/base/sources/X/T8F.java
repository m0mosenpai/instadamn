package X;

import android.R;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class T8F implements C2JL {
    public final SDV A00;
    public final InterfaceC65484Tl1 A01;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        this.A01.onFailure(th);
        SLW slw = this.A00.A00;
        String obj = th.toString();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = slw.A02;
        if (lightweightQuickPerformanceLogger != null) {
            int i = slw.A00;
            lightweightQuickPerformanceLogger.markerAnnotate(R.menu.webview_copy, i, "error", obj);
            lightweightQuickPerformanceLogger.markerEnd(R.menu.webview_copy, i, (short) 3);
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        int i2;
        short s;
        SDU sdu = (SDU) obj;
        try {
            C14360o3.A0A(sdu);
            this.A01.DqC(sdu.A00.getCanonicalPath());
            if (sdu.A01 != C05F.A00) {
                SLW slw = this.A00.A00;
                lightweightQuickPerformanceLogger = slw.A02;
                if (lightweightQuickPerformanceLogger != null) {
                    i = R.menu.webview_copy;
                    i2 = slw.A00;
                    s = 2;
                } else {
                    return;
                }
            } else {
                SLW slw2 = this.A00.A00;
                lightweightQuickPerformanceLogger = slw2.A02;
                if (lightweightQuickPerformanceLogger != null) {
                    i = R.menu.webview_copy;
                    i2 = slw2.A00;
                    s = 25;
                } else {
                    return;
                }
            }
            lightweightQuickPerformanceLogger.markerEnd(i, i2, s);
        } catch (IOException e) {
            onFailure(e);
        }
    }

    public T8F(SDV sdv, InterfaceC65484Tl1 interfaceC65484Tl1) {
        this.A01 = interfaceC65484Tl1;
        this.A00 = sdv;
    }
}
