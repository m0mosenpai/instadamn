package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.CoroutineLiveData;
import com.facebook.R;
import com.facebook.android.maps.model.LatLng;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.JPz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43594JPz {
    public static double A00(float f, float f2) {
        return Math.sqrt((f * f) + (f2 * f2));
    }

    public static double A01(float f, float f2) {
        return Math.toDegrees(Math.atan(Math.abs(f / f2)));
    }

    public static Drawable A0C(C7IM c7im) {
        C14360o3.A0B(c7im, 0);
        return c7im.A03.A04();
    }

    public static GradientDrawable A0D() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, C6QG.A07);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    public static C006802i A0O(Object obj) {
        C14360o3.A0B(obj, 0);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        return c006802i;
    }

    public static C7SP A0X(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC162927Rd abstractC162927Rd) {
        C14360o3.A0B(abstractC162927Rd, 3);
        return abstractC162927Rd.createViewHolder(layoutInflater, viewGroup);
    }

    public static Long A0p(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, DirectThreadAnalyticsParams directThreadAnalyticsParams) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "direct_source");
        if (directThreadAnalyticsParams != null) {
            return Long.valueOf(directThreadAnalyticsParams.A00);
        }
        return null;
    }

    public static StringBuilder A0x(Object obj) {
        C14360o3.A0B(obj, 0);
        return new StringBuilder();
    }

    public static C19K A13(C12N c12n, int i) {
        return AnonymousClass194.A02(c12n.CPG(i, 3));
    }

    public static void A16(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(1);
    }

    public static void A1D(C0Zx c0Zx, int i) {
        c0Zx.A05("balance", Long.valueOf(i));
    }

    public static void A1H(AbstractC2056898s abstractC2056898s, List list) {
        abstractC2056898s.A09("FAILURE_REASON", (String[]) list.toArray(new String[0]));
    }

    public static void A1N(C4I7 c4i7, Long l, String str, String str2, List list) {
        c4i7.A00(new C9CH(C4IA.A05, C4IB.A0C), l, str, str2, null, list);
    }

    public static void A1P(Object obj, Object obj2) {
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 4);
    }

    public static void A1T(C05A c05a) {
        c05a.Egh(false);
    }

    public static boolean A1W(View view) {
        C14360o3.A0B(view, 0);
        return view.isEnabled();
    }

    public static int A0A(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 1;
    }

    public static int A0B(Object obj, InterfaceC16530ry interfaceC16530ry, C0YR[] c0yrArr, int i) {
        return ((Number) interfaceC16530ry.CES(obj, c0yrArr[i])).intValue();
    }

    public static AlphaAnimation A0I(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(200L);
        return alphaAnimation;
    }

    public static C1Ye A0K(UserSession userSession, C1YX c1yx, Class cls) {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        return C1Yc.A00(context, cls, C1YZ.A00(userSession, c1yx));
    }

    public static ImmutableList A0M() {
        ImmutableList of = ImmutableList.of((Object) AudioTrackType.A03, (Object) AudioTrackType.A04);
        C14360o3.A07(of);
        return of;
    }

    public static AnonymousClass841 A0Q(Object obj) {
        return ((InterfaceC189608af) obj).Ak4().A00();
    }

    public static AnonymousClass841 A0R(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
        return ((InterfaceC189608af) obj).Ak4().A00();
    }

    public static Jn4 A0U(Object obj) {
        return (Jn4) ((C46054Ka9) obj).A0B.getValue();
    }

    public static C7QL A0Y(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C83403nh c83403nh) {
        return C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c83403nh.A10, AbstractC09440dt.A01(C7SV.A00));
    }

    public static C7QL A0Z(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C2EY c2ey) {
        return C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c2ey, AbstractC09440dt.A01(C7SV.A00));
    }

    public static AnonymousClass988 A0a(UserSession userSession, AnonymousClass989 anonymousClass989) {
        Parcelable.Creator creator = Capabilities.CREATOR;
        return anonymousClass989.A00(userSession, AbstractC2054797v.A00(C16930sl.A00));
    }

    public static C137766Ly A0e(JR2 jr2) {
        return C137756Lx.A03.A01(jr2.A0p(), EnumC132075xi.A0E).A01;
    }

    public static C194848jk A0m(Object obj) {
        return new C194848jk(((C194848jk) obj).A00.toString());
    }

    public static Object A0r(Object obj) {
        return ((C3DC) ((C3NX) obj).A00).F7f();
    }

    public static String A0u(C83403nh c83403nh, int i) {
        if (i != 0) {
            return c83403nh.A0j();
        }
        return c83403nh.A0i();
    }

    public static String A0v(C83403nh c83403nh, int i) {
        if (i == 0) {
            return c83403nh.A0i();
        }
        return c83403nh.A0j();
    }

    public static List A12(Collection collection) {
        if (collection == null) {
            return Collections.emptyList();
        }
        return ImmutableList.copyOf(collection);
    }

    public static void A17(View view, int i, int i2) {
        if (view != null) {
            view.setTranslationY((-i) - i2);
        }
    }

    public static void A19(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        C14240no c14240no = new C14240no(abstractC10360h2);
        c14240no.A03(fragment);
        c14240no.A00();
    }

    public static void A1A(InterfaceC02530Ab interfaceC02530Ab, C0Zx c0Zx, C30P c30p) {
        c0Zx.A01(interfaceC02530Ab, "tracking_type");
        c0Zx.A06("current_watching_module", c30p.A00.getModuleName());
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, C22M c22m) {
        interfaceC02590Ai.AAP("composition_str_id", c22m.A0M);
        interfaceC02590Ai.A8R(c22m.A0A, "composition_media_type");
    }

    public static void A1E(C0Zx c0Zx, LoggingContext loggingContext) {
        c0Zx.A05("product_id", Long.valueOf(loggingContext.A00));
    }

    public static void A1F(C0Zx c0Zx, String str, boolean z) {
        c0Zx.A06(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c0Zx.A03("is_xac_thread", Boolean.valueOf(z));
    }

    public static void A1I(JR2 jr2) {
        ((InterfaceC70513Em) jr2.A10.getValue()).setIsLoading(false);
    }

    public static void A1J(JR2 jr2) {
        C44117Jeh c44117Jeh = jr2.A0c;
        if (c44117Jeh != null) {
            c44117Jeh.A02(EnumC43799JYm.A05);
        }
    }

    public static void A1O(Object obj) {
        ((C5DO) ((C5DP) obj)).A00.performHapticFeedback(0);
    }

    public static void A1R(Runnable runnable) {
        if (runnable != null) {
            C14270nr.A00().A02(runnable);
        }
    }

    public static void A1U(float[] fArr, float f, int i) {
        fArr[i] = f;
        fArr[2] = f;
        fArr[3] = f;
    }

    public static boolean A1Y(UserSession userSession, C83403nh c83403nh) {
        return c83403nh.A1j(C17060sy.A01.A01(userSession));
    }

    public static float A02(Context context) {
        return context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
    }

    public static int A03(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    }

    public static int A04(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
    }

    public static int A05(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
    }

    public static int A06(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }

    public static int A07(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
    }

    public static int A08(View view, int i) {
        return (i - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A09(View view, View view2) {
        return view.getWidth() - view2.getWidth();
    }

    public static View A0E(View view) {
        Object parent = view.getParent();
        C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.View");
        return (View) parent;
    }

    public static View A0F(View view, int i) {
        return ((ViewStub) view.findViewById(i)).inflate();
    }

    public static ViewPropertyAnimator A0G(View view) {
        return view.animate().alpha(0.0f);
    }

    public static ViewPropertyAnimator A0H(View view) {
        return view.animate().alpha(1.0f);
    }

    public static CoroutineLiveData A0J(Object obj, C19L c19l, InterfaceC19390xP interfaceC19390xP, C10H c10h) {
        return AbstractC58232lf.A00(AnonymousClass191.A00, AbstractC208910l.A01(obj, c19l, interfaceC19390xP, c10h));
    }

    public static LatLng A0L(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static C70399WUb A0N(InterfaceC09390do interfaceC09390do) {
        return C70399WUb.A00((UserSession) interfaceC09390do.getValue());
    }

    public static UserSession A0P(InterfaceC09390do interfaceC09390do) {
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        C14360o3.A0B(userSession, 1);
        return userSession;
    }

    public static SupplementMessageContent A0S(TransportPayload transportPayload) {
        SupplementMessageContent supplementMessageContent = transportPayload.A0M().content_;
        if (supplementMessageContent == null) {
            return SupplementMessageContent.DEFAULT_INSTANCE;
        }
        return supplementMessageContent;
    }

    public static Jn4 A0T(AbstractC2056898s abstractC2056898s, String str, InterfaceC09390do interfaceC09390do) {
        abstractC2056898s.A05(str);
        abstractC2056898s.A02();
        return (Jn4) interfaceC09390do.getValue();
    }

    public static C135976Dc A0V(InterfaceC09390do interfaceC09390do) {
        return AbstractC135966Db.A01((UserSession) interfaceC09390do.getValue());
    }

    public static C45052Jwh A0W(Object obj, C05A c05a) {
        return (C45052Jwh) ((Map) c05a.getValue()).get(obj);
    }

    public static C162907Rb A0b(C7QB c7qb, C7QB c7qb2) {
        return new C162907Rb(AbstractC16960so.A1Q(c7qb, c7qb2));
    }

    public static C81663kb A0c(UserSession userSession, DirectThreadKey directThreadKey) {
        return C2DU.A03((C2DU) C2JD.A00(userSession), directThreadKey);
    }

    public static C81663kb A0d(UserSession userSession, String str) {
        return ((C2DU) C2JD.A00(userSession)).A0N(str);
    }

    public static C7P8 A0f(C83403nh c83403nh) {
        C28541Zp A00 = C7P5.A00();
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        return A00.A01(c2ey);
    }

    public static IgdsHeadline A0g(View view) {
        View requireViewById = view.requireViewById(R.id.headline);
        C14360o3.A07(requireViewById);
        return (IgdsHeadline) requireViewById;
    }

    public static C677733r A0h(Context context, InterfaceC09390do interfaceC09390do) {
        return new C677733r(context, (UserSession) interfaceC09390do.getValue());
    }

    public static C47Z A0i() {
        return new C47Z(String.valueOf(System.nanoTime()));
    }

    public static InterfaceC19610xo A0j(InterfaceC09390do interfaceC09390do) {
        return ((InterfaceC19630xq) interfaceC09390do.getValue()).ARD();
    }

    public static IgRoomDatabase A0k(C1Ye c1Ye, AbstractC12990ll abstractC12990ll, Class cls) {
        c1Ye.A01();
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) c1Ye.A00();
        abstractC12990ll.A04(cls, igRoomDatabase);
        return igRoomDatabase;
    }

    public static C2F8 A0l(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        return (C2F8) entry.getValue();
    }

    public static IllegalArgumentException A0n(Object obj, StringBuilder sb) {
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static IllegalStateException A0o(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static Long A0q(Number number) {
        return Long.valueOf(TimeUnit.SECONDS.toMillis(number.longValue()));
    }

    public static Object A0s(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 == null) {
            ArrayList arrayList = new ArrayList();
            map.put(obj, arrayList);
            return arrayList;
        }
        return obj2;
    }

    public static String A0t(Resources resources, int i, int i2) {
        return resources.getString(i2, Integer.valueOf(i));
    }

    public static String A0w(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static LinkedHashMap A0y(Map map) {
        return new LinkedHashMap(AbstractC16850sd.A0L(map.size()));
    }

    public static List A0z(int i) {
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static List A10(long j) {
        List singletonList = Collections.singletonList(Long.valueOf(j));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static List A11(Integer num, int i) {
        return AbstractC16960so.A1Q(num, Integer.valueOf(i));
    }

    public static void A14(Context context, Paint paint, int i) {
        paint.setColor(context.getColor(AbstractC53242c7.A0H(context, i)));
    }

    public static void A15(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static void A18(View view, Runnable runnable) {
        view.setBottom(view.getBottom() + C30D.A00);
        AbstractC13880nE.A0s(view, runnable);
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        if (interfaceC02590Ai.isSampled()) {
            interfaceC02590Ai.Cht();
        }
    }

    public static void A1G(InterfaceExecutorC135866Co interfaceExecutorC135866Co, MailboxCallback mailboxCallback, MailboxFutureImpl mailboxFutureImpl) {
        if (!interfaceExecutorC135866Co.ELJ(mailboxCallback)) {
            mailboxFutureImpl.cancel(false);
        }
    }

    public static void A1K(AbstractC129515tG abstractC129515tG, C7ZT c7zt, DirectMessageIdentifier directMessageIdentifier, String str, String str2) {
        c7zt.AFl(str, str2, abstractC129515tG.Ar9().A00, directMessageIdentifier.A00, true);
    }

    public static void A1L(C5SU c5su) {
        c5su.A01();
        c5su.A07(C5SV.A07);
        c5su.A0A = true;
    }

    public static void A1M(InterfaceC19630xq interfaceC19630xq, String str, java.util.Set set) {
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7L(str, set);
        ARD.apply();
    }

    public static void A1Q(Object obj, List list) {
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static void A1S(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(entry.getKey(), entry.getValue());
    }

    public static boolean A1V(Rect rect, MotionEvent motionEvent) {
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public static boolean A1X(C2JM c2jm, String str, String str2) {
        c2jm.A04(str, str2);
        if (str2 == null) {
            return false;
        }
        return true;
    }

    public static boolean A1Z(User user, User user2) {
        return C14360o3.A0K(user.getId(), user2.getId());
    }

    public static boolean A1a(InterfaceC09390do interfaceC09390do) {
        return C6CB.A02(((C6CF) interfaceC09390do.getValue()).A00, 36315928473833250L);
    }

    public static boolean A1b(InterfaceC09390do interfaceC09390do) {
        return C6CB.A02(((C6CF) interfaceC09390do.getValue()).A00, 36315928476258105L);
    }
}
