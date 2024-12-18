package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BEj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25226BEj {
    public static Context A0O(C2Z0 c2z0) {
        Context context = c2z0.A00.A0C;
        C14360o3.A07(context);
        return context;
    }

    public static Context A0P(Object obj) {
        return AbstractC77363dM.A00((C76223bS) obj);
    }

    public static Typeface A0Q(Context context, Integer num) {
        return AbstractC14710oj.A03(context, Typeface.DEFAULT, num);
    }

    public static C5Tl A0S(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        ((Number) obj2).intValue();
        return c5Tl;
    }

    public static Modifier A0T(C1130158n c1130158n) {
        return c1130158n.Eq3(AbstractC118185Wd.A02);
    }

    public static Modifier A0U(C1130158n c1130158n) {
        return c1130158n.Eq3(AbstractC118185Wd.A01);
    }

    public static Modifier A0V(Modifier modifier) {
        return AbstractC118185Wd.A08(modifier, 44.0f);
    }

    public static Modifier A0W(Modifier modifier) {
        return C6L2.A01(modifier, C5WF.A00);
    }

    public static Modifier A0X(Modifier modifier, long j) {
        return C6L3.A01(modifier, C5AF.A00, j);
    }

    public static C2DC A0Y(C5Tl c5Tl, int i, int i2) {
        return C5Y7.A00(c5Tl, i2, i & 14);
    }

    public static InterfaceC1127857k A0Z(C5Tl c5Tl, InterfaceC118245Wl interfaceC118245Wl) {
        return AbstractC119595bH.A00(AbstractC118255Wn.A07, c5Tl, interfaceC118245Wl);
    }

    public static InterfaceC1127857k A0a(boolean z) {
        return C5XX.A00(C118195Wf.A09, z);
    }

    public static InterfaceC1127857k A0b(boolean z) {
        return C5XX.A00(C118195Wf.A0E, z);
    }

    public static C9CU A0m(int i, long j) {
        return new C9CU(C05F.A08, i, j);
    }

    public static InterfaceC43580JMo A0t(C38321qM c38321qM) {
        return c38321qM.A0C.CHL();
    }

    public static C3x9 A0u(C38321qM c38321qM) {
        return c38321qM.A0C.getClipsMetadata();
    }

    public static C2DB A0w(C5Tl c5Tl, ImageUrl imageUrl, int i) {
        return AbstractC43541zP.A01(c5Tl, imageUrl, i & 14);
    }

    public static C61182qg A11(C8CY c8cy) {
        return c8cy.A00.Bnn();
    }

    public static User A14(C38321qM c38321qM) {
        return c38321qM.A0C.CDj();
    }

    public static Object A18(C5Tl c5Tl) {
        return c5Tl.AJX(C5V2.A07);
    }

    public static Object A19(C5Tl c5Tl) {
        return c5Tl.AJX(AndroidCompositionLocals_androidKt.A01);
    }

    public static Object A1A(Object obj) {
        return ((InterfaceC74953Yl) obj).getValue();
    }

    public static Object A1B(Object obj) {
        return ((InterfaceC74963Ym) obj).getValue();
    }

    public static Object A1C(Object obj) {
        return ((InterfaceC16820sZ) obj).invoke();
    }

    public static String A1F(C38321qM c38321qM) {
        return c38321qM.A0C.CFX();
    }

    public static String A1G(C38321qM c38321qM) {
        return c38321qM.A0C.getLoggingInfoToken();
    }

    public static String A1H(CharSequence charSequence, Iterable iterable, InterfaceC16660sJ interfaceC16660sJ) {
        return AbstractC001800i.A0P(charSequence, "", "", iterable, interfaceC16660sJ);
    }

    public static Iterator A1J(Object obj) {
        return ((List) obj).iterator();
    }

    public static InterfaceC16620sF A1K(C5Tl c5Tl, Object obj) {
        InterfaceC16620sF interfaceC16620sF = C5X8.A04;
        C5XJ.A00(c5Tl, obj, interfaceC16620sF);
        return interfaceC16620sF;
    }

    public static C23671Dx A1L(InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        return AbstractC23641Du.A04(AnonymousClass191.A00, interfaceC16620sF, c19l);
    }

    public static void A1S(AbstractC89823zO abstractC89823zO, int i) {
        abstractC89823zO.A02 = new C89803zM(i);
    }

    public static boolean A1U(int i, boolean z) {
        if (i != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1V(int i, boolean z) {
        if (i != 0) {
            return true;
        }
        return z;
    }

    public static boolean A1Z(AbstractC02600Aj abstractC02600Aj) {
        return abstractC02600Aj.A00.isSampled();
    }

    public static boolean A1a(Class cls) {
        return Parcelable.class.isAssignableFrom(cls);
    }

    public static float A00(InterfaceC1128957x interfaceC1128957x, float f, float f2) {
        return f2 + interfaceC1128957x.EqT(f);
    }

    public static int A01(int i, float f) {
        return i + Float.floatToIntBits(f);
    }

    public static int A02(String str, int i) {
        return str.hashCode() + i;
    }

    public static int A03(String str, int i) {
        return i + str.hashCode();
    }

    public static int A04(String str, int i) {
        return str.length() + i;
    }

    public static int A05(List list) {
        return list.size() - 1;
    }

    public static long A06(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0B;
    }

    public static long A07(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0E;
    }

    public static long A08(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0p;
    }

    public static long A09(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0k;
    }

    public static long A0A(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0S;
    }

    public static long A0B(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0q;
    }

    public static long A0C(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0Y;
    }

    public static long A0D(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0V;
    }

    public static long A0E(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0d;
    }

    public static long A0F(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0n;
    }

    public static long A0G(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0o;
    }

    public static long A0H(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A13;
    }

    public static long A0I(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A14;
    }

    public static long A0J(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A17;
    }

    public static long A0K(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0z;
    }

    public static long A0L(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0s;
    }

    public static long A0M(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0t;
    }

    public static long A0N(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0l;
    }

    public static View A0R(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C14360o3.A07(inflate);
        return inflate;
    }

    public static C118125Vw A0c(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A00;
    }

    public static C118125Vw A0d(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A09;
    }

    public static C118125Vw A0e(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A05;
    }

    public static C118125Vw A0f(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A03;
    }

    public static C118125Vw A0g(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A06;
    }

    public static C118125Vw A0h(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A01;
    }

    public static C5C3 A0i(InterfaceC74953Yl interfaceC74953Yl) {
        return (C5C3) interfaceC74953Yl.getValue();
    }

    public static InterfaceC1128957x A0j(C5Tl c5Tl, C5UQ c5uq) {
        return (InterfaceC1128957x) c5Tl.AJX(c5uq);
    }

    public static C2WH A0k(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        return AbstractC76963ci.A0H(c2z0, c2z1, c51722Yv);
    }

    public static C2WH A0l(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z1 c2z1, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        return AbstractC76963ci.A0G(c2z0, c2z1, c51722Yv);
    }

    public static C25879Bce A0n(InterfaceC09390do interfaceC09390do) {
        return (C25879Bce) interfaceC09390do.getValue();
    }

    public static C25878Bcd A0o(InterfaceC09390do interfaceC09390do) {
        return (C25878Bcd) interfaceC09390do.getValue();
    }

    public static C28370CfW A0p(InterfaceC09390do interfaceC09390do) {
        return (C28370CfW) interfaceC09390do.getValue();
    }

    public static C28484Chc A0q(InterfaceC09390do interfaceC09390do) {
        return (C28484Chc) interfaceC09390do.getValue();
    }

    public static C7F6 A0r(InterfaceC09390do interfaceC09390do) {
        return (C7F6) interfaceC09390do.getValue();
    }

    public static C26083BgC A0s(C05A c05a) {
        return (C26083BgC) c05a.getValue();
    }

    public static AbstractC12990ll A0v(C5Tl c5Tl, C5UQ c5uq) {
        return (AbstractC12990ll) c5Tl.AJX(c5uq);
    }

    public static C25866BcL A0x(InterfaceC09390do interfaceC09390do) {
        return (C25866BcL) interfaceC09390do.getValue();
    }

    public static C38321qM A0y(C120985dq c120985dq) {
        return c120985dq.A06().A0K;
    }

    public static C38321qM A0z(InterfaceC09390do interfaceC09390do) {
        return (C38321qM) interfaceC09390do.getValue();
    }

    public static C23031Ai A10(InterfaceC09390do interfaceC09390do) {
        return (C23031Ai) interfaceC09390do.getValue();
    }

    public static C29138Ct5 A12(InterfaceC09390do interfaceC09390do) {
        return (C29138Ct5) interfaceC09390do.getValue();
    }

    public static C25986Bea A13(InterfaceC74953Yl interfaceC74953Yl) {
        return (C25986Bea) interfaceC74953Yl.getValue();
    }

    public static User A15(Iterator it) {
        return (User) it.next();
    }

    public static RecipeSheetParams A16(InterfaceC09390do interfaceC09390do) {
        return (RecipeSheetParams) interfaceC09390do.getValue();
    }

    public static C37556GgC A17(InterfaceC16820sZ interfaceC16820sZ) {
        return (C37556GgC) interfaceC16820sZ.invoke();
    }

    public static String A1D(InterfaceC74953Yl interfaceC74953Yl) {
        return (String) interfaceC74953Yl.getValue();
    }

    public static String A1E(C120985dq c120985dq) {
        return c120985dq.A06().A0S;
    }

    public static String A1I(List list, int i) {
        return (String) list.get(i);
    }

    public static void A1M(Context context, C189448aO c189448aO, int i) {
        c189448aO.A0d = context.getString(i);
    }

    public static void A1N(Context context, C146106i8 c146106i8, int i) {
        c146106i8.A0D = context.getString(i);
    }

    public static void A1O(C5Tl c5Tl, Modifier modifier, float f) {
        AbstractC119685bS.A00(c5Tl, AbstractC118185Wd.A08(modifier, f));
    }

    public static void A1P(Fragment fragment) {
        fragment.getParentFragmentManager().A0b();
    }

    public static void A1Q(Fragment fragment) {
        fragment.requireActivity().onBackPressed();
    }

    public static void A1R(C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z02.A00(AbstractC76963ci.A0G(c2z0, c2z02, c51722Yv));
    }

    public static void A1T(InterfaceC16660sJ interfaceC16660sJ, float f) {
        interfaceC16660sJ.invoke(Float.valueOf(f));
    }

    public static boolean A1W(C5Tl c5Tl, long j, boolean z) {
        return z | c5Tl.AH3(j);
    }

    public static boolean A1X(C5Tl c5Tl, Object obj, boolean z) {
        return z | c5Tl.AH6(obj);
    }

    public static boolean A1Y(C5Tl c5Tl, boolean z, boolean z2) {
        return z2 | c5Tl.AH5(z);
    }

    public static boolean A1b(AbstractCollection abstractCollection) {
        return !abstractCollection.isEmpty();
    }
}
