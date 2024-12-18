package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.84B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84B extends C0T6 {
    public int A00;
    public final List A01;
    public final List A02;
    public final boolean A03;

    public C84B(List list, boolean z) {
        C14360o3.A0B(list, 1);
        this.A02 = list;
        this.A03 = z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC115495Kj interfaceC115495Kj = (InterfaceC115495Kj) it.next();
            arrayList.add(new C9BO(interfaceC115495Kj, i));
            i += interfaceC115495Kj.BsL();
        }
        this.A00 = i;
        this.A01 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84B) {
                C84B c84b = (C84B) obj;
                if (!C14360o3.A0K(this.A02, c84b.A02) || this.A03 != c84b.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int A00(int i) {
        List list = this.A01;
        if (list.size() > i && i >= 0) {
            return ((InterfaceC115495Kj) ((C9BO) list.get(i)).A01).BsL();
        }
        return 0;
    }

    public final int A01(int i) {
        List list = this.A01;
        if (list.size() > i && i >= 0) {
            return ((C9BO) list.get(i)).A00;
        }
        return 0;
    }

    public final int A02(long j) {
        List list = this.A01;
        int size = list.size() - 1;
        if (A04(size) != null) {
            C9BO c9bo = (C9BO) list.get(size);
            if (j < c9bo.A00 + ((InterfaceC115495Kj) c9bo.A01).BsL()) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    C9BO c9bo2 = (C9BO) list.get(i);
                    int i2 = c9bo2.A00;
                    int BsL = ((InterfaceC115495Kj) c9bo2.A01).BsL() + i2;
                    if (i2 <= j && j < BsL) {
                        return i;
                    }
                }
            } else {
                return size;
            }
        }
        return -1;
    }

    public final InterfaceC115495Kj A03(int i) {
        return (InterfaceC115495Kj) ((C9BO) this.A01.get(i)).A01;
    }

    public final InterfaceC115495Kj A04(int i) {
        if (i >= 0 && i < this.A01.size()) {
            return A03(i);
        }
        return null;
    }

    public final ArrayList A05() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9BO) it.next()).A01);
        }
        return arrayList;
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }
}
