package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.DnF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31171DnF {
    public static Long A0V(int i) {
        return Long.valueOf(i);
    }

    public static Context A03(C35791FrT c35791FrT) {
        return c35791FrT.A01.requireContext();
    }

    public static Intent A04() {
        return new Intent();
    }

    public static Bundle A05(int i) {
        return new Bundle(i);
    }

    public static View A06(C3OO c3oo) {
        View view = c3oo.itemView;
        C14360o3.A06(view);
        return view;
    }

    public static FragmentActivity A09(Object obj) {
        return ((Fragment) obj).getActivity();
    }

    public static C25531Mh A0A(InterfaceC02590Ai interfaceC02590Ai, int i) {
        return new C25531Mh(interfaceC02590Ai, i);
    }

    public static C3LO A0B() {
        return new C3LO();
    }

    public static IgBloksScreenConfig A0C(AbstractC12990ll abstractC12990ll) {
        return new IgBloksScreenConfig(abstractC12990ll);
    }

    public static C19270xB A0D(String str) {
        return new C19270xB(str);
    }

    public static ViewModelListUpdate A0E() {
        return new ViewModelListUpdate();
    }

    public static AbstractC18680vv A0F(Object obj) {
        return C023409i.A0A.A05(obj);
    }

    public static UserSession A0G(Bundle bundle) {
        return C023409i.A0A.A06(bundle);
    }

    public static C193328hC A0H(Activity activity) {
        return new C193328hC(activity);
    }

    public static C193328hC A0I(Context context) {
        return new C193328hC(context);
    }

    public static C146106i8 A0K() {
        return new C146106i8();
    }

    public static C6XJ A0L(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        return new C6XJ(activity, bundle, abstractC12990ll, cls, str);
    }

    public static C83693oE A0N(String str) {
        return new C83693oE(str);
    }

    public static InterfaceC83713oG A0O(DirectShareTarget directShareTarget) {
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        return interfaceC83713oG;
    }

    public static InterfaceC19610xo A0P(C19740y2 c19740y2) {
        return c19740y2.A00.ARD();
    }

    public static C19740y2 A0Q() {
        return AbstractC19730y1.A00(AbstractC12960li.A00);
    }

    public static SXK A0R(String str) {
        return new SXK(str);
    }

    public static User A0S(C16L c16l, boolean z) {
        Parcelable.Creator creator = User.CREATOR;
        return AbstractC38851rI.A00(c16l, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.6ab] */
    public static C141586ab A0U() {
        C1OU c1ou = C1OU.$redex_init_class;
        return new Object();
    }

    public static Object A0X(Context context) {
        return context.getSystemService("clipboard");
    }

    public static Object A0Y(Object obj, InterfaceC16530ry interfaceC16530ry, C0YR[] c0yrArr, int i) {
        return interfaceC16530ry.CES(obj, c0yrArr[i]);
    }

    public static String A0Z(BaseBundle baseBundle) {
        return baseBundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public static String A0a(BaseBundle baseBundle) {
        return baseBundle.getString("original_url");
    }

    public static String A0b(BaseBundle baseBundle) {
        return baseBundle.getString("collection_id");
    }

    public static String A0d(C31250DoY c31250DoY) {
        return c31250DoY.A08.getModuleName();
    }

    public static String A0e(User user) {
        return user.A03.ByJ();
    }

    public static String A0f(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return "null cannot be cast to non-null type kotlin.String";
    }

    public static String A0g(Object obj) {
        return ((User) obj).getId();
    }

    public static String A0i(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    public static BitSet A0j(int i) {
        return new BitSet(i);
    }

    public static HashSet A0k(Collection collection) {
        return new HashSet(collection);
    }

    public static LinkedHashSet A0l() {
        return new LinkedHashSet();
    }

    public static C008002u A0o() {
        return C10E.A00(C16930sl.A00);
    }

    public static JSONArray A0p() {
        return new JSONArray();
    }

    public static JSONObject A0q() {
        return new JSONObject();
    }

    public static void A0r() {
        C14360o3.A0F("keyboardHeightChangeDetector");
        throw null;
    }

    public static void A0s() {
        C14360o3.A0F("logger");
        throw null;
    }

    public static void A0t() {
        C14360o3.A0F("adapter");
        throw null;
    }

    public static void A0u() {
        C14360o3.A0F("session");
        throw null;
    }

    public static void A0v() {
        C14360o3.A0F("instance");
        throw null;
    }

    public static void A0w() {
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        throw null;
    }

    public static void A0x() {
        C14360o3.A0F("entryPoint");
        throw null;
    }

    public static void A0y() {
        C14360o3.A0F("userSession");
        throw null;
    }

    public static void A0z(int i) {
        C9GR.A07(AbstractC12290kX.A00, i);
    }

    public static void A12(BaseBundle baseBundle, String str) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
    }

    public static void A13(BaseBundle baseBundle, String str) {
        baseBundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
    }

    public static void A14(TextView textView) {
        textView.setText("");
    }

    public static void A15(TextView textView, Object obj) {
        textView.setText((CharSequence) obj);
    }

    public static void A16(Fragment fragment) {
        AbstractC13880nE.A0O(fragment.mView);
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("flow", str);
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("event", str);
    }

    public static void A1C(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("action", str);
    }

    public static void A1D(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("module", str);
    }

    public static void A1E(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("surface", str);
    }

    public static void A1F(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
    }

    public static void A1G(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
    }

    public static void A1H(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("open_thread_id", str);
    }

    public static void A1I(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("container_module", str);
    }

    public static void A1J(AbstractC23721Ec abstractC23721Ec, String str) {
        abstractC23721Ec.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
    }

    public static void A1K(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        C131845xK.A00(c6fq, C6FW.A01, interfaceC103384lE);
    }

    public static void A1L(C32324ELs c32324ELs) {
        c32324ELs.A04.getClass();
    }

    public static void A1M(SpinnerImageView spinnerImageView) {
        spinnerImageView.setLoadingStatus(C3T1.LOADING);
    }

    public static void A1N(Object obj) {
        ((Dialog) obj).dismiss();
    }

    public static void A1O(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type android.app.Activity");
    }

    public static void A1P(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    public static void A1Q(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
    }

    public static void A1R(Object obj, Object obj2) {
        ((C1P1) obj).onSuccess(obj2);
    }

    public static void A1S(Object obj, Object obj2, InterfaceC16530ry interfaceC16530ry, C0YR[] c0yrArr, int i) {
        interfaceC16530ry.Egi(obj, obj2, c0yrArr[i]);
    }

    public static void A1T(Object obj, AbstractMap abstractMap) {
        abstractMap.put("entrypoint", obj);
    }

    public static void A1U(Object obj, AbstractMap abstractMap) {
        abstractMap.put(TraceFieldType.ErrorCode, obj);
    }

    public static boolean A1V(UserSession userSession, Object obj) {
        return C14360o3.A0K(userSession.userId, obj);
    }

    public static boolean A1W(UserSession userSession, Object obj) {
        return C14360o3.A0K(obj, userSession.userId);
    }

    public static boolean A1Y(Object obj) {
        return PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(obj);
    }

    public static boolean A1Z(Object obj) {
        return PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(obj);
    }

    public static boolean A1a(Object obj) {
        return DialogModule.KEY_TITLE.equals(obj);
    }

    public static double A00() {
        return C1Q9.A00();
    }

    public static double A01() {
        return System.currentTimeMillis();
    }

    public static int A02(Resources resources, int i) {
        return (int) resources.getDimension(i);
    }

    public static ViewStub A07(View view, int i) {
        return (ViewStub) view.findViewById(i);
    }

    public static ImageView A08(View view, int i) {
        return (ImageView) view.findViewById(i);
    }

    public static IgdsFaceSwarm A0J(InterfaceC56392iX interfaceC56392iX) {
        return (IgdsFaceSwarm) interfaceC56392iX.getView();
    }

    public static DirectSearchResult A0M(Iterator it) {
        return (DirectSearchResult) it.next();
    }

    public static C17P A0T(UserSession userSession, C08730cb c08730cb) {
        return c08730cb.A01(userSession).A03;
    }

    public static Number A0W(Object obj, AbstractMap abstractMap) {
        return (Number) abstractMap.get(obj);
    }

    public static String A0c(InterfaceC83733oI interfaceC83733oI) {
        return AbstractC1345466e.A01(interfaceC83733oI).A00;
    }

    public static String A0h(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static List A0m(InterfaceC169517hR interfaceC169517hR) {
        return (List) interfaceC169517hR.Bov();
    }

    public static List A0n(InterfaceC09390do interfaceC09390do) {
        return (List) interfaceC09390do.getValue();
    }

    public static void A10(Context context, IgBloksScreenConfig igBloksScreenConfig, int i) {
        igBloksScreenConfig.A0U = context.getString(i);
    }

    public static void A11(Context context, C146106i8 c146106i8, int i) {
        c146106i8.A0I = context.getString(i);
    }

    public static void A17(Fragment fragment, IgBloksScreenConfig igBloksScreenConfig, int i) {
        igBloksScreenConfig.A0U = fragment.getString(i);
    }

    public static void A18(Fragment fragment, C146106i8 c146106i8, int i) {
        c146106i8.A0D = fragment.getString(i);
    }

    public static boolean A1X(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }

    public static boolean A1b(java.util.Set set) {
        return !set.isEmpty();
    }
}
