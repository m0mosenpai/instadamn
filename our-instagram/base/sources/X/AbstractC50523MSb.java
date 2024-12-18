package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.InputFilter;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.msys.mcf.MsysError;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.wearable.mediastream.layouts.StatusIndicator;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.model.reels.Reel;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.MSb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50523MSb {
    public static int A00(Context context) {
        C14360o3.A0B(context, 0);
        return context.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
    }

    public static MsysError A0D() {
        return new MsysError(MsysError.initNativeHolder("FileManagerInitializationError", 0, null));
    }

    public static BHS A0E() {
        return new BHS(new Object[0], 2131974293);
    }

    public static InfoItem A0L(Integer num, String str, int i) {
        return new InfoItem(new IconConfig.SimpleIconConfig(i), num, str, null);
    }

    public static C194848jk A0N(String str) {
        return new C194848jk(new C26069Bfx(null, null, str, null, 7));
    }

    public static Integer A0Q(Enum r2) {
        if (r2.ordinal() != 1) {
            return null;
        }
        return 7;
    }

    public static Object A0R(String str, Class cls) {
        return cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    public static ReentrantReadWriteLock.ReadLock A0b(Object obj) {
        C14360o3.A0B(obj, 0);
        ReentrantReadWriteLock.ReadLock readLock = AbstractC54958OSi.A02.readLock();
        C14360o3.A07(readLock);
        readLock.lock();
        return readLock;
    }

    public static C09530e4 A0c(Object obj, float f) {
        return new C09530e4(obj, Double.valueOf(f));
    }

    public static C09540e5 A0d(Throwable th) {
        C14360o3.A0B(th, 0);
        return new C09540e5(th);
    }

    public static void A0g() {
        C14360o3.A0B(null, 0);
    }

    public static void A0k(Parcel parcel, LeadGenTrustSignal leadGenTrustSignal, int i) {
        if (leadGenTrustSignal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leadGenTrustSignal.writeToParcel(parcel, i);
        }
    }

    public static void A0l(Parcel parcel, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, int i) {
        if (directMessageInteropReachabilityOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            directMessageInteropReachabilityOptions.writeToParcel(parcel, i);
        }
    }

    public static void A0x(InterfaceC02590Ai interfaceC02590Ai, Boolean bool) {
        interfaceC02590Ai.A7v("is_organic_product_tagging", bool);
        interfaceC02590Ai.AAP("prior_submodule", null);
        interfaceC02590Ai.Cht();
    }

    public static void A1D(StatusIndicator statusIndicator) {
        ImageView imageView = statusIndicator.A0K;
        imageView.setColorFilter(statusIndicator.A01, PorterDuff.Mode.SRC_IN);
        imageView.setVisibility(0);
    }

    public static void A1L(User user, Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new C70792Wh5(user, num, null, false, false));
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) it.next();
        igdsBulletCell.setMovementMethod(null, LinkMovementMethod.getInstance());
        abstractCollection.add(igdsBulletCell);
    }

    public static boolean A1Y(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return true;
        }
        return false;
    }

    public static long A05(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0L;
    }

    public static AccessibilityManager A09(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return (AccessibilityManager) systemService;
    }

    public static InterfaceC52932ba A0A(Object obj) {
        return ((Fragment) obj).requireActivity().getDefaultViewModelProviderFactory();
    }

    public static C186278Nv A0B(Class cls, InterfaceC16660sJ interfaceC16660sJ) {
        return C186268Nu.A00(new C186258Nt(interfaceC16660sJ, new C0YZ(cls)));
    }

    public static C55087Oak A0H(C8HB c8hb) {
        return (C55087Oak) c8hb.A0E.getValue();
    }

    public static C57671PiM A0I() {
        C57671PiM c57671PiM = C57671PiM.A00;
        C14360o3.A0B(c57671PiM, 1);
        return c57671PiM;
    }

    public static MediaTaggingInfo A0J(TaggingActivity taggingActivity, AbstractList abstractList) {
        return (MediaTaggingInfo) abstractList.get(taggingActivity.A00);
    }

    public static MediaTaggingInfo A0K(TaggingActivity taggingActivity, AbstractList abstractList) {
        Object obj = abstractList.get(taggingActivity.A00);
        C14360o3.A07(obj);
        return (MediaTaggingInfo) obj;
    }

    public static C51046Mgy A0O(C52170N6z c52170N6z) {
        return (C51046Mgy) c52170N6z.A04.getValue();
    }

    public static Exception A0P(Object obj) {
        if (obj instanceof C194848jk) {
            return new AnonymousClass470("IGTVSeriesRepository network request failed");
        }
        return new RuntimeException();
    }

    public static String A0S(C152406tQ c152406tQ) {
        String str = (String) c152406tQ.A00(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (str == null) {
            return C2Fb.A49.toString();
        }
        return str;
    }

    public static String A0V(LeadGenBaseFormList leadGenBaseFormList) {
        LeadForm leadForm = leadGenBaseFormList.A01;
        if (leadForm != null) {
            return leadForm.A03;
        }
        return null;
    }

    public static ArrayList A0Z(Collection collection) {
        if (collection != null) {
            return new ArrayList(collection);
        }
        return new ArrayList();
    }

    public static C19K A0e() {
        C12T c12t = C12P.A00;
        return AnonymousClass194.A02(AnonymousClass131.A00);
    }

    public static void A0f() {
        C2UY.A01.A05(5L);
    }

    public static void A0i(BaseBundle baseBundle, N7F n7f) {
        n7f.A07 = baseBundle.getString("args_media_id", "");
        n7f.A08 = baseBundle.getString("args_waterfall_id", "");
    }

    public static void A0n(TextView textView, int i) {
        textView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public static void A0t(InterfaceC02530Ab interfaceC02530Ab, C25531Mh c25531Mh) {
        c25531Mh.A0M(interfaceC02530Ab, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        c25531Mh.A0T();
        c25531Mh.A0M(MYO.OTHER, "media_source");
    }

    public static void A0u(InterfaceC02580Ag interfaceC02580Ag, InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP("interaction_type", str);
        interfaceC02590Ai.AAP("commerce_integrity_review_decision", str2);
        interfaceC02590Ai.AAK(interfaceC02580Ag, "merchant_id");
        interfaceC02590Ai.Cht();
    }

    public static void A0y(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.A8R(AnonymousClass249.VIDEO, "media_type");
        interfaceC02590Ai.AAP("module", str);
        interfaceC02590Ai.A8R(EnumC50631MWs.A0L, "surface");
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("version", str);
        interfaceC02590Ai.Cht();
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP("media_id", str);
        interfaceC02590Ai.AAP("media_type", str2);
    }

    public static void A13(AbstractC02600Aj abstractC02600Aj, UserSession userSession, String str) {
        abstractC02600Aj.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        abstractC02600Aj.A0O("is_employee", Boolean.valueOf(C1C0.A00(userSession)));
    }

    public static void A14(AbstractC02600Aj abstractC02600Aj, String str) {
        abstractC02600Aj.A0R("camera_session_id", str);
        C16930sl c16930sl = C16930sl.A00;
        abstractC02600Aj.A0S("camera_tools", c16930sl);
        abstractC02600Aj.A0S("camera_tools_struct", c16930sl);
    }

    public static void A15(AbstractC02600Aj abstractC02600Aj, String str, String str2) {
        abstractC02600Aj.A0R("reason", str);
        abstractC02600Aj.A0R("reason_info", str2);
    }

    public static void A1E(InterfaceC56362iU interfaceC56362iU) {
        C3LO c3lo = new C3LO();
        c3lo.A00();
        interfaceC56362iU.Ehd(new C3LY(c3lo));
    }

    public static void A1F(LimitedInteractionsVersions limitedInteractionsVersions, AbstractMap abstractMap) {
        Integer num;
        String str;
        if (limitedInteractionsVersions == LimitedInteractionsVersions.A05) {
            num = C05F.A00;
        } else if (limitedInteractionsVersions == LimitedInteractionsVersions.A07) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        switch (num.intValue()) {
            case 0:
                str = "v1";
                break;
            case 1:
                str = "v2_not_customizable";
                break;
            default:
                str = "v2_customizable";
                break;
        }
        abstractMap.put("version", str);
    }

    public static void A1H(FilterGroupModel filterGroupModel) {
        filterGroupModel.EUV(19, true);
    }

    public static void A1I(C65957Tx9 c65957Tx9, Object obj) {
        c65957Tx9.A04(C05F.A0C, obj, new Object());
    }

    public static void A1K(AbstractC125325le abstractC125325le) {
        abstractC125325le.A0P(1.0f, -1.0f);
        abstractC125325le.A0Q(1.0f, -1.0f);
        abstractC125325le.A0I(1.0f);
    }

    public static void A1S(AbstractMap abstractMap) {
        String str = C1QM.A00.A02.A00;
        if (str != null) {
            abstractMap.put("nav_chain", str);
        }
    }

    public static boolean A1a(AbstractC12990ll abstractC12990ll) {
        return C18U.A06(C06090Tz.A05, abstractC12990ll, 36316104562380787L);
    }

    public static boolean A1b(Object obj, Object obj2) {
        return C14360o3.A0K(((InterfaceC38901rP) obj).getPk(), obj2);
    }

    public static int A01(Fragment fragment) {
        return fragment.getParentFragmentManager().A0L();
    }

    public static int A02(String str) {
        return (527 + str.hashCode()) * 31;
    }

    public static int A03(ReentrantReadWriteLock reentrantReadWriteLock) {
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            return reentrantReadWriteLock.getReadHoldCount();
        }
        return 0;
    }

    public static int A04(InterfaceC09390do interfaceC09390do) {
        return ((IGRevShareProductType) interfaceC09390do.getValue()).ordinal();
    }

    public static long A06(C0UO c0uo) {
        return ((Number) c0uo.getValue()).longValue();
    }

    public static View A07(View view, int i) {
        return C3PW.A00(view, i).A00();
    }

    public static View A08(AppCompatActivity appCompatActivity, String str, int i) {
        View findViewById = appCompatActivity.findViewById(i);
        C14360o3.A0C(findViewById, str);
        return findViewById;
    }

    public static MVN A0C(C05A c05a) {
        return (MVN) c05a.getValue();
    }

    public static C51654Mrl A0F(C05A c05a, int i) {
        return (C51654Mrl) AbstractC001800i.A0O((List) c05a.getValue(), i);
    }

    public static Reel A0G(String str, InterfaceC09390do interfaceC09390do) {
        return C1OU.A04((UserSession) interfaceC09390do.getValue()).A0M(str);
    }

    public static C54805OJz A0M(C190308bo c190308bo, C52154N6e c52154N6e) {
        return c190308bo.A00(c52154N6e.requireContext(), C52154N6e.A00(c52154N6e)).A01();
    }

    public static String A0T(InterfaceC02590Ai interfaceC02590Ai, UserSession userSession, String str) {
        interfaceC02590Ai.AAP(AbstractC65709Tsi.A00(), str);
        return userSession.userId;
    }

    public static String A0U(C44428Jkf c44428Jkf) {
        c44428Jkf.getClass();
        InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        return interfaceC50490MQs.getName();
    }

    public static String A0W(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public static String A0X(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public static StringBuilder A0Y(Object obj, StringBuilder sb, StringBuilder sb2) {
        sb.append(obj);
        sb2.append(sb.toString());
        return new StringBuilder();
    }

    public static List A0a(double d) {
        List singletonList = Collections.singletonList(Double.valueOf(d));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static void A0h(Context context, IgdsMediaButton igdsMediaButton, int i, int i2) {
        igdsMediaButton.setLabel(context.getString(i2, String.valueOf(i)));
    }

    public static void A0j(Handler handler, Runnable runnable) {
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 10000L);
    }

    public static void A0m(View view, int i) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            viewStub.inflate();
        }
    }

    public static void A0o(TextView textView, String str, String str2) {
        textView.setText(AnonymousClass001.A0R(str, str2));
    }

    public static void A0p(C69797Vvh c69797Vvh) {
        C0fJ.A00(c69797Vvh.A00());
    }

    public static void A0q(Fragment fragment) {
        C9GR.A0B(fragment.requireContext(), "something_went_wrong");
    }

    public static void A0r(Fragment fragment, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new GridLayoutManager(fragment.requireContext(), 3));
    }

    public static void A0s(C2GT c2gt) {
        c2gt.A0A(c2gt.A02());
    }

    public static void A0v(InterfaceC02590Ai interfaceC02590Ai, long j, long j2) {
        interfaceC02590Ai.A9K("medium_confidence_suggestions_count", Long.valueOf(j));
        interfaceC02590Ai.A9K("low_confidence_suggestions_count", Long.valueOf(j2));
    }

    public static void A0w(InterfaceC02590Ai interfaceC02590Ai, FollowStatus followStatus, int i) {
        interfaceC02590Ai.AAP("suggested_live_follow_status", AbstractC38851rI.A06(followStatus));
        interfaceC02590Ai.A9K("suggested_live_count", Long.valueOf(i));
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, long j) {
        interfaceC02590Ai.A9K("question_id", Long.valueOf(j));
        interfaceC02590Ai.AAP("question_source", str);
        interfaceC02590Ai.AAP("question_text", str2);
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, Map map) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A9M("extra_values", map);
        interfaceC02590Ai.Cht();
    }

    public static void A16(C0Zx c0Zx, long j) {
        c0Zx.A05("end_time_ms", Long.valueOf(j));
    }

    public static void A17(C0Zx c0Zx, long j) {
        c0Zx.A05("start_time_ms", Long.valueOf(j));
    }

    public static void A18(C0Zx c0Zx, long j) {
        c0Zx.A05("impression_count", Long.valueOf(j));
    }

    public static void A19(C0Zx c0Zx, String str, String str2, String str3) {
        c0Zx.A06(str, str2);
        c0Zx.A06("suppress_reason", str3);
    }

    public static void A1A(C25531Mh c25531Mh, EnumC114925Hg enumC114925Hg) {
        c25531Mh.A0a(enumC114925Hg);
        c25531Mh.A0V(3);
    }

    public static void A1B(C25531Mh c25531Mh, String str, String str2) {
        c25531Mh.A0p(str);
        c25531Mh.A0n("broadcast");
        c25531Mh.A0r(str2);
    }

    public static void A1C(UserFlowLogger userFlowLogger, String str, String str2, long j) {
        userFlowLogger.flowMarkPoint(j, AnonymousClass001.A0R(str, str2));
    }

    public static void A1G(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        C52199N8o c52199N8o = directPrivateStoryRecipientController.A0H;
        if (c52199N8o != null) {
            c52199N8o.A06();
        }
    }

    public static void A1J(C65954Twz c65954Twz, int i) {
        c65954Twz.A04 = Integer.valueOf(i);
    }

    public static void A1M(Object obj, InterfaceC09390do interfaceC09390do) {
        ((List) interfaceC09390do.getValue()).add(obj);
    }

    public static void A1N(String str, String str2, StringBuilder sb) {
        sb.append(AnonymousClass001.A0R(str, str2));
    }

    public static void A1O(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((LeadGenFormBaseQuestion) next).A03 != VEF.A06) {
            abstractCollection.add(next);
        }
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((LeadGenFormBaseQuestion) next).A03 == VEF.A06) {
            abstractCollection.add(next);
        }
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((android.net.Uri) it.next()).getPath());
    }

    public static void A1T(Iterator it, JSONObject jSONObject) {
        Map.Entry entry = (Map.Entry) it.next();
        jSONObject.put((String) entry.getKey(), entry.getValue());
    }

    public static void A1U(C05A c05a) {
        c05a.Egh(Boolean.valueOf(!((Boolean) c05a.getValue()).booleanValue()));
    }

    public static void A1V(JSONArray jSONArray, long j) {
        jSONArray.getJSONObject(jSONArray.length() - 1).put("end_time_ms", j);
    }

    public static boolean A1W(Context context, Object obj, int i) {
        return C14360o3.A0K(obj, context.getString(i));
    }

    public static boolean A1X(Resources resources, CharSequence charSequence, int i) {
        String string = resources.getString(i);
        C14360o3.A07(string);
        return string.contentEquals(charSequence);
    }

    public static boolean A1Z(C152406tQ c152406tQ, String str) {
        Boolean bool = (Boolean) c152406tQ.A00(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
