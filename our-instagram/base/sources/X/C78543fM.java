package X;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.3fM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C78543fM implements InterfaceC50942Vq {
    public boolean A02;
    public final AbstractC78533fL A03;
    public float A01 = Float.NaN;
    public float A00 = Float.NaN;

    public void A04(int i) {
        float f = i;
        this.A00 = f;
        YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A05(int i) {
        float f = i;
        this.A00 = f;
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A06(int i) {
        float f = i;
        this.A01 = f;
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A07(int i) {
        float f = i;
        this.A01 = f;
        YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A09(EnumC77763e0 enumC77763e0) {
        C14360o3.A0B(enumC77763e0, 0);
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) this.A03).mNativePointer, enumC77763e0.A00);
    }

    @Override // X.InterfaceC50942Vq
    public void E3E(EnumC77763e0 enumC77763e0, int i) {
        C14360o3.A0B(enumC77763e0, 0);
        this.A02 = true;
        YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) this.A03).mNativePointer, enumC77763e0.A00, i);
    }

    public void A00(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A01(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A02(float f) {
        this.A00 = f;
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A03(float f) {
        this.A01 = f;
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, f);
    }

    public void A08(EnumC77683ds enumC77683ds) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(((YogaNodeJNIBase) this.A03).mNativePointer, enumC77683ds.A00);
    }

    public void A0A(EnumC77763e0 enumC77763e0, float f) {
        if (!(this instanceof C78583fQ)) {
            C14360o3.A0B(enumC77763e0, 0);
            this.A02 = true;
            YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) this.A03).mNativePointer, enumC77763e0.A00, f);
        }
    }

    public void A0B(EnumC77763e0 enumC77763e0, float f) {
        if (!(this instanceof C78583fQ)) {
            C14360o3.A0B(enumC77763e0, 0);
            YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.A03).mNativePointer, enumC77763e0.A00, f);
        }
    }

    public void A0C(EnumC77933eL enumC77933eL) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(((YogaNodeJNIBase) this.A03).mNativePointer, enumC77933eL.A00);
    }

    public C78543fM(AbstractC78533fL abstractC78533fL) {
        this.A03 = abstractC78533fL;
    }
}
