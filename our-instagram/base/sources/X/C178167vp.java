package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.7vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178167vp {
    public static final C178167vp A00 = new Object();

    public final C178577wV A00(Context context, C178027vb c178027vb, InterfaceC178157vo... interfaceC178157voArr) {
        C14360o3.A0B(interfaceC178157voArr, 2);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C178187vs c178187vs = new C178187vs(context, c178027vb, interfaceC178157voArr);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        Object obj = c178027vb.A00.get(C178027vb.A02);
        if (obj != null) {
            C178257vz c178257vz = c178187vs.A03;
            Map map = c178257vz.A03;
            map.clear();
            map.put("plugin_list_name", obj);
            ((InterfaceC178407wE) c178257vz.A00(InterfaceC178407wE.A00)).DEX(map, 27, elapsedRealtimeNanos2);
            return new C178577wV(c178187vs);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
