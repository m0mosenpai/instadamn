package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.transientanalysis.InstagramTransientNetworkDataCollector;

/* renamed from: X.AdK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23625AdK implements InterfaceC12870lZ {
    public final /* synthetic */ QuickPerformanceLogger A00;

    public C23625AdK(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1117833225);
        this.A00.markerEnd(11862018, (short) 2);
        C0f9.A0A(615419078, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int i;
        int A03 = C0f9.A03(-785497900);
        if (((InstagramTransientNetworkDataCollector) InstagramTransientNetworkDataCollector.instance$delegate.getValue())._isTracingActive.get()) {
            i = -1600489670;
        } else {
            this.A00.markerStart(11862018, false);
            i = 979243461;
        }
        C0f9.A0A(i, A03);
    }
}
