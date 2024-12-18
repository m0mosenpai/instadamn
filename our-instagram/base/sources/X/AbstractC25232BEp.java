package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.BEp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25232BEp {
    public static C51722Yv A15(C51722Yv c51722Yv, Integer num, Object obj) {
        return new C51722Yv(c51722Yv, new C9CV(num, obj, 3));
    }

    public static C51722Yv A16(C51722Yv c51722Yv, Integer num, Object obj) {
        return new C51722Yv(c51722Yv, new C9CV(num, obj, 4));
    }

    public static C51532Yb A1A(InterfaceC51522Ya interfaceC51522Ya) {
        return new C51532Yb(C77603dk.A00, interfaceC51522Ya, 3, true);
    }

    public static C51532Yb A1B(InterfaceC51522Ya interfaceC51522Ya) {
        return new C51532Yb(C77603dk.A00, interfaceC51522Ya, 3, false);
    }

    public static C24891Jo A1H(InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        return c24891Jo;
    }

    public static void A1N(C77723dw c77723dw, boolean z) {
        c77723dw.A0Z(z);
        c77723dw.A0a(true);
        c77723dw.A0D();
        c77723dw.A06(null);
    }

    public static float A01(C5Y1 c5y1) {
        return ((Number) c5y1.A04.getValue()).floatValue();
    }

    public static int A0p(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        C14360o3.A0B(obj2, 0);
        return intValue;
    }

    public static long A0q() {
        return 1 | (1 << 32);
    }

    public static long A0t(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0L;
    }

    public static InterfaceC1333460b A0v(InterfaceC1333460b interfaceC1333460b, int i) {
        if (i != 0) {
            return new C1333560c(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return interfaceC1333460b;
    }

    public static InterfaceC1127857k A0z(InterfaceC118275Wp interfaceC118275Wp, C5Tl c5Tl, InterfaceC118225Wj interfaceC118225Wj, int i) {
        int i2 = i >> 3;
        return AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, (i2 & 112) | (i2 & 14));
    }

    public static C2Z0 A11(AbstractC50812Vc abstractC50812Vc, C2XE c2xe) {
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        c2z0.A00(abstractC50812Vc);
        return c2z0;
    }

    public static C2Z0 A12(C76223bS c76223bS) {
        return new C2Z0(c76223bS.A05, new ArrayList());
    }

    public static C2Z0 A13(C2Z0 c2z0) {
        return new C2Z0(c2z0.A00, new ArrayList());
    }

    public static C51722Yv A14(C51722Yv c51722Yv, int i, long j) {
        return new C51722Yv(c51722Yv, new C9CU(C05F.A07, i, j));
    }

    public static C51722Yv A17(Integer num, Object obj, int i) {
        return new C51722Yv(null, new C9CV(num, obj, i));
    }

    public static C2JS A18(Object obj) {
        return (C2JS) ((AnonymousClass435) ((C3NX) obj).A00).A01;
    }

    public static Object A1C(C5Tl c5Tl, Object obj, Object obj2) {
        if (obj == obj2) {
            C5XN c5xn = new C5XN();
            c5Tl.FBy(c5xn);
            return c5xn;
        }
        return obj;
    }

    public static String A1D(C5Tl c5Tl) {
        return ((InterfaceC11380iw) c5Tl.AJX(C5VZ.A00)).getModuleName();
    }

    public static String A1E(BLI bli) {
        return MWD.A01(bli.A06.A06().A0L);
    }

    public static LinkedHashMap A1F(Object obj, Object obj2, C09530e4 c09530e4, C09530e4 c09530e42) {
        return AbstractC06930Yk.A06(c09530e4, c09530e42, new C09530e4(obj, obj2));
    }

    public static List A1G(C1132359l c1132359l, long j) {
        return AbstractC16960so.A1Q(c1132359l, new C1132359l(j));
    }

    public static void A1J(AbstractC52922bZ abstractC52922bZ, InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        AbstractC18560vj.A03(AbstractC141776au.A00(abstractC52922bZ), new C15340po(interfaceC16620sF, interfaceC19390xP));
    }

    public static void A1K(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, str);
        interfaceC02590Ai.AAP("action", "tap");
    }

    public static void A1M(C77723dw c77723dw) {
        c77723dw.A0L(1.0f);
        c77723dw.A0b(true);
        c77723dw.A0N(0);
        c77723dw.A0E();
    }

    public static void A1O(Object obj) {
        ((C51762Yz) obj).A01(false);
    }

    public static void A1P(Object obj, Object obj2) {
        C14360o3.A0B(obj, 10);
        C14360o3.A0B(obj2, 11);
    }

    public static boolean A1R(int i) {
        if (i != 16384) {
            return false;
        }
        return true;
    }

    public static boolean A1S(int i) {
        if (i != 256) {
            return false;
        }
        return true;
    }

    public static boolean A1V(C5Tl c5Tl, C117505Tk c117505Tk, Object obj, Object obj2, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        C5UX.A04(c5Tl, obj2, (InterfaceC16620sF) obj);
        return C0fH.A02();
    }

    public static int A02(Context context, C2YS c2ys) {
        return c2ys.BoZ().A02(AbstractC53242c7.A0A(context));
    }

    public static int A03(Context context, C2YS c2ys, int i) {
        return c2ys.BoZ().A02(AbstractC53242c7.A0H(context, i));
    }

    public static int A04(C5Tl c5Tl, float f) {
        if (!c5Tl.AH1(f)) {
            return 16;
        }
        return 32;
    }

    public static int A05(C5Tl c5Tl, float f) {
        if (!c5Tl.AH1(f)) {
            return 128;
        }
        return 256;
    }

    public static int A06(C5Tl c5Tl, float f) {
        if (!c5Tl.AH1(f)) {
            return 1024;
        }
        return C3OO.FLAG_MOVED;
    }

    public static int A07(C5Tl c5Tl, float f) {
        if (!c5Tl.AH1(f)) {
            return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        }
        return 1048576;
    }

    public static int A08(C5Tl c5Tl, int i) {
        if (!c5Tl.AH2(i)) {
            return 2;
        }
        return 4;
    }

    public static int A09(C5Tl c5Tl, int i) {
        if (!c5Tl.AH2(i)) {
            return 16;
        }
        return 32;
    }

    public static int A0A(C5Tl c5Tl, int i) {
        if (!c5Tl.AH2(i)) {
            return 1024;
        }
        return C3OO.FLAG_MOVED;
    }

    public static int A0B(C5Tl c5Tl, int i) {
        if (!c5Tl.AH2(i)) {
            return 8192;
        }
        return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
    }

    public static int A0C(C5Tl c5Tl, int i) {
        if (!c5Tl.AH2(i)) {
            return Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
    }

    public static int A0D(C5Tl c5Tl, int i) {
        if (!c5Tl.AH2(i)) {
            return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        }
        return 1048576;
    }

    public static int A0E(C5Tl c5Tl, long j) {
        if (!c5Tl.AH3(j)) {
            return 16;
        }
        return 32;
    }

    public static int A0F(C5Tl c5Tl, long j) {
        if (!c5Tl.AH3(j)) {
            return 128;
        }
        return 256;
    }

    public static int A0G(C5Tl c5Tl, long j) {
        if (!c5Tl.AH3(j)) {
            return 1024;
        }
        return C3OO.FLAG_MOVED;
    }

    public static int A0H(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 2;
        }
        return 4;
    }

    public static int A0I(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 16;
        }
        return 32;
    }

    public static int A0J(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 128;
        }
        return 256;
    }

    public static int A0K(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 1024;
        }
        return C3OO.FLAG_MOVED;
    }

    public static int A0L(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 8192;
        }
        return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
    }

    public static int A0M(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
    }

    public static int A0N(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        }
        return 1048576;
    }

    public static int A0O(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 4194304;
        }
        return DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
    }

    public static int A0P(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 33554432;
        }
        return 67108864;
    }

    public static int A0Q(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH6(obj)) {
            return 268435456;
        }
        return 536870912;
    }

    public static int A0R(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 2;
        }
        return 4;
    }

    public static int A0S(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 16;
        }
        return 32;
    }

    public static int A0T(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 128;
        }
        return 256;
    }

    public static int A0U(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 1024;
        }
        return C3OO.FLAG_MOVED;
    }

    public static int A0V(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 8192;
        }
        return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
    }

    public static int A0W(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
    }

    public static int A0X(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        }
        return 1048576;
    }

    public static int A0Y(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 4194304;
        }
        return DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
    }

    public static int A0Z(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 33554432;
        }
        return 67108864;
    }

    public static int A0a(C5Tl c5Tl, Object obj) {
        if (!c5Tl.AH4(obj)) {
            return 268435456;
        }
        return 536870912;
    }

    public static int A0b(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 2;
        }
        return 4;
    }

    public static int A0c(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 16;
        }
        return 32;
    }

    public static int A0d(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 128;
        }
        return 256;
    }

    public static int A0e(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 1024;
        }
        return C3OO.FLAG_MOVED;
    }

    public static int A0f(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 8192;
        }
        return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
    }

    public static int A0g(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return Constants.LOAD_RESULT_PGO_ATTEMPTED;
        }
        return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
    }

    public static int A0h(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        }
        return 1048576;
    }

    public static int A0i(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 4194304;
        }
        return DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
    }

    public static int A0j(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 33554432;
        }
        return 67108864;
    }

    public static int A0k(C5Tl c5Tl, boolean z) {
        if (!c5Tl.AH5(z)) {
            return 268435456;
        }
        return 536870912;
    }

    public static int A0l(C76223bS c76223bS, double d) {
        return C2Z3.A00(c76223bS.BoZ(), Double.doubleToRawLongBits(d));
    }

    public static int A0m(C2Z0 c2z0, double d) {
        return C2Z3.A00(c2z0.BoZ(), Double.doubleToRawLongBits(d));
    }

    public static int A0n(C2Z1 c2z1, long j) {
        C2XH c2xh = c2z1.ArD().A0D;
        C14360o3.A07(c2xh);
        return C2Z3.A00(c2xh, j);
    }

    public static int A0o(C2YS c2ys, double d) {
        return C2Z3.A00(c2ys.BoZ(), Double.doubleToRawLongBits(d));
    }

    public static long A0r(float f) {
        return Float.floatToRawIntBits(f) | 9221683186994511872L;
    }

    public static long A0s(InterfaceC119205ac interfaceC119205ac) {
        return AbstractC119215ad.A00(interfaceC119205ac.getWidth(), interfaceC119205ac.getHeight());
    }

    public static ValueAnimator A0u(float[] fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    public static ParcelableSnapshotMutableState A0w(C5Tl c5Tl, Object obj) {
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(A00, obj);
        c5Tl.FBy(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public static Modifier A0x(C5Tl c5Tl, Modifier modifier) {
        return C6L3.A01(modifier, C5AF.A00, C5XL.A00(c5Tl).A0B);
    }

    public static Modifier A0y(C5Tl c5Tl, Modifier modifier) {
        return C6L3.A01(modifier, C5AF.A00, C5XL.A00(c5Tl).A0k);
    }

    public static InterfaceC02590Ai A10(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        return A01.A00(A01.A00, "instagram_clips_viewer_organic_tap");
    }

    public static C2YU A19(int i, int i2) {
        return new C2YU(AbstractC78673fZ.A00(i, i2), null);
    }

    public static void A1I(AnonymousClass596 anonymousClass596, AnonymousClass585 anonymousClass585, AnonymousClass588 anonymousClass588, InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        anonymousClass596.EKS();
        anonymousClass588.ETE(interfaceC1128957x);
        anonymousClass588.EY4(anonymousClass583);
        anonymousClass588.ERA(anonymousClass585);
    }

    public static void A1L(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
        interfaceC02590Ai.Cht();
    }

    public static void A1Q(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (!C14360o3.A0K(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static boolean A1T(C5Tl c5Tl, float f) {
        if (c5Tl.AH1(f)) {
            return true;
        }
        return false;
    }

    public static boolean A1U(C5Tl c5Tl, int i, int i2, int i3) {
        c5Tl.Eno(i);
        if (i2 != i3) {
            return false;
        }
        return true;
    }

    public static boolean A1W(C5Tl c5Tl, Object obj, int i, boolean z) {
        c5Tl.Eno(i);
        return c5Tl.AH5(z) | c5Tl.AH4(obj);
    }

    public static boolean A1X(C5Tl c5Tl, Object obj, Object obj2, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH6(obj) | c5Tl.AH4(obj2);
    }

    public static boolean A1Y(C5Tl c5Tl, Object obj, Object obj2, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH4(obj) | c5Tl.AH6(obj2);
    }

    public static boolean A1Z(C5Tl c5Tl, Object obj, Object obj2, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH4(obj) | c5Tl.AH4(obj2);
    }

    public static boolean A1a(C5Tl c5Tl, Object obj, Object obj2, boolean z) {
        return z | c5Tl.AH4(obj) | c5Tl.AH4(obj2);
    }

    public static boolean A1b(C5Tl c5Tl, Object obj, Object obj2, boolean z) {
        return z | c5Tl.AH6(obj) | c5Tl.AH6(obj2);
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
