package X;

import java.util.List;

/* renamed from: X.ACk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23010ACk {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23010ACk)) {
            return false;
        }
        C23010ACk c23010ACk = (C23010ACk) obj;
        if (!C14360o3.A0K(this.A02, c23010ACk.A02) || !C14360o3.A0K(this.A00, c23010ACk.A00) || !C14360o3.A0K(this.A01, c23010ACk.A01) || !C14360o3.A0K(this.A03, c23010ACk.A03)) {
            return false;
        }
        return C14360o3.A0K(this.A04, c23010ACk.A04);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)))));
    }

    public C23010ACk(String str, String str2, String str3, List list, List list2) {
        AbstractC167017dG.A1S(list, list2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list;
        this.A04 = list2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ForeignKey{referenceTable='");
        A1C.append(this.A02);
        A1C.append("', onDelete='");
        A1C.append(this.A00);
        A1C.append(" +', onUpdate='");
        A1C.append(this.A01);
        A1C.append("', columnNames=");
        A1C.append(this.A03);
        A1C.append(", referenceColumnNames=");
        A1C.append(this.A04);
        return AbstractC167027dH.A0R(A1C);
    }
}
