package X;

import com.facebook.profilo.ipc.TraceConfigExtras;
import java.util.List;

/* renamed from: X.0VL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VL {
    public static C0VL A01;
    public volatile C0VJ A00;

    public final synchronized void A01(TraceConfigExtras traceConfigExtras, List list) {
        this.A00 = new C0VJ(traceConfigExtras, list);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.0VL] */
    public static synchronized C0VL A00() {
        C0VL c0vl;
        synchronized (C0VL.class) {
            C0VL c0vl2 = A01;
            c0vl = c0vl2;
            if (c0vl2 == null) {
                ?? obj = new Object();
                A01 = obj;
                c0vl = obj;
            }
        }
        return c0vl;
    }
}
