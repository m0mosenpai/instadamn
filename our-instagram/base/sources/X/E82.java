package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E82 extends C0T6 implements InterfaceC50499MRc {
    public final int A00;
    public final long A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final Boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E82) {
                E82 e82 = (E82) obj;
                if (this.A01 != e82.A01 || !C14360o3.A0K(this.A03, e82.A03) || this.A07 != e82.A07 || !C14360o3.A0K(this.A02, e82.A02) || this.A08 != e82.A08 || !C14360o3.A0K(this.A09, e82.A09) || this.A00 != e82.A00 || !C14360o3.A0K(this.A04, e82.A04) || !C14360o3.A0K(this.A05, e82.A05) || !C14360o3.A0K(this.A06, e82.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public E82(Boolean bool, Boolean bool2, String str, String str2, List list, List list2, int i, long j, boolean z, boolean z2) {
        AbstractC167007dF.A1J(str2, 8, list);
        this.A01 = j;
        this.A03 = str;
        this.A07 = z;
        this.A02 = bool;
        this.A08 = z2;
        this.A09 = bool2;
        this.A00 = i;
        this.A04 = str2;
        this.A05 = list;
        this.A06 = list2;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A04, (((AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A07, (AbstractC25235BEs.A03(this.A01) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + this.A00) * 31)) + AbstractC166997dE.A0I(this.A06);
    }
}
