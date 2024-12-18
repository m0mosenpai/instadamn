package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebookpay.logging.LoggingContext;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.base.CreationSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.io.File;
import java.text.DateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import libraries.access.src.main.base.common.FXAccessLibraryDeviceRequestItem;
import org.json.JSONObject;

/* renamed from: X.JPy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43593JPy {
    public static int A01(int i) {
        return i != 0 ? 0 : 4;
    }

    public static MailboxNullable A0J() {
        return new MailboxNullable(null);
    }

    public static C41871wb A0b(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return AbstractC41851wZ.A00(userSession);
    }

    public static DirectThreadKey A0f(String str) {
        return new DirectThreadKey(str, null);
    }

    public static Object A0s(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        return valueAnimator.getAnimatedValue();
    }

    public static InterfaceC19390xP A15(C12N c12n, InterfaceC19390xP interfaceC19390xP, int i) {
        return AbstractC011604e.A01(c12n.AOT(i, 3), interfaceC19390xP);
    }

    public static C15150pV A16(InterfaceC19390xP interfaceC19390xP, InterfaceC19390xP interfaceC19390xP2, int i) {
        return C10Q.A03(new C57182PaB(i, null), interfaceC19390xP, interfaceC19390xP2);
    }

    public static boolean A1Y(int i) {
        return i == 1;
    }

    public static boolean A1Z(int i, int i2) {
        return i >= i2;
    }

    public static boolean A1b(Object obj) {
        C14360o3.A0B(obj, 3);
        return false;
    }

    public static int A05(JSONObject jSONObject) {
        return jSONObject.optString("__typename").hashCode();
    }

    public static long A06() {
        return new Date().getTime();
    }

    public static long A07() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public static long A09(TimeUnit timeUnit) {
        return timeUnit.toMillis(1L);
    }

    public static LayoutInflater A0C(Context context, LayoutInflater layoutInflater, int i) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(context, i));
    }

    public static C162247Oj A0G(Object obj) {
        return (C162247Oj) C162247Oj.A06.get(obj);
    }

    public static InterfaceExecutorC135866Co A0H(MailboxFeature mailboxFeature) {
        return mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
    }

    public static MailboxFutureImpl A0I(InterfaceExecutorC135866Co interfaceExecutorC135866Co, MailboxCallback mailboxCallback) {
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(interfaceExecutorC135866Co);
        mailboxFutureImpl.Ecq(mailboxCallback);
        return mailboxFutureImpl;
    }

    public static C44543Jmn A0K(AbstractC45465KBa abstractC45465KBa) {
        return (C44543Jmn) abstractC45465KBa.A0T.getValue();
    }

    public static ViewModelListUpdate A0L(List list) {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(list);
        return viewModelListUpdate;
    }

    public static UserSession A0O(Object obj) {
        UserSession userSession = (UserSession) obj;
        C14360o3.A0B(userSession, 0);
        return userSession;
    }

    public static SimpleImageUrl A0Q(String str) {
        return AbstractC81033jX.A01(new File(str));
    }

    public static C44500Jm6 A0S(C45445KAg c45445KAg) {
        return (C44500Jm6) c45445KAg.A05.getValue();
    }

    public static InterfaceC50519MRw A0V(JR2 jr2) {
        return (InterfaceC50519MRw) jr2.A1j.getValue();
    }

    public static C43945Jbu A0W(JR2 jr2) {
        return (C43945Jbu) jr2.A1v.getValue();
    }

    public static Jn0 A0X(KDK kdk) {
        return (Jn0) kdk.A0S.getValue();
    }

    public static C160787Im A0Y(Object obj, Object obj2) {
        C160787Im c160787Im = (C160787Im) obj;
        C14360o3.A0B(obj2, 0);
        return c160787Im;
    }

    public static C83403nh A0a(Object obj) {
        C83403nh c83403nh = (C83403nh) obj;
        C14360o3.A0B(c83403nh, 0);
        return c83403nh;
    }

    public static C43809JYw A0c(JR2 jr2) {
        return (C43809JYw) jr2.A2M.getValue();
    }

    public static C44142Jf7 A0d(JR2 jr2) {
        return (C44142Jf7) jr2.A1n.getValue();
    }

    public static C45999KXn A0e(KCU kcu) {
        return (C45999KXn) kcu.A0p.getValue();
    }

    public static N04 A0k(Object obj) {
        C52000Myq c52000Myq = (C52000Myq) obj;
        C14360o3.A0B(c52000Myq, 0);
        return c52000Myq.A06;
    }

    public static Class A0o(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public static Object A0v(Object obj) {
        return ((AnonymousClass435) ((C3NX) obj).A00).A01;
    }

    public static String A0y(C6FW c6fw, int i) {
        Object A03 = c6fw.A03(i);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        return (String) A03;
    }

    public static String A0z(User user) {
        if (user != null) {
            return user.getUsername();
        }
        return null;
    }

    public static String A10(DateFormat dateFormat, long j) {
        return dateFormat.format(new Date(j));
    }

    public static void A18(Animator animator) {
        animator.setInterpolator(new LinearInterpolator());
    }

    public static void A1A(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public static void A1B(View view, int i) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i));
    }

    public static void A1E(C07X c07x, C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c2gt.A06(c07x, new C65991Txk(i, interfaceC16660sJ));
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, String str) {
        interfaceC02590Ai.AAQ(c0Zx, "event_data");
        interfaceC02590Ai.AAP("avatar_session_id", str);
    }

    public static void A1H(InterfaceC02590Ai interfaceC02590Ai, Long l) {
        interfaceC02590Ai.A9K("consistent_thread_fbid", l);
        interfaceC02590Ai.Cht();
    }

    public static void A1I(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("product", str);
        interfaceC02590Ai.Cht();
    }

    public static void A1J(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("event_name", str);
        interfaceC02590Ai.Cht();
    }

    public static void A1K(InterfaceC02590Ai interfaceC02590Ai, Map map) {
        interfaceC02590Ai.A9M("extra_data", map);
        interfaceC02590Ai.Cht();
    }

    public static void A1M(C25531Mh c25531Mh, Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            c25531Mh.A0w(map);
        }
    }

    public static void A1O(C66362zD c66362zD) {
        c66362zD.A05(new ViewModelListUpdate());
    }

    public static void A1P(UserSession userSession) {
        C50695MZq.A00(userSession, new C52497NKq());
    }

    public static void A1Q(Object obj) {
        ((View) obj).setVisibility(8);
    }

    public static void A1S(Object obj, InterfaceC23621Ds interfaceC23621Ds, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new D4v(obj, interfaceC23621Ds, i), c19l);
    }

    public static void A1T(Object obj, C05A c05a, int i) {
        c05a.Egh(new MU9(obj, i));
    }

    public static void A1U(AbstractCollection abstractCollection, EnumC200808uN enumC200808uN, EnumC46133KbX enumC46133KbX) {
        abstractCollection.add(new FXAccessLibraryDeviceRequestItem(enumC200808uN, enumC46133KbX));
    }

    public static void A1X(InterfaceC16620sF interfaceC16620sF, C19L c19l, InterfaceC19390xP interfaceC19390xP) {
        AbstractC18560vj.A03(c19l, new C15340po(interfaceC16620sF, interfaceC19390xP));
    }

    public static float A00(Object obj, String str) {
        C14360o3.A0C(obj, str);
        return ((Number) obj).floatValue();
    }

    public static int A02(Context context, int i) {
        return C1H4.A01(AbstractC13880nE.A04(context, i));
    }

    public static int A03(Object obj, int i) {
        int A05 = C0f9.A05(i);
        C14360o3.A0B(obj, 0);
        return A05;
    }

    public static int A04(Map.Entry entry) {
        return ((Number) entry.getValue()).intValue();
    }

    public static long A08(C5Y2 c5y2) {
        return ((C119365at) c5y2.getValue()).A00;
    }

    public static BitmapDrawable A0A(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static LayerDrawable A0B(Drawable drawable, Drawable drawable2) {
        return new LayerDrawable(new Drawable[]{drawable, drawable2});
    }

    public static View A0D(AbstractC31469DsD abstractC31469DsD) {
        return (View) abstractC31469DsD.A02();
    }

    public static ViewPropertyAnimator A0E(ViewPropertyAnimator viewPropertyAnimator, float f) {
        return viewPropertyAnimator.scaleX(f).scaleY(f);
    }

    public static C14240no A0F(Fragment fragment) {
        return new C14240no(fragment.getChildFragmentManager());
    }

    public static C42221xC A0M(C6D2 c6d2, C42221xC c42221xC) {
        return c42221xC.A0L(c6d2).A0G();
    }

    public static C42221xC A0N(C42221xC c42221xC, String str) {
        return c42221xC.A0O(AbstractC137146It.A00(str));
    }

    public static UserSession A0P(InterfaceC09390do interfaceC09390do) {
        return ((C6CF) interfaceC09390do.getValue()).A00;
    }

    public static CreationSession A0R(AnonymousClass840 anonymousClass840) {
        return ((MX5) anonymousClass840.A00()).A01;
    }

    public static C22C A0T(InterfaceC09390do interfaceC09390do) {
        return AnonymousClass229.A01((UserSession) interfaceC09390do.getValue());
    }

    public static C2DE A0U(KCM kcm) {
        return LHn.A00(kcm.A0C());
    }

    public static InterfaceC163557Ts A0Z(InterfaceC08830cm interfaceC08830cm) {
        return ((C7U0) interfaceC08830cm.get()).BT6();
    }

    public static ExtendedImageUrl A0g(User user) {
        return new ExtendedImageUrl(user.Bhu());
    }

    public static C47Z A0h(UserSession userSession, String str) {
        return C25A.A00(userSession).A03(str);
    }

    public static C47Z A0i(KCP kcp) {
        return kcp.A06(kcp.requireContext());
    }

    public static C195838lR A0j(ViewGroup viewGroup) {
        return new C195838lR(viewGroup, R.layout.permission_empty_state_view);
    }

    public static C3DN A0l(Fragment fragment, C3DO c3do) {
        return c3do.A00(fragment.getActivity());
    }

    public static C3NX A0m(Object obj, C05A c05a) {
        c05a.Egh(obj);
        return new C3NX(C0eB.A00);
    }

    public static Boolean A0n(Object obj, Object obj2) {
        return Boolean.valueOf(C14360o3.A0K(obj, obj2));
    }

    public static Integer A0p(Cursor cursor, int i) {
        return Integer.valueOf(cursor.getInt(i));
    }

    public static Integer A0q(CQLResultSet cQLResultSet, int i, int i2) {
        return Integer.valueOf(cQLResultSet.getInteger(i, i2));
    }

    public static Integer A0r(String str) {
        return Integer.valueOf(str.hashCode());
    }

    public static Object A0t(AbstractC1345065z abstractC1345065z, Map map, int i) {
        return map.get(abstractC1345065z.A00(i));
    }

    public static Object A0u(MediaCommentListRepository mediaCommentListRepository, Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        Object A09 = MediaCommentListRepository.A09(mediaCommentListRepository, interfaceC23621Ds, interfaceC16660sJ);
        if (A09 != obj) {
            return C0eB.A00;
        }
        return A09;
    }

    public static String A0w() {
        return String.valueOf(C0HN.A00());
    }

    public static String A0x() {
        return String.valueOf(System.nanoTime());
    }

    public static ArrayList A11(Cursor cursor) {
        return new ArrayList(cursor.getCount());
    }

    public static Iterator A12(Map map) {
        return map.keySet().iterator();
    }

    public static LinkedHashMap A13(C05A c05a) {
        return AbstractC06930Yk.A03((Map) c05a.getValue());
    }

    public static C0eB A14(C1YP c1yp, InterfaceC37561ot interfaceC37561ot) {
        interfaceC37561ot.ATb();
        c1yp.setTransactionSuccessful();
        return C0eB.A00;
    }

    public static C19K A17(C12N c12n, int i, int i2) {
        return AnonymousClass194.A02(c12n.AOT(i, i2));
    }

    public static void A19(View view) {
        C14360o3.A0A(view);
        view.setVisibility(8);
    }

    public static void A1C(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void A1D(Fragment fragment, AbstractC016706m abstractC016706m) {
        abstractC016706m.A0A(fragment, R.id.fragment_container);
        abstractC016706m.A00();
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("duration", Long.valueOf(j));
    }

    public static void A1L(C0Zx c0Zx, LoggingContext loggingContext) {
        c0Zx.A02(AbstractC63059Sbg.A00(loggingContext), "logging_policy");
    }

    public static void A1N(C25531Mh c25531Mh, String str) {
        c25531Mh.A0o(str);
        c25531Mh.A0p("thread_view");
    }

    public static void A1R(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (C14360o3.A0K(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A1V(InterfaceC09390do interfaceC09390do) {
        ((Animator) interfaceC09390do.getValue()).cancel();
    }

    public static void A1W(InterfaceC09390do interfaceC09390do, int i) {
        ((View) interfaceC09390do.getValue()).setVisibility(i);
    }

    public static boolean A1a(JR2 jr2) {
        return C2E8.A02(jr2.A0p());
    }
}
