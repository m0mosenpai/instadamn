package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77753dz implements InterfaceC50942Vq, C2VB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public C2WG A0K;
    public C2WG A0L;
    public C2WG A0M;
    public C2WG A0N;
    public C2WG A0O;
    public C2WG A0P;
    public C78233ep A0Q;
    public EnumC77683ds A0R;
    public EnumC222829sN A0S;
    public EnumC77933eL A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;

    public final void A0L(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        this.A0I |= 67108864;
        C2WG c2wg = this.A0K;
        if (c2wg == null) {
            c2wg = new C2WG();
        }
        c2wg.A03(enumC77763e0, f);
        this.A0K = c2wg;
    }

    public final void A0M(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        this.A0I |= 16777216;
        C2WG c2wg = this.A0M;
        if (c2wg == null) {
            c2wg = new C2WG();
        }
        c2wg.A03(enumC77763e0, f);
        this.A0M = c2wg;
    }

    public final void A0N(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        this.A0I |= 4194304;
        C2WG c2wg = this.A0O;
        if (c2wg == null) {
            c2wg = new C2WG();
        }
        c2wg.A03(enumC77763e0, f);
        this.A0O = c2wg;
    }

    public final void A0O(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        this.A0I |= 33554432;
        C2WG c2wg = this.A0L;
        if (c2wg == null) {
            c2wg = new C2WG();
        }
        c2wg.A03(enumC77763e0, i);
        this.A0L = c2wg;
    }

    public final void A0P(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        this.A0I |= 2097152;
        C2WG c2wg = this.A0P;
        if (c2wg == null) {
            c2wg = new C2WG();
        }
        c2wg.A03(enumC77763e0, i);
        this.A0P = c2wg;
    }

    @Override // X.InterfaceC50942Vq
    public final void E3E(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        this.A0I |= DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        C2WG c2wg = this.A0N;
        if (c2wg == null) {
            c2wg = new C2WG();
        }
        c2wg.A03(enumC77763e0, i);
        this.A0N = c2wg;
    }

    public final void A00(float f) {
        this.A0I |= Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        this.A00 = f;
    }

    public final void A01(float f) {
        this.A0I |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        this.A01 = f;
    }

    public final void A02(float f) {
        this.A0I |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        this.A02 = f;
    }

    public final void A03(float f) {
        this.A0I |= Constants.LOAD_RESULT_PGO;
        this.A03 = f;
    }

    public final void A04(float f) {
        this.A0I |= Constants.LOAD_RESULT_PGO_ATTEMPTED;
        this.A04 = f;
    }

    public final void A05(float f) {
        this.A0I |= 128;
        this.A05 = f;
    }

    public final void A06(float f) {
        this.A0I |= C3OO.FLAG_MOVED;
        this.A06 = f;
    }

    public final void A07(float f) {
        this.A0I |= 32;
        this.A07 = f;
    }

    public final void A08(float f) {
        this.A0I |= 512;
        this.A08 = f;
    }

    public final void A09(float f) {
        this.A0I |= 8;
        this.A09 = f;
    }

    public final void A0A(float f) {
        this.A0I |= 2;
        this.A0A = f;
    }

    public final void A0B(int i) {
        this.A0I |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        this.A0B = i;
    }

    public final void A0C(int i) {
        this.A0I |= 64;
        this.A0D = i;
    }

    public final void A0D(int i) {
        this.A0I |= 4096;
        this.A0Q = new C78233ep(i);
    }

    public final void A0E(int i) {
        this.A0I |= 1024;
        this.A0E = i;
    }

    public final void A0F(int i) {
        this.A0I |= 16;
        this.A0F = i;
    }

    public final void A0G(int i) {
        this.A0I |= 256;
        this.A0G = i;
    }

    public final void A0H(int i) {
        this.A0I |= 4;
        this.A0H = i;
    }

    public final void A0I(int i) {
        this.A0I |= 1;
        this.A0J = i;
    }

    public final void A0J(EnumC77683ds enumC77683ds) {
        this.A0I |= 8192;
        this.A0R = enumC77683ds;
    }

    public final void A0K(EnumC77763e0 enumC77763e0) {
        this.A0I |= 134217728;
        List list = this.A0U;
        if (list == null) {
            list = new ArrayList(2);
        }
        list.add(enumC77763e0);
        this.A0U = list;
    }

    public final void A0Q(EnumC222829sN enumC222829sN, int i) {
        this.A0S = enumC222829sN;
        this.A0C = i;
    }

    public final void A0R(EnumC77933eL enumC77933eL) {
        this.A0I |= 1048576;
        this.A0T = enumC77933eL;
    }

    public final void A0S(boolean z) {
        this.A0I |= 268435456;
        this.A0V = z;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        C77753dz c77753dz = (C77753dz) obj;
        if (equals(c77753dz) || (c77753dz != null && this.A0I == c77753dz.A0I && this.A0J == c77753dz.A0J && Float.compare(c77753dz.A0A, this.A0A) == 0 && this.A0H == c77753dz.A0H && Float.compare(c77753dz.A09, this.A09) == 0 && this.A0F == c77753dz.A0F && Float.compare(c77753dz.A07, this.A07) == 0 && this.A0D == c77753dz.A0D && Float.compare(c77753dz.A05, this.A05) == 0 && this.A0G == c77753dz.A0G && Float.compare(c77753dz.A08, this.A08) == 0 && this.A0E == c77753dz.A0E && Float.compare(c77753dz.A06, this.A06) == 0 && Float.compare(c77753dz.A01, this.A01) == 0 && Float.compare(c77753dz.A03, this.A03) == 0 && Float.compare(c77753dz.A04, this.A04) == 0 && this.A0B == c77753dz.A0B && Float.compare(c77753dz.A02, this.A02) == 0 && Float.compare(c77753dz.A00, this.A00) == 0 && this.A0V == c77753dz.A0V && this.A0W == c77753dz.A0W && C14360o3.A0K(this.A0Q, c77753dz.A0Q) && this.A0R == c77753dz.A0R && this.A0T == c77753dz.A0T && AbstractC78713fd.A01(this.A0P, c77753dz.A0P) && AbstractC78713fd.A01(this.A0L, c77753dz.A0L) && AbstractC78713fd.A01(this.A0K, c77753dz.A0K) && AbstractC78713fd.A01(this.A0N, c77753dz.A0N) && AbstractC78713fd.A01(this.A0M, c77753dz.A0M) && AbstractC78713fd.A01(this.A0O, c77753dz.A0O) && C14360o3.A0K(this.A0U, c77753dz.A0U) && C14360o3.A0K(this.A0S, c77753dz.A0S) && C14360o3.A0K(Integer.valueOf(this.A0C), Integer.valueOf(c77753dz.A0C)))) {
            return true;
        }
        return false;
    }
}
