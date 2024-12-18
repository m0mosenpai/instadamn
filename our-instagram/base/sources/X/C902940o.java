package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.40o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C902940o extends C0T6 implements C3ZO {
    public final int A00;
    public final int A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C902940o) {
                C902940o c902940o = (C902940o) obj;
                if (!C14360o3.A0K(this.A02, c902940o.A02) || this.A01 != c902940o.A01 || this.A00 != c902940o.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01) * 31 * 31) + this.A00;
    }

    @Override // X.C3ZO
    public final void CgR(InterfaceC16660sJ interfaceC16660sJ) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            interfaceC16660sJ.invoke(it.next());
        }
    }

    public C902940o(List list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }
}
