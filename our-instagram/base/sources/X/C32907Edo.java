package X;

import java.util.List;

/* renamed from: X.Edo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32907Edo extends AbstractC33548EsM {
    public C5QE A00;
    public final C51761Mtk A01;
    public final C26085BgE A02;
    public final C51749MtY A03;
    public final C5QE A04;
    public final InterfaceC37098GWi A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final Integer A0P;

    public C32907Edo(C51761Mtk c51761Mtk, C26085BgE c26085BgE, C51749MtY c51749MtY, C5QE c5qe, C5QE c5qe2, InterfaceC37098GWi interfaceC37098GWi, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, List list5, List list6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AbstractC167007dF.A1F(str, 1, list2);
        C14360o3.A0B(list3, 8);
        C14360o3.A0B(interfaceC37098GWi, 14);
        C14360o3.A0B(list5, 15);
        C14360o3.A0B(num2, 19);
        this.A0A = str;
        this.A07 = str2;
        this.A0C = list;
        this.A0F = list2;
        this.A08 = str3;
        this.A0B = str4;
        this.A0P = num;
        this.A0D = list3;
        this.A0G = list4;
        this.A00 = c5qe;
        this.A01 = c51761Mtk;
        this.A02 = c26085BgE;
        this.A03 = c51749MtY;
        this.A05 = interfaceC37098GWi;
        this.A0E = list5;
        this.A0L = z;
        this.A0N = z2;
        this.A0I = z3;
        this.A06 = num2;
        this.A0K = z4;
        this.A0O = z5;
        this.A0H = list6;
        this.A0J = z6;
        this.A09 = str5;
        this.A04 = c5qe2;
        this.A0M = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32907Edo) {
                C32907Edo c32907Edo = (C32907Edo) obj;
                if (!C14360o3.A0K(this.A0A, c32907Edo.A0A) || !C14360o3.A0K(this.A07, c32907Edo.A07) || !C14360o3.A0K(this.A0C, c32907Edo.A0C) || !C14360o3.A0K(this.A0F, c32907Edo.A0F) || !C14360o3.A0K(this.A08, c32907Edo.A08) || !C14360o3.A0K(this.A0B, c32907Edo.A0B) || !C14360o3.A0K(this.A0P, c32907Edo.A0P) || !C14360o3.A0K(this.A0D, c32907Edo.A0D) || !C14360o3.A0K(this.A0G, c32907Edo.A0G) || !C14360o3.A0K(this.A00, c32907Edo.A00) || !C14360o3.A0K(this.A01, c32907Edo.A01) || !C14360o3.A0K(this.A02, c32907Edo.A02) || !C14360o3.A0K(this.A03, c32907Edo.A03) || !C14360o3.A0K(this.A05, c32907Edo.A05) || !C14360o3.A0K(this.A0E, c32907Edo.A0E) || this.A0L != c32907Edo.A0L || this.A0N != c32907Edo.A0N || this.A0I != c32907Edo.A0I || this.A06 != c32907Edo.A06 || this.A0K != c32907Edo.A0K || this.A0O != c32907Edo.A0O || !C14360o3.A0K(this.A0H, c32907Edo.A0H) || this.A0J != c32907Edo.A0J || !C14360o3.A0K(this.A09, c32907Edo.A09) || !C14360o3.A0K(this.A04, c32907Edo.A04) || this.A0M != c32907Edo.A0M) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0L, AbstractC166997dE.A0J(this.A0E, AbstractC166997dE.A0J(this.A05, (AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A0G, AbstractC166997dE.A0J(this.A0D, (((((AbstractC166997dE.A0J(this.A0F, AbstractC166997dE.A0J(this.A0C, AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A0A)))) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0P)) * 31))))) + AbstractC167017dG.A0M(this.A03)) * 31)))));
        int intValue = this.A06.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "WITH_DESCRIPTIONS";
        }
        return AbstractC166987dD.A0K(this.A0M, (((AbstractC167007dF.A0D(this.A0J, AbstractC166997dE.A0J(this.A0H, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0K, AbstractC25231BEo.A0H(str, intValue, A0D))))) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31);
    }
}
