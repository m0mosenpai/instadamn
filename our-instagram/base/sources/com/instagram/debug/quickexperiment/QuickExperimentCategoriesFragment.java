package com.instagram.debug.quickexperiment;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC002300n;
import X.AbstractC03240Dh;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC20080yf;
import X.AbstractC25229BEm;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC33235ElU;
import X.AbstractC37303Gc4;
import X.AbstractC50522MSa;
import X.AbstractC60492pY;
import X.AbstractRunnableC14200nk;
import X.AnonymousClass001;
import X.C01T;
import X.C0f9;
import X.C106904rr;
import X.C11T;
import X.C140966Yy;
import X.C14120nc;
import X.C14360o3;
import X.C18V;
import X.C193328hC;
import X.C1I7;
import X.C1XM;
import X.C31335Dq0;
import X.C3FQ;
import X.C5F7;
import X.C9GR;
import X.EnumC72396Xcj;
import X.GHY;
import X.GYX;
import X.GZS;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.debug.quickexperiment.L;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class QuickExperimentCategoriesFragment extends AbstractC33235ElU implements InterfaceC60072op, GZS, InterfaceC60122ou, GYX {
    public static final Companion Companion = new Object();
    public static final Comparator PARAMETER_COMPARATOR = new Comparator() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$Companion$PARAMETER_COMPARATOR$1
        @Override // java.util.Comparator
        public final int compare(AbstractC20080yf abstractC20080yf, AbstractC20080yf abstractC20080yf2) {
            EnumC72396Xcj category = QuickExperimentHelper.getCategory(abstractC20080yf);
            EnumC72396Xcj category2 = QuickExperimentHelper.getCategory(abstractC20080yf2);
            String str = abstractC20080yf.universeName;
            String str2 = abstractC20080yf2.universeName;
            if (category == category2) {
                if (AbstractC002300n.A0g(str, str2, true)) {
                    return abstractC20080yf.name.compareTo(abstractC20080yf2.name);
                }
                return str.compareTo(str2);
            }
            C14360o3.A0A(category2);
            return category.compareTo(category2);
        }
    };
    public List currentExperimentParams;
    public final List categoryList = new ArrayList();
    public final InterfaceC09390do typeaheadHeader$delegate = C1XM.A00(new QuickExperimentCategoriesFragment$typeaheadHeader$2(this));
    public final InterfaceC09390do universeCollapseTracker$delegate = C1XM.A00(QuickExperimentCategoriesFragment$universeCollapseTracker$2.INSTANCE);
    public final InterfaceC09390do adapter$delegate = C1XM.A00(new QuickExperimentCategoriesFragment$adapter$2(this));
    public final InterfaceC09390do testRigParameterNames$delegate = C1XM.A00(new QuickExperimentCategoriesFragment$testRigParameterNames$2(this));
    public final InterfaceC09390do isInTestRigMode$delegate = C1XM.A00(new QuickExperimentCategoriesFragment$isInTestRigMode$2(this));
    public String searchQuery = "";
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    public static final /* synthetic */ Boolean access$getUseRecyclerViewFromQE(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        return true;
    }

    private final boolean matchByToken(String str, String str2) {
        List<String> A0m = AbstractC167007dF.A0m(str2, " ", 0);
        List A0m2 = AbstractC167007dF.A0m(str, " ", 0);
        if (!(A0m instanceof Collection) || !A0m.isEmpty()) {
            for (String str3 : A0m) {
                if ((A0m2 instanceof Collection) && A0m2.isEmpty()) {
                    return false;
                }
                Iterator it = A0m2.iterator();
                while (it.hasNext()) {
                    if (AbstractC001900j.A0a((String) it.next(), str3, false)) {
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!AbstractC167007dF.A1Z(this.isInTestRigMode$delegate)) {
            AbstractC31175DnJ.A1I(interfaceC56362iU, "MetaConfig Categories");
        }
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "quick_experiment_categories";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        checkMobileConfigIdNameMapping();
        getScrollingViewProxy().CFj().setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        getScrollingViewProxy().EPJ(getAdapter());
        boolean A1Z = AbstractC167007dF.A1Z(this.isInTestRigMode$delegate);
        TypeaheadHeader typeaheadHeader = getTypeaheadHeader();
        if (A1Z) {
            typeaheadHeader.setVisibility(8);
            setTestRigParameters();
            return;
        }
        typeaheadHeader.A01 = this;
        AbstractC50522MSa.A0z(getTypeaheadHeader());
        if (this.searchQuery.length() > 0) {
            getTypeaheadHeader().A04(this.searchQuery);
        }
        getTypeaheadHeader().A03("Search MetaConfigs");
        getScrollingViewProxy().AAJ(new C1I7() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$onViewCreated$1
            @Override // X.C1I2
            public void onScrollStateChanged(C3FQ c3fq, int i) {
                TypeaheadHeader typeaheadHeader2;
                int A03 = C0f9.A03(-1888424979);
                if (i == 1) {
                    typeaheadHeader2 = QuickExperimentCategoriesFragment.this.getTypeaheadHeader();
                    typeaheadHeader2.A01();
                }
                C0f9.A0A(-1273085582, A03);
            }
        });
        setItems(this.categoryList, false);
    }

    @Override // X.GZS
    public void registerTextViewLogging(TextView textView) {
        C14360o3.A0B(textView, 0);
        textView.addTextChangedListener(C106904rr.A00(getSession()));
    }

    @Override // X.GZS
    public void searchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        final String str2 = this.searchQuery;
        this.searchQuery = str;
        if (str.length() > 0) {
            getAdapter().setSearching(true);
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$searchTextChanged$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1386848661, 3, false, false);
                }

                @Override // java.lang.Runnable
                public void run() {
                    QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = QuickExperimentCategoriesFragment.this;
                    String str3 = quickExperimentCategoriesFragment.searchQuery;
                    String str4 = str2;
                    boolean z = true;
                    if (str4.length() <= 0 || !AbstractC001900j.A0a(str3, str4, false)) {
                        z = false;
                    }
                    quickExperimentCategoriesFragment.filterExperimentsList(str3, z);
                }
            });
        } else {
            setItems(this.categoryList, false);
        }
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final void createUiFromExperimentParams(final List list) {
        C11T.A03(new Runnable() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$createUiFromExperimentParams$1
            @Override // java.lang.Runnable
            public final void run() {
                UniverseCollapseTracker universeCollapseTracker;
                QuickExperimentCategoriesAdapter adapter;
                QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = QuickExperimentCategoriesFragment.this;
                quickExperimentCategoriesFragment.currentExperimentParams = list;
                UserSession session = quickExperimentCategoriesFragment.getSession();
                universeCollapseTracker = QuickExperimentCategoriesFragment.this.getUniverseCollapseTracker();
                final QuickExperimentCategoriesFragment quickExperimentCategoriesFragment2 = QuickExperimentCategoriesFragment.this;
                Runnable runnable = new Runnable() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$createUiFromExperimentParams$1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        QuickExperimentCategoriesFragment.this.refreshUi();
                    }
                };
                List list2 = list;
                adapter = quickExperimentCategoriesFragment2.getAdapter();
                quickExperimentCategoriesFragment.setItems(QuickExperimentHelper.setupMenuItems(quickExperimentCategoriesFragment, session, universeCollapseTracker, runnable, list2, adapter, true, true), true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void filterExperimentsList(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        String A0X = AbstractC37303Gc4.A0X(str);
        List<AbstractC20080yf> list = this.currentExperimentParams;
        if (!z || list == null) {
            list = QuickExperimentHelper.getAllExperiments();
        }
        for (AbstractC20080yf abstractC20080yf : list) {
            if (str.equals(this.searchQuery)) {
                if (searchQueryMatchesExperiment(A0X, abstractC20080yf)) {
                    arrayList.add(abstractC20080yf);
                }
            } else {
                return;
            }
        }
        C01T.A1D(arrayList, PARAMETER_COMPARATOR);
        createUiFromExperimentParams(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QuickExperimentCategoriesAdapter getAdapter() {
        return (QuickExperimentCategoriesAdapter) this.adapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set getTestRigParameterNames() {
        return (Set) this.testRigParameterNames$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TypeaheadHeader getTypeaheadHeader() {
        return (TypeaheadHeader) this.typeaheadHeader$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UniverseCollapseTracker getUniverseCollapseTracker() {
        return (UniverseCollapseTracker) this.universeCollapseTracker$delegate.getValue();
    }

    private final boolean isInTestRigMode() {
        return AbstractC167007dF.A1Z(this.isInTestRigMode$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi() {
        List list = this.currentExperimentParams;
        if (list != null) {
            createUiFromExperimentParams(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setItems(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            isInTestRigMode();
            C31335Dq0 c31335Dq0 = new C31335Dq0("Recent Items");
            c31335Dq0.A02 = AbstractC31173DnH.A03(getContext(), requireContext(), R.attr.igds_color_secondary_background);
            arrayList.add(c31335Dq0);
            List recentExperimentParameters = RecentQuickExperimentManager.getRecentExperimentParameters();
            C01T.A1D(recentExperimentParameters, PARAMETER_COMPARATOR);
            arrayList.addAll(QuickExperimentHelper.setupMenuItems(this, getSession(), null, null, recentExperimentParameters, getAdapter(), false, true));
            C31335Dq0 c31335Dq02 = new C31335Dq0("MetaConfig Categories");
            c31335Dq02.A02 = AbstractC31173DnH.A03(getContext(), requireContext(), R.attr.igds_color_secondary_background);
            arrayList.add(c31335Dq02);
            arrayList.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$setItems$3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(-82539732);
                    AbstractC03240Dh.A00(new Bundle(), QuickExperimentCategoriesFragment.this.getSession());
                    AbstractC25229BEm.A18(QuickExperimentEditFragment.createForAllOverrides(QuickExperimentCategoriesFragment.this.getSession()), new C140966Yy(QuickExperimentCategoriesFragment.this.requireActivity(), QuickExperimentCategoriesFragment.this.getSession()));
                    C0f9.A0C(-1444001679, A05);
                }
            }, "Show all overridden MetaConfigs"));
        }
        arrayList.addAll(list);
        getAdapter().setMenuItemList(arrayList);
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    @Override // X.AbstractC33235ElU
    public boolean isElevated() {
        return AbstractC167007dF.A1Z(this.isInTestRigMode$delegate);
    }

    private final void checkMobileConfigIdNameMapping() {
        C193328hC A0O;
        C5F7 paramsMap = QuickExperimentHelper.getParamsMap();
        if (paramsMap == null) {
            A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0r("Overrides won't work due to failed to load MobileConfig params map.");
            A0O.A0d(null, "OK");
        } else {
            double namedParamsRatio = QuickExperimentHelper.getNamedParamsRatio(paramsMap);
            if (namedParamsRatio >= 0.5d) {
                return;
            }
            A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0r(StringFormatUtil.formatStrLocaleSafe("Overrides would be flaky due to only loaded config names for %.1f%% of %d params.\n\nSuggest to go parent menu and click \"Force user MetaConfig sync\", and then come back - or just click the button below.", Double.valueOf(namedParamsRatio * 100.0d), Integer.valueOf(paramsMap.A03.size())));
            A0O.A0d(null, "OK");
            A0O.A0b(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$checkMobileConfigIdNameMapping$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C18V c18v = C18V.A01;
                    QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = QuickExperimentCategoriesFragment.this;
                    if (c18v == null) {
                        C9GR.A09(quickExperimentCategoriesFragment.requireContext(), "Failed User MetaConfig Sync");
                    } else {
                        Context requireContext = quickExperimentCategoriesFragment.requireContext();
                        QuickExperimentHelper.forceUserQESync(requireContext, c18v, QuickExperimentCategoriesFragment.this.getSession(), new QuickExperimentHelper$$ExternalSyntheticLambda5(requireContext, true));
                    }
                }
            }, "Force sync and restart app");
        }
        AbstractC166987dD.A1W(A0O);
    }

    private final boolean hasMatchingTestRigConfigAndUniverse(AbstractC20080yf abstractC20080yf) {
        Set<String> testRigParameterNames = getTestRigParameterNames();
        if (!(testRigParameterNames instanceof Collection) || !testRigParameterNames.isEmpty()) {
            for (String str : testRigParameterNames) {
                String A0X = AbstractC37303Gc4.A0X(AnonymousClass001.A0T(abstractC20080yf.universeName, abstractC20080yf.name, '.'));
                C14360o3.A0A(str);
                if (AbstractC001900j.A0a(A0X, str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void mayBeAddLauncherTestRigPromo(List list) {
        isInTestRigMode();
    }

    private final boolean searchQueryMatchesExperiment(String str, AbstractC20080yf abstractC20080yf) {
        if (OverlayConfigHelper.isOverlayConfig(abstractC20080yf)) {
            return false;
        }
        String niceUniverseName = QuickExperimentHelper.getNiceUniverseName(abstractC20080yf.universeName);
        C14360o3.A07(niceUniverseName);
        String A0X = AbstractC37303Gc4.A0X(niceUniverseName);
        if (!AbstractC001900j.A0a(A0X, str, false)) {
            String A0X2 = AbstractC37303Gc4.A0X(abstractC20080yf.name);
            String replace = A0X2.replace('_', ' ');
            C14360o3.A07(replace);
            if (!AbstractC001900j.A0a(replace, str, false)) {
                String A0T = AnonymousClass001.A0T(A0X, replace, ' ');
                if (!AbstractC001900j.A0a(A0T, str, false) && (!L.ig_android_internal_launcher_token_matching.enabled.getAndExpose(getSession()).booleanValue() || !matchByToken(A0T, str))) {
                    String replace2 = A0X.replace(' ', '_');
                    C14360o3.A07(replace2);
                    return AbstractC001900j.A0a(AnonymousClass001.A0T(replace2, A0X2, '_'), str, false);
                }
            }
        }
        return true;
    }

    private final void setTestRigParameters() {
        List allExperiments = QuickExperimentHelper.getAllExperiments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allExperiments) {
            AbstractC20080yf abstractC20080yf = (AbstractC20080yf) obj;
            C14360o3.A0A(abstractC20080yf);
            if (!OverlayConfigHelper.isOverlayConfig(abstractC20080yf) && hasMatchingTestRigConfigAndUniverse(abstractC20080yf)) {
                arrayList.add(obj);
            }
        }
        List A0g = AbstractC001800i.A0g(arrayList, PARAMETER_COMPARATOR);
        this.categoryList.clear();
        this.categoryList.addAll(QuickExperimentHelper.setupMenuItems(this, getSession(), getUniverseCollapseTracker(), new Runnable() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$setTestRigParameters$1
            @Override // java.lang.Runnable
            public final void run() {
                QuickExperimentCategoriesFragment.this.refreshUi();
            }
        }, A0g, getAdapter(), false, false));
        getAdapter().setMenuItemList(this.categoryList);
    }

    @Override // X.GYX
    public View getRowView() {
        return getTypeaheadHeader();
    }

    @Override // X.InterfaceC60072op
    public boolean onBackPressed() {
        getTypeaheadHeader().A01();
        return false;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1385822779);
        super.onCreate(bundle);
        for (final EnumC72396Xcj enumC72396Xcj : EnumC72396Xcj.values()) {
            this.categoryList.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentCategoriesFragment$onCreate$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TypeaheadHeader typeaheadHeader;
                    int A05 = C0f9.A05(-1139331667);
                    typeaheadHeader = QuickExperimentCategoriesFragment.this.getTypeaheadHeader();
                    typeaheadHeader.A01();
                    AbstractC03240Dh.A00(new Bundle(), QuickExperimentCategoriesFragment.this.getSession());
                    AbstractC25229BEm.A18(QuickExperimentEditFragment.createWithExperimentCategory(enumC72396Xcj), new C140966Yy(QuickExperimentCategoriesFragment.this.requireActivity(), QuickExperimentCategoriesFragment.this.getSession()));
                    C0f9.A0C(1387331463, A05);
                }
            }, enumC72396Xcj.A01));
        }
        C0f9.A09(1858468086, A02);
    }
}
