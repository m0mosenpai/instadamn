package X;

import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BEo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25231BEo {
    public static int A07(int i, int i2, int i3) {
        return i3 | (i & i2) | (234881024 & i2);
    }

    public static int A0A(C5Tl c5Tl, Object obj) {
        return !c5Tl.AH6(obj) ? 2 : 4;
    }

    public static long A0K(int i) {
        return C5AU.A04(0, i, 0, Integer.MAX_VALUE);
    }

    public static LayoutInflater A0N(Context context) {
        C14360o3.A0B(context, 0);
        return LayoutInflater.from(context);
    }

    public static LayoutInflater A0O(View view) {
        C14360o3.A0B(view, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return LayoutInflater.from(view.getContext());
    }

    public static C51722Yv A0Y(C51722Yv c51722Yv, Object obj) {
        return new C51722Yv(c51722Yv, new C9CV(C05F.A1F, obj, 4));
    }

    public static String A0q(Resources resources, int i) {
        return C84963qk.A04(resources, Integer.valueOf(i), 10000, false, false);
    }

    public static void A10(C5Tl c5Tl, Object obj, Object obj2) {
        C117505Tk.A0L((C117505Tk) c5Tl, false);
        C5UX.A04(c5Tl, obj2, (InterfaceC16620sF) obj);
    }

    public static void A1C(InterfaceExecutorC135866Co interfaceExecutorC135866Co, MailboxCallback mailboxCallback, MailboxFutureImpl mailboxFutureImpl) {
        if (!interfaceExecutorC135866Co.ELJ(mailboxCallback)) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public static void A1H(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new PYv(obj, null, i), c19l);
    }

    public static void A1I(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZA(obj, (InterfaceC23621Ds) null, i), c19l);
    }

    public static boolean A1J(int i) {
        if (i != 4) {
            return false;
        }
        return true;
    }

    public static boolean A1L(int i) {
        return (i & 112) == 32;
    }

    public static boolean A1M(int i) {
        return (i & 896) == 256;
    }

    public static boolean A1N(int i, int i2, int i3) {
        if ((i & i2) != i3) {
            return false;
        }
        return true;
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static float A02(C5Tl c5Tl) {
        return ((Configuration) c5Tl.AJX(AndroidCompositionLocals_androidKt.A00)).screenWidthDp;
    }

    public static int A06(int i, int i2) {
        return i2 | (i & 7168) | (i & 57344);
    }

    public static int A0B(C5Tl c5Tl, Object obj) {
        return !c5Tl.AH6(obj) ? 16 : 32;
    }

    public static int A0C(C5Tl c5Tl, Object obj) {
        if (c5Tl.AH6(obj)) {
            return C3OO.FLAG_MOVED;
        }
        return 1024;
    }

    public static int A0D(C5Tl c5Tl, Object obj) {
        if (c5Tl.AH6(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    public static int A0I(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static long A0J() {
        return Float.floatToRawIntBits(14.0f) | 9221683186994511872L;
    }

    public static C5Y4 A0P(Object obj) {
        return new C5Y4(obj, 1.0f, 1500.0f);
    }

    public static C57S A0Q(C57S c57s) {
        if (c57s == null) {
            return new C57S(new C58J[16]);
        }
        return c57s;
    }

    public static InterfaceC1127857k A0S(C5Tl c5Tl) {
        return AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A04, 48);
    }

    public static C6C7 A0U(String str) {
        C6C7 c6c7 = new C6C7(16);
        c6c7.A09(str);
        return c6c7;
    }

    public static AbstractC52972be A0V(Object obj) {
        return ((Fragment) obj).requireActivity().getDefaultViewModelCreationExtras();
    }

    public static C51722Yv A0W(C2XE c2xe, C51722Yv c51722Yv, EnumC76913cd enumC76913cd, String str) {
        return new C51722Yv(c51722Yv, new C76933cf(c2xe, enumC76913cd, str));
    }

    public static C51722Yv A0X(C2XI c2xi, C51722Yv c51722Yv, Integer num) {
        return new C51722Yv(c51722Yv, new C9CV(c2xi, num));
    }

    public static IllegalStateException A0i(String str) {
        return new IllegalStateException(AnonymousClass001.A0g("Argument type for ", str, " is not yet supported"));
    }

    public static Object A0l(C5Tl c5Tl, Object obj, Object obj2) {
        if (obj == obj2) {
            C25338BJh c25338BJh = new C25338BJh();
            c5Tl.FBy(c25338BJh);
            return c25338BJh;
        }
        return obj;
    }

    public static Object A0n(Object obj) {
        return ((AnonymousClass436) ((C3NX) obj).A00).Bos();
    }

    public static String A0s(C38321qM c38321qM) {
        if (c38321qM != null) {
            return c38321qM.getId();
        }
        return null;
    }

    public static String A0t(User user) {
        if (user != null) {
            return user.getId();
        }
        return null;
    }

    public static void A11(C5Tl c5Tl, Object obj, Object obj2) {
        C117505Tk.A0I((C117505Tk) c5Tl);
        C5UX.A04(c5Tl, obj2, (InterfaceC16620sF) obj);
    }

    public static void A12(C5Tl c5Tl, Object obj, Object obj2) {
        C5XJ.A00(c5Tl, obj, C5X8.A03);
        C5XJ.A00(c5Tl, obj2, C5X8.A05);
    }

    public static void A14(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i) {
        interfaceC16620sF.invoke(c5Tl, Integer.valueOf(i & 14));
        c5Tl.ASW();
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP("media_id", str);
        interfaceC02590Ai.AAP("container_module", str2);
    }

    public static void A18(AbstractC04050Jw abstractC04050Jw, C2JM c2jm) {
        c2jm.A00.A02().A0E(abstractC04050Jw, "input");
    }

    public static void A1E(Object obj) {
        InterfaceC113515Ao interfaceC113515Ao = (InterfaceC113515Ao) obj;
        C14360o3.A0B(interfaceC113515Ao, 0);
        AbstractC113575Au.A01(interfaceC113515Ao);
    }

    public static boolean A1K(int i) {
        if ((i & 112) != 32) {
            return false;
        }
        return true;
    }

    public static boolean A1Q(C5Tl c5Tl, Object obj, int i) {
        if (i == 0) {
            return c5Tl.AH4(obj);
        }
        return c5Tl.AH6(obj);
    }

    public static boolean A1V(C2XB c2xb, ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC) {
        MotionEvent motionEvent = c2xb.A00;
        C14360o3.A06(motionEvent);
        return scaleGestureDetectorOnScaleGestureListenerC65851TvC.A01(c2xb.A01, motionEvent);
    }

    public static boolean A1W(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C14360o3.A0B(obj2, 0);
        return booleanValue;
    }

    public static boolean A1X(Object obj, Object obj2) {
        ((Number) obj).intValue();
        C14360o3.A0B(obj2, 0);
        return false;
    }

    public static float A01(C5Y2 c5y2) {
        return ((Number) c5y2.getValue()).floatValue();
    }

    public static float A03(InterfaceC74953Yl interfaceC74953Yl) {
        return ((Number) interfaceC74953Yl.getValue()).floatValue();
    }

    public static float A04(InterfaceC74953Yl interfaceC74953Yl) {
        return ((Number) interfaceC74953Yl.getValue()).floatValue();
    }

    public static float A05(InterfaceC74963Ym interfaceC74963Ym) {
        return ((Number) interfaceC74963Ym.getValue()).floatValue();
    }

    public static int A08(C5Tl c5Tl, int i, int i2) {
        c5Tl.Em9();
        if ((i & 8) != 0) {
            return i2 & (-7169);
        }
        return i2;
    }

    public static int A09(C5Tl c5Tl, int i, int i2) {
        c5Tl.Em9();
        if ((i & 4) != 0) {
            return i2 & (-897);
        }
        return i2;
    }

    public static int A0E(InterfaceC74953Yl interfaceC74953Yl) {
        return ((Number) interfaceC74953Yl.getValue()).intValue();
    }

    public static int A0F(C2Z0 c2z0, int i) {
        return C2Z3.A00(c2z0.BoZ(), AbstractC77623dm.A0D(c2z0, i));
    }

    public static int A0G(Object obj, int i) {
        int A03 = C0f9.A03(i);
        C14360o3.A0B(obj, 1);
        return A03;
    }

    public static int A0H(String str, int i, int i2) {
        return (i2 + str.hashCode() + i) * 31;
    }

    public static Application A0L(Fragment fragment) {
        Application application = fragment.requireActivity().getApplication();
        C14360o3.A07(application);
        return application;
    }

    public static Resources A0M(C2Z1 c2z1) {
        return c2z1.ArD().A0C.getResources();
    }

    public static Modifier A0R(Modifier modifier, float f) {
        return C6L2.A01(AbstractC118185Wd.A0C(modifier, f), C5WF.A00);
    }

    public static InterfaceC1127857k A0T(C5Tl c5Tl, float f) {
        return AbstractC118375Wz.A00(AbstractC118255Wn.A01(f), c5Tl, C118195Wf.A04);
    }

    public static C80403iV A0Z(Drawable drawable, C2XE c2xe) {
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0D(drawable);
        A03.A0B();
        return A03;
    }

    public static C77723dw A0a(C2XE c2xe, C2XI c2xi, CharSequence charSequence, int i) {
        C77723dw A03 = C51682Yq.A03(c2xe, i);
        A03.A0W(charSequence);
        A03.A0V(c2xi);
        return A03;
    }

    public static C9CV A0b(C2YS c2ys, int i, int i2) {
        return new C9CV(C05F.A0N, AbstractC77623dm.A0F(c2ys, i), i2);
    }

    public static C140966Yy A0c(FragmentActivity fragmentActivity, InterfaceC09390do interfaceC09390do) {
        return new C140966Yy(fragmentActivity, (AbstractC12990ll) interfaceC09390do.getValue());
    }

    public static IgTextView A0d(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (IgTextView) requireViewById;
    }

    public static C14090nZ A0e(C12N c12n) {
        return c12n.CPG(480314591, 3);
    }

    public static AiAgentThreadLauncher A0f(InterfaceC09390do interfaceC09390do) {
        return new AiAgentThreadLauncher((UserSession) interfaceC09390do.getValue());
    }

    public static C189448aO A0g(InterfaceC09390do interfaceC09390do) {
        return new C189448aO((AbstractC12990ll) interfaceC09390do.getValue());
    }

    public static CWX A0h(InterfaceC09390do interfaceC09390do) {
        return ((N86) interfaceC09390do.getValue()).A01();
    }

    public static Long A0j(int i, String str) {
        C14360o3.A0B(str, i);
        return AbstractC003100w.A0k(10, str);
    }

    public static Long A0k(User user) {
        return AbstractC003100w.A0k(10, user.getId());
    }

    public static Object A0m(Fragment fragment, String str) {
        return AbstractC53062bn.A01(fragment.requireArguments(), Object.class, str);
    }

    public static Object A0o(Object obj, C0UO c0uo) {
        return ((Map) c0uo.getValue()).get(obj);
    }

    public static String A0p() {
        String obj = C0HM.A00().toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static String A0r(Resources resources, Object obj, int i, int i2) {
        String quantityString = resources.getQuantityString(i, i2, obj);
        C14360o3.A07(quantityString);
        return quantityString;
    }

    public static Iterator A0u(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, X.B4Z] */
    public static B4Z A0v(C5Tl c5Tl, C117505Tk c117505Tk, int i, boolean z) {
        c5Tl.Eno(i);
        C117505Tk.A0L(c117505Tk, z);
        return new RuntimeException();
    }

    public static void A0w(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator valueAnimator, C77123cy c77123cy) {
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.start();
        C2XV.A00();
        c77123cy.A00 = valueAnimator;
    }

    public static void A0x(Context context, Drawable drawable, int i) {
        drawable.setColorFilter(C3DY.A00(context.getColor(i)));
    }

    public static void A0y(Drawable drawable, C2YS c2ys, int i) {
        drawable.setColorFilter(C3DY.A00(AbstractC77623dm.A03(c2ys, i)));
    }

    public static void A0z(View view, long j) {
        view.measure(AbstractC78603fS.A01(j), AbstractC78603fS.A00(j));
    }

    public static void A13(C5Tl c5Tl, Object obj, InterfaceC16610sE interfaceC16610sE, int i) {
        interfaceC16610sE.invoke(obj, c5Tl, Integer.valueOf(i));
        c5Tl.ASW();
    }

    public static void A15(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i) {
        Integer valueOf = Integer.valueOf(i);
        c5Tl.FBy(valueOf);
        c5Tl.ABx(valueOf, interfaceC16620sF);
    }

    public static void A16(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static void A19(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        c2z02.A00(AbstractC76963ci.A05(c2z0, c2z02, c51722Yv));
    }

    public static void A1A(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv) {
        c2z0.A00(abstractC50812Vc);
        c2z02.A00(AbstractC76963ci.A0I(c2z0, c2z02, c51722Yv));
    }

    public static void A1B(AbstractC50812Vc abstractC50812Vc, C2Z0 c2z0, C2Z0 c2z02, C51722Yv c51722Yv, C3e8 c3e8) {
        c2z0.A00(abstractC50812Vc);
        c2z02.A00(AbstractC76963ci.A0L(c2z0, c2z02, c51722Yv, c3e8));
    }

    public static void A1D(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, C37695GiW c37695GiW, boolean z) {
        c37695GiW.A05(c120985dq, interfaceC11380iw.getModuleName(), c37644Ghd.A06(), z);
    }

    public static void A1F(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.add(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public static void A1G(Object obj, InterfaceC24901Jp interfaceC24901Jp) {
        if (interfaceC24901Jp.isActive()) {
            interfaceC24901Jp.resumeWith(obj);
        }
    }

    public static boolean A1O(C5Tl c5Tl, int i) {
        return C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(i));
    }

    public static boolean A1P(C5Tl c5Tl, Modifier modifier, Object obj, int i) {
        C6L8.A02(c5Tl, modifier, C5UA.A01(c5Tl, obj, i));
        return C0fH.A02();
    }

    public static boolean A1R(C5Tl c5Tl, Object obj, Object obj2) {
        return c5Tl.AH6(obj) | c5Tl.AH6(obj2);
    }

    public static boolean A1S(C5Tl c5Tl, Object obj, Object obj2, boolean z) {
        return z | c5Tl.AH6(obj) | c5Tl.AH4(obj2);
    }

    public static boolean A1T(InterfaceC74953Yl interfaceC74953Yl) {
        return ((Boolean) interfaceC74953Yl.getValue()).booleanValue();
    }

    public static boolean A1U(InterfaceC74963Ym interfaceC74963Ym) {
        return ((Boolean) interfaceC74963Ym.getValue()).booleanValue();
    }

    public static boolean A1Y(Object obj, Object obj2, InterfaceC16610sE interfaceC16610sE, int i) {
        interfaceC16610sE.invoke(obj, obj2, Integer.valueOf(i));
        return C0fH.A02();
    }

    public static boolean A1Z(Object obj, Object obj2, boolean z) {
        if (C14360o3.A0K(obj, obj2)) {
            return true;
        }
        return z;
    }

    public static boolean A1a(Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        return ((Boolean) interfaceC16660sJ.invoke(obj)).booleanValue();
    }

    public static boolean A1b(InterfaceC16820sZ interfaceC16820sZ) {
        return ((Boolean) interfaceC16820sZ.invoke()).booleanValue();
    }
}
