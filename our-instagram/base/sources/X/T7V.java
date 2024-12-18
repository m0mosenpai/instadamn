package X;

/* loaded from: classes10.dex */
public final class T7V implements InterfaceC65426Tjx {
    public static final Object A02 = AbstractC58318PtA.A0b();
    public volatile InterfaceC65426Tjx A00;
    public volatile Object A01;

    @Override // X.InterfaceC65426Tjx
    public final Object A70() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.A01;
                if (obj == obj3) {
                    obj = this.A00.A70();
                    Object obj4 = this.A01;
                    if (obj4 != obj3 && obj4 != obj) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Scoped provider was invoked recursively returning different results: ");
                        A1C.append(obj4);
                        A1C.append(" & ");
                        A1C.append(obj);
                        throw AbstractC58320PtC.A0o(". This is likely due to a circular dependency.", A1C);
                    }
                    this.A01 = obj;
                    this.A00 = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
