package X;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2W1, reason: invalid class name */
/* loaded from: classes.dex */
public class C2W1 implements C2W2, Cloneable {
    public static final C76983ck A0y = new Object();
    public static final AtomicInteger A0z = new AtomicInteger(1);
    public float A00;
    public float A01;
    public int A03;
    public int A05;
    public long A06;
    public StateListAnimator A07;
    public Paint A08;
    public PathEffect A09;
    public Rect A0A;
    public Drawable A0B;
    public Drawable A0C;
    public C2WG A0D;
    public C2WG A0E;
    public C2V9 A0F;
    public C2V9 A0G;
    public C2V9 A0H;
    public C2V9 A0I;
    public C2V9 A0J;
    public C2V9 A0K;
    public C78313ex A0L;
    public C50952Vr A0M;
    public EnumC76913cd A0N;
    public C51272Xa A0O;
    public C78233ep A0P;
    public C78303ew A0Q;
    public C2YM A0R;
    public EnumC77683ds A0S;
    public EnumC77683ds A0T;
    public EnumC77003cm A0U;
    public EnumC222829sN A0V;
    public C3e8 A0W;
    public InterfaceC50872Vi A0X;
    public EnumC115945Mk A0Y;
    public Integer A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public List A0d;
    public List A0e;
    public List A0f;
    public List A0g;
    public Map A0i;
    public java.util.Set A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean[] A0s;
    public boolean A0t;
    public int A02 = A0z.getAndIncrement();
    public List A0h = new ArrayList(4);
    public final int[] A0x = new int[4];
    public final int[] A0w = new int[4];
    public final float[] A0v = new float[4];
    public int A04 = -1;
    public final List A0u = new ArrayList(2);

    @Override // X.C2W2
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C2W3 AF9(C78473fD c78473fD, long j) {
        float size;
        float f;
        float f2;
        float f3;
        float f4;
        C2XQ c2xq = (C2XQ) c78473fD.A05;
        if (c2xq != null) {
            if (!c2xq.A07) {
                C78483fE c78483fE = C78483fE.A00;
                boolean isTracing = ComponentsSystrace.A00.isTracing();
                if (isTracing) {
                    ComponentsSystrace.A02(AnonymousClass001.A0R("buildYogaTree:", A02().A0H()));
                }
                C2W3 A02 = C78483fE.A02(this, c78483fE, c78473fD, null);
                C14360o3.A0B(A02, 0);
                C78573fP c78573fP = A02.A02;
                AbstractC78533fL abstractC78533fL = c78573fP.A0K;
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
                int A01 = AbstractC78603fS.A01(j);
                int A00 = AbstractC78603fS.A00(j);
                if (A01() == 1) {
                    YogaNative.jni_YGNodeStyleSetDirectionJNI(((YogaNodeJNIBase) abstractC78533fL).mNativePointer, 2);
                }
                YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC78533fL;
                if (C3e2.A00(YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.mNativePointer)).A00)) {
                    int mode = View.MeasureSpec.getMode(A01);
                    if (mode != Integer.MIN_VALUE) {
                        if (mode != 0) {
                            if (mode == 1073741824) {
                                f4 = View.MeasureSpec.getSize(A01);
                            }
                        } else {
                            f4 = Float.NaN;
                        }
                        YogaNative.jni_YGNodeStyleSetWidthJNI(yogaNodeJNIBase.mNativePointer, f4);
                    } else {
                        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.mNativePointer, View.MeasureSpec.getSize(A01));
                    }
                }
                if (C3e2.A00(YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.mNativePointer)).A00)) {
                    int mode2 = View.MeasureSpec.getMode(A00);
                    if (mode2 != Integer.MIN_VALUE) {
                        if (mode2 != 0) {
                            if (mode2 == 1073741824) {
                                f3 = View.MeasureSpec.getSize(A00);
                            }
                        } else {
                            f3 = Float.NaN;
                        }
                        YogaNative.jni_YGNodeStyleSetHeightJNI(yogaNodeJNIBase.mNativePointer, f3);
                    } else {
                        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.mNativePointer, View.MeasureSpec.getSize(A00));
                    }
                }
                float f5 = Float.NaN;
                if (View.MeasureSpec.getMode(A01) == 0) {
                    size = Float.NaN;
                } else {
                    size = View.MeasureSpec.getSize(A01);
                }
                if (View.MeasureSpec.getMode(A00) != 0) {
                    f5 = View.MeasureSpec.getSize(A00);
                }
                if (isTracing) {
                    ComponentsSystrace.A02(AnonymousClass001.A0R("yogaCalculateLayout:", A02().A0H()));
                }
                abstractC78533fL.calculateLayout(size, f5);
                c78573fP.A01 = A01;
                c78573fP.A00 = A00;
                float[] fArr = yogaNodeJNIBase.arr;
                if (fArr != null) {
                    f = fArr[3];
                } else {
                    f = 0.0f;
                }
                int i = (int) f;
                if (fArr != null) {
                    f2 = fArr[4];
                } else {
                    f2 = 0.0f;
                }
                c2xq.A00 = new Point(i, (int) f2);
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
                return A02;
            }
            throw new IllegalStateException("Cannot calculate a layout with a released LayoutStateContext.");
        }
        throw new IllegalStateException("Cannot calculate a layout without RenderContext.");
    }

    public void A0C(PathEffect pathEffect, float[] fArr, int[] iArr, int[] iArr2) {
        C14360o3.A0B(iArr2, 1);
        C14360o3.A0B(fArr, 2);
        this.A06 |= 268435456;
        System.arraycopy(iArr, 0, this.A0x, 0, 4);
        System.arraycopy(iArr2, 0, this.A0w, 0, 4);
        System.arraycopy(fArr, 0, this.A0v, 0, 4);
        this.A09 = pathEffect;
    }

    public final void A0E(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C76133bI c76133bI) {
        C2W1 A02;
        C14360o3.A0B(c2xe, 1);
        if (abstractC50812Vc != null && (A02 = C76163bL.A02(abstractC50812Vc, c2xe, c76133bI)) != null) {
            this.A0h.add(this.A0h.size(), A02);
        }
    }

    public static final boolean A00(C2W1 c2w1) {
        C50952Vr c50952Vr;
        if (c2w1.A0E != null && (c50952Vr = c2w1.A0M) != null) {
            if (c50952Vr.A0I != null || c50952Vr.A0M != null || c50952Vr.A0X != null || c50952Vr.A0L != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int A01() {
        C78233ep c78233ep = this.A0P;
        if (c78233ep != null) {
            return c78233ep.A00;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final AbstractC50812Vc A02() {
        return ((C2Y5) this.A0u.get(r1.size() - 1)).A03;
    }

    public final AbstractC50812Vc A03() {
        return ((C2Y5) this.A0u.get(0)).A03;
    }

    public final C2XE A04() {
        return ((C2Y5) this.A0u.get(r1.size() - 1)).A04;
    }

    public final C2XE A05() {
        return ((C2Y5) this.A0u.get(0)).A04;
    }

    public final C50952Vr A09() {
        C50952Vr c50952Vr;
        if (!this.A0q) {
            this.A0q = true;
            c50952Vr = new C50952Vr();
            C50952Vr c50952Vr2 = this.A0M;
            if (c50952Vr2 != null) {
                c50952Vr2.A00(c50952Vr);
            }
        } else {
            c50952Vr = this.A0M;
            if (c50952Vr == null) {
                c50952Vr = new C50952Vr();
            }
        }
        this.A0M = c50952Vr;
        return c50952Vr;
    }

    public final String A0A() {
        return ((C2Y5) this.A0u.get(0)).A04.A08();
    }

    public final String A0B(int i) {
        return ((C2Y5) this.A0u.get(i)).A04.A08();
    }

    public final void A0D(C2XR c2xr, int i, int i2, int i3, boolean z) {
        boolean z2;
        int i4;
        int i5;
        int i6 = i;
        if (!this.A0t) {
            boolean z3 = true;
            if (c2xr.BpX() != A02().A00) {
                z3 = false;
                if (i2 == 8) {
                    this.A06 |= 128;
                    this.A03 = 4;
                }
                if (i3 == 2) {
                    A09().A0B = 2;
                }
            }
            this.A0o = this.A0m;
            C78233ep c78233ep = this.A0P;
            if (c78233ep != null && (i5 = c78233ep.A00) != 2) {
                i6 = i5;
            }
            this.A0P = new C78233ep(i6);
            boolean A03 = A0y.A03(this);
            this.A0k = A03;
            if (A03 || z3 || (z && this.A0m)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.A0m = z2;
            this.A0O = C2XY.A03(this);
            int size = this.A0h.size();
            for (int i7 = 0; i7 < size; i7++) {
                C2W1 c2w1 = (C2W1) this.A0h.get(i7);
                int A01 = A01();
                int i8 = this.A03;
                C50952Vr c50952Vr = this.A0M;
                if (c50952Vr != null) {
                    i4 = c50952Vr.A0B;
                } else {
                    i4 = 0;
                }
                c2w1.A0D(c2xr, A01, i8, i4, this.A0m);
            }
            C2XE A04 = A04();
            C2YM c2ym = this.A0R;
            if (c2ym != null && this.A0r) {
                C2X5 A042 = C2XY.A04(A03(), A04, this, this.A03);
                C2V3 c2v3 = A04.A02.A01;
                C2YQ c2yq = c2ym.A01.A02;
                C77843eC A00 = AbstractC78283eu.A00(C78273et.A00, new C78263es(A042, c2yq, false, c2v3.A0A, c2v3.A0U));
                C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any?, kotlin.Any, kotlin.Any>");
                c2yq.A0D(A00);
            }
            this.A0t = true;
        }
    }

    public final void A0F(C2Y5 c2y5) {
        Integer num;
        C2YQ c2yq;
        List list = this.A0u;
        list.add(c2y5);
        if (list.size() == 1) {
            C2YM c2ym = this.A0R;
            if (c2ym != null && (c2yq = c2ym.A01.A02) != null) {
                num = c2yq.A04;
            } else {
                num = null;
            }
            boolean z = true;
            if (num != C05F.A01 && A03().A0Q() != C05F.A0C) {
                z = false;
            }
            this.A0r = z;
        }
    }

    public final void A0G(Map map) {
        C2YM c2ym;
        if (map != null && !map.isEmpty()) {
            this.A06 |= 17179869184L;
            if (!C76983ck.A02(this) && (c2ym = this.A0R) != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    c2ym.A01.A02.A0D((C77843eC) it.next());
                }
            }
            Map map2 = this.A0i;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.A0i = map2;
            }
            map2.putAll(map);
        }
    }

    public final boolean A0H() {
        String A0H;
        if (this.A0t) {
            return this.A0k;
        }
        List list = this.A0u;
        if (list.isEmpty()) {
            A0H = "<null>";
        } else {
            A0H = ((C2Y5) list.get(0)).A03.A0H();
            C14360o3.A07(A0H);
        }
        throw new IllegalStateException(AnonymousClass001.A0g("LithoNode:(", A0H, ") has not been resolved."));
    }

    @Override // X.C2W2
    public final /* synthetic */ C2W5 AF8(C78473fD c78473fD, int i, int i2) {
        throw new UnsupportedOperationException("This API must be implemented to be invoked.");
    }

    public C2W3 A06(C78573fP c78573fP) {
        return new C2W3(A05(), this, c78573fP);
    }

    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final C2W1 clone() {
        try {
            Object clone = super.clone();
            C14360o3.A0C(clone, "null cannot be cast to non-null type com.facebook.litho.LithoNode");
            C2W1 c2w1 = (C2W1) clone;
            c2w1.A02 = this.A02;
            return c2w1;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
