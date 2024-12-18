package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iel, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41769Iel {
    public final ShoppingMoreProductsFragment A0F(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, AnonymousClass341 anonymousClass341, JHS jhs, EnumC39572Hdi enumC39572Hdi, Integer num, String str, String str2, String str3, List list) {
        ArrayList<? extends Parcelable> A1E;
        List A0M;
        C18C.A07(c38321qM, "Need to provide a media we can extract the tagged products from");
        ProductCollection productCollection = null;
        if (!I6P.A00(str3)) {
            if (c38321qM.A5P()) {
                AbstractC25226BEj.A0u(c38321qM).getClass();
                ClipsShoppingInfoIntf Buh = AbstractC25226BEj.A0u(c38321qM).Buh();
                Buh.getClass();
                A1E = AbstractC166987dD.A1F(I3Q.A00(Buh));
                productCollection = Buh.Ap9();
            } else if (c38321qM.A5g()) {
                c38321qM.A0C.BGP().getClass();
                A1E = I3S.A00(c38321qM.A0C.BGP());
                productCollection = c38321qM.A0C.BGP().Ap9();
            } else {
                if (c38321qM.A63() && c38321qM.A24() != null) {
                    ReelMultiProductLinkIntf A24 = c38321qM.A24();
                    A24.getClass();
                    if (A24.BhR() != null) {
                        ReelMultiProductLinkIntf A242 = c38321qM.A24();
                        A242.getClass();
                        A0M = AbstractC38048Gob.A03(A242.BhR());
                        A1E = AbstractC166987dD.A1F(A0M);
                    }
                }
                if (c38321qM.A63()) {
                    EnumC75383a5 enumC75383a5 = EnumC75383a5.A0y;
                    if (c38321qM.A3w(enumC75383a5) != null) {
                        A1E = AbstractC166987dD.A1E();
                        A1E.add(((C84823qW) c38321qM.A3w(enumC75383a5).get(0)).A0H());
                    }
                }
                if (c38321qM.A63()) {
                    EnumC75383a5 enumC75383a52 = EnumC75383a5.A0q;
                    if (c38321qM.A3w(enumC75383a52) != null) {
                        List A3w = c38321qM.A3w(enumC75383a52);
                        A3w.getClass();
                        if (((C84823qW) A3w.get(0)).A0M() != null) {
                            List A3w2 = c38321qM.A3w(enumC75383a52);
                            A3w2.getClass();
                            A0M = ((C84823qW) A3w2.get(0)).A0M();
                            A1E = AbstractC166987dD.A1F(A0M);
                        }
                    }
                }
                A1E = c38321qM.A3J();
            }
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        if (list != null && !list.isEmpty()) {
            A1E = (ArrayList) list;
        }
        ShoppingMoreProductsFragment shoppingMoreProductsFragment = new ShoppingMoreProductsFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelableArrayList("tagged_products", A1E);
        A0b.putParcelable("product_collection", productCollection);
        A0b.putString("media_id", c38321qM.getId());
        A0b.putString("surface_title", str);
        A0b.putString("media_id", c38321qM.getId());
        AbstractC37300Gc1.A0c(A0b, interfaceC60442pS.getModuleName());
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putString("shopping_session_id", str2);
        A0b.putSerializable("media_surface", anonymousClass341);
        A0b.putBoolean("as_fullscreen", false);
        A0b.putString("prior_submodule_name", str3);
        if (enumC39572Hdi != null) {
            A0b.putInt("ad_product_destination_override", enumC39572Hdi.A00);
        }
        if (num != null) {
            A0b.putInt("media_carousel_index", num.intValue());
        }
        if (interfaceC60442pS instanceof AnonymousClass309) {
            C11520jB E6Q = ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM);
            C37330GcY c37330GcY = new C37330GcY();
            c37330GcY.A02(E6Q);
            c37330GcY.A01(A0b);
        }
        shoppingMoreProductsFragment.A07 = jhs;
        shoppingMoreProductsFragment.setArguments(A0b);
        return shoppingMoreProductsFragment;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.WpW, java.lang.Object] */
    public static C72743Nv A00(Bundle bundle, InterfaceC43590JPv interfaceC43590JPv, UserSession userSession, Integer num, String str, String str2, String str3, int i) {
        HashMap hashMap;
        if (str3 == null) {
            str3 = bundle.getString("product_feed_label");
        }
        boolean z = bundle.getBoolean("should_show_tab_bar", false);
        if (bundle.getSerializable("bloks_params") == null) {
            hashMap = AbstractC166987dD.A1G();
        } else {
            hashMap = (HashMap) bundle.getSerializable("bloks_params");
        }
        C66277U6x A01 = C66277U6x.A01(str, hashMap);
        if (num != null) {
            A01.A00 = num.intValue();
        }
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0N = Integer.valueOf(i);
        A0C.A0U = str3;
        A0C.A0R = str2;
        A0C.A02 = new Object();
        A0C.A0l = z;
        if (interfaceC43590JPv != null) {
            A0C.A04 = interfaceC43590JPv;
        }
        return W6d.A02(A0C, A01);
    }

    public static C42146Ilu A01(Bundle bundle) {
        bundle.getSerializable("seller_shoppable_feed_type");
        String string = bundle.getString("displayed_user_id");
        String string2 = bundle.getString("product_feed_label");
        String string3 = bundle.getString("attribution_username");
        String string4 = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        if (string == null) {
            string = "";
        }
        if (string4 == null) {
            string4 = "";
        }
        return new C42146Ilu(string, string2, string4, string3, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.WpW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment A09(android.os.Bundle r10, com.instagram.common.session.UserSession r11) {
        /*
            r9 = this;
            java.lang.String r4 = "bloks_params"
            java.io.Serializable r1 = r10.getSerializable(r4)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L36
            java.lang.String r0 = "prior_module"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r0 = "media_id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.1qM r0 = X.AbstractC25229BEm.A0h(r11, r0)
            if (r3 == 0) goto L36
            if (r0 == 0) goto L36
            java.lang.String r2 = "feed_timeline"
            java.lang.String r1 = "feed_timeline_older"
            java.lang.String r0 = "reel_feed_timeline"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r0.contains(r3)
        L36:
            java.lang.String r0 = "seller_shoppable_feed_type"
            java.io.Serializable r3 = r10.getSerializable(r0)
            java.io.Serializable r1 = r10.getSerializable(r4)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto Ld9
            java.lang.String r0 = "request_source"
            java.lang.Object r2 = r1.get(r0)
        L4a:
            com.instagram.api.schemas.SellerShoppableFeedType r0 = com.instagram.api.schemas.SellerShoppableFeedType.A05
            if (r3 != r0) goto L51
            r1 = 1
            if (r2 == 0) goto L52
        L51:
            r1 = 0
        L52:
            java.lang.String r0 = "product_feed_label"
            java.lang.String r8 = r10.getString(r0)
            X.Ilu r7 = A01(r10)
            r6 = 2131627881(0x7f0e0f69, float:1.8883039E38)
            if (r1 == 0) goto L64
            r6 = 2131627882(0x7f0e0f6a, float:1.888304E38)
        L64:
            java.lang.String r2 = "com.bloks.www.minishops.storefront.ig"
            java.lang.String r4 = "instagram_shopping_mini_shop_storefront"
            if (r8 != 0) goto L6e
            java.lang.String r8 = r10.getString(r0)
        L6e:
            r3 = 0
            java.lang.String r0 = "should_show_tab_bar"
            boolean r1 = r10.getBoolean(r0, r3)
            com.instagram.bloks.hosting.IgBloksScreenConfig r5 = X.AbstractC31171DnF.A0C(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.A0N = r0
            r5.A0U = r8
            r5.A0R = r4
            r5.A0l = r1
            X.WpW r0 = new X.WpW
            r0.<init>()
            r5.A02 = r0
            r5.A0R = r4
            r5.A04 = r7
            java.lang.String r0 = "mini_shop_request_builder"
            int r0 = r10.getInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Class<X.IJW> r0 = X.IJW.class
            java.lang.Object r4 = X.AbstractC66261U6f.A01(r0, r1)
            X.IJW r4 = (X.IJW) r4
            if (r4 == 0) goto Le1
            java.util.BitSet r0 = r4.A02
            int r1 = r0.nextClearBit(r3)
            r0 = 1
            if (r1 < r0) goto Ldc
            java.util.Map r0 = r4.A05
            java.util.HashMap r1 = X.AbstractC191768eY.A01(r0)
            java.util.Map r0 = r4.A04
            X.U6x r3 = X.C66277U6x.A02(r2, r1, r0)
            r0 = 777060353(0x2e510001, float:4.75211E-11)
            r3.A00 = r0
            r2 = 0
            r3.A05 = r2
            r0 = 0
            r3.A01 = r0
            r3.A06 = r2
            r3.A03 = r2
            r3.A02 = r2
            r3.A04 = r2
            java.util.Map r0 = r4.A03
            r3.A08(r0)
            android.content.Context r0 = r4.A01
            X.3Nv r0 = r3.A03(r0, r5)
            return r0
        Ld9:
            r2 = 0
            goto L4a
        Ldc:
            java.lang.IllegalStateException r0 = X.AbstractC31173DnH.A0f()
            throw r0
        Le1:
            java.lang.String r0 = "MiniShopIGStorefrontAppControllerScreen couldn't be null. Please make sure you are setting the controller in BloksDataStorage and passing the generated key in arguments"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41769Iel.A09(android.os.Bundle, com.instagram.common.session.UserSession):androidx.fragment.app.Fragment");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0159, code lost:
    
        if ("BROWSE_HEAVY_PDP_LAYOUT".equals(r3.A0L) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03f0  */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.WpW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment A0A(android.os.Bundle r35, com.instagram.common.session.UserSession r36) {
        /*
            Method dump skipped, instructions count: 2433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41769Iel.A0A(android.os.Bundle, com.instagram.common.session.UserSession):androidx.fragment.app.Fragment");
    }

    public final WishListFeedFragment A0E(Integer num, String str, String str2, String str3) {
        WishListFeedFragment wishListFeedFragment = new WishListFeedFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("shopping_session_id", str);
        AbstractC37300Gc1.A0c(A0b, str2);
        A0b.putString("prior_submodule_name", str3);
        if (num != null) {
            A0b.putInt("user_flow_id", num.intValue());
        }
        wishListFeedFragment.setArguments(A0b);
        return wishListFeedFragment;
    }

    public static ArrayList A02(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "Received null FeedItem list from MediaFeedResponse payload on IG ShoppingFragmentFactoryImpl", 817903268);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(AbstractC37302Gc3.A0g(it));
            }
        }
        return A1E;
    }

    public static void A03(Object obj, AbstractMap abstractMap, Map map) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Long) && obj2 != null) {
            abstractMap.put(obj, obj2);
        }
    }

    public static void A04(Object obj, AbstractMap abstractMap, Map map) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Boolean) && obj2 != null) {
            abstractMap.put(obj, obj2);
        }
    }

    public static void A05(Object obj, AbstractMap abstractMap, Map map) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof String) && obj2 != null) {
            abstractMap.put(obj, obj2);
        }
    }

    public static void A06(Object obj, Map map, Map map2) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Boolean) && obj2 != null) {
            map2.put(obj, obj2);
        }
    }

    public static void A07(Object obj, Map map, Map map2) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof String) && obj2 != null) {
            map2.put(obj, obj2);
        }
    }

    public static void A08(Object obj, Map map, Map map2) {
        Object obj2 = map.get(obj);
        if ((obj2 instanceof Long) && obj2 != null) {
            map2.put(obj, obj2);
        }
    }

    public final Fragment A0B(EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("shopping_session_id", str);
        A0b.putString("prior_module_name", str2);
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        A0b.putString("tracking_token", str5);
        A0b.putString("pinned_merchant_id", str4);
        A0b.putString("media_id", str6);
        A0b.putString(TraceFieldType.BroadcastId, str7);
        A0b.putString("risk_features", str8);
        A0b.putString("analytics_referral_component", enumC39651Hig.A00);
        A0b.putString("analytics_referral_experience", enumC39644HiZ.A00);
        A0b.putString("analytics_referral_module", enumC39650Hif.A00);
        A0b.putString("analytics_referral_page", enumC39649Hie.A00);
        A0b.putBoolean("is_rendered_in_wishlist", z);
        if (AbstractC41662Ibu.A02(str3, null)) {
            C14360o3.A0B(userSession, 1);
            String[] strArr = {"prior_module_name", ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "shopping_session_id", "checkout_session_id", "risk_features"};
            String[] strArr2 = {"is_rendered_in_wishlist"};
            HashMap A00 = AbstractC41663Ibv.A00(A0b, strArr2);
            AbstractC41663Ibv.A02(A00);
            if (C18U.A06(C06090Tz.A06, userSession, 36310890471162214L)) {
                A00.put("_PRELOAD_ID_KEY_", "GlobalCart");
            }
            int i = 0;
            do {
                String str9 = strArr[i];
                if (A00.containsKey(str9)) {
                    i++;
                } else {
                    throw AbstractC166987dD.A14(AnonymousClass001.A0g("required param (", str9, ") not found"));
                }
            } while (i < 5);
            new C41731Ie2(new C42584It2(A00), userSession, true, null, null, (String) A00.get("prior_module_name"), (String) A00.get(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY), (String) A00.get("shopping_session_id"), (String) A00.get("media_id")).A03();
            C66277U6x A02 = C66277U6x.A02("com.bloks.www.bloks.commerce.shoppingcart", A00, AbstractC41663Ibv.A01(A0b, A00, strArr2));
            A02.A00 = 0;
            return W6d.A02(AbstractC31171DnF.A0C(userSession), A02);
        }
        ShoppingCartFragment shoppingCartFragment = new ShoppingCartFragment();
        shoppingCartFragment.setArguments(A0b);
        return shoppingCartFragment;
    }

    public final C72743Nv A0C(UserSession userSession, String str, String str2, String str3, HashMap hashMap) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("bloks_params", hashMap);
        return A00(A0b, null, userSession, 37355530, str, str2, str3, R.layout.mini_shop_collection_loading_screen);
    }

    public final MerchantShoppingCartFragment A0D(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("merchant_id", str);
        A0b.putString("shopping_session_id", str2);
        AbstractC37300Gc1.A0c(A0b, str3);
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4);
        A0b.putString("logging_token", str5);
        if (str6 != null) {
            A0b.putString("tracking_token", str6);
        }
        if (str7 != null) {
            A0b.putString("global_bag_entry_point", str7);
        }
        if (str8 != null) {
            A0b.putString("global_bag_prior_module", str8);
        }
        if (str10 != null) {
            A0b.putString(AbstractC111324zv.A00(2912), str10);
        }
        if (l != null) {
            A0b.putLong("user_flow_id", l.longValue());
        }
        A0b.putString("checkout_session_id", str9);
        A0b.putBoolean("is_rendered_in_wishlist", z2);
        A0b.putString("media_id", str11);
        A0b.putString(TraceFieldType.BroadcastId, str12);
        A0b.putBoolean("is_modal", z);
        MerchantShoppingCartFragment merchantShoppingCartFragment = new MerchantShoppingCartFragment();
        merchantShoppingCartFragment.setArguments(A0b);
        return merchantShoppingCartFragment;
    }

    public final C38906HBd A0G(UserSession userSession, AbstractC39667Hiw abstractC39667Hiw, User user, String str, String str2, String str3, String str4, ArrayList arrayList) {
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        if (user != null) {
            A05.putString("displayed_user_id", user.getId());
            A05.putString("displayed_username", user.getUsername());
        }
        if (arrayList != null) {
            A05.putParcelableArrayList("merchants", arrayList);
        }
        AbstractC37300Gc1.A0c(A05, str);
        A05.putString("prior_submodule_name", str2);
        A05.putString("media_id", str3);
        A05.putString("tracking_token", str4);
        C38906HBd c38906HBd = new C38906HBd();
        c38906HBd.A00 = abstractC39667Hiw;
        c38906HBd.setArguments(A05);
        return c38906HBd;
    }

    public final HCK A0H(UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str) {
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        if (shoppingTaggingFeedArguments != null) {
            A05.putParcelable(AbstractC111324zv.A00(3202), shoppingTaggingFeedArguments);
        }
        A05.putString("shopping_session_id", str);
        HCK hck = new HCK();
        hck.setArguments(A05);
        return hck;
    }
}
