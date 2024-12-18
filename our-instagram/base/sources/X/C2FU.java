package X;

/* renamed from: X.2FU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FU implements InterfaceC08830cm {
    public volatile InterfaceC08830cm A00;
    public volatile boolean A01;
    public volatile Object A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2FU, X.0cm, java.lang.Object] */
    public static InterfaceC08830cm A00(InterfaceC08830cm interfaceC08830cm) {
        if (interfaceC08830cm instanceof C2FU) {
            return interfaceC08830cm;
        }
        ?? obj = new Object();
        obj.A00 = interfaceC08830cm;
        obj.A01 = false;
        return obj;
    }

    @Override // X.InterfaceC08830cm
    public final Object get() {
        Object obj;
        Object obj2 = this.A02;
        if (!this.A01) {
            synchronized (this) {
                obj = this.A02;
                if (!this.A01) {
                    obj = this.A00.get();
                    Object obj3 = this.A02;
                    if (obj3 != null && obj3 != obj) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Provider was invoked recursively returning different results: ");
                        sb.append(obj3);
                        sb.append(" & ");
                        sb.append(obj);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.A02 = obj;
                    this.A01 = true;
                    this.A00 = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
