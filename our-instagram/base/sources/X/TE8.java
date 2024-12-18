package X;

/* loaded from: classes10.dex */
public final class TE8 implements InterfaceC65438TkA {
    public static final Object A02 = AbstractC58318PtA.A0b();
    public volatile InterfaceC65438TkA A00;
    public volatile Object A01 = A02;

    @Override // X.InterfaceC65438TkA
    public final Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.A01;
                if (obj == obj3) {
                    obj = this.A00.get();
                    this.A01 = obj;
                    this.A00 = null;
                }
            }
            return obj;
        }
        return obj2;
    }

    public TE8(InterfaceC65438TkA interfaceC65438TkA) {
        this.A00 = interfaceC65438TkA;
    }
}
