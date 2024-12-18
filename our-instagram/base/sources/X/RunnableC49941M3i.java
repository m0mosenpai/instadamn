package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.LinkedHashSet;

/* renamed from: X.M3i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49941M3i implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L3L A01;

    public RunnableC49941M3i(L3L l3l, int i) {
        this.A01 = l3l;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set set;
        C44100JeP c44100JeP = this.A01.A03;
        int i = this.A00;
        InterfaceC19630xq interfaceC19630xq = c44100JeP.A00;
        String string = interfaceC19630xq.getString("EB_WARN_SOFT_BLOCK_INTERVALS_EXHAUSTED", null);
        if (string != null) {
            set = C44100JeP.A02(string);
        } else {
            set = C16910sj.A00;
        }
        LinkedHashSet A01 = AnonymousClass090.A01(Integer.valueOf(i), set);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7K("EB_WARN_SOFT_BLOCK_INTERVALS_EXHAUSTED", AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A01, null));
        ARD.apply();
    }
}
