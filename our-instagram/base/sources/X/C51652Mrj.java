package X;

import java.util.List;

/* renamed from: X.Mrj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51652Mrj extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final EnumC109104va A03;
    public final C69167Viw A04;
    public final OB7 A05;
    public final O90 A06;
    public final String A07;
    public final List A08;
    public final java.util.Set A09;
    public final java.util.Set A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51652Mrj) {
                C51652Mrj c51652Mrj = (C51652Mrj) obj;
                if (this.A02 != c51652Mrj.A02 || !C14360o3.A0K(this.A08, c51652Mrj.A08) || this.A01 != c51652Mrj.A01 || this.A0E != c51652Mrj.A0E || !C14360o3.A0K(this.A07, c51652Mrj.A07) || this.A0B != c51652Mrj.A0B || this.A0J != c51652Mrj.A0J || this.A0G != c51652Mrj.A0G || this.A0F != c51652Mrj.A0F || this.A03 != c51652Mrj.A03 || !C14360o3.A0K(this.A09, c51652Mrj.A09) || !C14360o3.A0K(this.A0A, c51652Mrj.A0A) || this.A00 != c51652Mrj.A00 || this.A0D != c51652Mrj.A0D || this.A0C != c51652Mrj.A0C || !C14360o3.A0K(this.A06, c51652Mrj.A06) || !C14360o3.A0K(this.A05, c51652Mrj.A05) || !C14360o3.A0K(this.A04, c51652Mrj.A04) || this.A0H != c51652Mrj.A0H || this.A0I != c51652Mrj.A0I) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0I, AbstractC167007dF.A0D(this.A0H, (((((AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0D, (AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A09, (AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A0E, (AbstractC166997dE.A0J(this.A08, this.A02 * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A07)) * 31)))) + AbstractC167017dG.A0M(this.A03)) * 31)) + this.A00) * 31)) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31));
    }

    public C51652Mrj(EnumC109104va enumC109104va, C69167Viw c69167Viw, OB7 ob7, O90 o90, String str, List list, java.util.Set set, java.util.Set set2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A02 = i;
        this.A08 = list;
        this.A01 = i2;
        this.A0E = z;
        this.A07 = str;
        this.A0B = z2;
        this.A0J = z3;
        this.A0G = z4;
        this.A0F = z5;
        this.A03 = enumC109104va;
        this.A09 = set;
        this.A0A = set2;
        this.A00 = i3;
        this.A0D = z6;
        this.A0C = z7;
        this.A06 = o90;
        this.A05 = ob7;
        this.A04 = c69167Viw;
        this.A0H = z8;
        this.A0I = z9;
    }
}
