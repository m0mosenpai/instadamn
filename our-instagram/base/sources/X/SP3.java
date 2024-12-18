package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class SP3 {
    public List A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SP3) {
            SP3 sp3 = (SP3) obj;
            if (this.A03 == sp3.A03 && C14360o3.A0K(this.A02, sp3.A02) && C14360o3.A0K(this.A00, sp3.A00)) {
                String str = this.A01;
                boolean A0h = AbstractC002300n.A0h(str, "index_", false);
                String str2 = sp3.A01;
                if (A0h) {
                    return AbstractC002300n.A0h(str2, "index_", false);
                }
                return C14360o3.A0K(str, str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        if (AbstractC002300n.A0h(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A02, ((hashCode * 31) + (this.A03 ? 1 : 0)) * 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public SP3(String str, List list, List list2, boolean z) {
        AbstractC37302Gc3.A1U(list, list2);
        this.A01 = str;
        this.A03 = z;
        this.A02 = list;
        this.A00 = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = AbstractC25225BEi.A17(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.A00 = list2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Index{name='");
        A1C.append(this.A01);
        A1C.append("', unique=");
        A1C.append(this.A03);
        A1C.append(", columns=");
        A1C.append(this.A02);
        A1C.append(", orders=");
        A1C.append(this.A00);
        return AbstractC166997dE.A0x("'}", A1C);
    }
}
