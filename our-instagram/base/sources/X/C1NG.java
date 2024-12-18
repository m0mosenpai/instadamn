package X;

import java.io.Serializable;

/* renamed from: X.1NG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NG implements InterfaceC216113n, Serializable {
    public final InterfaceC216113n A00;
    public transient Object A01;
    public volatile transient boolean A02;

    @Override // X.InterfaceC216113n
    public final Object get() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    Object obj = this.A00.get();
                    this.A01 = obj;
                    this.A02 = true;
                    return obj;
                }
            }
        }
        return this.A01;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.A02) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<supplier that returned ");
            sb2.append(this.A01);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.A00;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public C1NG(InterfaceC216113n delegate) {
        this.A00 = delegate;
    }
}
