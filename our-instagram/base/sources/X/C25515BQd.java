package X;

import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.BQd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25515BQd extends C0T6 implements InterfaceC31047Dkl, InterfaceC30874Dhn {
    public final double A00;
    public final double A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final C120985dq A05;
    public final C38321qM A06;
    public final SearchContext A07;
    public final Boolean A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final C25377BKu A0P;
    public final C37644Ghd A0Q;

    public C25515BQd(C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, SearchContext searchContext, Boolean bool, String str, double d, double d2, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C14360o3.A0B(searchContext, 5);
        this.A05 = c120985dq;
        this.A0Q = c37644Ghd;
        this.A0P = c25377BKu;
        this.A06 = c38321qM;
        this.A07 = searchContext;
        this.A09 = str;
        this.A02 = f;
        this.A04 = i;
        this.A03 = i2;
        this.A01 = d;
        this.A00 = d2;
        this.A0F = z;
        this.A0E = z2;
        this.A08 = bool;
        this.A0B = z3;
        this.A0C = z4;
        this.A0J = z5;
        this.A0M = z6;
        this.A0G = z7;
        this.A0A = z8;
        this.A0N = z9;
        this.A0D = z10;
        this.A0K = z11;
        this.A0L = z12;
        this.A0O = z13;
        this.A0I = z14;
        this.A0H = z15;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25515BQd) {
                C25515BQd c25515BQd = (C25515BQd) obj;
                if (!C14360o3.A0K(this.A05, c25515BQd.A05) || !C14360o3.A0K(this.A0Q, c25515BQd.A0Q) || !C14360o3.A0K(this.A0P, c25515BQd.A0P) || !C14360o3.A0K(this.A06, c25515BQd.A06) || !C14360o3.A0K(this.A07, c25515BQd.A07) || !C14360o3.A0K(this.A09, c25515BQd.A09) || Float.compare(this.A02, c25515BQd.A02) != 0 || this.A04 != c25515BQd.A04 || this.A03 != c25515BQd.A03 || Double.compare(this.A01, c25515BQd.A01) != 0 || Double.compare(this.A00, c25515BQd.A00) != 0 || this.A0F != c25515BQd.A0F || this.A0E != c25515BQd.A0E || !C14360o3.A0K(this.A08, c25515BQd.A08) || this.A0B != c25515BQd.A0B || this.A0C != c25515BQd.A0C || this.A0J != c25515BQd.A0J || this.A0M != c25515BQd.A0M || this.A0G != c25515BQd.A0G || this.A0A != c25515BQd.A0A || this.A0N != c25515BQd.A0N || this.A0D != c25515BQd.A0D || this.A0K != c25515BQd.A0K || this.A0L != c25515BQd.A0L || this.A0O != c25515BQd.A0O || this.A0I != c25515BQd.A0I || this.A0H != c25515BQd.A0H) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0H, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0O, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0M, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0F, AbstractC28006CWd.A01(this.A00, AbstractC28006CWd.A01(this.A01, (((AbstractC166997dE.A00((AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A0P, AbstractC166997dE.A0J(this.A0Q, AbstractC166987dD.A0G(this.A05))))) + AbstractC167017dG.A0O(this.A09)) * 31, this.A02) + this.A04) * 31) + this.A03) * 31)))) + AbstractC166997dE.A0I(this.A08)) * 31)))))))))))));
    }

    @Override // X.InterfaceC31047Dkl
    public final C120985dq BMy() {
        return this.A05;
    }

    @Override // X.InterfaceC31047Dkl
    public final C25377BKu BMz() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31047Dkl
    public final C37644Ghd BN0() {
        throw C00O.createAndThrow();
    }
}
