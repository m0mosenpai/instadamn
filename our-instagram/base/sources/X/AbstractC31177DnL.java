package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.DnL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31177DnL {
    public static double A00(Object obj) {
        C14360o3.A0B(obj, 0);
        return System.currentTimeMillis();
    }

    public static Bundle A0C(Object obj) {
        C14360o3.A0B(obj, 0);
        return new Bundle();
    }

    public static C25621Ms A0M(AbstractC12990ll abstractC12990ll) {
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A06();
        return c25621Ms;
    }

    public static C12210kP A0P(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return new C12210kP(abstractC12990ll);
    }

    public static HashMap A0h() {
        HashMap hashMap = new HashMap();
        new BitSet(0);
        return hashMap;
    }

    public static List A0l(AbstractList abstractList, int i) {
        return abstractList.subList(0, Math.min(i, abstractList.size()));
    }

    public static void A0s(Context context, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public static void A0u(Context context, UserSession userSession, C2Fb c2Fb, String str) {
        new C63397SjR(context, userSession, c2Fb, str, false).A0A();
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, double d, double d2) {
        interfaceC02590Ai.A8I("elapsed_time", Double.valueOf(d - d2));
    }

    public static void A1J(UserSession userSession, NoteBubbleView noteBubbleView) {
        noteBubbleView.A0J(C85363rR.A05(userSession), false, C85363rR.A07(userSession), false);
    }

    public static void A1Q(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new PYZ(obj, null, i), c19l);
    }

    public static boolean A1b(Object obj) {
        return C14360o3.A0K(obj, true);
    }

    public static int A03(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static int A04(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static Intent A08(String str) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        return intent;
    }

    public static Bundle A0B(Fragment fragment) {
        Bundle bundle = fragment.mArguments;
        if (bundle == null) {
            return new Bundle();
        }
        return bundle;
    }

    public static Bundle A0D(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static View A0F(View.OnClickListener onClickListener, C3LO c3lo, InterfaceC56362iU interfaceC56362iU) {
        c3lo.A0G = onClickListener;
        return interfaceC56362iU.AA9(new C3LY(c3lo));
    }

    public static LinearLayoutManager A0J(RecyclerView recyclerView) {
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return (LinearLayoutManager) abstractC70663Fe;
    }

    public static C54s A0K(AbstractC911344p abstractC911344p, C913045j c913045j) {
        C54s c54s = new C54s(c913045j);
        c54s.A0C(abstractC911344p, "server_params");
        return c54s;
    }

    public static C56352iT A0L(Fragment fragment) {
        return C56352iT.A0t.A03(fragment.getActivity());
    }

    public static C140966Yy A0N(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        C3BH.A00().A01();
        return c140966Yy;
    }

    public static C1ON A0Q(C25621Ms c25621Ms) {
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N();
    }

    public static UserSession A0R(Fragment fragment) {
        return C023409i.A0A.A06(fragment.requireArguments());
    }

    public static C189448aO A0X(AbstractC12990ll abstractC12990ll, boolean z) {
        C189448aO c189448aO = new C189448aO(abstractC12990ll);
        c189448aO.A0a = Boolean.valueOf(z);
        return c189448aO;
    }

    public static IllegalStateException A0Y(String str) {
        return new IllegalStateException(AnonymousClass001.A0R("Invalid lifecycleState: ", str));
    }

    public static Long A0Z(String str) {
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static String A0f(InterfaceC83733oI interfaceC83733oI) {
        if (interfaceC83733oI != null) {
            return AbstractC1345466e.A07(interfaceC83733oI);
        }
        return null;
    }

    public static String A0g(String str, int i, int i2) {
        return str.subSequence(i2, i + 1).toString();
    }

    public static List A0j(User user) {
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static void A0n(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, cls, str);
        c6xj.A07();
        c6xj.A0C(activity);
    }

    public static void A0o(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, String str) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, ModalActivity.class, str);
        c6xj.A08();
        c6xj.A0C(activity);
    }

    public static void A0w(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0B(bundle, fragment);
        c140966Yy.A04();
    }

    public static void A15(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0E(fragment);
        c140966Yy.A04();
    }

    public static void A16(Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0D(fragment);
        c140966Yy.A04();
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        interfaceC02590Ai.AAP("action", "tap");
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("event", str);
        interfaceC02590Ai.AAP("surface", "inbox");
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("action", str);
        interfaceC02590Ai.AAP("ig_appid", "567067343352427");
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, str);
        interfaceC02590Ai.AAP("action", "impression");
    }

    public static void A1L(C31349DqE c31349DqE) {
        C41451vu.A01.E4s(new C3KF(c31349DqE));
    }

    public static boolean A1W(AbstractC12990ll abstractC12990ll) {
        CallerContext callerContext = C31238DoL.A00;
        return C18U.A06(C06090Tz.A05, abstractC12990ll, 36313858293631250L);
    }

    public static boolean A1Y(UserDetailFragment userDetailFragment, String str) {
        return str.equals(userDetailFragment.A10.A02());
    }

    public static boolean A1a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int A01(View view, int i) {
        view.requireViewById(i).setVisibility(8);
        return 8;
    }

    public static int A02(Fragment fragment, int i) {
        return fragment.requireContext().getResources().getDimensionPixelSize(i);
    }

    public static long A05() {
        return System.currentTimeMillis() * 1000;
    }

    public static long A06() {
        return System.currentTimeMillis() / 1000;
    }

    public static Intent A07(String str) {
        return new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(str));
    }

    public static Resources A09(Fragment fragment) {
        Resources resources = fragment.requireContext().getResources();
        C14360o3.A07(resources);
        return resources;
    }

    public static Drawable A0A(Context context) {
        return context.getDrawable(AbstractC53242c7.A0H(context, R.attr.presenceBadgeLarge));
    }

    public static LayoutInflater A0E(View view, int i) {
        C14360o3.A0B(view, i);
        return LayoutInflater.from(view.getContext());
    }

    public static ViewGroup.MarginLayoutParams A0G(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static ViewGroup.MarginLayoutParams A0H(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static Fragment A0I(FragmentActivity fragmentActivity) {
        return fragmentActivity.getSupportFragmentManager().A0O(R.id.layout_container_main);
    }

    public static IgBloksScreenConfig A0O(InterfaceC09390do interfaceC09390do) {
        return new IgBloksScreenConfig((AbstractC12990ll) interfaceC09390do.getValue());
    }

    public static UserSession A0S(C6FQ c6fq) {
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        return (UserSession) A0B;
    }

    public static ImageUrl A0T(List list, int i) {
        return ((User) list.get(i)).Bhu();
    }

    public static C57012jc A0U(View view, int i) {
        return new C57012jc((ViewStub) view.requireViewById(i));
    }

    public static C57012jc A0V(View view, int i) {
        return new C57012jc((ViewStub) view.findViewById(i));
    }

    public static C50674MYs A0W(Context context, InterfaceC09390do interfaceC09390do) {
        return new C50674MYs(context, (AbstractC12990ll) interfaceC09390do.getValue());
    }

    public static String A0a(Context context, int i, int i2) {
        return context.getString(i2, Integer.valueOf(i));
    }

    public static String A0b(Context context, Object obj, int i) {
        String string = context.getString(i, obj);
        C14360o3.A07(string);
        return string;
    }

    public static String A0c(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static String A0d(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        return (String) A01;
    }

    public static String A0e(C6FW c6fw, int i) {
        Object A03 = c6fw.A03(i);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        return (String) A03;
    }

    public static Iterator A0i(List list) {
        List unmodifiableList = Collections.unmodifiableList(list);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList.iterator();
    }

    public static List A0k(Iterable iterable, ListIterator listIterator) {
        return AbstractC001800i.A0d(iterable, listIterator.nextIndex() + 1);
    }

    public static void A0m() {
        InterfaceC53722dB A00 = AbstractC54852fj.A00();
        if (A00 != null) {
            A00.EfI(C1QO.A0E);
        }
    }

    public static void A0p(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(C3DY.A00(context.getColor(i)));
    }

    public static void A0q(Context context, TextView textView, int i) {
        textView.setTextColor(context.getColor(AbstractC53242c7.A0H(context, i)));
    }

    public static void A0r(Context context, TextView textView, Object obj, int i) {
        textView.setText(context.getString(i, obj));
    }

    public static void A0t(Context context, AbstractC23721Ec abstractC23721Ec) {
        abstractC23721Ec.A9s(AbstractC31182DnR.A00(), C16030qx.A00(context));
    }

    public static void A0v(Context context, C193328hC c193328hC, Object obj, int i) {
        c193328hC.A0r(context.getString(i, obj));
    }

    public static void A0x(View view, int i, int i2) {
        view.setPadding(i, i2, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A0y(TextView textView, Context context) {
        textView.setTextColor(context.getColor(AbstractC53242c7.A09(context)));
    }

    public static void A0z(TextView textView, Context context) {
        textView.setTextColor(context.getColor(AbstractC53242c7.A07(context)));
    }

    public static void A10(TextView textView, Fragment fragment, Object obj, int i) {
        textView.setText(fragment.getString(i, obj));
    }

    public static void A11(Fragment fragment) {
        fragment.requireActivity().setResult(-1);
    }

    public static void A12(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static void A13(Fragment fragment) {
        fragment.requireActivity().getOnBackPressedDispatcher().A04();
    }

    public static void A14(Fragment fragment, Fragment fragment2, C189448aO c189448aO) {
        c189448aO.A00().A02(fragment.requireActivity(), fragment2);
    }

    public static void A17(Fragment fragment, RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(fragment.getContext()));
    }

    public static void A18(Fragment fragment, C56342iS c56342iS, boolean z) {
        c56342iS.A03(fragment.getActivity()).setIsLoading(z);
    }

    public static void A19(Fragment fragment, C11R c11r) {
        C1GJ.A00(fragment.requireContext(), AbstractC018607g.A00(fragment), c11r);
    }

    public static void A1A(Fragment fragment, C193328hC c193328hC, Object obj, int i) {
        c193328hC.A0r(fragment.getString(i, obj));
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, double d) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.A8I(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A1H(C25531Mh c25531Mh, C142846ck c142846ck, Long l) {
        c25531Mh.A0h(l);
        c25531Mh.A0u(c142846ck.A01);
        c25531Mh.Cht();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zJ, java.lang.Object] */
    public static void A1I(C66392zG c66392zG, AbstractC66422zJ abstractC66422zJ) {
        c66392zG.A01(abstractC66422zJ);
        c66392zG.A01(new Object());
    }

    public static void A1K(InterfaceC38371qR interfaceC38371qR, C37952Gmu c37952Gmu, int i, int i2) {
        c37952Gmu.A01(interfaceC38371qR.BQN());
        c37952Gmu.A09 = i;
        c37952Gmu.A0B = i2;
    }

    public static void A1M(InterfaceC19610xo interfaceC19610xo, String str, String str2, boolean z) {
        interfaceC19610xo.E77(AnonymousClass001.A0R(str, str2), z);
        interfaceC19610xo.apply();
    }

    public static void A1N(InterfaceC19630xq interfaceC19630xq, String str, boolean z) {
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E77(str, z);
        ARD.apply();
    }

    public static void A1O(User user) {
        String username = user.getUsername();
        ImageUrl Bhu = user.Bhu();
        synchronized (C35264Fgy.class) {
            C35264Fgy.A03.A00(username);
            InterfaceC19610xo ARD = C35264Fgy.A00.A00.ARD();
            ARD.E77("did_facebook_sso", false);
            ARD.apply();
            C35264Fgy.A04.A00(Bhu.getUrl());
        }
    }

    public static void A1P(C141586ab c141586ab) {
        c141586ab.A08(UUID.randomUUID().toString());
    }

    public static void A1R(String str, AbstractCollection abstractCollection) {
        abstractCollection.add(Long.valueOf(Long.parseLong(str)));
    }

    public static void A1S(Map.Entry entry, Map map) {
        map.put(entry.getKey(), entry.getValue());
    }

    public static void A1T(InterfaceC09390do interfaceC09390do) {
        ((C155506yf) interfaceC09390do.getValue()).A04("edit_link");
    }

    public static boolean A1U(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, long j) {
        boolean A06 = C18U.A06(c06090Tz, abstractC12990ll, j);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static boolean A1V(C16L c16l, String str) {
        String A0q = c16l.A0q();
        c16l.A1J();
        return str.equals(A0q);
    }

    public static boolean A1X(UserSession userSession) {
        return C83743oJ.A01(userSession).A0K(userSession.userId);
    }

    public static boolean A1Z(C47162Ei c47162Ei) {
        return ((Boolean) c47162Ei.get()).booleanValue();
    }
}
