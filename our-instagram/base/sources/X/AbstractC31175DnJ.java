package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.DnJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31175DnJ {
    public static int A01(int i) {
        return i != 0 ? 8 : 0;
    }

    public static C81663kb A0M(Object obj, String str) {
        C14360o3.A0B(str, 0);
        return ((C2DU) obj).A0N(str);
    }

    public static HowItWorksNuxFragment$Row A0Q(Integer num, Integer num2, int i) {
        return new HowItWorksNuxFragment$Row(num, num2, Integer.valueOf(i), null);
    }

    public static String A0a(CharSequence charSequence, Iterable iterable) {
        return AbstractC001800i.A0P(charSequence, "", "", iterable, null);
    }

    public static void A0m(Context context, CharSequence charSequence) {
        C9GR.A03(context, charSequence, null, 1);
    }

    public static void A0n(DialogInterface dialogInterface) {
        C14360o3.A0B(dialogInterface, 0);
        dialogInterface.dismiss();
    }

    public static void A0v(Bundle bundle, Fragment fragment, C140966Yy c140966Yy) {
        fragment.setArguments(bundle);
        c140966Yy.A0B(null, fragment);
        c140966Yy.A04();
    }

    public static void A0w(C3AY c3ay, InterfaceC11380iw interfaceC11380iw, GradientSpinnerAvatarView gradientSpinnerAvatarView, Object obj) {
        gradientSpinnerAvatarView.A0G(null, interfaceC11380iw, (ImageUrl) obj, (ImageUrl) c3ay.A01);
    }

    public static void A1H(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(false);
    }

    public static void A1O(C193328hC c193328hC) {
        c193328hC.A0s(true);
        c193328hC.A0t(true);
    }

    public static void A1R(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
    }

    public static boolean A1S(int i) {
        return i <= 0;
    }

    public static boolean A1T(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, i);
        return false;
    }

    public static boolean A1a(Object obj) {
        C14360o3.A0B(obj, 3);
        return true;
    }

    public static boolean A1b(Object obj, Object obj2) {
        System.arraycopy(obj, 0, obj2, 0, 27);
        return false;
    }

    public static float A00(int i) {
        return i != 0 ? 0.3f : 1.0f;
    }

    public static long A02(UserSession userSession) {
        return new C29W(userSession).A01();
    }

    public static long A03(InterfaceC19630xq interfaceC19630xq, String str) {
        return interfaceC19630xq.getLong(str, 0L);
    }

    public static InterfaceC08100bW A0B() {
        return new C1QF("IgSecureUriParser").A00;
    }

    public static C66246U5q A0E(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        return c66246U5q;
    }

    public static C102884kP A0F(C6FW c6fw, int i) {
        return (C102884kP) c6fw.A00.get(i);
    }

    public static C189478aR A0N(AbstractC12990ll abstractC12990ll) {
        return new C189448aO(abstractC12990ll).A00();
    }

    public static String A0b(Collection collection) {
        return new JSONArray(collection).toString();
    }

    public static String A0d(Map map) {
        return new JSONObject(map).toString();
    }

    public static List A0f(DirectShareTarget directShareTarget) {
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static List A0g(User user) {
        return Collections.singletonList(new PendingRecipient(user));
    }

    public static List A0h(CharSequence charSequence, String str) {
        return new C11L(str).A03(charSequence);
    }

    public static void A0i(Activity activity) {
        C56352iT.A0t.A03(activity).A0T();
    }

    public static void A0j(Activity activity, boolean z) {
        C56352iT.A0t.A03(activity).setIsLoading(z);
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("action", str);
        interfaceC02590Ai.Cht();
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, str);
        interfaceC02590Ai.Cht();
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        interfaceC02590Ai.Cht();
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("ig_ndx_source", str);
        interfaceC02590Ai.Cht();
    }

    public static void A1B(C25531Mh c25531Mh, C142846ck c142846ck) {
        c25531Mh.A0g(Long.valueOf(c142846ck.A02));
    }

    public static void A1G(C3LO c3lo, InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.AAA(new C3LY(c3lo));
    }

    public static void A1J(C25621Ms c25621Ms) {
        c25621Ms.A0P(C07340a8.A00, EfU.class, C35072Fcj.class, false);
    }

    public static void A1N(C18920wW c18920wW, String str) {
        c18920wW.A00(c18920wW.A00, str).Cht();
    }

    public static void A1P(InterfaceC37264GbH interfaceC37264GbH) {
        if (interfaceC37264GbH != null) {
            interfaceC37264GbH.CnE(0);
        }
    }

    public static void A1Q(InterfaceC37264GbH interfaceC37264GbH) {
        if (interfaceC37264GbH != null) {
            interfaceC37264GbH.CnE(1);
        }
    }

    public static Uri.Builder A04(String str) {
        return AbstractC08820cl.A03(str).buildUpon();
    }

    public static SpannableStringBuilder A05(Context context, int i) {
        return new SpannableStringBuilder(context.getString(i));
    }

    public static LayoutInflater A06(Fragment fragment) {
        return LayoutInflater.from(fragment.requireContext());
    }

    public static View A07(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return inflate;
    }

    public static ViewGroup.MarginLayoutParams A08(View view, String str) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, str);
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static TextView A09(View view, int i) {
        View findViewById = view.findViewById(i);
        findViewById.getClass();
        return (TextView) findViewById;
    }

    public static C52942bb A0A(Fragment fragment) {
        return new C52942bb(fragment.requireActivity());
    }

    public static C140966Yy A0C(Fragment fragment, AbstractC12990ll abstractC12990ll) {
        return new C140966Yy(fragment.requireActivity(), abstractC12990ll);
    }

    public static C1ON A0D(C25621Ms c25621Ms, Class cls, Class cls2, boolean z) {
        c25621Ms.A0R(cls, cls2);
        c25621Ms.A0R = z;
        return c25621Ms.A0N();
    }

    public static InterfaceC103384lE A0G(C6FW c6fw) {
        return ((C1344465q) c6fw.A02()).A00;
    }

    public static InterfaceC103384lE A0H(C6FW c6fw) {
        return ((C1344465q) c6fw.A00()).A00;
    }

    public static InterfaceC103384lE A0I(C6FW c6fw, int i) {
        return ((C1344465q) c6fw.A03(i)).A00;
    }

    public static AbstractC12990ll A0J(C6FQ c6fq) {
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        return A0B;
    }

    public static UserSession A0K(InterfaceC09390do interfaceC09390do, int i) {
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, i);
        return userSession;
    }

    public static IgTextView A0L(View view, int i) {
        View findViewById = view.findViewById(i);
        C14360o3.A07(findViewById);
        return (IgTextView) findViewById;
    }

    public static C193328hC A0O(Fragment fragment) {
        return new C193328hC(fragment.requireContext());
    }

    public static InterfaceC65242xM A0P(AbstractC60672pq abstractC60672pq) {
        return abstractC60672pq.getScrollingViewProxy().AZU();
    }

    public static C34717FRd A0R() {
        return C3BH.A00().A01();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2fr, java.lang.Object] */
    public static C54922fr A0S() {
        AbstractC54912fq.A00();
        return new Object();
    }

    public static C64842wi A0T(AbstractC59962oe abstractC59962oe, UserSession userSession, C54922fr c54922fr, C27961Xa c27961Xa, QuickPromotionSlot quickPromotionSlot) {
        return c27961Xa.A02(abstractC59962oe, abstractC59962oe, userSession, c54922fr.A00(), quickPromotionSlot);
    }

    public static IllegalStateException A0U(String str, int i) {
        return new IllegalStateException(AnonymousClass001.A0O(str, i));
    }

    public static IllegalStateException A0V(String str, String str2) {
        return new IllegalStateException(AnonymousClass001.A0R(str, str2));
    }

    public static String A0W(Resources resources, Object obj, int i, int i2) {
        return resources.getQuantityString(i, i2, obj);
    }

    public static String A0X(android.net.Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static String A0Y(BaseBundle baseBundle, String str) {
        String string = baseBundle.getString(str);
        if (string == null) {
            return "";
        }
        return string;
    }

    public static String A0Z(C6FW c6fw, String str) {
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, str);
        return (String) A02;
    }

    public static String A0c(List list, int i) {
        Object obj = list.get(i);
        C14360o3.A07(obj);
        return (String) obj;
    }

    public static String A0e(InterfaceC09390do interfaceC09390do) {
        String str = (String) interfaceC09390do.getValue();
        C14360o3.A07(str);
        return str;
    }

    public static void A0k(Context context, AbstractC23721Ec abstractC23721Ec, C16030qx c16030qx) {
        abstractC23721Ec.A9s("guid", c16030qx.A05(context));
    }

    public static void A0l(Context context, C146106i8 c146106i8, int i) {
        String string = context.getString(i);
        C14360o3.A07(string);
        c146106i8.A0G = string;
    }

    public static void A0o(Intent intent, AbstractC12990ll abstractC12990ll) {
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", abstractC12990ll.getToken());
    }

    public static void A0p(Resources resources, C146106i8 c146106i8) {
        c146106i8.A02 = resources.getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
    }

    public static void A0q(android.net.Uri uri, BaseBundle baseBundle) {
        baseBundle.putString("screen", uri.getHost());
    }

    public static void A0r(BaseBundle baseBundle, AbstractC12990ll abstractC12990ll) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", abstractC12990ll.getToken());
    }

    public static void A0s(Bundle bundle, Fragment fragment, C140966Yy c140966Yy) {
        c140966Yy.A0B(bundle, fragment);
        c140966Yy.A0F = true;
        c140966Yy.A04();
    }

    public static void A0t(Bundle bundle, Fragment fragment, C140966Yy c140966Yy) {
        fragment.setArguments(bundle);
        c140966Yy.A0D(fragment);
        c140966Yy.A04();
    }

    public static void A0u(Bundle bundle, Fragment fragment, C140966Yy c140966Yy) {
        fragment.setArguments(bundle);
        c140966Yy.A0B(null, fragment);
    }

    public static void A0x(C2UU c2uu, Collection collection, List list) {
        list.clear();
        list.addAll(collection);
        c2uu.notifyDataSetChanged();
    }

    public static void A0y(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("waterfall_id", C1Q9.A01());
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("position", Long.valueOf(j));
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("current_time", Long.valueOf(j));
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("query_length", Long.valueOf(j));
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("ui_section_index", Long.valueOf(j));
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("search_query_length", Long.valueOf(j));
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw) {
        interfaceC02590Ai.AAP("module", interfaceC11380iw.getModuleName());
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A7v("is_epd", Boolean.valueOf(z));
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A7v("is_e2ee", Boolean.valueOf(z));
    }

    public static void A1C(C25531Mh c25531Mh, Long l, Map map) {
        c25531Mh.A0h(l);
        c25531Mh.A0v(map);
        c25531Mh.Cht();
    }

    public static void A1D(C25531Mh c25531Mh, String str) {
        c25531Mh.A0p(str);
        c25531Mh.A0n("instagram");
    }

    public static void A1E(C25531Mh c25531Mh, String str, Map map) {
        c25531Mh.A0u(str);
        c25531Mh.A0v(map);
        c25531Mh.Cht();
    }

    public static void A1F(C19T c19t, AbstractC23721Ec abstractC23721Ec, C11830jh c11830jh) {
        abstractC23721Ec.A9s("phone_id", c11830jh.A02(c19t));
    }

    public static void A1I(InterfaceC56362iU interfaceC56362iU, String str) {
        interfaceC56362iU.setTitle(str);
        interfaceC56362iU.EkS(true);
    }

    public static void A1K(C25621Ms c25621Ms, C1P1 c1p1) {
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }

    public static void A1L(C25621Ms c25621Ms, C1P1 c1p1, C1GL c1gl) {
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        c1gl.schedule(A0N);
    }

    public static void A1M(InterfaceC11380iw interfaceC11380iw, C63397SjR c63397SjR) {
        c63397SjR.A0S = interfaceC11380iw.getModuleName();
        c63397SjR.A0A();
    }

    public static boolean A1U(int i, List list) {
        return list.contains(Integer.valueOf(i));
    }

    public static boolean A1W(C16L c16l, Object obj) {
        c16l.A1J();
        return "thread_key".equals(obj);
    }

    public static boolean A1X(User user, List list) {
        return list.contains(user.getId());
    }

    public static boolean A1Y(User user, java.util.Set set) {
        return set.contains(user.getId());
    }

    public static boolean A1Z(CharSequence charSequence, Pattern pattern) {
        return pattern.matcher(charSequence).matches();
    }

    public static boolean A1V(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll) {
        return C18U.A06(c06090Tz, abstractC12990ll, 36318209095833631L);
    }
}
