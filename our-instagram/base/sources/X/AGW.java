package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AGW {
    public static final AGW A00 = new Object();

    public final C23384AYi A00(Context context, C178027vb c178027vb, InterfaceC178157vo... interfaceC178157voArr) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C178017va c178017va = new C178017va(c178027vb);
        C178017va.A00(c178017va, InterfaceC178197vt.A00, true);
        C178187vs c178187vs = new C178187vs(context, new C178027vb(c178017va), interfaceC178157voArr);
        C23384AYi c23384AYi = new C23384AYi(c178187vs);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        Object obj = c178027vb.A00.get(C178027vb.A02);
        if (obj != null) {
            C178257vz c178257vz = c178187vs.A03;
            Map map = c178257vz.A03;
            map.clear();
            map.put("plugin_list_name", obj);
            ((InterfaceC178407wE) c178257vz.A00(InterfaceC178407wE.A00)).DEX(map, 27, elapsedRealtimeNanos2);
            return c23384AYi;
        }
        throw AbstractC166997dE.A0g();
    }
}
