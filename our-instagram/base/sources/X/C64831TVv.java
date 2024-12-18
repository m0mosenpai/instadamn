package X;

/* renamed from: X.TVv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64831TVv implements InterfaceC08830cm, InterfaceC65398TjV {
    public static final Object A02 = AbstractC58318PtA.A0b();
    public volatile Object A00;
    public volatile InterfaceC08830cm A01;

    @Override // X.InterfaceC08830cm
    public final Object get() {
        Object obj;
        Object obj2 = this.A00;
        Object obj3 = A02;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.A00;
                if (obj == obj3) {
                    obj = this.A01.get();
                    Object obj4 = this.A00;
                    if (obj4 != obj3 && obj4 != obj) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Scoped provider was invoked recursively returning different results: ");
                        A1C.append(obj4);
                        A1C.append(" & ");
                        A1C.append(obj);
                        throw AbstractC58320PtC.A0o(". This is likely due to a circular dependency.", A1C);
                    }
                    this.A00 = obj;
                    this.A01 = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
