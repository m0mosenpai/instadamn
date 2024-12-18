package com.instagram.shopping.fragment.cart;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC53242c7;
import X.AbstractC58442PvL;
import X.AbstractC59962oe;
import X.AbstractC61112qZ;
import X.AbstractC64962wu;
import X.AbstractC85953sP;
import X.AnonymousClass393;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C1563470e;
import X.C1563870i;
import X.C189478aR;
import X.C1M1;
import X.C25671My;
import X.C31349DqE;
import X.C33172EkJ;
import X.C37816GkW;
import X.C38383GuK;
import X.C38400Gub;
import X.C38678GzJ;
import X.C3F0;
import X.C41032IFb;
import X.C41208ILx;
import X.C41633IbO;
import X.C41634IbP;
import X.C41696IdP;
import X.C41730Ie1;
import X.C41731Ie2;
import X.C41742IeG;
import X.C41745IeJ;
import X.C42246InW;
import X.C42248InY;
import X.C42294IoI;
import X.C42824Ix0;
import X.C42825Ix1;
import X.C42876Ixq;
import X.C42877Ixr;
import X.C43079J2u;
import X.C51D;
import X.C57112jm;
import X.C64952wt;
import X.C64972wv;
import X.C70623Ez;
import X.C70Y;
import X.C71I;
import X.C85973sR;
import X.EnumC27385C6o;
import X.EnumC39539HdB;
import X.EnumC39622HeW;
import X.H7I;
import X.I6I;
import X.IH1;
import X.IHF;
import X.II7;
import X.InterfaceC41501vz;
import X.InterfaceC43425JGp;
import X.InterfaceC56362iU;
import X.InterfaceC56392iX;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC66382zF;
import X.J15;
import X.J3V;
import X.JI0;
import X.JWZ;
import X.JXP;
import X.ViewOnClickListenerC42033Ik2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class MerchantShoppingCartFragment extends AbstractC59962oe implements C1M1, InterfaceC60442pS, C51D, InterfaceC60122ou {
    public int A00;
    public C38678GzJ A01;
    public UserSession A02;
    public C31349DqE A03;
    public CheckoutLaunchParams A04;
    public IgFundedIncentive A05;
    public MultiProductComponent A06;
    public C41745IeJ A07;
    public II7 A08;
    public C41731Ie2 A09;
    public JI0 A0B;
    public C64972wv A0C;
    public IH1 A0D;
    public C41634IbP A0E;
    public C41730Ie1 A0F;
    public C41208ILx A0G;
    public IHF A0H;
    public C41633IbO A0I;
    public C41742IeG A0J;
    public InterfaceC43425JGp A0K;
    public Runnable A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public Map A0Z;
    public Set A0a;
    public boolean A0b;
    public boolean A0c;
    public String A0d;
    public String A0e;
    public boolean A0f;
    public boolean A0g;
    public RecyclerView mRecyclerView;
    public final InterfaceC41501vz A0i = C37816GkW.A00(this, 15);
    public final InterfaceC41501vz A0j = C37816GkW.A00(this, 16);
    public final InterfaceC41501vz A0l = C37816GkW.A00(this, 17);
    public final InterfaceC41501vz A0k = C37816GkW.A00(this, 18);
    public final C38383GuK A0m = new C38383GuK();
    public final C42824Ix0 A0n = new C42824Ix0(this);
    public final InterfaceC66382zF A0h = new JWZ(this, 2);
    public EnumC39539HdB A0A = EnumC39539HdB.A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Efu(2131973957);
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_merchant_bag";
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
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A08 = new II7((ViewGroup) view.requireViewById(R.id.merchant_cart_footer_container), this.A02);
        Context requireContext = requireContext();
        UserSession userSession = this.A02;
        C42824Ix0 c42824Ix0 = this.A0n;
        C38383GuK c38383GuK = this.A0m;
        this.A07 = new C41745IeJ(requireContext, this, c38383GuK, userSession, c42824Ix0, this.A0Z);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.mRecyclerView = A0F;
        A0F.setImportantForAccessibility(2);
        PinnedLinearLayoutManager pinnedLinearLayoutManager = new PinnedLinearLayoutManager(requireContext(), new C42825Ix1(this));
        pinnedLinearLayoutManager.A01 = C42294IoI.class;
        pinnedLinearLayoutManager.A03 = "product_collection";
        pinnedLinearLayoutManager.A00 = H7I.class;
        pinnedLinearLayoutManager.A02 = "footer_gap_view_model_key";
        this.mRecyclerView.setLayoutManager(pinnedLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A07.A08);
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        this.mRecyclerView.setItemAnimator(c70623Ez);
        c38383GuK.A00(this.mRecyclerView, "MerchantShoppingCartFragment");
        C41634IbP A04 = C70Y.A00(this.A02).A04(this.A0U);
        if (A04 == null) {
            A00(EnumC39539HdB.A04, this, null);
        } else {
            C41696IdP.A00(I6I.A00(this.A02), 37362470, true);
            A00(EnumC39539HdB.A03, this, A04);
        }
        C25671My A00 = AbstractC25651Mw.A00(this.A02);
        A00.A01(this.A0i, C71I.class);
        A00.A01(this.A0j, C1563870i.class);
        A00.A01(this.A0l, C42246InW.class);
        A00.A01(this.A0k, C42248InY.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fe, code lost:
    
        if (r4.compareTo(r14.A02) > 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.EnumC39539HdB r31, com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r32, X.C41634IbP r33) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment.A00(X.HdB, com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment, X.IbP):void");
    }

    public static void A01(MerchantShoppingCartFragment merchantShoppingCartFragment) {
        C43079J2u A00;
        if (merchantShoppingCartFragment.A0L == null) {
            II7 ii7 = merchantShoppingCartFragment.A08;
            C41634IbP c41634IbP = merchantShoppingCartFragment.A0E;
            C42824Ix0 c42824Ix0 = merchantShoppingCartFragment.A0n;
            C14360o3.A0B(ii7, 0);
            AbstractC167017dG.A1P(c41634IbP, c42824Ix0);
            if (AbstractC37301Gc2.A1b(c41634IbP.A06)) {
                ii7.A00.setVisibility(8);
            } else {
                boolean z = false;
                ii7.A00.setVisibility(0);
                C41032IFb c41032IFb = c41634IbP.A03;
                if (c41032IFb != null && c41032IFb.A01 != null) {
                    C43079J2u c43079J2u = c41634IbP.A02;
                    C14360o3.A07(c43079J2u);
                    CurrencyAmountInfoImpl currencyAmountInfoImpl = c41634IbP.A04.A00;
                    if (currencyAmountInfoImpl == null) {
                        A00 = null;
                    } else {
                        A00 = C43079J2u.A00(currencyAmountInfoImpl);
                    }
                    int i = c41634IbP.A01;
                    C38400Gub c38400Gub = ii7.A02;
                    C14360o3.A0B(c38400Gub, 0);
                    TextView textView = c38400Gub.A00;
                    Context context = textView.getContext();
                    c38400Gub.A02.setText(AbstractC167017dG.A0k(context.getResources(), i, R.plurals.shopping_cart_subtotal_title_text));
                    if (A00 == null) {
                        c38400Gub.A01.setVisibility(8);
                    } else if (A00.compareTo(c43079J2u) <= 0) {
                        TextView textView2 = c38400Gub.A01;
                        textView2.setVisibility(0);
                        AbstractC166987dD.A1P(context, textView2, 2131962820);
                    } else {
                        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC167007dF.A0f(context, new C43079J2u(A00.A01, A00.A02.subtract(c43079J2u.A02), A00.A00).toString(), 2131966347));
                        TextView textView3 = c38400Gub.A01;
                        textView3.setVisibility(0);
                        textView3.setText(A0H);
                    }
                    textView.setText(c43079J2u.toString());
                }
                View.OnClickListener viewOnClickListenerC42033Ik2 = new ViewOnClickListenerC42033Ik2(c42824Ix0, 19);
                if (!c41634IbP.A08 && !c41634IbP.A09.isEmpty()) {
                    z = true;
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = ii7.A01;
                igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
                igdsBottomButtonLayout.setPrimaryActionOnClickListener(viewOnClickListenerC42033Ik2);
                Context context2 = igdsBottomButtonLayout.getContext();
                C14360o3.A0A(context2);
                String A0q = AbstractC166997dE.A0q(context2.getResources(), 2131969404);
                Drawable A01 = AbstractC85953sP.A01(context2, R.drawable.instagram_lock_filled_12, AbstractC53242c7.A0B(context2));
                if (A01 != null) {
                    SpannableStringBuilder A012 = AbstractC37300Gc1.A01();
                    int length = A012.length();
                    int A04 = AbstractC166997dE.A04(context2, R.dimen.account_discovery_bottom_gap);
                    A01.setBounds(0, 0, (A01.getIntrinsicWidth() * A04) / A01.getIntrinsicHeight(), A04);
                    C85973sR c85973sR = new C85973sR(A01);
                    c85973sR.A02 = C05F.A00;
                    c85973sR.A01 = AbstractC167017dG.A04(context2);
                    A012.append((CharSequence) "c");
                    A012.setSpan(c85973sR, length, "c".length() + length, 33);
                    A012.append((CharSequence) A0q);
                    igdsBottomButtonLayout.setFooterText(A012);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (merchantShoppingCartFragment.A08.A00.getVisibility() == 0 && merchantShoppingCartFragment.A00 == 0) {
                merchantShoppingCartFragment.requireView().getViewTreeObserver().addOnGlobalLayoutListener(new JXP(merchantShoppingCartFragment, 7));
            } else {
                merchantShoppingCartFragment.A07.A04(merchantShoppingCartFragment.A00);
                C41745IeJ c41745IeJ = merchantShoppingCartFragment.A07;
                EnumC39539HdB enumC39539HdB = merchantShoppingCartFragment.A0A;
                C41634IbP c41634IbP2 = merchantShoppingCartFragment.A0E;
                IH1 ih1 = merchantShoppingCartFragment.A0D;
                MultiProductComponent multiProductComponent = merchantShoppingCartFragment.A06;
                String str = merchantShoppingCartFragment.A0W;
                IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
                Set set = merchantShoppingCartFragment.A0a;
                InterfaceC66382zF interfaceC66382zF = merchantShoppingCartFragment.A0h;
                C14360o3.A0B(enumC39539HdB, 0);
                c41745IeJ.A04 = c41634IbP2;
                c41745IeJ.A03 = ih1;
                c41745IeJ.A02 = multiProductComponent;
                c41745IeJ.A05 = str;
                c41745IeJ.A01 = igFundedIncentive;
                c41745IeJ.A00 = interfaceC66382zF;
                c41745IeJ.A06 = set;
                C41745IeJ.A02(c41745IeJ);
            }
            if (merchantShoppingCartFragment.A0W != null && merchantShoppingCartFragment.A0E != null) {
                merchantShoppingCartFragment.A0L = new J3V(merchantShoppingCartFragment);
                merchantShoppingCartFragment.requireView().postDelayed(merchantShoppingCartFragment.A0L, 500L);
            }
            C41696IdP.A00(I6I.A00(merchantShoppingCartFragment.A02), 37362470, false);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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
        return this.A0N;
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
        String A02;
        JI0 c42877Ixr;
        int A022 = C0f9.A02(-1791154648);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC31176DnK.A0S(this);
        this.A0X = AbstractC61112qZ.A00(requireArguments);
        this.A0U = AbstractC31173DnH.A0j(requireArguments, "merchant_id");
        this.A0O = AbstractC31173DnH.A0j(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A0S = requireArguments.getString("logging_token");
        this.A0Y = requireArguments.getString("tracking_token");
        this.A0V = AbstractC31173DnH.A0j(requireArguments, "prior_module_name");
        C41696IdP A00 = I6I.A00(this.A02);
        String str = this.A0V;
        C14360o3.A0B(str, 0);
        C41696IdP.A01(A00, str, "instagram_shopping_merchant_bag", 37362470);
        this.A0g = requireArguments.getBoolean("is_modal");
        this.A0d = requireArguments.getString("tooltip_text");
        this.A0Z = (HashMap) requireArguments.getSerializable(AbstractC111324zv.A00(2998));
        if (requireArguments.containsKey("checkout_session_id")) {
            A02 = AbstractC31173DnH.A0j(requireArguments, "checkout_session_id");
        } else {
            A02 = AbstractC58442PvL.A02();
        }
        this.A0N = A02;
        this.A0W = requireArguments.getString(AbstractC111324zv.A00(2912));
        this.A0P = requireArguments.getString("global_bag_entry_point");
        this.A0R = requireArguments.getString("global_bag_prior_module");
        this.A0e = requireArguments.getString("media_id");
        this.A0M = requireArguments.getString(TraceFieldType.BroadcastId);
        FragmentActivity activity = getActivity();
        String str2 = null;
        this.A0C = AbstractC64962wu.A01(getContext(), activity, this.A02, this, this.A0V, this.A0X);
        this.A0J = new C41742IeG(requireActivity(), this.A02);
        C57112jm A002 = AnonymousClass393.A00(this);
        UserSession userSession = this.A02;
        EnumC39622HeW enumC39622HeW = EnumC39622HeW.A04;
        String str3 = this.A0X;
        String str4 = this.A0V;
        String obj = enumC39622HeW.toString();
        AbstractC167017dG.A1Q(userSession, A002);
        this.A0I = new C41633IbO(userSession, A002, this, new C64952wt(this, userSession, str3, str2, obj, str4, str2, str2, str2, str2, str2, str2, str2, -1), str3, str4, null, null, null);
        Fragment fragment = this.mParentFragment;
        if (fragment instanceof BottomSheetFragment) {
            fragment.getClass();
            c42877Ixr = new C42876Ixq(this, this.A02, this, (BottomSheetFragment) fragment);
        } else {
            c42877Ixr = new C42877Ixr(this, this.A02, this, new C33172EkJ(this, 7), new J15(this, 1));
        }
        this.A0B = c42877Ixr;
        C41731Ie2 c41731Ie2 = new C41731Ie2(this, this.A02, false, this.A0O, this.A0V, this.A0P, this.A0R, this.A0X, this.A0e);
        this.A09 = c41731Ie2;
        this.A0G = new C41208ILx(this.A02, A002, c41731Ie2, this.A0U, this.A0N);
        C1563470e A0O = AbstractC37301Gc2.A0O(this);
        this.A0Q = A0O.A01;
        String A09 = A0O.A09(this.A0U);
        this.A0T = A09;
        String str5 = this.A0N;
        String str6 = this.A0Q;
        String str7 = this.A0P;
        String str8 = this.A0R;
        String str9 = this.A0O;
        String str10 = this.A0V;
        C38678GzJ c38678GzJ = new C38678GzJ(str5, str6, str7, str8, A09, str9, str10);
        this.A01 = c38678GzJ;
        this.A0H = new IHF(c38678GzJ, this, this.A02, A002, new ShoppingNavigationInfo(null, str10, str9, this.A0X), this.A0U);
        this.A09.A05(this.A0U, this.A0N, this.A0Q, this.A0T, this.A0d);
        C0f9.A09(385100697, A022);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1946111738);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_merchant_cart_fragment);
        C0f9.A09(624506287, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-464738874);
        super.onDestroy();
        AbstractC25651Mw.A00(this.A02).A02(this.A0j, C1563870i.class);
        C0f9.A09(262415708, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1246199941);
        super.onDestroyView();
        this.mRecyclerView = null;
        C25671My A00 = AbstractC25651Mw.A00(this.A02);
        A00.A02(this.A0i, C71I.class);
        A00.A02(this.A0l, C42246InW.class);
        A00.A02(this.A0k, C42248InY.class);
        C0f9.A09(-1680295611, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-526713672);
        super.onPause();
        AbstractC37301Gc2.A0O(this).A0B();
        C38383GuK c38383GuK = this.A0m;
        Map map = c38383GuK.A00;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((RecyclerView) it.next()).A15(c38383GuK);
        }
        map.clear();
        C31349DqE c31349DqE = this.A03;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
            this.A03 = null;
        }
        C0f9.A09(-801154724, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1949225126);
        super.onResume();
        if (this.A0c) {
            this.A0c = false;
            if (this.A0g) {
                AbstractC25227BEk.A1B(this);
            } else if (this.mParentFragment instanceof BottomSheetFragment) {
                C189478aR c189478aR = ((BottomSheetFragment) requireParentFragment()).A02;
                c189478aR.getClass();
                c189478aR.A08();
            } else {
                AbstractC25226BEj.A1P(this);
            }
        }
        C0f9.A09(-1554473589, A02);
    }
}
