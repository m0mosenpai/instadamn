package X;

/* renamed from: X.2K7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2K7 implements C2K3, C2K8 {
    public static final Object A02 = new Object();
    public volatile C2K3 A00;
    public volatile Object A01 = A02;

    public C2K7(C2K3 c2k3) {
        this.A00 = c2k3;
    }

    @Override // X.C2K3
    public final Object FFc() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.A01;
                if (obj == obj3) {
                    obj = this.A00.FFc();
                    Object obj4 = this.A01;
                    if (obj4 != obj3 && obj4 != obj) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(obj4);
                        sb.append(" & ");
                        sb.append(obj);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
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
