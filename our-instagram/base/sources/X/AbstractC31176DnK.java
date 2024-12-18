package X;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.DnK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31176DnK {
    public static Context A04(View view) {
        C14360o3.A0B(view, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = view.getContext();
        C14360o3.A07(context);
        return context;
    }

    public static Context A05(Fragment fragment, Object obj) {
        C14360o3.A0B(obj, 0);
        return fragment.requireContext();
    }

    public static View A0A(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C14360o3.A07(inflate);
        return inflate;
    }

    public static C18920wW A0L(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }

    public static C18920wW A0N(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return AbstractC12220kQ.A02(abstractC12990ll);
    }

    public static C1ON A0P(C25621Ms c25621Ms) {
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static C81663kb A0W(C2DU c2du, DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        return C2DU.A03(c2du, directThreadKey);
    }

    public static void A1T(AnonymousClass306 anonymousClass306) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    public static void A1Z(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZB(obj, (InterfaceC23621Ds) null, i), c19l);
    }

    public static boolean A1a(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        return C18U.A06(c06090Tz, abstractC12990ll, j);
    }

    public static int A00(DirectShareTarget directShareTarget) {
        return Collections.unmodifiableList(directShareTarget.A0Q).size();
    }

    public static Intent A06(Context context) {
        return C14H.A03.A00().A01(context);
    }

    public static Bundle A08(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        return bundle;
    }

    public static Bundle A09(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        return bundle;
    }

    public static ViewGroup.LayoutParams A0B(View view) {
        if (view != null) {
            return view.getLayoutParams();
        }
        return null;
    }

    public static AccountFamily A0H(C2049995m c2049995m, UserSession userSession) {
        return (AccountFamily) c2049995m.A02.get(userSession.userId);
    }

    public static C3LO A0I() {
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_x_pano_outline_24;
        return c3lo;
    }

    public static C35788FrQ A0K(Object obj) {
        return (C35788FrQ) ((BusinessConversionActivity) obj).A09.getValue();
    }

    public static C18920wW A0O(AbstractC12990ll abstractC12990ll, String str) {
        return AbstractC12220kQ.A01(new C19270xB(str), abstractC12990ll);
    }

    public static C38321qM A0Y(C16L c16l) {
        return C38321qM.A0h.A0C(c16l, true, false);
    }

    public static C193328hC A0a(Context context, CharSequence charSequence, String str) {
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A05 = str;
        c193328hC.A0r(charSequence);
        return c193328hC;
    }

    public static C6XJ A0d(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, cls, str);
        c6xj.A0J = ModalActivity.A08;
        return c6xj;
    }

    public static String A0m(Fragment fragment) {
        return C16030qx.A02.A05(fragment.getContext());
    }

    public static String A0p(AbstractC12990ll abstractC12990ll, String str) {
        return new W4M(abstractC12990ll).A00(str);
    }

    public static String A0q(UserSession userSession) {
        return C17060sy.A01.A01(userSession).getUsername();
    }

    public static void A0w(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, String str) {
        C6XJ A02 = C6XJ.A02(activity, bundle, abstractC12990ll, TransparentModalActivity.class, str);
        A02.A07();
        A02.A0C(activity);
    }

    public static void A11(Context context, AbstractC12990ll abstractC12990ll, SXK sxk, String str) {
        sxk.A02 = str;
        SimpleWebViewActivity.A00(context, abstractC12990ll, new SimpleWebViewConfig(sxk));
    }

    public static void A19(BaseBundle baseBundle, String str, String str2) {
        baseBundle.putString("args_entry_point", str);
        baseBundle.putString("args_session_id", str2);
    }

    public static void A1B(View.OnClickListener onClickListener, C3LO c3lo, InterfaceC56362iU interfaceC56362iU) {
        c3lo.A0G = onClickListener;
        interfaceC56362iU.AA9(new C3LY(c3lo));
    }

    public static void A1C(View.OnClickListener onClickListener, C3LO c3lo, InterfaceC56362iU interfaceC56362iU) {
        c3lo.A0G = onClickListener;
        interfaceC56362iU.Ehd(new C3LY(c3lo));
    }

    public static void A1H(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("nav_chain", str);
        interfaceC02590Ai.A8R(interfaceC02530Ab, "invite_location");
    }

    public static void A1I(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
        interfaceC02590Ai.Cht();
    }

    public static void A1L(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP("partner_name", str);
        interfaceC02590Ai.AAP("url", str2);
    }

    public static void A1M(AbstractC02600Aj abstractC02600Aj, String str, String str2) {
        abstractC02600Aj.A0R("item_id", str);
        abstractC02600Aj.A0R("client_context_id", str2);
    }

    public static void A1Y(Object obj) {
        ((Fragment) obj).requireActivity().onBackPressed();
    }

    public static int A01(List list, int i) {
        return ((Number) list.get(i)).intValue();
    }

    public static int A02(ListIterator listIterator) {
        return ((String) listIterator.previous()).length();
    }

    public static long A03(C455127l c455127l, Object obj) {
        long A0P = c455127l.A0P();
        C14360o3.A0B(obj, 0);
        return A0P;
    }

    public static Bundle A07(Activity activity) {
        return activity.getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
    }

    public static ViewGroup A0C(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (ViewGroup) requireViewById;
    }

    public static ImageView A0D(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (ImageView) requireViewById;
    }

    public static TextView A0E(View view) {
        return (TextView) view.requireViewById(R.id.subtitle);
    }

    public static RecyclerView A0F(View view) {
        return (RecyclerView) view.requireViewById(R.id.recycler_view);
    }

    public static C2JS A0G(List list) {
        return (C2JS) ((C26079Bg8) AbstractC001800i.A0I(list)).A02;
    }

    public static C56352iT A0J(Fragment fragment) {
        return C56352iT.A0t.A03(fragment.getActivity());
    }

    public static C18920wW A0M(InterfaceC11380iw interfaceC11380iw, InterfaceC09390do interfaceC09390do) {
        return AbstractC12220kQ.A01(interfaceC11380iw, (AbstractC12990ll) interfaceC09390do.getValue());
    }

    public static C25671My A0Q(InterfaceC09390do interfaceC09390do) {
        return AbstractC25651Mw.A00((AbstractC12990ll) interfaceC09390do.getValue());
    }

    public static AbstractC18680vv A0R(Fragment fragment) {
        return (AbstractC18680vv) AbstractC60492pY.A01(fragment).getValue();
    }

    public static UserSession A0S(Fragment fragment) {
        return (UserSession) AbstractC60492pY.A02(fragment).getValue();
    }

    public static IgSimpleImageView A0T(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (IgSimpleImageView) requireViewById;
    }

    public static CircularImageView A0U(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (CircularImageView) requireViewById;
    }

    public static C142846ck A0V(InterfaceC09390do interfaceC09390do) {
        return AbstractC147806l5.A00((UserSession) interfaceC09390do.getValue());
    }

    public static InterfaceC163837Ux A0X(InterfaceC08830cm interfaceC08830cm) {
        return ((C7U0) interfaceC08830cm.get()).C7r();
    }

    public static C1DX A0Z(InterfaceC09390do interfaceC09390do) {
        return C1DW.A00((UserSession) interfaceC09390do.getValue());
    }

    public static C193328hC A0b(Fragment fragment) {
        return new C193328hC((Activity) fragment.requireActivity());
    }

    public static C193328hC A0c(Fragment fragment) {
        return new C193328hC(fragment.getContext());
    }

    public static InterfaceC19610xo A0e(UserSession userSession) {
        return AbstractC23021Ah.A00(userSession).A01.ARD();
    }

    public static GradientSpinnerAvatarView A0f(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C14360o3.A07(requireViewById);
        return (GradientSpinnerAvatarView) requireViewById;
    }

    public static User A0g(C08730cb c08730cb, InterfaceC09390do interfaceC09390do) {
        return c08730cb.A01((UserSession) interfaceC09390do.getValue());
    }

    public static C18A A0h(InterfaceC09390do interfaceC09390do) {
        return AnonymousClass189.A00((UserSession) interfaceC09390do.getValue());
    }

    public static Number A0i(long j) {
        return (Number) AbstractC20100yh.A00(j).getDefaultValue();
    }

    public static Object A0j(Iterator it) {
        return ((Map.Entry) it.next()).getValue();
    }

    public static Object A0k(InterfaceC09390do interfaceC09390do) {
        return ((C2GT) interfaceC09390do.getValue()).A02();
    }

    public static String A0l(android.net.Uri uri, int i) {
        return uri.getPathSegments().get(i);
    }

    public static String A0n(C6FW c6fw, String str) {
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, str);
        return (String) A00;
    }

    public static String A0o(C6FW c6fw, String str, int i) {
        Object A03 = c6fw.A03(i);
        C14360o3.A0C(A03, str);
        return (String) A03;
    }

    public static String A0r(Enum r1) {
        return r1.name().toLowerCase(Locale.US);
    }

    public static String A0s(Iterator it) {
        return ((PendingRecipient) it.next()).getId();
    }

    public static String A0t(List list, int i) {
        return ((User) list.get(i)).getUsername();
    }

    public static String A0u(InterfaceC09390do interfaceC09390do) {
        return ((C1M1) interfaceC09390do.getValue()).getSessionId();
    }

    public static void A0v(Activity activity) {
        Application application = activity.getApplication();
        C14360o3.A07(application);
        AbstractC52232aO.A00(application);
    }

    public static void A0x(Activity activity, Fragment fragment, C3DO c3do) {
        C3DN A00 = c3do.A00(activity);
        if (A00 != null) {
            A00.A0K(fragment);
        }
    }

    public static void A0y(Activity activity, C56342iS c56342iS) {
        c56342iS.A03(activity).setIsLoading(false);
    }

    public static void A0z(Activity activity, C56342iS c56342iS) {
        c56342iS.A03(activity).setIsLoading(true);
    }

    public static void A10(Dialog dialog) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public static void A12(Context context, C3DO c3do) {
        C3DN A01 = c3do.A01(context);
        if (A01 != null) {
            A01.A0B();
        }
    }

    public static void A13(Context context, C6WQ c6wq) {
        c6wq.A00(context.getString(2131965660));
    }

    public static void A14(DialogInterface.OnClickListener onClickListener, C193328hC c193328hC) {
        c193328hC.A0D(onClickListener);
        C0fJ.A00(c193328hC.A02());
    }

    public static void A15(DialogInterface.OnClickListener onClickListener, C193328hC c193328hC) {
        c193328hC.A0F(onClickListener);
        C0fJ.A00(c193328hC.A02());
    }

    public static void A16(DialogInterface.OnClickListener onClickListener, C193328hC c193328hC, int i) {
        c193328hC.A0I(onClickListener, i);
        C0fJ.A00(c193328hC.A02());
    }

    public static void A17(DialogInterface.OnClickListener onClickListener, C193328hC c193328hC, int i) {
        c193328hC.A0J(onClickListener, i);
        C0fJ.A00(c193328hC.A02());
    }

    public static void A18(Intent intent, Fragment fragment) {
        fragment.requireActivity().setResult(-1, intent);
    }

    public static void A1A(Bundle bundle, Fragment fragment, C140966Yy c140966Yy) {
        fragment.setArguments(bundle);
        c140966Yy.A0B(null, fragment);
        c140966Yy.A04();
    }

    public static void A1D(View view, int i) {
        view.requireViewById(i).setVisibility(8);
    }

    public static void A1E(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    public static void A1F(View view, CharSequence charSequence, int i) {
        ((TextView) view.requireViewById(i)).setText(charSequence);
    }

    public static void A1G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void A1J(InterfaceC02590Ai interfaceC02590Ai, double d) {
        interfaceC02590Ai.A8I(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A1K(InterfaceC02590Ai interfaceC02590Ai, double d) {
        interfaceC02590Ai.A8I("current_time", Double.valueOf(d));
    }

    public static void A1N(C0Zx c0Zx, long j) {
        c0Zx.A05("result_index", Long.valueOf(j));
    }

    public static void A1O(C19T c19t, AbstractC23721Ec abstractC23721Ec, C11830jh c11830jh) {
        abstractC23721Ec.A0H("phone_id", c11830jh.A02(c19t));
    }

    public static void A1P(C25621Ms c25621Ms, String str, String str2) {
        c25621Ms.A9s(str, str2);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
    }

    public static void A1Q(AbstractC23721Ec abstractC23721Ec) {
        abstractC23721Ec.A9s("waterfall_id", C1Q9.A01());
    }

    public static void A1R(AbstractC23721Ec abstractC23721Ec, Object obj) {
        abstractC23721Ec.A9s("google_tokens", obj.toString());
    }

    public static void A1S(L5L l5l, int i) {
        l5l.A02 = new C47521Kyo(i, R.id.recycler_view);
    }

    public static void A1U(InterfaceC11380iw interfaceC11380iw, GradientSpinnerAvatarView gradientSpinnerAvatarView, User user) {
        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, user.Bhu());
    }

    public static void A1V(InterfaceC43071ya interfaceC43071ya, C59072n8 c59072n8, C63622uj c63622uj, String str) {
        c59072n8.A00(interfaceC43071ya);
        c63622uj.A01(c59072n8.A01(), str);
    }

    public static void A1W(C193328hC c193328hC) {
        c193328hC.A07();
        C0fJ.A00(c193328hC.A02());
    }

    public static void A1X(InterfaceC19630xq interfaceC19630xq, String str, String str2) {
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7K(str, str2);
        ARD.apply();
    }

    public static boolean A1b(C05A c05a) {
        return ((Boolean) c05a.getValue()).booleanValue();
    }
}
