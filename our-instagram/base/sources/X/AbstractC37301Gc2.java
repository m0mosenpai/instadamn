package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.pendingmedia.model.SimpleUserStoryTarget;
import com.instagram.reels.store.ReelStore;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gc2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37301Gc2 {
    public static int A00(C1DV c1dv) {
        new C1DY(c1dv, 6, false);
        return 6;
    }

    public static C37761pD A08() {
        return new C37761pD(null);
    }

    public static SubscriptionStickerDict A09(C1DY c1dy, SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf != null) {
            return subscriptionStickerDictIntf.F2W(c1dy);
        }
        return null;
    }

    public static C69749Vuj A0C(int i) {
        return new C69749Vuj(new Object[0], i);
    }

    public static InterfaceC56392iX A0D(View view, int i) {
        return AbstractC56372iV.A01(view.requireViewById(i), false, false);
    }

    public static C57112jm A0E() {
        return AbstractC57052jg.A01(null, AbstractC57052jg.A00());
    }

    public static C38321qM A0G(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return c120985dq.A02;
    }

    public static C38C A0L(Fragment fragment) {
        return new C38C(fragment, -1);
    }

    public static Integer A0b(C102884kP c102884kP, int i) {
        return Integer.valueOf(c102884kP.A03(i, 0));
    }

    public static String A0h(C38321qM c38321qM) {
        if (c38321qM != null) {
            return c38321qM.getId();
        }
        return null;
    }

    public static String A0o(User user) {
        if (user != null) {
            return AbstractC76433bn.A00(user);
        }
        return null;
    }

    public static void A0t(Context context, AbstractC23721Ec abstractC23721Ec, UserSession userSession) {
        AbstractC23841Er.A00(context, abstractC23721Ec, userSession, new C1CM(context), false);
    }

    public static void A0v(View view, C57112jm c57112jm, InterfaceC60062oo interfaceC60062oo) {
        c57112jm.A08(view, C71163Hc.A00(interfaceC60062oo), new InterfaceC57142jp[0]);
    }

    public static void A1P(ShoppingCartFragment shoppingCartFragment, User user, String str) {
        ShoppingCartFragment.A02(shoppingCartFragment, user, null, str, false);
    }

    public static Context A03(C3OO c3oo) {
        Context context = c3oo.itemView.getContext();
        C14360o3.A07(context);
        return context;
    }

    public static C17z A06(Writer writer) {
        C17z A0A = AbstractC221915u.A00.A0A(writer);
        A0A.A0c();
        return A0A;
    }

    public static C120985dq A0A(Object obj) {
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        return c120985dq;
    }

    public static C38321qM A0H(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        return c38321qM;
    }

    public static C40971v4 A0J(Object obj) {
        C40971v4 c40971v4 = (C40971v4) obj;
        C14360o3.A0B(c40971v4, 0);
        return c40971v4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.pendingmedia.model.SimpleUserStoryTarget, java.lang.Object] */
    public static SimpleUserStoryTarget A0K(String str) {
        ?? obj = new Object();
        obj.A00 = str;
        return obj;
    }

    public static ReelStore A0M(UserSession userSession) {
        C1OU c1ou = C1OU.$redex_init_class;
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        return A03;
    }

    public static C41234IMz A0N(HCK hck) {
        return (C41234IMz) hck.A09.getValue();
    }

    public static C1563470e A0O(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        return C70Y.A00(merchantShoppingCartFragment.A02).A07;
    }

    public static C38327GtM A0P(HCO hco) {
        return (C38327GtM) hco.A0J.getValue();
    }

    public static C38323GtI A0Q(HCE hce) {
        return (C38323GtI) hce.A0H.getValue();
    }

    public static ImmutablePandoUserDict A0R(C17T c17t) {
        return (ImmutablePandoUserDict) c17t.A07(ImmutablePandoUserDict.class);
    }

    public static String A0g(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
        return AbstractC82663mU.A00;
    }

    public static String A0k(C17T c17t) {
        return c17t.A0j(3579);
    }

    public static String A0p(String str, String str2) {
        return AnonymousClass001.A0T(str, str2, '_');
    }

    public static C17050sx A0s(Object obj, int i) {
        return AbstractC09440dt.A01(new C50159MDm(obj, i));
    }

    public static void A0w(C07X c07x, C2GT c2gt, InterfaceC16660sJ interfaceC16660sJ, int i) {
        c2gt.A06(c07x, new C31421DrQ(i, interfaceC16660sJ));
    }

    public static void A19(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("client_session_id", str);
        interfaceC02590Ai.Cht();
    }

    public static void A1D(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
    }

    public static void A1E(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
    }

    public static void A1F(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str);
        }
    }

    public static void A1G(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S("media_type", str);
        }
    }

    public static void A1H(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S("attribution", str);
        }
    }

    public static void A1I(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S("merchant_id", str);
        }
    }

    public static void A1J(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S("display_type", str);
        }
    }

    public static void A1K(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S("attribution_url", str);
        }
    }

    public static void A1L(AnonymousClass182 anonymousClass182, String str) {
        if (str != null) {
            anonymousClass182.A0S("custom_text_color", str);
        }
    }

    public static void A1R(WEz wEz, MRA mra) {
        wEz.A03 = mra;
        WEz.A00(null, wEz);
    }

    public static int A01(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        return interfaceC57162jr.CFq(c59062n7).intValue();
    }

    public static int A02(Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{obj, obj2});
    }

    public static Bundle A04(UserSession userSession, C28431Ze c28431Ze, C31368DqX c31368DqX) {
        return c28431Ze.A01(userSession, c31368DqX.A03());
    }

    public static C16R A05(C16L c16l) {
        c16l.A1J();
        return c16l.A11();
    }

    public static C71313Hs A07(AbstractC12990ll abstractC12990ll) {
        C71313Hs A00 = C71313Hs.A00(abstractC12990ll);
        C14360o3.A07(A00);
        return A00;
    }

    public static C6T7 A0B(Context context, C1338462s c1338462s, InterfaceC62872tQ interfaceC62872tQ) {
        return C6T7.A00(context, c1338462s, interfaceC62872tQ).A00();
    }

    public static C82713mZ A0F(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str) {
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, str);
        A04.A0G(userSession, c38321qM);
        return A04;
    }

    public static Reel A0I(UserSession userSession, String str) {
        return ReelStore.A03(userSession).A0M(str);
    }

    public static Boolean A0S(C102884kP c102884kP, int i, boolean z) {
        return Boolean.valueOf(c102884kP.A0S(i, z));
    }

    public static Integer A0T(Resources resources, int i) {
        return Integer.valueOf(resources.getDimensionPixelSize(i));
    }

    public static Integer A0U(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-1221029593);
    }

    public static Integer A0V(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-1128035601);
    }

    public static Integer A0W(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-753448353);
    }

    public static Integer A0X(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-524107635);
    }

    public static Integer A0Y(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-389942488);
    }

    public static Integer A0Z(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(113126854);
    }

    public static Integer A0a(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(1457597201);
    }

    public static Integer A0c(UserSession userSession, C38321qM c38321qM) {
        return Integer.valueOf(c38321qM.A16(userSession));
    }

    public static Integer A0d(C75113Zb c75113Zb) {
        return Integer.valueOf(c75113Zb.getPosition());
    }

    public static Object A0e(C2GT c2gt) {
        Object A02 = c2gt.A02();
        C14360o3.A0A(A02);
        return A02;
    }

    public static Object A0f(C120985dq c120985dq, AbstractMap abstractMap) {
        return abstractMap.get(c120985dq.getId());
    }

    public static String A0i(Reel reel) {
        String id = reel.getId();
        C14360o3.A07(id);
        return id;
    }

    public static String A0j(ProductFeedItem productFeedItem) {
        String id = productFeedItem.getId();
        C14360o3.A07(id);
        return id;
    }

    public static String A0l(C17T c17t) {
        return c17t.A0i(-2115337775);
    }

    public static String A0m(C17T c17t) {
        return c17t.A0i(-265713450);
    }

    public static String A0n(C17T c17t) {
        return c17t.A0i(2036780306);
    }

    public static Iterator A0q(AnonymousClass182 anonymousClass182, String str, List list) {
        C16V.A03(anonymousClass182, str);
        return list.iterator();
    }

    public static Map A0r(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        return AbstractC06930Yk.A0B(map);
    }

    public static void A0u(BaseBundle baseBundle, C38321qM c38321qM) {
        baseBundle.putString("media_id", c38321qM.getId());
    }

    public static void A0x(InterfaceC02590Ai interfaceC02590Ai, int i, int i2) {
        interfaceC02590Ai.AAP("position", AbstractC154266wb.A01(i, i2));
    }

    public static void A0y(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("m_t", Long.valueOf(j));
    }

    public static void A0z(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("ad_id", Long.valueOf(j));
    }

    public static void A10(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("container_id", Long.valueOf(j));
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("global_position", Long.valueOf(j));
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("chaining_position", Long.valueOf(j));
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, String str, String str2) {
        c0Zx.A06(str, str2);
        interfaceC02590Ai.AAQ(c0Zx, "navigation_info");
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf) {
        interfaceC02590Ai.AAP("multi_ads_unit_id", intentAwareAdsInfoIntf.BVL());
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw) {
        interfaceC02590Ai.AAP("container_module", interfaceC11380iw.getModuleName());
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(AbstractC58358Pty.A00(), str);
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAK(C4SX.A00(str), "merchant_id");
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAK(C4SX.A00(str), "merchant_igid");
    }

    public static void A1A(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, List list) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAk("recommendation_info", list);
    }

    public static void A1B(InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A7v("is_checkout_enabled", Boolean.valueOf(z));
    }

    public static void A1C(C0Zx c0Zx, String str, String str2, String str3) {
        c0Zx.A06(str, str2);
        c0Zx.A06("submodule", str3);
    }

    public static void A1M(AbstractC23721Ec abstractC23721Ec, String str, String str2) {
        abstractC23721Ec.A0B(str);
        abstractC23721Ec.A9s("media_id", str2);
    }

    public static void A1N(AbstractC23721Ec abstractC23721Ec, String str, String str2, String str3) {
        abstractC23721Ec.A0H(str, str2);
        abstractC23721Ec.A0H("max_id", str3);
    }

    public static void A1O(UserSession userSession, C38321qM c38321qM) {
        C1DW.A00(userSession).A03(c38321qM);
    }

    public static void A1Q(User user, Map map) {
        map.put("merchant", user.A07());
    }

    public static void A1S(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        abstractCollection.add(obj2);
        abstractCollection.add(obj3);
    }

    public static void A1T(Object obj, Map map, int i) {
        map.put(obj, Integer.valueOf(i));
    }

    public static boolean A1V(C16L c16l, Object obj) {
        c16l.A1J();
        return PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(obj);
    }

    public static boolean A1W(C16L c16l, Object obj) {
        c16l.A1J();
        return DialogModule.KEY_ITEMS.equals(obj);
    }

    public static boolean A1X(C16L c16l, Object obj) {
        c16l.A1J();
        return "attribution".equals(obj);
    }

    public static boolean A1Y(UserSession userSession, C38321qM c38321qM) {
        return C3YS.A00(userSession).A05(c38321qM);
    }

    public static boolean A1Z(UserSession userSession, C38321qM c38321qM) {
        return c38321qM.A1g(userSession).CdW();
    }

    public static boolean A1a(UserSession userSession, C38321qM c38321qM) {
        return C57532kS.A00(userSession).A0N(c38321qM);
    }

    public static boolean A1b(List list) {
        return Collections.unmodifiableList(list).isEmpty();
    }

    public static boolean A1U(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll) {
        return C18U.A06(c06090Tz, abstractC12990ll, 36318479682246868L);
    }
}
