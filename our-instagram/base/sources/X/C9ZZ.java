package X;

import java.util.List;

/* renamed from: X.9ZZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZZ extends C0T6 {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final List A05;
    public final List A06;

    public C9ZZ(String str, String str2, List list, List list2, List list3, List list4, boolean z) {
        C14360o3.A0B(list, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
        this.A03 = list2;
        this.A05 = list3;
        this.A06 = list4;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZZ) {
                C9ZZ c9zz = (C9ZZ) obj;
                if (!C14360o3.A0K(this.A00, c9zz.A00) || !C14360o3.A0K(this.A01, c9zz.A01) || !C14360o3.A0K(this.A02, c9zz.A02) || !C14360o3.A0K(this.A03, c9zz.A03) || !C14360o3.A0K(this.A05, c9zz.A05) || !C14360o3.A0K(this.A06, c9zz.A06) || this.A04 != c9zz.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ContentFilterDictionarySyncedPatternsModel(dictionaryKey=");
        A1C.append(this.A00);
        A1C.append(", syncedVersion=");
        A1C.append(this.A01);
        A1C.append(", blockedPatternsAdded=");
        A1C.append(this.A02);
        A1C.append(", blockedPatternsRemoved=");
        A1C.append(this.A03);
        A1C.append(", allowedPatternsAdded=");
        A1C.append(this.A05);
        A1C.append(", allowedPatternsRemoved=");
        A1C.append(this.A06);
        A1C.append(", isDiff=");
        A1C.append(this.A04);
        return AbstractC167017dG.A0p(A1C);
    }
}
