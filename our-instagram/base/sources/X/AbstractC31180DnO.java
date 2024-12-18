package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.DnO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31180DnO {
    public static C140966Yy A0A(FragmentActivity fragmentActivity, IgBloksScreenConfig igBloksScreenConfig, C66277U6x c66277U6x, AbstractC12990ll abstractC12990ll) {
        C72743Nv A03 = c66277U6x.A03(fragmentActivity, igBloksScreenConfig);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        C14360o3.A0A(A03);
        c140966Yy.A0B(null, A03);
        return c140966Yy;
    }

    public static C57112jm A0N() {
        return AbstractC57052jg.A01(null, AbstractC57052jg.A00());
    }

    public static User A0W(C16L c16l, User user, Object obj, String str) {
        if (str.equals(obj)) {
            Parcelable.Creator creator = User.CREATOR;
            return AbstractC38851rI.A00(c16l, false);
        }
        return user;
    }

    public static Object A0X(Fragment fragment, C140966Yy c140966Yy) {
        c140966Yy.A0B(null, fragment);
        c140966Yy.A04();
        return null;
    }

    public static String A0Z() {
        return AbstractC31182DnR.A05(0, 33, 112);
    }

    public static String A0l(List list) {
        return (String) list.get(3);
    }

    public static void A0w(int i) {
        new C1DY((C1DV) new C37761pD(null), i, false);
    }

    public static void A0y(Activity activity, Intent intent) {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void A1C(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0D(fragment);
        c140966Yy.A0D = false;
        c140966Yy.A04();
    }

    public static void A1K(AbstractC02600Aj abstractC02600Aj) {
        abstractC02600Aj.A0R("radio_type", null);
        abstractC02600Aj.A0R("reason", null);
        abstractC02600Aj.A0R("group_name", null);
    }

    public static void A1L(C25531Mh c25531Mh) {
        c25531Mh.A0Z(8);
        c25531Mh.A0X(0);
    }

    public static void A1Q(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle("");
    }

    public static void A1T(Object obj) {
        C14360o3.A0B(obj, 0);
        C14360o3.A07(C28531Zo.A04.A02);
    }

    public static boolean A1X(Object obj, Object obj2) {
        C14360o3.A0B(obj, 0);
        return obj2.equals(obj);
    }

    public static Bundle A03(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("android.intent.extra.TEXT", str);
        return bundle;
    }

    public static C25531Mh A09(InterfaceC02590Ai interfaceC02590Ai, User user, int i) {
        C25531Mh c25531Mh = new C25531Mh(interfaceC02590Ai, i);
        c25531Mh.A0R("target_id", user.getId());
        return c25531Mh;
    }

    public static C140966Yy A0B(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0E = true;
        return c140966Yy;
    }

    public static C140966Yy A0C(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0D = false;
        return c140966Yy;
    }

    public static C140966Yy A0D(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0D = false;
        c140966Yy.A0F = true;
        return c140966Yy;
    }

    public static C1ON A0H(C25621Ms c25621Ms, Class cls, Class cls2) {
        c25621Ms.A0P(C07340a8.A00, cls, cls2, false);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static FOE A0R(OKH okh) {
        return (FOE) okh.A01(new C0YZ(FOE.class));
    }

    public static Object A0Y(OKH okh, Class cls) {
        return okh.A01(new C0YZ(cls));
    }

    public static String A0g(CategorySearchFragment categorySearchFragment) {
        if (categorySearchFragment.A0G) {
            return "change_category";
        }
        return "choose_category";
    }

    public static String A0i(C6FW c6fw, int i) {
        return (String) c6fw.A00.get(i);
    }

    public static String A0k(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static UnsupportedOperationException A0m(Object obj) {
        return new UnsupportedOperationException(AnonymousClass001.A0R("Unexpected partnerType, received ", obj.toString()));
    }

    public static HashMap A0o(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", obj);
        return hashMap;
    }

    public static HashMap A0p(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put("back_stack_tag", obj);
        hashMap.put("entrypoint", obj2);
        return hashMap;
    }

    public static LinkedHashMap A0r(Object obj, Object obj2, C09530e4 c09530e4, C09530e4 c09530e42, C09530e4 c09530e43) {
        return AbstractC06930Yk.A07(c09530e4, c09530e42, c09530e43, new C09530e4(obj, obj2));
    }

    public static List A0s(RegFlowExtras regFlowExtras) {
        List list = regFlowExtras.A0f;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            regFlowExtras.A0f = arrayList;
            return arrayList;
        }
        return list;
    }

    public static Map A0t(DirectPromptTypes directPromptTypes) {
        return AbstractC16850sd.A0M(new C09530e4("prompt_type", directPromptTypes.A01));
    }

    public static C17050sx A0u(Object obj, int i) {
        return AbstractC09440dt.A01(new C50163MDq(obj, i));
    }

    public static C17050sx A0v(Object obj, int i) {
        return AbstractC09440dt.A01(new C37015GSu(obj, i));
    }

    public static void A16(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, boolean z) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0B(bundle, fragment);
        c140966Yy.A0D = z;
        c140966Yy.A04();
    }

    public static void A17(View.OnClickListener onClickListener, C3LO c3lo, InterfaceC56362iU interfaceC56362iU) {
        c3lo.A0G = onClickListener;
        c3lo.A05 = 2131956237;
        interfaceC56362iU.Ehd(new C3LY(c3lo));
    }

    public static void A18(View view) {
        if (view != null) {
            view.setEnabled(true);
        }
    }

    public static void A1F(C07X c07x, C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c2gt.A06(c07x, new C9LO(i, interfaceC16660sJ));
    }

    public static void A1G(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "format");
        interfaceC02590Ai.A8R(EnumC33497ErW.CONFIRMED, "action");
    }

    public static void A1H(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "format");
        interfaceC02590Ai.A8R(EnumC33497ErW.DISMISSED, "action");
    }

    public static void A1I(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("origin", str);
        interfaceC02590Ai.Cht();
    }

    public static void A1N(C16L c16l, AbstractCollection abstractCollection) {
        C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
        if (A0C != null) {
            abstractCollection.add(A0C);
        }
    }

    public static void A1P(ImmutableList.Builder builder, ConversionStep conversionStep) {
        builder.add((Object) new BusinessConversionStep(EnumC33376Ep9.A03, conversionStep));
    }

    public static void A1S(AnonymousClass306 anonymousClass306) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
    }

    public static int A00(Fragment fragment) {
        return fragment.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_AUDIENCE_TYPE");
    }

    public static int A01(Fragment fragment) {
        return AbstractC53242c7.A09(fragment.getContext());
    }

    public static Resources A02(Fragment fragment, Object obj) {
        C14360o3.A07(obj);
        return fragment.requireContext().getResources();
    }

    public static Parcelable A04(Fragment fragment) {
        return fragment.requireArguments().getParcelable("RegFlowExtras.EXTRA_KEY");
    }

    public static ViewGroup A05(View view) {
        return (ViewGroup) view.findViewById(R.id.content_container);
    }

    public static TextView A06(View view) {
        return (TextView) view.requireViewById(R.id.title);
    }

    public static Fragment A07(String str) {
        Object newInstance = Class.forName(str).newInstance();
        C14360o3.A0C(newInstance, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return (Fragment) newInstance;
    }

    public static RecyclerView A08(View view) {
        return (RecyclerView) view.findViewById(R.id.recycler_view);
    }

    public static C140966Yy A0E(SupportLinksFragment supportLinksFragment) {
        return new C140966Yy(supportLinksFragment.requireActivity(), supportLinksFragment.A02);
    }

    public static C140966Yy A0F(C6FQ c6fq) {
        return new C140966Yy(C6BQ.A04(c6fq), C6BQ.A0B(c6fq));
    }

    public static C72743Nv A0G(AbstractC12990ll abstractC12990ll, String str, Map map) {
        return W6d.A02(new IgBloksScreenConfig(abstractC12990ll), C66277U6x.A01(str, map));
    }

    public static C42221xC A0I(C42221xC c42221xC, String str) {
        return c42221xC.A0O(AbstractC137146It.A00(str)).A0G();
    }

    public static C5Fn A0J(UserSession userSession, C4HF c4hf) {
        return AbstractC142856cl.A00(c4hf.A00(userSession).A02());
    }

    public static C61972ry A0K(Context context, C07X c07x) {
        return new C61972ry(context, AbstractC018607g.A00(c07x), null);
    }

    public static C07270a1 A0L(Fragment fragment) {
        return C023409i.A0A.A02(fragment.requireArguments());
    }

    public static UserSession A0M(InterfaceC09390do interfaceC09390do) {
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, 0);
        return userSession;
    }

    public static C2DS A0O(InterfaceC09390do interfaceC09390do) {
        return C2JD.A00((UserSession) interfaceC09390do.getValue());
    }

    public static C193328hC A0P(Fragment fragment) {
        return new C193328hC((Activity) fragment.getActivity());
    }

    public static DirectThreadKey A0Q(Iterator it) {
        return JRE.A01((C3o9) it.next());
    }

    public static NotificationBar A0S(View view) {
        return (NotificationBar) view.findViewById(R.id.notification_bar);
    }

    public static C6WQ A0T(Fragment fragment) {
        return new C6WQ(fragment.requireContext());
    }

    public static ProgressButton A0U(View view) {
        return (ProgressButton) view.requireViewById(R.id.next_button);
    }

    public static SpinnerImageView A0V(View view) {
        return (SpinnerImageView) view.requireViewById(R.id.loading_spinner);
    }

    public static String A0a(BaseBundle baseBundle) {
        String string = baseBundle.getString(AbstractC31182DnR.A03(), "");
        C14360o3.A07(string);
        return string;
    }

    public static String A0b(Fragment fragment) {
        return fragment.requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static String A0c(Fragment fragment) {
        String A00 = C16030qx.A00(fragment.requireContext());
        C14360o3.A07(A00);
        return A00;
    }

    public static String A0d(InterfaceC02590Ai interfaceC02590Ai, SavedCollection savedCollection, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("collection_id", savedCollection.A0F);
        return savedCollection.A02();
    }

    public static String A0e(C25531Mh c25531Mh, C142846ck c142846ck, String str) {
        c25531Mh.A0o(str);
        c25531Mh.A0p("chat_setup");
        c25531Mh.A0n("broadcast");
        return c142846ck.A01;
    }

    public static String A0h(AbstractC115105If abstractC115105If) {
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            return A01.getMessage();
        }
        return null;
    }

    public static String A0j(Number number) {
        if (number.intValue() != 0) {
            return "invited";
        }
        return "accepted";
    }

    public static ArrayList A0n(Map map) {
        return new ArrayList(map.values());
    }

    public static Iterator A0q(Iterable iterable, List list) {
        return AbstractC001800i.A0d(iterable, list.size()).iterator();
    }

    public static void A0x(Activity activity) {
        Window window = activity.getWindow();
        window.getClass();
        window.setSoftInputMode(16);
    }

    public static void A0z(Context context, Intent intent, Uri.Builder builder) {
        intent.setData(builder.build());
        C12260kU.A0C(context, intent);
    }

    public static void A10(Context context, ImageView imageView) {
        C35251Fgk.A01(imageView, AbstractC53242c7.A0H(context, R.attr.glyphColorPrimary));
    }

    public static void A11(Context context, IgBloksScreenConfig igBloksScreenConfig, String str, Map map, Map map2) {
        C66277U6x A02 = C66277U6x.A02(str, map, map2);
        A02.A00 = 719983200;
        A02.A06(context, igBloksScreenConfig);
    }

    public static void A12(Context context, IgdsListCell igdsListCell, int i) {
        String string = context.getString(i);
        C14360o3.A07(string);
        igdsListCell.A0H(string);
    }

    public static void A13(Resources resources, TextView textView, int i) {
        textView.setText(Html.fromHtml(resources.getString(i)));
    }

    public static void A14(Resources resources, TextView textView, String str, int i) {
        textView.setText(AbstractC07900bA.A01(resources, new String[]{str}, i));
    }

    public static void A15(android.net.Uri uri, String str, AbstractMap abstractMap) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            abstractMap.put(str, queryParameter);
        }
    }

    public static void A19(View view, View view2, View view3, int i, int i2) {
        view.setVisibility(i);
        view2.setVisibility(i2);
        view3.setVisibility(i2);
    }

    public static void A1A(Fragment fragment) {
        fragment.getActivity().getWindow().setSoftInputMode(16);
    }

    public static void A1B(Fragment fragment) {
        fragment.requireActivity().getWindow().setSoftInputMode(16);
    }

    public static void A1D(Fragment fragment, IgdsListCell igdsListCell, int i) {
        String string = fragment.getString(i);
        C14360o3.A07(string);
        igdsListCell.A0I(string);
    }

    public static void A1E(Fragment fragment, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            C9GR.A09(fragment.getContext(), charSequence);
        }
    }

    public static void A1J(InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A7v("is_interop", Boolean.valueOf(z));
    }

    public static void A1M(C25531Mh c25531Mh, String str, String str2, long j) {
        c25531Mh.A0g(Long.valueOf(j));
        c25531Mh.A0k(str);
        c25531Mh.A0j(str2);
    }

    public static void A1O(C16L c16l, AbstractCollection abstractCollection) {
        C910143t parseFromJson = AbstractC910043s.parseFromJson(c16l);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1R(AbstractC23721Ec abstractC23721Ec, String str, String str2, String str3, String str4) {
        abstractC23721Ec.A9s(str, str2);
        abstractC23721Ec.A9s(AbstractC31182DnR.A00(), str3);
        abstractC23721Ec.A9s("guid", str4);
    }

    public static void A1U(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((InterfaceC101384gv) it.next()).F2p());
    }

    public static boolean A1W(C16L c16l, Object obj) {
        c16l.A1J();
        return ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(obj);
    }

    public static boolean A1Y(Object obj, Object obj2, AbstractMap abstractMap, BitSet bitSet) {
        abstractMap.put(obj, obj2);
        bitSet.set(0);
        return false;
    }

    public static boolean A1Z(String str, String str2, Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return str2.equals(lowerCase);
    }

    public static boolean A1a(InterfaceC09390do interfaceC09390do) {
        return ((C148236lt) interfaceC09390do.getValue()).A06();
    }

    public static boolean A1b(InterfaceC09390do interfaceC09390do) {
        return ((C148236lt) interfaceC09390do.getValue()).A07();
    }

    public static String A0f(C06090Tz c06090Tz) {
        return C1AD.A04(c06090Tz, 18867177151529347L);
    }
}
