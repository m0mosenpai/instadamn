package X;

import java.util.List;

/* renamed from: X.NJf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52461NJf extends AbstractC53465Nks {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C52461NJf() {
        this(null, null, -1, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52461NJf) {
                C52461NJf c52461NJf = (C52461NJf) obj;
                if (!C14360o3.A0K(this.A01, c52461NJf.A01) || !C14360o3.A0K(this.A02, c52461NJf.A02) || this.A03 != c52461NJf.A03 || this.A00 != c52461NJf.A00 || this.A04 != c52461NJf.A04 || this.A05 != c52461NJf.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A04, (AbstractC167007dF.A0D(this.A03, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A00) * 31));
    }

    public C52461NJf(String str, List list, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A02 = list;
        this.A03 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A05 = z3;
    }
}
