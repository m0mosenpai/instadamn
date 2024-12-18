package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BEk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25227BEk {
    public static float A00(float f, float f2) {
        return (f - f2) / 2.0f;
    }

    public static int A07(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static View A0C(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    public static LazyListState A0E(C5Tl c5Tl) {
        return C6IE.A00(c5Tl, 0, 0, 0, 3);
    }

    public static C5TR A0F(Object obj, int i) {
        return C5UA.A04(obj, i, false);
    }

    public static Modifier A0G(C117505Tk c117505Tk, Modifier modifier, Modifier modifier2) {
        C117505Tk.A0L(c117505Tk, false);
        return modifier.Eq3(modifier2);
    }

    public static Modifier A0H(Modifier modifier, float f) {
        return AbstractC118175Wb.A0E(modifier, 0.0f, 0.0f, 0.0f, f);
    }

    public static Modifier A0I(Modifier modifier, float f) {
        return AbstractC118175Wb.A0E(modifier, 0.0f, 0.0f, f, 0.0f);
    }

    public static Modifier A0J(Modifier modifier, float f) {
        return AbstractC118175Wb.A0E(modifier, 0.0f, f, 0.0f, 0.0f);
    }

    public static Modifier A0K(Modifier modifier, float f) {
        return AbstractC118175Wb.A0E(modifier, f, 0.0f, 0.0f, 0.0f);
    }

    public static Modifier A0L(Modifier modifier, float f) {
        return AbstractC118175Wb.A0A(modifier, 0.0f, f);
    }

    public static Modifier A0M(Modifier modifier, float f) {
        return AbstractC118175Wb.A0A(modifier, f, 0.0f);
    }

    public static C2DC A0P(C5Tl c5Tl, int i) {
        return C5Y7.A00(c5Tl, i, 0);
    }

    public static C9CU A0b(long j) {
        return new C9CU(C05F.A0u, 0, j);
    }

    public static C9CU A0c(long j) {
        return new C9CU(C05F.A15, 0, j);
    }

    public static Boolean A0k(C117505Tk c117505Tk, boolean z) {
        C117505Tk.A0L(c117505Tk, false);
        return Boolean.valueOf(z);
    }

    public static Float A0l() {
        return Float.valueOf(0.0f);
    }

    public static Integer A0o() {
        return -1;
    }

    public static Integer A0p() {
        return 0;
    }

    public static Object A0t(List list) {
        return list.get(1);
    }

    public static InterfaceC16820sZ A0y(C117505Tk c117505Tk, Object obj) {
        C117505Tk.A0L(c117505Tk, false);
        return (InterfaceC16820sZ) ((C0YS) obj);
    }

    public static C008002u A0z() {
        return C10E.A00(null);
    }

    public static void A13(C6Nu c6Nu, Object obj, int i) {
        c6Nu.CgH(null, C5UA.A04(obj, i, true));
    }

    public static boolean A1X(C5Tl c5Tl, Modifier modifier) {
        C5XX.A02(c5Tl, modifier, 0);
        return C0fH.A02();
    }

    public static float A01(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A02(int i) {
        int i2 = AbstractC75953b0.A00;
        return View.MeasureSpec.makeMeasureSpec(i, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
    }

    public static int A03(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static int A06(Number number, int i) {
        if (number != null) {
            return number.intValue();
        }
        return i;
    }

    public static long A08(AnonymousClass586 anonymousClass586) {
        long j = anonymousClass586.A00;
        anonymousClass586.A01.ELZ();
        return j;
    }

    public static Context A0A(C76223bS c76223bS) {
        Context context = c76223bS.A05.A0C;
        C14360o3.A07(context);
        return context;
    }

    public static Modifier A0N(Modifier modifier, float f) {
        return AbstractC118175Wb.A0A(modifier, f, 8.0f);
    }

    public static C1132359l A0O(long j) {
        return new C1132359l(j << 32);
    }

    public static InterfaceC1127857k A0Q(InterfaceC118305Ws interfaceC118305Ws, C5Tl c5Tl, InterfaceC118245Wl interfaceC118245Wl) {
        return AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 48);
    }

    public static C5C3 A0S(String str) {
        return new C5C3(str, C5C2.A01);
    }

    public static C9CU A0Y(int i, long j) {
        return new C9CU(C05F.A04, i, j);
    }

    public static C9CU A0Z(int i, long j) {
        return new C9CU(C05F.A09, i, j);
    }

    public static C9CU A0a(int i, long j) {
        return new C9CU(C05F.A07, i, j);
    }

    public static C51532Yb A0d(InterfaceC51522Ya interfaceC51522Ya, int i, boolean z) {
        return new C51532Yb(C77603dk.A00, interfaceC51522Ya, i, z);
    }

    public static C194848jk A0h() {
        return new C194848jk(C0eB.A00);
    }

    public static C3NX A0i() {
        return new C3NX(C0eB.A00);
    }

    public static Float A0m() {
        return Float.valueOf(1.0f);
    }

    public static IllegalArgumentException A0n() {
        return new IllegalArgumentException("Required value was null.");
    }

    public static void A17(C5Tl c5Tl, Modifier modifier, C2DC c2dc, int i) {
        C6LQ.A06(c5Tl, modifier, c2dc, (i & 14) | 48);
    }

    public static int A04(C5Tl c5Tl, List list, int i) {
        c5Tl.Eno(i);
        return list.size();
    }

    public static int A05(Enum r0, int i) {
        C14360o3.A0B(r0, i);
        return r0.ordinal();
    }

    public static long A09(C2YS c2ys) {
        return AbstractC77623dm.A0D(c2ys, R.dimen.abc_dialog_padding_material);
    }

    public static android.net.Uri A0B(String str) {
        android.net.Uri A03 = AbstractC08820cl.A03(str);
        C14360o3.A07(A03);
        return A03;
    }

    public static View A0D(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return inflate;
    }

    public static C5C8 A0R(C6C7 c6c7, String str, String str2, int i, int i2) {
        c6c7.A0A(str, str2, i, i2);
        return c6c7.A02();
    }

    public static C0CA A0T(C04060Jx c04060Jx, Object obj, String str) {
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, obj, str);
        return A02;
    }

    public static InterfaceC40501uJ A0U(boolean z) {
        C18C.A0E(z);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return AbstractC40511uK.A00();
    }

    public static C2WF A0V(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        return AbstractC76963ci.A03(c2z0, c2z1, c51722Yv);
    }

    public static C2WH A0W(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        return AbstractC76963ci.A0I(c2z0, c2z1, c51722Yv);
    }

    public static C51682Yq A0X(C51722Yv c51722Yv, C77723dw c77723dw) {
        AbstractC77743dy.A00(c77723dw, c51722Yv);
        return c77723dw.A0A();
    }

    public static C1ON A0e(C25621Ms c25621Ms, Class cls, Class cls2) {
        c25621Ms.A0R(cls, cls2);
        return c25621Ms.A0N();
    }

    public static C6FW A0f(C6FX c6fx, Object obj, int i) {
        c6fx.A03(obj, i);
        return c6fx.A00();
    }

    public static C118045Vo A0g(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        return C5XL.A00(c5Tl);
    }

    public static Boolean A0j(C5Tl c5Tl, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        c5Tl.FBy(valueOf);
        return valueOf;
    }

    public static Object A0q(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        return c5Tl.EEc();
    }

    public static Object A0r(C5Tl c5Tl, InterfaceC74963Ym interfaceC74963Ym, int i) {
        c5Tl.Eno(i);
        return interfaceC74963Ym.getValue();
    }

    public static Object A0s(C117505Tk c117505Tk, InterfaceC74963Ym interfaceC74963Ym, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        return interfaceC74963Ym.getValue();
    }

    public static String A0u(Context context, int i) {
        String string = context.getString(i);
        C14360o3.A0A(string);
        return string;
    }

    public static String A0v(Fragment fragment, int i) {
        String string = fragment.getString(i);
        C14360o3.A07(string);
        return string;
    }

    public static String A0w(String str, int i, int i2) {
        String substring = str.substring(i, i2);
        C14360o3.A07(substring);
        return substring;
    }

    public static Iterator A0x(C5Tl c5Tl, List list, int i) {
        c5Tl.Eno(i);
        return list.iterator();
    }

    public static void A10(View view, C59072n8 c59072n8, C57112jm c57112jm) {
        c57112jm.A05(view, c59072n8.A01());
    }

    public static void A11(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void A12(TextView textView, Fragment fragment, int i) {
        textView.setText(fragment.getString(i));
    }

    public static void A14(C6Nu c6Nu, Object obj, Object obj2, int i) {
        c6Nu.CgH(obj2, C5UA.A03(obj, i));
    }

    public static void A15(C6Nu c6Nu, Object obj, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        c6Nu.CgN(interfaceC16660sJ, interfaceC16660sJ2, C5UA.A02(obj), i);
    }

    public static void A16(C5Tl c5Tl, Modifier modifier, float f) {
        AbstractC119685bS.A00(c5Tl, AbstractC118185Wd.A0D(modifier, f));
    }

    public static void A18(InterfaceC74953Yl interfaceC74953Yl, float f) {
        interfaceC74953Yl.Egh(Float.valueOf(f));
    }

    public static void A19(InterfaceC74953Yl interfaceC74953Yl, int i) {
        interfaceC74953Yl.Egh(Integer.valueOf(i));
    }

    public static void A1A(InterfaceC74953Yl interfaceC74953Yl, boolean z) {
        interfaceC74953Yl.Egh(Boolean.valueOf(z));
    }

    public static void A1B(Fragment fragment) {
        fragment.requireActivity().finish();
    }

    public static void A1C(Fragment fragment, C09530e4[] c09530e4Arr) {
        fragment.setArguments(AbstractC61636Rr0.A00(c09530e4Arr));
    }

    public static void A1D(C2XI c2xi, float f) {
        c2xi.A00(Float.valueOf(f));
    }

    public static void A1E(C2XI c2xi, int i) {
        c2xi.A00(Integer.valueOf(i));
    }

    public static void A1F(C2XI c2xi, boolean z) {
        c2xi.A00(Boolean.valueOf(z));
    }

    public static void A1G(C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z02.A00(AbstractC76963ci.A0I(c2z0, c2z02, c51722Yv));
    }

    public static void A1H(C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z02.A00(AbstractC76963ci.A03(c2z0, c2z02, c51722Yv));
    }

    public static void A1I(C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z02.A00(AbstractC76963ci.A0F(c2z0, c2z02, c51722Yv));
    }

    public static void A1J(C2Z0 c2z0, C77723dw c77723dw) {
        c2z0.A00(c77723dw.A0A());
    }

    public static void A1K(C51762Yz c51762Yz, int i) {
        c51762Yz.A01(Integer.valueOf(i));
    }

    public static void A1L(C51762Yz c51762Yz, boolean z) {
        c51762Yz.A01(Boolean.valueOf(z));
    }

    public static void A1M(C6FQ c6fq, C6FX c6fx, InterfaceC103384lE interfaceC103384lE) {
        C131845xK.A00(c6fq, c6fx.A00(), interfaceC103384lE);
    }

    public static void A1N(Object obj, Object obj2, InterfaceC16610sE interfaceC16610sE, boolean z) {
        interfaceC16610sE.invoke(obj, obj2, Boolean.valueOf(z));
    }

    public static void A1O(Object obj, Map map, int i) {
        map.put(Integer.valueOf(i), obj);
    }

    public static void A1P(Object obj, InterfaceC16620sF interfaceC16620sF, int i) {
        interfaceC16620sF.invoke(obj, Integer.valueOf(i));
    }

    public static void A1Q(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        interfaceC16660sJ.invoke(Boolean.valueOf(z));
    }

    public static boolean A1R(C5Tl c5Tl) {
        c5Tl.ASW();
        return C0fH.A02();
    }

    public static boolean A1S(C5Tl c5Tl) {
        c5Tl.ASV();
        return C0fH.A02();
    }

    public static boolean A1T(C5Tl c5Tl, float f, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH1(f);
    }

    public static boolean A1U(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        return C0fH.A02();
    }

    public static boolean A1V(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        return c5Tl.AH2(i2);
    }

    public static boolean A1W(C5Tl c5Tl, int i, boolean z) {
        c5Tl.Eno(i);
        return c5Tl.AH5(z);
    }

    public static boolean A1Y(C5Tl c5Tl, Object obj, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH4(obj);
    }

    public static boolean A1Z(C5Tl c5Tl, Object obj, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH6(obj);
    }

    public static boolean A1a(C117505Tk c117505Tk) {
        C117505Tk.A0I(c117505Tk);
        return C0fH.A02();
    }

    public static boolean A1b(C117505Tk c117505Tk, boolean z) {
        C117505Tk.A0L(c117505Tk, z);
        return C0fH.A02();
    }
}
