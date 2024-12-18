package X;

import java.util.List;

/* renamed from: X.Mwe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51896Mwe extends C0T6 implements InterfaceC57856PlM {
    public final String A00;
    public final List A01;
    public final List A02;
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
            if (obj instanceof C51896Mwe) {
                C51896Mwe c51896Mwe = (C51896Mwe) obj;
                if (this.A07 != c51896Mwe.A07 || !C14360o3.A0K(this.A00, c51896Mwe.A00) || !C14360o3.A0K(this.A01, c51896Mwe.A01) || !C14360o3.A0K(this.A02, c51896Mwe.A02) || this.A08 != c51896Mwe.A08 || this.A09 != c51896Mwe.A09 || this.A0B != c51896Mwe.A0B || this.A03 != c51896Mwe.A03 || this.A04 != c51896Mwe.A04 || this.A06 != c51896Mwe.A06 || this.A0A != c51896Mwe.A0A || this.A05 != c51896Mwe.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, (AbstractC25225BEi.A08(this.A07) + AbstractC167017dG.A0O(this.A00)) * 31))))))))));
    }

    public C51896Mwe(String str, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AbstractC37302Gc3.A1U(list, list2);
        this.A07 = z;
        this.A00 = str;
        this.A01 = list;
        this.A02 = list2;
        this.A08 = z2;
        this.A09 = z3;
        this.A0B = z4;
        this.A03 = z5;
        this.A04 = z6;
        this.A06 = z7;
        this.A0A = z8;
        this.A05 = z9;
    }
}
