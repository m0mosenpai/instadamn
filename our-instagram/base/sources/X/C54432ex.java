package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54432ex extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC54232eZ A03;
    public final List A04;
    public final InterfaceC09390do A05;

    public C54432ex(InterfaceC54232eZ interfaceC54232eZ, List list, int i, int i2) {
        int i3;
        Object next;
        C14360o3.A0B(interfaceC54232eZ, 1);
        this.A03 = interfaceC54232eZ;
        this.A01 = i;
        this.A04 = list;
        this.A02 = i2;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C54432ex c54432ex = (C54432ex) it.next();
                arrayList.add(Integer.valueOf(c54432ex.A01 + c54432ex.A00));
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                while (it2.hasNext()) {
                    next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
                }
            }
            Number number = (Number) next;
            if (number != null) {
                i3 = number.intValue();
                this.A00 = i3;
                this.A05 = AbstractC09440dt.A01(new C206919Dw(this, 6));
            }
        }
        i3 = 0;
        this.A00 = i3;
        this.A05 = AbstractC09440dt.A01(new C206919Dw(this, 6));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54432ex) {
                C54432ex c54432ex = (C54432ex) obj;
                if (!C14360o3.A0K(this.A03, c54432ex.A03) || this.A01 != c54432ex.A01 || !C14360o3.A0K(this.A04, c54432ex.A04) || this.A02 != c54432ex.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i;
        int i2 = this.A02;
        List list = this.A04;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C54432ex) it.next()).A02));
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
                }
                i = ((Number) next).intValue();
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Badge(useCase=");
        sb.append(this.A03);
        sb.append(AbstractC111324zv.A00(1405));
        sb.append(this.A01);
        sb.append(", childCount=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C54432ex(InterfaceC54232eZ interfaceC54232eZ, int i) {
        this(interfaceC54232eZ, null, i, i);
    }
}
