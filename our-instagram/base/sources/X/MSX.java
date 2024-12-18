package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spanned;
import android.util.JsonWriter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
public abstract class MSX {
    public static BHS A0G(int i) {
        return new BHS(new Object[0], i);
    }

    public static C14090nZ A0J(C12N c12n, int i) {
        return c12n.CPG(i, 3);
    }

    public static C8TG A0M() {
        return new C8TG(-1);
    }

    public static C06160Ug A0r(InterfaceC15070pN interfaceC15070pN) {
        return new C06160Ug(null, interfaceC15070pN);
    }

    public static void A0y(PointF pointF, float[] fArr) {
        fArr[0] = pointF.x;
        fArr[1] = pointF.y;
    }

    public static int A01(Context context) {
        return (int) AbstractC13880nE.A04(context, 12);
    }

    public static int A04(C44428Jkf c44428Jkf) {
        InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        return interfaceC50490MQs.BF3();
    }

    public static Bundle A08(UserSession userSession) {
        Bundle bundle = new Bundle();
        AbstractC60492pY.A04(bundle, userSession);
        return bundle;
    }

    public static FilterModel A0C(FilterChain filterChain, int i) {
        return (FilterModel) filterChain.A01.get(i);
    }

    public static AbstractC115105If A0E(Object obj) {
        return (AbstractC115105If) ((C194848jk) obj).A00;
    }

    public static AnonymousClass841 A0L(MediaCaptureActivity mediaCaptureActivity) {
        AnonymousClass841 anonymousClass841 = mediaCaptureActivity.A09.A00;
        anonymousClass841.getClass();
        return anonymousClass841;
    }

    public static ClipsCreationViewModel A0N(MYT myt) {
        return (ClipsCreationViewModel) myt.A0Q.getValue();
    }

    public static C87J A0P(C87H c87h) {
        return (C87J) c87h.A0G.A02();
    }

    public static ActivityFeedViewModel A0S(MUI mui) {
        return (ActivityFeedViewModel) mui.A0L.getValue();
    }

    public static C52000Myq A0T(Object obj) {
        C52000Myq c52000Myq = (C52000Myq) obj;
        C14360o3.A0B(c52000Myq, 0);
        return c52000Myq;
    }

    public static C51709Mse A0U(IgLiveBroadcastInfoManager igLiveBroadcastInfoManager) {
        return (C51709Mse) igLiveBroadcastInfoManager.A06.getValue();
    }

    public static C51652Mrj A0V(IgLiveHeartbeatManager igLiveHeartbeatManager) {
        return (C51652Mrj) igLiveHeartbeatManager.A08.getValue();
    }

    public static IgLiveModerationRepository A0W(AbstractC147826l7 abstractC147826l7) {
        return (IgLiveModerationRepository) abstractC147826l7.A0A.getValue();
    }

    public static Gt6 A0X(C52161N6n c52161N6n) {
        return (Gt6) c52161N6n.A0K.getValue();
    }

    public static Integer A0Y(int i) {
        if (i != 0) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    public static Integer A0Z(int i) {
        if (i != 0) {
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static Object A0b(Object obj) {
        if (obj != C1JX.A02) {
            return C0eB.A00;
        }
        return obj;
    }

    public static String A0f(C22M c22m) {
        String str = c22m.A0L;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0g(C105824pt c105824pt) {
        User user = c105824pt.A09;
        user.getClass();
        return user.getId();
    }

    public static String A0j(Object obj, InterfaceC16530ry interfaceC16530ry, C0YR[] c0yrArr, int i) {
        return (String) interfaceC16530ry.CES(obj, c0yrArr[i]);
    }

    public static String A0k(String str, String str2) {
        return AnonymousClass001.A0S(str, str2, '/');
    }

    public static C24721Ip A0q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        return new C24721Ip(C3JM.A00);
    }

    public static void A12(View view, int i) {
        AbstractC010103p.A0B(view, new C50825MdI(i));
    }

    public static void A1A(C2GT c2gt, Object obj) {
        c2gt.A0B(new C8A8(obj));
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(EnumC50631MWs.A0I, "surface");
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("view_mode", "host");
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(EnumC114925Hg.FEED, "camera_destination");
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, C22M c22m) {
        interfaceC02590Ai.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, C22M c22m) {
        interfaceC02590Ai.A8R(c22m.A0A, "media_type");
    }

    public static void A1J(AbstractC23721Ec abstractC23721Ec, String str, String str2) {
        abstractC23721Ec.A9s("product", str);
        abstractC23721Ec.A9s("browse_session_id", str2);
    }

    public static void A1L(C187358Sd c187358Sd, int i) {
        c187358Sd.A0G(new C8TF(i));
    }

    public static void A1M(C187358Sd c187358Sd, boolean z) {
        c187358Sd.A0G(new C187508Ss(z));
    }

    public static void A1P(Throwable th) {
        C0K8.A0F("SuccessResponse", "json serialization error", th);
    }

    public static void A1R(Calendar calendar, long j) {
        calendar.setTime(new Date(j));
    }

    public static boolean A1T(int i, boolean z) {
        if ((i & 1) != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1X(Object obj) {
        return !((Collection) obj).isEmpty();
    }

    public static float A00(float f, View view) {
        return f / view.getHeight();
    }

    public static int A02(Context context) {
        return context.getColor(R.color.fds_transparent);
    }

    public static int A03(Fragment fragment) {
        return AbstractC13880nE.A0A(fragment.requireContext());
    }

    public static int A05(Number number) {
        C14360o3.A0A(number);
        return number.intValue();
    }

    public static Application A06(Activity activity) {
        Application application = activity.getApplication();
        C14360o3.A07(application);
        return application;
    }

    public static Drawable A07(Context context, Number number) {
        return context.getDrawable(number.intValue());
    }

    public static Spanned A09(Resources resources, Object obj, int i) {
        return AbstractC07900bA.A00(resources, new Object[]{obj}, i);
    }

    public static ViewPropertyAnimator A0A(View view, float f) {
        return view.animate().alpha(f);
    }

    public static C141796aw A0B(AbstractC52922bZ abstractC52922bZ, Object obj, int i) {
        C14360o3.A0B(obj, i);
        return AbstractC141776au.A00(abstractC52922bZ);
    }

    public static ImmutableList A0D(C2JS c2js, Class cls, String str, int i, int i2) {
        ImmutableList requiredCompactedTreeListField = c2js.getRequiredCompactedTreeListField(i, str, cls, i2);
        C14360o3.A07(requiredCompactedTreeListField);
        return requiredCompactedTreeListField;
    }

    public static C25671My A0F(NMX nmx) {
        return AbstractC25651Mw.A00(nmx.A0G());
    }

    public static UserSession A0H(N6J n6j, int i) {
        UserSession A0S = n6j.A0S();
        C14360o3.A0B(A0S, i);
        return A0S;
    }

    public static IgSimpleImageView A0I(View view, int i) {
        return (IgSimpleImageView) view.requireViewById(i);
    }

    public static C22C A0K(N6J n6j) {
        return AnonymousClass229.A01(n6j.A0S());
    }

    public static C115525Km A0O(Iterator it) {
        return ((C115475Kh) it.next()).A0G;
    }

    public static C130135uJ A0Q(UserSession userSession) {
        return C131975xX.A00(userSession).A04();
    }

    public static C54987OTv A0R(InterfaceC09390do interfaceC09390do) {
        return ((C50995Mg2) interfaceC09390do.getValue()).A01;
    }

    public static Long A0a(InterfaceC02590Ai interfaceC02590Ai, Long l, String str, int i) {
        interfaceC02590Ai.A9K(str, l);
        return Long.valueOf(i);
    }

    public static String A0c(Activity activity) {
        return activity.getIntent().getAction();
    }

    public static String A0d(C2JS c2js, String str, int i) {
        String requiredStringField = c2js.getRequiredStringField(i, str);
        C14360o3.A07(requiredStringField);
        return requiredStringField;
    }

    public static String A0e(AnonymousClass182 anonymousClass182, Object obj) {
        anonymousClass182.close();
        return obj.toString();
    }

    public static String A0h(File file) {
        String absolutePath = file.getAbsolutePath();
        C14360o3.A07(absolutePath);
        return absolutePath;
    }

    public static String A0i(File file) {
        String canonicalPath = file.getCanonicalPath();
        C14360o3.A07(canonicalPath);
        return canonicalPath;
    }

    public static String A0l(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static ArrayList A0m(String str) {
        return AbstractC16960so.A1M(str);
    }

    public static Iterator A0n(AnonymousClass841 anonymousClass841) {
        return anonymousClass841.CpK().iterator();
    }

    public static Iterator A0o(C47Z c47z) {
        return c47z.A0K().iterator();
    }

    public static ReentrantReadWriteLock.WriteLock A0p(ReentrantReadWriteLock reentrantReadWriteLock) {
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        return writeLock;
    }

    public static C008002u A0s(boolean z) {
        return C10E.A00(Boolean.valueOf(z));
    }

    public static void A0t() {
        AbstractC151756sL.A00().A03();
    }

    public static void A0u(int i, List list) {
        list.add(Integer.valueOf(i));
    }

    public static void A0v(Context context, int i) {
        C9GR.A09(context, context.getString(i));
    }

    public static void A0w(Context context, C6WQ c6wq, int i) {
        c6wq.A00(context.getString(i));
    }

    public static void A0x(Resources resources, TextView textView, Object[] objArr, int i) {
        textView.setText(AbstractC07900bA.A00(resources, objArr, i));
    }

    public static void A0z(JsonWriter jsonWriter, String str, String str2) {
        jsonWriter.name(str).value(str2);
    }

    public static void A10(View view) {
        view.animate().cancel();
    }

    public static void A11(View view) {
        C14360o3.A07(view.getContext());
    }

    public static void A13(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
    }

    public static void A14(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
        viewPropertyAnimator.withEndAction(runnable).start();
    }

    public static void A15(TextView textView, int i) {
        textView.setText(String.valueOf(i));
    }

    public static void A16(Fragment fragment, C3I9 c3i9) {
        c3i9.Dnr(fragment.requireActivity());
    }

    public static void A17(Fragment fragment, C3I9 c3i9) {
        c3i9.Dnr(fragment.getActivity());
    }

    public static void A18(Fragment fragment, C6XJ c6xj) {
        c6xj.A0C(fragment.getActivity());
    }

    public static void A19(C2GT c2gt, int i) {
        c2gt.A0B(Integer.valueOf(i));
    }

    public static void A1B(C2GT c2gt, boolean z) {
        c2gt.A0B(Boolean.valueOf(z));
    }

    public static void A1H(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(AbstractC50532MSl.A00(), str);
    }

    public static void A1I(C82I c82i, boolean z) {
        c82i.A09(Boolean.valueOf(z));
    }

    public static void A1K(C24Q c24q, String str, String str2, long j) {
        c24q.A0C(AnonymousClass001.A0R(str, str2), j);
    }

    public static void A1N(Object obj, AbstractMap abstractMap, long j) {
        abstractMap.put(obj, Long.valueOf(j));
    }

    public static void A1O(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(", height=");
    }

    public static void A1Q(AbstractCollection abstractCollection, float f) {
        abstractCollection.add(Float.valueOf(f));
    }

    public static void A1S(C05A c05a, int i) {
        c05a.Egh(Integer.valueOf(i));
    }

    public static boolean A1U(CallerContext callerContext, C196058lv c196058lv) {
        return C196068lw.A02(c196058lv.A00(callerContext));
    }

    public static boolean A1V(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A00(followersShareFragment).CPp();
    }

    public static boolean A1W(NMX nmx) {
        return NMX.A01(nmx).A06();
    }

    public static boolean A1Y(Object obj, InterfaceC09390do interfaceC09390do) {
        return obj.equals(interfaceC09390do.getValue());
    }

    public static boolean A1Z(Object obj, C05A c05a) {
        return c05a.AIi(c05a.getValue(), obj);
    }

    public static Integer[] A1a(Integer num, Integer num2, Integer num3, int i) {
        return new Integer[]{num, num2, num3, Integer.valueOf(i)};
    }

    public static Object[] A1b(Object obj, Object obj2, int i) {
        return Arrays.copyOf(new Object[]{obj, obj2}, i);
    }
}
