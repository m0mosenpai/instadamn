package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawWithCacheElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import androidx.fragment.app.Fragment;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.BEq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25233BEq {
    public static int A00(int i, int i2) {
        return (int) Math.ceil((i - i2) / 2.0d);
    }

    public static int A01(int i, int i2, int i3) {
        return i | i2 | (57344 & i3) | (i3 & 458752);
    }

    public static int A02(int i, int i2, int i3) {
        return i | i2 | (3670016 & i3) | (29360128 & i3);
    }

    public static long A06(int i, long j) {
        return (i & 4294967295L) | (j << 32);
    }

    public static Modifier A09(C117505Tk c117505Tk, Modifier modifier, Object obj) {
        C117505Tk.A0L(c117505Tk, false);
        return modifier.Eq3(new BlockGraphicsLayerElement((InterfaceC16660sJ) obj));
    }

    public static Modifier A0A(C117505Tk c117505Tk, Modifier modifier, Object obj) {
        C117505Tk.A0L(c117505Tk, false);
        return modifier.Eq3(new DrawWithCacheElement((InterfaceC16660sJ) obj));
    }

    public static Modifier A0B(C117505Tk c117505Tk, Modifier modifier, Object obj) {
        C117505Tk.A0L(c117505Tk, false);
        return modifier.Eq3(new OnGloballyPositionedElement((InterfaceC16660sJ) obj));
    }

    public static C51722Yv A0N(EnumC77673dr enumC77673dr, C51722Yv c51722Yv) {
        return new C51722Yv(c51722Yv, new C9CV(C05F.A0E, AbstractC77703du.A00(enumC77673dr), 4));
    }

    public static C51722Yv A0Q(C51722Yv c51722Yv, double d) {
        return new C51722Yv(c51722Yv, new C9CU(C05F.A08, 0, Double.doubleToRawLongBits(d)));
    }

    public static C51722Yv A0W(C51722Yv c51722Yv, C2YS c2ys, int i) {
        return new C51722Yv(c51722Yv, new C9CV(C05F.A0N, AbstractC77623dm.A0F(c2ys, i), 0));
    }

    public static C51722Yv A0X(C51722Yv c51722Yv, C2YS c2ys, int i) {
        return new C51722Yv(c51722Yv, new C9CU(C05F.A01, 0, AbstractC77623dm.A0D(c2ys, i)));
    }

    public static C51722Yv A0a(C51722Yv c51722Yv, Integer num, float f) {
        return new C51722Yv(c51722Yv, new C9CT(num, f, 1));
    }

    public static C51722Yv A0c(C51722Yv c51722Yv, Integer num, boolean z) {
        return new C51722Yv(c51722Yv, new C9CV(num, Boolean.valueOf(z), 4));
    }

    public static C77723dw A0g(C2XE c2xe, CharSequence charSequence, int i) {
        C77723dw A03 = C51682Yq.A03(c2xe, 0);
        A03.A0W(charSequence);
        A03.A0V(null);
        A03.A0Q(i);
        return A03;
    }

    public static ReboundViewPager A0k(Context context) {
        C14360o3.A0B(context, 0);
        return new ReboundViewPager(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, X.B4Z] */
    public static B4Z A0r(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        C117505Tk.A0L((C117505Tk) c5Tl, false);
        return new RuntimeException();
    }

    public static void A1A(C2Z0 c2z0, C51722Yv c51722Yv, C77723dw c77723dw) {
        c77723dw.A06(null);
        AbstractC77743dy.A00(c77723dw, c51722Yv);
        c2z0.A00(c77723dw.A0A());
    }

    public static void A1D(C51722Yv c51722Yv, C77723dw c77723dw, boolean z) {
        c77723dw.A0c(true);
        c77723dw.A0Z(z);
        c77723dw.A0a(true);
        c77723dw.A06(null);
        AbstractC77743dy.A00(c77723dw, c51722Yv);
    }

    public static boolean A1N(int i, int i2) {
        if ((i & i2) != 536870912) {
            return false;
        }
        return true;
    }

    public static boolean A1O(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 14) != 4) {
            return false;
        }
        return true;
    }

    public static boolean A1S(C5Tl c5Tl, C117505Tk c117505Tk) {
        C117505Tk.A0L(c117505Tk, false);
        c5Tl.ASW();
        c5Tl.ASW();
        return C0fH.A02();
    }

    public static boolean A1V(C5Tl c5Tl, Object obj, int i, int i2) {
        if ((i & i2) == 0) {
            return c5Tl.AH4(obj);
        }
        return c5Tl.AH6(obj);
    }

    public static boolean A1X(C5Tl c5Tl, Object obj, Object obj2, boolean z, boolean z2) {
        return z | z2 | c5Tl.AH6(obj) | c5Tl.AH6(obj2);
    }

    public static boolean A1a(C2Z0 c2z0, C51722Yv c51722Yv, C80403iV c80403iV) {
        c80403iV.A0C();
        AbstractC77743dy.A00(c80403iV, c51722Yv);
        c2z0.A00(c80403iV.A0A());
        return true;
    }

    public static boolean A1b(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        C14360o3.A0B(obj3, 2);
        return true;
    }

    public static int A05(C2Z0 c2z0) {
        return C2Z3.A00(c2z0.BoZ(), Double.doubleToRawLongBits(1.0d));
    }

    public static long A07(C5Tl c5Tl, long j) {
        return C1132359l.A04(((Number) c5Tl.AJX(AbstractC131065vu.A00)).floatValue(), j);
    }

    public static C57S A08(C57S c57s) {
        if (c57s == null) {
            return new C57S(new C58J[16]);
        }
        return c57s;
    }

    public static InterfaceC1127857k A0D(C5Tl c5Tl, int i) {
        int i2 = i >> 3;
        return AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, (i2 & 112) | (i2 & 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5W3 A0E(long j) {
        long j2 = 0;
        return new C5W3(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 65534, j, j2, j2);
    }

    public static InterfaceC40501uJ A0H(AbstractC04050Jw abstractC04050Jw, C2JM c2jm, String str) {
        c2jm.A00.A02().A0E(abstractC04050Jw, str);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return AbstractC40511uK.A00();
    }

    public static C2Z0 A0I(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, C2XE c2xe) {
        C2Z0 c2z0 = new C2Z0(c2xe, new ArrayList());
        c2z0.A00(abstractC50812Vc);
        c2z0.A00(abstractC50812Vc2);
        return c2z0;
    }

    public static AbstractC50922Vo A0M(C2XE c2xe) {
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        C77083cu c77083cu = c2y5.A02;
        if (c77083cu != null) {
            return c77083cu.A01;
        }
        return null;
    }

    public static C51722Yv A0P(C51762Yz c51762Yz, C51722Yv c51722Yv) {
        return AbstractC171007jr.A00(c51722Yv, ((Number) c51762Yz.A03).floatValue());
    }

    public static C51722Yv A0R(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CU(C05F.A05, i, j));
    }

    public static C51722Yv A0S(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, int i, long j) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CU(C05F.A09, i, j));
    }

    public static C51722Yv A0T(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, Integer num, float f, int i) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CT(num, f, i));
    }

    public static C51722Yv A0U(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, Integer num, int i) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CV(num, "android.widget.Button", i));
    }

    public static C51722Yv A0V(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw, Integer num, Object obj, int i) {
        return new C51722Yv(new C51722Yv(c51722Yv, interfaceC51732Yw), new C9CV(num, obj, i));
    }

    public static C51722Yv A0b(C51722Yv c51722Yv, Integer num, int i) {
        return new C51722Yv(c51722Yv, new C9CT(num, 100.0f, i));
    }

    public static C51722Yv A0d(C51722Yv c51722Yv, Object obj) {
        return new C51722Yv(c51722Yv, new C9CV(C05F.A1F, obj, 4));
    }

    public static C51722Yv A0e(Integer num, float f, int i) {
        return new C51722Yv(null, new C9CT(num, f, i));
    }

    public static C9CT A0h() {
        return new C9CT(C05F.A0C, 0.0f, 1);
    }

    public static Integer A0l(AbstractC37623GhI abstractC37623GhI) {
        C37556GgC c37556GgC = abstractC37623GhI.A02;
        if (c37556GgC != null) {
            return Integer.valueOf(c37556GgC.A03());
        }
        return null;
    }

    public static Long A0n(String str) {
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static String A0o(C38321qM c38321qM) {
        User CDj = c38321qM.A0C.CDj();
        if (CDj != null) {
            return CDj.getId();
        }
        return null;
    }

    public static LinkedHashMap A0p(Object obj, Object obj2, C09530e4 c09530e4) {
        return AbstractC06930Yk.A06(c09530e4, new C09530e4(obj, obj2));
    }

    public static C0eB A0u(Object obj) {
        InterfaceC113515Ao interfaceC113515Ao = (InterfaceC113515Ao) obj;
        C14360o3.A0B(interfaceC113515Ao, 0);
        AbstractC113575Au.A02(interfaceC113515Ao, 0);
        return C0eB.A00;
    }

    public static void A11(C5Tl c5Tl, C117505Tk c117505Tk) {
        InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
        c5Tl.Ent();
        if (c117505Tk.A0K) {
            c5Tl.AMd(interfaceC16820sZ);
        } else {
            c5Tl.FDO();
        }
    }

    public static void A14(Fragment fragment) {
        C3DN A00 = C3DN.A00.A00(fragment.requireActivity());
        if (A00 != null) {
            A00.A0B();
        }
    }

    public static void A15(Fragment fragment, Object obj, Object obj2) {
        fragment.setArguments(AbstractC61636Rr0.A00(new C09530e4(obj, obj2)));
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("parent_surface", "instagram");
        interfaceC02590Ai.AAP("surface", "edit_profile_channels");
    }

    public static void A18(C25531Mh c25531Mh, Object obj, Object obj2) {
        c25531Mh.A0w(AbstractC16850sd.A0M(new C09530e4(obj, obj2)));
        c25531Mh.Cht();
    }

    public static void A1G(Object obj) {
        InterfaceC1132159j interfaceC1132159j = (InterfaceC1132159j) obj;
        C14360o3.A0B(interfaceC1132159j, 0);
        interfaceC1132159j.ERu(1);
    }

    public static boolean A1H(int i) {
        if ((i & 14) != 4) {
            return false;
        }
        return true;
    }

    public static boolean A1I(int i) {
        if ((i & 112) != 32) {
            return false;
        }
        return true;
    }

    public static boolean A1J(int i) {
        if ((i & 896) != 256) {
            return false;
        }
        return true;
    }

    public static boolean A1K(int i) {
        if ((i & 7168) != 2048) {
            return false;
        }
        return true;
    }

    public static boolean A1L(int i) {
        if ((3670016 & i) != 1048576) {
            return false;
        }
        return true;
    }

    public static boolean A1M(int i) {
        if ((234881024 & i) != 67108864) {
            return false;
        }
        return true;
    }

    public static boolean A1P(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 112) != 32) {
            return false;
        }
        return true;
    }

    public static boolean A1Q(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 896) != 256) {
            return false;
        }
        return true;
    }

    public static boolean A1R(C5Tl c5Tl, int i, int i2) {
        c5Tl.Eno(i);
        if ((i2 & 7168) != 2048) {
            return false;
        }
        return true;
    }

    public static boolean A1T(C5Tl c5Tl, Object obj, int i) {
        if ((i & 8) == 0) {
            return c5Tl.AH4(obj);
        }
        return c5Tl.AH6(obj);
    }

    public static boolean A1U(C5Tl c5Tl, Object obj, int i) {
        if ((i & 64) == 0) {
            return c5Tl.AH4(obj);
        }
        return c5Tl.AH6(obj);
    }

    public static boolean A1Z(C50679MYx c50679MYx, C7MS c7ms, C7MT c7mt, Object obj, C05A c05a) {
        return c05a.AIi(obj, C7MT.A00(c50679MYx, c7ms, c7mt.A02, c7mt.A03, c7mt.A04));
    }

    public static int A03(InterfaceC74953Yl interfaceC74953Yl) {
        return ((C5C3) interfaceC74953Yl.getValue()).A01.A00.length();
    }

    public static int A04(Fragment fragment) {
        return fragment.requireContext().getColor(AbstractC53242c7.A06(fragment.getContext()));
    }

    public static AnonymousClass585 A0C(InterfaceC1128857w interfaceC1128857w) {
        return ((AnonymousClass587) interfaceC1128857w.AzL()).A02.A02.A01;
    }

    public static C1350369c A0F(EnumC15950qp enumC15950qp, C15980qs c15980qs) {
        Typeface A02 = c15980qs.A02(enumC15950qp);
        if (A02 != null) {
            return C69Y.A00(A02);
        }
        return null;
    }

    public static C5C3 A0G(InterfaceC74953Yl interfaceC74953Yl, String str) {
        C5C3 c5c3 = (C5C3) interfaceC74953Yl.getValue();
        long j = c5c3.A00;
        C5C2 c5c2 = c5c3.A02;
        C16930sl c16930sl = C16930sl.A00;
        return new C5C3(new C5C8(c16930sl, c16930sl, str), c5c2, j);
    }

    public static C2Z0 A0J(C76223bS c76223bS) {
        return new C2Z0(c76223bS.ArD(), new ArrayList());
    }

    public static C2Z0 A0K(C2Z0 c2z0) {
        return new C2Z0(c2z0.ArD(), new ArrayList());
    }

    public static C2Z0 A0L(C2Z1 c2z1) {
        return new C2Z0(c2z1.ArD(), new ArrayList());
    }

    public static C51722Yv A0O(C2Z1 c2z1, C51722Yv c51722Yv, UserSession userSession, InterfaceC30978DjZ interfaceC30978DjZ, BN7 bn7) {
        return bn7.A02(AbstractC77363dM.A00(c2z1), bn7.A01(AbstractC77363dM.A00(c2z1), c51722Yv, userSession, interfaceC30978DjZ), userSession, interfaceC30978DjZ);
    }

    public static C51722Yv A0Y(C51722Yv c51722Yv, C2YS c2ys, Integer num, int i, int i2) {
        return new C51722Yv(c51722Yv, new C9CU(num, i2, AbstractC77623dm.A0D(c2ys, i)));
    }

    public static C51722Yv A0Z(C51722Yv c51722Yv, Integer num, double d, int i) {
        return new C51722Yv(c51722Yv, new C9CU(num, i, Double.doubleToRawLongBits(d)));
    }

    public static C89813zN A0f(EnumC76913cd enumC76913cd, String str) {
        C89813zN A00 = AbstractC51432Xq.A00(enumC76913cd, str);
        A00.A03(AbstractC79463gt.A00);
        A00.A01(0.0f);
        return A00;
    }

    public static C2XH A0i(Typeface typeface, C2Z0 c2z0, C77723dw c77723dw, int i, int i2) {
        c77723dw.A0S(i);
        c77723dw.A0T(typeface);
        c77723dw.A0P(i2);
        return c2z0.BoZ();
    }

    public static C140966Yy A0j(Fragment fragment, InterfaceC09390do interfaceC09390do) {
        return new C140966Yy(fragment.requireActivity(), (AbstractC12990ll) interfaceC09390do.getValue());
    }

    public static Long A0m(C25531Mh c25531Mh, String str, String str2) {
        c25531Mh.A0k(str);
        if (str2 != null) {
            return AbstractC003100w.A0k(10, str2);
        }
        return null;
    }

    public static List A0q(C0UO c0uo) {
        return AbstractC001800i.A0a(((Map) c0uo.getValue()).keySet());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.RuntimeException, X.B4Z] */
    public static B4Z A0s(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        C117505Tk.A0I((C117505Tk) c5Tl);
        return new RuntimeException();
    }

    public static C09530e4 A0t(float f, float f2) {
        return new C09530e4(Float.valueOf(f), Float.valueOf(f2));
    }

    public static void A0v(int i, Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 2);
        C14360o3.A0B(obj3, 3);
    }

    public static void A0w(int i, Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 3);
        C14360o3.A0B(obj3, 4);
    }

    public static void A0x(int i, Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 4);
        C14360o3.A0B(obj3, 5);
    }

    public static void A0y(int i, Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 8);
        C14360o3.A0B(obj3, 9);
    }

    public static void A0z(int i, Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 16);
        C14360o3.A0B(obj3, 17);
    }

    public static void A10(Drawable drawable, C2YS c2ys, int i) {
        drawable.setColorFilter(C3DY.A00(c2ys.BoZ().A02(i)));
    }

    public static void A12(C5Tl c5Tl, C117505Tk c117505Tk, InterfaceC16820sZ interfaceC16820sZ) {
        c5Tl.Ent();
        if (c117505Tk.A0K) {
            c5Tl.AMd(interfaceC16820sZ);
        } else {
            c5Tl.FDO();
        }
    }

    public static void A13(C5Tl c5Tl, String str) {
        C5WR.A0u(c5Tl, C5XL.A01(c5Tl).A02, str, C5XL.A00(c5Tl).A0t);
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("nav_chain", C1QM.A00.A02.A00);
    }

    public static void A19(C76223bS c76223bS, C77723dw c77723dw, int i, long j) {
        c77723dw.A0Q(i);
        c77723dw.A0R(C2Z3.A00(c76223bS.BoZ(), j));
    }

    public static void A1B(C2Z0 c2z0, C77723dw c77723dw, int i, long j) {
        c77723dw.A0Q(i);
        c77723dw.A0R(C2Z3.A00(c2z0.BoZ(), j));
    }

    public static void A1C(C77123cy c77123cy) {
        C2XV.A00();
        Animator animator = (Animator) c77123cy.A00;
        if (animator != null) {
            animator.cancel();
        }
    }

    public static void A1E(C77723dw c77723dw, Integer num, float f, boolean z) {
        c77723dw.A0C();
        c77723dw.A0Y(num);
        c77723dw.A0L(f);
        c77723dw.A0b(z);
        c77723dw.A0N(z ? 1 : 0);
    }

    public static void A1F(C146106i8 c146106i8) {
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }

    public static boolean A1W(C5Tl c5Tl, Object obj, Object obj2, int i) {
        c5Tl.Eno(i);
        return c5Tl.AH6(obj) | c5Tl.AH6(obj2);
    }

    public static boolean A1Y(C5Tl c5Tl, Object obj, C117685Ud[] c117685UdArr, int i) {
        AbstractC117695Ue.A01(c5Tl, C5UA.A01(c5Tl, obj, i), c117685UdArr, 56);
        return C0fH.A02();
    }
}
