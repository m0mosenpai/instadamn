package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1GI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GI implements InterfaceC12870lZ {
    public static C1GI A02;
    public final C1BX A00 = C1BX.A03.A02("network_latency_recorder");
    public final Map A01 = new LinkedHashMap();

    @Override // X.InterfaceC12870lZ
    public final synchronized void onAppBackgrounded() {
        long size;
        int A03 = C0f9.A03(-1470297557);
        for (Map.Entry entry : this.A01.entrySet()) {
            C1BX c1bx = this.A00;
            String str = (String) entry.getKey();
            C3JR c3jr = (C3JR) entry.getValue();
            synchronized (c3jr) {
                size = c3jr.A00 / c3jr.A01.size();
            }
            c1bx.A0C(str, size);
        }
        C0f9.A0A(1351300934, A03);
    }

    public C1GI() {
        C218914p.A03(EnumC220415e.A03, this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(663917423, C0f9.A03(-314083914));
    }
}
