package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.Random;

/* renamed from: X.0g9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0g9 extends AbstractC19070wo implements C0VR {
    public static final int A01 = TriggerRegistry.A00.A02("cold_start");
    public final ThreadLocal A00 = new ThreadLocal() { // from class: X.0VD
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new Random();
        }
    };

    @Override // X.AbstractC06400Vg
    public final boolean A03() {
        return true;
    }

    @Override // X.AbstractC06400Vg
    public final boolean A04(long j, Object obj, Object obj2, long j2) {
        return ((int) j) == ((int) j2);
    }

    @Override // X.AbstractC06400Vg
    public final int A01(InterfaceC06330Uz interfaceC06330Uz, Object obj, long j) {
        C0VE c0ve = (C0VE) A06(interfaceC06330Uz);
        if (c0ve.A01 == -1) {
            return -100;
        }
        if (((Random) this.A00.get()).nextInt(c0ve.A00) == 0) {
            return c0ve.A01;
        }
        return -101;
    }

    @Override // X.AbstractC19070wo
    public final /* bridge */ /* synthetic */ Object A05(InterfaceC06330Uz interfaceC06330Uz) {
        for (int i : interfaceC06330Uz.getTraceConfigIdxs("qpl", "start")) {
            if (interfaceC06330Uz.optTraceConfigParamBool(i, "trace_config.is_cold_start", false)) {
                C0VE c0ve = new C0VE();
                c0ve.A01 = i;
                c0ve.A00 = interfaceC06330Uz.getTraceConfigParamInt(i, "trace_config.coinflip_sample_rate");
                return c0ve;
            }
        }
        return new C0VE();
    }
}
