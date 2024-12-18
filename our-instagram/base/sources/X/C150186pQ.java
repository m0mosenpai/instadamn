package X;

import android.os.SystemClock;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150186pQ {
    public final C149946on A00;
    public final AbstractC150536q2 A01;
    public final C150666qM A02;
    public final IgArVoltronModuleLoader A03;
    public final ScheduledExecutorService A04;

    public C150186pQ(C149946on c149946on, AbstractC150536q2 abstractC150536q2, C150666qM c150666qM, IgArVoltronModuleLoader igArVoltronModuleLoader, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = abstractC150536q2;
        this.A00 = c149946on;
        this.A02 = c150666qM;
        this.A03 = igArVoltronModuleLoader;
        this.A04 = scheduledExecutorService;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static ListenableFuture A00(final C150186pQ c150186pQ, final C1819185b c1819185b, List list) {
        if (list.isEmpty()) {
            return new C25191Kx(true);
        }
        final ?? obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            C149966op c149966op = c150186pQ.A00.A00;
            int i = 22413316;
            if (c1819185b.A02) {
                i = 22413315;
            }
            String str2 = c1819185b.A01;
            int hashCode = Arrays.hashCode(new Object[]{str2, str});
            QuickPerformanceLogger quickPerformanceLogger = c149966op.A02;
            quickPerformanceLogger.markerStart(i, hashCode, false);
            if (quickPerformanceLogger.isMarkerOn(i, hashCode)) {
                C149976oq c149976oq = c149966op.A01;
                MarkerEditor withMarker = quickPerformanceLogger.withMarker(i, hashCode);
                synchronized (c149976oq) {
                    c149976oq.A01.get(str2);
                    withMarker.annotate("asset_id", str);
                    withMarker.annotate("asset_type", "VoltronModule");
                    withMarker.annotate("operation_id", str2);
                    withMarker.annotate("effect_session_id", c1819185b.A00);
                    withMarker.annotate("event_timestamp_ms", Long.toString(SystemClock.uptimeMillis()));
                    String str3 = c1819185b.A03;
                    if (str3 != null) {
                        withMarker.annotate("onecamera_active_session_id", str3);
                    }
                }
                withMarker.markerEditingCompleted();
            }
            c150186pQ.A03.loadModule(str, new InterfaceC1819985j() { // from class: X.85i
                /* JADX WARN: Type inference failed for: r1v0, types: [X.SLV, java.lang.Object] */
                @Override // X.InterfaceC1819985j
                public final void DG7(boolean z, Throwable th) {
                    ?? obj2 = new Object();
                    obj2.A00 = C05F.A05;
                    obj2.A02 = th;
                    RkH A00 = obj2.A00();
                    C150186pQ.this.A00.A00(c1819185b, str, false);
                    SettableFuture settableFuture = obj;
                    settableFuture.setException(A00);
                    settableFuture.set(false);
                }

                @Override // X.InterfaceC1819985j
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                    C150186pQ.this.A00.A00(c1819185b, str, true);
                    if (atomicInteger.decrementAndGet() == 0) {
                        obj.set(true);
                    }
                }
            });
        }
        return obj;
    }
}
