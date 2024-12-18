package X;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3fE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78483fE {
    public static final C78483fE A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0 A[Catch: Exception -> 0x0244, TRY_LEAVE, TryCatch #0 {Exception -> 0x0244, blocks: (B:23:0x009c, B:25:0x00a0, B:27:0x00bd, B:29:0x00cb, B:31:0x00cf, B:34:0x0234, B:35:0x0243, B:38:0x00e0, B:45:0x01df, B:46:0x01e2, B:48:0x01e6, B:51:0x01ec, B:56:0x0230, B:59:0x00d2, B:60:0x0114, B:62:0x0125, B:64:0x013c, B:66:0x0140, B:68:0x0146, B:70:0x014a, B:71:0x0154, B:73:0x0161, B:82:0x01da), top: B:22:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[Catch: all -> 0x010f, TryCatch #2 {all -> 0x010f, blocks: (B:40:0x00ed, B:42:0x00f3, B:53:0x0105), top: B:39:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105 A[Catch: all -> 0x010f, TryCatch #2 {all -> 0x010f, blocks: (B:40:0x00ed, B:42:0x00f3, B:53:0x0105), top: B:39:0x00ed }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.3fY] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, X.2Vj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78723fe A08(X.C2W3 r25, X.C78473fD r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78483fE.A08(X.2W3, X.3fD, int, int):X.3fe");
    }

    public static final C2W3 A00(C2W3 c2w3, C2W1 c2w1, AbstractC78533fL abstractC78533fL) {
        C78573fP c78573fP = c2w3.A02;
        Rect rect = new Rect(c78573fP.A0J);
        float f = c78573fP.A0I;
        float f2 = c78573fP.A0H;
        int i = c78573fP.A01;
        int i2 = c78573fP.A00;
        long j = c78573fP.A02;
        Object obj = c78573fP.A0B;
        C2WB c2wb = c78573fP.A07;
        C2WB c2wb2 = c78573fP.A09;
        C2WB c2wb3 = c78573fP.A05;
        C2WB c2wb4 = c78573fP.A08;
        C2WB c2wb5 = c78573fP.A06;
        return c2w1.A06(new C78573fP(rect, c78573fP.A03, c78573fP.A04, c2wb, c2wb2, c2wb3, c2wb4, c2wb5, c78573fP.A0A, abstractC78533fL, obj, f, f2, i, i2, j, true, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d5, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2W3 A02(X.C2W1 r23, X.C78483fE r24, X.C78473fD r25, X.AbstractC78533fL r26) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78483fE.A02(X.2W1, X.3fE, X.3fD, X.3fL):X.2W3");
    }

    public static final C2W3 A03(AbstractC78533fL abstractC78533fL) {
        Object obj = ((YogaNodeJNIBase) abstractC78533fL).mData;
        C14360o3.A0C(obj, "null cannot be cast to non-null type android.util.Pair<*, *>");
        Object obj2 = ((Pair) obj).second;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.litho.LithoLayoutResult");
        return (C2W3) obj2;
    }

    public static final void A04(Rect rect, InterfaceC50942Vq interfaceC50942Vq) {
        int i = rect.left;
        if (i > 0) {
            interfaceC50942Vq.E3E(EnumC77763e0.LEFT, i);
        }
        int i2 = rect.top;
        if (i2 > 0) {
            interfaceC50942Vq.E3E(EnumC77763e0.TOP, i2);
        }
        int i3 = rect.right;
        if (i3 > 0) {
            interfaceC50942Vq.E3E(EnumC77763e0.RIGHT, i3);
        }
        int i4 = rect.bottom;
        if (i4 > 0) {
            interfaceC50942Vq.E3E(EnumC77763e0.BOTTOM, i4);
        }
    }

    public static final void A05(C2W3 c2w3, C2W1 c2w1, C78473fD c78473fD) {
        C78463fC c78463fC = (C78463fC) c78473fD.A06.getValue();
        C78493fF c78493fF = new C78493fF(c2w3, -1, -1);
        c78463fC.A01(c2w1, c78493fF);
        c78463fC.A01(Long.valueOf(c2w1.A02), c78493fF);
    }

    public static final void A06(C2W3 c2w3, AbstractC78533fL abstractC78533fL) {
        if (abstractC78533fL == null) {
            C78573fP c78573fP = c2w3.A02;
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) c78573fP.A0K;
            if (Float.compare(c78573fP.A0I, YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.mNativePointer)).A00) != 0) {
                YogaNative.jni_YGNodeStyleSetWidthAutoJNI(yogaNodeJNIBase.mNativePointer);
            }
            if (Float.compare(c78573fP.A0H, YogaNodeJNIBase.valueFromLong(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.mNativePointer)).A00) != 0) {
                YogaNative.jni_YGNodeStyleSetHeightAutoJNI(yogaNodeJNIBase.mNativePointer);
            }
        }
    }

    public static final void A07(C2W1 c2w1, C78543fM c78543fM) {
        List list;
        C2WG c2wg;
        C2WG c2wg2;
        C2WG c2wg3;
        C2WG c2wg4;
        C2WG c2wg5;
        C2WG c2wg6;
        EnumC77763e0 enumC77763e0;
        EnumC77763e0 enumC77763e02;
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) c78543fM.A03;
        YogaNative.jni_YGNodeStyleSetDirectionJNI(yogaNodeJNIBase.mNativePointer, AbstractC78553fN.A01(c2w1.A01()).A00);
        EnumC77003cm enumC77003cm = c2w1.A0U;
        if (enumC77003cm != null) {
            YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(yogaNodeJNIBase.mNativePointer, enumC77003cm.A00);
        }
        C3e8 c3e8 = c2w1.A0W;
        if (c3e8 != null) {
            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(yogaNodeJNIBase.mNativePointer, c3e8.A00);
        }
        EnumC77683ds enumC77683ds = c2w1.A0S;
        if (enumC77683ds != null) {
            YogaNative.jni_YGNodeStyleSetAlignContentJNI(yogaNodeJNIBase.mNativePointer, enumC77683ds.A00);
        }
        EnumC77683ds enumC77683ds2 = c2w1.A0T;
        if (enumC77683ds2 != null) {
            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(yogaNodeJNIBase.mNativePointer, enumC77683ds2.A00);
        }
        EnumC115945Mk enumC115945Mk = c2w1.A0Y;
        if (enumC115945Mk != null) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.mNativePointer, enumC115945Mk.A00);
        }
        Integer num = c2w1.A0Z;
        EnumC222829sN enumC222829sN = c2w1.A0V;
        if (num != null && enumC222829sN != null) {
            YogaNative.jni_YGNodeStyleSetGapJNI(yogaNodeJNIBase.mNativePointer, enumC222829sN.A00, num.intValue());
        }
        InterfaceC50872Vi interfaceC50872Vi = c2w1.A0X;
        if (interfaceC50872Vi != null) {
            yogaNodeJNIBase.mMeasureFunction = interfaceC50872Vi;
            YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.mNativePointer, true);
        }
        boolean z = false;
        for (C2Y5 c2y5 : c2w1.A0u) {
            AbstractC50812Vc abstractC50812Vc = c2y5.A03;
            C78313ex c78313ex = c2w1.A0L;
            if (c78313ex != null && AbstractC50812Vc.A02(abstractC50812Vc)) {
                if (!z) {
                    C50952Vr c50952Vr = c78313ex.A0M;
                    if (c50952Vr != null) {
                        if (!c2w1.A0q && c2w1.A0M == null) {
                            c2w1.A0M = c50952Vr;
                        } else {
                            c50952Vr.A00(c2w1.A09());
                        }
                    }
                    long j = c2w1.A06;
                    if ((j & 128) == 0 || c2w1.A03 == 0) {
                        int i = ((C2W1) c78313ex).A03;
                        j |= 128;
                        c2w1.A06 = j;
                        c2w1.A03 = i;
                    }
                    c2w1.A0m = c78313ex.A0m;
                    if ((c78313ex.A06 & 8589934592L) != 0) {
                        boolean z2 = c78313ex.A0l;
                        j |= 8589934592L;
                        c2w1.A06 = j;
                        c2w1.A0l = z2;
                    }
                    if ((c78313ex.A06 & 262144) != 0) {
                        Drawable drawable = c78313ex.A0B;
                        j |= 262144;
                        c2w1.A06 = j;
                        c2w1.A0B = drawable;
                        c2w1.A0A = c78313ex.A0A;
                    }
                    if ((c78313ex.A06 & 524288) != 0) {
                        Drawable drawable2 = c78313ex.A0C;
                        j |= 524288;
                        c2w1.A06 = j;
                        c2w1.A0C = drawable2;
                    }
                    if (c78313ex.A0n) {
                        c2w1.A0n = true;
                    }
                    if ((c78313ex.A06 & 1048576) != 0) {
                        C2V9 c2v9 = c78313ex.A0K;
                        c2w1.A06 = j | 1048576;
                        c2w1.A0K = C76983ck.A01(c2w1.A0K, c2v9);
                    }
                    if ((c78313ex.A06 & 2097152) != 0) {
                        C2V9 c2v92 = c78313ex.A0F;
                        c2w1.A06 |= 2097152;
                        c2w1.A0F = C76983ck.A01(c2w1.A0F, c2v92);
                    }
                    if ((c78313ex.A06 & 4194304) != 0) {
                        C2V9 c2v93 = c78313ex.A0G;
                        c2w1.A06 |= 4194304;
                        c2w1.A0G = C76983ck.A01(c2w1.A0G, c2v93);
                    }
                    if ((c78313ex.A06 & 8388608) != 0) {
                        C2V9 c2v94 = c78313ex.A0H;
                        c2w1.A06 |= 8388608;
                        c2w1.A0H = C76983ck.A01(c2w1.A0H, c2v94);
                    }
                    if ((c78313ex.A06 & 16777216) != 0) {
                        C2V9 c2v95 = c78313ex.A0I;
                        c2w1.A06 |= 16777216;
                        c2w1.A0I = C76983ck.A01(c2w1.A0I, c2v95);
                    }
                    if ((c78313ex.A06 & 2147483648L) != 0) {
                        C2V9 c2v96 = c78313ex.A0J;
                        c2w1.A06 |= 2147483648L;
                        c2w1.A0J = C76983ck.A01(c2w1.A0J, c2v96);
                    }
                    String str = c78313ex.A0a;
                    if (str != null) {
                        c2w1.A0a = str;
                    }
                    int[] iArr = c78313ex.A02;
                    if (iArr != null) {
                        c2w1.A0C(c78313ex.A09, c78313ex.A0v, iArr, c78313ex.A0w);
                    }
                    if ((c78313ex.A06 & 134217728) != 0) {
                        String str2 = c78313ex.A0b;
                        String str3 = c78313ex.A0c;
                        if (str2 != null && str2.length() != 0) {
                            c2w1.A06 |= 134217728;
                            c2w1.A0b = str2;
                            c2w1.A0c = str3;
                        }
                    }
                    if ((c78313ex.A06 & 4294967296L) != 0) {
                        EnumC76913cd enumC76913cd = c78313ex.A0N;
                        c2w1.A06 |= 4294967296L;
                        c2w1.A0N = enumC76913cd;
                    }
                    float f = ((C2W1) c78313ex).A00;
                    if (f != 0.0f) {
                        c2w1.A00 = f;
                    }
                    float f2 = ((C2W1) c78313ex).A01;
                    if (f2 != 0.0f) {
                        c2w1.A01 = f2;
                    }
                    if ((c78313ex.A06 & 536870912) != 0) {
                        StateListAnimator stateListAnimator = c78313ex.A07;
                        c2w1.A06 |= 536870912;
                        c2w1.A07 = stateListAnimator;
                        c2w1.A0n = true;
                    }
                    if ((c78313ex.A06 & 1073741824) != 0) {
                        int i2 = ((C2W1) c78313ex).A05;
                        c2w1.A06 |= 1073741824;
                        c2w1.A05 = i2;
                        c2w1.A0n = true;
                    }
                    int i3 = ((C2W1) c78313ex).A04;
                    if (i3 != -1) {
                        Paint paint = c78313ex.A08;
                        c2w1.A04 = i3;
                        c2w1.A08 = paint;
                    }
                    C2WG c2wg7 = c78313ex.A01;
                    boolean[] zArr = c78313ex.A03;
                    c2w1.A0D = c2wg7;
                    c2w1.A0s = zArr;
                    c2w1.A0k = C2W1.A0y.A03(c2w1);
                    Rect rect = c2w1.A0A;
                    if (rect != null) {
                        A04(rect, c78543fM);
                    }
                    z = true;
                }
            } else {
                C50932Vp c50932Vp = c2y5.A00;
                if (c50932Vp != null) {
                    Context context = c2w1.A05().A0C;
                    C14360o3.A07(context);
                    int i4 = c50932Vp.A00;
                    if (i4 != 0) {
                        TypedArray typedArray = null;
                        try {
                            typedArray = context.obtainStyledAttributes(null, COC.A00, 0, i4);
                            int indexCount = typedArray.getIndexCount();
                            for (int i5 = 0; i5 < indexCount; i5++) {
                                int index = typedArray.getIndex(i5);
                                if (index == 7) {
                                    int layoutDimension = typedArray.getLayoutDimension(index, -1);
                                    if (layoutDimension >= 0) {
                                        c78543fM.A07(layoutDimension);
                                    }
                                } else if (index == 8) {
                                    int layoutDimension2 = typedArray.getLayoutDimension(index, -1);
                                    if (layoutDimension2 >= 0) {
                                        c78543fM.A04(layoutDimension2);
                                    }
                                } else if (index == 16) {
                                    c78543fM.A05(typedArray.getDimensionPixelSize(index, 0));
                                } else if (index == 15) {
                                    c78543fM.A06(typedArray.getDimensionPixelSize(index, 0));
                                } else {
                                    if (index != 2) {
                                        if (index == 3) {
                                            enumC77763e02 = EnumC77763e0.TOP;
                                        } else if (index == 4) {
                                            enumC77763e02 = EnumC77763e0.RIGHT;
                                        } else if (index == 5) {
                                            enumC77763e02 = EnumC77763e0.BOTTOM;
                                        } else if (index == 19) {
                                            enumC77763e02 = EnumC77763e0.START;
                                        } else if (index == 20) {
                                            enumC77763e02 = EnumC77763e0.END;
                                        } else if (index == 1) {
                                            enumC77763e02 = EnumC77763e0.ALL;
                                        } else {
                                            if (index != 10) {
                                                if (index == 11) {
                                                    enumC77763e0 = EnumC77763e0.TOP;
                                                } else if (index == 12) {
                                                    enumC77763e0 = EnumC77763e0.RIGHT;
                                                } else if (index == 13) {
                                                    enumC77763e0 = EnumC77763e0.BOTTOM;
                                                } else if (index == 21) {
                                                    enumC77763e0 = EnumC77763e0.START;
                                                } else if (index == 22) {
                                                    enumC77763e0 = EnumC77763e0.END;
                                                } else if (index == 9) {
                                                    enumC77763e0 = EnumC77763e0.ALL;
                                                }
                                            } else {
                                                enumC77763e0 = EnumC77763e0.LEFT;
                                            }
                                            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, 0);
                                            if (!(c78543fM instanceof C78583fQ)) {
                                                YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, enumC77763e0.A00, dimensionPixelOffset);
                                            }
                                        }
                                    } else {
                                        enumC77763e02 = EnumC77763e0.LEFT;
                                    }
                                    c78543fM.E3E(enumC77763e02, typedArray.getDimensionPixelOffset(index, 0));
                                }
                            }
                            typedArray.recycle();
                        } finally {
                        }
                    }
                    Rect rect2 = c50932Vp.A02;
                    if (rect2 != null) {
                        A04(rect2, c78543fM);
                    }
                    C77753dz c77753dz = c50932Vp.A04;
                    if (c77753dz != null) {
                        if ((c77753dz.A0I & 1) != 0) {
                            c78543fM.A07(c77753dz.A0J);
                        }
                        if ((c77753dz.A0I & 2) != 0) {
                            c78543fM.A03(c77753dz.A0A);
                        }
                        if ((c77753dz.A0I & 4) != 0) {
                            c78543fM.A06(c77753dz.A0H);
                        }
                        if ((c77753dz.A0I & 8) != 0) {
                            float f3 = c77753dz.A09;
                            if (!(c78543fM instanceof C78583fQ)) {
                                c78543fM.A01 = f3;
                                YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(yogaNodeJNIBase.mNativePointer, f3);
                            }
                        }
                        if ((c77753dz.A0I & 16) != 0) {
                            int i6 = c77753dz.A0F;
                            if (!(c78543fM instanceof C78583fQ)) {
                                float f4 = i6;
                                c78543fM.A01 = f4;
                                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.mNativePointer, f4);
                            }
                        }
                        if ((c77753dz.A0I & 32) != 0) {
                            float f5 = c77753dz.A07;
                            if (!(c78543fM instanceof C78583fQ)) {
                                c78543fM.A01 = f5;
                                YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(yogaNodeJNIBase.mNativePointer, f5);
                            }
                        }
                        if ((c77753dz.A0I & 64) != 0) {
                            c78543fM.A04(c77753dz.A0D);
                        }
                        if ((c77753dz.A0I & 128) != 0) {
                            c78543fM.A02(c77753dz.A05);
                        }
                        if ((c77753dz.A0I & 256) != 0) {
                            c78543fM.A05(c77753dz.A0G);
                        }
                        if ((c77753dz.A0I & 512) != 0) {
                            float f6 = c77753dz.A08;
                            if (!(c78543fM instanceof C78583fQ)) {
                                c78543fM.A00 = f6;
                                YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(yogaNodeJNIBase.mNativePointer, f6);
                            }
                        }
                        if ((c77753dz.A0I & 1024) != 0) {
                            int i7 = c77753dz.A0E;
                            if (!(c78543fM instanceof C78583fQ)) {
                                float f7 = i7;
                                c78543fM.A00 = f7;
                                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.mNativePointer, f7);
                            }
                        }
                        if ((c77753dz.A0I & C3OO.FLAG_MOVED) != 0) {
                            float f8 = c77753dz.A06;
                            if (!(c78543fM instanceof C78583fQ)) {
                                c78543fM.A00 = f8;
                                YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(yogaNodeJNIBase.mNativePointer, f8);
                            }
                        }
                        if ((c77753dz.A0I & 4096) != 0) {
                            C78233ep c78233ep = c77753dz.A0Q;
                            c78233ep.getClass();
                            int i8 = c78233ep.A00;
                            if (!(c78543fM instanceof C78583fQ)) {
                                YogaNative.jni_YGNodeStyleSetDirectionJNI(yogaNodeJNIBase.mNativePointer, AbstractC78553fN.A01(i8).A00);
                            }
                        }
                        if ((c77753dz.A0I & 8192) != 0) {
                            EnumC77683ds enumC77683ds3 = c77753dz.A0R;
                            enumC77683ds3.getClass();
                            c78543fM.A08(enumC77683ds3);
                        }
                        if ((c77753dz.A0I & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
                            float f9 = c77753dz.A01;
                            if (!(c78543fM instanceof C78583fQ)) {
                                YogaNative.jni_YGNodeStyleSetFlexJNI(yogaNodeJNIBase.mNativePointer, f9);
                            }
                        }
                        if ((c77753dz.A0I & Constants.LOAD_RESULT_PGO) != 0) {
                            c78543fM.A00(c77753dz.A03);
                        }
                        if ((c77753dz.A0I & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
                            c78543fM.A01(c77753dz.A04);
                        }
                        if ((c77753dz.A0I & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
                            int i9 = c77753dz.A0B;
                            if (!(c78543fM instanceof C78583fQ)) {
                                YogaNative.jni_YGNodeStyleSetFlexBasisJNI(yogaNodeJNIBase.mNativePointer, i9);
                            }
                        }
                        if ((c77753dz.A0I & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                            float f10 = c77753dz.A02;
                            if (!(c78543fM instanceof C78583fQ)) {
                                YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(yogaNodeJNIBase.mNativePointer, f10);
                            }
                        }
                        if ((c77753dz.A0I & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
                            float f11 = c77753dz.A00;
                            if (!(c78543fM instanceof C78583fQ)) {
                                YogaNative.jni_YGNodeStyleSetAspectRatioJNI(yogaNodeJNIBase.mNativePointer, f11);
                            }
                        }
                        if ((c77753dz.A0I & 1048576) != 0) {
                            EnumC77933eL enumC77933eL = c77753dz.A0T;
                            enumC77933eL.getClass();
                            c78543fM.A0C(enumC77933eL);
                        }
                        if ((c77753dz.A0I & 2097152) != 0 && (c2wg6 = c77753dz.A0P) != null) {
                            int i10 = C2WG.A03;
                            for (int i11 = 0; i11 < i10; i11++) {
                                float A01 = c2wg6.A01(i11);
                                if (!C3e2.A00(A01)) {
                                    EnumC77763e0 A002 = EnumC77763e0.A00(i11);
                                    C14360o3.A07(A002);
                                    int i12 = (int) A01;
                                    if (!(c78543fM instanceof C78583fQ)) {
                                        YogaNative.jni_YGNodeStyleSetPositionJNI(yogaNodeJNIBase.mNativePointer, A002.A00, i12);
                                    }
                                }
                            }
                        }
                        if ((c77753dz.A0I & 4194304) != 0 && (c2wg5 = c77753dz.A0O) != null) {
                            int i13 = C2WG.A03;
                            for (int i14 = 0; i14 < i13; i14++) {
                                float A012 = c2wg5.A01(i14);
                                if (!C3e2.A00(A012)) {
                                    EnumC77763e0 A003 = EnumC77763e0.A00(i14);
                                    C14360o3.A07(A003);
                                    if (!(c78543fM instanceof C78583fQ)) {
                                        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(yogaNodeJNIBase.mNativePointer, A003.A00, A012);
                                    }
                                }
                            }
                        }
                        if ((c77753dz.A0I & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0 && (c2wg4 = c77753dz.A0N) != null) {
                            int i15 = C2WG.A03;
                            for (int i16 = 0; i16 < i15; i16++) {
                                float A013 = c2wg4.A01(i16);
                                if (!C3e2.A00(A013)) {
                                    EnumC77763e0 A004 = EnumC77763e0.A00(i16);
                                    C14360o3.A07(A004);
                                    c78543fM.E3E(A004, (int) A013);
                                }
                            }
                        }
                        if ((c77753dz.A0I & 16777216) != 0 && (c2wg3 = c77753dz.A0M) != null) {
                            int i17 = C2WG.A03;
                            for (int i18 = 0; i18 < i17; i18++) {
                                float A014 = c2wg3.A01(i18);
                                if (!C3e2.A00(A014)) {
                                    EnumC77763e0 A005 = EnumC77763e0.A00(i18);
                                    C14360o3.A07(A005);
                                    c78543fM.A0A(A005, A014);
                                }
                            }
                        }
                        if ((c77753dz.A0I & 33554432) != 0 && (c2wg2 = c77753dz.A0L) != null) {
                            int i19 = C2WG.A03;
                            for (int i20 = 0; i20 < i19; i20++) {
                                float A015 = c2wg2.A01(i20);
                                if (!C3e2.A00(A015)) {
                                    EnumC77763e0 A006 = EnumC77763e0.A00(i20);
                                    C14360o3.A07(A006);
                                    int i21 = (int) A015;
                                    if (!(c78543fM instanceof C78583fQ)) {
                                        YogaNative.jni_YGNodeStyleSetMarginJNI(yogaNodeJNIBase.mNativePointer, A006.A00, i21);
                                    }
                                }
                            }
                        }
                        if ((c77753dz.A0I & 67108864) != 0 && (c2wg = c77753dz.A0K) != null) {
                            int i22 = C2WG.A03;
                            for (int i23 = 0; i23 < i22; i23++) {
                                float A016 = c2wg.A01(i23);
                                if (!C3e2.A00(A016)) {
                                    EnumC77763e0 A007 = EnumC77763e0.A00(i23);
                                    C14360o3.A07(A007);
                                    if (!(c78543fM instanceof C78583fQ)) {
                                        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(yogaNodeJNIBase.mNativePointer, A007.A00, A016);
                                    }
                                }
                            }
                        }
                        if ((c77753dz.A0I & 134217728) != 0 && (list = c77753dz.A0U) != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                c78543fM.A09((EnumC77763e0) it.next());
                            }
                        }
                        if ((c77753dz.A0I & 268435456) != 0) {
                            boolean z3 = c77753dz.A0V;
                            if (!(c78543fM instanceof C78583fQ)) {
                                YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(yogaNodeJNIBase.mNativePointer, z3);
                            }
                        }
                        if (c77753dz.A0W && !(c78543fM instanceof C78583fQ)) {
                            yogaNodeJNIBase.mBaselineFunction = T2G.A00;
                            YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.mNativePointer, true);
                        }
                        EnumC222829sN enumC222829sN2 = c77753dz.A0S;
                        if (enumC222829sN2 != null) {
                            int i24 = c77753dz.A0C;
                            if (!(c78543fM instanceof C78583fQ)) {
                                YogaNative.jni_YGNodeStyleSetGapJNI(yogaNodeJNIBase.mNativePointer, enumC222829sN2.A00, i24);
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        if ((c2w1.A06 & 268435456) != 0) {
            int[] iArr2 = c2w1.A0x;
            int i25 = 0;
            loop9: while (true) {
                EnumC77763e0 enumC77763e03 = EnumC77763e0.LEFT;
                while (true) {
                    c78543fM.A0B(enumC77763e03, iArr2[i25]);
                    i25++;
                    if (i25 >= 4) {
                        break loop9;
                    }
                    if (i25 >= 0) {
                        if (i25 != 0) {
                            if (i25 != 1) {
                                if (i25 != 2) {
                                    enumC77763e03 = EnumC77763e0.BOTTOM;
                                } else {
                                    enumC77763e03 = EnumC77763e0.RIGHT;
                                }
                            } else {
                                enumC77763e03 = EnumC77763e0.TOP;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0O("Given index out of range of acceptable edges: ", i25));
                    }
                }
            }
        }
        C2WG c2wg8 = c2w1.A0D;
        if (c2wg8 != null) {
            int i26 = C2WG.A03;
            for (int i27 = 0; i27 < i26; i27++) {
                float A017 = c2wg8.A01(i27);
                if (!C3e2.A00(A017)) {
                    EnumC77763e0 A008 = EnumC77763e0.A00(i27);
                    C14360o3.A07(A008);
                    boolean[] zArr2 = c2w1.A0s;
                    if (zArr2 != null && Boolean.valueOf(zArr2[A008.A00]) != null) {
                        c78543fM.A0A(A008, A017);
                    } else {
                        c78543fM.E3E(A008, (int) A017);
                    }
                }
            }
        }
        c2w1.A0p = c78543fM.A02;
    }

    private final C2W3 A01(C2W3 c2w3, C78473fD c78473fD, AbstractC78533fL abstractC78533fL, boolean z) {
        C2W1 A04 = c2w3.A04();
        C2W3 A002 = A00(c2w3, A04, abstractC78533fL);
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC78533fL;
        yogaNodeJNIBase.mData = new Pair(c78473fD, A002);
        A05(A002, A04, c78473fD);
        List list = c2w3.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2W3 c2w32 = (C2W3) list.get(i);
            List list2 = yogaNodeJNIBase.mChildren;
            if (list2 != null) {
                AbstractC78533fL abstractC78533fL2 = (AbstractC78533fL) list2.get(i);
                C14360o3.A07(abstractC78533fL2);
                A002.A03.add(A01(c2w32, c78473fD, abstractC78533fL2, z));
            } else {
                throw new IllegalStateException("YogaNode does not have children");
            }
        }
        return A002;
    }
}
