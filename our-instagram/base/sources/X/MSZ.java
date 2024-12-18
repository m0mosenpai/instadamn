package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcel;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.CoroutineLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.odin.model.Example;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import java.io.File;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class MSZ {
    public static float A00(int i, int i2, float f) {
        return i2 + C1H4.A01((i - i2) * f);
    }

    public static int A05(C22M c22m) {
        if (c22m.A01 == 2) {
            return 2;
        }
        return 1;
    }

    public static C3SN A0O(Object obj) {
        return new C3SN(obj, null, true);
    }

    public static C3SN A0P(Throwable th) {
        return new C3SN(C16930sl.A00, th.getMessage(), false);
    }

    public static C1DY A0S(C1DV c1dv) {
        return new C1DY(c1dv, (java.util.Set) new HashSet(), false);
    }

    public static C1ON A0U(C25621Ms c25621Ms) {
        c25621Ms.A0P(null, C40781ul.class, C55702hA.class, true);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static StringWriter A0f(Object obj) {
        C14360o3.A0B(obj, 0);
        return new StringWriter();
    }

    public static Double A0g(long j) {
        return Double.valueOf(((float) j) / 1000.0f);
    }

    public static Object A0k(InterfaceC100484fC interfaceC100484fC, String str, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC209010m.A02(interfaceC23621Ds, interfaceC100484fC.BIg(str, 0));
    }

    public static Object A0o(List list, int i) {
        if (i > 0) {
            return list.get(0);
        }
        return Example.A03;
    }

    public static C008002u A0y() {
        return new C008002u(false);
    }

    public static void A12(Parcel parcel, Enum r2) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(r2.name());
    }

    public static void A13(View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, int i) {
        interfaceC02590Ai.A9K("audio_index", Long.valueOf(i));
    }

    public static void A1K(C140966Yy c140966Yy) {
        c140966Yy.A0E = true;
        OPZ.A01().A00();
    }

    public static void A1M(C187358Sd c187358Sd) {
        c187358Sd.A0G(new C8TG(-1));
    }

    public static void A1O(Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(obj2, 4);
    }

    public static void A1R(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC2(obj, null, i), c19l);
    }

    public static int A06(C55228Oey c55228Oey) {
        return ((Number) c55228Oey.A04.A00).intValue();
    }

    public static int A07(C55228Oey c55228Oey) {
        return ((Number) c55228Oey.A04.A01).intValue();
    }

    public static long A0B(long j) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
    }

    public static long A0D(String str) {
        Long A0k = AbstractC003100w.A0k(10, str);
        if (A0k == null) {
            return 0L;
        }
        return A0k.longValue();
    }

    public static ActivityManager A0F(Context context) {
        Object systemService = context.getSystemService("activity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return (ActivityManager) systemService;
    }

    public static InterfaceC02590Ai A0M(C22F c22f) {
        C18920wW c18920wW = c22f.A01;
        return c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
    }

    public static C04750Mt A0R(Context context, Intent intent) {
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0B(intent, context.getClassLoader());
        return c04750Mt;
    }

    public static C89P A0X(InterfaceC52932ba interfaceC52932ba, InterfaceC018407e interfaceC018407e) {
        return (C89P) new C52942bb(interfaceC52932ba, interfaceC018407e).A00(C89P.class);
    }

    public static C5SU A0b(Activity activity, CharSequence charSequence) {
        return new C5SU(activity, new C149686oL(charSequence));
    }

    public static Reel A0c(UserSession userSession, C1NB c1nb, String str, boolean z) {
        Reel reel = new Reel(c1nb, str, z);
        ReelStore.A03(userSession).A0X(reel);
        return reel;
    }

    public static Integer A0i(UserSession userSession) {
        return C17060sy.A01.A01(userSession).A0M();
    }

    public static Object A0j(Context context) {
        Object systemService = context.getSystemService("keyguard");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return systemService;
    }

    public static String A0p() {
        return AbstractC50532MSl.A01(9, 8, 79);
    }

    public static void A0z(PendingIntent pendingIntent, XN9 xn9, CharSequence charSequence, int i) {
        xn9.A0Y.add(new Y0K(pendingIntent, charSequence, i));
    }

    public static void A1A(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "surface");
        interfaceC02590Ai.A8R(AnonymousClass249.VIDEO, "media_type");
    }

    public static void A1C(InterfaceC02530Ab interfaceC02530Ab, AbstractC02600Aj abstractC02600Aj, Map map) {
        abstractC02600Aj.A0M(interfaceC02530Ab, "action");
        abstractC02600Aj.A00.A9M("extra_info", map);
    }

    public static void A1J(BrandedContentGatingInfoIntf brandedContentGatingInfoIntf, N8G n8g, String str, Collection collection, boolean z) {
        n8g.A04 = new ArrayList(collection);
        n8g.A03 = str;
        n8g.A09 = z;
        n8g.A00 = brandedContentGatingInfoIntf;
    }

    public static boolean A1W(AbstractC12990ll abstractC12990ll) {
        return C18U.A06(C06090Tz.A05, abstractC12990ll, 36323783962865260L);
    }

    public static boolean A1b(Object[] objArr, int i) {
        Object obj = objArr[i];
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public static float A01(Context context) {
        return context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
    }

    public static float A02(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return motionEvent.getRawY() - motionEvent2.getRawY();
    }

    public static float A03(InterfaceC09390do interfaceC09390do) {
        return ((Number) interfaceC09390do.getValue()).floatValue();
    }

    public static int A04(Context context, Fragment fragment) {
        return context.getColor(AbstractC53242c7.A06(fragment.getContext()));
    }

    public static int A08(InterfaceC16820sZ interfaceC16820sZ) {
        return ((Number) interfaceC16820sZ.invoke()).intValue();
    }

    public static int A09(C05A c05a) {
        return ((AbstractCollection) c05a.getValue()).size();
    }

    public static int A0A(C05A c05a) {
        return ((Number) c05a.getValue()).intValue();
    }

    public static long A0C(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return C18U.A01(c06090Tz, abstractC12990ll, j) * 1000;
    }

    public static long A0E(InterfaceC16820sZ interfaceC16820sZ) {
        return ((Number) interfaceC16820sZ.invoke()).longValue();
    }

    public static Context A0G(C193578hc c193578hc) {
        Context applicationContext = c193578hc.A0D().getApplicationContext();
        C14360o3.A07(applicationContext);
        return applicationContext;
    }

    public static Spanned A0H(Resources resources, Object obj, int i) {
        Spanned A00 = AbstractC07900bA.A00(resources, new Object[]{obj}, i);
        C14360o3.A07(A00);
        return A00;
    }

    public static View A0I(MotionEvent motionEvent, RecyclerView recyclerView) {
        return recyclerView.A0T(motionEvent.getX(), motionEvent.getY());
    }

    public static View A0J(InterfaceC09390do interfaceC09390do) {
        return ((C3PX) interfaceC09390do.getValue()).A00();
    }

    public static View A0K(InterfaceC09390do interfaceC09390do) {
        return ((C57012jc) interfaceC09390do.getValue()).A01();
    }

    public static CoroutineLiveData A0L(InterfaceC16600sD interfaceC16600sD, InterfaceC19390xP interfaceC19390xP, InterfaceC19390xP interfaceC19390xP2, InterfaceC19390xP interfaceC19390xP3) {
        return AbstractC58232lf.A00(AnonymousClass191.A00, C10Q.A00(interfaceC16600sD, interfaceC19390xP, interfaceC19390xP2, interfaceC19390xP3));
    }

    public static C34719FRg A0N(Context context) {
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        return new C34719FRg(context, locale);
    }

    public static C51732MtD A0Q(InterfaceC31063Dl5 interfaceC31063Dl5) {
        return (C51732MtD) interfaceC31063Dl5.B9j().invoke();
    }

    public static C140966Yy A0T(N6G n6g) {
        return new C140966Yy(n6g.requireActivity(), n6g.A06());
    }

    public static C24U A0V(InterfaceC09390do interfaceC09390do) {
        return AnonymousClass229.A01((UserSession) interfaceC09390do.getValue()).A03;
    }

    public static C51832Mva A0W(AbstractList abstractList, int i, int i2) {
        return (C51832Mva) ((AbstractList) abstractList.get(i)).get(i2);
    }

    public static C84B A0Y(C84B c84b, Iterable iterable) {
        return new C84B(AbstractC001800i.A0a(iterable), c84b.A03);
    }

    public static C87H A0Z(C52942bb c52942bb, Class cls) {
        return ((C87G) c52942bb.A00(cls)).A00("post_capture");
    }

    public static C131965xW A0a(InterfaceC09390do interfaceC09390do) {
        return C131975xX.A00((UserSession) interfaceC09390do.getValue());
    }

    public static InterfaceC105054oL A0d(InterfaceC09390do interfaceC09390do) {
        return ((InterfaceC100484fC) interfaceC09390do.getValue()).ARC();
    }

    public static Product A0e(Iterator it) {
        return ((MediaSuggestedProductTag) it.next()).A07();
    }

    public static Integer A0h(UserSession userSession) {
        return C08730cb.A00(userSession).A00().A0M();
    }

    public static Object A0l(Object obj, InterfaceC09390do interfaceC09390do) {
        return ((Map) interfaceC09390do.getValue()).get(obj);
    }

    public static Object A0m(Iterator it) {
        return ((Map.Entry) it.next()).getKey();
    }

    public static Object A0n(Iterator it) {
        return ((Reference) it.next()).get();
    }

    public static String A0q(Fragment fragment, Object obj, int i) {
        String string = fragment.getString(i, obj);
        C14360o3.A07(string);
        return string;
    }

    public static String A0r(UserFlowLoggerImpl userFlowLoggerImpl, String str, Throwable th, long j) {
        userFlowLoggerImpl.flowMarkPoint(j, str);
        String message = th.getMessage();
        if (message == null) {
            return "empty";
        }
        return message;
    }

    public static String A0s(AnonymousClass182 anonymousClass182, Object obj) {
        anonymousClass182.A0Z();
        anonymousClass182.close();
        return obj.toString();
    }

    public static String A0t(Enum r1) {
        String lowerCase = r1.name().toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }

    public static String A0u(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0v(Iterator it) {
        return ((com.instagram.tagging.model.Tag) it.next()).getId();
    }

    public static ArrayList A0w(C05A c05a) {
        return AbstractC001800i.A0U((Collection) c05a.getValue());
    }

    public static Iterator A0x(C0UO c0uo) {
        return ((Iterable) c0uo.getValue()).iterator();
    }

    public static void A10(Context context, TextView textView, Object obj, Object obj2, int i) {
        textView.setText(context.getString(i, obj, obj2));
    }

    public static void A11(Resources resources, TextView textView, Object obj, int i) {
        textView.setText(resources.getString(i, obj));
    }

    public static void A14(View view, int i) {
        view.requireViewById(i).setVisibility(0);
    }

    public static void A15(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void A16(Fragment fragment, C6WQ c6wq, int i) {
        c6wq.A00(fragment.getString(i));
        C0fJ.A00(c6wq);
    }

    public static void A17(AbstractC52922bZ abstractC52922bZ, InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        AbstractC18560vj.A03(AbstractC141776au.A00(abstractC52922bZ), AnonymousClass111.A01(interfaceC16620sF, interfaceC19390xP));
    }

    public static void A18(AbstractC52922bZ abstractC52922bZ, InterfaceC16610sE interfaceC16610sE, InterfaceC19390xP interfaceC19390xP, InterfaceC19390xP interfaceC19390xP2) {
        AbstractC18560vj.A03(AbstractC141776au.A00(abstractC52922bZ), C10Q.A03(interfaceC16610sE, interfaceC19390xP, interfaceC19390xP2));
    }

    public static void A19(AbstractC52922bZ abstractC52922bZ, InterfaceC16600sD interfaceC16600sD, InterfaceC19390xP interfaceC19390xP, InterfaceC19390xP interfaceC19390xP2, InterfaceC19390xP interfaceC19390xP3) {
        AbstractC18560vj.A03(AbstractC141776au.A00(abstractC52922bZ), C10Q.A00(interfaceC16600sD, interfaceC19390xP, interfaceC19390xP2, interfaceC19390xP3));
    }

    public static void A1B(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, str);
        interfaceC02590Ai.A8R(EnumC193318hB.A02, "capture_type");
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, C22M c22m, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, JIN jin, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("alacorn_session_id", jin.Aal());
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, C47Z c47z) {
        interfaceC02590Ai.AAP(AbstractC31188DnX.A00(), C70343Ds.A01(c47z));
    }

    public static void A1H(C25531Mh c25531Mh, C448124l c448124l, String str) {
        c25531Mh.A0q(str);
        C448124l.A00(c25531Mh, c448124l);
        c25531Mh.A0a(c448124l.A0J());
    }

    public static void A1I(C25531Mh c25531Mh, C448124l c448124l, String str) {
        c25531Mh.A0q(str);
        C448124l.A00(c25531Mh, c448124l);
        c25531Mh.A0a(EnumC114925Hg.CLIPS);
    }

    public static void A1L(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, Integer num2, InterfaceC09390do interfaceC09390do) {
        LL0.A02(interfaceC11380iw, userSession, num, num2, LB9.A00((UserSession) interfaceC09390do.getValue()));
    }

    public static void A1N(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void A1P(Object obj, AbstractCollection abstractCollection) {
        if (!abstractCollection.contains(obj)) {
            abstractCollection.add(obj);
        }
    }

    public static void A1Q(Object obj, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        abstractCollection2.add(Boolean.valueOf(abstractCollection.add(obj)));
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C38682GzN) it.next()).A04);
    }

    public static void A1T(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof C115475Kh) {
            abstractCollection.add(next);
        }
    }

    public static void A1U(InterfaceC09390do interfaceC09390do, int i) {
        View view = (View) interfaceC09390do.getValue();
        C14360o3.A07(view);
        view.setVisibility(i);
    }

    public static void A1V(InterfaceC09390do interfaceC09390do, int i) {
        View view = (View) interfaceC09390do.getValue();
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static boolean A1X(C196058lv c196058lv, String str) {
        return C196068lw.A03(c196058lv.A00(CallerContext.A01(str)));
    }

    public static boolean A1Y(InterfaceC09390do interfaceC09390do) {
        return ((C3PX) interfaceC09390do.getValue()).A01();
    }

    public static boolean A1Z(C05A c05a) {
        return c05a.AIi(c05a.getValue(), new ArrayList());
    }

    public static boolean A1a(C0UO c0uo) {
        return ((Boolean) c0uo.getValue()).booleanValue();
    }
}
