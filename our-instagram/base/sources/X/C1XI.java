package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.ProductArEffectMetadataIntf;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1XI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XI extends C1XJ {
    public final C1XK A00 = new C1XJ() { // from class: X.1XK
        public final InterfaceC09390do A00;
        public final InterfaceC09390do A01;

        @Override // X.C1XJ
        public final Bundle A02(String str) {
            android.net.Uri build;
            String A0u;
            String str2;
            C14360o3.A0B(str, 0);
            android.net.Uri A02 = AbstractC08820cl.A02(AbstractC34909FZv.A00, str, true);
            if (A02 == null) {
                return null;
            }
            String scheme = A02.getScheme();
            if (!"https".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                if (!"ig".equalsIgnoreCase(scheme) && !"instagram".equalsIgnoreCase(scheme)) {
                    return null;
                }
                return AbstractC34909FZv.A00(A02);
            }
            if (!AbstractC34911FZx.A00(A02)) {
                return null;
            }
            List<String> pathSegments = A02.getPathSegments();
            C14360o3.A07(pathSegments);
            boolean z = false;
            if ((pathSegments.size() == 3 && "shop".equalsIgnoreCase(pathSegments.get(0)) && "products".equalsIgnoreCase(pathSegments.get(1))) || (pathSegments.size() == 4 && "shop".equalsIgnoreCase(pathSegments.get(1)) && "products".equalsIgnoreCase(pathSegments.get(2)))) {
                z = true;
            }
            int size = pathSegments.size();
            if (z) {
                if (size == 3) {
                    str2 = pathSegments.get(2);
                } else if (pathSegments.size() == 4) {
                    str2 = pathSegments.get(3);
                }
                A0u = AnonymousClass001.A0R("ig://shopping_home?destination=product_serp&prior_module=shopping_search_SEO&query=", str2);
                build = AbstractC08820cl.A03(A0u);
                C14360o3.A07(build);
                return AbstractC34909FZv.A00(build);
            }
            if (size != 2) {
                return null;
            }
            if ("shop".equalsIgnoreCase(pathSegments.get(1))) {
                A0u = AnonymousClass001.A0u("ig://", pathSegments.get(1), "?merchant_username=", pathSegments.get(0));
                build = AbstractC08820cl.A03(A0u);
                C14360o3.A07(build);
                return AbstractC34909FZv.A00(build);
            }
            if (!"_n".equalsIgnoreCase(pathSegments.get(0)) && !"n".equalsIgnoreCase(pathSegments.get(0))) {
                return null;
            }
            build = AbstractC08820cl.A03(AnonymousClass001.A0R("ig://", pathSegments.get(1))).buildUpon().encodedQuery(A02.getEncodedQuery()).build();
            C14360o3.A07(build);
            return AbstractC34909FZv.A00(build);
        }

        @Override // X.C1XJ
        public final C54816OKr A04(C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(interfaceC11380iw, 1);
            C14360o3.A0B(str, 2);
            return new C54816OKr(c22p, interfaceC11380iw, userSession, str);
        }

        @Override // X.C1XJ
        public final C41701IdV A05(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str2, 3);
            return new C41701IdV(userSession, interfaceC60442pS, str, str2, str3);
        }

        @Override // X.C1XJ
        public final C1821585z A06(AbstractC59962oe abstractC59962oe, UserSession userSession, ProductItemWithAR productItemWithAR, String str, String str2) {
            C14360o3.A0B(abstractC59962oe, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(productItemWithAR, 4);
            return new C1821585z(abstractC59962oe, userSession, productItemWithAR, str, str2);
        }

        @Override // X.C1XJ
        public final C41623IbD A07(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, Boolean bool, String str, String str2) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(c22p, 3);
            C14360o3.A0B(str2, 4);
            C14360o3.A0B(productArEffectMetadataIntf, 6);
            return new C41623IbD(fragmentActivity, c22p, userSession, productArEffectMetadataIntf, product, bool, str, str2);
        }

        @Override // X.C1XJ
        public final C41623IbD A08(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, String str, String str2) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(c22p, 3);
            C14360o3.A0B(str2, 4);
            C14360o3.A0B(productArEffectMetadataIntf, 6);
            return new C41623IbD(fragmentActivity, c22p, userSession, productArEffectMetadataIntf, product, null, str, str2);
        }

        @Override // X.C1XJ
        public final C55099ObA A09(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass840 anonymousClass840, OJZ ojz) {
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(abstractC018607g, 1);
            return new C55099ObA(context, userSession, anonymousClass840, ojz, new OXN(context, abstractC018607g, userSession, C08730cb.A00(userSession).A00()));
        }

        @Override // X.C1XJ
        public final IMY A0A(FragmentActivity fragmentActivity, UserSession userSession, String str) {
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str, 2);
            return new IMY(fragmentActivity, userSession, str);
        }

        @Override // X.C1XJ
        public final C64972wv A0C(Context context, FragmentActivity fragmentActivity, RankingInfo rankingInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, YN1 yn1, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(context, 1);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(interfaceC60442pS, 3);
            return new C64972wv(context, fragmentActivity, rankingInfo, userSession, interfaceC60442pS, num, str, str2, str3, str4, str5, str6, str7, str8, str9, z, z2);
        }

        @Override // X.C1XJ
        public final IK5 A0D(UserSession userSession, EnumC39584Hdu enumC39584Hdu, String str, String str2, int i, boolean z, boolean z2) {
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(enumC39584Hdu, 6);
            return new IK5(userSession, enumC39584Hdu, str, str2, i, z, z2);
        }

        @Override // X.C1XJ
        public final C36284Fzb A0E(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            return (C36284Fzb) userSession.A01(C36284Fzb.class, new J8U(userSession, 27));
        }

        @Override // X.C1XJ
        public final C54565O8r A0G(FragmentActivity fragmentActivity, UserSession userSession) {
            C14360o3.A0B(userSession, 1);
            return new C54565O8r(fragmentActivity, userSession);
        }

        @Override // X.C1XJ
        public final IK6 A0H(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, AndroidLink androidLink, String str) {
            C14360o3.A0B(fragmentActivity, 0);
            return new IK6(fragmentActivity, userSession, c38321qM, androidLink, str);
        }

        @Override // X.C1XJ
        public final OXN A0I(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC57994Pne interfaceC57994Pne) {
            C14360o3.A0B(context, 0);
            C14360o3.A0B(abstractC018607g, 1);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(interfaceC57994Pne, 3);
            OXN oxn = new OXN(context, abstractC018607g, userSession, C08730cb.A00(userSession).A00());
            oxn.A00 = interfaceC57994Pne;
            return oxn;
        }

        @Override // X.C1XJ
        public final INF A0J(FragmentActivity fragmentActivity, UserSession userSession, EnumC39622HeW enumC39622HeW, String str, String str2) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str2, 3);
            return new INF(fragmentActivity, userSession, enumC39622HeW, str, str2);
        }

        @Override // X.C1XJ
        public final C42130Ile A0K(FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(str, 1);
            C14360o3.A0B(productReviewStatus, 2);
            C14360o3.A0B(str2, 3);
            C14360o3.A0B(userSession, 5);
            C14360o3.A0B(interfaceC60442pS, 6);
            C14360o3.A0B(str4, 7);
            return new C42130Ile(fragmentActivity, productReviewStatus, userSession, interfaceC60442pS, str, str2, str3, str4, str5);
        }

        @Override // X.C1XJ
        public final C42130Ile A0L(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(product, 1);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(interfaceC60442pS, 3);
            C14360o3.A0B(str, 4);
            return new C42130Ile(fragmentActivity, userSession, interfaceC60442pS, product, str, str2);
        }

        @Override // X.C1XJ
        public final C41749IeN A0M(android.net.Uri uri, FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, boolean z) {
            ArrayList arrayList;
            C14360o3.A0B(fragmentActivity, 2);
            String queryParameter = uri.getQueryParameter("shopping_session_id");
            String moduleName = interfaceC60442pS.getModuleName();
            String queryParameter2 = uri.getQueryParameter("business_user_id");
            if (queryParameter2 != null) {
                C41749IeN A0N = A0N(fragmentActivity, SellerShoppableFeedType.A06, userSession, interfaceC60442pS, queryParameter, moduleName, "ad_feed", queryParameter2, uri.getQueryParameter(DialogModule.KEY_TITLE));
                A0N.A03 = c38321qM;
                A0N.A0J = z;
                String queryParameter3 = uri.getQueryParameter("pinned_product_ids");
                if (queryParameter3 != null) {
                    String[] strArr = (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(queryParameter3).toArray(new String[0]);
                    arrayList = new ArrayList(AbstractC16960so.A1Q(Arrays.copyOf(strArr, strArr.length)));
                } else {
                    arrayList = null;
                }
                A0N.A0H = arrayList;
                return A0N;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // X.C1XJ
        public final C41749IeN A0N(FragmentActivity fragmentActivity, SellerShoppableFeedType sellerShoppableFeedType, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(interfaceC60442pS, 2);
            C14360o3.A0B(str4, 6);
            return new C41749IeN(fragmentActivity, sellerShoppableFeedType, userSession, interfaceC60442pS, str, str2, str3, str4, str5);
        }

        @Override // X.C1XJ
        public final C41749IeN A0O(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, User user, String str, String str2) {
            C14360o3.A0B(c75113Zb, 3);
            String A00 = AbstractC76433bn.A00(user);
            if (A00 != null) {
                C41749IeN A0N = A0N(fragmentActivity, user.A03.Bt7(), userSession, interfaceC60442pS, str2, interfaceC60442pS.getModuleName(), str, A00, user.A03.getUsername());
                A0N.A03 = c38321qM;
                A0N.A0N = true;
                A0N.A0I = IBN.A00.A03(c38321qM, user, c75113Zb.A03);
                return A0N;
            }
            return null;
        }

        @Override // X.C1XJ
        public final C41214IMd A0P(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(interfaceC60442pS, 1);
            C14360o3.A0B(userSession, 2);
            return new C41214IMd(fragmentActivity, userSession, interfaceC60442pS);
        }

        @Override // X.C1XJ
        public final C1563970j A0Q(FragmentActivity fragmentActivity, final UserSession userSession, AbstractC38948HCy abstractC38948HCy, C41206ILu c41206ILu, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str2, 3);
            C70U c70u = (C70U) new C52942bb(new InterfaceC52932ba(userSession) { // from class: X.70T
                public final UserSession A00;

                @Override // X.InterfaceC52932ba
                public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
                    return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
                }

                @Override // X.InterfaceC52932ba
                public final AbstractC52922bZ create(Class cls) {
                    C14360o3.A0B(cls, 0);
                    if (cls.isAssignableFrom(C70U.class)) {
                        return new C70U(this.A00);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempting to create a ");
                    sb.append(cls);
                    sb.append(" using ");
                    Class<?> cls2 = getClass();
                    Map map = C0YZ.A03;
                    C14360o3.A0B(cls2, 1);
                    sb.append(AbstractC13230m9.A00(cls2));
                    throw new IllegalArgumentException(sb.toString());
                }

                {
                    this.A00 = userSession;
                }

                @Override // X.InterfaceC52932ba
                public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
                    C14360o3.A0B(cls, 1);
                    return create(cls);
                }
            }, fragmentActivity).A00(C70U.class);
            C70V c70v = new C70V(userSession);
            C18920wW c18920wW = new C18920wW(C12180kM.A02, userSession);
            C25671My A00 = AbstractC25651Mw.A00(userSession);
            C70Y A002 = C70Y.A00(userSession);
            C14360o3.A07(A002);
            return new C1563970j(fragmentActivity, c70u, c70v, c18920wW, A00, userSession, A002, c41206ILu, this, str, str2, str3, str4, str5, str7);
        }

        @Override // X.C1XJ
        public final INB A0S(FragmentActivity fragmentActivity, UserSession userSession, String str) {
            C14360o3.A0B(fragmentActivity, 0);
            return new INB(fragmentActivity, userSession, str);
        }

        @Override // X.C1XJ
        public final EVS A0W(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            return new EVS(userSession);
        }

        @Override // X.C1XJ
        public final C52253NAt A0X(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            return new C52253NAt(userSession);
        }

        @Override // X.C1XJ
        public final void A0a(Activity activity, Fragment fragment, UserSession userSession, String str, String str2) {
            C14360o3.A0B(activity, 0);
            C14360o3.A0B(fragment, 1);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(str, 3);
            C14360o3.A0B(str2, 4);
            Bundle bundle = new Bundle();
            bundle.putString("waterfall_id", str);
            bundle.putString("prior_module_name", str2);
            C6XJ c6xj = new C6XJ(activity, bundle, userSession, ModalActivity.class, "shopping_shop_management_add_product");
            if (fragment.getActivity() != null) {
                c6xj.A0D(fragment, 10);
            } else {
                c6xj.A0A(activity, 10);
            }
        }

        @Override // X.C1XJ
        public final void A0b(Activity activity, Fragment fragment, UserSession userSession, String str, String str2) {
            C14360o3.A0B(activity, 0);
            C14360o3.A0B(fragment, 1);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(str, 3);
            C14360o3.A0B(str2, 4);
            List A0S = C08730cb.A00(userSession).A00().A0S();
            if (A0S != null && !A0S.isEmpty()) {
                A0a(activity, fragment, userSession, str, str2);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("waterfall_id", str);
            bundle.putString("prior_module_name", str2);
            C6XJ c6xj = new C6XJ(activity, bundle, userSession, ModalActivity.class, "shopping_shop_management_edit");
            if (fragment.getActivity() != null) {
                c6xj.A0D(fragment, 9);
            } else {
                c6xj.A0A(activity, 9);
            }
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [X.JPv, java.lang.Object] */
        @Override // X.C1XJ
        public final void A0c(Activity activity, UserSession userSession, String str, boolean z) {
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str, 2);
            HashMap hashMap = new HashMap();
            hashMap.put("prior_module", str);
            hashMap.put("is_onboarding", String.valueOf(z));
            C66277U6x A01 = C66277U6x.A01("com.instagram.shopping.screens.creator_onboarding_nux", hashMap);
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
            igBloksScreenConfig.A04 = new Object();
            igBloksScreenConfig.A0i = true;
            new C6XJ(activity, W6d.A00(igBloksScreenConfig, A01), userSession, ModalActivity.class, "bloks").A0C(activity);
        }

        @Override // X.C1XJ
        public final void A0f(Context context, UserSession userSession, String str) {
            C14360o3.A0B(context, 0);
            C14360o3.A0B(userSession, 1);
            AbstractC41662Ibu.A00(context, userSession, str);
        }

        @Override // X.C1XJ
        public final void A0g(Context context, UserSession userSession, String str) {
            C14360o3.A0B(userSession, 1);
            C70Y.A00(userSession).A07(null);
            if (str != null) {
                C70Y.A00(userSession).A04(str);
            }
            C54593O9u c54593O9u = (C54593O9u) userSession.A01(C54593O9u.class, new J7Q(userSession, 20));
            if (c54593O9u.A01.A00()) {
                C40701ud c40701ud = c54593O9u.A02;
                PandoGraphQLRequest A00 = c54593O9u.A00.A00();
                c40701ud.ATV(C23360AXj.A00, C64022Sxt.A00, A00);
            }
        }

        @Override // X.C1XJ
        public final void A0i(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, EnumC39540HdC enumC39540HdC, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(enumC39540HdC, 2);
            C14360o3.A0B(str2, 4);
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            bundle2.putSerializable("media_feed_entry_point", enumC39540HdC);
            bundle2.putString("shopping_session_id", str);
            bundle2.putString("media_feed_title", str2);
            bundle2.putString("initial_media_id", str3);
            if (num != null) {
                bundle2.putInt("media_carousel_index", num.intValue());
            }
            if (bundle.containsKey("permission_id")) {
                bundle2.putString("permission_id", bundle.getString("permission_id"));
            }
            bundle2.putBundle("media_feed_extras", bundle);
            bundle2.putString("prior_module_name", null);
            bundle2.putString("prior_submodule_name", null);
            bundle2.putString("shops_first_entry_point", null);
            HCQ hcq = new HCQ();
            hcq.setArguments(bundle2);
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A08();
            c140966Yy.A0D(hcq);
            c140966Yy.A04();
        }

        @Override // X.C1XJ
        public final void A0l(Fragment fragment, UserSession userSession, ProductPickerArguments productPickerArguments) {
            C14360o3.A0B(userSession, 1);
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            bundle.putParcelable("product_picker_arguments", productPickerArguments);
            new C6XJ(fragment.requireActivity(), bundle, userSession, TransparentModalActivity.class, "shopping_product_picker").A0D(fragment, 3);
        }

        @Override // X.C1XJ
        public final void A0n(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, int i, boolean z) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(enumC39644HiZ, 7);
            C14360o3.A0B(enumC39649Hie, 8);
            C14360o3.A0B(enumC39650Hif, 9);
            C14360o3.A0B(enumC39651Hig, 10);
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            bundle.putString("shopping_session_id", str);
            bundle.putString("prior_module_name", str2);
            bundle.putString("prior_submodule_name", str3);
            bundle.putString("analytics_referral_experience", enumC39644HiZ.toString());
            bundle.putString("analytics_referral_page", enumC39649Hie.toString());
            bundle.putString("analytics_referral_module", enumC39650Hif.toString());
            bundle.putString("analytics_referral_component", enumC39651Hig.toString());
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A08();
            this.A00.getValue();
            C38933HCg c38933HCg = new C38933HCg();
            c38933HCg.setArguments(bundle);
            c140966Yy.A0D(c38933HCg);
            c140966Yy.A04();
        }

        @Override // X.C1XJ
        public final void A0o(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str3, 4);
            C14360o3.A0B(enumC39644HiZ, 10);
            if (AbstractC41662Ibu.A02(str3, null)) {
                if (C18U.A06(C06090Tz.A05, userSession, 36310890471555435L)) {
                    C62862tP A04 = C62862tP.A04(fragmentActivity, new C19270xB(str2), userSession);
                    C1GL c1gl = A04.A07;
                    AbstractC192798gL A02 = C192108fB.A02(null, userSession, "com.bloks.www.bloks.commerce.cart.globalstatepublish.async", null);
                    A02.A00(new C32379EOf(A04));
                    c1gl.schedule(A02);
                }
                AbstractC41662Ibu.A01(fragmentActivity, userSession, str2, null);
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36323509085285687L)) {
                A00(fragmentActivity, enumC39651Hig, enumC39644HiZ, enumC39650Hif, enumC39649Hie, userSession, str2, str3);
                return;
            }
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A0B(null, A0T().A0B(enumC39651Hig, enumC39644HiZ, enumC39650Hif, enumC39649Hie, userSession, str, str2, str3, str4, str5, str6, str7, new SMA(fragmentActivity).A00(), false));
            c140966Yy.A04();
        }

        @Override // X.C1XJ
        public final void A0p(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str2, 3);
            C14360o3.A0B(str3, 4);
            C14360o3.A0B(enumC39644HiZ, 9);
            A0o(fragmentActivity, enumC39651Hig, enumC39644HiZ, enumC39650Hif, enumC39649Hie, userSession, str, str2, str3, null, str4, str5, str6, false);
        }

        @Override // X.C1XJ
        public final void A0q(FragmentActivity fragmentActivity, UserSession userSession) {
            C189478aR c189478aR;
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            EN0 en0 = new EN0();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            en0.setArguments(bundle);
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0d = fragmentActivity.getResources().getString(2131971165);
            c189448aO.A0T = en0;
            C3DN A00 = C3DN.A00.A00(fragmentActivity);
            if (A00 != null && ((C3DP) A00).A0h) {
                BottomSheetFragment bottomSheetFragment = (BottomSheetFragment) A00.A09();
                if (bottomSheetFragment != null && (c189478aR = bottomSheetFragment.A02) != null) {
                    c189448aO.A1G = true;
                    c189478aR.A0F(en0, c189448aO);
                    return;
                }
                return;
            }
            c189448aO.A00().A02(fragmentActivity, en0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x011a, code lost:
        
            if (r31.A29() == X.EnumC39572Hdi.A07) goto L26;
         */
        @Override // X.C1XJ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void A0s(androidx.fragment.app.FragmentActivity r29, com.instagram.common.session.UserSession r30, X.C38321qM r31, X.InterfaceC60442pS r32, X.C75113Zb r33, X.InterfaceC86363t8 r34, X.InterfaceC43588JPt r35, java.lang.String r36, java.lang.String r37) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1XK.A0s(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.1qM, X.2pS, X.3Zb, X.3t8, X.JPt, java.lang.String, java.lang.String):void");
        }

        @Override // X.C1XJ
        public final void A0t(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, String str, String str2, String str3) {
            AbstractC41775Ier.A09(userSession, c38321qM, interfaceC60442pS, str2, str, str3);
            C41214IMd c41214IMd = new C41214IMd(fragmentActivity, userSession, interfaceC60442pS);
            c41214IMd.A07 = C05F.A01;
            c41214IMd.A01 = c38321qM;
            c41214IMd.A02 = c75113Zb;
            c41214IMd.A06 = interfaceC86363t8;
            c41214IMd.A0B = str;
            c41214IMd.A09 = str2;
            c41214IMd.A0A = str3;
            c41214IMd.A00();
        }

        @Override // X.C1XJ
        public final void A0u(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C41551w4 c41551w4, InterfaceC1119153d interfaceC1119153d) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 2);
            C14360o3.A0B(interfaceC1119153d, 5);
            if (c38321qM.A1g(userSession).CdW()) {
                C71313Hs A00 = C71313Hs.A00(userSession);
                C14360o3.A07(A00);
                View requireViewById = fragmentActivity.requireViewById(R.id.reel_main_container);
                C14360o3.A07(requireViewById);
                View findViewById = fragmentActivity.findViewById(R.id.product_sticker_view);
                if (findViewById != null && C18U.A06(C06090Tz.A05, userSession, 36320545558110886L)) {
                    requireViewById = findViewById;
                }
                A00.A07(requireViewById, EnumC71343Hv.A0k, new String[0], 1);
                AbstractC46580KjJ.A00(userSession).A00(userSession, c38321qM, interfaceC60442pS);
            }
            C130915ve c130915ve = new C130915ve(userSession, c41551w4.A0H, null, null, c41551w4.A01, c41551w4.A0E);
            C41214IMd A0P = C1XJ.A00.A0P(fragmentActivity, userSession, interfaceC60442pS);
            A0P.A07 = C05F.A0C;
            A0P.A01 = c38321qM;
            A0P.A02 = null;
            A0P.A05 = interfaceC1119153d;
            A0P.A03 = null;
            A0P.A00 = c130915ve;
            A0P.A00();
        }

        @Override // X.C1XJ
        public final void A0z(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2, String str3) {
            String str4;
            HCa hCa = new HCa();
            Bundle bundle = new Bundle();
            bundle.putString("product_id", product.A0H);
            User user = product.A0B;
            if (user != null) {
                str4 = AbstractC76433bn.A00(user);
            } else {
                str4 = null;
            }
            bundle.putString("merchant_id", str4);
            bundle.putString("prior_module_name", str);
            bundle.putString("prior_submodule_name", str2);
            bundle.putString("shopping_session_id", str3);
            hCa.setArguments(bundle);
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0d = fragmentActivity.getResources().getString(2131974025);
            c189448aO.A03 = 1.0f;
            c189448aO.A0a = true;
            c189448aO.A0T = hCa;
            c189448aO.A07(I7U.A00(fragmentActivity, new ViewOnClickListenerC41991IjM(fragmentActivity, userSession, interfaceC60442pS, this, str3), C70Y.A00(userSession).A06()));
            c189448aO.A00().A02(fragmentActivity, hCa);
        }

        @Override // X.C1XJ
        public final void A10(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
            C193328hC c193328hC = new C193328hC((Activity) fragmentActivity);
            c193328hC.A0A(2131962240);
            c193328hC.A09(2131962238);
            c193328hC.A0J(new DialogInterfaceOnClickListenerC35350FiR(fragmentActivity, userSession, interfaceC60442pS, str), 2131962239);
            c193328hC.A03();
            c193328hC.A0s(true);
            c193328hC.A0t(true);
            C0fJ.A00(c193328hC.A02());
        }

        @Override // X.C1XJ
        public final void A11(FragmentActivity fragmentActivity, UserSession userSession, IgFundedIncentive igFundedIncentive) {
            C189478aR c189478aR;
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(igFundedIncentive, 2);
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            bundle.putParcelable("igfunded_incentive", igFundedIncentive);
            C38939HCo c38939HCo = new C38939HCo();
            c38939HCo.setArguments(bundle);
            C3DN A00 = C3DN.A00.A00(fragmentActivity);
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0d = fragmentActivity.getResources().getString(2131960976);
            c189448aO.A0T = c38939HCo;
            C189478aR A002 = c189448aO.A00();
            if (A00 != null && ((C3DP) A00).A0h) {
                Fragment A09 = A00.A09();
                if (A09 != null && (c189478aR = ((BottomSheetFragment) A09).A02) != null) {
                    C189448aO c189448aO2 = new C189448aO(userSession);
                    c189448aO2.A0d = fragmentActivity.getResources().getString(2131960976);
                    c189448aO2.A1G = true;
                    c189448aO2.A0T = c38939HCo;
                    c189478aR.A0F(c38939HCo, c189448aO2);
                    return;
                }
                return;
            }
            A002.A02(fragmentActivity, c38939HCo);
            c38939HCo.A00 = A002;
        }

        @Override // X.C1XJ
        public final void A15(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4, List list, boolean z) {
            C189478aR c189478aR;
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str, 5);
            C14360o3.A0B(str2, 6);
            C14360o3.A0B(str3, 7);
            C14360o3.A0B(str4, 8);
            C38932HCf c38932HCf = new C38932HCf();
            Bundle bundle = new Bundle();
            bundle.putParcelable("merchant", user);
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductDiscountInformationDict) it.next()).EyM());
            }
            bundle.putParcelableArrayList("discounts", new ArrayList<>(arrayList));
            bundle.putBoolean("display_discount_link", z);
            bundle.putString("module_name", str);
            bundle.putString("prior_module_name", str2);
            bundle.putString("prior_submodule_name", str3);
            bundle.putString("shopping_session_id", str4);
            c38932HCf.setArguments(bundle);
            C3DN A00 = C3DN.A00.A00(fragmentActivity);
            if (A00 != null && ((C3DP) A00).A0h) {
                BottomSheetFragment bottomSheetFragment = (BottomSheetFragment) A00.A09();
                if (bottomSheetFragment != null && (c189478aR = bottomSheetFragment.A02) != null) {
                    C189448aO c189448aO = new C189448aO(userSession);
                    c189448aO.A0d = fragmentActivity.getResources().getString(2131960976);
                    c189448aO.A1G = true;
                    c189448aO.A0T = c38932HCf;
                    c189448aO.A0U = c38932HCf;
                    c189478aR.A0F(c38932HCf, c189448aO);
                    return;
                }
                return;
            }
            C189448aO c189448aO2 = new C189448aO(userSession);
            c189448aO2.A0d = fragmentActivity.getResources().getString(2131960976);
            c189448aO2.A0T = c38932HCf;
            c189448aO2.A0U = c38932HCf;
            C189478aR A002 = c189448aO2.A00();
            A002.A02(fragmentActivity, c38932HCf);
            c38932HCf.A00 = A002;
        }

        @Override // X.C1XJ
        public final void A19(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str, 2);
            C14360o3.A0B(str2, 3);
            A1L(fragmentActivity, userSession, str, str2, true);
        }

        @Override // X.C1XJ
        public final void A1B(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
            C14360o3.A0B(str3, 4);
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A08();
            C66277U6x A01 = C66277U6x.A01("com.instagram.shopping.screens.seller_screen_delegator", AbstractC06930Yk.A06(new C09530e4("prior_module", str2), new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2), new C09530e4("waterfall_id", str3), new C09530e4("screen", str)));
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
            Resources resources = fragmentActivity.getResources();
            int i = 2131963201;
            if (C14360o3.A0K(str, "page_shop_onboard_screen")) {
                i = 2131969306;
            }
            igBloksScreenConfig.A0U = resources.getString(i);
            c140966Yy.A0D(W6d.A02(igBloksScreenConfig, A01));
            c140966Yy.A0D = false;
            c140966Yy.A04();
        }

        @Override // X.C1XJ
        public final void A1E(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str, 2);
            C14360o3.A0B(str2, 3);
            List A0S = C08730cb.A00(userSession).A00().A0S();
            if (A0S != null && !A0S.isEmpty()) {
                A1L(fragmentActivity, userSession, str, str2, z);
                return;
            }
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            A0T();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            bundle.putString("waterfall_id", str);
            bundle.putString("prior_module", str2);
            HCF hcf = new HCF();
            hcf.setArguments(bundle);
            c140966Yy.A0D(hcf);
            if (z) {
                c140966Yy.A0D = false;
            } else {
                c140966Yy.A08();
            }
            c140966Yy.A04();
        }

        @Override // X.C1XJ
        public final void A1F(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str, 2);
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putString("product_id", str);
                new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "shopping_product_appeals").A0C(fragmentActivity);
                return;
            }
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            c140966Yy.A08();
            A0T();
            HashMap hashMap = new HashMap();
            hashMap.put("product_id", str);
            c140966Yy.A0D(W6d.A02(new IgBloksScreenConfig(userSession), C66277U6x.A01("com.instagram.shopping.product_appeals_entrypoint", hashMap)));
            c140966Yy.A04();
        }

        @Override // X.C1XJ
        public final void A1G(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
            C14360o3.A0B(abstractC59962oe, 1);
            if (str != null) {
                C70Y.A00(userSession).A02 = C05F.A01;
                C70Y.A00(userSession).A03 = str;
                FBZ.A00(abstractC59962oe, userSession, str);
                if (C18U.A06(C06090Tz.A06, userSession, 36310890471162214L)) {
                    AbstractC06930Yk.A02(new C09530e4("_PRELOAD_ID_KEY_", "SingleMerchantCart"));
                    AbstractC191798eb.A03(abstractC59962oe.requireContext(), new C191778eZ(userSession), "com.bloks.www.bloks.commerce.cart.singlemerchantcart", "SingleMerchantCart", AbstractC06930Yk.A02(new C09530e4("params", AnonymousClass001.A0g("{\"client_input_params\":{\"merchant-id\":", str, "},\"server_params\":{\"prefetch_view_only\":1}}"))), I7M.A00(userSession).longValue());
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36310890471883119L)) {
                        AbstractC191798eb.A03(abstractC59962oe.requireContext(), new C191778eZ(userSession), "async.components.singlemerchantcart.template", "TDSeparationSingleMerchantCart", null, C18U.A01(c06090Tz, userSession, 36592365448659392L));
                        return;
                    }
                    return;
                }
                return;
            }
            C70Y A00 = C70Y.A00(userSession);
            IFZ ifz = new IFZ(abstractC59962oe, userSession);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            AbstractC40691uc.A01(A00.A06).ATV(null, new C42098Il8(A00, ifz), new PandoGraphQLRequest(AbstractC40511uK.A00(), "CommerceShopsCartMerchants", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C60478R0e.class, false, null, 0, null, "xfb_shops_viewer", new ArrayList()));
        }

        @Override // X.C1XJ
        public final void A1H(UserSession userSession, Integer num, String str, String str2) {
            String str3;
            C14360o3.A0B(userSession, 0);
            C18920wW A00 = AbstractC12220kQ.A00(null, C12180kM.A05, userSession);
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "commerce_cart_click");
            if (A002.isSampled()) {
                A002.A8R(EnumC39651Hig.A06, "analytics_component");
                A002.A8R(EnumC39649Hie.A0C, "analytics_page");
                A002.A8R(EnumC39644HiZ.UNKNOWN, "referral_surface");
                A002.AAP("referral_ui_component", "");
                if (str == null) {
                    str = "";
                }
                A002.AAP("shopping_session_id", str);
                A002.AAP("ui_component", "cart_badge");
                C09530e4 c09530e4 = new C09530e4("cart_client_display_timestamp", String.valueOf(System.currentTimeMillis()));
                if (num == null || (str3 = num.toString()) == null) {
                    str3 = "Null";
                }
                A002.A9M("extra_data", AbstractC06930Yk.A02(c09530e4, new C09530e4("cart_client_displayed_total_item_count", str3), new C09530e4("cart_badge_entry_surface", str2)));
                A002.AAP("navigation_chain", C1QM.A00.A02.A00);
                A002.Cht();
            }
        }

        @Override // X.C1XJ
        public final void A1I(UserSession userSession, Integer num, String str, String str2) {
            String str3;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(str2, 2);
            C18920wW A00 = AbstractC12220kQ.A00(null, C12180kM.A05, userSession);
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "commerce_cart_impression");
            if (A002.isSampled()) {
                A002.A8R(EnumC39651Hig.A06, "analytics_component");
                A002.A8R(EnumC39649Hie.A0C, "analytics_page");
                A002.A8R(EnumC39644HiZ.UNKNOWN, "referral_surface");
                A002.AAP("referral_ui_component", "");
                if (str == null) {
                    str = "";
                }
                A002.AAP("shopping_session_id", str);
                A002.AAP("ui_component", "cart_badge");
                C09530e4 c09530e4 = new C09530e4("cart_client_display_timestamp", String.valueOf(System.currentTimeMillis()));
                if (num == null || (str3 = num.toString()) == null) {
                    str3 = "Null";
                }
                A002.A9M("extra_data", AbstractC06930Yk.A02(c09530e4, new C09530e4("cart_client_displayed_total_item_count", str3), new C09530e4("cart_badge_entry_surface", str2)));
                A002.AAP("navigation_chain", C1QM.A00.A02.A00);
                A002.Cht();
            }
        }

        {
            InterfaceC09390do A00 = C1XM.A00(C1XL.A00);
            InterfaceC09390do A002 = C1XM.A00(C1XN.A00);
            this.A00 = A00;
            this.A01 = A002;
        }

        public static final void A00(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2) {
            IgBloksScreenConfig igBloksScreenConfig;
            C66277U6x A02;
            String str3;
            int intValue = C70Y.A00(userSession).A02.intValue();
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue == 0) {
                        C62862tP A04 = C62862tP.A04(fragmentActivity, new C19270xB(str), userSession);
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        BitSet bitSet = new BitSet(1);
                        hashMap.put("referral_surface", enumC39644HiZ.A00);
                        bitSet.set(0);
                        hashMap.put("analytics_referral_component", enumC39651Hig.A00);
                        hashMap.put("analytics_referral_module", enumC39650Hif.A00);
                        hashMap.put("analytics_referral_page", enumC39649Hie.A00);
                        Context applicationContext = fragmentActivity.getApplicationContext();
                        if (bitSet.nextClearBit(0) >= 1) {
                            C69618VsL A01 = FTe.A01("com.bloks.www.bloks.commerce.cart.routing");
                            A01.A04 = AbstractC191768eY.A01(hashMap);
                            A01.A03 = hashMap2;
                            A01.A02 = null;
                            A01.A00(applicationContext, A04);
                            return;
                        }
                        throw new IllegalStateException("Missing Required Props");
                    }
                    return;
                }
                String str4 = C70Y.A00(userSession).A03;
                if (str4 == null) {
                    str4 = "";
                }
                C14360o3.A0B(str4, 1);
                HashMap A022 = AbstractC06930Yk.A02(new C09530e4("params", AnonymousClass001.A11("{\"client_input_params\":{\"merchant-id\":", str4, "},\"server_params\":{\"prefetch_view_only\":1, \"entry_point\":", str2, "}}")));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str5 = enumC39651Hig.A00;
                C14360o3.A07(str5);
                linkedHashMap.put("analytics_referral_component", str5);
                String str6 = enumC39644HiZ.A00;
                C14360o3.A07(str6);
                linkedHashMap.put("analytics_referral_experience", str6);
                String str7 = enumC39649Hie.A00;
                C14360o3.A07(str7);
                linkedHashMap.put("analytics_referral_page", str7);
                String str8 = enumC39650Hif.A00;
                C14360o3.A07(str8);
                linkedHashMap.put("analytics_referral_module", str8);
                igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                igBloksScreenConfig.A0R = "com.bloks.www.bloks.commerce.cart.singlemerchantcart";
                A02 = C66277U6x.A02("com.bloks.www.bloks.commerce.cart.singlemerchantcart", A022, linkedHashMap);
                str3 = "SingleMerchantCart";
            } else {
                igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                igBloksScreenConfig.A0R = "com.bloks.www.bloks.commerce.cart.multimerchantcart";
                HashMap A023 = AbstractC06930Yk.A02(new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String str9 = enumC39651Hig.A00;
                C14360o3.A07(str9);
                linkedHashMap2.put("analytics_referral_component", str9);
                String str10 = enumC39644HiZ.A00;
                C14360o3.A07(str10);
                linkedHashMap2.put("analytics_referral_experience", str10);
                String str11 = enumC39649Hie.A00;
                C14360o3.A07(str11);
                linkedHashMap2.put("analytics_referral_page", str11);
                String str12 = enumC39650Hif.A00;
                C14360o3.A07(str12);
                linkedHashMap2.put("analytics_referral_module", str12);
                A02 = C66277U6x.A02("com.bloks.www.bloks.commerce.cart.multimerchantcart", A023, linkedHashMap2);
                str3 = "MultiMerchantCart";
            }
            A02.A05 = str3;
            new C6XJ(fragmentActivity, W6d.A00(igBloksScreenConfig, A02), userSession, ModalActivity.class, "bloks").A0C(fragmentActivity.getApplicationContext());
        }

        @Override // X.C1XJ
        public final IFM A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
            return new IFM(interfaceC11380iw, userSession, str);
        }

        @Override // X.C1XJ
        public final ILA A0B(UserSession userSession) {
            return new ILA(userSession);
        }

        @Override // X.C1XJ
        public final C3BU A0F(UserSession userSession) {
            return (C3BU) userSession.A01(C3BU.class, new J8U(userSession, 28));
        }

        @Override // X.C1XJ
        public final C1564070k A0R(UserSession userSession, C1563970j c1563970j, String str, String str2) {
            return new C1564070k(userSession, c1563970j, str, str2);
        }

        @Override // X.C1XJ
        public final C41769Iel A0T() {
            return (C41769Iel) this.A00.getValue();
        }

        @Override // X.C1XJ
        public final InterfaceC58077Pp2 A0U(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
            return new C56741PGj(context, abstractC018607g, userSession);
        }

        @Override // X.C1XJ
        public final void A0d(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4) {
            String str5 = str3;
            C14360o3.A0B(str2, 3);
            C14360o3.A0B(str4, 6);
            C62862tP A04 = C62862tP.A04(fragmentActivity, new C19270xB(str4), userSession);
            C36023FvL c36023FvL = new C36023FvL();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            new BitSet(0);
            hashMap.put("ad_id", str2);
            hashMap.put("ad_tracking_token", str5);
            hashMap.put("prior_module", str4);
            hashMap.put("merchant_id", str);
            C69618VsL A01 = FTe.A01("com.bloks.www.bloks.commerce.cart.globalstatepublish.async");
            A01.A04 = AbstractC191768eY.A01(hashMap);
            A01.A03 = hashMap2;
            A01.A02 = c36023FvL;
            A01.A00(context, A04);
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            new BitSet(0);
            hashMap3.put("merchant_id", str);
            C69618VsL A012 = FTe.A01("com.bloks.www.bloks.commerce.cart.globalstatepublish.secondary.async");
            A012.A04 = AbstractC191768eY.A01(hashMap3);
            A012.A03 = hashMap4;
            A012.A02 = c36023FvL;
            A012.A00(context, A04);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("prop_merchant_id", str);
            linkedHashMap.put("ad_id", str2);
            if (str3 == null) {
                str5 = "";
            }
            linkedHashMap.put("ad_tracking_token_client_param", str5);
            linkedHashMap.put("prop_prior_module_name", str4);
            linkedHashMap.put("prop_entry_point", "ads_direct");
            AbstractC191798eb.A03(context, new C191778eZ(userSession), "com.bloks.www.bloks.commerce.cart.singlemerchantcart", "SingleMerchantCart", linkedHashMap, C18U.A01(C06090Tz.A05, userSession, 36592365447938495L));
        }

        @Override // X.C1XJ
        public final void A12(FragmentActivity fragmentActivity, UserSession userSession, ProductCollectionLinkIntf productCollectionLinkIntf, String str, String str2) {
            EnumC39622HeW enumC39622HeW;
            ShoppingIncentiveMetadataIntf shoppingIncentiveMetadataIntf;
            String str3;
            String Ax5;
            String str4;
            ProductCollectionLinkMetadata productCollectionLinkMetadata;
            String str5;
            String str6;
            C14360o3.A0B(str, 2);
            ShoppingDestinationMetadataIntf Ax3 = productCollectionLinkIntf.Ax3();
            String str7 = null;
            if (Ax3 != null && Ax3.BHL() != null) {
                enumC39622HeW = EnumC39622HeW.A0B;
            } else {
                ShoppingDestinationMetadataIntf Ax32 = productCollectionLinkIntf.Ax3();
                if (Ax32 != null && Ax32.Bt6() != null) {
                    enumC39622HeW = EnumC39622HeW.A0I;
                } else {
                    throw new UnsupportedOperationException(AnonymousClass001.A0R("Unsupported shopping swipe-up link: ", productCollectionLinkIntf.Ax6().A00));
                }
            }
            INF A0J = C1XJ.A00.A0J(fragmentActivity, userSession, enumC39622HeW, null, str);
            A0J.A0A = "shopping_swipe_up";
            A0J.A0E = true;
            int ordinal = enumC39622HeW.ordinal();
            if (ordinal != 16) {
                if (ordinal == 6) {
                    if (productCollectionLinkIntf.Ax3() != null) {
                        ShoppingDestinationMetadataIntf Ax33 = productCollectionLinkIntf.Ax3();
                        if (Ax33 != null) {
                            productCollectionLinkMetadata = Ax33.Bt6();
                        } else {
                            productCollectionLinkMetadata = null;
                        }
                        A0J.A0D = productCollectionLinkIntf.Ax5();
                        if (productCollectionLinkMetadata != null) {
                            str5 = productCollectionLinkMetadata.BSZ();
                        } else {
                            str5 = null;
                        }
                        A0J.A08 = str5;
                        A0J.A07 = str2;
                        if (productCollectionLinkMetadata != null) {
                            str6 = productCollectionLinkMetadata.Bgr();
                            str7 = productCollectionLinkMetadata.ApG();
                        } else {
                            str6 = null;
                        }
                        A0J.A01(AbstractC40733I3n.A00(str7), str6);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported shopping swipe-up destination type: ");
                    sb.append(enumC39622HeW);
                    throw new UnsupportedOperationException(sb.toString());
                }
            } else if (productCollectionLinkIntf.Ax3() != null) {
                ShoppingDestinationMetadataIntf Ax34 = productCollectionLinkIntf.Ax3();
                if (Ax34 != null) {
                    shoppingIncentiveMetadataIntf = Ax34.BHL();
                } else {
                    shoppingIncentiveMetadataIntf = null;
                }
                C18A A00 = AnonymousClass189.A00(userSession);
                if (shoppingIncentiveMetadataIntf != null) {
                    str3 = shoppingIncentiveMetadataIntf.BSZ();
                } else {
                    str3 = null;
                }
                User A02 = A00.A02(str3);
                if (A02 != null) {
                    Ax5 = A02.A03.getUsername();
                } else {
                    Ax5 = productCollectionLinkIntf.Ax5();
                }
                A0J.A0D = Ax5;
                if (shoppingIncentiveMetadataIntf != null) {
                    str4 = shoppingIncentiveMetadataIntf.BSZ();
                } else {
                    str4 = null;
                }
                A0J.A08 = str4;
                if (shoppingIncentiveMetadataIntf != null) {
                    str7 = shoppingIncentiveMetadataIntf.BHK();
                }
                A0J.A05 = str7;
            }
            A0J.A00();
        }

        @Override // X.C1XJ
        public final void A14(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4) {
            Bundle bundle = new Bundle();
            bundle.putString("signup_nav_bar_title", str);
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
            bundle.putString("waterfall_id", str4);
            bundle.putString("prior_module", str2);
            new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "shopping_in_app_cis_onboarding").A0C(fragmentActivity);
        }

        @Override // X.C1XJ
        public final void A17(FragmentActivity fragmentActivity, UserSession userSession, String str) {
            C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
            c50674MYs.A07(str);
            new C31727DwY(c50674MYs).A05(fragmentActivity);
        }

        public final void A1L(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
            C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
            A0T();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
            bundle.putString("waterfall_id", str);
            bundle.putString("prior_module", str2);
            HCE hce = new HCE();
            hce.setArguments(bundle);
            c140966Yy.A0D(hce);
            if (z) {
                c140966Yy.A0D = false;
            } else {
                c140966Yy.A08();
            }
            c140966Yy.A04();
        }

        @Override // X.C1XJ
        public final C41220IMj A0V(UserSession userSession) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final Integer A0Y(UserSession userSession) {
            return C70Y.A00(userSession).A06();
        }

        @Override // X.C1XJ
        public final String A0Z(android.net.Uri uri, InterfaceC08100bW interfaceC08100bW, String str) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A0e(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, ProductGroup productGroup, InterfaceC43414JGe interfaceC43414JGe, String str, boolean z) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A0h(Context context, ProductGroup productGroup, Product product) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A0j(Fragment fragment, FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2, UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str, boolean z, boolean z2) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A0k(Fragment fragment, UserSession userSession, C38321qM c38321qM) {
            if (c38321qM.A5M()) {
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                bundle.putString("media_id", c38321qM.getId());
                new C6XJ(fragment.requireActivity(), bundle, userSession, TransparentModalActivity.class, "shopping_featured_product_carousel_picker").A0D(fragment, 13);
            }
        }

        @Override // X.C1XJ
        public final void A0r(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
            C38321qM A1g;
            User A2E;
            Product product = (Product) AbstractC001800i.A0J(C76513bv.A00(c38321qM));
            if (product != null && (A2E = (A1g = c38321qM.A1g(userSession)).A2E(userSession)) != null) {
                C42130Ile A0L = C1XJ.A00.A0L(fragmentActivity, userSession, interfaceC60442pS, product, "cta_bar", null);
                A0L.A0N = interfaceC60442pS.getModuleName();
                A0L.A0O = interfaceC60442pS.getModuleName();
                A0L.A02(A1g, null);
                A0L.A0F = A2E.getId();
                C42130Ile.A01(A0L);
            }
        }

        @Override // X.C1XJ
        public final void A0v(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A0w(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A0x(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A0y(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A13(FragmentActivity fragmentActivity, UserSession userSession, Product product) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final /* bridge */ /* synthetic */ void A16(FragmentActivity fragmentActivity, UserSession userSession, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A18(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A1A(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A1C(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(str2, 3);
            if (C18U.A06(C06090Tz.A05, userSession, 36323509085285687L)) {
                A00(fragmentActivity, EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, userSession, str2, "tags");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "tags");
            bundle.putString("prior_module_name", str2);
            bundle.putString("shopping_session_id", str);
            bundle.putString("tracking_token", str4);
            bundle.putString("media_id", str5);
            bundle.putString(TraceFieldType.BroadcastId, null);
            new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "shopping_bag").A0C(fragmentActivity.getApplicationContext());
        }

        @Override // X.C1XJ
        public final void A1D(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
            throw C00O.createAndThrow();
        }

        @Override // X.C1XJ
        public final void A1J(C189478aR c189478aR, C189448aO c189448aO, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
            C14360o3.A0B(str3, 4);
            MerchantShoppingCartFragment A0D = A0T().A0D(null, str, str2, str3, "view_in_cart_cta", str5, str6, null, null, str9, str10, null, null, false, false);
            C14360o3.A0C(A0D, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.BottomSheetDelegate");
            c189448aO.A0T = A0D;
            c189478aR.A0F(A0D, c189448aO);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0247 A[SYNTHETIC] */
        @Override // X.C1XJ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void A0m(androidx.fragment.app.FragmentActivity r37, X.EnumC39651Hig r38, X.EnumC39644HiZ r39, X.EnumC39650Hif r40, X.EnumC39649Hie r41, com.instagram.common.session.UserSession r42, java.lang.Long r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.util.HashMap r57, boolean r58) {
            /*
                Method dump skipped, instructions count: 598
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1XK.A0m(androidx.fragment.app.FragmentActivity, X.Hig, X.HiZ, X.Hif, X.Hie, com.instagram.common.session.UserSession, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, boolean):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v14 com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus, still in use, count: 2, list:
              (r0v14 com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus) from 0x0231: IF  (r0v14 com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus) == (null com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus)  -> B:59:0x01f8 A[HIDDEN] (LINE:175303)
              (r0v14 com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus) from 0x0236: PHI (r0v10 com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus) = (r0v14 com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus) binds: [B:203:0x0231] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // X.C1XJ
        public final boolean A1K(android.content.DialogInterface.OnDismissListener r28, android.content.DialogInterface.OnShowListener r29, androidx.fragment.app.FragmentActivity r30, com.instagram.api.schemas.ProductReviewStatus r31, com.instagram.common.session.UserSession r32, X.C38321qM r33, X.InterfaceC60442pS r34, X.InterfaceC146006hx r35, java.lang.String r36, java.lang.String r37, boolean r38) {
            /*
                Method dump skipped, instructions count: 900
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1XK.A1K(android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnShowListener, androidx.fragment.app.FragmentActivity, com.instagram.api.schemas.ProductReviewStatus, com.instagram.common.session.UserSession, X.1qM, X.2pS, X.6hx, java.lang.String, java.lang.String, boolean):boolean");
        }
    };

    @Override // X.C1XJ
    public final C64972wv A0C(Context context, FragmentActivity fragmentActivity, RankingInfo rankingInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, YN1 yn1, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        return A0C(context, fragmentActivity, rankingInfo, userSession, interfaceC60442pS, null, num, str, str2, str3, str4, str5, str6, str7, str8, str9, z, z2);
    }

    @Override // X.C1XJ
    public final C1563970j A0Q(FragmentActivity fragmentActivity, UserSession userSession, AbstractC38948HCy abstractC38948HCy, C41206ILu c41206ILu, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return A0Q(fragmentActivity, userSession, null, c41206ILu, str, str2, str3, str4, str5, null, str7);
    }

    @Override // X.C1XJ
    public final C41220IMj A0V(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C41220IMj) userSession.A01(C41220IMj.class, new J8V(userSession, 2));
    }

    @Override // X.C1XJ
    public final void A0h(Context context, ProductGroup productGroup, Product product) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        bundle.putParcelable("product_group", null);
        bundle.putString("bottom_sheet_content_fragment", "shopping_product_multi_variant_picker");
        bundle.putBoolean("finish_host_activity_on_dismissed", true);
        C6XJ.A06(context, bundle, TransparentModalActivity.class, "bottom_sheet");
    }

    @Override // X.C1XJ
    public final void A0i(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, EnumC39540HdC enumC39540HdC, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        A0i(bundle, fragmentActivity, userSession, enumC39540HdC, num, str, str2, str3, null, null, null);
    }

    @Override // X.C1XJ
    public final void A0j(Fragment fragment, FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2, UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putParcelable("tagging_feed_arguments", shoppingTaggingFeedArguments);
        bundle.putString("shopping_session_id", null);
        C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, TransparentModalActivity.class, "shopping_tagging_feed");
        c6xj.A07();
        int i = 18;
        if (z2) {
            i = 16;
        }
        if (fragmentActivity2 != null) {
            c6xj.A0A(fragmentActivity, i);
        } else if (fragment != null) {
            c6xj.A0D(fragment, i);
        } else {
            c6xj.A0C(fragmentActivity);
        }
    }

    @Override // X.C1XJ
    public final void A0n(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, int i, boolean z) {
        A0n(fragmentActivity, enumC39651Hig, enumC39644HiZ, enumC39650Hif, enumC39649Hie, userSession, str, str2, str3, i, false);
    }

    @Override // X.C1XJ
    public final void A0o(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        A0o(fragmentActivity, enumC39651Hig, enumC39644HiZ, enumC39650Hif, enumC39649Hie, userSession, str, str2, str3, str4, str5, str6, null, false);
    }

    @Override // X.C1XJ
    public final void A0p(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        A0p(fragmentActivity, enumC39651Hig, enumC39644HiZ, enumC39650Hif, enumC39649Hie, userSession, str, str2, str3, str4, str5, str6, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (X.AbstractC116315Ok.A00(r1) == false) goto L12;
     */
    @Override // X.C1XJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A13(androidx.fragment.app.FragmentActivity r10, com.instagram.common.session.UserSession r11, com.instagram.user.model.Product r12) {
        /*
            r9 = this;
            r8 = r12
            com.instagram.api.schemas.UntaggableReason r2 = r12.A06
            if (r2 == 0) goto L44
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L44
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L44
            com.instagram.api.schemas.LinkWithText r5 = r2.A02
            X.8hC r2 = new X.8hC
            r4 = r10
            r2.<init>(r10)
            r2.A05 = r1
            r2.A0r(r0)
            r0 = 2131968948(0x7f1343b4, float:1.9574805E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 0
            r2.A0d(r0, r1)
            if (r5 == 0) goto L45
            java.lang.String r1 = r5.A00
            boolean r0 = X.AbstractC116315Ok.A00(r1)
            if (r0 != 0) goto L45
        L2f:
            X.FiY r3 = new X.FiY
            r7 = r9
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A0b(r3, r1)
            r0 = 1
            r2.A0s(r0)
            android.app.Dialog r0 = r2.A02()
            X.C0fJ.A00(r0)
        L44:
            return
        L45:
            r0 = 2131970063(0x7f13480f, float:1.9577066E38)
            java.lang.String r1 = r10.getString(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XI.A13(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, com.instagram.user.model.Product):void");
    }

    @Override // X.C1XJ
    public final void A16(FragmentActivity fragmentActivity, UserSession userSession, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        C41642IbY A00 = I6J.A00(userSession);
        synchronized (A00) {
            try {
                C37669Gi2 A002 = C41642IbY.A00(A00, str4);
                if (((java.util.Set) A002.A01).contains(37370080)) {
                    C006802i.A0p.markerEnd(37370080, (short) 111);
                } else {
                    A002.A01 = AnonymousClass090.A01(37370080, (java.util.Set) A002.A01);
                }
                C006802i.A0p.markerStart(37370080);
                if (str4 != null) {
                    C006802i.A0p.markerAnnotate(37370080, "merchant_id", str4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("prior_module_name", str);
        bundle.putString("prior_submodule_name", str2);
        bundle.putString("shopping_session_id", str3);
        bundle.putBoolean("is_checkout_only", z);
        bundle.putString("merchant_id", str4);
        bundle.putString("merchant_username", str5);
        bundle.putString("surface_title", str6);
        bundle.putString("media_id", str7);
        bundle.putString("shops_first_entry_point", str8);
        if (l != null) {
            bundle.putLong("shops_profile_entry_ig_id", l.longValue());
        }
        if (str9 != null) {
            bundle.putString("shops_affiliate_marketer_id", str9);
        }
        bundle.putBoolean("is_creator_shop", bool.booleanValue());
        bundle.putBoolean("include_media_in_reconsideration", false);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A08();
        C1XJ.A00.A0T();
        HCI hci = new HCI();
        hci.setArguments(bundle);
        c140966Yy.A0E(hci);
        c140966Yy.A04();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.WpW, java.lang.Object] */
    @Override // X.C1XJ
    public final void A1A(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        new BitSet(0);
        str.getClass();
        hashMap.put("shopping_session_id", str);
        hashMap.put("prior_module", str2);
        str3.getClass();
        hashMap.put("prior_submodule", str3);
        hashMap.put("risk_features", new SMA(fragmentActivity).A00());
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A02 = new Object();
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.buyer.reconsideration.wishlist", AbstractC191768eY.A01(hashMap), hashMap2);
        A02.A00 = 760101916;
        A02.A05 = null;
        A02.A01 = 0L;
        A02.A06 = null;
        A02.A03 = null;
        A02.A02 = null;
        A02.A04 = null;
        A02.A08(hashMap3);
        A02.A04(fragmentActivity, igBloksScreenConfig);
    }

    @Override // X.C1XJ
    public final Bundle A02(String str) {
        return A02(str);
    }

    @Override // X.C1XJ
    public final IFM A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        return A03(interfaceC11380iw, userSession, str);
    }

    @Override // X.C1XJ
    public final C54816OKr A04(C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        return A04(c22p, interfaceC11380iw, userSession, str);
    }

    @Override // X.C1XJ
    public final C41701IdV A05(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3) {
        return A05(userSession, interfaceC60442pS, str, str2, str3);
    }

    @Override // X.C1XJ
    public final C1821585z A06(AbstractC59962oe abstractC59962oe, UserSession userSession, ProductItemWithAR productItemWithAR, String str, String str2) {
        return A06(abstractC59962oe, userSession, productItemWithAR, str, str2);
    }

    @Override // X.C1XJ
    public final C41623IbD A07(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, Boolean bool, String str, String str2) {
        return A07(fragmentActivity, c22p, userSession, productArEffectMetadataIntf, product, bool, str, str2);
    }

    @Override // X.C1XJ
    public final C41623IbD A08(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, String str, String str2) {
        return A08(fragmentActivity, c22p, userSession, productArEffectMetadataIntf, product, str, str2);
    }

    @Override // X.C1XJ
    public final C55099ObA A09(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass840 anonymousClass840, OJZ ojz) {
        return A09(context, abstractC018607g, userSession, anonymousClass840, ojz);
    }

    @Override // X.C1XJ
    public final IMY A0A(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        return A0A(fragmentActivity, userSession, str);
    }

    @Override // X.C1XJ
    public final ILA A0B(UserSession userSession) {
        return A0B(userSession);
    }

    @Override // X.C1XJ
    public final IK5 A0D(UserSession userSession, EnumC39584Hdu enumC39584Hdu, String str, String str2, int i, boolean z, boolean z2) {
        return A0D(userSession, enumC39584Hdu, str, str2, i, z, z2);
    }

    @Override // X.C1XJ
    public final C36284Fzb A0E(UserSession userSession) {
        return A0E(userSession);
    }

    @Override // X.C1XJ
    public final C3BU A0F(UserSession userSession) {
        return A0F(userSession);
    }

    @Override // X.C1XJ
    public final C54565O8r A0G(FragmentActivity fragmentActivity, UserSession userSession) {
        return A0G(fragmentActivity, userSession);
    }

    @Override // X.C1XJ
    public final IK6 A0H(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, AndroidLink androidLink, String str) {
        return A0H(fragmentActivity, userSession, c38321qM, androidLink, str);
    }

    @Override // X.C1XJ
    public final OXN A0I(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC57994Pne interfaceC57994Pne) {
        return A0I(context, abstractC018607g, userSession, interfaceC57994Pne);
    }

    @Override // X.C1XJ
    public final INF A0J(FragmentActivity fragmentActivity, UserSession userSession, EnumC39622HeW enumC39622HeW, String str, String str2) {
        return A0J(fragmentActivity, userSession, enumC39622HeW, str, str2);
    }

    @Override // X.C1XJ
    public final C42130Ile A0K(FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5) {
        return A0K(fragmentActivity, productReviewStatus, userSession, interfaceC60442pS, str, str2, str3, str4, str5);
    }

    @Override // X.C1XJ
    public final C42130Ile A0L(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2) {
        return A0L(fragmentActivity, userSession, interfaceC60442pS, product, str, str2);
    }

    @Override // X.C1XJ
    public final C41749IeN A0M(android.net.Uri uri, FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, boolean z) {
        return A0M(uri, fragmentActivity, userSession, c38321qM, interfaceC60442pS, z);
    }

    @Override // X.C1XJ
    public final C41749IeN A0N(FragmentActivity fragmentActivity, SellerShoppableFeedType sellerShoppableFeedType, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5) {
        return A0N(fragmentActivity, sellerShoppableFeedType, userSession, interfaceC60442pS, str, str2, str3, str4, str5);
    }

    @Override // X.C1XJ
    public final C41749IeN A0O(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, User user, String str, String str2) {
        return A0O(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb, user, str, str2);
    }

    @Override // X.C1XJ
    public final C41214IMd A0P(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        return A0P(fragmentActivity, userSession, interfaceC60442pS);
    }

    @Override // X.C1XJ
    public final C1564070k A0R(UserSession userSession, C1563970j c1563970j, String str, String str2) {
        return A0R(userSession, c1563970j, str, str2);
    }

    @Override // X.C1XJ
    public final INB A0S(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        return A0S(fragmentActivity, userSession, str);
    }

    @Override // X.C1XJ
    public final C41769Iel A0T() {
        return A0T();
    }

    @Override // X.C1XJ
    public final InterfaceC58077Pp2 A0U(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        return A0U(context, abstractC018607g, userSession);
    }

    @Override // X.C1XJ
    public final EVS A0W(UserSession userSession) {
        return A0W(userSession);
    }

    @Override // X.C1XJ
    public final C52253NAt A0X(UserSession userSession) {
        return A0X(userSession);
    }

    @Override // X.C1XJ
    public final Integer A0Y(UserSession userSession) {
        return A0Y(userSession);
    }

    @Override // X.C1XJ
    public final String A0Z(android.net.Uri uri, InterfaceC08100bW interfaceC08100bW, String str) {
        if (uri != null) {
            try {
                return uri.getQueryParameter("app_id");
            } catch (UnsupportedOperationException e) {
                interfaceC08100bW.EHA(str, String.format("URI getQueryParameter failed: %s", uri.toString()), e);
                return null;
            }
        }
        return null;
    }

    @Override // X.C1XJ
    public final void A0a(Activity activity, Fragment fragment, UserSession userSession, String str, String str2) {
        A0a(activity, fragment, userSession, str, str2);
    }

    @Override // X.C1XJ
    public final void A0b(Activity activity, Fragment fragment, UserSession userSession, String str, String str2) {
        A0b(activity, fragment, userSession, str, str2);
    }

    @Override // X.C1XJ
    public final void A0c(Activity activity, UserSession userSession, String str, boolean z) {
        A0c(activity, userSession, str, z);
    }

    @Override // X.C1XJ
    public final void A0d(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4) {
        A0d(context, fragmentActivity, userSession, str, str2, str3, str4);
    }

    @Override // X.C1XJ
    public final void A0e(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, ProductGroup productGroup, InterfaceC43414JGe interfaceC43414JGe, String str, boolean z) {
        C43025J0q c43025J0q = new C43025J0q(interfaceC43414JGe);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0d = str;
        C189478aR A00 = c189448aO.A00();
        IH0 ih0 = new IH0(A00, this, c43025J0q);
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRAS_PRODUCT_GROUP", productGroup);
        bundle.putBoolean("extra_show_subtitle", z);
        HC1 hc1 = new HC1();
        hc1.A05 = ih0;
        hc1.setArguments(bundle);
        A00.A03(context, hc1);
    }

    @Override // X.C1XJ
    public final void A0f(Context context, UserSession userSession, String str) {
        A0f(context, userSession, str);
    }

    @Override // X.C1XJ
    public final void A0g(Context context, UserSession userSession, String str) {
        A0g(context, userSession, str);
    }

    @Override // X.C1XJ
    public final void A0k(Fragment fragment, UserSession userSession, C38321qM c38321qM) {
        A0k(fragment, userSession, c38321qM);
    }

    @Override // X.C1XJ
    public final void A0l(Fragment fragment, UserSession userSession, ProductPickerArguments productPickerArguments) {
        A0l(fragment, userSession, productPickerArguments);
    }

    @Override // X.C1XJ
    public final void A0m(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, HashMap hashMap, boolean z) {
        A0m(fragmentActivity, enumC39651Hig, enumC39644HiZ, enumC39650Hif, enumC39649Hie, userSession, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, hashMap, false);
    }

    @Override // X.C1XJ
    public final void A0q(FragmentActivity fragmentActivity, UserSession userSession) {
        A0q(fragmentActivity, userSession);
    }

    @Override // X.C1XJ
    public final void A0r(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        A0r(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb);
    }

    @Override // X.C1XJ
    public final void A0s(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, InterfaceC43588JPt interfaceC43588JPt, String str, String str2) {
        A0s(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb, interfaceC86363t8, interfaceC43588JPt, str, str2);
    }

    @Override // X.C1XJ
    public final void A0t(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, String str, String str2, String str3) {
        A0t(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c75113Zb, interfaceC86363t8, str, str2, str3);
    }

    @Override // X.C1XJ
    public final void A0u(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C41551w4 c41551w4, InterfaceC1119153d interfaceC1119153d) {
        A0u(fragmentActivity, userSession, c38321qM, interfaceC60442pS, c41551w4, interfaceC1119153d);
    }

    @Override // X.C1XJ
    public final void A0v(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("prior_module_name", interfaceC60442pS.getModuleName());
        bundle.putString("prior_submodule_name", str);
        bundle.putParcelable("product_details_page_logging_info", productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str2);
        bundle.putParcelable("featured_product_media_feed_grid_configuration", featuredProductMediaFeedGridConfiguration);
        HCU hcu = new HCU();
        hcu.setArguments(bundle);
        c140966Yy.A0E(hcu);
        c140966Yy.A04();
    }

    @Override // X.C1XJ
    public final void A0w(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("prior_module_name", interfaceC60442pS.getModuleName());
        bundle.putString("prior_submodule_name", str);
        bundle.putParcelable("product_details_page_logging_info", productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str2);
        bundle.putParcelable("featured_product_media_feed_grid_configuration", featuredProductMediaFeedGridConfiguration);
        HCV hcv = new HCV();
        hcv.setArguments(bundle);
        c140966Yy.A0E(hcv);
        c140966Yy.A04();
    }

    @Override // X.C1XJ
    public final void A0x(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("api_path", str2);
        bundle.putString("surface_title", str);
        bundle.putString("merchant_id", str3);
        bundle.putString("next_max_id", str4);
        bundle.putStringArrayList("media_ids", C41769Iel.A02(list));
        bundle.putString("selected_media_id", str5);
        bundle.putString("prior_module_name", interfaceC60442pS.getModuleName());
        bundle.putString("prior_submodule_name", str6);
        bundle.putParcelable("product_details_page_logging_info", productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str7);
        HCX hcx = new HCX();
        hcx.setArguments(bundle);
        c140966Yy.A0E(hcx);
        c140966Yy.A04();
    }

    @Override // X.C1XJ
    public final void A0y(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("api_path", str2);
        bundle.putString("surface_title", str);
        bundle.putString("merchant_id", str3);
        bundle.putString("next_max_id", str4);
        bundle.putStringArrayList("media_ids", C41769Iel.A02(list));
        bundle.putString("selected_media_id", str5);
        bundle.putString("prior_module_name", interfaceC60442pS.getModuleName());
        bundle.putString("prior_submodule_name", str6);
        bundle.putParcelable("product_details_page_logging_info", productDetailsPageLoggingInfo);
        bundle.putString("shopping_session_id", str7);
        HCW hcw = new HCW();
        hcw.setArguments(bundle);
        c140966Yy.A0E(hcw);
        c140966Yy.A04();
    }

    @Override // X.C1XJ
    public final void A0z(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2, String str3) {
        A0z(fragmentActivity, userSession, interfaceC60442pS, product, str, str2, str3);
    }

    @Override // X.C1XJ
    public final void A10(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        A10(fragmentActivity, userSession, interfaceC60442pS, str);
    }

    @Override // X.C1XJ
    public final void A11(FragmentActivity fragmentActivity, UserSession userSession, IgFundedIncentive igFundedIncentive) {
        A11(fragmentActivity, userSession, igFundedIncentive);
    }

    @Override // X.C1XJ
    public final void A12(FragmentActivity fragmentActivity, UserSession userSession, ProductCollectionLinkIntf productCollectionLinkIntf, String str, String str2) {
        A12(fragmentActivity, userSession, productCollectionLinkIntf, str, str2);
    }

    @Override // X.C1XJ
    public final void A14(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4) {
        A14(fragmentActivity, userSession, user, str, str2, str3, str4);
    }

    @Override // X.C1XJ
    public final void A15(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4, List list, boolean z) {
        A15(fragmentActivity, userSession, user, str, str2, str3, str4, list, z);
    }

    @Override // X.C1XJ
    public final void A17(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        A17(fragmentActivity, userSession, str);
    }

    @Override // X.C1XJ
    public final void A18(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        A0T();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("merchant_id", str);
        bundle.putString("prior_module_name", str2);
        HCT hct = new HCT();
        hct.setArguments(bundle);
        c140966Yy.A0E(hct);
        c140966Yy.A04();
    }

    @Override // X.C1XJ
    public final void A19(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        A19(fragmentActivity, userSession, str, str2);
    }

    @Override // X.C1XJ
    public final void A1B(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        A1B(fragmentActivity, userSession, str, str2, str3);
    }

    @Override // X.C1XJ
    public final void A1E(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        A1E(fragmentActivity, userSession, str, str2, z);
    }

    @Override // X.C1XJ
    public final void A1F(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        A1F(fragmentActivity, userSession, str, z);
    }

    @Override // X.C1XJ
    public final void A1G(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        A1G(abstractC59962oe, userSession, str);
    }

    @Override // X.C1XJ
    public final void A1H(UserSession userSession, Integer num, String str, String str2) {
        A1H(userSession, num, str, str2);
    }

    @Override // X.C1XJ
    public final void A1I(UserSession userSession, Integer num, String str, String str2) {
        A1I(userSession, num, str, str2);
    }

    @Override // X.C1XJ
    public final boolean A1K(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC146006hx interfaceC146006hx, String str, String str2, boolean z) {
        return A1K(onDismissListener, onShowListener, fragmentActivity, productReviewStatus, userSession, c38321qM, interfaceC60442pS, interfaceC146006hx, str, str2, z);
    }

    @Override // X.C1XJ
    public final void A1C(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        A1C(fragmentActivity, userSession, str, str2, "tags", str4, str5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    @Override // X.C1XJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1D(androidx.fragment.app.FragmentActivity r9, com.instagram.common.session.UserSession r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XI.A1D(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    @Override // X.C1XJ
    public final void A1J(C189478aR c189478aR, C189448aO c189448aO, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z) {
        A1J(c189478aR, c189448aO, null, str, str2, str3, "view_in_cart_cta", str5, str6, null, null, str9, str10, null, null, false);
    }
}
