package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceConfigExtras;

/* renamed from: X.0wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19080wp extends AbstractC06400Vg {
    public static final int A00 = TriggerRegistry.A00.A02("manual");
    public static final C19080wp A01 = new Object();

    @Override // X.AbstractC06400Vg
    public final boolean A03() {
        return false;
    }

    @Override // X.AbstractC06400Vg
    public final boolean A04(long j, Object obj, Object obj2, long j2) {
        return obj == obj2 && j == j2;
    }

    @Override // X.AbstractC06400Vg
    public final int A00(long j, Object obj) {
        C0VJ c0vj = C0VL.A00().A00;
        if (c0vj == null) {
            return 0;
        }
        return ProvidersRegistry.A00.A00(c0vj.A01);
    }

    @Override // X.AbstractC06400Vg
    public final TraceConfigExtras A02(Object obj, long j) {
        C0VJ c0vj = C0VL.A00().A00;
        if (c0vj == null) {
            return new TraceConfigExtras(null, null, null, null, null);
        }
        return c0vj.A00;
    }
}
