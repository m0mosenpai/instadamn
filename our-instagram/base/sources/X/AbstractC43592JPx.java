package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.util.NotificationScope;
import com.facebook.notifications.constants.push.NotificationType;
import com.google.common.collect.ImmutableCollection;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.JPx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43592JPx {
    public static float A00(int i, float f, float f2, float f3) {
        if (i != 0) {
            return (f - f2) / f3;
        }
        return 0.0f;
    }

    public static C3P9 A0U(View view) {
        C3P9 c3p9 = new C3P9(view);
        c3p9.A06 = false;
        return c3p9;
    }

    public static C14090nZ A0W(C12N c12n, int i) {
        return c12n.AOT(i, 3);
    }

    public static boolean A1X(View view) {
        return view.canScrollVertically(-1);
    }

    public static boolean A1Y(Object obj) {
        C14360o3.A0B(obj, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return false;
    }

    public static float[] A1b() {
        return new float[2];
    }

    public static int A02(AbstractC1351869s abstractC1351869s) {
        return abstractC1351869s.mResultSet.getCount();
    }

    public static Canvas A06(Bitmap bitmap) {
        return new Canvas(bitmap);
    }

    public static SpannableString A07(CharSequence charSequence) {
        return new SpannableString(charSequence);
    }

    public static C07T A0A(Object obj) {
        return ((C07X) obj).getLifecycle();
    }

    public static InterfaceExecutorC135866Co A0C(MailboxFeature mailboxFeature, int i) {
        return mailboxFeature.mMailboxApiHandleMetaProvider.ASj(i);
    }

    public static MailboxFutureImpl A0D(InterfaceExecutorC135866Co interfaceExecutorC135866Co) {
        return new MailboxFutureImpl(interfaceExecutorC135866Co);
    }

    public static NotificationType A0G(String str, int i) {
        return new NotificationType(str, i);
    }

    public static TES A0J(RYn rYn) {
        return new TES(rYn);
    }

    public static C006802i A0N() {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        return c006802i;
    }

    public static C42221xC A0R(C42221xC c42221xC) {
        return c42221xC.A0O(AbstractC142856cl.A01);
    }

    public static C44529JmZ A0Z(KCP kcp) {
        return (C44529JmZ) kcp.A0P.getValue();
    }

    public static C7QX A0d(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C83403nh c83403nh) {
        return C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10);
    }

    public static InterfaceC99334d2 A0h(C38321qM c38321qM) {
        return c38321qM.A0C.C6Y();
    }

    public static C194848jk A0p(Object obj) {
        return new C194848jk(obj);
    }

    public static Float A0q() {
        return new Float(1.0f);
    }

    public static Integer A0r(int i) {
        return new Integer(i);
    }

    public static String A0v(AbstractC1351869s abstractC1351869s, int i, int i2) {
        return abstractC1351869s.mResultSet.getString(i, i2);
    }

    public static String A10(String str, String str2) {
        return AnonymousClass001.A0T(str, str2, ' ');
    }

    public static UnsupportedOperationException A11() {
        return new UnsupportedOperationException();
    }

    public static C43783JXw A18(Object obj, int i) {
        return new C43783JXw(obj, i);
    }

    public static void A1A(Animator animator) {
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A1B(Animator animator) {
        animator.setInterpolator(new DecelerateInterpolator());
    }

    public static void A1E(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A1H(View view, int i, int i2) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
    }

    public static void A1K(Fragment fragment, EnumC46208Kck enumC46208Kck, C2DE c2de) {
        c2de.Crr(new Bundle(), fragment, enumC46208Kck);
    }

    public static void A1L(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx) {
        interfaceC02590Ai.AAQ(c0Zx, "poll");
        interfaceC02590Ai.Cht();
    }

    public static void A1M(AbstractC02600Aj abstractC02600Aj, C0Zx c0Zx) {
        abstractC02600Aj.A0N(c0Zx, "event_payload");
    }

    public static void A1N(C0Zx c0Zx, String str) {
        c0Zx.A06("view_name", str);
    }

    public static void A1P(NotificationScope notificationScope, Object obj, String str) {
        ((MailboxFutureImpl) obj).setNotification(str, notificationScope);
    }

    public static void A1S(SpinnerImageView spinnerImageView) {
        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
    }

    public static void A1T(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static void A1U(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    public static boolean A1Z(Object obj, Object obj2) {
        return C14360o3.A0K(((C6C9) obj).A0H, obj2);
    }

    public static int A01(Context context, int i) {
        return Math.round(AbstractC13880nE.A04(context, i));
    }

    public static int A03(Number number, int i) {
        C14360o3.A0B(number, i);
        return number.intValue();
    }

    public static int A04(String str) {
        C14360o3.A07(str);
        return str.length();
    }

    public static long A05(String str) {
        C14360o3.A07(str);
        return Long.parseLong(str);
    }

    public static View A08(Activity activity) {
        return activity.getWindow().getDecorView();
    }

    public static View A09(Iterator it) {
        return (View) it.next();
    }

    public static RecyclerView A0B(View view, int i) {
        return (RecyclerView) view.findViewById(i);
    }

    public static C124935ky A0E(AccountSession accountSession) {
        return (C124935ky) accountSession.getNotificationCenterCallbackManager();
    }

    public static TraceInfo A0F(MailboxCallback mailboxCallback, MailboxFutureImpl mailboxFutureImpl, String str, String str2) {
        TraceInfo A01 = AbstractC1346866s.A01(mailboxFutureImpl, str, str2);
        mailboxFutureImpl.Ecq(mailboxCallback);
        return A01;
    }

    public static Wap A0H() {
        return C2FP.A01().A04;
    }

    public static C1LC A0I(ImmutableCollection immutableCollection) {
        C1LC it = immutableCollection.iterator();
        C14360o3.A07(it);
        return it;
    }

    public static RYn A0K(AbstractC60877RXa abstractC60877RXa) {
        abstractC60877RXa.A04();
        return abstractC60877RXa.A00;
    }

    public static RYn A0L(AbstractC60877RXa abstractC60877RXa) {
        RYn A02 = abstractC60877RXa.A02();
        C14360o3.A07(A02);
        return A02;
    }

    public static C148236lt A0M(InterfaceC09390do interfaceC09390do) {
        return (C148236lt) interfaceC09390do.getValue();
    }

    public static C25671My A0O(InterfaceC09390do interfaceC09390do) {
        return (C25671My) interfaceC09390do.getValue();
    }

    public static Medium A0P(Iterator it) {
        return ((GalleryItem) it.next()).A00;
    }

    public static C42221xC A0Q(C6D2 c6d2, C42221xC c42221xC) {
        return c42221xC.A0K(c6d2).A0C();
    }

    public static UserSession A0S(JR2 jr2, int i) {
        UserSession A0p = jr2.A0p();
        C14360o3.A0B(A0p, i);
        return A0p;
    }

    public static UserSession A0T(C45466KBb c45466KBb, int i) {
        UserSession A0j = c45466KBb.A0j();
        C14360o3.A0B(A0j, i);
        return A0j;
    }

    public static IgImageView A0V(InterfaceC09390do interfaceC09390do) {
        return (IgImageView) interfaceC09390do.getValue();
    }

    public static C8OS A0X(C0UO c0uo) {
        return (C8OS) c0uo.getValue();
    }

    public static C148286ly A0Y(Iterator it) {
        return (C148286ly) it.next();
    }

    public static SupplementMessagePayload A0a(TransportPayload transportPayload) {
        SupplementMessagePayload A0M = transportPayload.A0M();
        C14360o3.A07(A0M);
        return A0M;
    }

    public static AbstractC2056898s A0b(InterfaceC09390do interfaceC09390do) {
        return (AbstractC2056898s) interfaceC09390do.getValue();
    }

    public static Jn4 A0c(InterfaceC09390do interfaceC09390do) {
        return (Jn4) interfaceC09390do.getValue();
    }

    public static C83403nh A0e(Iterator it) {
        return (C83403nh) it.next();
    }

    public static C43809JYw A0f(InterfaceC09390do interfaceC09390do) {
        return (C43809JYw) interfaceC09390do.getValue();
    }

    public static C2DU A0g(JR2 jr2) {
        return (C2DU) jr2.A0w();
    }

    public static LLR A0i(InterfaceC09390do interfaceC09390do) {
        return (LLR) interfaceC09390do.getValue();
    }

    public static C45128JyU A0j(Iterator it) {
        return (C45128JyU) it.next();
    }

    public static JQC A0k(InterfaceC09390do interfaceC09390do) {
        return (JQC) interfaceC09390do.getValue();
    }

    public static C47Z A0l(Iterator it) {
        return (C47Z) it.next();
    }

    public static InterfaceC02900Bo A0m(AbstractC12990ll abstractC12990ll, Object obj) {
        C14360o3.A07(obj);
        return C0BQ.A00(abstractC12990ll);
    }

    public static AbstractC125325le A0n(View view) {
        AbstractC125325le A00 = AbstractC125325le.A00(view);
        A00.A0G();
        return A00;
    }

    public static AbstractC125325le A0o(View view, int i) {
        AbstractC125325le A01 = AbstractC125325le.A01(view, i);
        A01.A0G();
        return A01;
    }

    public static Integer A0s(List list) {
        return Integer.valueOf(list.size());
    }

    public static Number A0t(InterfaceC09390do interfaceC09390do) {
        return (Number) interfaceC09390do.getValue();
    }

    public static String A0u(AbstractC1345065z abstractC1345065z, int i) {
        return (String) abstractC1345065z.A00(i);
    }

    public static String A0w(ImageUrl imageUrl) {
        String url = imageUrl.getUrl();
        C14360o3.A07(url);
        return url;
    }

    public static String A0x(File file) {
        String path = file.getPath();
        C14360o3.A07(path);
        return path;
    }

    public static String A0y(Number number) {
        return String.valueOf(number.longValue());
    }

    public static String A0z(String str, int i) {
        String substring = str.substring(i);
        C14360o3.A07(substring);
        return substring;
    }

    public static List A12(Object obj, Map map) {
        return (List) map.get(obj);
    }

    public static List A13(String str, String str2) {
        return AbstractC16960so.A1Q(str, str2);
    }

    public static ListIterator A14(List list) {
        return list.listIterator(list.size());
    }

    public static Map A15(C05A c05a) {
        return (Map) c05a.getValue();
    }

    public static java.util.Set A16(Object obj) {
        java.util.Set singleton = Collections.singleton(obj);
        C14360o3.A07(singleton);
        return singleton;
    }

    public static C09530e4 A17(Iterator it) {
        return (C09530e4) it.next();
    }

    public static void A19(int i, InterfaceC16660sJ interfaceC16660sJ) {
        interfaceC16660sJ.invoke(Integer.valueOf(i));
    }

    public static void A1C(Activity activity, InterfaceC23471Cj interfaceC23471Cj, String str) {
        AbstractC23451Ch.A04(activity, interfaceC23471Cj, str);
    }

    public static void A1D(Context context, C193328hC c193328hC, int i) {
        c193328hC.A0k(context.getDrawable(i));
    }

    public static void A1F(View view, int i) {
        view.getLayoutParams().height = i;
    }

    public static void A1G(View view, int i) {
        view.getLayoutParams().width = i;
    }

    public static void A1I(View view, int i, int i2) {
        view.findViewById(i).setVisibility(i2);
    }

    public static void A1J(EditText editText) {
        editText.setSelection(editText.length());
    }

    public static void A1O(C0CA c0ca, GraphQlCallInput graphQlCallInput, String str) {
        c0ca.A0E(graphQlCallInput.A02(), str);
    }

    public static void A1Q(P4U p4u, Long l, String str, String str2, String str3) {
        P4U.A00(p4u, l, str, str2, str3).Cht();
    }

    public static void A1R(AbstractC2056898s abstractC2056898s, String str, String str2) {
        abstractC2056898s.A07(str, str2);
        abstractC2056898s.A04(C05F.A01);
    }

    public static void A1V(Object obj, long j, Map map) {
        map.put(obj, Long.valueOf(j));
    }

    public static void A1W(Object obj, Map map, boolean z) {
        map.put(obj, Boolean.valueOf(z));
    }

    public static boolean A1a(String str, int i, String str2) {
        C14360o3.A0B(str, i);
        return str2.startsWith(str);
    }
}
