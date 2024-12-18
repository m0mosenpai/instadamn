package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.BEi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25225BEi {
    public static int A05(int i, int i2) {
        return (i + i2) * 31 * 31;
    }

    public static long A09(float f) {
        return Double.doubleToRawLongBits(f);
    }

    public static long A0A(int i) {
        return Double.doubleToRawLongBits(i);
    }

    public static long A0B(int i) {
        long j = i << 32;
        long j2 = C1132359l.A01;
        return j;
    }

    public static C1130158n A0O(C117505Tk c117505Tk) {
        C117505Tk.A0L(c117505Tk, false);
        return Modifier.A00;
    }

    public static InterfaceC16620sF A1C(C117505Tk c117505Tk, Object obj) {
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) obj;
        C117505Tk.A0L(c117505Tk, false);
        return interfaceC16620sF;
    }

    public static boolean A1Z(Object obj) {
        C14360o3.A0B(obj, 0);
        C75933ay c75933ay = C51722Yv.A02;
        return false;
    }

    public static int A01(int i) {
        return (i & 14) | (i & 112);
    }

    public static int A02(int i) {
        return (i & 112) | (i & 14);
    }

    public static int A03(int i) {
        return ((i >> 3) & 14) | 48;
    }

    public static int A04(int i) {
        return AbstractC128295qy.A00(i | 1);
    }

    public static int A06(long j) {
        return (int) (j >> 32);
    }

    public static int A08(boolean z) {
        return (z ? 1231 : 1237) * 31;
    }

    public static Context A0E(C2XE c2xe) {
        Context context = c2xe.A0C;
        C14360o3.A07(context);
        return context;
    }

    public static Context A0F(UserSession userSession) {
        return userSession.deviceSession.A06();
    }

    public static ColorDrawable A0G(int i) {
        return new ColorDrawable(i);
    }

    public static SpannableStringBuilder A0H(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    public static C5Y4 A0I(Object obj, float f, float f2) {
        return new C5Y4(obj, f, f2);
    }

    public static C117505Tk A0J(Object obj) {
        C117505Tk c117505Tk = (C117505Tk) obj;
        C117505Tk.A0I(c117505Tk);
        return c117505Tk;
    }

    public static C117505Tk A0K(Object obj, boolean z) {
        C117505Tk c117505Tk = (C117505Tk) obj;
        C117505Tk.A0L(c117505Tk, z);
        return c117505Tk;
    }

    public static C113775Bp A0L(InterfaceC74893Ye interfaceC74893Ye, InterfaceC16820sZ interfaceC16820sZ) {
        return new C113775Bp(interfaceC74893Ye, interfaceC16820sZ);
    }

    public static InterfaceC74953Yl A0M(C117505Tk c117505Tk, Object obj, boolean z) {
        InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) obj;
        C117505Tk.A0L(c117505Tk, z);
        return interfaceC74953Yl;
    }

    public static Modifier A0P(C119645bN c119645bN, Modifier modifier) {
        return c119645bN.AB5(C118195Wf.A09, modifier);
    }

    public static Modifier A0Q(Modifier modifier) {
        return modifier.Eq3(AbstractC118185Wd.A02);
    }

    public static C119365at A0R(long j) {
        return new C119365at(j);
    }

    public static C1132359l A0S(long j) {
        return new C1132359l(j);
    }

    public static C6KZ A0T(Object obj, Object obj2) {
        C6KZ c6kz = (C6KZ) obj;
        AbstractC09560e7.A00(obj2);
        return c6kz;
    }

    public static InterfaceC1127857k A0V(C5Tl c5Tl, InterfaceC118225Wj interfaceC118225Wj) {
        return AbstractC118375Wz.A01(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj);
    }

    public static C5XQ A0W(int i) {
        return new C5XQ(i);
    }

    public static C60842q8 A0a(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16510rw interfaceC16510rw) {
        return new C60842q8(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16510rw);
    }

    public static C2JM A0b() {
        return new C2JM();
    }

    public static InterfaceC40501uJ A0c() {
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return AbstractC40511uK.A00();
    }

    public static C51737MtK A0d(int i, int i2, int i3) {
        return new C51737MtK(i, i2, i3);
    }

    public static C79353gg A0f(InterfaceC16820sZ interfaceC16820sZ) {
        return new C79353gg(interfaceC16820sZ);
    }

    public static C78053eX A0g(C51722Yv c51722Yv, C2YT c2yt, C2YP c2yp) {
        return new C78053eX(c51722Yv, c2yt, c2yp);
    }

    public static C51722Yv A0h(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw) {
        return new C51722Yv(c51722Yv, interfaceC51732Yw);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.ColorDrawable, X.5xO] */
    public static C131885xO A0i(int i) {
        return new ColorDrawable(i);
    }

    public static C9CT A0m(Integer num, float f, int i) {
        return new C9CT(num, f, i);
    }

    public static C9CU A0n(Integer num, int i, long j) {
        return new C9CU(num, i, j);
    }

    public static C9CV A0o(Integer num, Object obj, int i) {
        return new C9CV(num, obj, i);
    }

    public static C2Z3 A0p(long j) {
        return new C2Z3(j);
    }

    public static C79773hS A0q(InterfaceC16820sZ interfaceC16820sZ) {
        return new C79773hS(interfaceC16820sZ);
    }

    public static C140966Yy A0r(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        return new C140966Yy(fragmentActivity, abstractC12990ll);
    }

    public static C6FX A0s() {
        return new C6FX();
    }

    public static SimpleImageUrl A0t(String str) {
        return new SimpleImageUrl(str);
    }

    public static C25267BGf A0u(C5Tl c5Tl) {
        return C6GA.A00.A02(c5Tl);
    }

    public static C189448aO A0y(AbstractC12990ll abstractC12990ll) {
        return new C189448aO(abstractC12990ll);
    }

    public static C3NX A0z(Object obj) {
        return new C3NX(obj);
    }

    public static Float A10(float f) {
        return new Float(f);
    }

    public static Object A11(C5Tl c5Tl) {
        return c5Tl.AJX(AbstractC117935Vd.A00);
    }

    public static Object A13(Object obj, int i) {
        return ((List) obj).get(i);
    }

    public static String A14() {
        return C1QM.A00.A02.A00;
    }

    public static WeakReference A16(Object obj) {
        return new WeakReference(obj);
    }

    public static ArrayList A17(int i) {
        return new ArrayList(i);
    }

    public static LinkedHashMap A18(int i) {
        return new LinkedHashMap(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.RuntimeException, X.PW2] */
    public static PW2 A19() {
        return new RuntimeException();
    }

    public static InterfaceC16820sZ A1A(C117505Tk c117505Tk, Object obj, boolean z) {
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj;
        C117505Tk.A0L(c117505Tk, z);
        return interfaceC16820sZ;
    }

    public static InterfaceC16660sJ A1B(C117505Tk c117505Tk, Object obj, boolean z) {
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) obj;
        C117505Tk.A0L(c117505Tk, z);
        return interfaceC16660sJ;
    }

    public static C0YZ A1D(Class cls) {
        return new C0YZ(cls);
    }

    public static C50156MDj A1E(Object obj, int i) {
        return new C50156MDj(obj, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ps, java.lang.Object] */
    public static C15370ps A1F() {
        return new Object();
    }

    public static C0YS A1G(C117505Tk c117505Tk, Object obj, boolean z) {
        C0YS c0ys = (C0YS) obj;
        C117505Tk.A0L(c117505Tk, z);
        return c0ys;
    }

    public static C008002u A1H(Object obj) {
        return new C008002u(obj);
    }

    public static void A1I() {
        C14360o3.A0F("mediaView");
        throw null;
    }

    public static void A1J(int i) {
        C0fH.A01(i, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
    }

    public static void A1K(C5Tl c5Tl, Object obj) {
        C5XJ.A00(c5Tl, obj, C5X8.A04);
    }

    public static void A1L(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "entrypoint");
    }

    public static void A1M(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "action_source");
    }

    public static void A1N(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("nav_chain", str);
    }

    public static void A1O(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("containermodule", str);
    }

    public static void A1P(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("viewer_session_id", str);
    }

    public static void A1R(Object obj) {
        ((Number) obj).intValue();
    }

    public static void A1S(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
    }

    public static void A1T(Object obj) {
        C117505Tk.A0I((C117505Tk) obj);
    }

    public static void A1U(Object obj, Object obj2) {
        ((InterfaceC16660sJ) obj).invoke(obj2);
    }

    public static void A1V(Object obj, boolean z) {
        C117505Tk.A0L((C117505Tk) obj, z);
    }

    public static Object[] A1b() {
        return new Object[]{C0eB.A00};
    }

    public static float A00(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return (float) C18U.A00(c06090Tz, abstractC12990ll, j);
    }

    public static int A07(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return (int) C18U.A01(c06090Tz, abstractC12990ll, j);
    }

    public static long A0C(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0m;
    }

    public static long A0D(C5Tl c5Tl) {
        return C5XL.A00(c5Tl).A0w;
    }

    public static C1130158n A0N(C5Tl c5Tl, int i) {
        c5Tl.Eno(i);
        return Modifier.A00;
    }

    public static BFo A0U(List list, int i) {
        return (BFo) list.get(i);
    }

    public static C118125Vw A0X(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A07;
    }

    public static C118125Vw A0Y(C5Tl c5Tl) {
        return C5XL.A01(c5Tl).A02;
    }

    public static AbstractC52922bZ A0Z(InterfaceC09390do interfaceC09390do) {
        return (AbstractC52922bZ) interfaceC09390do.getValue();
    }

    public static C26058Bfl A0e(InterfaceC74963Ym interfaceC74963Ym) {
        return (C26058Bfl) interfaceC74963Ym.getValue();
    }

    public static C06090Tz A0j(Object obj, int i) {
        C14360o3.A0B(obj, i);
        return C06090Tz.A05;
    }

    public static C2JS A0k(AnonymousClass436 anonymousClass436) {
        return (C2JS) anonymousClass436.Bos();
    }

    public static C2JS A0l(Iterator it) {
        return (C2JS) it.next();
    }

    public static C26077Bg6 A0v(C05A c05a) {
        return (C26077Bg6) c05a.getValue();
    }

    public static C25845Bc0 A0w(InterfaceC09390do interfaceC09390do) {
        return (C25845Bc0) interfaceC09390do.getValue();
    }

    public static C38321qM A0x(List list, int i) {
        return (C38321qM) list.get(i);
    }

    public static Object A12(C77123cy c77123cy) {
        C2XV.A00();
        return c77123cy.A00;
    }

    public static String A15(InterfaceC09390do interfaceC09390do) {
        return (String) interfaceC09390do.getValue();
    }

    public static void A1Q(C189448aO c189448aO, boolean z) {
        c189448aO.A0a = Boolean.valueOf(z);
    }

    public static boolean A1W(C5Tl c5Tl, C117505Tk c117505Tk, Object obj, InterfaceC16620sF interfaceC16620sF) {
        C5XJ.A00(c5Tl, obj, interfaceC16620sF);
        return c117505Tk.A0K;
    }

    public static boolean A1X(C5Tl c5Tl, Object obj, boolean z) {
        return z | c5Tl.AH4(obj);
    }

    public static boolean A1Y(CharSequence charSequence) {
        return !AbstractC001900j.A0T(charSequence);
    }

    public static boolean A1a(Object obj, Object obj2) {
        return !C14360o3.A0K(obj, obj2);
    }
}
