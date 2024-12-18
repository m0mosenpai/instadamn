package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.profilo.ipc.TraceContext;
import com.instagram.transientanalysis.InstagramTransientNetworkDataCollector;
import java.io.File;

/* renamed from: X.1Fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24021Fq {
    public final void A00() {
        if (C20150ym.A07(AbstractC20100yh.A00(36329208509579444L)) && !(!C20150ym.A07(AbstractC20100yh.A00(36329208507941031L))) && !EndToEnd.A02()) {
            C19700xy c19700xy = C17280tP.A4E;
            C17280tP A00 = c19700xy.A00();
            if (!((Boolean) A00.A1v.CES(A00, C17280tP.A4G[8])).booleanValue() && !c19700xy.A00().A0g()) {
                if (!InstagramTransientNetworkDataCollector.isInitialized.compareAndSet(false, true)) {
                    C0K8.A0D(InstagramTransientNetworkDataCollector.TAG, "Double init");
                    return;
                }
                C10T A002 = C10T.A00();
                InstagramTransientNetworkDataCollector instagramTransientNetworkDataCollector = (InstagramTransientNetworkDataCollector) InstagramTransientNetworkDataCollector.instance$delegate.getValue();
                synchronized (A002) {
                    A002.A00 = instagramTransientNetworkDataCollector;
                    TraceContext traceContext = ((C0VQ) A002).A00;
                    if (traceContext != null && instagramTransientNetworkDataCollector != null) {
                        File file = null;
                        if (C20020yW.A0A.get() != null) {
                            file = C20020yW.A00().A04(A002, traceContext);
                        }
                        A002.A00.startDataCollection(file, false);
                    }
                }
                C006802i c006802i = C006802i.A0p;
                C14360o3.A0A(c006802i);
                C14360o3.A0B(c006802i, 0);
                boolean z = C218914p.A05;
                C218914p.A05(new C23625AdK(c006802i));
                c006802i.markerStart(11862018, false);
            }
        }
    }
}
