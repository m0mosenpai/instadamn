package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequesterElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.BEn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25230BEn {
    public static float A01(int i) {
        return i != 0 ? 1.0f : 0.0f;
    }

    public static int A04(int i) {
        return i != 0 ? 4 : 2;
    }

    public static int A06(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i2;
    }

    public static C117505Tk A0T(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        return c117505Tk;
    }

    public static C51532Yb A0i(InterfaceC51522Ya interfaceC51522Ya, int i) {
        return new C51532Yb(C77603dk.A00, interfaceC51522Ya, i, true);
    }

    public static C51532Yb A0j(InterfaceC51522Ya interfaceC51522Ya, boolean z) {
        return new C51532Yb(C77603dk.A00, interfaceC51522Ya, 3, z);
    }

    public static InterfaceC23621Ds A0s(AnonymousClass195 anonymousClass195) {
        if (anonymousClass195 == null) {
            return null;
        }
        anonymousClass195.AGH(null);
        return null;
    }

    public static void A15(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, i);
    }

    public static void A16(C5Tl c5Tl, C117505Tk c117505Tk) {
        C117505Tk.A0L(c117505Tk, false);
        c5Tl.ASW();
        c5Tl.ASW();
    }

    public static void A19(InterfaceC1129057z interfaceC1129057z) {
        C14360o3.A0B(interfaceC1129057z, 0);
        interfaceC1129057z.AQf();
    }

    public static void A1N(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new MW8(obj, null, i), c19l);
    }

    public static boolean A1O(float f) {
        if (Float.compare(f, 0.0f) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean A1P(int i) {
        return i < 0;
    }

    public static boolean A1Q(int i) {
        return i != 0;
    }

    public static boolean A1R(int i) {
        return i == 4;
    }

    public static boolean A1S(int i, int i2) {
        return i > i2;
    }

    public static float A00(int i) {
        return i != 0 ? 1.0f : 0.5f;
    }

    public static int A03(int i) {
        return (i & 14) | (i & 112) | (i & 896);
    }

    public static int A05(int i) {
        return i != 0 ? 32 : 16;
    }

    public static int A09(C5Tl c5Tl, Object obj) {
        if (c5Tl.AH4(obj)) {
            return C3OO.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A0A(C2XE c2xe, C2YS c2ys) {
        return c2ys.BoZ().A02(AbstractC53242c7.A0A(c2xe.A0C));
    }

    public static int A0B(C2XI c2xi) {
        return ((Number) c2xi.A00).intValue();
    }

    public static int A0F(C09530e4 c09530e4) {
        return ((Number) c09530e4.A00).intValue();
    }

    public static long A0G() {
        return 0 << 32;
    }

    public static long A0H() {
        return Double.doubleToRawLongBits(14.0d);
    }

    public static long A0I() {
        return Double.doubleToRawLongBits(32.0d);
    }

    public static long A0J() {
        return Double.doubleToRawLongBits(24.0d);
    }

    public static long A0K() {
        return Double.doubleToRawLongBits(4.0d);
    }

    public static long A0L() {
        return Double.doubleToRawLongBits(12.0d);
    }

    public static long A0M() {
        return Double.doubleToRawLongBits(2.0d);
    }

    public static long A0N() {
        return Double.doubleToRawLongBits(20.0d);
    }

    public static Context A0P(C5Tl c5Tl) {
        return (Context) c5Tl.AJX(AndroidCompositionLocals_androidKt.A01);
    }

    public static Modifier A0W(C117505Tk c117505Tk, Modifier modifier, Object obj, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        return AbstractC119675bQ.A01(modifier, (InterfaceC16660sJ) obj);
    }

    public static Modifier A0X(Modifier modifier, C25338BJh c25338BJh) {
        return modifier.Eq3(new FocusRequesterElement(c25338BJh));
    }

    public static Modifier A0Y(Modifier modifier, InterfaceC16660sJ interfaceC16660sJ) {
        return modifier.Eq3(new BlockGraphicsLayerElement(interfaceC16660sJ));
    }

    public static InterfaceC1127857k A0Z() {
        return C5XX.A00(C118195Wf.A0E, false);
    }

    public static InterfaceC1127857k A0a(InterfaceC118305Ws interfaceC118305Ws, C5Tl c5Tl) {
        return AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 6);
    }

    public static InterfaceC1128957x A0b(C5Tl c5Tl) {
        return (InterfaceC1128957x) c5Tl.AJX(C5V2.A01);
    }

    public static C51722Yv A0d(C51722Yv c51722Yv, Integer num, float f, int i) {
        return new C51722Yv(c51722Yv, new C9CT(num, f, i));
    }

    public static C51722Yv A0e(C51722Yv c51722Yv, Integer num, Object obj, String str) {
        return new C51722Yv(c51722Yv, new C77863eE(num, obj, str));
    }

    public static C3DN A0m(Fragment fragment) {
        return C3DN.A00.A00(fragment.requireActivity());
    }

    public static C09530e4 A0r(Object obj, long j) {
        return new C09530e4(obj, new C1132359l(j));
    }

    public static BGK A0t(C5Tl c5Tl, Object obj, int i) {
        BGK bgk = new BGK(obj, i);
        c5Tl.FBy(bgk);
        return bgk;
    }

    public static BVI A0u(C5Tl c5Tl, Object obj, int i) {
        BVI bvi = new BVI(obj, i);
        c5Tl.FBy(bvi);
        return bvi;
    }

    public static C50259MHo A0v(C5Tl c5Tl, Object obj, int i) {
        C50259MHo c50259MHo = new C50259MHo(obj, i);
        c5Tl.FBy(c50259MHo);
        return c50259MHo;
    }

    public static C57744PjX A0w(C5Tl c5Tl, Object obj, int i) {
        C57744PjX c57744PjX = new C57744PjX(obj, i);
        c5Tl.FBy(c57744PjX);
        return c57744PjX;
    }

    public static C57244PbS A0x(C5Tl c5Tl, Object obj, int i) {
        C57244PbS c57244PbS = new C57244PbS(obj, i);
        c5Tl.FBy(c57244PbS);
        return c57244PbS;
    }

    public static C50155MDi A0y(C5Tl c5Tl, Object obj, int i) {
        C50155MDi c50155MDi = new C50155MDi(obj, i);
        c5Tl.FBy(c50155MDi);
        return c50155MDi;
    }

    public static C57245PbT A0z(C5Tl c5Tl, Object obj, int i) {
        C57245PbT c57245PbT = new C57245PbT(obj, i);
        c5Tl.FBy(c57245PbT);
        return c57245PbT;
    }

    public static C57748Pjb A10(C5Tl c5Tl, Object obj, int i) {
        C57748Pjb c57748Pjb = new C57748Pjb(obj, i);
        c5Tl.FBy(c57748Pjb);
        return c57748Pjb;
    }

    public static MHW A11(C5Tl c5Tl, Object obj, Object obj2, int i) {
        MHW mhw = new MHW(i, obj, obj2);
        c5Tl.FBy(mhw);
        return mhw;
    }

    public static X67 A12(C5Tl c5Tl, Object obj, Object obj2, int i) {
        X67 x67 = new X67(i, obj, obj2);
        c5Tl.FBy(x67);
        return x67;
    }

    public static C50361MLn A13(C5Tl c5Tl, String str, int i) {
        C50361MLn c50361MLn = new C50361MLn(str, i);
        c5Tl.FBy(c50361MLn);
        return c50361MLn;
    }

    public static ME3 A14(C5Tl c5Tl, Object obj, String str, int i) {
        ME3 me3 = new ME3(str, obj, i);
        c5Tl.FBy(me3);
        return me3;
    }

    public static void A1I(C2XE c2xe, C51422Xp c51422Xp, InterfaceC50832Ve interfaceC50832Ve, C2XM c2xm) {
        if (c51422Xp != null) {
            c51422Xp.A00 = c2xe;
            c51422Xp.A01 = interfaceC50832Ve;
            c2xm.A01(c51422Xp);
        }
    }

    public static boolean A1Y(Object obj) {
        C117505Tk.A0I((C117505Tk) obj);
        return C0fH.A02();
    }

    public static boolean A1Z(Object obj, boolean z) {
        C117505Tk.A0L((C117505Tk) obj, z);
        return C0fH.A02();
    }

    public static Object[] A1a() {
        return new Object[]{new Object()};
    }

    public static C09530e4[] A1b(Object obj, Object obj2) {
        return new C09530e4[]{new C09530e4(obj, obj2)};
    }

    public static float A02(C89813zN c89813zN, InterfaceC79483gv interfaceC79483gv) {
        c89813zN.A03(interfaceC79483gv);
        c89813zN.A01(0.0f);
        return 0.0f;
    }

    public static int A07(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 3);
        return 3;
    }

    public static int A08(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 4);
        return 4;
    }

    public static int A0C(Number number, String str) {
        return str.hashCode() + number.intValue();
    }

    public static int A0D(Object obj, String str) {
        C14360o3.A0C(obj, str);
        return ((Number) obj).intValue();
    }

    public static int A0E(String str, String str2) {
        return AbstractC001900j.A07(str, str2, str.length() - 1);
    }

    public static long A0O(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        return C5XL.A00(c5Tl).A0o;
    }

    public static TextView A0Q(View view, int i) {
        View findViewById = view.findViewById(i);
        C14360o3.A07(findViewById);
        return (TextView) findViewById;
    }

    public static C136606Go A0R(boolean z) {
        return new C136606Go(Boolean.valueOf(z));
    }

    public static BVX A0S(InterfaceC74953Yl interfaceC74953Yl) {
        return (BVX) ((InterfaceC30777DgE) interfaceC74953Yl.getValue());
    }

    public static ParcelableSnapshotMutableState A0U(Object obj) {
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        return new ParcelableSnapshotMutableState(A00, obj);
    }

    public static Modifier A0V(C5Tl c5Tl, Modifier modifier, long j) {
        C5XL.A02(c5Tl);
        return C6L3.A01(modifier, C5WE.A01, j);
    }

    public static C2XI A0c(int i) {
        return new C2XI(Integer.valueOf(i));
    }

    public static C89813zN A0f(EnumC76913cd enumC76913cd, String str) {
        C89813zN A00 = AbstractC51432Xq.A00(enumC76913cd, str);
        A00.A03(AbstractC79463gt.A05);
        return A00;
    }

    public static C51682Yq A0g(C51322Xf c51322Xf, C51722Yv c51722Yv, C77723dw c77723dw) {
        c77723dw.A06(c51322Xf);
        AbstractC77743dy.A00(c77723dw, c51722Yv);
        return c77723dw.A0A();
    }

    public static C9CU A0h(C2YS c2ys, Integer num, int i, int i2) {
        return new C9CU(num, i2, AbstractC77623dm.A0D(c2ys, i));
    }

    public static AbstractC12990ll A0k(InterfaceC09390do interfaceC09390do, int i) {
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
        C14360o3.A0B(abstractC12990ll, i);
        return abstractC12990ll;
    }

    public static C23031Ai A0l(InterfaceC09390do interfaceC09390do) {
        return AbstractC23021Ah.A00((UserSession) interfaceC09390do.getValue());
    }

    public static IllegalArgumentException A0n(String str, int i) {
        return new IllegalArgumentException(AnonymousClass001.A0O(str, i));
    }

    public static IllegalArgumentException A0o(String str, String str2, int i, int i2) {
        return new IllegalArgumentException(AnonymousClass001.A02(i, i2, str, str2));
    }

    public static String A0p(InterfaceC74953Yl interfaceC74953Yl) {
        return ((C5C3) interfaceC74953Yl.getValue()).A01.A00;
    }

    public static ArrayList A0q(List list) {
        return new ArrayList(list.size());
    }

    public static void A17(C5Tl c5Tl, C117685Ud c117685Ud, Object obj, int i) {
        AbstractC117695Ue.A00(c5Tl, c117685Ud, C5UA.A01(c5Tl, obj, i), 56);
    }

    public static void A18(C5Tl c5Tl, Modifier modifier, C2DC c2dc) {
        C5YS.A04(c5Tl, modifier, c2dc, C5XL.A00(c5Tl).A0s);
    }

    public static void A1A(Fragment fragment, C6XJ c6xj) {
        c6xj.A08();
        c6xj.A0C(fragment.getActivity());
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("media_id", Long.valueOf(j));
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("media_index", Long.valueOf(j));
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("media_author_id", Long.valueOf(j));
    }

    public static void A1E(C25531Mh c25531Mh, String str, String str2) {
        c25531Mh.A0k(str);
        c25531Mh.A0u(str2);
        c25531Mh.Cht();
    }

    public static void A1F(C25531Mh c25531Mh, String str, Map map) {
        c25531Mh.A0w(map);
        c25531Mh.A0u(str);
        c25531Mh.Cht();
    }

    public static void A1G(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        c2z02.A00(AbstractC76963ci.A0H(c2z0, c2z02, c51722Yv));
    }

    public static void A1H(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        c2z02.A00(AbstractC76963ci.A03(c2z0, c2z02, c51722Yv));
    }

    public static void A1J(C77723dw c77723dw, float f, boolean z) {
        c77723dw.A0L(f);
        c77723dw.A0b(z);
        c77723dw.A0N(z ? 1 : 0);
    }

    public static void A1K(C77723dw c77723dw, C2XH c2xh, int i, long j) {
        c77723dw.A0R(C2Z3.A00(c2xh, j));
        c77723dw.A0S(i);
    }

    public static void A1L(C77723dw c77723dw, Integer num) {
        c77723dw.A0B();
        c77723dw.A0C();
        c77723dw.A0Y(num);
    }

    public static void A1M(C77723dw c77723dw, Integer num, Integer num2) {
        c77723dw.A0X(num);
        c77723dw.A0C();
        c77723dw.A0Y(num2);
    }

    public static boolean A1T(C5Tl c5Tl) {
        c5Tl.ASW();
        c5Tl.ASW();
        return C0fH.A02();
    }

    public static boolean A1U(C5Tl c5Tl, C117505Tk c117505Tk, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        c5Tl.ASW();
        return C0fH.A02();
    }

    public static boolean A1V(C5Tl c5Tl, Object obj, Object obj2) {
        return c5Tl.AH4(obj) | c5Tl.AH6(obj2);
    }

    public static boolean A1W(C5Tl c5Tl, Object obj, Object obj2) {
        return c5Tl.AH4(obj) | c5Tl.AH4(obj2);
    }

    public static boolean A1X(InterfaceC74953Yl interfaceC74953Yl) {
        return ((Boolean) interfaceC74953Yl.getValue()).booleanValue();
    }
}
