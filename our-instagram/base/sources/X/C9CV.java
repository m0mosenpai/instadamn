package X;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9CV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CV implements InterfaceC51732Yw {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9CV(Integer num, Object obj, int i) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = obj;
    }

    public static C51722Yv A00(C51722Yv c51722Yv, Integer num, Object obj, int i) {
        return new C51722Yv(c51722Yv, new C9CV(num, obj, i));
    }

    @Override // X.InterfaceC51732Yw
    public final void AC4(C50932Vp c50932Vp, C2XE c2xe) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c50932Vp, 1);
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        Object obj = this.A02;
                        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        C50952Vr A02 = C50932Vp.A02(c50932Vp);
                        int i = 2;
                        if (booleanValue) {
                            i = 1;
                        }
                        A02.A09 = i;
                        return;
                    case 1:
                        Object obj2 = this.A02;
                        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                        C50952Vr A022 = C50932Vp.A02(c50932Vp);
                        A022.A0F |= 4194304;
                        A022.A0c = (String) obj2;
                        return;
                    case 2:
                        Object obj3 = this.A02;
                        C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                        C50952Vr A023 = C50932Vp.A02(c50932Vp);
                        A023.A0F |= 16777216;
                        A023.A0Z = (CharSequence) obj3;
                        return;
                    case 3:
                        Object obj4 = this.A02;
                        C14360o3.A0C(obj4, "null cannot be cast to non-null type kotlin.CharSequence");
                        C50952Vr A024 = C50932Vp.A02(c50932Vp);
                        A024.A0F |= 1;
                        A024.A0a = (CharSequence) obj4;
                        return;
                    case 4:
                        C14360o3.A0C(this.A02, "null cannot be cast to non-null type com.facebook.litho.FocusOrderModel");
                        C14360o3.A0B(null, 0);
                        throw C00O.createAndThrow();
                    case 5:
                        Object obj5 = this.A02;
                        C14360o3.A0C(obj5, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Number) obj5).intValue();
                        C76973cj A01 = C50932Vp.A01(c50932Vp);
                        A01.A02 |= 1;
                        A01.A00 = intValue;
                        return;
                    case 6:
                        Object obj6 = this.A02;
                        C14360o3.A0C(obj6, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnInitializeAccessibilityEventEvent, kotlin.Unit>");
                        C15500q5.A06(obj6, 1);
                        C77783e3 c77783e3 = new C77783e3(null, (InterfaceC16660sJ) obj6);
                        C50952Vr A025 = C50932Vp.A02(c50932Vp);
                        A025.A0F |= 128;
                        A025.A0N = c77783e3;
                        return;
                    case 7:
                        Object obj7 = this.A02;
                        C14360o3.A0C(obj7, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnInitializeAccessibilityNodeInfoEvent, kotlin.Unit>");
                        C15500q5.A06(obj7, 1);
                        C77783e3 c77783e32 = new C77783e3(null, (InterfaceC16660sJ) obj7);
                        C50952Vr A026 = C50932Vp.A02(c50932Vp);
                        A026.A0F |= 256;
                        A026.A0O = c77783e32;
                        return;
                    case 8:
                        Object obj8 = this.A02;
                        C14360o3.A0C(obj8, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnPopulateAccessibilityEventEvent, kotlin.Unit>");
                        C15500q5.A06(obj8, 1);
                        C77783e3 c77783e33 = new C77783e3(null, (InterfaceC16660sJ) obj8);
                        C50952Vr A027 = C50932Vp.A02(c50932Vp);
                        A027.A0F |= 512;
                        A027.A0Q = c77783e33;
                        return;
                    case 9:
                        Object obj9 = this.A02;
                        C14360o3.A0C(obj9, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnPopulateAccessibilityNodeEvent, kotlin.Unit>");
                        C15500q5.A06(obj9, 1);
                        C77783e3 c77783e34 = new C77783e3(null, (InterfaceC16660sJ) obj9);
                        C50952Vr A028 = C50932Vp.A02(c50932Vp);
                        A028.A0F |= 536870912;
                        A028.A0R = c77783e34;
                        return;
                    case 10:
                        Object obj10 = this.A02;
                        C14360o3.A0C(obj10, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnRequestSendAccessibilityEventEvent, kotlin.Unit>");
                        C15500q5.A06(obj10, 1);
                        C77783e3 c77783e35 = new C77783e3(null, (InterfaceC16660sJ) obj10);
                        C50952Vr A029 = C50932Vp.A02(c50932Vp);
                        A029.A0F |= OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED;
                        A029.A0S = c77783e35;
                        return;
                    case 11:
                        Object obj11 = this.A02;
                        C14360o3.A0C(obj11, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.PerformAccessibilityActionEvent, kotlin.Unit>");
                        C15500q5.A06(obj11, 1);
                        C77783e3 c77783e36 = new C77783e3(null, (InterfaceC16660sJ) obj11);
                        C50952Vr A0210 = C50932Vp.A02(c50932Vp);
                        A0210.A0F |= OdexSchemeArtXdex.STATE_DEX2OAT_CLASSPATH_SET;
                        A0210.A0U = c77783e36;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        Object obj12 = this.A02;
                        C14360o3.A0C(obj12, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.SendAccessibilityEventEvent, kotlin.Unit>");
                        C15500q5.A06(obj12, 1);
                        C77783e3 c77783e37 = new C77783e3(null, (InterfaceC16660sJ) obj12);
                        C50952Vr A0211 = C50932Vp.A02(c50932Vp);
                        A0211.A0F |= OdexSchemeArtXdex.STATE_PGO_NEEDED;
                        A0211.A0V = c77783e37;
                        return;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        Object obj13 = this.A02;
                        C14360o3.A0C(obj13, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.SendAccessibilityEventUncheckedEvent, kotlin.Unit>");
                        C15500q5.A06(obj13, 1);
                        C77783e3 c77783e38 = new C77783e3(null, (InterfaceC16660sJ) obj13);
                        C50952Vr A0212 = C50932Vp.A02(c50932Vp);
                        A0212.A0F |= OdexSchemeArtXdex.STATE_PGO_ATTEMPTED;
                        A0212.A0W = c77783e38;
                        return;
                    case 14:
                        Object obj14 = this.A02;
                        C14360o3.A0C(obj14, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.PerformActionForVirtualViewEvent, kotlin.Unit>");
                        C15500q5.A06(obj14, 1);
                        C77783e3 c77783e39 = new C77783e3(null, (InterfaceC16660sJ) obj14);
                        C50952Vr A0213 = C50932Vp.A02(c50932Vp);
                        A0213.A0F |= 4294967296L;
                        A0213.A0P = c77783e39;
                        return;
                    case Process.SIGTERM /* 15 */:
                        Object obj15 = this.A02;
                        C14360o3.A0C(obj15, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.VirtualViewKeyboardFocusChangedEvent, kotlin.Unit>");
                        C15500q5.A06(obj15, 1);
                        C77783e3 c77783e310 = new C77783e3(null, (InterfaceC16660sJ) obj15);
                        C50952Vr A0214 = C50932Vp.A02(c50932Vp);
                        A0214.A0F |= 2147483648L;
                        A0214.A0T = c77783e310;
                        return;
                    default:
                        return;
                }
            case 1:
                int i2 = 1;
                C14360o3.A0B(c50932Vp, 1);
                SparseArray sparseArray = c50932Vp.A03;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    c50932Vp.A03 = sparseArray;
                }
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        break;
                    case 1:
                        i2 = 8;
                        break;
                    case 2:
                        i2 = 12;
                        break;
                    case 3:
                        i2 = 7;
                        break;
                    case 4:
                        i2 = 13;
                        break;
                    case 5:
                        i2 = 9;
                        break;
                    case 6:
                        i2 = 10;
                        break;
                    case 7:
                        i2 = 11;
                        break;
                    case 8:
                        i2 = 5;
                        break;
                    case 9:
                        i2 = 6;
                        break;
                    case 10:
                        i2 = 2;
                        break;
                    case 11:
                        i2 = 3;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        i2 = 4;
                        break;
                    default:
                        return;
                }
                sparseArray.put(i2, this.A02);
                return;
            case 2:
                C14360o3.A0B(c50932Vp, 1);
                if (((Number) this.A01).intValue() != 0) {
                    return;
                }
                Object obj16 = this.A02;
                C14360o3.A0C(obj16, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any, kotlin.Any, kotlin.Any>");
                C77843eC c77843eC = (C77843eC) obj16;
                C14360o3.A0B(c77843eC, 0);
                C76973cj A012 = C50932Vp.A01(c50932Vp);
                Map map = A012.A0I;
                if (map == null) {
                    map = new LinkedHashMap();
                }
                map.put(c77843eC.A00.CBk(), c77843eC);
                A012.A0I = map;
                return;
            case 3:
                C14360o3.A0B(c50932Vp, 1);
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        Object obj17 = this.A02;
                        if (obj17 == null) {
                            return;
                        }
                        c50932Vp.A0O((EnumC77683ds) obj17);
                        return;
                    case 1:
                        C2WK c2wk = (C2WK) this.A02;
                        C76973cj A013 = C50932Vp.A01(c50932Vp);
                        if (c2wk == null) {
                            return;
                        }
                        A013.A02 |= 8192;
                        A013.A06 = c2wk;
                        return;
                    case 2:
                        Object obj18 = this.A02;
                        C14360o3.A0C(obj18, "null cannot be cast to non-null type com.facebook.yoga.YogaDirection");
                        c50932Vp.A0G(AbstractC78553fN.A00((EnumC78563fO) obj18));
                        return;
                    case 3:
                        Object obj19 = this.A02;
                        if (obj19 == null) {
                            return;
                        }
                        c50932Vp.A0P((EnumC77763e0) obj19);
                        return;
                    case 4:
                        Object obj20 = this.A02;
                        if (obj20 == null) {
                            return;
                        }
                        c50932Vp.A0W((EnumC77933eL) obj20);
                        return;
                    case 5:
                        Object obj21 = this.A02;
                        if (obj21 == null) {
                            return;
                        }
                        c50932Vp.A0X(((Boolean) obj21).booleanValue());
                        return;
                    case 6:
                        Object obj22 = this.A02;
                        if (obj22 == null) {
                            return;
                        }
                        c50932Vp.A0Y(((Boolean) obj22).booleanValue());
                        return;
                    default:
                        return;
                }
            default:
                C14360o3.A0B(c50932Vp, 1);
                C77783e3 c77783e311 = null;
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        c50932Vp.A0M((Drawable) this.A02);
                        return;
                    case 1:
                        Object obj23 = this.A02;
                        C14360o3.A0C(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue2 = ((Boolean) obj23).booleanValue();
                        C50952Vr A0215 = C50932Vp.A02(c50932Vp);
                        int i3 = 2;
                        if (booleanValue2) {
                            i3 = 1;
                        }
                        A0215.A0A = i3;
                        return;
                    case 2:
                        Object obj24 = this.A02;
                        C14360o3.A0C(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue3 = ((Boolean) obj24).booleanValue();
                        C50952Vr A0216 = C50932Vp.A02(c50932Vp);
                        A0216.A0F |= 8388608;
                        A0216.A0f = booleanValue3;
                        return;
                    case 3:
                        Object obj25 = this.A02;
                        C14360o3.A0C(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue4 = ((Boolean) obj25).booleanValue();
                        C50952Vr A0217 = C50932Vp.A02(c50932Vp);
                        A0217.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
                        A0217.A0g = booleanValue4;
                        return;
                    case 4:
                        Object obj26 = this.A02;
                        C14360o3.A0C(obj26, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue5 = ((Boolean) obj26).booleanValue();
                        C76973cj A014 = C50932Vp.A01(c50932Vp);
                        A014.A02 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
                        A014.A0J = booleanValue5;
                        return;
                    case 5:
                        Object obj27 = this.A02;
                        C14360o3.A0C(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue6 = ((Boolean) obj27).booleanValue();
                        C76973cj A015 = C50932Vp.A01(c50932Vp);
                        A015.A02 |= 2;
                        A015.A0K = booleanValue6;
                        return;
                    case 6:
                        Object obj28 = this.A02;
                        C14360o3.A0C(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue7 = ((Boolean) obj28).booleanValue();
                        C50952Vr A0218 = C50932Vp.A02(c50932Vp);
                        int i4 = 2;
                        if (booleanValue7) {
                            i4 = 1;
                        }
                        A0218.A0C = i4;
                        return;
                    case 7:
                        Drawable drawable = (Drawable) this.A02;
                        C76973cj A016 = C50932Vp.A01(c50932Vp);
                        A016.A02 |= 4;
                        A016.A05 = drawable;
                        return;
                    case 8:
                        Object obj29 = this.A02;
                        if (obj29 != null) {
                            C15500q5.A06(obj29, 1);
                            c77783e311 = new C77783e3(null, (InterfaceC16660sJ) obj29);
                        }
                        C50952Vr A0219 = C50932Vp.A02(c50932Vp);
                        A0219.A0F |= 8;
                        A0219.A0I = c77783e311;
                        return;
                    case 9:
                        Object obj30 = this.A02;
                        if (obj30 != null) {
                            C15500q5.A06(obj30, 1);
                            c77783e311 = new C77783e3(null, (InterfaceC16660sJ) obj30);
                        }
                        C50952Vr A0220 = C50932Vp.A02(c50932Vp);
                        A0220.A0F |= 131072;
                        A0220.A0K = c77783e311;
                        return;
                    case 10:
                        Object obj31 = this.A02;
                        if (obj31 != null) {
                            C15500q5.A06(obj31, 1);
                            c77783e311 = new C77783e3(null, (InterfaceC16660sJ) obj31);
                        }
                        C50952Vr A0221 = C50932Vp.A02(c50932Vp);
                        A0221.A0F |= 262144;
                        A0221.A0L = c77783e311;
                        return;
                    case 11:
                        Object obj32 = this.A02;
                        if (obj32 != null) {
                            C15500q5.A06(obj32, 1);
                            c77783e311 = new C77783e3(null, (InterfaceC16660sJ) obj32);
                        }
                        C50952Vr A0222 = C50932Vp.A02(c50932Vp);
                        A0222.A0F |= 16;
                        A0222.A0M = c77783e311;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        Object obj33 = this.A02;
                        if (obj33 != null) {
                            C15500q5.A06(obj33, 1);
                            c77783e311 = new C77783e3(null, (InterfaceC16660sJ) obj33);
                        }
                        C50952Vr A0223 = C50932Vp.A02(c50932Vp);
                        A0223.A0F |= 32;
                        A0223.A0X = c77783e311;
                        return;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        ViewOutlineProvider viewOutlineProvider = (ViewOutlineProvider) this.A02;
                        C50952Vr A0224 = C50932Vp.A02(c50932Vp);
                        A0224.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED;
                        A0224.A0H = viewOutlineProvider;
                        return;
                    case 14:
                        Object obj34 = this.A02;
                        C14360o3.A0C(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue8 = ((Boolean) obj34).booleanValue();
                        C50952Vr A0225 = C50932Vp.A02(c50932Vp);
                        int i5 = 2;
                        if (booleanValue8) {
                            i5 = 1;
                        }
                        A0225.A0E = i5;
                        return;
                    case Process.SIGTERM /* 15 */:
                        StateListAnimator stateListAnimator = (StateListAnimator) this.A02;
                        C76973cj A017 = C50932Vp.A01(c50932Vp);
                        A017.A02 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                        A017.A03 = stateListAnimator;
                        return;
                    case 16:
                        String str = (String) this.A02;
                        c50932Vp.A01 |= 2;
                        c50932Vp.A07 = str;
                        return;
                    case 17:
                        C50932Vp.A02(c50932Vp).A0e = (String) this.A02;
                        return;
                    case 18:
                        c50932Vp.A08 = true;
                        return;
                    case Process.SIGSTOP /* 19 */:
                        Object obj35 = this.A02;
                        C14360o3.A0C(obj35, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Number) obj35).intValue();
                        C50952Vr A0226 = C50932Vp.A02(c50932Vp);
                        A0226.A0F |= 1073741824;
                        A0226.A08 = intValue2;
                        return;
                    case 20:
                        Object obj36 = this.A02;
                        C50952Vr A0227 = C50932Vp.A02(c50932Vp);
                        A0227.A0F |= 2;
                        A0227.A0b = obj36;
                        return;
                    case 21:
                        Object obj37 = this.A02;
                        C14360o3.A0C(obj37, "null cannot be cast to non-null type android.util.SparseArray<kotlin.Any>");
                        SparseArray sparseArray2 = (SparseArray) obj37;
                        C50952Vr A0228 = C50932Vp.A02(c50932Vp);
                        A0228.A0F |= 4;
                        SparseArray sparseArray3 = A0228.A0G;
                        if (sparseArray3 != null) {
                            sparseArray2 = AbstractC79783hT.A00(sparseArray3, sparseArray2);
                        }
                        A0228.A0G = sparseArray2;
                        return;
                    case 22:
                        Object obj38 = this.A02;
                        C14360o3.A0C(obj38, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue9 = ((Boolean) obj38).booleanValue();
                        C50952Vr A0229 = C50932Vp.A02(c50932Vp);
                        int i6 = 2;
                        if (booleanValue9) {
                            i6 = 1;
                        }
                        A0229.A0B = i6;
                        return;
                    case 23:
                        Object obj39 = this.A02;
                        C14360o3.A0C(obj39, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue10 = ((Boolean) obj39).booleanValue();
                        C50952Vr A0230 = C50932Vp.A02(c50932Vp);
                        int i7 = 2;
                        if (booleanValue10) {
                            i7 = 1;
                        }
                        A0230.A0D = i7;
                        return;
                    case 24:
                        Object obj40 = this.A02;
                        C14360o3.A0C(obj40, "null cannot be cast to non-null type kotlin.Function1<android.graphics.Rect, android.graphics.Rect>");
                        C15500q5.A06(obj40, 1);
                        C14360o3.A0B(obj40, 0);
                        C76973cj A018 = C50932Vp.A01(c50932Vp);
                        List list = A018.A0H;
                        if (list == null) {
                            list = new ArrayList();
                            A018.A0H = list;
                        }
                        list.add(obj40);
                        return;
                    case 25:
                        String str2 = (String) this.A02;
                        C50952Vr A0231 = C50932Vp.A02(c50932Vp);
                        A0231.A0F |= 8589934592L;
                        A0231.A0d = str2;
                        return;
                    case 26:
                        Object obj41 = this.A02;
                        C14360o3.A0C(obj41, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, android.graphics.Paint?>");
                        C09530e4 c09530e4 = (C09530e4) obj41;
                        int intValue3 = ((Number) c09530e4.A00).intValue();
                        Paint paint = (Paint) c09530e4.A01;
                        C76973cj A019 = C50932Vp.A01(c50932Vp);
                        A019.A01 = intValue3;
                        A019.A04 = paint;
                        return;
                    default:
                        return;
                }
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
            default:
                return super.equals(obj);
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C9CV) {
            C9CV c9cv = (C9CV) obj;
            if (c9cv.A00 != i || this.A01 != c9cv.A01 || !C14360o3.A0K(this.A02, c9cv.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Number] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L35;
                case 2: goto L13;
                case 3: goto L5;
                case 4: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.hashCode()
            return r1
        La:
            java.lang.Object r2 = r3.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = X.AbstractC225159we.A00(r2)
            goto L23
        L13:
            java.lang.Object r2 = r3.A01
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 2132030724(0x7f143504, float:1.9700102E38)
            goto L27
        L1b:
            java.lang.Object r2 = r3.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = X.AbstractC225119wa.A00(r2)
        L23:
            int r1 = r0.hashCode()
        L27:
            int r0 = r2.intValue()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L4a
            r0 = 0
        L33:
            int r1 = r1 + r0
            return r1
        L35:
            java.lang.Object r2 = r3.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = X.CCH.A00(r2)
            int r1 = r0.hashCode()
            int r0 = r2.intValue()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
        L4a:
            int r0 = r0.hashCode()
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9CV.hashCode():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final String toString() {
        StringBuilder sb;
        String A00;
        switch (this.A00) {
            case 0:
                sb = new StringBuilder();
                sb.append("AccessibilityStyleItem(field=");
                Integer num = (Integer) this.A01;
                if (num != null) {
                    A00 = AbstractC225119wa.A00(num);
                    sb.append(A00);
                    sb.append(", value=");
                    sb.append(this.A02);
                    sb.append(')');
                    return sb.toString();
                }
                A00 = "null";
                sb.append(A00);
                sb.append(", value=");
                sb.append(this.A02);
                sb.append(')');
                return sb.toString();
            case 1:
                sb = new StringBuilder();
                sb.append("DynamicStyleItem(field=");
                Integer num2 = (Integer) this.A01;
                if (num2 != null) {
                    A00 = CCH.A00(num2);
                    sb.append(A00);
                    sb.append(", value=");
                    sb.append(this.A02);
                    sb.append(')');
                    return sb.toString();
                }
                A00 = "null";
                sb.append(A00);
                sb.append(", value=");
                sb.append(this.A02);
                sb.append(')');
                return sb.toString();
            case 2:
                sb = new StringBuilder();
                sb.append("ObjectStyleItem(field=");
                A00 = "DELEGATE_MOUNT_VIEW_BINDER";
                sb.append(A00);
                sb.append(", value=");
                sb.append(this.A02);
                sb.append(')');
                return sb.toString();
            case 3:
            default:
                return super.toString();
            case 4:
                sb = new StringBuilder();
                sb.append("ObjectStyleItem(field=");
                Integer num3 = (Integer) this.A01;
                if (num3 != null) {
                    A00 = AbstractC225159we.A00(num3);
                    sb.append(A00);
                    sb.append(", value=");
                    sb.append(this.A02);
                    sb.append(')');
                    return sb.toString();
                }
                A00 = "null";
                sb.append(A00);
                sb.append(", value=");
                sb.append(this.A02);
                sb.append(')');
                return sb.toString();
        }
    }

    public C9CV(C2XI c2xi, Integer num) {
        this.A00 = 1;
        C14360o3.A0B(c2xi, 2);
        this.A01 = num;
        this.A02 = c2xi;
    }
}
