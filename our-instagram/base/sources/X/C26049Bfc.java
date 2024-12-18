package X;

import java.util.List;

/* renamed from: X.Bfc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26049Bfc extends C0T6 {
    public final C26069Bfx A00;
    public final InterfaceC30794DgV A01;
    public final InterfaceC30795DgW A02;
    public final InterfaceC30796DgX A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final Boolean A0K;
    public final String A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26049Bfc) {
                C26049Bfc c26049Bfc = (C26049Bfc) obj;
                if (!C14360o3.A0K(this.A07, c26049Bfc.A07) || !C14360o3.A0K(this.A01, c26049Bfc.A01) || !C14360o3.A0K(this.A03, c26049Bfc.A03) || !C14360o3.A0K(this.A02, c26049Bfc.A02) || !C14360o3.A0K(this.A0L, c26049Bfc.A0L) || this.A0H != c26049Bfc.A0H || this.A0F != c26049Bfc.A0F || this.A0C != c26049Bfc.A0C || !C14360o3.A0K(this.A05, c26049Bfc.A05) || this.A0E != c26049Bfc.A0E || !C14360o3.A0K(this.A08, c26049Bfc.A08) || !C14360o3.A0K(this.A0A, c26049Bfc.A0A) || !C14360o3.A0K(this.A04, c26049Bfc.A04) || this.A0D != c26049Bfc.A0D || !C14360o3.A0K(this.A06, c26049Bfc.A06) || !C14360o3.A0K(this.A0K, c26049Bfc.A0K) || this.A0I != c26049Bfc.A0I || this.A0G != c26049Bfc.A0G || !C14360o3.A0K(this.A00, c26049Bfc.A00) || this.A0B != c26049Bfc.A0B || this.A0J != c26049Bfc.A0J || !C14360o3.A0K(this.A09, c26049Bfc.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26049Bfc(C26069Bfx c26069Bfx, InterfaceC30794DgV interfaceC30794DgV, InterfaceC30795DgW interfaceC30795DgW, InterfaceC30796DgX interfaceC30796DgX, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AbstractC167027dH.A0a(1, str, interfaceC30794DgV, interfaceC30796DgX, interfaceC30795DgW);
        AbstractC25229BEm.A1L(str3, 11, list);
        this.A07 = str;
        this.A01 = interfaceC30794DgV;
        this.A03 = interfaceC30796DgX;
        this.A02 = interfaceC30795DgW;
        this.A0L = str2;
        this.A0H = z;
        this.A0F = z2;
        this.A0C = z3;
        this.A05 = bool;
        this.A0E = z4;
        this.A08 = str3;
        this.A0A = list;
        this.A04 = bool2;
        this.A0D = z5;
        this.A06 = bool3;
        this.A0K = bool4;
        this.A0I = z6;
        this.A0G = z7;
        this.A00 = c26069Bfx;
        this.A0B = z8;
        this.A0J = z9;
        this.A09 = "";
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A09, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0I, (((AbstractC167007dF.A0D(this.A0D, (AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0K(this.A08, AbstractC167007dF.A0D(this.A0E, (AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0H, (AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A07)))) + AbstractC167017dG.A0O(this.A0L)) * 31))) + AbstractC167017dG.A0M(this.A05)) * 31))) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0K)) * 31)) + AbstractC166997dE.A0I(this.A00)) * 31)));
    }

    public C26049Bfc() {
        this(null, C29085CsC.A00, C29087CsE.A00, C29088CsF.A00, null, null, null, null, "", null, "", C16930sl.A00, false, false, false, false, false, false, false, false, false);
    }
}
