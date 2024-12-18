package X;

import java.util.List;

/* renamed from: X.Msa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51705Msa extends C0T6 {
    public final int A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51705Msa) {
                C51705Msa c51705Msa = (C51705Msa) obj;
                if (!C14360o3.A0K(this.A01, c51705Msa.A01) || this.A02 != c51705Msa.A02 || this.A09 != c51705Msa.A09 || this.A04 != c51705Msa.A04 || this.A08 != c51705Msa.A08 || this.A03 != c51705Msa.A03 || this.A0A != c51705Msa.A0A || this.A05 != c51705Msa.A05 || this.A0B != c51705Msa.A0B || this.A07 != c51705Msa.A07 || this.A06 != c51705Msa.A06 || this.A00 != c51705Msa.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A01))))))))))) + this.A00;
    }

    public C51705Msa(List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A01 = list;
        this.A02 = z;
        this.A09 = z2;
        this.A04 = z3;
        this.A08 = z4;
        this.A03 = z5;
        this.A0A = z6;
        this.A05 = z7;
        this.A0B = z8;
        this.A07 = z9;
        this.A06 = z10;
        this.A00 = i;
    }

    public C51705Msa() {
        this(C16930sl.A00, 0, false, false, true, false, false, false, false, false, false, false);
    }
}
