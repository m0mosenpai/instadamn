package com.instagram.shopping.fragment.cart;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC23021Ah;
import X.AbstractC25228BEl;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC41356ISb;
import X.AbstractC41666Iby;
import X.AbstractC59962oe;
import X.AbstractC61112qZ;
import X.AbstractC76433bn;
import X.AnonymousClass393;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C1563470e;
import X.C1M1;
import X.C1QS;
import X.C1QT;
import X.C37816GkW;
import X.C38383GuK;
import X.C38678GzJ;
import X.C38887HAj;
import X.C39328HYt;
import X.C3F0;
import X.C41024IEt;
import X.C41169IKi;
import X.C41633IbO;
import X.C41634IbP;
import X.C41636IbR;
import X.C41696IdP;
import X.C41731Ie2;
import X.C41742IeG;
import X.C42255Inf;
import X.C42826Ix2;
import X.C42858IxY;
import X.C42874Ixo;
import X.C42875Ixp;
import X.C42930Iyi;
import X.C51D;
import X.C57012jc;
import X.C57112jm;
import X.C64952wt;
import X.C70623Ez;
import X.C70Y;
import X.C71163Hc;
import X.EnumC153216up;
import X.EnumC27385C6o;
import X.EnumC39539HdB;
import X.EnumC39590He0;
import X.EnumC39622HeW;
import X.H7J;
import X.I6I;
import X.IHF;
import X.IIP;
import X.IMS;
import X.InterfaceC02590Ai;
import X.InterfaceC1571373s;
import X.InterfaceC41501vz;
import X.InterfaceC43453JHr;
import X.InterfaceC43454JHs;
import X.InterfaceC56362iU;
import X.InterfaceC56392iX;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC64872wl;
import X.InterfaceC99144cb;
import X.JPn;
import X.JPo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class ShoppingCartFragment extends AbstractC59962oe implements C1M1, InterfaceC60442pS, InterfaceC60072op, C51D, InterfaceC64872wl, InterfaceC60122ou, InterfaceC43453JHr, InterfaceC1571373s, JPo {
    public long A00;
    public UserFlowLogger A01;
    public UserSession A02;
    public IgFundedIncentive A03;
    public MultiProductComponent A04;
    public C41169IKi A06;
    public PinnedLinearLayoutManager A07;
    public C41731Ie2 A08;
    public InterfaceC43454JHs A0A;
    public IHF A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public boolean A0K;
    public IMS A0L;
    public C41633IbO A0M;
    public JPn A0N;
    public C41742IeG A0O;
    public String A0P;
    public List A0Q;
    public List A0R;
    public boolean A0S;
    public boolean A0T;
    public C57012jc mProductCollectionStub;
    public RecyclerView mRecyclerView;
    public final InterfaceC41501vz A0U = C37816GkW.A00(this, 19);
    public final C38383GuK A0V = new C38383GuK();
    public final C57112jm A0W = C57112jm.A00();
    public EnumC39539HdB A09 = EnumC39539HdB.A04;
    public EnumC39590He0 A05 = EnumC39590He0.A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    public static void A00(C38887HAj c38887HAj, EnumC39539HdB enumC39539HdB, ShoppingCartFragment shoppingCartFragment) {
        String str;
        List A1J;
        MultiProductComponent multiProductComponent;
        if (c38887HAj != null) {
            shoppingCartFragment.A0R = AbstractC31172DnG.A19(c38887HAj.A02);
            boolean z = shoppingCartFragment.A0K;
            ?? A19 = AbstractC31172DnG.A19(c38887HAj.A01);
            if (z) {
                A19 = AbstractC166987dD.A1F(A19);
                for (int i = 0; i < A19.size(); i++) {
                    User user = ((C41634IbP) A19.get(i)).A05;
                    if (user != null && AbstractC76433bn.A00(user) != null && AbstractC76433bn.A00(user).equalsIgnoreCase(shoppingCartFragment.A0F)) {
                        A19.add(0, A19.remove(i));
                    }
                }
            }
            shoppingCartFragment.A0Q = A19;
            shoppingCartFragment.A0J = AbstractC166987dD.A1E();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (IIP iip : shoppingCartFragment.A0R) {
                A1E.add(iip.A01);
                shoppingCartFragment.A0E = iip.A02;
                shoppingCartFragment.A0J.add(iip.A03);
            }
            IHF ihf = shoppingCartFragment.A0B;
            List list = shoppingCartFragment.A0J;
            C14360o3.A0B(list, 0);
            C38678GzJ c38678GzJ = ihf.A02.A01;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it), A1E2);
            }
            c38678GzJ.A00 = A1E2;
            if (AbstractC31172DnG.A19(c38887HAj.A03).isEmpty()) {
                multiProductComponent = null;
            } else {
                multiProductComponent = (MultiProductComponent) AbstractC31172DnG.A19(c38887HAj.A03).get(0);
            }
            shoppingCartFragment.A04 = multiProductComponent;
            if (multiProductComponent != null && !AbstractC37301Gc2.A1b(multiProductComponent.A03.A03)) {
                EnumC39590He0 enumC39590He0 = EnumC39590He0.A05;
                shoppingCartFragment.A05 = enumC39590He0;
                Class cls = enumC39590He0.A00;
                if (cls != null) {
                    PinnedLinearLayoutManager pinnedLinearLayoutManager = shoppingCartFragment.A07;
                    pinnedLinearLayoutManager.A01 = cls;
                    pinnedLinearLayoutManager.A03 = "product_collection_view_model_key";
                    pinnedLinearLayoutManager.A00 = null;
                    pinnedLinearLayoutManager.A02 = null;
                }
            }
            shoppingCartFragment.A03 = c38887HAj.A00;
        }
        EnumC39539HdB enumC39539HdB2 = EnumC39539HdB.A02;
        if (enumC39539HdB == enumC39539HdB2 && c38887HAj != null) {
            C41696IdP.A00(I6I.A00(shoppingCartFragment.A02), 37362470, true);
            shoppingCartFragment.A09 = EnumC39539HdB.A03;
        } else {
            shoppingCartFragment.A09 = enumC39539HdB;
        }
        if (!shoppingCartFragment.A0S && enumC39539HdB != EnumC39539HdB.A04) {
            shoppingCartFragment.A0S = true;
            if (enumC39539HdB == enumC39539HdB2 && c38887HAj == null) {
                I6I.A00(shoppingCartFragment.A02).A02();
                C41731Ie2 c41731Ie2 = shoppingCartFragment.A08;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41731Ie2.A02, "instagram_shopping_bag_index_load_failure");
                String str2 = c41731Ie2.A00;
                if (str2 != null) {
                    A0f.AAP("global_bag_entry_point", str2);
                    String str3 = c41731Ie2.A04;
                    if (str3 != null) {
                        A0f.AAP("global_bag_prior_module", str3);
                        String str4 = c41731Ie2.A08;
                        if (str4 == null) {
                            str4 = "";
                        }
                        AbstractC37300Gc1.A0t(A0f, str4);
                        A0f.Cht();
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else if (enumC39539HdB == EnumC39539HdB.A03 && c38887HAj != null) {
                C41696IdP.A00(I6I.A00(shoppingCartFragment.A02), 37361281, false);
                Integer A06 = C70Y.A00(shoppingCartFragment.A02).A06();
                A06.getClass();
                int intValue = A06.intValue();
                C41731Ie2 c41731Ie22 = shoppingCartFragment.A08;
                String str5 = shoppingCartFragment.A0E;
                List list2 = shoppingCartFragment.A0J;
                list2.getClass();
                IgFundedIncentive igFundedIncentive = shoppingCartFragment.A03;
                if (igFundedIncentive != null) {
                    str = igFundedIncentive.A07;
                } else {
                    str = null;
                }
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c41731Ie22.A02, "instagram_shopping_bag_index_load_success");
                String str6 = c41731Ie22.A00;
                if (str6 != null) {
                    A0f2.AAP("global_bag_entry_point", str6);
                    String str7 = c41731Ie22.A04;
                    if (str7 != null) {
                        A0f2.AAP("global_bag_prior_module", str7);
                        A0f2.A9K("total_item_count", AbstractC31171DnF.A0V(intValue));
                        AbstractC37300Gc1.A0t(A0f2, c41731Ie22.A08);
                        if (str == null) {
                            A1J = null;
                        } else {
                            A1J = AbstractC166987dD.A1J(AbstractC25228BEl.A13(str));
                        }
                        A0f2.AAk("ig_funded_discount_ids", A1J);
                        if (str5 != null) {
                            A0f2.A9K("global_bag_id", AbstractC166997dE.A0j(str5));
                        }
                        if (!list2.isEmpty()) {
                            ArrayList A1E3 = AbstractC166987dD.A1E();
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                AbstractC31177DnL.A1R(AbstractC166987dD.A1B(it2), A1E3);
                            }
                            A0f2.AAk("merchant_bag_ids", A1E3);
                        }
                        A0f2.Cht();
                        shoppingCartFragment.A01.flowStart(shoppingCartFragment.A00, new UserFlowConfig("index_cart_entry", false));
                        List list3 = shoppingCartFragment.A0R;
                        if (list3 != null) {
                            shoppingCartFragment.A01.flowAnnotate(shoppingCartFragment.A00, "num_carts", list3.size());
                            if (list3.size() == 1) {
                                String str8 = shoppingCartFragment.A0D;
                                if (!str8.equals("live_viewer_product_feed") && !str8.equals("bottom_sheet_pdp")) {
                                    shoppingCartFragment.A0T = true;
                                    A02(shoppingCartFragment, ((IIP) list3.get(0)).A01, null, "index_view", true);
                                    return;
                                }
                            }
                        }
                        if (intValue == 0 && (!AbstractC23021Ah.A00(shoppingCartFragment.A02).A1u())) {
                            AbstractC41356ISb.A00(shoppingCartFragment.requireActivity(), shoppingCartFragment, shoppingCartFragment.A02, shoppingCartFragment.A0H, "");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        A01(shoppingCartFragment);
    }

    @Override // X.InterfaceC64882wm
    public final JPn Bh2() {
        JPn jPn = this.A0N;
        if (jPn == null) {
            C42930Iyi c42930Iyi = new C42930Iyi(this.A01, this, this.A0L, this.A00);
            this.A0N = c42930Iyi;
            return c42930Iyi;
        }
        return jPn;
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
    }

    @Override // X.InterfaceC64872wl
    public final void E0q(EnumC39622HeW enumC39622HeW, InterfaceC99144cb interfaceC99144cb, int i) {
    }

    @Override // X.InterfaceC64872wl
    public final void E0v(InterfaceC99144cb interfaceC99144cb, User user) {
    }

    @Override // X.InterfaceC64872wl
    public final void E0z(InterfaceC99144cb interfaceC99144cb) {
    }

    @Override // X.InterfaceC64872wl
    public final void E10(InterfaceC99144cb interfaceC99144cb) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_bag_index";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.instagram.shopping.fragment.cart.ShoppingCartFragment r11) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.cart.ShoppingCartFragment.A01(com.instagram.shopping.fragment.cart.ShoppingCartFragment):void");
    }

    public static void A02(ShoppingCartFragment shoppingCartFragment, User user, String str, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6 = str2;
        shoppingCartFragment.A01.flowMarkPoint(shoppingCartFragment.A00, "cart_selected");
        InterfaceC43454JHs interfaceC43454JHs = shoppingCartFragment.A0A;
        String str7 = shoppingCartFragment.A0H;
        if (z) {
            str3 = shoppingCartFragment.A0G;
        } else {
            str3 = "instagram_shopping_bag_index";
        }
        if (z) {
            str6 = shoppingCartFragment.A0D;
            str5 = null;
            str4 = null;
        } else {
            str4 = shoppingCartFragment.A0G;
            str5 = shoppingCartFragment.A0D;
        }
        interfaceC43454JHs.CrJ(user, Long.valueOf(shoppingCartFragment.A00), str7, str3, str6, str4, str5, shoppingCartFragment.A0I, str, shoppingCartFragment.A0P, shoppingCartFragment.A0C);
    }

    @Override // X.InterfaceC64872wl
    public final void AA0(InterfaceC99144cb interfaceC99144cb, int i) {
        this.A0L.A05.A03(interfaceC99144cb, ((MultiProductComponent) interfaceC99144cb).A00(), i);
    }

    @Override // X.JPo
    public final void AAp(ProductFeedItem productFeedItem, C41024IEt c41024IEt) {
        MultiProductComponent multiProductComponent = this.A04;
        if (multiProductComponent != null) {
            this.A0M.A02(c41024IEt, new H7J(productFeedItem, multiProductComponent.A06), null);
        }
    }

    @Override // X.JHK
    public final void Cvf(Product product) {
        C1563470e A0G = AbstractC37300Gc1.A0G(this.A02);
        if (A0G.A00 == A0G.A02) {
            AbstractC41666Iby.A02(new C42858IxY(this.A02).BSe(requireContext(), this.A02), 0, "cart_item_limit_reached_user_error");
            return;
        }
        List<ProductVariantPossibleValueDictIntf> list = product.A0O;
        if (list != null && !list.isEmpty()) {
            HashMap A1G = AbstractC166987dD.A1G();
            if (list.isEmpty()) {
                throw AbstractC31172DnG.A0u();
            }
            if (list.isEmpty()) {
                throw AbstractC31172DnG.A0u();
            }
            for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                if (productVariantPossibleValueDictIntf.CGx() == ProductVariantVisualStyle.A05) {
                    A1G.put(productVariantPossibleValueDictIntf.getId(), productVariantPossibleValueDictIntf.getValue());
                }
            }
            if (list.isEmpty()) {
                throw AbstractC31172DnG.A0u();
            }
            list.size();
            A1G.size();
        }
        AbstractC37300Gc1.A0G(this.A02).A0C(new C39328HYt(this, product, product), product, AbstractC37300Gc1.A0T(product));
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
        this.A01.flowStart(this.A00, new UserFlowConfig(this.A0G, false));
        this.A01.flowAnnotate(this.A00, "num_carts", 0);
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        this.A01.flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
    }

    @Override // X.InterfaceC43453JHr
    public final void DSr(User user) {
        AbstractC37301Gc2.A1P(this, user, "index_view_merchant_avatar");
    }

    @Override // X.InterfaceC43453JHr
    public final void DSt(User user) {
        AbstractC37301Gc2.A1P(this, user, "index_view_merchant_name");
    }

    @Override // X.InterfaceC43453JHr
    public final void DSu(User user) {
        AbstractC37301Gc2.A1P(this, user, "index_view_row");
    }

    @Override // X.InterfaceC43453JHr
    public final void DSv(User user) {
        AbstractC37301Gc2.A1P(this, user, "index_view_subtitle");
    }

    @Override // X.JHK
    public final void Db8(Product product) {
        this.A01.flowMarkPoint(this.A00, "visit_pdp");
        this.A0A.Cra(product, this.A0H, this.A0G, "shopping_bag_product_collection");
    }

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
        this.A01.flowMarkPoint(this.A00, "visit_storefront");
        this.A0A.Cri(unavailableProduct.BSW(), this.A0H, this.A0G, this.A0D, "unavailable_product_card");
    }

    @Override // X.InterfaceC64872wl
    public final void EDe(View view, InterfaceC99144cb interfaceC99144cb) {
        this.A0L.A05.A01(view, interfaceC99144cb, ((MultiProductComponent) interfaceC99144cb).A00());
    }

    @Override // X.JPo
    public final void EDt(View view, ProductFeedItem productFeedItem) {
        MultiProductComponent multiProductComponent = this.A04;
        if (multiProductComponent != null) {
            this.A0M.A01(view, new H7J(productFeedItem, multiProductComponent.A06));
        }
    }

    @Override // X.InterfaceC64872wl
    public final void F9g(View view) {
        this.A0L.A05.A00.A04(view);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i = 2131973957;
        if (this.A0K) {
            i = 2131963258;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A0H;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        this.A01.flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC43454JHs c42874Ixo;
        int A02 = C0f9.A02(-1286395214);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31176DnK.A0S(this);
        this.A0H = AbstractC61112qZ.A00(requireArguments);
        this.A0G = AbstractC31173DnH.A0j(requireArguments, "prior_module_name");
        this.A0D = AbstractC31173DnH.A0j(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A0F = requireArguments.getString("pinned_merchant_id");
        this.A0I = requireArguments.getString("tracking_token");
        this.A0P = requireArguments.getString("media_id");
        this.A0C = requireArguments.getString(TraceFieldType.BroadcastId);
        this.A0K = AbstractC31178DnM.A1X(C06090Tz.A05, this.A02, 36311023614951841L);
        this.A06 = new C41169IKi(requireContext(), this, this.A0V, this.A02, this, this.A0K);
        this.A0O = new C41742IeG(requireActivity(), this.A02);
        C41696IdP A00 = I6I.A00(this.A02);
        String str = this.A0G;
        C14360o3.A0B(str, 0);
        C41696IdP.A01(A00, str, "instagram_shopping_bag_index", 37361281);
        C57112jm A002 = AnonymousClass393.A00(this);
        UserSession userSession = this.A02;
        String str2 = this.A0H;
        String str3 = this.A0G;
        String obj = EnumC39622HeW.A04.toString();
        String str4 = null;
        AbstractC167017dG.A1Q(userSession, A002);
        this.A0M = new C41633IbO(userSession, A002, this, new C64952wt(this, userSession, str2, str4, obj, str3, str4, str4, str4, str4, str4, str4, str4, -1), str2, str3, null, null, null);
        UserSession userSession2 = this.A02;
        String str5 = this.A0G;
        String str6 = this.A0D;
        this.A0B = new IHF(new C38678GzJ(null, this.A0E, str6, str5, null, null, null), this, userSession2, A002, new ShoppingNavigationInfo(null, str5, str6, this.A0H), null);
        C41636IbR c41636IbR = new C41636IbR(this, this.A02, this, EnumC39622HeW.A0P, this.A0H, this.A0G, null);
        c41636IbR.A00 = this.A0W;
        this.A0L = c41636IbR.A01();
        Fragment fragment = this.mParentFragment;
        if (fragment instanceof BottomSheetFragment) {
            c42874Ixo = new C42875Ixp(this, this.A02, this, (BottomSheetFragment) fragment);
        } else {
            c42874Ixo = new C42874Ixo(this, this.A02, this);
        }
        this.A0A = c42874Ixo;
        C41731Ie2 c41731Ie2 = new C41731Ie2(this, this.A02, false, "index_view_buy_now", "index_view_buy_now", this.A0D, this.A0G, this.A0H, this.A0P);
        this.A08 = c41731Ie2;
        c41731Ie2.A03();
        C1QT A003 = C1QS.A00(this.A02);
        this.A01 = A003;
        this.A00 = A003.generateNewFlowId(37363419);
        C0f9.A09(-457034828, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1201934817);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        C0f9.A09(-1958080435, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-2017454704);
        super.onDestroy();
        AbstractC25651Mw.A00(this.A02).A02(this.A0U, C42255Inf.class);
        C0f9.A09(1629214776, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2091305730);
        super.onDestroyView();
        ShoppingCartFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-1194755665, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC10360h2 abstractC10360h2;
        int A02 = C0f9.A02(1120799360);
        super.onResume();
        if (this.A0T && (abstractC10360h2 = this.mFragmentManager) != null && !(this.mParentFragment instanceof BottomSheetFragment)) {
            this.A0T = false;
            abstractC10360h2.A0b();
        }
        C0f9.A09(1494289431, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC39590He0 enumC39590He0;
        EnumC39539HdB enumC39539HdB;
        super.onViewCreated(view, bundle);
        this.mRecyclerView = AbstractC31176DnK.A0F(view);
        this.A0W.A06(this.mRecyclerView, C71163Hc.A00(this));
        this.A07 = new PinnedLinearLayoutManager(requireContext(), new C42826Ix2(this));
        MultiProductComponent multiProductComponent = this.A04;
        if (multiProductComponent != null && !AbstractC37301Gc2.A1b(multiProductComponent.A03.A03)) {
            enumC39590He0 = EnumC39590He0.A05;
        } else {
            enumC39590He0 = EnumC39590He0.A04;
        }
        this.A05 = enumC39590He0;
        Class cls = enumC39590He0.A00;
        if (enumC39590He0 != EnumC39590He0.A04 && cls != null) {
            PinnedLinearLayoutManager pinnedLinearLayoutManager = this.A07;
            String str = enumC39590He0.A01;
            pinnedLinearLayoutManager.A01 = cls;
            pinnedLinearLayoutManager.A03 = str;
            pinnedLinearLayoutManager.A00 = null;
            pinnedLinearLayoutManager.A02 = null;
        }
        this.mRecyclerView.setLayoutManager(this.A07);
        this.mRecyclerView.setAdapter(this.A06.A09);
        this.mRecyclerView.setImportantForAccessibility(2);
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        this.mRecyclerView.setItemAnimator(c70623Ez);
        this.A0V.A00(this.mRecyclerView, "ShoppingCartFragment");
        C38887HAj A03 = C70Y.A00(this.A02).A03();
        if (A03 == null) {
            enumC39539HdB = EnumC39539HdB.A04;
        } else {
            C41696IdP.A00(I6I.A00(this.A02), 37361281, true);
            enumC39539HdB = EnumC39539HdB.A03;
        }
        A00(A03, enumC39539HdB, this);
        if (this.A0R == null && this.A0Q == null) {
            C70Y.A00(this.A02).A07(null);
        }
        AbstractC25651Mw.A00(this.A02).A01(this.A0U, C42255Inf.class);
    }
}
