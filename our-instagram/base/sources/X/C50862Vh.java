package X;

import android.util.Pair;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.2Vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50862Vh implements InterfaceC50872Vi {
    @Override // X.InterfaceC50872Vi
    public final long CpA(EnumC78643fW enumC78643fW, EnumC78643fW enumC78643fW2, AbstractC78533fL abstractC78533fL, float f, float f2) {
        C14360o3.A0B(abstractC78533fL, 0);
        C14360o3.A0B(enumC78643fW, 2);
        C14360o3.A0B(enumC78643fW2, 4);
        C78483fE c78483fE = C78483fE.A00;
        Object obj = ((YogaNodeJNIBase) abstractC78533fL).mData;
        C14360o3.A0C(obj, "null cannot be cast to non-null type android.util.Pair<*, *>");
        Object obj2 = ((Pair) obj).first;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebook.rendercore.LayoutContext<com.facebook.litho.LithoLayoutContext>");
        C78723fe A08 = c78483fE.A08(C78483fE.A03(abstractC78533fL), (C78473fD) obj2, C2XZ.A01(enumC78643fW, f), C2XZ.A01(enumC78643fW2, f2));
        return AbstractC78733ff.A00(A08.A01, A08.A00);
    }
}
