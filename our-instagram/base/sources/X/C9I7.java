package X;

import android.os.Looper;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.9I7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9I7 {
    public final QuickPerformanceLogger A00;

    public final void A01(AbstractC50812Vc abstractC50812Vc, String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        int hashCode = abstractC50812Vc.hashCode();
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerStart(994115585, hashCode);
        MarkerEditor withMarker = quickPerformanceLogger.withMarker(994115585, hashCode);
        withMarker.annotate("module", str2);
        withMarker.annotate("component_name", str);
        withMarker.annotate("is_main_thread", C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper()));
        withMarker.markerEditingCompleted();
    }

    public final void A00(AbstractC50812Vc abstractC50812Vc) {
        this.A00.markerEnd(994115585, abstractC50812Vc.hashCode(), (short) 2);
    }

    public C9I7(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
