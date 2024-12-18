package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DnN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31179DnN {
    public static int A02(C1UM c1um, String str, String str2) {
        C14360o3.A0B(str, 0);
        String A00 = C0JT.A00(str);
        C14360o3.A07(A00);
        String substring = A00.substring(A00.length() - 15);
        C14360o3.A07(substring);
        int parseLong = (int) (Long.parseLong(substring, 16) % 10000);
        C1ZT AR9 = c1um.AR9();
        AR9.A07(AK1.A01(str2), parseLong);
        AR9.A0B();
        return parseLong;
    }

    public static Bundle A05(String str, String str2, ArrayList arrayList, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", str);
        bundle.putStringArrayList("ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", arrayList);
        bundle.putString("ContextualFeedFragment.ARGUMENT_FEED_TITLE", str2);
        bundle.putString("ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE", null);
        bundle.putBoolean("ContextualFeedFragment.ARGUMENT_IS_NAVIGATION_FROM_FULL_AUDIENCE_MEDIA_GRID", z);
        return bundle;
    }

    public static C25621Ms A0C(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A05();
        return c25621Ms;
    }

    public static C25621Ms A0D(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A06();
        return c25621Ms;
    }

    public static C33023EhR A0F(TreeJNI treeJNI, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C1DU A00 = C1DS.A00(userSession);
        C33023EhR c33023EhR = (C33023EhR) treeJNI.reinterpret(C33023EhR.class);
        c33023EhR.A0q(new C1DY((C1DV) A00, (java.util.Set) new HashSet(), false));
        return c33023EhR;
    }

    public static C66277U6x A0H(String str, Map map, Map map2) {
        C66277U6x A02 = C66277U6x.A02(str, AbstractC191768eY.A01(map), map2);
        A02.A00 = 719983200;
        A02.A05 = null;
        A02.A01 = 0L;
        A02.A06 = null;
        return A02;
    }

    public static void A0i(Context context, TypedArray typedArray, TextView textView, int i) {
        int resourceId = typedArray.getResourceId(2, i);
        if (resourceId != 0) {
            textView.setImeActionLabel(context.getText(resourceId), textView.getImeActionId());
        }
    }

    public static void A0l(Rect rect, TextView textView) {
        textView.getLineBounds(0, rect);
        textView.setMaxLines(C1H4.A00(Math.max(textView.getHeight(), 0) / Math.max(rect.bottom - rect.top, 1)));
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static void A0p(Parcel parcel, Boolean bool) {
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void A0q(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(number.longValue());
        }
    }

    public static void A0r(View view) {
        C14360o3.A0B(view, 0);
        Context context = view.getContext();
        C14360o3.A0A(context);
        view.setBackground(C3LQ.A07(context, AbstractC53242c7.A0C(context)));
    }

    public static void A12(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, double d, double d2) {
        interfaceC02590Ai.A8I("elapsed_time", Double.valueOf(d - d2));
        interfaceC02590Ai.A8I(TraceFieldType.StartTime, Double.valueOf(d2));
    }

    public static void A1F(C16L c16l, AbstractMap abstractMap) {
        String str = null;
        String A1P = c16l.A1P();
        c16l.A1J();
        if (c16l.A11() == C16R.A0G || (str = c16l.A1P()) != null) {
            abstractMap.put(A1P, str);
        }
    }

    public static void A1L(C140966Yy c140966Yy, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        c140966Yy.A0E(MUK.A00(userSession, str, true, false, false, false, false));
        c140966Yy.A04();
    }

    public static void A1V(Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 27);
        C14360o3.A0B(obj3, 28);
        C14360o3.A0B(obj4, 29);
    }

    public static int A00(Context context, Fragment fragment, int i) {
        if (i != 0) {
            return AbstractC53242c7.A0H(context, R.attr.igds_color_link);
        }
        return AbstractC53242c7.A0C(fragment.requireContext());
    }

    public static Bundle A04(Object obj) {
        return ((Fragment) obj).requireArguments();
    }

    public static TextView A06(Context context, E40 e40) {
        ScaleDrawable scaleDrawable = new ScaleDrawable(context.getDrawable(R.drawable.chevron_right), 16, 1.0f, 1.0f);
        scaleDrawable.setLevel(6000);
        TextView textView = e40.A0A;
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(textView, 0);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, scaleDrawable, (Drawable) null);
        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.direct_drawable_padding_size));
        return textView;
    }

    public static InterfaceC02590Ai A08(C18920wW c18920wW, User user, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("target_id", user.getId());
        A00.AAP("radio_type", null);
        A00.AAP("reason", null);
        A00.AAP("group_name", null);
        return A00;
    }

    public static InterfaceC02590Ai A09(AbstractC12990ll abstractC12990ll) {
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB("igd_locked_chat"), abstractC12990ll);
        return A01.A00(A01.A00, "igd_locked_chat_events");
    }

    public static C25531Mh A0A(InterfaceC02550Ad interfaceC02550Ad, String str) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "yp_ig_family_center_setup_client_event"), 417);
        c25531Mh.A0R("current_module", "ig_supervision_upsell_helpers");
        c25531Mh.A0R("event_name", str);
        c25531Mh.A0R("fc_session_id", "");
        return c25531Mh;
    }

    public static C140966Yy A0G(Object obj) {
        C35791FrT c35791FrT = (C35791FrT) obj;
        String str = C35791FrT.A09;
        C140966Yy c140966Yy = new C140966Yy(c35791FrT.A01.requireActivity(), c35791FrT.A02);
        c140966Yy.A0F = true;
        return c140966Yy;
    }

    public static C6FX A0I(Object obj) {
        C6FX c6fx = new C6FX();
        c6fx.A01(obj);
        return c6fx;
    }

    public static C36288Fzi A0N(C7FQ c7fq) {
        return (C36288Fzi) c7fq.A02.getValue();
    }

    public static C36293Fzn A0O(C7FQ c7fq) {
        return (C36293Fzn) c7fq.A04.getValue();
    }

    public static User A0T(C1DY c1dy, C17T c17t) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) c17t.A07(ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            return AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
        }
        return null;
    }

    public static IllegalStateException A0V() {
        return new IllegalStateException("Not yet implemented");
    }

    public static IllegalStateException A0W(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected model type ");
        sb.append(obj.getClass());
        return new IllegalStateException(sb.toString());
    }

    public static Integer A0Y(DirectThreadKey directThreadKey) {
        List list = directThreadKey.A02;
        if (list != null) {
            return Integer.valueOf(list.size());
        }
        return null;
    }

    public static Object A0b(AbstractC12990ll abstractC12990ll, C52342aZ c52342aZ) {
        return c52342aZ.A02(abstractC12990ll, C05F.A00, C16030qx.A02.A04(abstractC12990ll.getDeviceSession().A06()));
    }

    public static HashMap A0e() {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        return hashMap;
    }

    public static HashMap A0f(AbstractC911344p abstractC911344p, C913045j c913045j) {
        C54s c54s = new C54s(c913045j);
        c54s.A0C(abstractC911344p, "server_params");
        HashMap hashMap = new HashMap();
        hashMap.put("params", c54s.toString());
        return hashMap;
    }

    public static HashMap A0g(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, obj);
        hashMap.put("is_pending", String.valueOf(z));
        return hashMap;
    }

    public static C008002u A0h() {
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return C10E.A00(c16920sk);
    }

    public static void A0k(Intent intent, Bundle bundle, Bundle bundle2, String str, String str2) {
        bundle.putString("ChallengeFragment.challengeType", str);
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", str2);
        bundle.putBundle("ChallengeFragment.arguments", bundle2);
        intent.putExtras(bundle);
    }

    public static void A0n(BaseBundle baseBundle, DirectShareSheetFragment directShareSheetFragment, boolean z) {
        baseBundle.putBoolean("DirectShareSheetConstants.is_forwarding_restricted_content_type", z);
        baseBundle.putInt("DirectShareSheetConstants.forwarding_messages_limit", directShareSheetFragment.A02);
        baseBundle.putInt("DirectShareSheetConstants.forwarding_messages_count", directShareSheetFragment.A01);
        baseBundle.putInt("DirectShareSheetConstants.message_request_count", directShareSheetFragment.A06);
        baseBundle.putInt("DirectShareSheetConstants.message_request_limit", directShareSheetFragment.A07);
    }

    public static void A0s(TextView textView) {
        textView.setTransformationMethod(new PasswordTransformationMethod());
    }

    public static void A0w(Fragment fragment) {
        if (fragment != null) {
            AbstractC10360h2 childFragmentManager = fragment.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            if (C06P.A01(childFragmentManager) && childFragmentManager.A0L() > 0) {
                C06J A0S = childFragmentManager.A0S(0);
                C14360o3.A07(A0S);
                childFragmentManager.A0c(((C14240no) A0S).A00);
            }
        }
    }

    public static void A0z(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        C14240no c14240no = new C14240no(abstractC10360h2);
        c14240no.A0A(fragment, R.id.layout_container_main);
        c14240no.A0I("reg_gdpr_entrance");
        c14240no.A00();
    }

    public static void A13(InterfaceC02530Ab interfaceC02530Ab, AbstractC02600Aj abstractC02600Aj, String str, String str2) {
        abstractC02600Aj.A0M(interfaceC02530Ab, CacheBehaviorLogger.SOURCE);
        abstractC02600Aj.A0M(EnumC33458Eqt.A02, "prompt_type");
        abstractC02600Aj.A0R("prompt_id", str);
        abstractC02600Aj.A0R("open_thread_id", str2);
        abstractC02600Aj.Cht();
    }

    public static void A14(InterfaceC02550Ad interfaceC02550Ad, String str, String str2) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "igwb_problematic_use_events"), 282);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0R("event_type", "click");
            c25531Mh.A0R("screen", str);
            c25531Mh.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
            c25531Mh.Cht();
        }
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("event_name", str);
        interfaceC02590Ai.A8R(EnumC46297KeT.IN_THREAD, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        interfaceC02590Ai.A8R(EnumC46278KeA.RECEIVER, "user_role");
    }

    public static void A1B(C0Zx c0Zx, String str, String str2, String str3, String str4) {
        c0Zx.A06("event", str);
        c0Zx.A06("event_flow", str2);
        c0Zx.A06("event_step", str3);
        c0Zx.A06("event_category", str4);
    }

    public static void A1C(C25531Mh c25531Mh, C38321qM c38321qM, String str, List list) {
        c25531Mh.A0R("legacy_event_name", str);
        c25531Mh.A0l(c38321qM.getId());
        c25531Mh.A0S("product_ids", list);
    }

    public static void A1G(InterfaceC56362iU interfaceC56362iU) {
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_x_pano_outline_24;
        interfaceC56362iU.Ehd(new C3LY(c3lo));
    }

    public static void A1M(C18920wW c18920wW, Long l, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.A9K("media_id", l);
            A00.AAP("entrypoint", str2);
            A00.Cht();
        }
    }

    public static void A1N(C18920wW c18920wW, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.Cht();
        }
    }

    public static void A1O(C18920wW c18920wW, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.AAP("module", "favorites_management");
            A00.AAP("management_session_id", str2);
            A00.Cht();
        }
    }

    public static void A1Q(C36881nl c36881nl, User user) {
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        C14360o3.A07(singletonList);
        c36881nl.A0B = new C122145g6(singletonList);
    }

    public static void A1R(C36881nl c36881nl, String str) {
        c36881nl.A0B = new C83693oE(str);
    }

    public static void A1T(Object obj) {
        ((BusinessConversionActivity) obj).EL3(null);
    }

    public static void A1W(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C14360o3.A0B(obj, 30);
        C14360o3.A0B(obj2, 31);
        C14360o3.A0B(obj3, 46);
        C14360o3.A0B(obj4, 47);
        C14360o3.A0B(obj5, 52);
    }

    public static boolean A1b(String str, int i) {
        if (C14360o3.A00(str.charAt(i), 32) > 0) {
            return false;
        }
        return true;
    }

    public static int A01(Fragment fragment) {
        return fragment.requireContext().getColor(AbstractC53242c7.A06(fragment.requireContext()));
    }

    public static long A03(C3o9 c3o9) {
        return JRE.A03(c3o9).A00;
    }

    public static FragmentActivity A07() {
        return C2OG.A01().A06();
    }

    public static C3LO A0B(InterfaceC56362iU interfaceC56362iU, String str) {
        interfaceC56362iU.Ehk(str);
        interfaceC56362iU.EkS(true);
        C3LO c3lo = new C3LO();
        c3lo.A00();
        return c3lo;
    }

    public static BizUserInboxState A0E(UserSession userSession) {
        return AbstractC81043jY.A00(String.valueOf(AbstractC2056298m.A00(userSession).A02()));
    }

    public static AbstractC18680vv A0J(Activity activity) {
        Bundle bundleExtra = activity.getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra != null) {
            return C023409i.A0A.A04(bundleExtra);
        }
        return null;
    }

    public static UserSession A0K(C6FQ c6fq) {
        return (UserSession) C6BQ.A0B(c6fq);
    }

    public static UserSession A0L(C6FQ c6fq) {
        AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
        C14360o3.A0C(A0A, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        return (UserSession) A0A;
    }

    public static InterfaceC56392iX A0M(View view, int i) {
        return AbstractC56372iV.A00(view.findViewById(i));
    }

    public static EnumC92794Ds A0P(DirectShareTarget directShareTarget) {
        if (directShareTarget.A0T()) {
            InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
            interfaceC83713oG.getClass();
            return AbstractC140946Yw.A00(interfaceC83713oG);
        }
        return EnumC92794Ds.A05;
    }

    public static IgdsHeadline A0Q(View view, int i) {
        return (IgdsHeadline) view.requireViewById(i);
    }

    public static EnumC1571773w A0R(UserSession userSession, User user) {
        String id = user.getId();
        return AbstractC50626MWn.A00(userSession, user.B7L(), user.A0M(), id);
    }

    public static U8R A0S(Context context, int i, int i2) {
        return new U8R(context.getString(i2, Integer.valueOf(i)), context.getColor(R.color.green_6), context.getColor(R.color.green_0), context.getColor(AbstractC53242c7.A02(context)));
    }

    public static Boolean A0U(InterfaceC83713oG interfaceC83713oG) {
        return Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG));
    }

    public static Integer A0X(BaseBundle baseBundle, String str) {
        return Integer.valueOf(baseBundle.getInt(str));
    }

    public static Long A0Z(C25531Mh c25531Mh, String str, String str2, String str3) {
        c25531Mh.A0n(str);
        c25531Mh.A0r(str2);
        if (str3 != null) {
            return AbstractC003100w.A0k(10, str3);
        }
        return null;
    }

    public static Long A0a(C25531Mh c25531Mh, String str, String str2, String str3, int i) {
        c25531Mh.A0p(str);
        c25531Mh.A0n(AbstractC147806l5.A01(Integer.valueOf(i)));
        c25531Mh.A0r(str2);
        if (str3 != null) {
            return AbstractC003100w.A0k(10, str3);
        }
        return null;
    }

    public static String A0c(AbstractC12990ll abstractC12990ll) {
        if (C0BQ.A00(abstractC12990ll).BOZ() > 0) {
            return "mas";
        }
        return null;
    }

    public static String A0d(C23031Ai c23031Ai, String str, String str2) {
        String string = c23031Ai.A01.getString(AnonymousClass001.A0R(str, str2), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static void A0j(Context context, AbstractC23721Ec abstractC23721Ec, String str, String str2) {
        abstractC23721Ec.A9s(str, str2);
        abstractC23721Ec.A9s(AbstractC31182DnR.A00(), C16030qx.A00(context));
        abstractC23721Ec.A9s("guid", C16030qx.A02.A05(context));
    }

    public static void A0m(BaseBundle baseBundle, DirectShareSheetFragment directShareSheetFragment) {
        baseBundle.putBoolean("DirectShareSheetConstants.meta_ai_agent_target_enabled", DirectShareSheetFragment.A04(directShareSheetFragment).booleanValue());
        baseBundle.putBoolean("DirectShareSheetConstants.msys_recipients_only", directShareSheetFragment.A1R);
        baseBundle.putBoolean("DirectShareSheetConstants.include_msys_threads", directShareSheetFragment.A1G);
        baseBundle.putBoolean("DirectShareSheetConstants.is_forwarding", directShareSheetFragment.A1I);
    }

    public static void A0o(BaseBundle baseBundle, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        baseBundle.putString((String) entry.getKey(), (String) entry.getValue());
    }

    public static void A0t(Fragment fragment) {
        AbstractC56402iY.A02(fragment.requireActivity(), AbstractC53242c7.A0F(fragment.requireContext(), R.attr.statusBarBackgroundColor));
    }

    public static void A0u(Fragment fragment) {
        C56352iT.A0t.A03(fragment.getActivity()).setIsLoading(false);
    }

    public static void A0v(Fragment fragment) {
        C56352iT.A0t.A03(fragment.getActivity()).setIsLoading(true);
    }

    public static void A0x(Fragment fragment) {
        C3DN A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (A00 = C3DN.A00.A00(activity)) != null) {
            A00.A0B();
        }
    }

    public static void A0y(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC09390do interfaceC09390do) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, (AbstractC12990ll) interfaceC09390do.getValue());
        c140966Yy.A0D(fragment);
        c140966Yy.A04();
    }

    public static void A10(Fragment fragment, C32314ELd c32314ELd) {
        C140966Yy c140966Yy = new C140966Yy(c32314ELd.requireActivity(), c32314ELd.A0N());
        c140966Yy.A0D(fragment);
        c140966Yy.A0A = C32314ELd.__redex_internal_original_name;
        c140966Yy.A0F = true;
        c140966Yy.A04();
    }

    public static void A11(Fragment fragment, C193328hC c193328hC, int i) {
        c193328hC.A0r(fragment.getString(i));
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("waterfall_id", C1Q9.A01());
        interfaceC02590Ai.AAP("containermodule", "waterfall_log_in");
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, double d, double d2) {
        interfaceC02590Ai.A8I("current_time", Double.valueOf(d));
        interfaceC02590Ai.A8I("elapsed_time", Double.valueOf(d - d2));
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, double d, double d2) {
        interfaceC02590Ai.A8I("current_time", Double.valueOf(d));
        interfaceC02590Ai.A8I("elapsed_time", Double.valueOf(d - d2));
        interfaceC02590Ai.A8I(TraceFieldType.StartTime, Double.valueOf(d2));
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, double d) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("waterfall_id", C1Q9.A01());
        interfaceC02590Ai.A8I(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A1D(C25531Mh c25531Mh, String str) {
        c25531Mh.A0k(str);
        c25531Mh.A0j("toggle");
    }

    public static void A1E(C25531Mh c25531Mh, String str, String str2, String str3) {
        c25531Mh.A0o(str);
        c25531Mh.A0p("story");
        c25531Mh.A0n("instagram");
        c25531Mh.A0r(str2);
        c25531Mh.A0u(str3);
        c25531Mh.Cht();
    }

    public static void A1H(AbstractC23721Ec abstractC23721Ec, UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        abstractC23721Ec.A0H("qe_universe_name", (String) A00.A1A.CES(A00, C23031Ai.A8c[379]));
    }

    public static void A1I(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
        Parcelable.Creator creator = User.CREATOR;
        C14360o3.A0A(immutablePandoUserDict);
        abstractCollection.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
    }

    public static void A1J(AbstractC59962oe abstractC59962oe, int i) {
        if (abstractC59962oe.getRootActivity() instanceof InterfaceC53712dA) {
            ComponentCallbacks2 rootActivity = abstractC59962oe.getRootActivity();
            C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) rootActivity).EfL(i);
        }
    }

    public static void A1K(AbstractC59962oe abstractC59962oe, int i) {
        if (abstractC59962oe.getRootActivity() instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) abstractC59962oe.getRootActivity()).EfL(i);
        }
    }

    public static void A1P(InterfaceC56392iX interfaceC56392iX) {
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setVisibility(8);
        }
    }

    public static void A1S(C6XJ c6xj) {
        c6xj.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
    }

    public static void A1U(Object obj, int i) {
        C0f5 A00 = C18950wb.A00(obj.getClass().getSimpleName(), i, true);
        A00.ABW("su_check_timeout_event", "Checking whether there is a cache timeout event.");
        A00.report();
    }

    public static void A1X(AbstractCollection abstractCollection, Iterator it) {
        Long A0k;
        String str = ((Product) it.next()).A0H;
        if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
            abstractCollection.add(A0k);
        }
    }

    public static boolean A1Y(Context context) {
        return AbstractC14490oL.A0J(context.getPackageManager(), AbstractC31182DnR.A05(159, 38, 93));
    }

    public static boolean A1Z(Context context, TypedArray typedArray, View view) {
        C14360o3.A07(typedArray);
        int resourceId = typedArray.getResourceId(3, 0);
        if (resourceId != 0) {
            view.setContentDescription(context.getText(resourceId));
        }
        return false;
    }

    public static boolean A1a(TextView textView) {
        return TextUtils.isEmpty(AbstractC13880nE.A0J(textView));
    }
}
