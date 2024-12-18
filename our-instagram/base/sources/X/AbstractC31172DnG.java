package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.DnG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31172DnG {
    public static int A01(InterfaceC19630xq interfaceC19630xq, String str) {
        return interfaceC19630xq.getInt(str, 0);
    }

    public static LayoutInflater A09(Context context) {
        C14360o3.A0B(context, 0);
        return LayoutInflater.from(context);
    }

    public static View A0A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public static C62862tP A0N(Fragment fragment, AbstractC12990ll abstractC12990ll) {
        return C62862tP.A03(fragment, abstractC12990ll, null);
    }

    public static C62862tP A0O(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        return C62862tP.A01(null, fragmentActivity, interfaceC11380iw, abstractC12990ll);
    }

    public static DirectThreadKey A0o(C16L c16l) {
        DirectThreadKey parseFromJson = AbstractC83623o5.parseFromJson(c16l);
        C14360o3.A0B(parseFromJson, 0);
        return parseFromJson;
    }

    public static void A1I(android.net.Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putBoolean(str, uri.getBooleanQueryParameter(str, false));
    }

    public static boolean A1X(BaseBundle baseBundle, String str) {
        return baseBundle.getBoolean(str, false);
    }

    public static boolean A1a(InterfaceC19630xq interfaceC19630xq, String str) {
        return interfaceC19630xq.getBoolean(str, false);
    }

    public static Context A05(C3OO c3oo) {
        return c3oo.itemView.getContext();
    }

    public static Context A06(Object obj) {
        return ((Fragment) obj).getContext();
    }

    public static Context A07(Object obj) {
        return ((Fragment) obj).requireContext();
    }

    public static Bundle A08(Intent intent) {
        return intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
    }

    public static FragmentActivity A0C(Object obj) {
        return ((Fragment) obj).requireActivity();
    }

    public static CoroutineLiveData A0E(InterfaceC19390xP interfaceC19390xP) {
        return AbstractC58232lf.A00(AnonymousClass191.A00, interfaceC19390xP);
    }

    public static C25531Mh A0H(C7F3 c7f3) {
        return C25531Mh.A0J(c7f3.A01);
    }

    public static C25531Mh A0I(C142846ck c142846ck) {
        return C25531Mh.A0E(c142846ck.A03);
    }

    public static FanClubInfoDict A0M(User user) {
        return user.A03.B4O();
    }

    public static C11830jh A0P(AbstractC12990ll abstractC12990ll) {
        return C11830jh.A04.A01(abstractC12990ll);
    }

    public static C1ON A0U(C25621Ms c25621Ms, boolean z) {
        c25621Ms.A0R = z;
        return c25621Ms.A0N();
    }

    public static AbstractC18680vv A0V(Bundle bundle) {
        return C023409i.A0A.A04(bundle);
    }

    public static C81543kP A0g(Object obj) {
        return ((C81663kb) obj).A01.A0t;
    }

    public static C81663kb A0h(Object obj, String str) {
        return ((C2DU) obj).A0N(str);
    }

    public static C14H A0l() {
        return C14H.A03.A00();
    }

    public static C3DN A0r(Activity activity) {
        return C3DN.A00.A00(activity);
    }

    public static Boolean A0s(boolean z) {
        return Boolean.valueOf(!z);
    }

    public static IllegalArgumentException A0t() {
        return new IllegalArgumentException("threadId can't be null");
    }

    public static IllegalStateException A0u() {
        return new IllegalStateException("Check failed.");
    }

    public static IllegalStateException A0v() {
        return new IllegalStateException("Missing required params");
    }

    public static String A0z(int i) {
        if (i != 0) {
            return "True";
        }
        return "False";
    }

    public static String A10(Context context) {
        return C16030qx.A02.A05(context);
    }

    public static String A11(android.net.Uri uri) {
        return uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public static String A12(android.net.Uri uri) {
        return uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static String A13(BaseBundle baseBundle, String str) {
        return baseBundle.getString(str, "");
    }

    public static String A14(DirectShareTarget directShareTarget) {
        String str = directShareTarget.A0I;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static List A18(DirectShareTarget directShareTarget) {
        return Collections.unmodifiableList(directShareTarget.A0Q);
    }

    public static void A1N(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("module", "waterfall_log_in");
    }

    public static void A1O(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("containermodule", "waterfall_log_in");
    }

    public static void A1V(Object obj, Object obj2, MAK mak, int i) {
        mak.A01 = obj;
        mak.A02 = obj2;
        mak.A00 = i;
    }

    public static boolean A1Z(UserSession userSession, String str) {
        return str.equals(userSession.userId);
    }

    public static int A00(InterfaceC163837Ux interfaceC163837Ux) {
        return interfaceC163837Ux.C7W().A08;
    }

    public static int A02(List list, int i) {
        return i + list.size();
    }

    public static int A03(List list, int i) {
        return list.size() - i;
    }

    public static Activity A04(AbstractC59962oe abstractC59962oe) {
        Activity rootActivity = abstractC59962oe.getRootActivity();
        C14360o3.A0A(rootActivity);
        return rootActivity;
    }

    public static LinearLayout A0B(View view, int i) {
        return (LinearLayout) view.requireViewById(i);
    }

    public static AbstractC10360h2 A0D(FragmentActivity fragmentActivity) {
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        return supportFragmentManager;
    }

    public static C2GT A0F(InterfaceC09390do interfaceC09390do) {
        return (C2GT) interfaceC09390do.getValue();
    }

    public static RecyclerView A0G(View view, int i) {
        return (RecyclerView) view.requireViewById(i);
    }

    public static MWT A0J(C05A c05a) {
        return (MWT) c05a.getValue();
    }

    public static ImmutableList A0K(ImmutableList.Builder builder) {
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }

    public static InterfaceC40821up A0L(AbstractC115105If abstractC115105If) {
        return (InterfaceC40821up) abstractC115105If.A00();
    }

    public static C18920wW A0Q(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, int i) {
        C14360o3.A0B(abstractC12990ll, i);
        return AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }

    public static C1ON A0R(C222015v c222015v, C25621Ms c25621Ms, Class cls, Class cls2, boolean z) {
        c25621Ms.A0P(c222015v, cls, cls2, z);
        return c25621Ms.A0N();
    }

    public static C1ON A0S(C25621Ms c25621Ms, Class cls, Class cls2) {
        c25621Ms.A0S(cls, cls2);
        return c25621Ms.A0N();
    }

    public static C1ON A0T(C25621Ms c25621Ms, String str, String str2) {
        c25621Ms.A9s(str, str2);
        return c25621Ms.A0N();
    }

    public static UserSession A0W(C6FQ c6fq) {
        return (UserSession) C6BQ.A0B(c6fq);
    }

    public static IgTextView A0X(View view, int i) {
        return (IgTextView) view.requireViewById(i);
    }

    public static IgTextView A0Y(View view, int i) {
        return (IgTextView) view.findViewById(i);
    }

    public static IgImageView A0Z(View view, int i) {
        return (IgImageView) view.requireViewById(i);
    }

    public static IgImageView A0a(View view, int i) {
        return (IgImageView) view.findViewById(i);
    }

    public static C36296Fzq A0b(InterfaceC09390do interfaceC09390do) {
        return (C36296Fzq) interfaceC09390do.getValue();
    }

    public static C7F3 A0c(InterfaceC09390do interfaceC09390do) {
        return (C7F3) interfaceC09390do.getValue();
    }

    public static C142846ck A0d(InterfaceC09390do interfaceC09390do) {
        return (C142846ck) interfaceC09390do.getValue();
    }

    public static C36298Fzs A0e(InterfaceC09390do interfaceC09390do) {
        return (C36298Fzs) interfaceC09390do.getValue();
    }

    public static DirectCollectionArguments A0f(InterfaceC09390do interfaceC09390do) {
        return (DirectCollectionArguments) interfaceC09390do.getValue();
    }

    public static C38321qM A0i(Iterator it) {
        return (C38321qM) it.next();
    }

    public static IgdsBottomButtonLayout A0j(View view, int i) {
        return (IgdsBottomButtonLayout) view.requireViewById(i);
    }

    public static IgFormField A0k(View view, int i) {
        return (IgFormField) view.requireViewById(i);
    }

    public static DirectShareTarget A0m(Iterator it) {
        return (DirectShareTarget) it.next();
    }

    public static DirectShareTarget A0n(List list, int i) {
        return (DirectShareTarget) list.get(i);
    }

    public static PendingRecipient A0p(Iterator it) {
        return (PendingRecipient) it.next();
    }

    public static InterfaceC19630xq A0q(C18720vz c18720vz) {
        return AbstractC19730y1.A00(c18720vz).A00;
    }

    public static Iterable A0w(C05A c05a) {
        return (Iterable) c05a.getValue();
    }

    public static Object A0x(View view) {
        Object tag = view.getTag();
        tag.getClass();
        return tag;
    }

    public static Object A0y(InterfaceC08830cm interfaceC08830cm) {
        Object obj = interfaceC08830cm.get();
        C14360o3.A07(obj);
        return obj;
    }

    public static String A15(C3o9 c3o9) {
        return JRE.A01(c3o9).A00;
    }

    public static String A16(Locale locale, String str) {
        String lowerCase = str.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }

    public static String A17(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static List A19(List list) {
        List unmodifiableList = Collections.unmodifiableList(list);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static void A1A() {
        C3BH.A00().A01();
    }

    public static void A1B(Context context, View view, int i) {
        view.setBackgroundColor(context.getColor(i));
    }

    public static void A1C(Context context, C193328hC c193328hC, int i) {
        c193328hC.A05 = context.getString(i);
    }

    public static void A1D(Context context, StringBuilder sb, int i) {
        sb.append(context.getString(i));
    }

    public static void A1E(Resources resources, View view, int i) {
        view.setContentDescription(resources.getString(i));
    }

    public static void A1F(Resources resources, ViewGroup.LayoutParams layoutParams, int i) {
        layoutParams.height = resources.getDimensionPixelSize(i);
    }

    public static void A1G(Resources resources, C189448aO c189448aO, int i) {
        c189448aO.A0d = resources.getString(i);
    }

    public static void A1H(Resources resources, C146106i8 c146106i8, int i) {
        c146106i8.A0D = resources.getString(i);
    }

    public static void A1J(View view, int i, int i2) {
        view.requireViewById(i).setVisibility(i2);
    }

    public static void A1K(TextView textView, Fragment fragment, C5QE c5qe) {
        textView.setText(BHX.A02(fragment, c5qe));
    }

    public static void A1L(Fragment fragment, C189448aO c189448aO, int i) {
        c189448aO.A0d = fragment.getString(i);
    }

    public static void A1M(Fragment fragment, C6XJ c6xj) {
        c6xj.A0C(fragment.requireActivity());
    }

    public static void A1P(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(AbstractC31422DrR.A00(), str);
    }

    public static void A1Q(AbstractC23721Ec abstractC23721Ec, int i, int i2, int i3) {
        abstractC23721Ec.A0B(AbstractC31182DnR.A05(i, i2, i3));
    }

    public static void A1R(UserSession userSession, User user) {
        AnonymousClass189.A00(userSession).A03(user);
    }

    public static void A1S(UserSession userSession, Integer num, String str, long j) {
        C461329x.A07(userSession, num, Long.valueOf(j), str);
    }

    public static void A1T(InterfaceC56392iX interfaceC56392iX, int i) {
        interfaceC56392iX.getView().setVisibility(i);
    }

    public static void A1U(IgdsBanner igdsBanner, CharSequence charSequence, boolean z) {
        igdsBanner.setBody(charSequence, Boolean.valueOf(z));
    }

    public static void A1W(Iterator it, JSONArray jSONArray) {
        jSONArray.put(it.next());
    }

    public static boolean A1Y(IgFragmentActivity igFragmentActivity) {
        return igFragmentActivity.getSession() instanceof UserSession;
    }

    public static boolean A1b(Boolean bool) {
        C14360o3.A0A(bool);
        return bool.booleanValue();
    }
}
