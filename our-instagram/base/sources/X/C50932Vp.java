package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50932Vp implements InterfaceC50942Vq, C2VB {
    public int A00;
    public int A01;
    public Rect A02;
    public SparseArray A03;
    public C77753dz A04;
    public C76973cj A05;
    public C50952Vr A06;
    public String A07;
    public boolean A08;
    public Drawable A09;

    public final void A0N(C2XE c2xe, C2W1 c2w1) {
        C2WG c2wg;
        C78233ep c78233ep;
        Drawable drawable;
        Drawable drawable2;
        int i = this.A00;
        if (i != 0) {
            c2xe.A00 = i;
            Context context = c2xe.A0C;
            C14360o3.A0B(context, 0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, COC.A00, 0, i);
            C14360o3.A07(obtainStyledAttributes);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 18) {
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c2w1.A06 |= 128;
                    c2w1.A03 = i3;
                } else if (index == 6) {
                    c2w1.A0m = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == 0) {
                    if (STR.A00(obtainStyledAttributes, 0)) {
                        drawable2 = new ColorDrawable(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == 0) {
                            drawable2 = null;
                        } else {
                            drawable2 = context.getDrawable(resourceId);
                        }
                    }
                    c2w1.A06 |= 262144;
                    c2w1.A0B = drawable2;
                } else if (index == 14) {
                    if (STR.A00(obtainStyledAttributes, 14)) {
                        drawable = new ColorDrawable(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId2 == 0) {
                            drawable = null;
                        } else {
                            drawable = context.getDrawable(resourceId2);
                        }
                    }
                    c2w1.A06 |= 524288;
                    c2w1.A0C = drawable;
                } else if (index == 17) {
                    C50952Vr A09 = c2w1.A09();
                    String string = obtainStyledAttributes.getString(index);
                    A09.A0F |= 1;
                    A09.A0a = string;
                }
            }
            obtainStyledAttributes.recycle();
            c2xe.A00 = 0;
        }
        C50952Vr c50952Vr = this.A06;
        if (c50952Vr != null) {
            if (!c2w1.A0q && c2w1.A0M == null) {
                c2w1.A0M = c50952Vr;
            } else {
                c50952Vr.A00(c2w1.A09());
            }
        }
        int i4 = this.A01;
        if ((i4 & 1) != 0) {
            Drawable drawable3 = this.A09;
            c2w1.A06 |= 262144;
            c2w1.A0B = drawable3;
            c2w1.A0A = this.A02;
        }
        C77753dz c77753dz = this.A04;
        if (c77753dz != null && (c78233ep = c77753dz.A0Q) != null) {
            int i5 = c78233ep.A00;
            c2w1.A06 |= 1;
            c2w1.A0P = new C78233ep(i5);
        }
        if ((i4 & 2) != 0) {
            c2w1.A0a = this.A07;
        }
        if (this.A08 || (i4 & 28) != 0) {
            c2w1.A0n = true;
        }
        C76973cj c76973cj = this.A05;
        if (c76973cj != null) {
            int i6 = c76973cj.A02;
            if ((i6 & 1) != 0) {
                int i7 = c76973cj.A00;
                c2w1.A06 |= 128;
                c2w1.A03 = i7;
            }
            if ((i6 & 2) != 0) {
                c2w1.A0m = c76973cj.A0K;
            }
            if ((262144 & i6) != 0) {
                boolean z = c76973cj.A0J;
                c2w1.A06 |= 8589934592L;
                c2w1.A0l = z;
            }
            if ((i6 & 4) != 0) {
                Drawable drawable4 = c76973cj.A05;
                c2w1.A06 |= 524288;
                c2w1.A0C = drawable4;
            }
            if ((i6 & 1024) != 0) {
                c2w1.A0n = true;
            }
            if ((i6 & 8) != 0) {
                C2V9 c2v9 = c76973cj.A0D;
                c2w1.A06 |= 1048576;
                c2w1.A0K = C76983ck.A01(c2w1.A0K, c2v9);
            }
            if ((c76973cj.A02 & 16) != 0) {
                C2V9 c2v92 = c76973cj.A08;
                c2w1.A06 |= 2097152;
                c2w1.A0F = C76983ck.A01(c2w1.A0F, c2v92);
            }
            if ((c76973cj.A02 & 32) != 0) {
                C2V9 c2v93 = c76973cj.A09;
                c2w1.A06 |= 4194304;
                c2w1.A0G = C76983ck.A01(c2w1.A0G, c2v93);
            }
            if ((c76973cj.A02 & 64) != 0) {
                C2V9 c2v94 = c76973cj.A0A;
                c2w1.A06 |= 8388608;
                c2w1.A0H = C76983ck.A01(c2w1.A0H, c2v94);
            }
            if ((c76973cj.A02 & 128) != 0) {
                C2V9 c2v95 = c76973cj.A0B;
                c2w1.A06 |= 16777216;
                c2w1.A0I = C76983ck.A01(c2w1.A0I, c2v95);
            }
            if ((c76973cj.A02 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
                C2V9 c2v96 = c76973cj.A0C;
                c2w1.A06 |= 2147483648L;
                c2w1.A0J = C76983ck.A01(c2w1.A0J, c2v96);
            }
            int i8 = c76973cj.A02;
            if ((i8 & 512) != 0) {
                String str = c76973cj.A0F;
                String str2 = c76973cj.A0G;
                if (str != null && str.length() != 0) {
                    c2w1.A06 |= 134217728;
                    c2w1.A0b = str;
                    c2w1.A0c = str2;
                }
            }
            if ((131072 & i8) != 0) {
                EnumC76913cd enumC76913cd = c76973cj.A0E;
                c2w1.A06 |= 4294967296L;
                c2w1.A0N = enumC76913cd;
            }
            if ((i8 & C3OO.FLAG_MOVED) != 0) {
                c2w1.A00 = 0.0f;
            }
            if ((i8 & 4096) != 0) {
                c2w1.A01 = 0.0f;
            }
            if ((i8 & 256) != 0 && (c2wg = c76973cj.A07) != null) {
                int i9 = C2WG.A03;
                for (int i10 = 0; i10 < i9; i10++) {
                    float A01 = c2wg.A01(i10);
                    if (!C3e2.A00(A01)) {
                        EnumC77763e0 A00 = EnumC77763e0.A00(i10);
                        C14360o3.A07(A00);
                        int i11 = (int) A01;
                        C2WG c2wg2 = c2w1.A0E;
                        if (c2wg2 == null) {
                            c2wg2 = new C2WG();
                            c2w1.A0E = c2wg2;
                        }
                        c2w1.A06 |= 33554432;
                        if (c2wg2 != null) {
                            c2wg2.A03(A00, i11);
                        }
                    }
                }
            }
            if ((c76973cj.A02 & 8192) != 0) {
                C2WK c2wk = c76973cj.A06;
                c2wk.getClass();
                c2w1.A0C(null, c2wk.A00, c2wk.A02, c2wk.A01);
            }
            int i12 = c76973cj.A02;
            if ((i12 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
                StateListAnimator stateListAnimator = c76973cj.A03;
                c2w1.A06 |= 536870912;
                c2w1.A07 = stateListAnimator;
                c2w1.A0n = true;
            }
            if ((i12 & Constants.LOAD_RESULT_PGO) != 0) {
                c2w1.A06 |= 1073741824;
                c2w1.A05 = 0;
                c2w1.A0n = true;
            }
            int i13 = c76973cj.A01;
            Paint paint = c76973cj.A04;
            if (i13 != -1) {
                c2w1.A04 = i13;
                c2w1.A08 = paint;
            }
            List list = c76973cj.A0H;
            if (list != null) {
                List list2 = c2w1.A0e;
                if (list2 == null) {
                    list2 = new ArrayList();
                    c2w1.A0e = list2;
                }
                list2.addAll(list);
            }
        }
    }

    public final void A0O(EnumC77683ds enumC77683ds) {
        C14360o3.A0B(enumC77683ds, 0);
        A00().A0J(enumC77683ds);
    }

    public final void A0P(EnumC77763e0 enumC77763e0) {
        C14360o3.A0B(enumC77763e0, 0);
        A00().A0K(enumC77763e0);
    }

    public final void A0Q(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        A00().A0L(enumC77763e0, f);
    }

    public final void A0R(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        A00().A0M(enumC77763e0, f);
    }

    public final void A0S(EnumC77763e0 enumC77763e0, float f) {
        C14360o3.A0B(enumC77763e0, 0);
        A00().A0N(enumC77763e0, f);
    }

    public final void A0T(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        A00().A0O(enumC77763e0, i);
    }

    public final void A0U(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        A00().A0P(enumC77763e0, i);
    }

    public final void A0W(EnumC77933eL enumC77933eL) {
        C14360o3.A0B(enumC77933eL, 0);
        A00().A0R(enumC77933eL);
    }

    @Override // X.C2VB
    /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final boolean CTz(C50932Vp c50932Vp) {
        return this == c50932Vp || (c50932Vp != null && this.A01 == c50932Vp.A01 && this.A08 == c50932Vp.A08 && this.A00 == c50932Vp.A00 && AnonymousClass530.A00(this.A09, c50932Vp.A09) && AbstractC78713fd.A01(this.A05, c50932Vp.A05) && AbstractC78713fd.A01(this.A06, c50932Vp.A06) && AbstractC78713fd.A01(this.A04, c50932Vp.A04) && C14360o3.A0K(this.A07, c50932Vp.A07) && AbstractC78713fd.A00(this.A03, c50932Vp.A03));
    }

    @Override // X.InterfaceC50942Vq
    public final void E3E(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        A00().E3E(enumC77763e0, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.3dz] */
    private final C77753dz A00() {
        C77753dz c77753dz = this.A04;
        if (c77753dz == null) {
            ?? obj = new Object();
            this.A04 = obj;
            return obj;
        }
        return c77753dz;
    }

    public static final C76973cj A01(C50932Vp c50932Vp) {
        C76973cj c76973cj = c50932Vp.A05;
        if (c76973cj == null) {
            C76973cj c76973cj2 = new C76973cj();
            c50932Vp.A05 = c76973cj2;
            return c76973cj2;
        }
        return c76973cj;
    }

    public static final C50952Vr A02(C50932Vp c50932Vp) {
        C50952Vr c50952Vr = c50932Vp.A06;
        if (c50952Vr == null) {
            C50952Vr c50952Vr2 = new C50952Vr();
            c50932Vp.A06 = c50952Vr2;
            return c50952Vr2;
        }
        return c50952Vr;
    }

    public final void A0M(Drawable drawable) {
        this.A01 |= 1;
        this.A09 = drawable;
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            if (rect.bottom != 0 || rect.top != 0 || rect.left != 0 || rect.right != 0) {
                this.A02 = rect;
            }
        }
    }

    public final void A03(float f) {
        A00().A00(f);
    }

    public final void A04(float f) {
        A00().A01(f);
    }

    public final void A05(float f) {
        A00().A02(f);
    }

    public final void A06(float f) {
        A00().A03(f);
    }

    public final void A07(float f) {
        A00().A04(f);
    }

    public final void A08(float f) {
        A00().A05(f);
    }

    public final void A09(float f) {
        A00().A06(f);
    }

    public final void A0A(float f) {
        A00().A07(f);
    }

    public final void A0B(float f) {
        A00().A08(f);
    }

    public final void A0C(float f) {
        A00().A09(f);
    }

    public final void A0D(float f) {
        A00().A0A(f);
    }

    public final void A0E(int i) {
        A00().A0B(i);
    }

    public final void A0F(int i) {
        A00().A0C(i);
    }

    public final void A0G(int i) {
        A00().A0D(i);
    }

    public final void A0H(int i) {
        A00().A0E(i);
    }

    public final void A0I(int i) {
        A00().A0F(i);
    }

    public final void A0J(int i) {
        A00().A0G(i);
    }

    public final void A0K(int i) {
        A00().A0H(i);
    }

    public final void A0L(int i) {
        A00().A0I(i);
    }

    public final void A0V(EnumC222829sN enumC222829sN, int i) {
        A00().A0Q(enumC222829sN, i);
    }

    public final void A0X(boolean z) {
        A00().A0S(z);
    }

    public final void A0Y(boolean z) {
        A00().A0W = z;
    }
}
