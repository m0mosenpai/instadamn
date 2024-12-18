package X;

import android.os.BaseBundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.widget.ListView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gc1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37300Gc1 {
    public static SpannableStringBuilder A01() {
        return new SpannableStringBuilder();
    }

    public static TreeUpdaterJNI A05(String str, Map map) {
        return new TreeUpdaterJNI(str, map);
    }

    public static ClipsMidCardSubtype A06(String str, String str2, int i) {
        return new ClipsMidCardSubtype(str, i, str2);
    }

    public static MultiAuthorStoryType A07(String str, String str2, int i) {
        return new MultiAuthorStoryType(str, i, str2);
    }

    public static SellerShoppableFeedType A08(User user) {
        return user.A03.Bt7();
    }

    public static ShowreelNativeClientName A09(String str, int i) {
        return new ShowreelNativeClientName(str, i, str);
    }

    public static C11520jB A0B() {
        return new C11520jB();
    }

    public static C38321qM A0E(C3XG c3xg) {
        return C3XH.A02(c3xg.A05);
    }

    public static InterfaceC39541sb A0F(C38321qM c38321qM) {
        return c38321qM.A0C.getInjected();
    }

    public static C1571273r A0J() {
        return new C1571273r();
    }

    public static ImmutablePandoUserDict A0K(C17T c17t, int i) {
        return (ImmutablePandoUserDict) c17t.A05(i, ImmutablePandoUserDict.class);
    }

    public static User A0N(C1DY c1dy, ImmutablePandoUserDict immutablePandoUserDict) {
        Parcelable.Creator creator = User.CREATOR;
        return AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
    }

    public static StringWriter A0O() {
        return new StringWriter();
    }

    public static String A0S(C38321qM c38321qM) {
        return c38321qM.A0C.BJN();
    }

    public static String A0T(Product product) {
        return AbstractC76433bn.A00(product.A0B);
    }

    public static String A0U(User user) {
        return user.A03.getUsername();
    }

    public static String A0V(Object obj) {
        return ((C38321qM) obj).getId();
    }

    public static String A0W(Object obj) {
        return ((InterfaceC11380iw) obj).getModuleName();
    }

    public static LinkedHashMap A0X() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new LinkedHashMap();
    }

    public static List A0Y(C38321qM c38321qM) {
        return c38321qM.A0C.AmB();
    }

    public static void A0Z() {
        C11T.A06("This operation must be run on UI thread.");
    }

    public static void A0a() {
        C14360o3.A0F("grid");
        throw null;
    }

    public static void A0b() {
        C14360o3.A0F("feedNetworkSource");
        throw null;
    }

    public static void A0c(BaseBundle baseBundle, String str) {
        baseBundle.putString("prior_module_name", str);
    }

    public static void A0e(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "action");
    }

    public static void A0f(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx) {
        interfaceC02590Ai.AAQ(c0Zx, "navigation_info");
    }

    public static void A0g(InterfaceC02590Ai interfaceC02590Ai, Long l) {
        interfaceC02590Ai.A9K("ad_id", l);
    }

    public static void A0h(InterfaceC02590Ai interfaceC02590Ai, Long l) {
        interfaceC02590Ai.A9K("media_id", l);
    }

    public static void A0i(InterfaceC02590Ai interfaceC02590Ai, Long l) {
        interfaceC02590Ai.A9K("product_id", l);
    }

    public static void A0j(InterfaceC02590Ai interfaceC02590Ai, Long l) {
        interfaceC02590Ai.A9K("container_id", l);
    }

    public static void A0k(InterfaceC02590Ai interfaceC02590Ai, Long l) {
        interfaceC02590Ai.A9K("media_author_id", l);
    }

    public static void A0l(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("m_pk", str);
    }

    public static void A0m(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("submodule", str);
    }

    public static void A0n(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("prior_module", str);
    }

    public static void A0o(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("tracking_token", str);
    }

    public static void A0p(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("media_tap_token", str);
    }

    public static void A0q(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("prior_submodule", str);
    }

    public static void A0r(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("chaining_session_id", str);
    }

    public static void A0s(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("checkout_session_id", str);
    }

    public static void A0t(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("shopping_session_id", str);
    }

    public static void A0u(InterfaceC02590Ai interfaceC02590Ai, Map map) {
        interfaceC02590Ai.A9M("extra_data", map);
    }

    public static void A0v(C0Zx c0Zx, String str) {
        c0Zx.A06("prior_module", str);
    }

    public static void A0w(C0Zx c0Zx, String str) {
        c0Zx.A06("prior_submodule", str);
    }

    public static void A0y(AbstractC23721Ec abstractC23721Ec, String str) {
        abstractC23721Ec.A9s("container_module", str);
    }

    public static void A12(Object obj, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, obj);
    }

    public static void A13(Object obj, Map map) {
        map.put("url", obj);
    }

    public static void A14(Object obj, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj);
    }

    public static void A15(Object obj, Map map) {
        map.put("text", obj);
    }

    public static void A16(Object obj, Map map) {
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj);
    }

    public static void A17(Object obj, Map map) {
        map.put(DialogModule.KEY_TITLE, obj);
    }

    public static void A18(Object obj, Map map) {
        map.put("media_id", obj);
    }

    public static void A19(Object obj, Map map) {
        map.put("media_type", obj);
    }

    public static boolean A1A(Object obj) {
        return "x".equals(obj);
    }

    public static boolean A1B(Object obj) {
        return "y".equals(obj);
    }

    public static boolean A1C(Object obj) {
        return "url".equals(obj);
    }

    public static boolean A1D(Object obj) {
        return "text".equals(obj);
    }

    public static boolean A1E(Object obj) {
        return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(obj);
    }

    public static boolean A1F(Object obj) {
        return "media".equals(obj);
    }

    public static boolean A1G(Object obj) {
        return IgReactMediaPickerNativeModule.WIDTH.equals(obj);
    }

    public static boolean A1H(Object obj) {
        return IgReactMediaPickerNativeModule.HEIGHT.equals(obj);
    }

    public static boolean A1I(Object obj) {
        return "surface".equals(obj);
    }

    public static boolean A1J(Object obj) {
        return "media_id".equals(obj);
    }

    public static boolean A1K(Object obj) {
        return "rotation".equals(obj);
    }

    public static boolean A1L(Object obj) {
        return "subtitle".equals(obj);
    }

    public static boolean A1M(Object obj) {
        return "is_hidden".equals(obj);
    }

    public static boolean A1N(Object obj) {
        return "is_pinned".equals(obj);
    }

    public static boolean A1O(Object obj) {
        return "media_type".equals(obj);
    }

    public static boolean A1P(Object obj) {
        return "is_sticker".equals(obj);
    }

    public static boolean A1Q(Object obj) {
        return DevServerEntity.COLUMN_DESCRIPTION.equals(obj);
    }

    public static boolean A1R(Object obj) {
        return "end_time_ms".equals(obj);
    }

    public static boolean A1S(Object obj) {
        return "next_max_id".equals(obj);
    }

    public static boolean A1T(Object obj) {
        return "display_type".equals(obj);
    }

    public static boolean A1U(Object obj) {
        return "is_fb_sticker".equals(obj);
    }

    public static boolean A1V(Object obj) {
        return "start_time_ms".equals(obj);
    }

    public static boolean A1W(Object obj) {
        return "more_available".equals(obj);
    }

    public static boolean A1X(Object obj) {
        return "tracking_token".equals(obj);
    }

    public static boolean A1Y(Object obj) {
        return "attribution_url".equals(obj);
    }

    public static boolean A1Z(Object obj) {
        return "custom_text_color".equals(obj);
    }

    public static boolean A1a(Object obj) {
        return "sticker_style_enum".equals(obj);
    }

    public static boolean A1b(Object obj) {
        return "subscription_sticker".equals(obj);
    }

    public static long A00(long j) {
        return System.currentTimeMillis() - j;
    }

    public static ListView A02(AbstractC05560Rg abstractC05560Rg) {
        AbstractC05560Rg.A00(abstractC05560Rg);
        return abstractC05560Rg.A04;
    }

    public static C3OO A03(Object obj, String str) {
        C14360o3.A0C(obj, str);
        return (C3OO) obj;
    }

    public static C38688GzT A04(C05A c05a) {
        return (C38688GzT) c05a.getValue();
    }

    public static C120985dq A0A(Iterator it) {
        return (C120985dq) it.next();
    }

    public static C18920wW A0C(InterfaceC09390do interfaceC09390do) {
        return (C18920wW) interfaceC09390do.getValue();
    }

    public static C3XG A0D(Iterator it) {
        return (C3XG) it.next();
    }

    public static C1563470e A0G(UserSession userSession) {
        return C70Y.A00(userSession).A07;
    }

    public static LightboxArguments A0H(InterfaceC09390do interfaceC09390do) {
        return (LightboxArguments) interfaceC09390do.getValue();
    }

    public static J1L A0I(InterfaceC09390do interfaceC09390do) {
        return (J1L) interfaceC09390do.getValue();
    }

    public static Product A0L(Iterator it) {
        return (Product) it.next();
    }

    public static User A0M(C1DY c1dy, C17M c17m) {
        return (User) c1dy.A00(c17m);
    }

    public static Boolean A0P(InterfaceC02590Ai interfaceC02590Ai, Long l, String str, boolean z) {
        interfaceC02590Ai.A9K(str, l);
        return Boolean.valueOf(z);
    }

    public static Number A0Q(Object obj, Map map) {
        return (Number) map.get(obj);
    }

    public static String A0R(C11500j9 c11500j9, C11520jB c11520jB) {
        return (String) c11520jB.A01(c11500j9);
    }

    public static void A0d(TextView textView, boolean z) {
        textView.getPaint().setFakeBoldText(z);
    }

    public static void A0x(AnonymousClass182 anonymousClass182, User user, String str) {
        anonymousClass182.A0r(str);
        Parcelable.Creator creator = User.CREATOR;
        AbstractC38851rI.A08(anonymousClass182, user);
    }

    public static void A0z(C11500j9 c11500j9, C11520jB c11520jB, boolean z) {
        c11520jB.A04(c11500j9, Boolean.valueOf(z));
    }

    public static void A10(UserSession userSession, C82713mZ c82713mZ) {
        c82713mZ.A4Y = C32V.A00(userSession);
    }

    public static void A11(InterfaceC61432r6 interfaceC61432r6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        interfaceC61432r6.DVi(C6T5.A00(), anonymousClass317, obj, obj2);
    }
}
