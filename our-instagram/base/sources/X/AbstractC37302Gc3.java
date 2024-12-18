package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ImmutablePandoSubscriptionStickerDict;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gc3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37302Gc3 {
    public static int A00() {
        return AbstractC16960so.A1R(null, null, null).size();
    }

    public static C141796aw A08(AbstractC52922bZ abstractC52922bZ, Object obj) {
        C14360o3.A0B(obj, 0);
        return AbstractC141776au.A00(abstractC52922bZ);
    }

    public static C1DY A0C(int i) {
        return new C1DY((C1DV) new C37761pD(null), i, false);
    }

    public static Long A0V(String str) {
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static Long A0W(String str) {
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static String A0a(UserSession userSession, C38321qM c38321qM) {
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            return A2E.getId();
        }
        return null;
    }

    public static LinkedHashMap A0i(Object obj) {
        C14360o3.A0B(obj, 0);
        return new LinkedHashMap();
    }

    public static void A0n() {
        new C1DY((C1DV) new C37761pD(null), 6, false);
    }

    public static void A1N(AbstractC153666vb abstractC153666vb) {
        abstractC153666vb.A04(null, null, C16930sl.A00, false);
    }

    public static void A1O(InterfaceC11380iw interfaceC11380iw, C82713mZ c82713mZ, C3YO c3yo) {
        c82713mZ.A88 = c3yo.A04(interfaceC11380iw, null);
        c82713mZ.A0V(c3yo.A03(interfaceC11380iw));
    }

    public static void A1U(Object obj, Object obj2) {
        C14360o3.A0B(obj, 3);
        C14360o3.A0B(obj2, 4);
    }

    public static void A1W(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZS(obj, null, i), c19l);
    }

    public static int A01(int i) {
        int A0L = AbstractC16850sd.A0L(i);
        if (A0L < 16) {
            return 16;
        }
        return A0L;
    }

    public static int A02(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public static long A03(int i) {
        if (i != 0) {
            return 1L;
        }
        return 0L;
    }

    public static long A04(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return -1L;
    }

    public static Resources A05(C3OO c3oo) {
        Context context = c3oo.itemView.getContext();
        C14360o3.A07(context);
        return context.getResources();
    }

    public static TreeUpdaterJNI A0B(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        if (productDetailsProductItemDictIntf != null) {
            return productDetailsProductItemDictIntf.F7o();
        }
        return null;
    }

    public static SubscriptionStickerDictIntf A0E(C1DY c1dy, SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf != null) {
            subscriptionStickerDictIntf.EAt(c1dy);
            return subscriptionStickerDictIntf;
        }
        return null;
    }

    public static SubscriptionStickerDictIntf A0F(SubscriptionStickerDictIntf subscriptionStickerDictIntf, C17T c17t) {
        if (subscriptionStickerDictIntf == null) {
            return (SubscriptionStickerDictIntf) c17t.A06(ImmutablePandoSubscriptionStickerDict.class);
        }
        return subscriptionStickerDictIntf;
    }

    public static C120985dq A0G(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        return (C120985dq) c206239Bg.A03;
    }

    public static C18920wW A0H(InterfaceC11380iw interfaceC11380iw, C12210kP c12210kP) {
        c12210kP.A00 = interfaceC11380iw;
        c12210kP.A01(C12180kM.A02);
        return c12210kP.A00();
    }

    public static C18920wW A0I(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A00 = interfaceC11380iw;
        return c12210kP.A00();
    }

    public static User A0P(C1DY c1dy, C17T c17t, int i) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) c17t.A04(i, ImmutablePandoUserDict.class);
        Parcelable.Creator creator = User.CREATOR;
        return AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
    }

    public static C28091Xn A0Q(UserSession userSession) {
        return C28071Xl.A00(userSession.deviceSession.A06(), userSession);
    }

    public static Long A0T() {
        return -1L;
    }

    public static Object A0X(View view) {
        if (view != null) {
            return view.getTag();
        }
        return null;
    }

    public static String A0b(C38321qM c38321qM) {
        if (c38321qM != null) {
            return c38321qM.A0C.BJN();
        }
        return null;
    }

    public static String A0c(C38321qM c38321qM) {
        return AbstractC82563mK.A06(c38321qM.A0C.BJN());
    }

    public static String A0d(Product product) {
        User user = product.A0B;
        if (user != null) {
            return AbstractC76433bn.A00(user);
        }
        return null;
    }

    public static String A0e(User user) {
        if (user != null) {
            return AbstractC76433bn.A00(user);
        }
        return null;
    }

    public static C17050sx A0m(Object obj, int i) {
        return AbstractC09440dt.A01(new MHO(obj, i));
    }

    public static void A0s(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "audio_type");
        interfaceC02590Ai.AAP("audio_sub_type", str);
    }

    public static void A0t(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("nav_chain", C1QM.A00.A02.A00);
    }

    public static void A0u(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, String str) {
        c0Zx.A06("shopping_session_id", str);
        interfaceC02590Ai.AAQ(c0Zx, "navigation_info");
    }

    public static void A0y(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM) {
        interfaceC02590Ai.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM) {
        interfaceC02590Ai.AAP("mezql_token", c38321qM.A0C.getMezqlToken());
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP("question_id", str);
        interfaceC02590Ai.AAP("answer_id", str2);
    }

    public static void A13(AnonymousClass182 anonymousClass182, StickerTraySurface stickerTraySurface) {
        if (stickerTraySurface != null) {
            anonymousClass182.A0S("surface", stickerTraySurface.A00);
        }
    }

    public static void A14(AnonymousClass182 anonymousClass182, SubscriptionStickerDict subscriptionStickerDict) {
        if (subscriptionStickerDict != null) {
            anonymousClass182.A0r("subscription_sticker");
            ADI.A00(anonymousClass182, subscriptionStickerDict);
        }
    }

    public static void A15(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0Q("is_hidden", number.intValue());
        }
    }

    public static void A16(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0Q("is_pinned", number.intValue());
        }
    }

    public static void A17(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0Q("is_sticker", number.intValue());
        }
    }

    public static void A18(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0Q("is_fb_sticker", number.intValue());
        }
    }

    public static void A19(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0Q("sticker_style_enum", number.intValue());
        }
    }

    public static void A1A(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P("x", number.floatValue());
        }
    }

    public static void A1B(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P("y", number.floatValue());
        }
    }

    public static void A1C(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P("z", number.floatValue());
        }
    }

    public static void A1D(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, number.floatValue());
        }
    }

    public static void A1E(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, number.floatValue());
        }
    }

    public static void A1F(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P("rotation", number.floatValue());
        }
    }

    public static void A1G(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P("end_time_ms", number.floatValue());
        }
    }

    public static void A1H(AnonymousClass182 anonymousClass182, Number number) {
        if (number != null) {
            anonymousClass182.A0P("start_time_ms", number.floatValue());
        }
    }

    public static void A1M(C25621Ms c25621Ms, UserSession userSession, Class cls) {
        c25621Ms.A02 = new C25581Mo(new C07510aQ(userSession), cls);
    }

    public static void A1R(C82713mZ c82713mZ) {
        String str = C1QM.A00.A02.A00;
        if (str != null) {
            c82713mZ.A6C = str;
        }
    }

    public static void A1S(C82713mZ c82713mZ, C1PZ c1pz) {
        c82713mZ.A06(c1pz.A01);
        c82713mZ.A0A(c1pz.A04);
    }

    public static void A1T(User user, Map map) {
        if (user != null) {
            map.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user.A07());
        }
    }

    public static boolean A1a(AbstractC12990ll abstractC12990ll) {
        return C18U.A06(C06090Tz.A05, abstractC12990ll, 36311822478869276L);
    }

    public static boolean A1b(C38321qM c38321qM) {
        return AbstractC92574Cr.A03(c38321qM.A0C.getClipsMetadata());
    }

    public static TextView A06(InterfaceC09390do interfaceC09390do) {
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        return (TextView) value;
    }

    public static C57312k6 A07(Fragment fragment) {
        return AbstractC57302k5.A00(fragment.getViewLifecycleOwner().getLifecycle());
    }

    public static InterfaceC02590Ai A09(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        return A01.A00(A01.A00, "instagram_thumbnail_impression");
    }

    public static InterfaceC02590Ai A0A(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        return A01.A00(A01.A00, "instagram_clips_viewer_link_tap");
    }

    public static C111074zO A0D(C125895me c125895me, boolean z) {
        C125905mf A00 = c125895me.A00(z);
        A00.A00 = null;
        return A00.A00();
    }

    public static C1BX A0J(UserSession userSession) {
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx);
        return c1bx;
    }

    public static IgImageView A0K(View view, int i) {
        View findViewById = view.findViewById(i);
        C14360o3.A07(findViewById);
        return (IgImageView) findViewById;
    }

    public static C154796xU A0L(Context context, C07X c07x, UserSession userSession) {
        return new C154796xU(context, AbstractC018607g.A00(c07x), userSession);
    }

    public static C82713mZ A0M(InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        return new C82713mZ(interfaceC60442pS, AnonymousClass001.A0R(str, str2));
    }

    public static C37783Gjy A0N(C2GT c2gt) {
        Object A02 = c2gt.A02();
        C14360o3.A0A(A02);
        return (C37783Gjy) A02;
    }

    public static EnumC64262vl A0O(C38321qM c38321qM) {
        if (c38321qM.CdW()) {
            return EnumC64262vl.A05;
        }
        return EnumC64262vl.A04;
    }

    public static C64092vU A0R(AbstractC12990ll abstractC12990ll) {
        return new C64092vU(AbstractC11060iN.A00(abstractC12990ll), false);
    }

    public static Long A0U(C38321qM c38321qM) {
        return Long.valueOf(c38321qM.BRp().A00);
    }

    public static Object A0Y(InterfaceC09390do interfaceC09390do, int i) {
        return ((List) interfaceC09390do.getValue()).get(i);
    }

    public static String A0Z(FBProductItemDetailsDict fBProductItemDetailsDict) {
        String productId = fBProductItemDetailsDict.getProductId();
        if (productId == null) {
            return "";
        }
        return productId;
    }

    public static String A0f(Object obj) {
        return String.valueOf(obj.toString().hashCode());
    }

    public static String A0g(Iterator it) {
        return ((C38321qM) it.next()).getId();
    }

    public static Iterator A0h(Parcel parcel, java.util.Set set) {
        parcel.writeInt(set.size());
        return set.iterator();
    }

    public static Map A0j(InterfaceC02590Ai interfaceC02590Ai, Object obj, String str, String str2, AbstractMap abstractMap) {
        interfaceC02590Ai.AAP(str, str2);
        return (Map) abstractMap.get(obj);
    }

    public static Map A0k(String str, InterfaceC09390do interfaceC09390do) {
        return ((InterfaceC85683rx) interfaceC09390do.getValue()).Bbk(str);
    }

    public static C09530e4 A0l(Object obj, Map map) {
        return new C09530e4(obj, map.get(obj));
    }

    public static void A0o(Context context, View view, Object obj, int i) {
        view.setContentDescription(context.getString(i, obj));
    }

    public static void A0p(Parcel parcel, Iterator it) {
        parcel.writeString((String) it.next());
    }

    public static void A0q(SpannableStringBuilder spannableStringBuilder, Object obj, int i) {
        spannableStringBuilder.setSpan(obj, i, spannableStringBuilder.length(), 33);
    }

    public static void A0r(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void A0v(InterfaceC02590Ai interfaceC02590Ai, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf) {
        interfaceC02590Ai.AAP("trigger_type", intentAwareAdsInfoIntf.CB4());
    }

    public static void A0w(InterfaceC02590Ai interfaceC02590Ai, C19260xA c19260xA, String str) {
        String A05 = c19260xA.A05(str);
        if (A05 != null) {
            interfaceC02590Ai.AAP(str, A05);
        }
    }

    public static void A0x(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM) {
        interfaceC02590Ai.AAP("m_pk", c38321qM.getId());
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, Product product) {
        interfaceC02590Ai.A7v("is_checkout_enabled", Boolean.valueOf(product.A04()));
    }

    public static void A12(C0f5 c0f5, String str, String str2) {
        c0f5.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0R(str, str2));
        c0f5.report();
    }

    public static void A1I(C16L c16l, AbstractCollection abstractCollection) {
        AndroidLinkImpl parseFromJson = AbstractC87683va.parseFromJson(c16l);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1J(C16L c16l, AbstractCollection abstractCollection) {
        C38321qM A00 = C38321qM.A00(c16l);
        if (A00 != null) {
            abstractCollection.add(A00);
        }
    }

    public static void A1K(C16L c16l, AbstractCollection abstractCollection) {
        C111034zF parseFromJson = AbstractC111024zE.parseFromJson(c16l);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1L(C16L c16l, AbstractCollection abstractCollection) {
        ProductDetailsProductItemDict parseFromJson = AbstractC111134zU.parseFromJson(c16l);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1P(UserSession userSession) {
        C41711wL.A01(userSession).A0C(3);
    }

    public static void A1Q(AbstractC65332xV abstractC65332xV, List list) {
        abstractC65332xV.A01 = Collections.unmodifiableList(list);
        AbstractC65332xV.A00(abstractC65332xV);
    }

    public static void A1V(Object obj, Map map) {
        map.put("x", AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1X(String str, Map map, InterfaceC09390do interfaceC09390do) {
        map.putAll(((InterfaceC126055mz) interfaceC09390do.getValue()).AUc(str));
    }

    public static void A1Y(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C4SX) it.next()).A00);
    }

    public static void A1Z(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((InterfaceC106374qr) it.next()).Eqe());
    }

    public static Double A0S(double d) {
        return Double.valueOf(d / 1000.0d);
    }
}
