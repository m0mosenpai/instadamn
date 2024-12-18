package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/* renamed from: X.DnH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31173DnH {
    public static int A05(Calendar calendar) {
        return calendar.get(5);
    }

    public static InterfaceC56392iX A0U(View view, int i) {
        return AbstractC56372iV.A01(view.findViewById(i), false, false);
    }

    public static C51693MsO A0a(MUD mud, EnumC33370Ep3 enumC33370Ep3, int i) {
        return new C51693MsO(mud, enumC33370Ep3, null, i);
    }

    public static boolean A1a(CharSequence charSequence, CharSequence charSequence2) {
        return AbstractC001900j.A0a(charSequence, charSequence2, false);
    }

    public static Intent A08(Context context) {
        return new Intent(context, (Class<?>) BusinessConversionActivity.class);
    }

    public static C25621Ms A0M(AbstractC12990ll abstractC12990ll) {
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
        c25621Ms.A05();
        return c25621Ms;
    }

    public static C25621Ms A0N(AbstractC12990ll abstractC12990ll) {
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
        c25621Ms.A06();
        return c25621Ms;
    }

    public static C140966Yy A0O(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0B(bundle, fragment);
        return c140966Yy;
    }

    public static C140966Yy A0P(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, abstractC12990ll);
        c140966Yy.A0F = true;
        return c140966Yy;
    }

    public static C41761wQ A0S() {
        return new C41761wQ(AbstractC142856cl.A01);
    }

    public static C146106i8 A0X(CharSequence charSequence) {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0D = charSequence;
        return c146106i8;
    }

    public static C6XJ A0Z(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, cls, str);
        c6xj.A07();
        return c6xj;
    }

    public static IllegalStateException A0f() {
        return new IllegalStateException("Missing Required Props");
    }

    public static void A14(Context context, IgBloksScreenConfig igBloksScreenConfig, C66277U6x c66277U6x) {
        igBloksScreenConfig.A0P = C05F.A01;
        c66277U6x.A04(context, igBloksScreenConfig);
    }

    public static void A18(Intent intent, UserSession userSession) {
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
    }

    public static void A1B(BaseBundle baseBundle) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", "IgSessionManager.LOGGED_OUT_TOKEN");
    }

    public static void A1C(BaseBundle baseBundle, UserSession userSession) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
    }

    public static void A1N(C25621Ms c25621Ms) {
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
    }

    public static void A1P(AbstractC23721Ec abstractC23721Ec, String str, String str2) {
        abstractC23721Ec.A0E = str;
        abstractC23721Ec.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
    }

    public static String[] A1b(List list, int i) {
        return (String[]) list.toArray(new String[i]);
    }

    public static float A00(Context context, int i) {
        return context.getResources().getDimension(i);
    }

    public static int A01(Context context) {
        return context.getColor(AbstractC53242c7.A0C(context));
    }

    public static int A02(Context context) {
        return context.getColor(R.color.badge_color);
    }

    public static int A03(Context context, Context context2, int i) {
        return context2.getColor(AbstractC53242c7.A0H(context, i));
    }

    public static int A04(Fragment fragment) {
        return AbstractC53242c7.A07(fragment.getContext());
    }

    public static Context A06(View view, int i) {
        C14360o3.A0B(view, i);
        return view.getContext();
    }

    public static Context A07(Fragment fragment, Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        return fragment.requireContext();
    }

    public static Intent A09(Intent intent, android.net.Uri uri) {
        Intent data = intent.setData(uri);
        C14360o3.A07(data);
        return data;
    }

    public static Bundle A0A(Activity activity) {
        return activity.getIntent().getExtras();
    }

    public static Spanned A0B(Resources resources, String str, int i) {
        return AbstractC07900bA.A01(resources, new String[]{str}, i);
    }

    public static View A0C(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C14360o3.A0A(inflate);
        return inflate;
    }

    public static View A0D(View view, int i) {
        View findViewById = view.findViewById(i);
        findViewById.getClass();
        return findViewById;
    }

    public static View A0E(ViewStub viewStub, int i) {
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    public static ViewGroup A0F(View view, int i) {
        return (ViewGroup) view.requireViewById(i);
    }

    public static ViewStub A0G(View view, int i) {
        return (ViewStub) view.requireViewById(i);
    }

    public static EditText A0H(View view, int i) {
        return (EditText) view.requireViewById(i);
    }

    public static ImageView A0I(View view, int i) {
        return (ImageView) view.requireViewById(i);
    }

    public static FragmentActivity A0J(Bundle bundle, Fragment fragment, Fragment fragment2) {
        fragment.setArguments(bundle);
        return fragment2.requireActivity();
    }

    public static C07X A0K(Fragment fragment, C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        AbstractC23641Du.A05(c12w, interfaceC16620sF, c19l);
        return fragment.getViewLifecycleOwner();
    }

    public static ImmutableList A0L(Collection collection) {
        ImmutableList copyOf = ImmutableList.copyOf(collection);
        C14360o3.A07(copyOf);
        return copyOf;
    }

    public static C18920wW A0Q(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Object obj, int i) {
        C14360o3.A0B(obj, i);
        return AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }

    public static C66362zD A0R(C66392zG c66392zG, AbstractC66422zJ abstractC66422zJ) {
        c66392zG.A01(abstractC66422zJ);
        return c66392zG.A00();
    }

    public static CircularImageView A0T(View view, int i) {
        return (CircularImageView) view.requireViewById(i);
    }

    public static WGA A0V(Fragment fragment) {
        return ((MediaMapFragment) fragment.requireParentFragment()).A0F;
    }

    public static IgdsButton A0W(View view, int i) {
        return (IgdsButton) view.requireViewById(i);
    }

    public static IgdsListCell A0Y(View view, int i) {
        return (IgdsListCell) view.requireViewById(i);
    }

    public static C54392et A0b(UserSession userSession) {
        return AbstractC54332en.A00(userSession).A00();
    }

    public static InterfaceC19610xo A0c(C1AU c1au, C1AV c1av) {
        return c1au.A03(c1av).ARD();
    }

    public static Boolean A0d(InterfaceC02590Ai interfaceC02590Ai, Boolean bool, String str, boolean z) {
        interfaceC02590Ai.A7v(str, bool);
        return Boolean.valueOf(z);
    }

    public static Boolean A0e(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, boolean z) {
        interfaceC02590Ai.AAP(str, str2);
        return Boolean.valueOf(z);
    }

    public static Long A0g() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static Long A0h(C16L c16l) {
        return Long.valueOf(c16l.A0y());
    }

    public static Object A0i(AbstractList abstractList, int i) {
        Object obj = abstractList.get(i);
        C14360o3.A07(obj);
        return obj;
    }

    public static String A0j(BaseBundle baseBundle, String str) {
        String string = baseBundle.getString(str);
        string.getClass();
        return string;
    }

    public static String A0k(Bundle bundle, String str) {
        String string = bundle.getString(str);
        AbstractC153636vY.A03(bundle, string, str);
        return string;
    }

    public static String A0l(Fragment fragment) {
        return C16030qx.A00(fragment.getContext());
    }

    public static String A0m(Fragment fragment) {
        return fragment.getString(2131972429);
    }

    public static String A0n(UserSession userSession, C08730cb c08730cb) {
        return c08730cb.A01(userSession).getUsername();
    }

    public static String A0o(DirectShareTarget directShareTarget) {
        String A09 = directShareTarget.A09();
        C14360o3.A07(A09);
        return A09;
    }

    public static String A0p(C47P c47p) {
        return c47p.CDj().getId();
    }

    public static String A0q(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0r(String str, Object obj, Object obj2, Object obj3) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, obj, obj2, obj3);
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static String A0s(List list, int i) {
        return (String) list.get(i);
    }

    public static String A0t(InterfaceC09390do interfaceC09390do) {
        return ((UserSession) interfaceC09390do.getValue()).userId;
    }

    public static void A0u() {
        AbstractC155756z4.A00().A01();
    }

    public static void A0v(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        C6XJ.A02(activity, bundle, abstractC12990ll, cls, str).A0C(activity);
    }

    public static void A0w(Activity activity, Fragment fragment, C189448aO c189448aO) {
        c189448aO.A00().A02(activity, fragment);
    }

    public static void A0x(ClipboardManager clipboardManager, CharSequence charSequence, CharSequence charSequence2) {
        clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
    }

    public static void A0y(Context context, Drawable drawable, int i) {
        drawable.setTint(context.getColor(i));
    }

    public static void A0z(Context context, View view, int i) {
        view.setBackground(context.getDrawable(i));
    }

    public static void A10(Context context, ViewGroup.LayoutParams layoutParams, int i) {
        layoutParams.height = (int) AbstractC13880nE.A04(context, i);
    }

    public static void A11(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(context.getColor(i));
    }

    public static void A12(Context context, TextView textView, int i) {
        textView.setText(context.getText(i));
    }

    public static void A13(Context context, Fragment fragment, int i) {
        C9GR.A09(context, fragment.getString(i));
    }

    public static void A15(Context context, C193328hC c193328hC, int i) {
        c193328hC.A0j(context.getDrawable(i));
    }

    public static void A16(Context context, C193328hC c193328hC, int i) {
        c193328hC.A0r(context.getString(i));
    }

    public static void A17(Context context, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(context.getString(i));
    }

    public static void A19(Resources resources, TextView textView, int i) {
        textView.setText(resources.getString(i));
    }

    public static void A1A(android.net.Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putString(str, uri.getQueryParameter(str));
    }

    public static void A1D(TextWatcher textWatcher, IgFormField igFormField) {
        igFormField.getMEditText().removeTextChangedListener(textWatcher);
    }

    public static void A1E(View view, Fragment fragment, int i) {
        view.setContentDescription(fragment.getString(i));
    }

    public static void A1F(TextView textView, User user) {
        textView.setText(user.getUsername());
    }

    public static void A1G(Fragment fragment, Fragment fragment2, C189478aR c189478aR) {
        c189478aR.A02(fragment.requireActivity(), fragment2);
    }

    public static void A1H(Fragment fragment, C64P c64p, int i) {
        c64p.setPrimaryActionText(fragment.getString(i));
    }

    public static void A1I(Fragment fragment, C6XJ c6xj) {
        c6xj.A0C(fragment.requireContext());
    }

    public static void A1J(FragmentActivity fragmentActivity, C116875Qr c116875Qr, UserSession userSession) {
        AbstractC86593tX.A0X(fragmentActivity, c116875Qr.A00(), userSession);
    }

    public static void A1K(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(AbstractC31688Dvt.A00(), str);
    }

    public static void A1L(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(AbstractC31670Dva.A00(), str);
    }

    public static void A1M(AbstractC04050Jw abstractC04050Jw, GraphQlCallInput graphQlCallInput, String str) {
        graphQlCallInput.A02().A0E(abstractC04050Jw, str);
    }

    public static void A1O(AbstractC23721Ec abstractC23721Ec, String str) {
        abstractC23721Ec.A9s(AbstractC31189DnY.A02(), str);
    }

    public static void A1Q(AbstractC23721Ec abstractC23721Ec, String str, Object[] objArr) {
        abstractC23721Ec.A0B(AbstractC13670mt.A06(str, objArr));
    }

    public static void A1R(C2US c2us, InterfaceC65642y0 interfaceC65642y0) {
        c2us.init(interfaceC65642y0);
    }

    public static void A1S(C19280xC c19280xC, AbstractC12990ll abstractC12990ll) {
        AbstractC11060iN.A00(abstractC12990ll).EHW(c19280xC);
    }

    public static void A1T(InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, User user) {
        igImageView.setUrl(user.Bhu(), interfaceC11380iw);
    }

    public static void A1U(UserSession userSession, C1OW c1ow) {
        C26141Ov.A01(userSession).A0B(c1ow);
    }

    public static void A1V(C81663kb c81663kb, C2DS c2ds) {
        c2ds.FCS(c81663kb.BKb());
    }

    public static void A1W(MediaMapQuery mediaMapQuery, WGA wga, MediaMapPin mediaMapPin, String str) {
        WGA.A00(mediaMapQuery, wga, mediaMapPin, str).Cht();
    }

    public static void A1X(User user, AbstractCollection abstractCollection) {
        abstractCollection.add(user.getId());
    }

    public static void A1Y(Object obj, AbstractMap abstractMap, boolean z) {
        abstractMap.put(obj, Boolean.valueOf(z));
    }

    public static void A1Z(String str, String str2, String str3) {
        C0w9.A03(str3, AnonymousClass001.A0R(str, str2));
    }
}
