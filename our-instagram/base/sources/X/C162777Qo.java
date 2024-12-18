package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162777Qo extends C0T6 implements InterfaceC162787Qp {
    public final int A00;
    public final Drawable A01;
    public final C9C0 A02;
    public final C9C0 A03;
    public final UserSession A04;
    public final K2X A05;
    public final C7BZ A06;
    public final C7BU A07;
    public final C45272K2a A08;
    public final C76C A09;
    public final C45010Jw0 A0A;
    public final C7BS A0B;
    public final C7BR A0C;
    public final C158897Bb A0D;
    public final C76K A0E;
    public final C7BT A0F;
    public final C7T7 A0G;
    public final C7BV A0H;
    public final C162717Qi A0I;
    public final K2W A0J;
    public final K2Z A0K;
    public final KTB A0L;
    public final C7BW A0M;
    public final C7BQ A0N;
    public final AnonymousClass794 A0O;
    public final C7DA A0P;
    public final C162727Qj A0Q;
    public final String A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final int A0W;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162777Qo) {
                C162777Qo c162777Qo = (C162777Qo) obj;
                if (!C14360o3.A0K(this.A04, c162777Qo.A04) || this.A0T != c162777Qo.A0T || this.A0V != c162777Qo.A0V || this.A0U != c162777Qo.A0U || !C14360o3.A0K(this.A01, c162777Qo.A01) || !C14360o3.A0K(this.A0G, c162777Qo.A0G) || !C14360o3.A0K(this.A0I, c162777Qo.A0I) || !C14360o3.A0K(this.A0E, c162777Qo.A0E) || !C14360o3.A0K(this.A0P, c162777Qo.A0P) || !C14360o3.A0K(this.A0O, c162777Qo.A0O) || !C14360o3.A0K(this.A0Q, c162777Qo.A0Q) || !C14360o3.A0K(this.A0N, c162777Qo.A0N) || !C14360o3.A0K(this.A0C, c162777Qo.A0C) || !C14360o3.A0K(this.A0D, c162777Qo.A0D) || !C14360o3.A0K(this.A07, c162777Qo.A07) || !C14360o3.A0K(this.A03, c162777Qo.A03) || !C14360o3.A0K(this.A09, c162777Qo.A09) || !C14360o3.A0K(this.A0F, c162777Qo.A0F) || !C14360o3.A0K(this.A0J, c162777Qo.A0J) || !C14360o3.A0K(this.A0L, c162777Qo.A0L) || !C14360o3.A0K(this.A0B, c162777Qo.A0B) || !C14360o3.A0K(this.A02, c162777Qo.A02) || !C14360o3.A0K(this.A0A, c162777Qo.A0A) || !C14360o3.A0K(this.A06, c162777Qo.A06) || !C14360o3.A0K(this.A0H, c162777Qo.A0H) || !C14360o3.A0K(this.A0K, c162777Qo.A0K) || !C14360o3.A0K(this.A08, c162777Qo.A08) || !C14360o3.A0K(this.A05, c162777Qo.A05) || this.A0W != c162777Qo.A0W || this.A00 != c162777Qo.A00 || this.A0S != c162777Qo.A0S || !C14360o3.A0K(this.A0M, c162777Qo.A0M) || !C14360o3.A0K(this.A0R, c162777Qo.A0R)) {
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
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25 = this.A04.hashCode() * 31;
        int i = 1237;
        if (this.A0T) {
            i = 1231;
        }
        int i2 = (hashCode25 + i) * 31;
        int i3 = 1237;
        if (this.A0V) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0U) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        Drawable drawable = this.A01;
        int i7 = 0;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i8 = (i6 + hashCode) * 31;
        C7T7 c7t7 = this.A0G;
        if (c7t7 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c7t7.hashCode();
        }
        int hashCode26 = (((i8 + hashCode2) * 31) + this.A0I.hashCode()) * 31;
        C76K c76k = this.A0E;
        if (c76k == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c76k.hashCode();
        }
        int i9 = (hashCode26 + hashCode3) * 31;
        C7DA c7da = this.A0P;
        if (c7da == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c7da.hashCode();
        }
        int i10 = (i9 + hashCode4) * 31;
        AnonymousClass794 anonymousClass794 = this.A0O;
        if (anonymousClass794 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = anonymousClass794.hashCode();
        }
        int i11 = (i10 + hashCode5) * 31;
        C162727Qj c162727Qj = this.A0Q;
        if (c162727Qj == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c162727Qj.hashCode();
        }
        int i12 = (i11 + hashCode6) * 31;
        C7BQ c7bq = this.A0N;
        if (c7bq == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c7bq.hashCode();
        }
        int i13 = (i12 + hashCode7) * 31;
        C7BR c7br = this.A0C;
        if (c7br == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c7br.hashCode();
        }
        int i14 = (i13 + hashCode8) * 31;
        C158897Bb c158897Bb = this.A0D;
        if (c158897Bb == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = c158897Bb.hashCode();
        }
        int i15 = (i14 + hashCode9) * 31;
        C7BU c7bu = this.A07;
        if (c7bu == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c7bu.hashCode();
        }
        int i16 = (i15 + hashCode10) * 31;
        C9C0 c9c0 = this.A03;
        if (c9c0 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = c9c0.hashCode();
        }
        int i17 = (i16 + hashCode11) * 31;
        C76C c76c = this.A09;
        if (c76c == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = c76c.hashCode();
        }
        int i18 = (i17 + hashCode12) * 31;
        C7BT c7bt = this.A0F;
        if (c7bt == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = c7bt.hashCode();
        }
        int i19 = (i18 + hashCode13) * 31;
        K2W k2w = this.A0J;
        if (k2w == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = k2w.hashCode();
        }
        int i20 = (i19 + hashCode14) * 31;
        KTB ktb = this.A0L;
        if (ktb == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = ktb.hashCode();
        }
        int i21 = (i20 + hashCode15) * 31;
        C7BS c7bs = this.A0B;
        if (c7bs == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = c7bs.hashCode();
        }
        int i22 = (i21 + hashCode16) * 31;
        C9C0 c9c02 = this.A02;
        if (c9c02 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = c9c02.hashCode();
        }
        int i23 = (i22 + hashCode17) * 31;
        C45010Jw0 c45010Jw0 = this.A0A;
        if (c45010Jw0 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = c45010Jw0.hashCode();
        }
        int i24 = (i23 + hashCode18) * 31;
        C7BZ c7bz = this.A06;
        if (c7bz == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = c7bz.hashCode();
        }
        int i25 = (i24 + hashCode19) * 31;
        C7BV c7bv = this.A0H;
        if (c7bv == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = c7bv.hashCode();
        }
        int i26 = (i25 + hashCode20) * 31;
        K2Z k2z = this.A0K;
        if (k2z == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = k2z.hashCode();
        }
        int i27 = (i26 + hashCode21) * 31;
        C45272K2a c45272K2a = this.A08;
        if (c45272K2a == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = c45272K2a.hashCode();
        }
        int i28 = (i27 + hashCode22) * 31;
        K2X k2x = this.A05;
        if (k2x == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = k2x.hashCode();
        }
        int i29 = (((((i28 + hashCode23) * 31) + this.A0W) * 31) + this.A00) * 31;
        int i30 = 1237;
        if (this.A0S) {
            i30 = 1231;
        }
        int i31 = (i29 + i30) * 31;
        C7BW c7bw = this.A0M;
        if (c7bw == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = c7bw.hashCode();
        }
        int i32 = (i31 + hashCode24) * 31;
        String str = this.A0R;
        if (str != null) {
            i7 = str.hashCode();
        }
        return i32 + i7;
    }

    public C162777Qo(Drawable drawable, C9C0 c9c0, C9C0 c9c02, UserSession userSession, K2X k2x, C7BZ c7bz, C7BU c7bu, C45272K2a c45272K2a, C76C c76c, C45010Jw0 c45010Jw0, C7BS c7bs, C7BR c7br, C158897Bb c158897Bb, C76K c76k, C7BT c7bt, C7T7 c7t7, C7BV c7bv, C162717Qi c162717Qi, K2W k2w, K2Z k2z, KTB ktb, C7BW c7bw, C7BQ c7bq, AnonymousClass794 anonymousClass794, C7DA c7da, C162727Qj c162727Qj, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = userSession;
        this.A0T = z;
        this.A0V = z2;
        this.A0U = z3;
        this.A01 = drawable;
        this.A0G = c7t7;
        this.A0I = c162717Qi;
        this.A0E = c76k;
        this.A0P = c7da;
        this.A0O = anonymousClass794;
        this.A0Q = c162727Qj;
        this.A0N = c7bq;
        this.A0C = c7br;
        this.A0D = c158897Bb;
        this.A07 = c7bu;
        this.A03 = c9c0;
        this.A09 = c76c;
        this.A0F = c7bt;
        this.A0J = k2w;
        this.A0L = ktb;
        this.A0B = c7bs;
        this.A02 = c9c02;
        this.A0A = c45010Jw0;
        this.A06 = c7bz;
        this.A0H = c7bv;
        this.A0K = k2z;
        this.A08 = c45272K2a;
        this.A05 = k2x;
        this.A0W = i;
        this.A00 = i2;
        this.A0S = z4;
        this.A0M = c7bw;
        this.A0R = str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
