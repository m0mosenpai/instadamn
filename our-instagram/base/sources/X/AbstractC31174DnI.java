package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DnI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31174DnI {
    public static Bundle A0C() {
        return new Bundle(2);
    }

    public static C41761wQ A0S() {
        return new C41761wQ(null);
    }

    public static C8QJ A0X(Context context, UserSession userSession, List list, boolean z) {
        C8QJ c8qj = new C8QJ(context, userSession, null, z);
        c8qj.A02(list);
        return c8qj;
    }

    public static IgdsListCell A0Z(Context context) {
        return new IgdsListCell(context, null);
    }

    public static C6WQ A0i(Context context) {
        return new C6WQ(context, true);
    }

    public static void A14(Context context, Intent intent) {
        intent.putExtra("com.instagram.url.extra.IS_ALREADY_HANDLED", true);
        C12260kU.A0C(context, intent);
    }

    public static void A18(Context context, IgBloksScreenConfig igBloksScreenConfig, C66277U6x c66277U6x, Map map) {
        c66277U6x.A04 = null;
        c66277U6x.A08(map);
        c66277U6x.A04(context, igBloksScreenConfig);
    }

    public static void A1L(C140966Yy c140966Yy) {
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    public static void A1N(U7H u7h) {
        u7h.A02(new Void[0]);
    }

    public static void A1P(C36881nl c36881nl) {
        c36881nl.A0s = true;
        c36881nl.A06();
    }

    public static boolean A1X(InterfaceC19630xq interfaceC19630xq, String str, String str2) {
        return interfaceC19630xq.getBoolean(AnonymousClass001.A0R(str, str2), false);
    }

    public static RectF A0A(View view) {
        RectF rectF = AbstractC13880nE.A01;
        RectF rectF2 = new RectF();
        AbstractC13880nE.A0M(rectF2, view);
        return rectF2;
    }

    public static Bundle A0D(AbstractC12990ll abstractC12990ll) {
        Bundle bundle = new Bundle();
        AbstractC03240Dh.A00(bundle, abstractC12990ll);
        return bundle;
    }

    public static Bundle A0F(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static C3LO A0K() {
        C3LO c3lo = new C3LO();
        c3lo.A00();
        return c3lo;
    }

    public static C5e4 A0L(Object obj) {
        C5e4 c5e4 = (C5e4) obj;
        C14360o3.A0B(c5e4, 0);
        return c5e4;
    }

    public static L5L A0M(Object obj) {
        L5L l5l = (L5L) obj;
        C14360o3.A0B(l5l, 0);
        return l5l;
    }

    public static C140966Yy A0N(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0D(fragment);
        return c140966Yy;
    }

    public static C140966Yy A0O(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0E(fragment);
        return c140966Yy;
    }

    public static C31789Dy8 A0U(DirectSearchInboxFragment directSearchInboxFragment) {
        return (C31789Dy8) directSearchInboxFragment.A0P.getValue();
    }

    public static C146106i8 A0Y() {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A04();
        return c146106i8;
    }

    public static C6XJ A0a(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, cls, str);
        c6xj.A08();
        return c6xj;
    }

    public static InterfaceC19630xq A0f() {
        return AbstractC19730y1.A00(AbstractC12960li.A00).A00;
    }

    public static C31845DzD A0h(ENX enx) {
        return (C31845DzD) enx.A0C.getValue();
    }

    public static C17P A0m(UserSession userSession) {
        return C17060sy.A01.A01(userSession).A03;
    }

    public static String A0s() {
        return C16030qx.A02.A04(AbstractC12290kX.A00);
    }

    public static StringBuilder A0y(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        return sb;
    }

    public static ArrayList A0z(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static HashMap A12(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        return hashMap;
    }

    public static void A15(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }

    public static void A16(Context context, RecyclerView recyclerView, int i, boolean z) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context, i, z));
    }

    public static void A17(Context context, RecyclerView recyclerView, boolean z) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context, z ? 1 : 0, z));
    }

    public static void A19(Context context, C66277U6x c66277U6x, AbstractC12990ll abstractC12990ll) {
        c66277U6x.A04(context, new IgBloksScreenConfig(abstractC12990ll));
    }

    public static void A1A(Intent intent, int i, Bundle bundle) {
        bundle.putInt("business_account_flow", i);
        intent.putExtras(bundle);
    }

    public static void A1B(SpannableStringBuilder spannableStringBuilder, String str) {
        AnonymousClass773.A02(spannableStringBuilder, new C138566Pm(), str);
    }

    public static void A1C(View view, int i) {
        view.setBackground(new ColorDrawable(i));
    }

    public static void A1D(View view, int i, int i2) {
        view.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    public static void A1E(C07X c07x, C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c2gt.A06(c07x, new C55562Olw(i, interfaceC16660sJ));
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, Map map) {
        interfaceC02590Ai.A9M("extra", map);
        interfaceC02590Ai.Cht();
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, Map map) {
        interfaceC02590Ai.A9M("extra_client_data", map);
        interfaceC02590Ai.Cht();
    }

    public static void A1M(C140966Yy c140966Yy, String str) {
        c140966Yy.A0A = str;
        c140966Yy.A0F = true;
        c140966Yy.A04();
    }

    public static void A1O(C25671My c25671My, Integer num) {
        c25671My.E4s(new C155046xt(num));
    }

    public static void A1S(Object obj) {
        ((BusinessConversionActivity) obj).CnD(null);
    }

    public static void A1T(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new Pair(obj, obj2));
    }

    public static boolean A1Z(TimeSpentReminderFullyBlockingFragment timeSpentReminderFullyBlockingFragment) {
        return AnonymousClass280.A01.A0C(timeSpentReminderFullyBlockingFragment.A01);
    }

    public static double A00(Object obj, int i) {
        C14360o3.A0B(obj, i);
        return System.currentTimeMillis();
    }

    public static int A01(Context context) {
        return context.getColor(AbstractC53242c7.A07(context));
    }

    public static int A02(Context context) {
        return context.getColor(AbstractC53242c7.A06(context));
    }

    public static int A03(Context context) {
        return context.getColor(AbstractC53242c7.A09(context));
    }

    public static int A04(android.net.Uri uri) {
        return uri.getPathSegments().size();
    }

    public static int A05(Fragment fragment) {
        return AbstractC53242c7.A08(fragment.getContext());
    }

    public static int A06(AbstractC12990ll abstractC12990ll) {
        return C0BQ.A00(abstractC12990ll).BOZ();
    }

    public static long A07(UserSession userSession) {
        return C455127l.A03(userSession).A0P();
    }

    public static long A08(User user) {
        return Long.parseLong(user.getId());
    }

    public static ColorFilter A09(Context context, int i) {
        return C3DY.A00(context.getColor(i));
    }

    public static android.net.Uri A0B(Uri.Builder builder, String str, String str2) {
        return builder.appendQueryParameter(str, str2).build();
    }

    public static Bundle A0E(Object obj, int i) {
        C14360o3.A0B(obj, i);
        return new Bundle();
    }

    public static ViewGroup A0G(AbstractC60672pq abstractC60672pq) {
        return abstractC60672pq.getScrollingViewProxy().CFj();
    }

    public static Window A0H(Fragment fragment) {
        return fragment.requireActivity().getWindow();
    }

    public static AbstractC10360h2 A0I(Fragment fragment) {
        return fragment.requireActivity().getSupportFragmentManager();
    }

    public static C4JL A0J(Object obj) {
        obj.getClass();
        return new C4JL(obj);
    }

    public static C34724FRn A0P() {
        return AbstractC155756z4.A00().A01();
    }

    public static EnumC31515Dsz A0Q(InterfaceC09390do interfaceC09390do) {
        return ((C44536Jmg) interfaceC09390do.getValue()).A00;
    }

    public static C66392zG A0R(Fragment fragment) {
        return C66362zD.A00(fragment.requireContext());
    }

    public static ImageUrl A0T(UserSession userSession, C08730cb c08730cb) {
        return c08730cb.A01(userSession).Bhu();
    }

    public static C7TT A0V(C7U0 c7u0) {
        return c7u0.C7r().C7W();
    }

    public static C189448aO A0W(Bundle bundle, Fragment fragment, AbstractC12990ll abstractC12990ll) {
        fragment.setArguments(bundle);
        return new C189448aO(abstractC12990ll);
    }

    public static DirectThreadKey A0b(InterfaceC83733oI interfaceC83733oI) {
        return C7P4.A00(AbstractC1345466e.A01(interfaceC83733oI));
    }

    public static C54412ev A0c(UserSession userSession) {
        return AbstractC54332en.A00(userSession).A01();
    }

    public static C35043FcG A0d() {
        return AbstractC151756sL.A00().A01();
    }

    public static InterfaceC19610xo A0e(UserSession userSession, AnonymousClass282 anonymousClass282) {
        return anonymousClass282.A06(userSession).ARD();
    }

    public static InterfaceC19630xq A0g(C1AU c1au, C1AV c1av, Object obj) {
        return c1au.A04(c1av, obj.getClass());
    }

    public static FollowStatus A0j(UserSession userSession, User user) {
        return C57582kX.A00(userSession).A0N(user);
    }

    public static User A0k(UserSession userSession, String str) {
        return AnonymousClass189.A00(userSession).A02(str);
    }

    public static EnumC222416a A0l(UserSession userSession, C08730cb c08730cb) {
        return c08730cb.A01(userSession).A0I();
    }

    public static Boolean A0n(BaseBundle baseBundle, String str) {
        return Boolean.valueOf(baseBundle.getBoolean(str));
    }

    public static Boolean A0o(C2JS c2js, String str, int i) {
        return Boolean.valueOf(c2js.getCoercedBooleanField(i, str));
    }

    public static Integer A0p(Context context) {
        return Integer.valueOf(AbstractC53242c7.A03(context));
    }

    public static Integer A0q(Context context, int i) {
        return Integer.valueOf(context.getColor(i));
    }

    public static Object A0r(User user, AbstractMap abstractMap) {
        return abstractMap.get(user.getId());
    }

    public static String A0t(Context context, Object obj, Object obj2, int i) {
        return context.getString(i, obj, obj2);
    }

    public static String A0u(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0v(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0w(Fragment fragment, Object obj, int i) {
        return fragment.getString(i, obj);
    }

    public static String A0x(IgFormField igFormField) {
        return igFormField.getText().toString();
    }

    public static ArrayList A10(Object obj) {
        C14360o3.A07(obj);
        return new ArrayList();
    }

    public static HashMap A11(Object obj, int i) {
        C14360o3.A0B(obj, i);
        return new HashMap();
    }

    public static Iterator A13(List list) {
        return Collections.unmodifiableList(list).iterator();
    }

    public static void A1H(C25531Mh c25531Mh, C142846ck c142846ck, Long l) {
        c25531Mh.A0h(l);
        c25531Mh.A0u(c142846ck.A01);
    }

    public static void A1I(C25531Mh c25531Mh, String str) {
        c25531Mh.A0k(str);
        c25531Mh.A0j("tap");
    }

    public static void A1J(C25531Mh c25531Mh, String str) {
        c25531Mh.A0k(str);
        c25531Mh.A0j("view");
    }

    public static void A1K(C25531Mh c25531Mh, String str) {
        c25531Mh.A0k(str);
        c25531Mh.A0j("impression");
    }

    public static void A1Q(GZA gza, IgdsBanner igdsBanner, int i, boolean z) {
        igdsBanner.setAction(i);
        igdsBanner.setDismissible(z);
        igdsBanner.A00 = gza;
    }

    public static void A1R(C193328hC c193328hC) {
        c193328hC.A07 = !C14640oc.A01();
    }

    public static boolean A1U(android.net.Uri uri, String str) {
        return Boolean.parseBoolean(uri.getQueryParameter(str));
    }

    public static boolean A1V(UserSession userSession) {
        return AbstractC23021Ah.A00(userSession).A22();
    }

    public static boolean A1W(DirectShareTarget directShareTarget, Map map) {
        return map.containsKey(directShareTarget.A09());
    }

    public static boolean A1Y(User user, Object obj) {
        return C14360o3.A0K(obj, user.getId());
    }

    public static boolean A1a(Object obj, Object obj2) {
        return C14360o3.A0K(obj2, obj.toString());
    }

    public static boolean A1b(boolean z) {
        return Boolean.valueOf(z).booleanValue();
    }
}
