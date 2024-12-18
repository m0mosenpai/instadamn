package X;

import java.util.List;

/* renamed from: X.Mqt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51601Mqt extends C0T6 {
    public final int A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51601Mqt) {
                C51601Mqt c51601Mqt = (C51601Mqt) obj;
                if (!C14360o3.A0K(this.A02, c51601Mqt.A02) || !C14360o3.A0K(this.A01, c51601Mqt.A01) || this.A00 != c51601Mqt.A00 || !C14360o3.A0K(this.A03, c51601Mqt.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0O(this.A01)) * 31) + this.A00) * 31);
    }

    public C51601Mqt(String str, List list, List list2, int i) {
        MSZ.A1O(list, list2);
        this.A02 = list;
        this.A01 = str;
        this.A00 = i;
        this.A03 = list2;
    }
}
