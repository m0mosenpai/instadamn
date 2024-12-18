package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import com.instagram.creation.video.ui.CamcorderBlinker;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.TrackSnippet;
import com.instagram.user.model.Product;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes8.dex */
public abstract class JQ0 {
    public static SpannableStringBuilder A0B(UserSession userSession, CharSequence charSequence) {
        C85383rT c85383rT = new C85383rT(new SpannableStringBuilder(charSequence), userSession);
        c85383rT.A03(null);
        return c85383rT.A00();
    }

    public static IgTextView A0N(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
        return (IgTextView) inflate;
    }

    public static C7SP A0S(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC162927Rd abstractC162927Rd) {
        C14360o3.A0B(abstractC162927Rd, 1);
        C7SP createViewHolder = abstractC162927Rd.createViewHolder(layoutInflater, viewGroup);
        C14360o3.A07(createViewHolder);
        return createViewHolder;
    }

    public static C7IM A0T(C160667Ia c160667Ia, Object obj) {
        C7IM c7im = c160667Ia.A04;
        C14360o3.A0B(obj, 0);
        return c7im;
    }

    public static DirectThreadAnalyticsParams A0V(C160787Im c160787Im, C83403nh c83403nh, int i) {
        if (i != 0) {
            return null;
        }
        C7TT c7tt = c160787Im.A0G;
        C14360o3.A07(c7tt);
        return AbstractC1578876x.A00(c7tt, c83403nh.A2G);
    }

    public static PrivacyMediaOverlayViewModel A0W(Context context, int i) {
        if (i != 0) {
            String string = context.getString(2131964622);
            return new PrivacyMediaOverlayViewModel(Integer.valueOf(R.drawable.instagram_eye_off_pano_outline_24), C05F.A00, null, null, string, null, 2, false);
        }
        return null;
    }

    public static AbstractC125325le A0Z(View view) {
        AbstractC125325le A01 = AbstractC125325le.A01(view, 1);
        A01.A0G();
        return A01.A0D(new AccelerateInterpolator()).A0C(200L);
    }

    public static Float A0c() {
        return new Float(0.0f);
    }

    public static void A0w(Drawable drawable, View view) {
        if (drawable != null) {
            drawable.setColorFilter(AbstractC46530KiV.A00(C05F.A0j, view.getResources().getColor(R.color.audio_bar_action_color_enabled, null)));
        }
    }

    public static void A0x(MediaPlayer mediaPlayer) {
        C14360o3.A0B(mediaPlayer, 0);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(0.0f, 0.0f);
    }

    public static void A0y(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        parcel.readInt();
    }

    public static void A0z(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static void A1A(C0Zx c0Zx, int i, int i2) {
        c0Zx.A05("page_number", Long.valueOf(i));
        c0Zx.A05("total_pages", Long.valueOf(i2));
    }

    public static void A1H(FeedColorFilterPicker feedColorFilterPicker) {
        feedColorFilterPicker.A00 = -1;
        feedColorFilterPicker.A01 = -1;
        feedColorFilterPicker.setHorizontalFadingEdgeEnabled(false);
        feedColorFilterPicker.setHorizontalScrollBarEnabled(false);
        feedColorFilterPicker.A06 = new ArrayList();
    }

    public static void A1M(Object obj) {
        C14360o3.A0B(obj, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
    }

    public static void A1O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(obj2, 2);
        C14360o3.A0B(obj3, 3);
        C14360o3.A0B(obj4, 4);
        C14360o3.A0B(obj5, 5);
    }

    public static byte[] A1b(byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public static float A00(double d) {
        return (float) Math.min(Math.max(d, 0.0d), 1.0d);
    }

    public static int A01(int i) {
        return (527 + i) * 31;
    }

    public static int A02(int i) {
        return i > 0 ? 0 : 8;
    }

    public static int A03(int i, int i2) {
        if ((i & 4) != 0) {
            return 0;
        }
        return i2;
    }

    public static int A05(long j) {
        return (int) (((new Date().getTime() - new Date(j * 1000).getTime()) / 1000) / 60);
    }

    public static Intent A0A(AudioOverlayTrack audioOverlayTrack, TrackSnippet trackSnippet) {
        int i = trackSnippet.A01;
        int i2 = trackSnippet.A00;
        int i3 = audioOverlayTrack.A04;
        int i4 = audioOverlayTrack.A01;
        String str = audioOverlayTrack.A0B;
        String str2 = audioOverlayTrack.A0A;
        String str3 = audioOverlayTrack.A0E;
        MusicBrowseCategory musicBrowseCategory = audioOverlayTrack.A09;
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        EnumC185288Jt enumC185288Jt = audioOverlayTrack.A05;
        float f = audioOverlayTrack.A00;
        AudioOverlayTrack audioOverlayTrack2 = new AudioOverlayTrack(enumC185288Jt, downloadedTrack, audioOverlayTrack.A07, musicAssetModel, musicBrowseCategory, str, str2, str3, audioOverlayTrack.A0C, f, i, i2, i3, i4);
        Intent intent = new Intent();
        intent.putExtra("extra_audio_track", audioOverlayTrack2);
        return intent;
    }

    public static AttributeSet A0C(AttributeSet attributeSet, int i) {
        if ((i & 2) != 0) {
            return null;
        }
        return attributeSet;
    }

    public static View A0F(Object obj) {
        return ((Fragment) obj).requireView();
    }

    public static InterfaceC02590Ai A0H(C18920wW c18920wW, String str, String str2, String str3) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("open_thread_id", str2);
        A00.AAP("media_type", str3);
        return A00;
    }

    public static InterfaceC02590Ai A0I(AbstractC12990ll abstractC12990ll) {
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB("igd_security_alert"), abstractC12990ll);
        return A01.A00(A01.A00, "igd_security_alerts");
    }

    public static C42221xC A0M(C46053Ka8 c46053Ka8) {
        UserSession userSession = (UserSession) c46053Ka8.A02.getValue();
        return C6AE.A02(userSession, EnumC132075xi.A0D, AbstractC94034Kn.A00(userSession)).A00();
    }

    public static C44456JlO A0Q(AbstractC45802KPh abstractC45802KPh) {
        return (C44456JlO) abstractC45802KPh.A03.getValue();
    }

    public static C76N A0R(AnonymousClass795 anonymousClass795) {
        return new C76N(anonymousClass795);
    }

    public static InterfaceC19630xq A0Y(C43898Jb8 c43898Jb8) {
        return ((C1AU) c43898Jb8.A01.getValue()).A04(C1AV.A0d, c43898Jb8.getClass());
    }

    public static IllegalStateException A0d() {
        return new IllegalStateException("Stub");
    }

    public static Integer A0e(int i, int i2) {
        if (i == i2) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static Long A0g(AbstractC1351869s abstractC1351869s, int i, int i2) {
        return Long.valueOf(abstractC1351869s.mResultSet.getLong(i, i2));
    }

    public static LinkedHashMap A0n(C70073W1q c70073W1q, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C70199WGm.A08(c70073W1q, linkedHashMap);
        if (z) {
            linkedHashMap.put("is_reload", String.valueOf(z));
        }
        return linkedHashMap;
    }

    public static java.util.Set A0o(Uri.Builder builder, android.net.Uri uri) {
        builder.scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
        java.util.Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (!queryParameterNames.contains("utm_source")) {
            builder.appendQueryParameter("utm_source", "qr");
        }
        return queryParameterNames;
    }

    public static InterfaceC09390do A0p(Object obj, int i) {
        return C1XM.A00(new C37054GUk(obj, i));
    }

    public static InterfaceC09390do A0q(Object obj, int i) {
        return C1XM.A00(new X2y(obj, i));
    }

    public static C89563yw A0r(InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C89563yw.A01;
        return new C89563yw(C1E2.A02(interfaceC23621Ds));
    }

    public static C24891Jo A0s(InterfaceC23621Ds interfaceC23621Ds) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        return c24891Jo;
    }

    public static void A0t() {
        C14360o3.A0F("musicOverlayEditController");
        throw null;
    }

    public static void A11(Fragment fragment, InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        AbstractC18560vj.A03(C07Y.A00(fragment.getViewLifecycleOwner()), new C15340po(interfaceC16620sF, interfaceC19390xP));
    }

    public static void A12(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02530Ab interfaceC02530Ab2, InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("event_name", str);
        interfaceC02590Ai.A8R(interfaceC02530Ab, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        interfaceC02590Ai.A8R(interfaceC02530Ab2, "user_role");
    }

    public static void A13(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "platform");
        interfaceC02590Ai.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
        interfaceC02590Ai.AAQ(c0Zx, "event_payload");
    }

    public static void A14(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str, String str2, String str3) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "suggestion_type");
        interfaceC02590Ai.A9K("page_or_business_id", Long.valueOf(Long.parseLong(str)));
        interfaceC02590Ai.A9K("consumer_id", Long.valueOf(Long.parseLong(str2)));
        interfaceC02590Ai.AAP(TraceFieldType.RequestID, str3);
        interfaceC02590Ai.AAP("channel", "INSTAGRAM");
        interfaceC02590Ai.Cht();
    }

    public static void A15(InterfaceC02530Ab interfaceC02530Ab, AbstractC02600Aj abstractC02600Aj, String str, boolean z) {
        abstractC02600Aj.A0M(interfaceC02530Ab, "thread_type");
        abstractC02600Aj.A0O("is_e2ee", Boolean.valueOf(z));
        abstractC02600Aj.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, W99 w99) {
        interfaceC02590Ai.AAP("search_session_id", w99.A05);
        interfaceC02590Ai.AAP("serp_session_id", w99.A06);
        interfaceC02590Ai.AAP("rank_token", w99.A02.E6d());
        interfaceC02590Ai.AAP("query_text", w99.A04);
        interfaceC02590Ai.AAP("text_response_id", w99.A03.A00());
        interfaceC02590Ai.Cht();
    }

    public static void A19(AbstractC02600Aj abstractC02600Aj, PushInfraMetaData pushInfraMetaData, String str, long j) {
        abstractC02600Aj.A0R("notif_event_log_flag", str);
        abstractC02600Aj.A0Q("push_usecase_id", Long.valueOf(j));
        abstractC02600Aj.A0R("pi_nid", pushInfraMetaData.A08);
    }

    public static void A1B(C0Zx c0Zx, Object obj) {
        LoggingContext loggingContext = (LoggingContext) obj;
        c0Zx.A05("product_id", Long.valueOf(loggingContext.A00));
        c0Zx.A02(AbstractC63059Sbg.A00(loggingContext), "logging_policy");
    }

    public static void A1C(C25531Mh c25531Mh, C22M c22m) {
        c25531Mh.A0c(c22m.A0A);
        c25531Mh.A0R("composition_str_id", c22m.A0M);
        c25531Mh.A0M(c22m.A0A, "composition_media_type");
    }

    public static void A1F(AbstractC23721Ec abstractC23721Ec, Object obj, String str) {
        abstractC23721Ec.A0B("creatives/story_media_search_keyed_format/");
        abstractC23721Ec.A9s("media_types", obj.toString());
        abstractC23721Ec.A9s("q", str);
    }

    public static void A1J(AbstractC2056898s abstractC2056898s, String str) {
        abstractC2056898s.A07("END_REASON", str);
        abstractC2056898s.A05(str);
        abstractC2056898s.A01();
    }

    public static void A1N(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 19);
        C14360o3.A0B(obj2, 23);
        C14360o3.A0B(obj3, 29);
    }

    public static void A1P(String str, UserSession userSession, C38321qM c38321qM) {
        CreativeConfigIntf Asm;
        if (c38321qM.A0C.Asm() != null && (Asm = c38321qM.A0C.Asm()) != null) {
            C9PL c9pl = new C9PL(str);
            c9pl.A0A = AbstractC16960so.A1O(Asm.B3z());
            c9pl.A07 = Asm.BcZ();
            c9pl.A0B = true;
            AbstractC188508Wp.A04(userSession, c9pl);
        }
    }

    public static void A1Q(String str, String str2, String str3) {
        C0f5 AEp = C18950wb.A01.AEp("Message fails to be rebuilt from payload", 20123732);
        AEp.ABW("fetchReason", "message_receive");
        AEp.ABW("threadId", str);
        AEp.ABW("messageId", str2);
        AEp.ABW("error", str3);
        AEp.report();
    }

    public static boolean A1X(C8OS c8os, Integer num, Object obj, C05A c05a) {
        Bitmap bitmap = c8os.A02;
        Bitmap bitmap2 = c8os.A00;
        float[] fArr = c8os.A08;
        return c05a.AIi(obj, new C8OS(bitmap, bitmap2, c8os.A01, c8os.A03, c8os.A04, num, fArr, c8os.A07, c8os.A06));
    }

    public static boolean A1Z(Object obj, Object obj2, Object obj3, Map map, C05A c05a) {
        C06860Yd c06860Yd = new C06860Yd();
        c06860Yd.putAll(map);
        c06860Yd.put(obj, obj2);
        return c05a.AIi(obj3, AbstractC16850sd.A0N(c06860Yd));
    }

    public static int A04(int i, int i2) {
        return C05F.A00(i)[i2].intValue();
    }

    public static int A06(Context context) {
        Resources resources = context.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        }
        return 0;
    }

    public static int A07(View view, int i) {
        return view.getResources().getDimensionPixelSize(i);
    }

    public static int A08(ImmutableMap immutableMap, Object obj, Object obj2) {
        return ((Number) immutableMap.getOrDefault(obj, obj2)).intValue();
    }

    public static long A09(InterfaceC132965zL interfaceC132965zL) {
        return ((MsysThreadId) AbstractC132975zM.A01(interfaceC132965zL)).A00;
    }

    public static LayoutInflater A0D(LayoutInflater layoutInflater, Fragment fragment) {
        return layoutInflater.cloneInContext(new C52182aJ(fragment.getContext(), R.style.EffectDarkMode));
    }

    public static View A0E(Fragment fragment, int i) {
        View findViewById = fragment.requireView().findViewById(i);
        C14360o3.A0A(findViewById);
        return findViewById;
    }

    public static ViewPropertyAnimator A0G(ViewPropertyAnimator viewPropertyAnimator, float f) {
        return viewPropertyAnimator.scaleX(f).scaleY(f).setDuration(250L);
    }

    public static C55004OVk A0J(AbstractC12990ll abstractC12990ll) {
        UserSession A00 = AbstractC28057CYl.A00(AbstractC28057CYl.A01(abstractC12990ll));
        C14360o3.A0B(A00, 0);
        return (C55004OVk) A00.A01(C55004OVk.class, new C57549PgN(A00, 4));
    }

    public static AnonymousClass625 A0K(AbstractC12990ll abstractC12990ll) {
        return new AnonymousClass625(AbstractC25651Mw.A00(abstractC12990ll));
    }

    public static AbstractC66422zJ A0L(InterfaceC09390do interfaceC09390do) {
        return (AbstractC66422zJ) interfaceC09390do.getValue();
    }

    public static C22M A0O(InterfaceC02530Ab interfaceC02530Ab, C25531Mh c25531Mh, C448124l c448124l, String str) {
        c25531Mh.A0q(str);
        C448124l.A00(c25531Mh, c448124l);
        c25531Mh.A0a(c448124l.A0J());
        C22M c22m = c448124l.A04;
        c25531Mh.A0b(c22m.A09);
        c25531Mh.A0T();
        c25531Mh.A0M(interfaceC02530Ab, "surface");
        c25531Mh.A0m("giphy_clips_grid");
        c25531Mh.A0c(AnonymousClass249.VIDEO);
        c25531Mh.A0R("third_party_session_id", c22m.A0Q);
        return c22m;
    }

    public static CommonMediaTransport A0P(AbstractC60877RXa abstractC60877RXa) {
        abstractC60877RXa.A04();
        return (CommonMediaTransport) abstractC60877RXa.A00;
    }

    public static E6B A0U(View view) {
        return new E6B(AbstractC13880nE.A0G(view), view.getRotation());
    }

    public static InterfaceC2056098k A0X(DirectShareTarget directShareTarget) {
        return AbstractC140946Yw.A03(directShareTarget.A01());
    }

    public static Product A0a(JI6 ji6) {
        Product product = ji6.C02().A08;
        C14360o3.A0A(product);
        return product;
    }

    public static C2F8 A0b(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        return (C2F8) entry.getValue();
    }

    public static Long A0f(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i));
    }

    public static Object A0h(Object obj, AbstractMap abstractMap) {
        Object obj2 = abstractMap.get(obj);
        if (obj2 == null) {
            ArrayList arrayList = new ArrayList();
            abstractMap.put(obj, arrayList);
            return arrayList;
        }
        return obj2;
    }

    public static String A0i(Fragment fragment, C5QE c5qe) {
        return BHX.A02(fragment, c5qe).toString();
    }

    public static String A0j(UserSession userSession, C160787Im c160787Im, boolean z) {
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = c160787Im.A0e;
        if (!A00) {
            return c83403nh.A0i();
        }
        return c83403nh.A0j();
    }

    public static String A0k(UserSession userSession, C83403nh c83403nh, boolean z) {
        if (!C7Q1.A00(userSession, z)) {
            return c83403nh.A0i();
        }
        return c83403nh.A0j();
    }

    public static String A0l(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public static AbstractCollection A0m(Object obj, AbstractMap abstractMap) {
        AbstractCollection abstractCollection = (AbstractCollection) abstractMap.get(obj);
        if (abstractCollection == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            abstractMap.put(obj, linkedHashSet);
            return linkedHashSet;
        }
        return abstractCollection;
    }

    public static void A0u(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 22);
        C14360o3.A0B(obj3, 23);
        C14360o3.A0B(obj4, 24);
    }

    public static void A0v(RectF rectF, Paint paint) {
        rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
    }

    public static void A10(C6Nu c6Nu, Object obj, int i) {
        c6Nu.CgH(null, C5UA.A03(obj, i));
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, JQO jqo) {
        interfaceC02590Ai.AAP("platform", JQU.A04(jqo));
        interfaceC02590Ai.AAQ(JQU.A00(jqo), "messaging_data");
        interfaceC02590Ai.AAk("push_token_fbid", JQU.A07(jqo));
        interfaceC02590Ai.AAP("push_infra_notif_id", jqo.A0J);
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, JQO jqo, String str, String str2) {
        String str3;
        interfaceC02590Ai.AAP(str, str2);
        JQU jqu = JQU.A01;
        if (C218914p.A08()) {
            str3 = AppStateModule.APP_STATE_BACKGROUND;
        } else {
            str3 = "foreground";
        }
        interfaceC02590Ai.AAP("app_state", str3);
        interfaceC02590Ai.AAP("app_startup_type", JQU.A02());
        interfaceC02590Ai.AAP("render_target", JQU.A06(jqo));
    }

    public static void A1D(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, String str2, int i, int i2) {
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, str2);
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.FailureReason, str2);
    }

    public static void A1E(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, String str2, int i, int i2) {
        lightweightQuickPerformanceLogger.markerPoint(i, i2, str);
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.FailureReason, str2);
    }

    public static void A1G(C006802i c006802i, String str, String str2, int i, int i2) {
        c006802i.markerAnnotate(i, i2, str, str2);
        c006802i.markerEnd(i, i2, (short) 3);
    }

    public static void A1I(CamcorderBlinker camcorderBlinker) {
        Context context = camcorderBlinker.getContext();
        camcorderBlinker.A00 = AbstractC13880nE.A0A(context);
        camcorderBlinker.A01 = AnimationUtils.loadAnimation(context, R.anim.camcorder_blinker);
    }

    public static void A1K(Integer num, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new LongPressActionData(null, EnumC46221Kcx.A09, num, Integer.valueOf(i), str, null));
    }

    public static void A1L(Integer num, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new LongPressActionData(null, EnumC46221Kcx.A07, num, Integer.valueOf(i), str, null));
    }

    public static void A1R(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", contextReplyMessageDecorationsViewModel=");
    }

    public static void A1S(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", commonMessageDecorationsViewModel=");
    }

    public static void A1T(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", contextContentViewModel=");
    }

    public static void A1U(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", contentViewModel=");
    }

    public static void A1V(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", replyContentViewModel=");
    }

    public static boolean A1W(Context context, AbstractC23721Ec abstractC23721Ec, UserSession userSession, String str, String str2) {
        abstractC23721Ec.A9s(str, str2);
        abstractC23721Ec.A9s("waterfall_id", C1Q9.A01());
        abstractC23721Ec.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.userId);
        abstractC23721Ec.A9s(AbstractC31187DnW.A02(0, 9, 125), C16030qx.A00(context));
        C16030qx c16030qx = C16030qx.A02;
        C14360o3.A0A(context);
        abstractC23721Ec.A9s("guid", c16030qx.A05(context));
        return false;
    }

    public static boolean A1Y(JR2 jr2) {
        return ((C2DU) jr2.A0w()).A0C.A0V(jr2.A0u(), JR2.A04(jr2));
    }

    public static boolean A1a(Object obj, Iterator it) {
        return C14360o3.A0K(((C9C6) it.next()).A03, obj);
    }
}
