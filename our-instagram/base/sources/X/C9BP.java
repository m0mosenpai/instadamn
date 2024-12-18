package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9BP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BP extends C0T6 implements C3ZO {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C9BP(Object obj, int i, int i2) {
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BP) && ((C9BP) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C3ZO
    public final void CgR(InterfaceC16660sJ interfaceC16660sJ) {
        if (this.A00 != 0) {
            interfaceC16660sJ.invoke(this.A03);
            return;
        }
        Iterator it = ((List) this.A03).iterator();
        while (it.hasNext()) {
            interfaceC16660sJ.invoke(it.next());
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (A00(obj, i)) {
            C9BP c9bp = (C9BP) obj;
            if (!C14360o3.A0K(this.A03, c9bp.A03) || this.A02 != c9bp.A02 || this.A01 != c9bp.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj;
        int hashCode;
        if (this.A00 != 0) {
            obj = this.A03;
            if (obj == null) {
                hashCode = 0;
                return (((hashCode * 31) + this.A02) * 31) + this.A01;
            }
        } else {
            obj = this.A03;
        }
        hashCode = obj.hashCode();
        return (((hashCode * 31) + this.A02) * 31) + this.A01;
    }

    public C9BP(List list, int i) {
        C14360o3.A0B(list, 1);
        this.A03 = list;
        this.A02 = i;
        this.A01 = 0;
    }
}
