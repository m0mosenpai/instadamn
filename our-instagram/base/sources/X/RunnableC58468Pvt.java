package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pvt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58468Pvt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C105574pU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public RunnableC58468Pvt(C105574pU c105574pU, String str, WeakReference weakReference, int i, int i2) {
        this.A02 = c105574pU;
        this.A04 = weakReference;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C06360Vc c06360Vc;
        String A05;
        C105574pU c105574pU = this.A02;
        long A00 = C105574pU.A00(this.A04);
        QuickPerformanceLogger quickPerformanceLogger = c105574pU.A07;
        int i = this.A01;
        int i2 = this.A00;
        quickPerformanceLogger.markerAnnotate(i, i2, "surface_state_after_end", A00);
        quickPerformanceLogger.markerPoint(i, i2, "timeout_after_exit");
        if (0 == c105574pU.A06) {
            System.gc();
        }
        Iterator it = c105574pU.A08.iterator();
        while (it.hasNext()) {
            Iterator A14 = AbstractC166997dE.A14(((InterfaceC105444pF) it.next()).AIR(i2));
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                quickPerformanceLogger.markerAnnotate(i, i2, (String) A1K.getKey(), AbstractC166987dD.A0N(A1K.getValue()));
            }
        }
        if (c105574pU.A09 && i2 == c105574pU.A00 && AbstractC06440Vm.A00 && (c06360Vc = C06360Vc.A0A) != null && (A05 = c06360Vc.A05(21371299)) != null) {
            C2S1.A00().A02().A09("Daily", AnonymousClass001.A0u("endpoint visit end (", this.A03, ") trace_id: ", A05), 0);
        }
        quickPerformanceLogger.markerEndAtPoint(i, i2, (short) 2, "surface_exit");
    }
}
