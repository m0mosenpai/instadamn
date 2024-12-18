package X;

import java.util.Map;

/* renamed from: X.TDr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64433TDr implements InterfaceC65437Tk9 {
    public static final InterfaceC65668Tqy A03 = new InterfaceC65668Tqy() { // from class: X.T9q
        @Override // X.InterfaceC65435Tk7
        public final void ARz(Object obj, Object obj2) {
            throw new RuntimeException(AnonymousClass001.A0R("Couldn't find encoder for type ", AbstractC58319PtB.A0u(obj)));
        }
    };
    public final Map A01 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public InterfaceC65668Tqy A00 = A03;

    @Override // X.InterfaceC65437Tk9
    public final /* bridge */ /* synthetic */ InterfaceC65437Tk9 EDF(InterfaceC65668Tqy interfaceC65668Tqy, Class cls) {
        this.A01.put(cls, interfaceC65668Tqy);
        this.A02.remove(cls);
        return this;
    }
}
