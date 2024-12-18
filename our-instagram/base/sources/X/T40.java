package X;

/* loaded from: classes10.dex */
public final class T40 implements InterfaceC65395TjS {
    public final AbstractC61582Rq6 A00;
    public final InterfaceC65239TgV A01;
    public final java.util.Set A02;

    @Override // X.InterfaceC65395TjS
    public final C64210T3z CAn(SOM som, InterfaceC65393TjQ interfaceC65393TjQ, Class cls, String str) {
        java.util.Set set = this.A02;
        if (set.contains(som)) {
            return new C64210T3z(som, interfaceC65393TjQ, this.A00, this.A01, str);
        }
        throw AbstractC58319PtB.A0j("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{som, set});
    }

    public T40(AbstractC61582Rq6 abstractC61582Rq6, InterfaceC65239TgV interfaceC65239TgV, java.util.Set set) {
        this.A02 = set;
        this.A00 = abstractC61582Rq6;
        this.A01 = interfaceC65239TgV;
    }
}
