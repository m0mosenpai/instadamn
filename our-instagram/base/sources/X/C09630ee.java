package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.0ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09630ee extends C0VQ implements C0SW, InterfaceC06270Us {
    public static final int A00 = ProvidersRegistry.A00.A02("frameworks");
    public static final C09630ee A01 = new C0VQ(null);

    public C09630ee() {
        super(null);
    }

    @Override // X.C0SW
    public final Integer CAQ() {
        if ((A00 & TraceEvents.sProviders) != 0) {
            return C05F.A00;
        }
        return C05F.A0C;
    }

    @Override // X.InterfaceC06270Us
    public final void Cus(C0SJ c0sj) {
        String str;
        MultiBufferLogger A02 = A02();
        int writeStandardEntry = A02.writeStandardEntry(7, 21, 0L, 0, 0, 0, 0L);
        String tag = c0sj.getTag();
        int type = c0sj.getType();
        A02.writeBytesEntry(1, 83, writeStandardEntry, tag);
        int writeBytesEntry = A02.writeBytesEntry(1, 56, writeStandardEntry, "runnable_parent");
        C05620Rm c05620Rm = (C05620Rm) c0sj;
        if (c05620Rm.A05 == -1 || (str = String.valueOf(c05620Rm.A02)) == null) {
            str = "null";
        }
        A02.writeBytesEntry(1, 57, writeBytesEntry, str);
        A02.writeBytesEntry(1, 57, A02.writeBytesEntry(1, 56, writeStandardEntry, "runnable_identifier"), String.valueOf(c05620Rm.A00));
        A02.writeBytesEntry(1, 57, A02.writeBytesEntry(1, 56, writeStandardEntry, "app_custom_type"), String.valueOf(type));
        int i = c05620Rm.A01;
        if ((i & 1) == 0) {
            A02.writeBytesEntry(1, 57, A02.writeBytesEntry(1, 56, writeStandardEntry, "indirect_edge"), Boolean.TRUE.toString());
        }
        if ((i & 2) != 0) {
            A02.writeBytesEntry(1, 57, A02.writeBytesEntry(1, 56, writeStandardEntry, "manual_point"), Boolean.TRUE.toString());
        }
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return A00;
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        return A00 & TraceEvents.sProviders;
    }

    @Override // X.InterfaceC06270Us
    public final void D9M(C0SJ c0sj) {
        A02().writeStandardEntry(7, 22, 0L, 0, 0, 0, 0L);
    }

    @Override // X.C0VQ
    public final void disable() {
        C0f9.A0A(1367702729, C0f9.A03(490300291));
    }

    @Override // X.C0VQ
    public final void enable() {
        C0f9.A0A(-121883827, C0f9.A03(-369493429));
    }
}
