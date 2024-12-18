package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.79t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1585879t extends C0T6 implements InterfaceC162787Qp {
    public final int A00;
    public final C9C0 A01;
    public final C9C0 A02;
    public final UserSession A03;
    public final C7BZ A04;
    public final C7BU A05;
    public final C1585779s A06;
    public final C1585679r A07;
    public final C7BS A08;
    public final C7BR A09;
    public final C158897Bb A0A;
    public final C7BT A0B;
    public final C7T7 A0C;
    public final C7BV A0D;
    public final C162717Qi A0E;
    public final C7BW A0F;
    public final C7BQ A0G;
    public final AnonymousClass794 A0H;
    public final C7DA A0I;
    public final C162727Qj A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M = true;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public C1585879t(C9C0 c9c0, C9C0 c9c02, UserSession userSession, C7BZ c7bz, C7BU c7bu, C1585779s c1585779s, C1585679r c1585679r, C7BS c7bs, C7BR c7br, C158897Bb c158897Bb, C7BT c7bt, C7T7 c7t7, C7BV c7bv, C162717Qi c162717Qi, C7BW c7bw, C7BQ c7bq, AnonymousClass794 anonymousClass794, C7DA c7da, C162727Qj c162727Qj, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = userSession;
        this.A07 = c1585679r;
        this.A0L = str;
        this.A0Q = z;
        this.A0P = z2;
        this.A0N = z3;
        this.A0C = c7t7;
        this.A0E = c162717Qi;
        this.A0H = anonymousClass794;
        this.A0I = c7da;
        this.A0J = c162727Qj;
        this.A0G = c7bq;
        this.A09 = c7br;
        this.A08 = c7bs;
        this.A0B = c7bt;
        this.A01 = c9c0;
        this.A0A = c158897Bb;
        this.A05 = c7bu;
        this.A02 = c9c02;
        this.A04 = c7bz;
        this.A0D = c7bv;
        this.A06 = c1585779s;
        this.A00 = i;
        this.A0F = c7bw;
        this.A0K = str2;
        this.A0O = z4;
        this.A0R = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1585879t) {
                C1585879t c1585879t = (C1585879t) obj;
                if (!C14360o3.A0K(this.A03, c1585879t.A03) || !C14360o3.A0K(this.A07, c1585879t.A07) || !C14360o3.A0K(this.A0L, c1585879t.A0L) || this.A0Q != c1585879t.A0Q || this.A0P != c1585879t.A0P || this.A0N != c1585879t.A0N || this.A0M != c1585879t.A0M || !C14360o3.A0K(this.A0C, c1585879t.A0C) || !C14360o3.A0K(this.A0E, c1585879t.A0E) || !C14360o3.A0K(this.A0H, c1585879t.A0H) || !C14360o3.A0K(this.A0I, c1585879t.A0I) || !C14360o3.A0K(this.A0J, c1585879t.A0J) || !C14360o3.A0K(this.A0G, c1585879t.A0G) || !C14360o3.A0K(this.A09, c1585879t.A09) || !C14360o3.A0K(this.A08, c1585879t.A08) || !C14360o3.A0K(this.A0B, c1585879t.A0B) || !C14360o3.A0K(this.A01, c1585879t.A01) || !C14360o3.A0K(this.A0A, c1585879t.A0A) || !C14360o3.A0K(this.A05, c1585879t.A05) || !C14360o3.A0K(this.A02, c1585879t.A02) || !C14360o3.A0K(this.A04, c1585879t.A04) || !C14360o3.A0K(this.A0D, c1585879t.A0D) || !C14360o3.A0K(this.A06, c1585879t.A06) || this.A00 != c1585879t.A00 || !C14360o3.A0K(this.A0F, c1585879t.A0F) || !C14360o3.A0K(this.A0K, c1585879t.A0K) || this.A0O != c1585879t.A0O || this.A0R != c1585879t.A0R) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16 = ((((this.A03.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A0L.hashCode()) * 31;
        int i = 1237;
        if (this.A0Q) {
            i = 1231;
        }
        int i2 = (hashCode16 + i) * 31;
        int i3 = 1237;
        if (this.A0P) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0N) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0M) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        C7T7 c7t7 = this.A0C;
        int i9 = 0;
        if (c7t7 == null) {
            hashCode = 0;
        } else {
            hashCode = c7t7.hashCode();
        }
        int hashCode17 = (((i8 + hashCode) * 31) + this.A0E.hashCode()) * 31;
        AnonymousClass794 anonymousClass794 = this.A0H;
        if (anonymousClass794 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = anonymousClass794.hashCode();
        }
        int i10 = (hashCode17 + hashCode2) * 31;
        C7DA c7da = this.A0I;
        if (c7da == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c7da.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        C162727Qj c162727Qj = this.A0J;
        if (c162727Qj == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c162727Qj.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        C7BQ c7bq = this.A0G;
        if (c7bq == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c7bq.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        C7BR c7br = this.A09;
        if (c7br == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c7br.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        C7BS c7bs = this.A08;
        if (c7bs == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c7bs.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        C7BT c7bt = this.A0B;
        if (c7bt == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c7bt.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        C9C0 c9c0 = this.A01;
        if (c9c0 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = c9c0.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        C158897Bb c158897Bb = this.A0A;
        if (c158897Bb == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c158897Bb.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        C7BU c7bu = this.A05;
        if (c7bu == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = c7bu.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        C9C0 c9c02 = this.A02;
        if (c9c02 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = c9c02.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        C7BZ c7bz = this.A04;
        if (c7bz == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = c7bz.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        C7BV c7bv = this.A0D;
        if (c7bv == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = c7bv.hashCode();
        }
        int hashCode18 = (((((i21 + hashCode14) * 31) + this.A06.hashCode()) * 31) + this.A00) * 31;
        C7BW c7bw = this.A0F;
        if (c7bw == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = c7bw.hashCode();
        }
        int i22 = (hashCode18 + hashCode15) * 31;
        String str = this.A0K;
        if (str != null) {
            i9 = str.hashCode();
        }
        int A00 = (((i22 + i9) * 31) + AbstractC53644Nnp.A00()) * 31;
        int i23 = 1237;
        if (this.A0O) {
            i23 = 1231;
        }
        int i24 = (A00 + i23) * 31;
        int i25 = 1237;
        if (this.A0R) {
            i25 = 1231;
        }
        return i24 + i25;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
