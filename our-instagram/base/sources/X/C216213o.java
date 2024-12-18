package X;

/* renamed from: X.13o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C216213o implements InterfaceC216113n {
    public static final InterfaceC216113n A02 = new InterfaceC216113n() { // from class: X.13p
        @Override // X.InterfaceC216113n
        public final Object get() {
            throw new IllegalStateException();
        }
    };
    public Object A00;
    public volatile InterfaceC216113n A01;

    @Override // X.InterfaceC216113n
    public final Object get() {
        InterfaceC216113n interfaceC216113n = this.A01;
        InterfaceC216113n interfaceC216113n2 = A02;
        if (interfaceC216113n != interfaceC216113n2) {
            synchronized (this) {
                if (this.A01 != interfaceC216113n2) {
                    Object obj = this.A01.get();
                    this.A00 = obj;
                    this.A01 = interfaceC216113n2;
                    return obj;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == A02) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<supplier that returned ");
            sb2.append(this.A00);
            sb2.append(">");
            obj = sb2.toString();
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public C216213o(InterfaceC216113n delegate) {
        this.A01 = delegate;
    }
}
