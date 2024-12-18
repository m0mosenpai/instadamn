package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.DnM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31178DnM {
    public static int A00(Context context) {
        C14360o3.A0B(context, 0);
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static View A0A(View view, int i) {
        return AbstractC56372iV.A01(view.requireViewById(i), false, false).getView();
    }

    public static InterfaceC02590Ai A0E(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        C18920wW A02 = AbstractC12220kQ.A02(abstractC12990ll);
        return A02.A00(A02.A00, "ig_edit_dob");
    }

    public static User A0T(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C08730cb.A00(userSession).A00();
    }

    public static void A0k(Activity activity, C56342iS c56342iS, C56352iT c56352iT, boolean z) {
        c56352iT.EkH(null, z);
        c56342iS.A03(activity).setIsLoading(z);
    }

    public static void A0p(Context context, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i) {
        gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(AbstractC53242c7.A0H(context, i)));
        gradientSpinnerAvatarView.setPresenceBadgeDrawable(null);
    }

    public static void A0s(BaseBundle baseBundle, Object obj, Map map) {
        if (map.containsKey(obj)) {
            baseBundle.putBoolean(obj.toString(), true);
        }
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, long j, long j2) {
        interfaceC02590Ai.A8I("elapsed_time", Double.valueOf(j - j2));
    }

    public static void A1M(C66277U6x c66277U6x, int i) {
        c66277U6x.A00 = i;
        c66277U6x.A05 = null;
        c66277U6x.A01 = 0L;
        c66277U6x.A06 = null;
    }

    public static boolean A1Z(C23031Ai c23031Ai, String str) {
        return c23031Ai.A01.getBoolean(AnonymousClass001.A0R("dismissed_find_people_card", str), false);
    }

    public static Object[] A1b(CharSequence charSequence, String str) {
        return new C11L(str).A03(charSequence).toArray(new String[0]);
    }

    public static long A03(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return -1L;
    }

    public static Bundle A05(UserSession userSession) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        return bundle;
    }

    public static Bundle A06(Object obj, Object obj2) {
        return AbstractC61636Rr0.A00(new C09530e4(obj, obj2));
    }

    public static SpannableStringBuilder A09(CharSequence charSequence, CharSequence charSequence2) {
        return new SpannableStringBuilder(charSequence).append((CharSequence) " ").append(charSequence2);
    }

    public static C62862tP A0G(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str) {
        return C62862tP.A01(null, fragmentActivity, new C19270xB(str), abstractC12990ll);
    }

    public static C1ON A0H(C1Dk c1Dk, AbstractC12990ll abstractC12990ll) {
        C907542o c907542o = new C907542o(abstractC12990ll);
        c907542o.A08(c1Dk);
        return c907542o.A05();
    }

    public static FxSsoViewModel A0O(InterfaceC018407e interfaceC018407e) {
        return (FxSsoViewModel) new C52942bb(interfaceC018407e).A00(FxSsoViewModel.class);
    }

    public static C5SU A0Q(Activity activity, View view, CharSequence charSequence) {
        C5SU c5su = new C5SU(activity, new C149686oL(charSequence));
        c5su.A03(view);
        return c5su;
    }

    public static PendingRecipient A0R(DirectShareTarget directShareTarget, int i) {
        return (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(i);
    }

    public static String A0W() {
        return AbstractC31182DnR.A05(134, 25, 95);
    }

    public static String A0X() {
        return AbstractC31182DnR.A05(354, 8, 18);
    }

    public static String A0Y() {
        return AbstractC31182DnR.A05(401, 12, 16);
    }

    public static String A0Z() {
        return AbstractC31182DnR.A05(446, 41, 77);
    }

    public static String A0a() {
        return AbstractC31182DnR.A05(779, 21, 32);
    }

    public static String A0b() {
        String str = C1QM.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0d(Fragment fragment, String str) {
        Bundle bundle = fragment.mArguments;
        if (bundle != null) {
            return bundle.getString(str);
        }
        return null;
    }

    public static String A0f(String str) {
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        String lowerCase = str.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }

    public static Throwable A0g(User user) {
        return new Throwable(AnonymousClass001.A0R("username contains space: ", user.getUsername()));
    }

    public static ArrayList A0h(String str) {
        return new ArrayList(Arrays.asList(str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
    }

    public static void A0j(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, cls, str);
        c6xj.A0J = ModalActivity.A08;
        c6xj.A0C(activity);
    }

    public static void A0l(Context context, Fragment fragment, AbstractC12990ll abstractC12990ll, InterfaceC1119153d interfaceC1119153d) {
        C189448aO c189448aO = new C189448aO(abstractC12990ll);
        c189448aO.A0U = interfaceC1119153d;
        c189448aO.A00().A03(context, fragment);
    }

    public static void A0q(android.net.Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putString("destination_id", str);
        baseBundle.putString("encoded_query", uri.getEncodedQuery());
    }

    public static void A0t(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0F = true;
        c140966Yy.A0B(bundle, fragment);
        c140966Yy.A04();
    }

    public static void A0u(SpannableString spannableString, Object obj, String str, int i) {
        Pattern pattern = AbstractC13670mt.A01;
        spannableString.setSpan(obj, i, str.length() + i, 33);
    }

    public static void A0w(Fragment fragment) {
        C56352iT.A0t.A03(fragment.getActivity()).A0T();
    }

    public static void A0x(Fragment fragment) {
        C56352iT.A0t.A03(fragment.requireActivity()).A0T();
    }

    public static void A0y(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0F = true;
        c140966Yy.A0D(fragment);
        c140966Yy.A04();
    }

    public static void A10(Fragment fragment, boolean z) {
        C56352iT.A0t.A03(fragment.requireActivity()).setIsLoading(z);
    }

    public static void A11(C07X c07x, InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        AbstractC18560vj.A03(C07Y.A00(c07x), new C15340po(interfaceC16620sF, interfaceC19390xP));
    }

    public static void A12(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "format");
        interfaceC02590Ai.A8R(EnumC33497ErW.IMPRESSION, "action");
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("guid", C16030qx.A02.A04(AbstractC12290kX.A00));
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A9K("os_version", Long.valueOf(Build.VERSION.SDK_INT));
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        interfaceC02590Ai.AAP("waterfall_id", C1Q9.A01());
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, String str, int i) {
        interfaceC02590Ai.AAP("ig_thread_id", str);
        interfaceC02590Ai.A9K("suggestion_position", Long.valueOf(i));
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, String str, long j) {
        interfaceC02590Ai.AAP("object_type", str);
        interfaceC02590Ai.A9K("pbs_owner_id", Long.valueOf(j));
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, String str, long j) {
        interfaceC02590Ai.AAP("container_module", str);
        interfaceC02590Ai.A9K("creator_igid", Long.valueOf(j));
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP("event_name", str);
        interfaceC02590Ai.AAP("original_birthday", str2);
        interfaceC02590Ai.Cht();
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, List list, boolean z) {
        interfaceC02590Ai.AAk("data_sources", list);
        interfaceC02590Ai.A7v("impression_selected", Boolean.valueOf(z));
    }

    public static void A1F(C25531Mh c25531Mh, UserSession userSession) {
        c25531Mh.A0g(Long.valueOf(Long.parseLong(userSession.userId)));
    }

    public static void A1G(C25531Mh c25531Mh, Object obj, Object obj2) {
        c25531Mh.A0v(AbstractC16850sd.A0M(new C09530e4(obj, obj2)));
        c25531Mh.Cht();
    }

    public static void A1J(C25621Ms c25621Ms, InterfaceC57927PmX interfaceC57927PmX, UserSession userSession) {
        c25621Ms.A0Q(new C56150OwG(new C07510aQ(userSession), interfaceC57927PmX));
    }

    public static void A1L(C18920wW c18920wW, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("target_id", str2);
        A00.Cht();
    }

    public static void A1P(InterfaceC56392iX interfaceC56392iX) {
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setVisibility(8);
        }
    }

    public static void A1Q(C32372ENy c32372ENy) {
        InterfaceC37194Ga5 interfaceC37194Ga5 = c32372ENy.A04;
        if (interfaceC37194Ga5 != null) {
            interfaceC37194Ga5.Cha();
        } else {
            C32372ENy.A00(c32372ENy, null);
        }
    }

    public static void A1S(C146106i8 c146106i8) {
        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
    }

    public static void A1T(Object obj) {
        FragmentActivity activity = ((Fragment) obj).getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static int A01(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return Long.valueOf(C18U.A01(c06090Tz, abstractC12990ll, j)).intValue();
    }

    public static int A02(User user) {
        if (!user.isRestricted()) {
            return 2131972499;
        }
        return 2131976188;
    }

    public static long A04(InterfaceC09390do interfaceC09390do) {
        return Long.parseLong(((UserSession) interfaceC09390do.getValue()).userId);
    }

    public static SpannableStringBuilder A07(Context context, Object obj, int i) {
        return new SpannableStringBuilder(context.getString(i, obj));
    }

    public static SpannableStringBuilder A08(Fragment fragment, Object obj, int i) {
        return new SpannableStringBuilder(fragment.getString(i, obj));
    }

    public static View A0B(Fragment fragment) {
        return fragment.requireActivity().getWindow().getDecorView();
    }

    public static TextView A0C(View view) {
        View requireViewById = view.requireViewById(R.id.title);
        C14360o3.A07(requireViewById);
        return (TextView) requireViewById;
    }

    public static RecyclerView A0D(View view) {
        View requireViewById = view.requireViewById(R.id.recycler_view);
        C14360o3.A07(requireViewById);
        return (RecyclerView) requireViewById;
    }

    public static C140966Yy A0F(C53Z c53z) {
        return new C140966Yy(c53z.requireActivity(), c53z.getSession());
    }

    public static C1ON A0I(C25621Ms c25621Ms, Class cls, Class cls2) {
        c25621Ms.A0S(cls, cls2);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static C1ON A0J(C25621Ms c25621Ms, Class cls, Class cls2) {
        c25621Ms.A0R(cls, cls2);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static C1ON A0K(C25621Ms c25621Ms, String str, String str2) {
        c25621Ms.A9s(str, str2);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N();
    }

    public static C61972ry A0L(Fragment fragment) {
        return new C61972ry(fragment.requireContext(), AbstractC018607g.A00(fragment));
    }

    public static AbstractC12990ll A0M(InterfaceC09390do interfaceC09390do) {
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
        C14360o3.A0B(abstractC12990ll, 0);
        return abstractC12990ll;
    }

    public static C81543kP A0N(EOJ eoj) {
        C81663kb A0F = eoj.A0F();
        if (A0F != null) {
            return A0F.A01.A0t;
        }
        return null;
    }

    public static C189478aR A0P(Resources resources, C189448aO c189448aO) {
        c189448aO.A0d = resources.getText(2131972812);
        return c189448aO.A00();
    }

    public static InterfaceC19630xq A0S(UserSession userSession, Object obj) {
        return C1AT.A01(userSession).A04(C1AV.A0P, obj.getClass());
    }

    public static User A0U(InterfaceC09390do interfaceC09390do) {
        return C08730cb.A00((UserSession) interfaceC09390do.getValue()).A00();
    }

    public static Integer A0V(C16L c16l, Integer num, Object obj, String str) {
        if (str.equals(obj)) {
            return Integer.valueOf(c16l.A1D());
        }
        return num;
    }

    public static String A0c(Context context, User user, int i) {
        return context.getString(i, user.getUsername());
    }

    public static String A0e(User user) {
        return AbstractC13670mt.A06("https://www.instagram.com/%s/", user.getUsername());
    }

    public static Iterator A0i(AbstractC12990ll abstractC12990ll) {
        return C83743oJ.A01(abstractC12990ll).A05().iterator();
    }

    public static void A0m(Context context, JQS jqs, InterfaceC59992oh interfaceC59992oh, InterfaceC09390do interfaceC09390do) {
        jqs.A0Q(context, C55772hI.A00((AbstractC12990ll) interfaceC09390do.getValue()), interfaceC59992oh);
    }

    public static void A0n(Context context, AbstractC23721Ec abstractC23721Ec, String str, String str2) {
        abstractC23721Ec.A9s(str, str2);
        abstractC23721Ec.A9s("guid", C16030qx.A02.A05(context));
    }

    public static void A0o(Context context, C146106i8 c146106i8) {
        c146106i8.A0D(context.getResources().getString(2131976066));
    }

    public static void A0r(android.net.Uri uri, BaseBundle baseBundle, String str, String str2) {
        baseBundle.putString(str, uri.getQueryParameter(str));
        baseBundle.putString(str2, uri.getQueryParameter(str2));
    }

    public static void A0v(Fragment fragment) {
        C56352iT.A0t.A03(fragment.requireActivity()).A0T();
    }

    public static void A0z(Fragment fragment, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(fragment.requireContext()));
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, UserSession userSession) {
        interfaceC02590Ai.A9K("actor_id", Long.valueOf(LLD.A00(userSession)));
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.A9K("creator_igid", Long.valueOf(Long.parseLong(str)));
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.A9K("target_user_id", Long.valueOf(Long.parseLong(str)));
    }

    public static void A1H(C25531Mh c25531Mh, String str, int i) {
        c25531Mh.A0p(str);
        c25531Mh.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
    }

    public static void A1I(C16L c16l) {
        if (c16l.A11() != C16R.A0G) {
            c16l.A1P();
        }
    }

    public static void A1K(AbstractC23721Ec abstractC23721Ec, String str, String str2) {
        abstractC23721Ec.A9s(str, str2);
        abstractC23721Ec.A9s("waterfall_id", C1Q9.A01());
    }

    public static void A1N(C41451vu c41451vu, C146106i8 c146106i8) {
        c41451vu.E4s(new C3KD(c146106i8.A00()));
    }

    public static void A1O(UserSession userSession, EnumC33408Epf enumC33408Epf, Integer num, long j) {
        Long valueOf = Long.valueOf(j);
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        C461329x.A04(userSession, enumC33408Epf, num, valueOf, c16920sk);
    }

    public static void A1R(C193328hC c193328hC, boolean z) {
        c193328hC.A0s(z);
        c193328hC.A0t(z);
        C0fJ.A00(c193328hC.A02());
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).A07());
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(new DirectShareTarget((User) it.next()));
    }

    public static boolean A1W(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll) {
        return C18U.A05(c06090Tz, abstractC12990ll);
    }

    public static boolean A1X(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return C18U.A06(c06090Tz, abstractC12990ll, j);
    }

    public static boolean A1Y(EMG emg, InterfaceC09390do interfaceC09390do) {
        return SaveApiUtil.A09(emg.A08(), (C38321qM) interfaceC09390do.getValue());
    }

    public static boolean A1a(InterfaceC09390do interfaceC09390do) {
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        return ((Boolean) value).booleanValue();
    }
}
