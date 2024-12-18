package X;

import java.util.List;

/* renamed from: X.Mt3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51726Mt3 extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C51726Mt3(List list, List list2, List list3) {
        this((String) null, list, list2, list3, false, false, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51726Mt3) {
                    C51726Mt3 c51726Mt3 = (C51726Mt3) obj;
                    if (c51726Mt3.A00 != 1 || this.A06 != c51726Mt3.A06 || !C14360o3.A0K(this.A03, c51726Mt3.A03) || !C14360o3.A0K(this.A01, c51726Mt3.A01) || !C14360o3.A0K(this.A02, c51726Mt3.A02) || this.A05 != c51726Mt3.A05 || !C14360o3.A0K(this.A04, c51726Mt3.A04) || this.A08 != c51726Mt3.A08 || this.A07 != c51726Mt3.A07 || this.A0A != c51726Mt3.A0A || this.A09 != c51726Mt3.A09) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C51726Mt3)) {
                return false;
            }
            C51726Mt3 c51726Mt32 = (C51726Mt3) obj;
            if (c51726Mt32.A00 != 0 || !C14360o3.A0K(this.A03, c51726Mt32.A03) || !C14360o3.A0K(this.A02, c51726Mt32.A02) || this.A05 != c51726Mt32.A05 || !C14360o3.A0K(this.A04, c51726Mt32.A04) || this.A06 != c51726Mt32.A06 || this.A09 != c51726Mt32.A09 || this.A08 != c51726Mt32.A08 || this.A07 != c51726Mt32.A07 || this.A0A != c51726Mt32.A0A || !C14360o3.A0K(this.A01, c51726Mt32.A01)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, (AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC25225BEi.A08(this.A06))))) + AbstractC167017dG.A0O(this.A04)) * 31))));
        }
        return AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03))) + AbstractC167017dG.A0O(this.A04)) * 31))))) + AbstractC166997dE.A0I(this.A01);
    }

    public C51726Mt3(String str, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A06 = z;
        this.A03 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A05 = z2;
        this.A04 = str;
        this.A08 = z3;
        this.A07 = z4;
        this.A0A = z5;
        this.A09 = z6;
    }

    public C51726Mt3(Long l, String str, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167017dG.A1P(list, list2);
        this.A03 = list;
        this.A02 = list2;
        this.A05 = z;
        this.A04 = str;
        this.A06 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A07 = z5;
        this.A0A = z6;
        this.A01 = l;
    }
}
