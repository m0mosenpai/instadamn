package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class SYT {
    public static final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A04, C64980Tb5.A00);
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A04, C64981Tb6.A00);
    public final List A00 = AbstractC166987dD.A1E();

    public final void A00(R2S r2s) {
        QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) this.A01.getValue();
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(875307100, r2s.A00);
        }
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onFCMRegistrationFailure");
        }
    }
}
