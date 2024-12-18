package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.SeS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63168SeS {
    public static final C63168SeS A02 = new C63168SeS();
    public final ConcurrentMap A01 = AbstractC58318PtA.A14();
    public final InterfaceC65422Tjt A00 = new C64255T6e();

    public static C63168SeS A00() {
        return A02;
    }

    public final InterfaceC65591TnW A01(Class cls) {
        AbstractC63328Shc.A03(cls);
        ConcurrentMap concurrentMap = this.A01;
        InterfaceC65591TnW interfaceC65591TnW = (InterfaceC65591TnW) concurrentMap.get(cls);
        if (interfaceC65591TnW == null) {
            interfaceC65591TnW = this.A00.FFa(cls);
            AbstractC63328Shc.A03(cls);
            InterfaceC65591TnW interfaceC65591TnW2 = (InterfaceC65591TnW) concurrentMap.putIfAbsent(cls, interfaceC65591TnW);
            if (interfaceC65591TnW2 != null) {
                return interfaceC65591TnW2;
            }
        }
        return interfaceC65591TnW;
    }
}
