package X;

import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0VM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0VM {
    public static void A00(C06360Vc c06360Vc) {
        for (TraceContext traceContext : c06360Vc.A06()) {
            if ((traceContext.A03 & 2) == 0) {
                C06360Vc.A04(c06360Vc, traceContext.A0B, traceContext.A01, 0, 5, traceContext.A05);
            }
        }
    }
}
