package X;

import android.content.Context;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2tr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63142tr {
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public final int A00;
    public final QuickPerformanceLogger A01;
    public final Map A02 = new C005001p(0);

    public final void A00(C6FG c6fg, String str) {
        Map map = this.A02;
        C66254U5y c66254U5y = (C66254U5y) map.remove(str);
        if (c66254U5y != null) {
            int i = c66254U5y.A04;
            double d = c66254U5y.A00;
            long j = c66254U5y.A05;
            QuickPerformanceLogger quickPerformanceLogger = c66254U5y.A09;
            int i2 = c66254U5y.A07;
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(36713009, i2);
            withMarker.annotate("sfd", i);
            withMarker.annotate("lfd", d);
            withMarker.annotate("ts", TimeUnit.NANOSECONDS.toMillis(j));
            withMarker.annotate("max_cac", c66254U5y.A03);
            withMarker.annotate("bloks_logging_id", c66254U5y.A0C);
            withMarker.annotate("module", c66254U5y.A0A);
            withMarker.annotate("animation_key", c66254U5y.A0B);
            withMarker.markerEditingCompleted();
            c66254U5y.A01 = -1;
            c66254U5y.A06 = false;
            quickPerformanceLogger.markerEnd(36713009, i2, (short) 2);
            List list = AnonymousClass634.A02(c6fg).A0F;
            synchronized (list) {
                list.remove(c66254U5y);
            }
            for (C66254U5y c66254U5y2 : map.values()) {
                c66254U5y2.A02--;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, java.util.Map] */
    public C63142tr(Context context, QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
        this.A00 = AbstractC63152ts.A00(context);
    }
}
