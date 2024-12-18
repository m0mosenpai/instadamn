package X;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.ProductTileContext;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.user.model.ImmutablePandoProductCollection;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.User;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Gc4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37303Gc4 {
    public static View A03(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.layout_feed, viewGroup, false);
    }

    public static C23751Eh A0B(UserSession userSession, Class cls, boolean z, boolean z2) {
        return new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), cls, z, z2);
    }

    public static C57482kN A0C(Layout.Alignment alignment, TextPaint textPaint, TextView textView, int i) {
        return new C57482kN(alignment, textPaint, null, textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier(), i, textView.getIncludeFontPadding());
    }

    public static String A0R(C25531Mh c25531Mh, C64952wt c64952wt, int i, int i2) {
        c25531Mh.A0R("position", AbstractC154266wb.A01(i, i2));
        c25531Mh.A0R("chaining_session_id", c64952wt.A04);
        c25531Mh.A0R("parent_m_pk", c64952wt.A06);
        c25531Mh.A0R("product_collection_id", c64952wt.A09);
        c25531Mh.A0t(C1QM.A00.A02.A00);
        c25531Mh.A0R("shopping_session_id", c64952wt.A0D);
        c25531Mh.A0R("prior_module", c64952wt.A07);
        c25531Mh.A0R("prior_submodule", c64952wt.A08);
        c25531Mh.A0Q("surface_category_id", null);
        c25531Mh.A0R("query_text", c64952wt.A0B);
        String str = c64952wt.A0C;
        if (str == null) {
            return null;
        }
        return str;
    }

    public static void A1H(C82713mZ c82713mZ, C1PZ c1pz, int i) {
        if (i != 0) {
            c82713mZ.A7W = (String) c1pz.A00().get(0);
            c82713mZ.A84 = c1pz.A00();
        }
    }

    public static float A00(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Number) animatedValue).floatValue();
    }

    public static int A01(View view, int i) {
        if (i != 0) {
            return 0;
        }
        return view.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Zx, X.38B] */
    public static C38B A04(String str, String str2) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("prior_module", str);
        c0Zx.A06("prior_submodule", str2);
        return c0Zx;
    }

    public static C9CQ A05(Object obj) {
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        return AbstractC82563mK.A01(c120985dq.A02);
    }

    public static C17M A07(C1DY c1dy, C17T c17t, int i) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) c17t.A04(i, ImmutablePandoUserDict.class);
        Parcelable.Creator creator = User.CREATOR;
        return c1dy.A00(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
    }

    public static SmartReelType A08(String str, String str2, int i) {
        return new SmartReelType(str, i, str2);
    }

    public static C38321qM A0D(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        return ((C130455uq) c206259Bi.A02).A00();
    }

    public static EnumC64262vl A0G(C120985dq c120985dq) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            if (c38321qM.CdW()) {
                return EnumC64262vl.A05;
            }
            return EnumC64262vl.A04;
        }
        return EnumC64262vl.A06;
    }

    public static ProductCollection A0H(C17T c17t, ProductCollection productCollection) {
        if (productCollection == null) {
            return (ProductCollection) c17t.A05(1848938416, ImmutablePandoProductCollection.class);
        }
        return productCollection;
    }

    public static ProductDetailsProductItemDictIntf A0I(C17T c17t, ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) c17t.A05(-309474065, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    public static User A0J(C1DY c1dy, C17T c17t, int i) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) c17t.A05(i, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            return AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
        }
        return null;
    }

    public static Float A0L(C16L c16l, Float f, Object obj) {
        if ("z".equals(obj)) {
            return new Float(c16l.A0U());
        }
        return f;
    }

    public static Long A0P(C17T c17t) {
        return c17t.A0L(3355);
    }

    public static void A0a(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("nav_chain", String.valueOf(C1QM.A00.A02.A00));
    }

    public static void A0d(InterfaceC02590Ai interfaceC02590Ai, IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, Long l) {
        interfaceC02590Ai.A9K("hscroll_seed_ad_id", l);
        interfaceC02590Ai.A7v("is_seed_ad_multi_ads_eligible", intentAwareAdsInfoIntf.CcZ());
        interfaceC02590Ai.AAP("hscroll_seed_ad_tracking_token", intentAwareAdsInfoIntf.Brz());
    }

    public static void A0e(InterfaceC02590Ai interfaceC02590Ai, C153756vk c153756vk) {
        interfaceC02590Ai.A8R(c153756vk.A02, "pivot_page_entry_point");
        interfaceC02590Ai.AAP("pivot_page_session_id", c153756vk.getSessionId());
    }

    public static void A0h(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM, String str, List list) {
        interfaceC02590Ai.AAP("container_module", str);
        interfaceC02590Ai.AAP("flow", "recipe_sheet");
        interfaceC02590Ai.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
        interfaceC02590Ai.AAk("recommendation_info", list);
    }

    public static void A0i(InterfaceC02590Ai interfaceC02590Ai, C40971v4 c40971v4) {
        interfaceC02590Ai.A9K("ad_id", Long.valueOf(Long.parseLong(c40971v4.A0S)));
    }

    public static void A0j(InterfaceC02590Ai interfaceC02590Ai, Product product) {
        interfaceC02590Ai.A9K("product_id", Long.valueOf(Long.parseLong(product.A0H)));
    }

    public static void A0l(InterfaceC02590Ai interfaceC02590Ai, Long l, List list) {
        interfaceC02590Ai.A9K("media_ig_id", l);
        interfaceC02590Ai.AAP("signal", ((CreatorViewerSignalModel) AbstractC001800i.A0I(list)).BxI().toString());
        interfaceC02590Ai.AAP("signal_text_enum", ((CreatorViewerSignalModel) AbstractC001800i.A0I(list)).getTitle());
    }

    public static void A0m(InterfaceC02590Ai interfaceC02590Ai, String str) {
        if (str != null) {
            interfaceC02590Ai.A9K("merchant_bag_id", AbstractC003100w.A0k(10, str));
        }
    }

    public static void A0n(InterfaceC02590Ai interfaceC02590Ai, String str, long j) {
        interfaceC02590Ai.AAP("containermodule", str);
        interfaceC02590Ai.A9K("container_id", Long.valueOf(j));
    }

    public static void A0o(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "reels");
        interfaceC02590Ai.AAP("ui_variant", str);
        interfaceC02590Ai.AAP("social_context", str2);
    }

    public static void A0p(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.A9K("fundraiser_id", AbstractC003100w.A0k(10, str));
        interfaceC02590Ai.A9K("source_owner_id", AbstractC003100w.A0k(10, str2));
        interfaceC02590Ai.AAP("source_name", "FEED_POST");
        interfaceC02590Ai.A9M("attributes", null);
        interfaceC02590Ai.Cht();
    }

    public static void A0q(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, String str3) {
        interfaceC02590Ai.AAP("service_type", str);
        interfaceC02590Ai.AAP("sticker_id", str2);
        interfaceC02590Ai.AAP("reel_item_id", str3);
        interfaceC02590Ai.Cht();
    }

    public static void A0t(AbstractC02600Aj abstractC02600Aj, ProductTile productTile) {
        ProductTileMetadataDecorations productTileMetadataDecorations;
        ProductTileContext CIo;
        ProductTileMetadataImpl productTileMetadataImpl = productTile.A01;
        if (productTileMetadataImpl != null && (productTileMetadataDecorations = productTileMetadataImpl.A00) != null && (CIo = productTileMetadataDecorations.CIo()) != null) {
            abstractC02600Aj.A0R("social_context", CIo.CEe().toString());
        }
    }

    public static void A0u(AbstractC02600Aj abstractC02600Aj, ProductTile productTile) {
        C38321qM c38321qM;
        if (productTile != null && (c38321qM = productTile.A05) != null) {
            abstractC02600Aj.A0R("displayed_m_pk", c38321qM.getId());
        }
    }

    public static void A0v(AbstractC02600Aj abstractC02600Aj, ProductTile productTile) {
        RankingInfo rankingInfo = productTile.A04;
        if (rankingInfo != null) {
            abstractC02600Aj.A0N(AbstractC40745I3z.A00(rankingInfo), "ranking_logging_info");
        }
    }

    public static void A0w(AbstractC02600Aj abstractC02600Aj, String str) {
        if (str != null && str.length() > 0) {
            abstractC02600Aj.A00.AAK(C4SX.A00(str), "marketer_id");
        }
    }

    public static void A0y(C0Zx c0Zx, C19260xA c19260xA) {
        c0Zx.A06("search_session_id", c19260xA.A05("search_session_id"));
        c0Zx.A06("serp_session_id", c19260xA.A05("serp_session_id"));
        c0Zx.A06("rank_token", c19260xA.A05("rank_token"));
        c0Zx.A06("query_text", c19260xA.A05("query_text"));
    }

    public static void A10(C25531Mh c25531Mh, InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, String str) {
        c25531Mh.A0R("legacy_event_name", str);
        c25531Mh.A0M(EnumC39651Hig.A07, "analytics_component");
        c25531Mh.A0R("legacy_referral_surface", interfaceC11380iw.getModuleName());
        c25531Mh.A0R("legacy_ui_component", "shopping_reels_cta");
        c25531Mh.A0l(c38321qM.getId());
    }

    public static void A13(AnonymousClass182 anonymousClass182, ImageInfo imageInfo) {
        if (imageInfo != null) {
            anonymousClass182.A0r("image_versions2");
            AbstractC39101rj.A00(anonymousClass182, imageInfo.F5B());
        }
    }

    public static void A19(AbstractC60672pq abstractC60672pq) {
        C3FR c3fr;
        if (abstractC60672pq.mView != null && (c3fr = (C3FR) abstractC60672pq.getScrollingViewProxy()) != null) {
            c3fr.EWc(false);
        }
    }

    public static void A1A(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str) {
        List B0S;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        CreativeConfigIntf Asm = c38321qM.A0C.Asm();
        if (Asm != null && (B0S = Asm.B0S()) != null && (effectPreviewIntf = (EffectPreviewIntf) AbstractC001800i.A0J(B0S)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
            BME.A00(userSession).A00(userSession, str, effectId, interfaceC11380iw.getModuleName());
        }
    }

    public static void A1B(C18920wW c18920wW, C41181vS c41181vS, C3G2 c3g2, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.AAP("tracking_token", str2);
            C41618Ib8 c41618Ib8 = c41181vS.A0E;
            c41618Ib8.getClass();
            A00.AAP("reel_id_type", AbstractC47875LCv.A01(c41618Ib8.A04));
            A00.AAP("reel_id", c41181vS.A0k);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, C37947Gmp.A00(c3g2).name());
            A00.Cht();
        }
    }

    public static void A1C(C18920wW c18920wW, String str) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.AAP("tool", "");
            A00.AAP("debug", "");
            A00.Cht();
        }
    }

    public static void A1F(C82713mZ c82713mZ, C38321qM c38321qM, String str) {
        c82713mZ.A4c = str;
        c82713mZ.A0N(c38321qM.BRp());
        c82713mZ.A1f = Boolean.valueOf(!c38321qM.CdW());
        c82713mZ.A61 = c38321qM.getId();
    }

    public static boolean A1Z(Py6 py6) {
        return C14360o3.A0K(py6.A00, C1Q2.A02().getLanguage());
    }

    public static boolean A1a(C154796xU c154796xU) {
        if (c154796xU.A03.A03 != C05F.A00) {
            return false;
        }
        return true;
    }

    public static boolean A1b(C154796xU c154796xU) {
        if (c154796xU.A03.A03 != C05F.A01) {
            return false;
        }
        return true;
    }

    public static Bundle A02(UserSession userSession, C31368DqX c31368DqX) {
        return AbstractC31364DqT.A03().A01.A01(userSession, c31368DqX.A03());
    }

    public static TreeJNI A06(Object obj, C09530e4[] c09530e4Arr) {
        TreeJNI treeJNI = (TreeJNI) obj;
        TreeJNI applyToTree = new TreeUpdaterJNI(AbstractC06930Yk.A06(c09530e4Arr), treeJNI).applyToTree(treeJNI);
        C14360o3.A07(applyToTree);
        return applyToTree;
    }

    public static StickerTraySurface A09(C17T c17t, InterfaceC16660sJ interfaceC16660sJ) {
        return (StickerTraySurface) c17t.A0O(interfaceC16660sJ);
    }

    public static C1ON A0A(C25621Ms c25621Ms, String str, String str2) {
        c25621Ms.A0H(str, str2);
        c25621Ms.A0R(C124275jh.class, C37410Gdq.class);
        return c25621Ms.A0N();
    }

    public static C75113Zb A0E(C38321qM c38321qM) {
        return new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
    }

    public static FeaturedProductMediaFeedGridConfiguration A0F(InterfaceC09390do interfaceC09390do) {
        return (FeaturedProductMediaFeedGridConfiguration) interfaceC09390do.getValue();
    }

    public static Boolean A0K(C16L c16l, Boolean bool, Object obj, String str) {
        if (str.equals(obj)) {
            return Boolean.valueOf(c16l.A0d());
        }
        return bool;
    }

    public static IllegalArgumentException A0M(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalArgumentException(sb.toString());
    }

    public static Integer A0N(java.util.Set set, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            C006802i.A0p.markerEnd(i, (short) 111);
        }
        return valueOf;
    }

    public static Long A0O(C16L c16l, Long l, Object obj, String str) {
        if (str.equals(obj)) {
            return Long.valueOf(c16l.A0y());
        }
        return l;
    }

    public static Object A0Q(View view, Object obj) {
        view.setTag(obj);
        return view.getTag();
    }

    public static String A0S(C120985dq c120985dq, UserSession userSession) {
        User A09 = c120985dq.A09(userSession);
        if (A09 != null) {
            return A09.getId();
        }
        return "n/a";
    }

    public static String A0T(UserSession userSession, C38321qM c38321qM) {
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            return A2E.getId();
        }
        return null;
    }

    public static String A0U(C82713mZ c82713mZ, C38321qM c38321qM) {
        int A0n = c38321qM.A0n();
        String A2w = c38321qM.A2w();
        if (A0n != -1) {
            c82713mZ.A2q = Integer.valueOf(A0n);
        }
        return A2w;
    }

    public static String A0V(C17T c17t) {
        return c17t.A0j(-147132913);
    }

    public static String A0W(User user) {
        String A00 = AbstractC76433bn.A00(user);
        C14360o3.A0A(A00);
        return A00;
    }

    public static String A0X(String str) {
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        String lowerCase = str.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }

    public static List A0Y(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, JLM jlm, Long l) {
        c0Zx.A06("signal", jlm.BIH().toString());
        c0Zx.A06("signal_text_enum", jlm.getText());
        List singletonList = Collections.singletonList(c0Zx);
        C14360o3.A07(singletonList);
        interfaceC02590Ai.A9K("media_ig_id", l);
        interfaceC02590Ai.AAP("signal", jlm.BIH().toString());
        interfaceC02590Ai.AAP("signal_text_enum", jlm.getText());
        return singletonList;
    }

    public static void A0b(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A7v("is_dark_mode", Boolean.valueOf(C1H6.A03()));
    }

    public static void A0c(InterfaceC02590Ai interfaceC02590Ai, int i, long j) {
        interfaceC02590Ai.A9K("media_id", Long.valueOf(j));
        interfaceC02590Ai.A8p("media_index", Integer.valueOf(i));
    }

    public static void A0f(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM) {
        interfaceC02590Ai.AAP("m_pk", c38321qM.getId());
        interfaceC02590Ai.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
    }

    public static void A0g(InterfaceC02590Ai interfaceC02590Ai, C38321qM c38321qM) {
        interfaceC02590Ai.A8R(c38321qM.BRp().A00(), "media_type");
    }

    public static void A0k(InterfaceC02590Ai interfaceC02590Ai, C1M1 c1m1) {
        interfaceC02590Ai.AAP("client_session_id", c1m1.getSessionId());
        interfaceC02590Ai.AAP("contextual_ads_category", "");
    }

    public static void A0r(InterfaceC02590Ai interfaceC02590Ai, String str, boolean z) {
        interfaceC02590Ai.A7v("is_profile_owner", Boolean.valueOf(z));
        interfaceC02590Ai.A9K("profile_owner_id", Long.valueOf(AMW.A01(str)));
    }

    public static void A0s(InterfaceC02590Ai interfaceC02590Ai, String str, boolean z) {
        interfaceC02590Ai.A7v("is_in_stock", Boolean.valueOf(z));
        interfaceC02590Ai.AAP("merchant_id", str);
    }

    public static void A0x(C0Zx c0Zx, CreatorViewerSignalModel creatorViewerSignalModel, AbstractCollection abstractCollection) {
        c0Zx.A06("signal", creatorViewerSignalModel.BxI().toString());
        c0Zx.A06("signal_text_enum", creatorViewerSignalModel.getTitle());
        abstractCollection.add(c0Zx);
    }

    public static void A0z(C0Zx c0Zx, String str, String str2) {
        c0Zx.A06(str, str2);
        c0Zx.A06("nav_chain", C1QM.A00.A02.A00);
    }

    public static void A11(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, String str) {
        if (C18U.A06(c06090Tz, abstractC12990ll, 36317899857598104L)) {
            C0f5 AEp = C18950wb.A01.AEp("AD_REELS_BRS_ERROR", 817903741);
            AEp.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0g("Received ", str, " brs severity map on brs test user"));
            AEp.report();
        }
    }

    public static void A12(C222015v c222015v, AbstractC23721Ec abstractC23721Ec, Writer writer, String str, String str2) {
        C17z A0A = c222015v.A0A(writer);
        A0A.A0c();
        A0A.A0u(str);
        A0A.A0Z();
        A0A.close();
        String obj = writer.toString();
        C14360o3.A07(obj);
        abstractC23721Ec.A9s(str2, obj);
    }

    public static void A14(AnonymousClass182 anonymousClass182, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        if (!C16V.A04(anonymousClass182, entry)) {
            anonymousClass182.A0u((String) entry.getValue());
        }
    }

    public static void A15(AbstractC23721Ec abstractC23721Ec) {
        abstractC23721Ec.A9s("timezone_offset", String.valueOf(C23831Eq.A00()));
    }

    public static void A16(AbstractC23721Ec abstractC23721Ec, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        abstractC23721Ec.A9s((String) entry.getKey(), (String) entry.getValue());
    }

    public static void A17(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((InterfaceC43584JMs) it.next()).Eqa(c1dy));
    }

    public static void A18(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(c1dy.A00((User) it.next()));
    }

    public static void A1D(UserSession userSession, C82713mZ c82713mZ) {
        if (AbstractC61652rS.A02(userSession)) {
            c82713mZ.A4d = AbstractC61652rS.A01(AbstractC23021Ah.A00(userSession)).toString();
            c82713mZ.A4e = AbstractC61652rS.A00(userSession).toString();
        }
    }

    public static void A1E(UserSession userSession, C82713mZ c82713mZ, C40971v4 c40971v4, InterfaceC42381xS interfaceC42381xS) {
        c82713mZ.A0K(userSession, c40971v4);
        c82713mZ.A7R = "ad";
        c82713mZ.A07(interfaceC42381xS.BoB());
    }

    public static void A1G(C82713mZ c82713mZ, C31D c31d, InterfaceC42381xS interfaceC42381xS, C1PZ c1pz) {
        c82713mZ.A2x = interfaceC42381xS.Byg();
        c82713mZ.A3M = Long.valueOf(c1pz.A02);
        c82713mZ.A2w = Integer.valueOf(AbstractC19730y1.A00(AbstractC12960li.A00).A00());
        c82713mZ.A30 = Integer.valueOf(C1H6.A03() ? 1 : 0);
        c82713mZ.A4S = c31d.A00;
    }

    public static void A1I(Object obj, Map map) {
        map.put("y", AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1J(Object obj, Map map) {
        map.put("z", AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1K(Object obj, Map map) {
        map.put(IgReactMediaPickerNativeModule.WIDTH, AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1L(Object obj, Map map) {
        map.put(IgReactMediaPickerNativeModule.HEIGHT, AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1M(Object obj, Map map) {
        map.put("rotation", AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1N(Object obj, Map map) {
        map.put("end_time_ms", AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1O(Object obj, Map map) {
        map.put("start_time_ms", AnonymousClass010.A0m(String.valueOf(obj)));
    }

    public static void A1P(String str, Map map, InterfaceC09390do interfaceC09390do) {
        map.putAll(((InterfaceC61432r6) interfaceC09390do.getValue()).AUS(str));
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) it.next();
        if (extendedImageUrl != null) {
            abstractCollection.add(extendedImageUrl.A00());
        }
    }

    public static void A1R(AbstractCollection abstractCollection, Iterator it) {
        AndroidLink androidLink = (AndroidLink) it.next();
        if (androidLink != null) {
            abstractCollection.add(androidLink.F7o());
        }
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C38321qM) it.next()).A1D());
    }

    public static void A1T(AbstractCollection abstractCollection, Iterator it) {
        ProductDetailsProductItemDictIntf Bgw = ((ProductWrapperIntf) it.next()).Bgw();
        if (Bgw != null) {
            abstractCollection.add(AbstractC38048Gob.A01(Bgw));
        }
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = (ProductDetailsProductItemDictIntf) it.next();
        if (productDetailsProductItemDictIntf != null) {
            abstractCollection.add(productDetailsProductItemDictIntf.F7o());
        }
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AndroidLink) it.next()).F53());
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        VideoVersionIntf videoVersionIntf = (VideoVersionIntf) it.next();
        if (videoVersionIntf != null) {
            abstractCollection.add(videoVersionIntf.F7o());
        }
    }

    public static void A1X(AbstractCollection abstractCollection, Iterator it) {
        Double A0m = AnonymousClass010.A0m(String.valueOf(((Number) it.next()).floatValue()));
        if (A0m != null) {
            abstractCollection.add(A0m);
        }
    }

    public static void A1Y(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((VideoVersionIntf) it.next()).F5E());
    }

    public static void A0Z(View view, C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll) {
        if (C18U.A06(c06090Tz, abstractC12990ll, 36314850430815088L)) {
            C71313Hs.A00(abstractC12990ll).A05(view, EnumC71343Hv.A0H);
        }
    }
}
