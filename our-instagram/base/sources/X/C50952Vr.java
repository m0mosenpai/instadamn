package X;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.2Vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50952Vr implements C2VB {
    public float A01;
    public float A02;
    public float A03;
    public float A05;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public long A0F;
    public SparseArray A0G;
    public ViewOutlineProvider A0H;
    public C2V9 A0I;
    public C2V9 A0J;
    public C2V9 A0K;
    public C2V9 A0L;
    public C2V9 A0M;
    public C2V9 A0N;
    public C2V9 A0O;
    public C2V9 A0P;
    public C2V9 A0Q;
    public C2V9 A0R;
    public C2V9 A0S;
    public C2V9 A0T;
    public C2V9 A0U;
    public C2V9 A0V;
    public C2V9 A0W;
    public C2V9 A0X;
    public CV2 A0Y;
    public CharSequence A0Z;
    public CharSequence A0a;
    public Object A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public boolean A0g;
    public int A08 = -1;
    public int A06 = -16777216;
    public int A07 = -16777216;
    public boolean A0f = true;
    public float A04 = 1.0f;
    public float A00 = 1.0f;

    public final void A00(C50952Vr c50952Vr) {
        long j;
        long j2;
        long j3;
        if ((this.A0F & 8) != 0) {
            C2V9 c2v9 = this.A0I;
            c50952Vr.A0F |= 8;
            c50952Vr.A0I = c2v9;
        }
        if ((this.A0F & 16) != 0) {
            C2V9 c2v92 = this.A0M;
            c50952Vr.A0F |= 16;
            c50952Vr.A0M = c2v92;
        }
        if ((this.A0F & 131072) != 0) {
            C2V9 c2v93 = this.A0K;
            c50952Vr.A0F |= 131072;
            c50952Vr.A0K = c2v93;
        }
        if ((this.A0F & 32) != 0) {
            C2V9 c2v94 = this.A0X;
            c50952Vr.A0F |= 32;
            c50952Vr.A0X = c2v94;
        }
        if ((this.A0F & 262144) != 0) {
            C2V9 c2v95 = this.A0L;
            c50952Vr.A0F |= 262144;
            c50952Vr.A0L = c2v95;
        }
        if ((this.A0F & 4194304) != 0) {
            String str = this.A0c;
            c50952Vr.A0F |= 4194304;
            c50952Vr.A0c = str;
        }
        if ((this.A0F & 16777216) != 0) {
            CharSequence charSequence = this.A0Z;
            c50952Vr.A0F |= 16777216;
            c50952Vr.A0Z = charSequence;
        }
        if ((this.A0F & 64) != 0) {
            C2V9 c2v96 = this.A0J;
            c50952Vr.A0F |= 64;
            c50952Vr.A0J = c2v96;
        }
        if ((this.A0F & 128) != 0) {
            C2V9 c2v97 = this.A0N;
            c50952Vr.A0F |= 128;
            c50952Vr.A0N = c2v97;
        }
        if ((this.A0F & 256) != 0) {
            C2V9 c2v98 = this.A0O;
            c50952Vr.A0F |= 256;
            c50952Vr.A0O = c2v98;
        }
        if ((this.A0F & 512) != 0) {
            C2V9 c2v99 = this.A0Q;
            c50952Vr.A0F |= 512;
            c50952Vr.A0Q = c2v99;
        }
        if ((this.A0F & 536870912) != 0) {
            C2V9 c2v910 = this.A0R;
            c50952Vr.A0F |= 536870912;
            c50952Vr.A0R = c2v910;
        }
        if ((this.A0F & 2147483648L) != 0) {
            C2V9 c2v911 = this.A0T;
            c50952Vr.A0F |= 2147483648L;
            c50952Vr.A0T = c2v911;
        }
        if ((this.A0F & 4294967296L) != 0) {
            C2V9 c2v912 = this.A0P;
            c50952Vr.A0F |= 4294967296L;
            c50952Vr.A0P = c2v912;
        }
        if ((this.A0F & OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) != 0) {
            C2V9 c2v913 = this.A0S;
            c50952Vr.A0F |= OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
            c50952Vr.A0S = c2v913;
        }
        if ((this.A0F & OdexSchemeArtXdex.STATE_DEX2OAT_CLASSPATH_SET) != 0) {
            C2V9 c2v914 = this.A0U;
            c50952Vr.A0F |= OdexSchemeArtXdex.STATE_DEX2OAT_CLASSPATH_SET;
            c50952Vr.A0U = c2v914;
        }
        if ((this.A0F & OdexSchemeArtXdex.STATE_PGO_NEEDED) != 0) {
            C2V9 c2v915 = this.A0V;
            c50952Vr.A0F |= OdexSchemeArtXdex.STATE_PGO_NEEDED;
            c50952Vr.A0V = c2v915;
        }
        if ((this.A0F & OdexSchemeArtXdex.STATE_PGO_ATTEMPTED) != 0) {
            C2V9 c2v916 = this.A0W;
            c50952Vr.A0F |= OdexSchemeArtXdex.STATE_PGO_ATTEMPTED;
            c50952Vr.A0W = c2v916;
        }
        if ((this.A0F & 1) != 0) {
            CharSequence charSequence2 = this.A0a;
            c50952Vr.A0F |= 1;
            c50952Vr.A0a = charSequence2;
        }
        if ((this.A0F & 8589934592L) != 0) {
            String str2 = this.A0d;
            c50952Vr.A0F |= 8589934592L;
            c50952Vr.A0d = str2;
        }
        if ((this.A0F & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED) != 0) {
            float f = this.A05;
            c50952Vr.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED;
            c50952Vr.A05 = f;
        }
        if ((this.A0F & 134217728) != 0) {
            int i = this.A06;
            c50952Vr.A0F |= 134217728;
            c50952Vr.A06 = i;
        }
        if ((this.A0F & 268435456) != 0) {
            int i2 = this.A07;
            c50952Vr.A0F |= 268435456;
            c50952Vr.A07 = i2;
        }
        if ((this.A0F & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            ViewOutlineProvider viewOutlineProvider = this.A0H;
            c50952Vr.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED;
            c50952Vr.A0H = viewOutlineProvider;
        }
        if ((this.A0F & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) != 0) {
            boolean z = this.A0g;
            c50952Vr.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
            c50952Vr.A0g = z;
        }
        if ((this.A0F & 8388608) != 0) {
            boolean z2 = this.A0f;
            c50952Vr.A0F |= 8388608;
            c50952Vr.A0f = z2;
        }
        if ((this.A0F & 34359738368L) != 0) {
            c50952Vr.A0F |= 34359738368L;
        }
        if ((this.A0F & 1073741824) != 0) {
            int i3 = this.A08;
            c50952Vr.A0F |= 1073741824;
            c50952Vr.A08 = i3;
        }
        Object obj = this.A0b;
        if (obj != null) {
            c50952Vr.A0F |= 2;
            c50952Vr.A0b = obj;
        }
        SparseArray sparseArray = this.A0G;
        if (sparseArray != null) {
            c50952Vr.A0F |= 4;
            SparseArray sparseArray2 = c50952Vr.A0G;
            if (sparseArray2 != null) {
                sparseArray = AbstractC79783hT.A00(sparseArray2, sparseArray);
            }
            c50952Vr.A0G = sparseArray;
        }
        String str3 = this.A0e;
        if (str3 != null) {
            c50952Vr.A0e = str3;
        }
        int i4 = this.A0C;
        if (i4 != 0) {
            int i5 = 2;
            if (i4 == 1) {
                i5 = 1;
            }
            c50952Vr.A0C = i5;
        }
        int i6 = this.A0A;
        if (i6 != 0) {
            int i7 = 2;
            if (i6 == 1) {
                i7 = 1;
            }
            c50952Vr.A0A = i7;
        }
        int i8 = this.A0B;
        if (i8 != 0) {
            int i9 = 2;
            if (i8 == 1) {
                i9 = 1;
            }
            c50952Vr.A0B = i9;
        }
        int i10 = this.A0E;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 == 1) {
                i11 = 1;
            }
            c50952Vr.A0E = i11;
        }
        int i12 = this.A09;
        if (i12 != 0) {
            int i13 = 2;
            if (i12 == 1) {
                i13 = 1;
            }
            c50952Vr.A09 = i13;
        }
        int i14 = this.A0D;
        if (i14 != 0) {
            int i15 = 2;
            if (i14 == 1) {
                i15 = 1;
            }
            c50952Vr.A0D = i15;
        }
        if ((this.A0F & 524288) != 0) {
            float f2 = this.A04;
            c50952Vr.A04 = f2;
            long j4 = c50952Vr.A0F;
            if (f2 == 1.0f) {
                j3 = j4 & (-524289);
            } else {
                j3 = j4 | 524288;
            }
            c50952Vr.A0F = j3;
        }
        if ((this.A0F & 1048576) != 0) {
            float f3 = this.A00;
            c50952Vr.A00 = f3;
            long j5 = c50952Vr.A0F;
            if (f3 == 1.0f) {
                j2 = j5 & (-1048577);
            } else {
                j2 = j5 | 1048576;
            }
            c50952Vr.A0F = j2;
        }
        if ((this.A0F & 2097152) != 0) {
            float f4 = this.A01;
            c50952Vr.A01 = f4;
            long j6 = c50952Vr.A0F;
            if (f4 == 0.0f) {
                j = j6 & (-2097153);
            } else {
                j = j6 | 2097152;
            }
            c50952Vr.A0F = j;
        }
        if ((this.A0F & 33554432) != 0) {
            c50952Vr.A02 = this.A02;
            c50952Vr.A0F |= 33554432;
        }
        if ((this.A0F & 67108864) != 0) {
            c50952Vr.A03 = this.A03;
            c50952Vr.A0F |= 67108864;
        }
        if ((this.A0F & 17179869184L) != 0) {
            CV2 cv2 = this.A0Y;
            c50952Vr.A0F |= 17179869184L;
            c50952Vr.A0Y = cv2;
        }
    }

    public final boolean A01() {
        if (this.A0N == null && this.A0O == null && this.A0Q == null && this.A0R == null && this.A0T == null && this.A0P == null && this.A0S == null && this.A0U == null && this.A0J == null && this.A0V == null && this.A0W == null && this.A0c == null && this.A0Z == null) {
            return false;
        }
        return true;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        C50952Vr c50952Vr = (C50952Vr) obj;
        C14360o3.A0B(c50952Vr, 0);
        if (this == c50952Vr) {
            return true;
        }
        if (this.A0F != c50952Vr.A0F || !C14360o3.A0K(this.A0c, c50952Vr.A0c) || this.A00 != c50952Vr.A00 || !AbstractC78713fd.A01(this.A0I, c50952Vr.A0I) || this.A0g != c50952Vr.A0g || this.A0f != c50952Vr.A0f || !C14360o3.A0K(this.A0a, c50952Vr.A0a) || !C14360o3.A0K(this.A0d, c50952Vr.A0d) || !AbstractC78713fd.A01(this.A0J, c50952Vr.A0J) || this.A0B != c50952Vr.A0B || !AbstractC78713fd.A01(this.A0K, c50952Vr.A0K) || this.A0C != c50952Vr.A0C || !AbstractC78713fd.A01(this.A0L, c50952Vr.A0L) || !AbstractC78713fd.A01(this.A0M, c50952Vr.A0M) || !AbstractC78713fd.A01(this.A0N, c50952Vr.A0N) || !AbstractC78713fd.A01(this.A0O, c50952Vr.A0O) || !AbstractC78713fd.A01(this.A0Q, c50952Vr.A0Q) || !AbstractC78713fd.A01(this.A0R, c50952Vr.A0R) || !AbstractC78713fd.A01(this.A0S, c50952Vr.A0S) || !C14360o3.A0K(this.A0H, c50952Vr.A0H) || !AbstractC78713fd.A01(this.A0U, c50952Vr.A0U) || this.A01 != c50952Vr.A01 || this.A04 != c50952Vr.A04 || this.A0E != c50952Vr.A0E || this.A0D != c50952Vr.A0D || !AbstractC78713fd.A01(this.A0V, c50952Vr.A0V) || !AbstractC78713fd.A01(this.A0W, c50952Vr.A0W) || !AbstractC78713fd.A01(this.A0P, c50952Vr.A0P) || !AbstractC78713fd.A01(this.A0T, c50952Vr.A0T) || this.A05 != c50952Vr.A05 || this.A06 != c50952Vr.A06 || this.A07 != c50952Vr.A07 || !AbstractC78713fd.A01(this.A0X, c50952Vr.A0X) || !C14360o3.A0K(this.A0b, c50952Vr.A0b) || !C14360o3.A0K(Integer.valueOf(this.A08), Integer.valueOf(c50952Vr.A08)) || !C14360o3.A0K(this.A0Y, c50952Vr.A0Y)) {
            return false;
        }
        return AbstractC78713fd.A00(this.A0G, c50952Vr.A0G);
    }
}
