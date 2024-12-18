package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PowerManager;
import android.util.JsonWriter;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media.AudioAttributesCompat;
import com.facebook.R;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.ApiAdFormats;
import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.widget.progressbar.ClipsReviewProgressBar;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.creation.persistence.CreationDatabase;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.roomdb.IgRoomDatabase;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.MSa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50522MSa {
    public static int A04(int i, int i2, int i3, int i4) {
        return (i2 + ((i - i2) / 2)) - (i4 + ((i3 - i4) / 2));
    }

    public static int A07(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i2), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static int A0A(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC001900j.A05(str, '.', str.length() - 1);
    }

    public static int A0B(List list, int i) {
        return (int) Math.ceil((i / 100.0d) * list.size());
    }

    public static Rect A0D(Bitmap bitmap) {
        return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public static C68920VeK A0P(int i) {
        if (i != 0) {
            return new C68920VeK(new UserFlowLoggerImpl(C006802i.A0p), 791877554);
        }
        return null;
    }

    public static OpalAudienceSelectorRepository.OpalAudience A0Z(C2JS c2js, String str, String str2, boolean z) {
        return new OpalAudienceSelectorRepository.OpalAudience(str, str2, c2js.A09("full_name"), c2js.A0A("profile_pic_url"), z, c2js.getCoercedBooleanField(4, "is_verified"), false);
    }

    public static ClipInfo A0a(Medium medium) {
        ClipInfo clipInfo = new ClipInfo(null, 16777215);
        clipInfo.A0C = Integer.valueOf(medium.A07);
        int i = medium.A0B;
        int i2 = medium.A04;
        clipInfo.A09 = i;
        clipInfo.A06 = i2;
        return clipInfo;
    }

    public static ReentrantReadWriteLock.WriteLock A0r(Object obj) {
        C14360o3.A0B(obj, 0);
        ReentrantReadWriteLock.WriteLock writeLock = AbstractC54958OSi.A02.writeLock();
        C14360o3.A07(writeLock);
        writeLock.lock();
        return writeLock;
    }

    public static void A0y(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static void A0z(View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, String str) {
        C14360o3.A0B(str, 0);
        interfaceC02590Ai.A9K("ig_user_id", AbstractC003100w.A0k(10, str));
    }

    public static void A1P(C1ON c1on, int i) {
        if (i != -1) {
            c1on.A01 = new C151086rB(i);
            C19P.A01.add(new C151106rD(i));
        }
    }

    public static void A1Q(C8RI c8ri, C8RH c8rh, int i) {
        c8ri.A06(i);
        c8rh.A04 = c8ri;
        if (c8rh.getWidth() > 0 && c8rh.getHeight() > 0) {
            C8RI c8ri2 = c8rh.A04;
            C14360o3.A0A(c8ri2);
            c8ri2.setBounds(0, 0, c8rh.getWidth(), c8rh.getHeight());
        }
    }

    public static void A1R(C8Z9 c8z9, C50724MaP c50724MaP) {
        C8Z9 c8z92;
        if (c8z9 != null && c8z9.A05() && (c8z92 = c50724MaP.A0H) != null) {
            c8z92.A04(false);
        }
    }

    public static void A1U(C55909Os0 c55909Os0) {
        Activity activity = c55909Os0.A04;
        if (activity instanceof FragmentActivity) {
            F0J.A00().A02((FragmentActivity) activity, c55909Os0.A0B, c55909Os0.A09.getModuleName(), null, false);
        }
    }

    public static Object[] A1b(Object[] objArr) {
        return AbstractC001800i.A0a(AbstractC16960so.A1Q(objArr)).toArray(new InterfaceC19390xP[0]);
    }

    public static float A01(ClipsReviewProgressBar clipsReviewProgressBar, int i) {
        int i2 = clipsReviewProgressBar.A00;
        return clipsReviewProgressBar.getWidth() * AbstractC13600mm.A00(i / i2, 0.0f, 1.0f);
    }

    public static int A05(int i, int i2, int i3, int i4) {
        if (Math.abs(i - i2) < Math.abs(i - i3)) {
            return i4;
        }
        return i3;
    }

    public static int A09(Iterable iterable) {
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(iterable, 10));
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static long A0C(String str) {
        Long A0k;
        if (str == null || (A0k = AbstractC003100w.A0k(10, str)) == null) {
            return 0L;
        }
        return A0k.longValue();
    }

    public static AudioManager A0E(Context context) {
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public static Bundle A0F(Parcelable parcelable, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("ARGUMENT_PRODUCT_ELIGIBILITY", str);
        bundle.putParcelable("ARGUMENT_PRODUCT_TYPE", parcelable);
        return bundle;
    }

    public static PowerManager A0G(Context context) {
        Object systemService = context.getSystemService("power");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    public static JsonWriter A0H(MediaType mediaType, C115925Mi c115925Mi, Writer writer, String str, String str2) {
        return new JsonWriter(writer).beginObject().name("avatar_id").value(c115925Mi.A02).name("avatar_revision_id").value(c115925Mi.A03).name("avatar_style").value(c115925Mi.A07).name("avatar_sticker_id").value(str).name("avatar_sticker_ikid").value(str2).name("avatar_sticker_media_type").value(mediaType.A00).name("surface");
    }

    public static AbstractC52922bZ A0L(FragmentActivity fragmentActivity, UserSession userSession) {
        return new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.fbwebrtc.multiway.RtcMessageHeader, com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    public static RtcMessageHeader A0N(Object obj, Object[] objArr, int i) {
        objArr[i] = obj;
        Object[] A01 = HyperThriftBase.Builder.A01(objArr);
        HyperThriftBase.Builder.A00(A01, 6);
        HyperThriftBase.Builder.A00(A01, 21);
        ?? obj2 = new Object();
        obj2.A02("com.facebook.fbwebrtc.multiway.RtcMessageHeader", A01);
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FeatureData A0O(Type type, String str, List list, int i) {
        return new FeatureData(type, str, null, 0 == true ? 1 : 0, 0.0d, 16376, ((Number) list.get(i - 1)).longValue());
    }

    public static ApiAdFormats A0Q(String str, int i) {
        return new ApiAdFormats(str, i, str);
    }

    public static IGCreatorIncentiveProgramFetchEntryPoint A0R(String str, String str2, int i) {
        return new IGCreatorIncentiveProgramFetchEntryPoint(str, i, str2);
    }

    public static C1ON A0T(AbstractC12990ll abstractC12990ll, C907642p c907642p) {
        C907542o c907542o = new C907542o(abstractC12990ll);
        c907542o.A09(c907642p);
        c907542o.A08 = "lead_gen_policy";
        return c907542o.A07(C05F.A00);
    }

    public static C26371Ps A0U(AbstractC12990ll abstractC12990ll) {
        C26371Ps c26371Ps = new C26371Ps(new C1JO(abstractC12990ll));
        c26371Ps.A01(C05F.A0N);
        return c26371Ps;
    }

    public static MusicOverlayStickerModel A0Y(MusicProduct musicProduct, AudioOverlayTrack audioOverlayTrack, MusicAssetModel musicAssetModel, String str) {
        return AbstractC23129AMi.A02(musicProduct, musicAssetModel, Integer.valueOf(audioOverlayTrack.A02), Integer.valueOf(audioOverlayTrack.A03), str);
    }

    public static IgRoomDatabase A0c(C1Ye c1Ye, AbstractC12990ll abstractC12990ll, C49242Of c49242Of) {
        AbstractC28241Yh.A00(c1Ye, 1702658258, 1401021912, true);
        c49242Of.A00(c1Ye);
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) c1Ye.A00();
        abstractC12990ll.A04(CreationDatabase.class, igRoomDatabase);
        return igRoomDatabase;
    }

    public static InterfaceC58156PqL A0d(C47979LIr c47979LIr, Object obj) {
        return (InterfaceC58156PqL) ((Map) c47979LIr.A05.getValue()).get(obj);
    }

    public static IllegalArgumentException A0f(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported type ");
        sb.append(new C0YZ(cls));
        return new IllegalArgumentException(sb.toString());
    }

    public static String A0i(InterfaceC02590Ai interfaceC02590Ai, C22F c22f, String str) {
        interfaceC02590Ai.AAP("legacy_falco_event_name", str);
        String str2 = c22f.A04.A0L;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String A0m(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static StringBuilder A0n(Object obj, Object obj2, Object obj3, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("isViewInflated: ");
        sb.append(obj);
        sb.append(" \nfoundContainerBefore: ");
        sb.append(obj2);
        sb.append(" \nexistingFragment: ");
        sb.append(obj3);
        sb.append(" \nbackstack entry count: ");
        sb.append(i);
        sb.append(" \nExisting fragments on fragmentManager: ");
        return sb;
    }

    public static HashSet A0p(C111364zz c111364zz) {
        C1ID.A00(((C1IB) C1P2.A00(c111364zz.A03)).A00);
        return c111364zz.A05;
    }

    public static List A0q(C115475Kh c115475Kh) {
        C115525Km c115525Km = c115475Kh.A0G;
        return AbstractC16960so.A1Q(Long.valueOf(c115525Km.A05), Long.valueOf(c115525Km.A09));
    }

    public static AnonymousClass195 A0s(Fragment fragment, InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        return AbstractC18560vj.A03(C07Y.A00(fragment.getViewLifecycleOwner()), new C15340po(interfaceC16620sF, interfaceC19390xP));
    }

    public static void A0t() {
        C14360o3.A0F("mediaTaggingInfos");
        throw null;
    }

    public static void A0u(PointF pointF, AnonymousClass182 anonymousClass182) {
        if (pointF != null) {
            anonymousClass182.A0r("position");
            anonymousClass182.A0c();
            anonymousClass182.A0g(pointF.x);
            anonymousClass182.A0g(pointF.y);
            anonymousClass182.A0Z();
        }
    }

    public static void A0v(MediaCodec.BufferInfo bufferInfo, Buffer buffer) {
        buffer.position(bufferInfo.offset);
        buffer.limit(bufferInfo.offset + bufferInfo.size);
    }

    public static void A0w(MediaFormat mediaFormat, int i, int i2) {
        mediaFormat.setInteger("color-format", 2130708361);
        mediaFormat.setInteger(TraceFieldType.Bitrate, i);
        mediaFormat.setInteger("frame-rate", i2);
    }

    public static void A0x(Pair pair, Map map) {
        Object obj = pair.first;
        C14360o3.A06(obj);
        Object obj2 = pair.second;
        C14360o3.A06(obj2);
        TreeSet treeSet = new TreeSet();
        treeSet.add(obj2);
        map.put(obj, treeSet);
    }

    public static void A12(View view, C3PE c3pe) {
        C3P9 c3p9 = new C3P9(view);
        c3p9.A04 = c3pe;
        c3p9.A05 = C05F.A01;
        c3p9.A00();
    }

    public static void A14(C07X c07x, InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        AbstractC18560vj.A03(AbstractC57302k5.A00(c07x.getLifecycle()), new C15340po(interfaceC16620sF, interfaceC19390xP));
    }

    public static void A15(C110814yt c110814yt, C110834yv c110834yv, int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        int A09 = c110814yt.A09(Math.max(Math.abs(i2), Math.abs(i3)));
        if (A09 > 0) {
            c110834yv.A00(c110814yt.A06, i2, i3, A09);
        }
    }

    public static void A16(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, int i) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        interfaceC02590Ai.A8p("event_type", Integer.valueOf(i));
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, int i) {
        interfaceC02590Ai.A8p("camera_position", Integer.valueOf(i));
        interfaceC02590Ai.A9K("capture_format_index", 0L);
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, C22F c22f) {
        interfaceC02590Ai.AAQ(AbstractC449424y.A07(c22f.A00, c22f.A03), "system_info");
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, C105824pt c105824pt, String str) {
        interfaceC02590Ai.A9K("parent_a_pk", AbstractC003100w.A0k(10, str));
        String str2 = c105824pt.A0X;
        str2.getClass();
        interfaceC02590Ai.A9K("parent_b_pk", AbstractC003100w.A0k(10, str2));
        String str3 = c105824pt.A0e;
        str3.getClass();
        interfaceC02590Ai.AAP("parent_m_pk", str3);
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, Map map) {
        interfaceC02590Ai.A9M("custom_fields", map);
        interfaceC02590Ai.AAP("application_state", AbstractC101994iE.A00());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.82I, X.0Zx] */
    public static void A1I(C82G c82g, EnumC201098ur enumC201098ur, C82H c82h, UserSession userSession, String str) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("suppress_reason", str);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, c0Zx, userSession);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.AbJ] */
    public static void A1J(C1125456i c1125456i, C1125856m c1125856m, float f) {
        ?? obj = new Object();
        obj.A00 = f;
        c1125856m.A03(new C69688VtY(c1125456i, obj), null);
    }

    public static void A1M(AbstractC23721Ec abstractC23721Ec, AnonymousClass700 anonymousClass700, String str, String str2, boolean z) {
        abstractC23721Ec.A9s("from_module", str);
        abstractC23721Ec.A04();
        abstractC23721Ec.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        abstractC23721Ec.A9s("is_prefetch", "false");
        abstractC23721Ec.A0I("is_app_start", z);
        if (anonymousClass700.A01) {
            abstractC23721Ec.A9s("push_disabled", "true");
        }
    }

    public static void A1O(C18920wW c18920wW, String str, String str2, String str3) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.AAP("notification_feed_session_id", str2);
            A00.AAP("notification_feed_visit_id", str3);
            A00.A8I("notification_feed_session_start_time", Double.valueOf(System.currentTimeMillis() / 1000.0d));
            A00.Cht();
        }
    }

    public static void A1S(C81Y c81y) {
        C183688Ct c183688Ct;
        if (c81y != null && (c183688Ct = c81y.A00.A0d) != null) {
            c183688Ct.A0z.A0C();
        }
    }

    public static void A1W(C145046gP c145046gP) {
        c145046gP.A02 = 0L;
        c145046gP.A01 = -1L;
    }

    public static float A00(Context context, float f) {
        return (context.getResources().getDimension(R.dimen.asset_picker_redesign_sticker_height) * f) / 1000.0f;
    }

    public static float A02(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return ((Number) obj2).floatValue();
    }

    public static int A03(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }

    public static int A06(Context context) {
        Integer A0J = AbstractC53242c7.A0J(context, R.attr.stackedTimelineCommonTrackHeight);
        if (A0J != null) {
            return A0J.intValue();
        }
        return context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
    }

    public static int A08(UserSession userSession, C47Z c47z, Object obj, InterfaceC09390do interfaceC09390do) {
        if (!C14360o3.A0K(obj, interfaceC09390do.getValue())) {
            ClipInfo clipInfo = c47z.A1N;
            return clipInfo.A05 - clipInfo.A07;
        }
        return AnonymousClass827.A00(userSession).A01;
    }

    public static View A0I(Activity activity, View.OnClickListener onClickListener, Integer num, boolean z) {
        View requireViewById = activity.requireViewById(R.id.next_button_textview);
        C14360o3.A0A(requireViewById);
        AbstractC43841Ja4.A02(onClickListener, (TextView) requireViewById, num, z);
        return requireViewById;
    }

    public static View A0J(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity.getCurrentFocus();
        }
        return null;
    }

    public static AbstractC52922bZ A0K(Fragment fragment, InterfaceC018407e interfaceC018407e, UserSession userSession) {
        return new C52942bb(new AnonymousClass846(userSession, fragment.requireActivity()), interfaceC018407e).A00(ClipsCreationViewModel.class);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media.AudioAttributesImpl, java.lang.Object, androidx.media.AudioAttributesImplApi21] */
    public static AudioAttributesCompat A0M(AudioAttributes.Builder builder) {
        AudioAttributes build = builder.build();
        ?? obj = new Object();
        obj.A01 = build;
        obj.A00 = -1;
        ?? obj2 = new Object();
        obj2.A00 = obj;
        return obj2;
    }

    public static C19280xC A0S(ShareLaterFragment shareLaterFragment, String str) {
        C19280xC A00 = C19280xC.A00(shareLaterFragment, str);
        ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
        C14360o3.A0A(shareLaterMedia);
        A00.A09("facebook_enabled", Boolean.valueOf(shareLaterMedia.A07));
        return A00;
    }

    public static C87C A0V(Fragment fragment, InterfaceC09390do interfaceC09390do) {
        return new C87C((UserSession) interfaceC09390do.getValue(), fragment.requireActivity());
    }

    public static AnonymousClass846 A0W(Fragment fragment, InterfaceC09390do interfaceC09390do) {
        return new AnonymousClass846((UserSession) interfaceC09390do.getValue(), fragment.requireActivity());
    }

    public static C50948MfH A0X(InterfaceC09390do interfaceC09390do) {
        return (C50948MfH) interfaceC09390do.getValue();
    }

    public static C47Z A0b(UserSession userSession, Iterator it) {
        return C25A.A00(userSession).A03(((MediaSession) it.next()).BcD());
    }

    public static Boolean A0e(C152406tQ c152406tQ, String str) {
        return (Boolean) c152406tQ.A00(str);
    }

    public static String A0g(Context context) {
        String absolutePath = new File(context.getCacheDir(), "blur_icons/").getAbsolutePath();
        C14360o3.A07(absolutePath);
        return absolutePath;
    }

    public static String A0h(C152406tQ c152406tQ, String str) {
        return (String) c152406tQ.A00(str);
    }

    public static String A0j(UserFlowLoggerImpl userFlowLoggerImpl, Throwable th, long j) {
        userFlowLoggerImpl.flowAnnotate(j, "stacktrace", C2Ql.A00(th));
        String message = th.getMessage();
        if (message == null) {
            return "empty";
        }
        return message;
    }

    public static String A0k(UserSession userSession) {
        return C08730cb.A00(userSession).A00().A03.getFbidV2();
    }

    public static String A0l(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        String obj2 = sb.toString();
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj2);
            sb2.append("|   mediatorLoadStates: ");
            sb2.append(obj);
            sb2.append('\n');
            return sb2.toString();
        }
        return obj2;
    }

    public static ArrayList A0o(AbstractC02600Aj abstractC02600Aj, AbstractMap abstractMap) {
        abstractC02600Aj.A0Q("current_guest_count", Long.valueOf(abstractMap.size()));
        return new ArrayList(abstractMap.size());
    }

    public static void A10(View view, Fragment fragment) {
        int color = fragment.requireContext().getColor(AbstractC53242c7.A0D(fragment.requireContext()));
        view.setBackgroundColor(color);
        AbstractC56402iY.A02(fragment.requireActivity(), color);
        C30D.A04(fragment.requireActivity(), color);
    }

    public static void A11(View view, Fragment fragment) {
        View currentFocus;
        AbstractC13880nE.A0O(view);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
    }

    public static void A13(TextView textView, IgFormField igFormField, int i) {
        String A0g = AnonymousClass001.A0g(NumberFormat.getInstance(Locale.getDefault()).format(i), "/", NumberFormat.getInstance(Locale.getDefault()).format(igFormField.A02));
        C14360o3.A07(A0g);
        textView.setText(A0g);
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.AAK(new C4SX(Long.valueOf(j)), "a_pk");
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, JIN jin) {
        interfaceC02590Ai.A9K("audio_cluster_id", AbstractC449424y.A08(jin.getAudioClusterId()));
        interfaceC02590Ai.AAP("audio_type", jin.CBi().A00);
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, JIN jin) {
        interfaceC02590Ai.A7v("is_bookmarked", Boolean.valueOf(jin.isBookmarked()));
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A8p("event_type", 2);
    }

    public static void A1G(C25531Mh c25531Mh, EnumC114925Hg enumC114925Hg, C22F c22f) {
        c25531Mh.A0a(enumC114925Hg);
        C22M c22m = c22f.A04;
        c25531Mh.A0b(c22m.A09);
        c25531Mh.A0T();
        c25531Mh.A0U();
        c25531Mh.A0m(C22F.A08.getModuleName());
        c25531Mh.A0c(c22m.A0A);
        c25531Mh.A0t(C1QM.A00.A02.A00);
    }

    public static void A1H(C25531Mh c25531Mh, EnumC114925Hg enumC114925Hg, C448124l c448124l, String str) {
        c25531Mh.A0q(str);
        C448124l.A00(c25531Mh, c448124l);
        c25531Mh.A0a(enumC114925Hg);
        C22M c22m = c448124l.A04;
        c25531Mh.A0b(c22m.A09);
        c25531Mh.A0T();
        c25531Mh.A0U();
        c25531Mh.A0m(C22F.A08.getModuleName());
        c25531Mh.A0R("sticker_tray_session_id", c22m.A0U);
        c25531Mh.A0c(c22m.A0A);
        c25531Mh.A0R("composition_str_id", c22m.A0M);
        c25531Mh.A0M(c22m.A0A, "composition_media_type");
        c25531Mh.A0t(C1QM.A00.A02.A00);
    }

    public static void A1K(C1126256q c1126256q, C1125856m c1125856m, C1125656k c1125656k) {
        c1125856m.A02(c1125656k.A00());
        c1126256q.A04(new C1125956n(c1125856m));
    }

    public static void A1L(AnonymousClass182 anonymousClass182, Iterator it) {
        Number number = (Number) it.next();
        if (number != null) {
            anonymousClass182.A0i(number.longValue());
        }
    }

    public static void A1N(C006802i c006802i, String str, int i) {
        c006802i.markerStart(694558626, i);
        c006802i.markerAnnotate(694558626, i, "endpoint", C0L6.A00());
        c006802i.markerAnnotate(694558626, i, "asl_session_id", C0L6.A01());
        c006802i.markerAnnotate(694558626, i, "activityClass", AnonymousClass001.A0g("<cls>", str, "</cls>"));
        c006802i.markerAnnotate(694558626, i, "method_class", AnonymousClass001.A0g("<cls>", str, "</cls>"));
    }

    public static void A1T(InterfaceC19630xq interfaceC19630xq, String str, int i) {
        int i2 = interfaceC19630xq.getInt(str, i) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D(str, i2);
        ARD.apply();
    }

    public static void A1V(AbstractC125325le abstractC125325le, float f) {
        abstractC125325le.A0G();
        abstractC125325le.A0K(f);
        abstractC125325le.A0A().A0H();
    }

    public static void A1X(OutputStream outputStream, ByteBuffer byteBuffer) {
        outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static void A1Y(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(C128085qc.A02(((C111034zF) it.next()).A00));
    }

    public static void A1Z(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((PeopleTag) it.next()).A07().getId());
    }

    public static boolean A1a(FollowersShareFragment followersShareFragment) {
        return C131975xX.A00(followersShareFragment.A0R()).A0C(followersShareFragment.A0R());
    }
}
