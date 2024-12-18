package com.instagram.business.fragment;

import X.AbstractC018607g;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC13670mt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.AbstractC28393Cfw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35211Fg4;
import X.AnonymousClass001;
import X.C00O;
import X.C05F;
import X.C08790ch;
import X.C0f9;
import X.C0fA;
import X.C106904rr;
import X.C14270nr;
import X.C14360o3;
import X.C18C;
import X.C1GJ;
import X.C1ON;
import X.C1Q2;
import X.C25621Ms;
import X.C2JM;
import X.C31456Ds0;
import X.C31722DwR;
import X.C32404EPf;
import X.C32540EUq;
import X.C34765FTk;
import X.C34934FaK;
import X.C35130FeX;
import X.C35197Ffp;
import X.C35788FrQ;
import X.C36213FyR;
import X.C36509G8h;
import X.C38K;
import X.C69476Vnz;
import X.C907442n;
import X.C907542o;
import X.C9GR;
import X.D87;
import X.E55;
import X.EAT;
import X.EVM;
import X.EVO;
import X.EVY;
import X.EZU;
import X.EnumC151596s5;
import X.EnumC222416a;
import X.G9H;
import X.GNR;
import X.HandlerC31740Dwt;
import X.InterfaceC37190Ga1;
import X.InterfaceC37191Ga2;
import X.InterfaceC37222GaX;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.MSV;
import X.RunnableC36810GKj;
import X.RunnableC36811GKk;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.collect.ImmutableList;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class CategorySearchFragment extends C38K implements InterfaceC60072op, InterfaceC37191Ga2, InterfaceC60122ou, InterfaceC37190Ga1, CallerContextable {
    public static final CallerContext A0U = CallerContext.A00(CategorySearchFragment.class);
    public int A00;
    public View A01;
    public ImmutableList A02;
    public C32404EPf A04;
    public BusinessFlowAnalyticsLogger A05;
    public InterfaceC37222GaX A06;
    public C36213FyR A07;
    public EVY A08;
    public EVM A09;
    public AbstractC18680vv A0A;
    public BusinessInfo A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public EVO A0L;
    public EnumC151596s5 A0M;
    public C34934FaK A0N;
    public String A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ActionButton actionButton;
    public IgdsBottomButtonLayout businessNavBar;
    public ListView categoriesListView;
    public IgdsSwitch categoryToggle;
    public View categoryToggleContainer;
    public ViewGroup container;
    public IgdsHeadline headline;
    public ViewGroup mainScreenContainer;
    public IgdsInlineSearchBox searchBox;
    public View selectedCategoryDivider;
    public IgdsRadioButton selectedCategoryView;
    public TextView suggestedCategoriesHeader;
    public final Handler A0S = AbstractC167007dF.A0J();
    public final Handler A0T = new HandlerC31740Dwt(Looper.getMainLooper(), this, 0);
    public ImmutableList A03 = ImmutableList.of();

    public static final void A06(CategorySearchFragment categorySearchFragment) {
        categorySearchFragment.A0J = true;
        C32404EPf c32404EPf = categorySearchFragment.A04;
        if (c32404EPf != null) {
            ImmutableList immutableList = categorySearchFragment.A02;
            C36213FyR c36213FyR = categorySearchFragment.A07;
            boolean z = categorySearchFragment.A0I;
            c32404EPf.A06();
            if (immutableList != null && !immutableList.isEmpty()) {
                C32404EPf.A00(c32404EPf, c36213FyR, immutableList);
            } else if (z) {
                c32404EPf.A08(c32404EPf.A03, c32404EPf.A00.getString(2131968594));
            }
            C0fA.A00(c32404EPf, 1476342982);
        }
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfz() {
        this.A0F = false;
        EVY evy = this.A08;
        if (evy != null) {
            evy.A00 = true;
        }
        this.A0S.removeCallbacksAndMessages(null);
        ViewGroup.LayoutParams A0B = AbstractC31176DnK.A0B(this.businessNavBar);
        C14360o3.A0C(A0B, AbstractC111324zv.A00(0));
        A0B.height = -2;
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setLayoutParams(A0B);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.businessNavBar;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setFooterText(null);
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A0G) {
            ?? obj = new Object();
            C35197Ffp.A01(AbstractC166997dE.A0N(this), obj, 2131955002);
            ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC35690FpP.A00(this, 1), interfaceC56362iU, obj);
            this.actionButton = A00;
            A00.setEnabled(false);
            interfaceC56362iU.setIsLoading(this.A0H);
            if (!A0e()) {
                A07(this);
                return;
            }
            return;
        }
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        this.A06 = AbstractC35211Fg4.A01(this);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsSwitch igdsSwitch;
        BusinessInfo businessInfo;
        UserSession userSession;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC18680vv abstractC18680vv = this.A0A;
        C14360o3.A0A(abstractC18680vv);
        C106904rr A00 = C106904rr.A00(abstractC18680vv);
        IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
        C14360o3.A0A(igdsInlineSearchBox);
        AbstractC166997dE.A0T(igdsInlineSearchBox, R.id.search_edit_text).addTextChangedListener(A00);
        String str = this.A0C;
        if (str == null) {
            AbstractC31171DnF.A0x();
            throw C00O.createAndThrow();
        }
        if (str.equals("creator_tools") && (userSession = (UserSession) this.A0A) != null) {
            AbstractC28393Cfw.A02(userSession, "category_selection");
        }
        if (this.A06 != null && (businessInfo = this.A0B) != null) {
            String str2 = businessInfo.A09;
            String str3 = businessInfo.A0A;
            if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
                this.A07 = new C36213FyR(businessInfo.A02, str2, str3);
                A07(this);
            }
        }
        View view2 = this.categoryToggleContainer;
        if (view2 != null && (igdsSwitch = this.categoryToggle) != null) {
            igdsSwitch.A07 = new G9H(this, 1);
            C14360o3.A0A(view2);
            ViewOnClickListenerC35690FpP.A01(view2, 3, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer A01(CategorySearchFragment categorySearchFragment) {
        Object obj = null;
        if (categorySearchFragment.A07 == null) {
            return null;
        }
        ImmutableList immutableList = categorySearchFragment.A03;
        C14360o3.A0A(immutableList);
        Iterator it = AbstractC16960so.A1S(immutableList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int A0H = AbstractC166987dD.A0H(next);
            C36213FyR c36213FyR = categorySearchFragment.A07;
            C14360o3.A0A(c36213FyR);
            ImmutableList immutableList2 = categorySearchFragment.A03;
            C14360o3.A0A(immutableList2);
            if (c36213FyR.isContentSame((C36213FyR) immutableList2.get(A0H))) {
                obj = next;
                break;
            }
        }
        return (Integer) obj;
    }

    private final void A02() {
        boolean z;
        Integer num;
        if (!this.A0E) {
            View view = this.A01;
            C14360o3.A0A(view);
            view.setVisibility(0);
            C34934FaK c34934FaK = this.A0N;
            if (c34934FaK == null) {
                C14360o3.A0F("categoryHelper");
                throw C00O.createAndThrow();
            }
            AbstractC18680vv abstractC18680vv = this.A0A;
            C14360o3.A0A(abstractC18680vv);
            Context requireContext = requireContext();
            C08790ch A00 = AbstractC018607g.A00(this);
            C14360o3.A0B(abstractC18680vv, 0);
            C2JM A0b = AbstractC25225BEi.A0b();
            A0b.A04("locale", C1Q2.A00());
            C18C.A0E(true);
            C907442n c907442n = new C907442n(A0b, E55.class, "CreatorAndBusinessSuggestedCategoriesQuery", false);
            C907542o c907542o = new C907542o(abstractC18680vv);
            c907542o.A08(c907442n);
            C1ON A06 = c907542o.A06();
            C31456Ds0.A00(A06, requireContext, c34934FaK, 7);
            C1GJ.A00(requireContext, A00, A06);
            return;
        }
        this.A0J = false;
        TextView textView = this.suggestedCategoriesHeader;
        if (textView != null) {
            textView.setVisibility(0);
        }
        C32404EPf c32404EPf = this.A04;
        if (c32404EPf != null) {
            ImmutableList immutableList = this.A03;
            C36213FyR c36213FyR = this.A07;
            EVY evy = this.A08;
            C14360o3.A0A(evy);
            SearchController searchController = evy.A03;
            Integer num2 = searchController.A03;
            if (num2 == C05F.A0C || (num2 == (num = C05F.A01) && searchController.A02 == num)) {
                z = true;
            } else {
                z = false;
            }
            c32404EPf.A06();
            if (immutableList != null && !immutableList.isEmpty()) {
                if (z) {
                    c32404EPf.A08(c32404EPf.A01, c32404EPf.A00.getString(2131974876));
                }
                C32404EPf.A00(c32404EPf, c36213FyR, immutableList);
            }
            C0fA.A00(c32404EPf, 214347070);
        }
    }

    private final void A03() {
        String str;
        EnumC222416a enumC222416a;
        String str2;
        C35788FrQ A0K;
        BusinessInfo businessInfo;
        C36213FyR c36213FyR = this.A07;
        if (c36213FyR != null) {
            str = c36213FyR.A01;
            str2 = c36213FyR.A02;
            enumC222416a = c36213FyR.A00;
        } else {
            str = null;
            enumC222416a = null;
            str2 = null;
        }
        C35130FeX c35130FeX = new C35130FeX(this.A0B);
        c35130FeX.A09 = str;
        c35130FeX.A0K = str2;
        c35130FeX.A02 = enumC222416a;
        this.A0B = new BusinessInfo(c35130FeX);
        InterfaceC37222GaX interfaceC37222GaX = this.A06;
        if (interfaceC37222GaX != null && (A0K = AbstractC31176DnK.A0K(interfaceC37222GaX)) != null && (businessInfo = this.A0B) != null) {
            A0K.A02 = businessInfo;
        }
    }

    public static final void A04(CategorySearchFragment categorySearchFragment) {
        String str;
        String str2;
        if (categorySearchFragment.A05 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            C36213FyR c36213FyR = categorySearchFragment.A07;
            if (c36213FyR != null) {
                str = c36213FyR.A01;
            } else {
                str = null;
            }
            A1G.put("category_id", str);
            C36213FyR c36213FyR2 = categorySearchFragment.A07;
            if (c36213FyR2 != null) {
                str2 = c36213FyR2.A02;
            } else {
                str2 = null;
            }
            A1G.put("category_name", str2);
            IgdsInlineSearchBox igdsInlineSearchBox = categorySearchFragment.searchBox;
            C14360o3.A0A(igdsInlineSearchBox);
            A1G.put("category_search_keyword", igdsInlineSearchBox.getSearchString());
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
                String str3 = categorySearchFragment.A0C;
                if (str3 == null) {
                    AbstractC31171DnF.A0x();
                    throw C00O.createAndThrow();
                }
                businessFlowAnalyticsLogger.CjL(new Y7A(A0g, str3, null, null, null, null, A1G, null));
            }
        }
    }

    public static final void A05(CategorySearchFragment categorySearchFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
        if (businessFlowAnalyticsLogger != null) {
            String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
            String str = categorySearchFragment.A0C;
            if (str == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            businessFlowAnalyticsLogger.Clu(new Y7A(A0g, str, "switch_to_professional", null, null, null, null, null));
        }
    }

    public static final void A08(CategorySearchFragment categorySearchFragment, String str, String str2) {
        if (categorySearchFragment.A05 != null) {
            String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
            HashMap hashMap = null;
            String str3 = categorySearchFragment.A0C;
            if (str3 == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            if (str2 != null) {
                hashMap = AbstractC166987dD.A1G();
                hashMap.put("category_id", str2);
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Cm3(new Y7A(A0g, str3, str, null, null, null, hashMap, null));
            }
        }
    }

    public static final void A09(CategorySearchFragment categorySearchFragment, String str, String str2, String str3, int i) {
        if (categorySearchFragment.A05 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("data_count", String.valueOf(i));
            HashMap hashMap = null;
            if (str2 != null && str3 != null) {
                hashMap = AbstractC31174DnI.A12(str2, str3);
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
                String str4 = categorySearchFragment.A0C;
                if (str4 == null) {
                    AbstractC31171DnF.A0x();
                    throw C00O.createAndThrow();
                }
                businessFlowAnalyticsLogger.CjJ(new Y7A(A0g, str4, str, null, null, null, hashMap, A1G));
            }
        }
    }

    public static final void A0A(CategorySearchFragment categorySearchFragment, String str, String str2, String str3, String str4) {
        if (categorySearchFragment.A05 != null) {
            HashMap hashMap = null;
            if (str3 != null && str4 != null) {
                hashMap = AbstractC31174DnI.A12(str3, str4);
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
                String str5 = categorySearchFragment.A0C;
                if (str5 == null) {
                    AbstractC31171DnF.A0x();
                    throw C00O.createAndThrow();
                }
                businessFlowAnalyticsLogger.CjK(new Y7A(A0g, str5, str, str2, null, null, hashMap, null));
            }
        }
    }

    public static final void A0B(CategorySearchFragment categorySearchFragment, boolean z) {
        C35130FeX c35130FeX = new C35130FeX(categorySearchFragment.A0B);
        c35130FeX.A0Q = z;
        categorySearchFragment.A0B = new BusinessInfo(c35130FeX);
        if (categorySearchFragment.A05 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("switch_display_category", String.valueOf(z));
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
            if (businessFlowAnalyticsLogger != null) {
                String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
                String str = categorySearchFragment.A0C;
                if (str == null) {
                    AbstractC31171DnF.A0x();
                    throw C00O.createAndThrow();
                }
                businessFlowAnalyticsLogger.Cm3(new Y7A(A0g, str, "switch_display_category", null, null, null, A1G, null));
            }
        }
    }

    public final void A0c(C36213FyR c36213FyR) {
        String str;
        Integer A01;
        if (this.A0J) {
            str = "searched_category";
        } else {
            str = "suggested_category";
        }
        A08(this, str, c36213FyR.A01);
        this.A07 = c36213FyR;
        A07(this);
        if (A0e() && (A01 = A01(this)) != null) {
            ListView listView = this.categoriesListView;
            C14360o3.A0A(listView);
            listView.post(new GNR(this, A01));
        }
        EVY evy = this.A08;
        if (evy != null) {
            evy.A00();
        }
    }

    public final void A0d(String str) {
        this.A0D = str;
        if (str.length() == 0) {
            A02();
            return;
        }
        Handler handler = this.A0T;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        Message obtainMessage = handler.obtainMessage(1, str);
        C14360o3.A07(obtainMessage);
        handler.sendMessageDelayed(obtainMessage, 300L);
    }

    public final boolean A0e() {
        EVY evy = this.A08;
        C14360o3.A0A(evy);
        return AbstractC167007dF.A1X(evy.A03.A03, C05F.A0C);
    }

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout != null && igdsBottomButtonLayout.getVisibility() == 0) {
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.businessNavBar;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryButtonEnabled(false);
                return;
            }
            return;
        }
        ActionButton actionButton = this.actionButton;
        if (actionButton == null) {
            return;
        }
        actionButton.setEnabled(false);
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout != null && igdsBottomButtonLayout.getVisibility() == 0) {
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.businessNavBar;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryButtonEnabled(true);
                return;
            }
            return;
        }
        ActionButton actionButton = this.actionButton;
        if (actionButton == null) {
            return;
        }
        actionButton.setEnabled(true);
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        String str;
        EnumC222416a enumC222416a;
        C36213FyR c36213FyR;
        String str2;
        C36213FyR c36213FyR2 = this.A07;
        if (c36213FyR2 != null) {
            str = c36213FyR2.A01;
        } else {
            str = null;
        }
        A08(this, "continue", str);
        A03();
        String str3 = this.A0C;
        String str4 = null;
        if (str3 == null) {
            str2 = "entryPoint";
        } else {
            if (str3.equals("creator_tools")) {
                UserSession userSession = (UserSession) this.A0A;
                C14360o3.A0A(userSession);
                AbstractC28393Cfw.A03(userSession, "category_selection", "category_selection_cta");
            }
            if (this.A0Q) {
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setFooterText(getString(2131956827));
                }
                this.A0S.postDelayed(new RunnableC36811GKk(this), 15000L);
                String str5 = this.A0O;
                if (str5 == null) {
                    str2 = "creatorToolsEntryPoint";
                } else {
                    C36213FyR c36213FyR3 = this.A07;
                    if (c36213FyR3 != null) {
                        String str6 = c36213FyR3.A01;
                        BusinessInfo businessInfo = this.A0B;
                        C14360o3.A0A(businessInfo);
                        boolean z = businessInfo.A0Q;
                        Context requireContext = requireContext();
                        AbstractC18680vv abstractC18680vv = this.A0A;
                        AbstractC31171DnF.A1Q(abstractC18680vv);
                        C14360o3.A0B(abstractC18680vv, 2);
                        CreatorToolsMonetizationApi creatorToolsMonetizationApi = (CreatorToolsMonetizationApi) abstractC18680vv.A01(CreatorToolsMonetizationApi.class, new D87(abstractC18680vv, 33));
                        ValuePropsFlow valuePropsFlow = (ValuePropsFlow) ValuePropsFlow.A01.get(str5);
                        if (valuePropsFlow == null) {
                            valuePropsFlow = ValuePropsFlow.A0C;
                        }
                        C25621Ms A0q = AbstractC25228BEl.A0q(creatorToolsMonetizationApi.A00);
                        A0q.A05();
                        A0q.A03();
                        String A11 = AnonymousClass001.A11("api/", "v1/", "creators/", "open_creator_tools/", "convert_account/");
                        C14360o3.A07(A11);
                        A0q.A0E = A11;
                        A0q.A0R(EAT.class, C34765FTk.class);
                        A0q.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, valuePropsFlow.A00);
                        A0q.A9s("category_id", str6);
                        A0q.A0I("should_show_category", z);
                        C1ON A0N = A0q.A0N();
                        C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.creatortools.api.schemas.CreatorToolsAccountConversionResponse>, com.instagram.api.response.IgApiResponse<com.instagram.creatortools.api.schemas.CreatorToolsAccountConversionResponse>>");
                        A0N.A00 = new C32540EUq(1, requireContext, this, abstractC18680vv);
                        schedule(A0N);
                        return;
                    }
                    throw AbstractC166987dD.A14("categoryId should not be null");
                }
            } else {
                InterfaceC37222GaX interfaceC37222GaX = this.A06;
                if (interfaceC37222GaX != null && AbstractC35211Fg4.A04(interfaceC37222GaX)) {
                    A04(this);
                    InterfaceC37222GaX interfaceC37222GaX2 = this.A06;
                    C14360o3.A0A(interfaceC37222GaX2);
                    ((BusinessConversionActivity) interfaceC37222GaX2).CnD(null);
                    return;
                }
                InterfaceC37222GaX interfaceC37222GaX3 = this.A06;
                if (interfaceC37222GaX3 != null) {
                    BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) interfaceC37222GaX3;
                    boolean z2 = false;
                    if (AbstractC31172DnG.A1Y(businessConversionActivity) && ((AbstractC35211Fg4.A03(businessConversionActivity) || AbstractC35211Fg4.A02(businessConversionActivity)) && ConversionStep.A04 == businessConversionActivity.A0n())) {
                        z2 = true;
                    }
                    InterfaceC37222GaX interfaceC37222GaX4 = this.A06;
                    if (z2) {
                        if (AbstractC35211Fg4.A03(interfaceC37222GaX4) || (this.A0R && (c36213FyR = this.A07) != null && c36213FyR.A00 == EnumC222416a.A06)) {
                            enumC222416a = EnumC222416a.A06;
                        } else {
                            enumC222416a = EnumC222416a.A05;
                        }
                        InterfaceC37222GaX interfaceC37222GaX5 = this.A06;
                        C14360o3.A0C(interfaceC37222GaX5, "null cannot be cast to non-null type com.instagram.business.activity.BusinessConversionActivity");
                        ((BusinessConversionActivity) interfaceC37222GaX5).A0o(requireContext(), this, this, enumC222416a, "choose_category", false);
                        return;
                    }
                    C14360o3.A0A(interfaceC37222GaX4);
                    C36213FyR c36213FyR4 = this.A07;
                    if (c36213FyR4 != null) {
                        str4 = c36213FyR4.A01;
                    }
                    interfaceC37222GaX4.CnD(AbstractC31174DnI.A0F(MSV.A00(1634), str4));
                    A04(this);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37191Ga2
    public final void Dfs(String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A05;
        if (businessFlowAnalyticsLogger != null) {
            String A0g = AbstractC31180DnO.A0g(this);
            String str4 = this.A0C;
            if (str4 == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            businessFlowAnalyticsLogger.Clv(new Y7A(A0g, str4, "switch_to_professional", str2, str3, null, null, null));
        }
        Context context = getContext();
        if (context != null) {
            C9GR.A09(context, str);
        }
        EVM evm = this.A09;
        if (evm != null) {
            evm.A00();
        }
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgF() {
        EVM evm = this.A09;
        if (evm != null) {
            evm.A01();
        }
        this.A0F = true;
        C14270nr.A00().A01(new EZU(this), 8000L);
        EVY evy = this.A08;
        if (evy != null) {
            evy.A00 = false;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.businessNavBar;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setFooterText(getString(2131956827));
        }
        this.A0S.postDelayed(new RunnableC36811GKk(this), 15000L);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A0F) {
            return true;
        }
        this.A03 = ImmutableList.of();
        this.A07 = null;
        IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A0E.setText("");
        }
        A07(this);
        if (!this.A0K && (businessFlowAnalyticsLogger = this.A05) != null) {
            String A0g = AbstractC31180DnO.A0g(this);
            String str = this.A0C;
            if (str == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            businessFlowAnalyticsLogger.Cid(new Y7A(A0g, str, null, null, null, null, null, null));
        }
        if (!this.A0G) {
            A03();
            InterfaceC37222GaX interfaceC37222GaX = this.A06;
            if (interfaceC37222GaX != null) {
                ((BusinessConversionActivity) interfaceC37222GaX).EL3(null);
                return true;
            }
        }
        return false;
    }

    public CategorySearchFragment() {
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A02 = of;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0043, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(com.instagram.business.fragment.CategorySearchFragment r3) {
        /*
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L5f
            X.FyR r0 = r3.A07
            if (r0 == 0) goto L85
            r3.ARU()
            android.view.View r1 = r3.categoryToggleContainer
            if (r1 == 0) goto L15
            r0 = 0
        L12:
            r1.setVisibility(r0)
        L15:
            X.FyR r0 = r3.A07
            if (r0 == 0) goto L7a
            com.instagram.igds.components.button.IgdsRadioButton r0 = r3.selectedCategoryView
            if (r0 == 0) goto L7a
            android.view.View r0 = r3.selectedCategoryDivider
            if (r0 == 0) goto L7a
            boolean r0 = r3.A0E
            if (r0 == 0) goto L7a
            com.google.common.collect.ImmutableList r1 = r3.A03
            if (r1 == 0) goto L33
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L62
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L62
        L33:
            com.instagram.igds.components.button.IgdsRadioButton r1 = r3.selectedCategoryView
            if (r1 == 0) goto L40
            X.FyR r0 = r3.A07
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.A02
        L3d:
            r1.setText(r0)
        L40:
            com.instagram.igds.components.button.IgdsRadioButton r2 = r3.selectedCategoryView
            r1 = 0
            if (r2 == 0) goto L48
        L45:
            r2.setVisibility(r1)
        L48:
            android.view.View r0 = r3.selectedCategoryDivider
            X.C14360o3.A0A(r0)
            r0.setVisibility(r1)
        L50:
            boolean r0 = r3.A0f()
            if (r0 != 0) goto L8f
            boolean r0 = r3.A0e()
            if (r0 == 0) goto L8f
            A06(r3)
        L5f:
            return
        L60:
            r0 = 0
            goto L3d
        L62:
            java.util.Iterator r2 = r1.iterator()
        L66:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r1 = r2.next()
            X.FyR r1 = (X.C36213FyR) r1
            X.FyR r0 = r3.A07
            boolean r0 = r1.isContentSame(r0)
            if (r0 == 0) goto L66
        L7a:
            com.instagram.igds.components.button.IgdsRadioButton r2 = r3.selectedCategoryView
            if (r2 == 0) goto L50
            android.view.View r0 = r3.selectedCategoryDivider
            if (r0 == 0) goto L50
            r1 = 8
            goto L45
        L85:
            r3.APP()
            android.view.View r1 = r3.categoryToggleContainer
            if (r1 == 0) goto L15
            r0 = 8
            goto L12
        L8f:
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.A07(com.instagram.business.fragment.CategorySearchFragment):void");
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A0A;
    }

    public final void A0b() {
        String searchString;
        int length;
        C69476Vnz c69476Vnz;
        if (A0e()) {
            EVY evy = this.A08;
            if (evy != null) {
                C69476Vnz c69476Vnz2 = evy.A03.mViewHolder;
                if (c69476Vnz2 == null) {
                    searchString = "";
                } else {
                    searchString = c69476Vnz2.A0F.getSearchString();
                }
            } else {
                searchString = null;
            }
        } else {
            IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
            C14360o3.A0A(igdsInlineSearchBox);
            searchString = igdsInlineSearchBox.getSearchString();
        }
        if (searchString != null && (length = searchString.length()) != 0) {
            A0d(searchString);
            EVY evy2 = this.A08;
            if (evy2 != null && (c69476Vnz = evy2.A03.mViewHolder) != null) {
                c69476Vnz.A0F.setText(searchString);
                SearchEditText searchEditText = c69476Vnz.A0F;
                Pattern pattern = AbstractC13670mt.A01;
                searchEditText.setSelection(length);
            }
        } else {
            A02();
        }
        ViewGroup viewGroup = this.container;
        if (viewGroup != null) {
            if (this.A00 == 0) {
                this.A00 = viewGroup.getPaddingTop();
            }
            ViewGroup viewGroup2 = this.container;
            if (viewGroup2 != null) {
                viewGroup2.setPadding(0, 0, 0, 0);
            }
        }
        ViewGroup viewGroup3 = this.mainScreenContainer;
        if (viewGroup3 != null) {
            viewGroup3.setLayoutTransition(null);
        }
    }

    public final boolean A0f() {
        String searchString;
        if (A0e()) {
            EVY evy = this.A08;
            C14360o3.A0A(evy);
            C69476Vnz c69476Vnz = evy.A03.mViewHolder;
            if (c69476Vnz == null) {
                searchString = "";
            } else {
                searchString = c69476Vnz.A0F.getSearchString();
                if (searchString == null) {
                    return true;
                }
            }
            if (searchString.length() == 0) {
                return true;
            }
        }
        if (!A0e()) {
            IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
            C14360o3.A0A(igdsInlineSearchBox);
            if (igdsInlineSearchBox.getSearchString().length() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC37191Ga2
    public final void DgQ(EnumC222416a enumC222416a) {
        A05(this);
        this.A0T.post(new RunnableC36810GKj(this));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "choose_category_with_search";
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e7, code lost:
    
        if (X.C2E7.A01(X.AbstractC08690cX.A00(r0)) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r9.A0Q != false) goto L17;
     */
    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-124459057);
        EVO evo = this.A0L;
        if (evo != null) {
            evo.onDestroy();
            EVO evo2 = this.A0L;
            if (evo2 != null) {
                unregisterLifecycleListener(evo2);
                super.onDestroy();
                C0f9.A09(-250357024, A02);
                return;
            }
        }
        C14360o3.A0F("noTabLifecycleListener");
        throw C00O.createAndThrow();
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1373520753);
        this.A0S.removeCallbacksAndMessages(null);
        EVM evm = this.A09;
        if (evm != null) {
            unregisterLifecycleListener(evm);
        }
        this.A01 = null;
        this.A09 = null;
        this.A03 = ImmutableList.of();
        EVY evy = this.A08;
        if (evy != null) {
            unregisterLifecycleListener(evy);
        }
        super.onDestroyView();
        C0f9.A09(-1438308237, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(188475854);
        Handler handler = this.A0T;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        super.onDetach();
        C0f9.A09(134978222, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int A02 = C0f9.A02(-667455641);
        super.onResume();
        if (A0e()) {
            i = 865937908;
        } else {
            A07(this);
            i = -1702985895;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        int A02 = C0f9.A02(-699954703);
        super.onViewStateRestored(bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = this.searchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = new C36509G8h(this, 0);
        }
        C0f9.A09(382873384, A02);
    }
}
