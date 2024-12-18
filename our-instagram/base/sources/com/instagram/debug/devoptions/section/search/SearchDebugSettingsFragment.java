package com.instagram.debug.devoptions.section.search;

import X.AbstractC09440dt;
import X.AbstractC124145jT;
import X.AbstractC167007dF;
import X.AbstractC23021Ah;
import X.AbstractC25228BEl;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.AbstractC31174DnI;
import X.AbstractC33235ElU;
import X.AbstractC50523MSb;
import X.AbstractC60492pY;
import X.AnonymousClass191;
import X.C0YY;
import X.C0eB;
import X.C0f9;
import X.C124155jU;
import X.C140966Yy;
import X.C14360o3;
import X.C195218kN;
import X.C195298kV;
import X.C23031Ai;
import X.C2GT;
import X.C2ST;
import X.C31335Dq0;
import X.C35119FeM;
import X.C35246Fgf;
import X.C36731GHa;
import X.C51621MrE;
import X.C57155PYz;
import X.C69797Vvh;
import X.C70704WfT;
import X.C9GR;
import X.EnumC09460dv;
import X.GHY;
import X.InterfaceC09390do;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MSY;
import X.MZJ;
import X.PZB;
import X.PZW;
import X.U06;
import X.U0B;
import X.U0M;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceListFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class SearchDebugSettingsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final Companion Companion = new Object();
    public static final int MAX_CACHE_ALLOWANCE = 10;
    public static final int MIN_CACHE_ALLOWANCE = 0;
    public static final String TAG = "SearchDebugSettingsFragment";
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz userBootstrapListener = new InterfaceC41501vz() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$userBootstrapListener$1
        public final void onEvent(C70704WfT c70704WfT) {
            C2GT settingsModel;
            int A03 = C0f9.A03(-1341914005);
            SearchDebugSettingsFragment.this.toast("Bootstrap successfully fetched and updated.");
            settingsModel = SearchDebugSettingsFragment.this.getSettingsModel();
            C51621MrE c51621MrE = (C51621MrE) settingsModel.A02();
            if (c51621MrE != null) {
                SearchDebugSettingsFragment.this.updateItems(c51621MrE);
            }
            C0f9.A0A(-473774266, A03);
        }

        @Override // X.InterfaceC41501vz
        public /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(-1878023973);
            onEvent((C70704WfT) obj);
            C0f9.A0A(569732153, A03);
        }
    };
    public final InterfaceC09390do searchDebugPreferences$delegate = AbstractC09440dt.A00(EnumC09460dv.A02, new SearchDebugSettingsFragment$searchDebugPreferences$2(this));
    public final InterfaceC09390do settingsModel$delegate = AbstractC09440dt.A00(EnumC09460dv.A03, new SearchDebugSettingsFragment$settingsModel$2(this));

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131958389);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "search_debug_settings";
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final List createMenuOptions(C51621MrE c51621MrE) {
        ArrayList arrayList = new ArrayList();
        appendDisplayOptions(c51621MrE, arrayList);
        C35119FeM.A00(arrayList, true);
        appendBootstrapOptions(c51621MrE, arrayList);
        C35119FeM.A00(arrayList, true);
        appendClientSideMatchingOptions(c51621MrE, arrayList);
        C35119FeM.A00(arrayList, true);
        C31335Dq0.A03(arrayList, 2131958388);
        arrayList.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$createMenuOptions$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MZJ searchDebugPreferences;
                int A05 = C0f9.A05(-1799663524);
                searchDebugPreferences = SearchDebugSettingsFragment.this.getSearchDebugPreferences();
                C2ST.A00(AnonymousClass191.A00, new PZB(searchDebugPreferences, (InterfaceC23621Ds) null, 8));
                SearchDebugSettingsFragment.this.toast("Cleared.");
                C0f9.A0C(-963125570, A05);
            }
        }, getString(2131958375)));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MZJ getSearchDebugPreferences() {
        return (MZJ) this.searchDebugPreferences$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2GT getSettingsModel() {
        return (C2GT) this.settingsModel$delegate.getValue();
    }

    private final String timeToString(long j) {
        if (j < 0) {
            return "TIME_NOT_SET";
        }
        String formatDateTime = DateUtils.formatDateTime(requireActivity(), j, 524289);
        C14360o3.A07(formatDateTime);
        return formatDateTime;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }

    private final void appendBootstrapOptions(final C51621MrE c51621MrE, List list) {
        MSY.A0w(2131958374, list);
        list.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1451982013);
                C140966Yy c140966Yy = new C140966Yy(SearchDebugSettingsFragment.this.requireActivity(), SearchDebugSettingsFragment.this.getSession());
                c140966Yy.A0D(new BootstrapSurfaceListFragment());
                c140966Yy.A04();
                C0f9.A0C(-764052293, A05);
            }
        }, getString(2131958391)));
        boolean z = c51621MrE.A03;
        list.add(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                MZJ searchDebugPreferences;
                searchDebugPreferences = SearchDebugSettingsFragment.this.getSearchDebugPreferences();
                C2ST.A00(AnonymousClass191.A00, new PZW(searchDebugPreferences, (InterfaceC23621Ds) null, 36, z2));
            }
        }, 2131958382, z));
        if (z) {
            list.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$3

                /* renamed from: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$3$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public final class AnonymousClass1 extends C0YY implements InterfaceC16660sJ {
                    public final /* synthetic */ SearchDebugSettingsFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SearchDebugSettingsFragment searchDebugSettingsFragment) {
                        super(1);
                        this.this$0 = searchDebugSettingsFragment;
                    }

                    public final void invoke(int i) {
                        MZJ searchDebugPreferences;
                        searchDebugPreferences = this.this$0.getSearchDebugPreferences();
                        C2ST.A00(AnonymousClass191.A00, new C57155PYz(searchDebugPreferences, null, i, 28));
                    }

                    @Override // X.InterfaceC16660sJ
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).intValue());
                        return C0eB.A00;
                    }
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(-2043602976);
                    SearchDebugSettingsFragment searchDebugSettingsFragment = SearchDebugSettingsFragment.this;
                    searchDebugSettingsFragment.showCacheLimitSelectionDialog(c51621MrE.A00, new AnonymousClass1(searchDebugSettingsFragment));
                    C0f9.A0C(-1736890065, A05);
                }
            }, getString(2131958381, AbstractC25228BEl.A1Y(c51621MrE.A00))));
        }
        Context requireContext = requireContext();
        C195298kV c195298kV = C195218kN.A00(getSession()).A02;
        long j = c195298kV.A01;
        if (j == -1) {
            j = c195298kV.A03.getLong("last_fetched_time_ms", -1L);
            c195298kV.A01 = j;
        }
        list.add(new GHY(requireContext, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1405450112);
                C195218kN.A03(C195218kN.A00(SearchDebugSettingsFragment.this.getSession()));
                SearchDebugSettingsFragment.this.toast("Fetching User Bootstrap...");
                C0f9.A0C(-293111586, A05);
            }
        }, AbstractC31174DnI.A0w(this, timeToString(j), 2131958386)));
        Context requireContext2 = requireContext();
        C195298kV c195298kV2 = (C195298kV) AbstractC124145jT.A00(getSession()).A06.getValue();
        long j2 = c195298kV2.A01;
        if (j2 == -1) {
            j2 = c195298kV2.A03.getLong("last_fetched_time_ms", -1L);
            c195298kV2.A01 = j2;
        }
        list.add(new GHY(requireContext2, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(905958915);
                AbstractC124145jT.A00(SearchDebugSettingsFragment.this.getSession()).A01();
                C124155jU A00 = AbstractC124145jT.A00(SearchDebugSettingsFragment.this.getSession());
                if (!AbstractC167007dF.A1Z(A00.A07)) {
                    C124155jU.A00(A00);
                }
                SearchDebugSettingsFragment.this.toast("Fetching Keyword Bootstrap...");
                C0f9.A0C(747275779, A05);
            }
        }, AbstractC31174DnI.A0w(this, timeToString(j2), 2131958384)));
        Context requireContext3 = requireContext();
        C195298kV c195298kV3 = U0B.A00(getSession()).A02;
        long j3 = c195298kV3.A01;
        if (j3 == -1) {
            j3 = c195298kV3.A03.getLong("last_fetched_time_ms", -1L);
            c195298kV3.A01 = j3;
        }
        list.add(new GHY(requireContext3, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1200426268);
                C195298kV c195298kV4 = U0B.A00(SearchDebugSettingsFragment.this.getSession()).A02;
                c195298kV4.A01();
                c195298kV4.A02();
                U0M.A00(U0B.A00(SearchDebugSettingsFragment.this.getSession()));
                SearchDebugSettingsFragment.this.toast("Fetching Popular Keywords...");
                C0f9.A0C(251185045, A05);
            }
        }, AbstractC31174DnI.A0w(this, timeToString(j3), 2131958385)));
        Context requireContext4 = requireContext();
        C23031Ai A00 = AbstractC23021Ah.A00(getSession());
        list.add(new GHY(requireContext4, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendBootstrapOptions$7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1668096443);
                UserSession session = SearchDebugSettingsFragment.this.getSession();
                C14360o3.A0B(session, 0);
                U06 u06 = U06.A03;
                U06.A00 = -1L;
                u06.A00(session);
                SearchDebugSettingsFragment.this.toast("Force Refetching Recent Searches...");
                C0f9.A0C(2038363534, A05);
            }
        }, AbstractC31174DnI.A0w(this, timeToString(((Number) A00.A6v.CES(A00, C23031Ai.A8c[5])).longValue()), 2131958383)));
        list.add(new C35246Fgf(getString(2131958373)));
    }

    private final void appendClientSideMatchingOptions(final C51621MrE c51621MrE, List list) {
        MSY.A0w(2131958377, list);
        boolean z = c51621MrE.A04;
        list.add(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendClientSideMatchingOptions$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                MZJ searchDebugPreferences;
                searchDebugPreferences = SearchDebugSettingsFragment.this.getSearchDebugPreferences();
                C2ST.A00(AnonymousClass191.A00, new PZW(searchDebugPreferences, (InterfaceC23621Ds) null, 37, z2));
            }
        }, 2131958382, z));
        if (z) {
            list.add(new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendClientSideMatchingOptions$2

                /* renamed from: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendClientSideMatchingOptions$2$1, reason: invalid class name */
                /* loaded from: classes11.dex */
                public final class AnonymousClass1 extends C0YY implements InterfaceC16660sJ {
                    public final /* synthetic */ SearchDebugSettingsFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SearchDebugSettingsFragment searchDebugSettingsFragment) {
                        super(1);
                        this.this$0 = searchDebugSettingsFragment;
                    }

                    public final void invoke(int i) {
                        MZJ searchDebugPreferences;
                        searchDebugPreferences = this.this$0.getSearchDebugPreferences();
                        C2ST.A00(AnonymousClass191.A00, new C57155PYz(searchDebugPreferences, null, i, 29));
                    }

                    @Override // X.InterfaceC16660sJ
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).intValue());
                        return C0eB.A00;
                    }
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(1322049296);
                    SearchDebugSettingsFragment searchDebugSettingsFragment = SearchDebugSettingsFragment.this;
                    searchDebugSettingsFragment.showCacheLimitSelectionDialog(c51621MrE.A01, new AnonymousClass1(searchDebugSettingsFragment));
                    C0f9.A0C(1965059586, A05);
                }
            }, getString(2131958381, AbstractC25228BEl.A1Y(c51621MrE.A01))));
        }
        list.add(new C35246Fgf(getString(2131958376)));
    }

    private final void appendDisplayOptions(C51621MrE c51621MrE, List list) {
        MSY.A0w(2131958378, list);
        list.add(new C36731GHa(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$appendDisplayOptions$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MZJ searchDebugPreferences;
                searchDebugPreferences = SearchDebugSettingsFragment.this.getSearchDebugPreferences();
                C2ST.A00(AnonymousClass191.A00, new PZW(searchDebugPreferences, (InterfaceC23621Ds) null, 35, z));
            }
        }, 2131958379, c51621MrE.A02));
        list.add(new C35246Fgf(getString(2131958380)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCacheLimitSelectionDialog(int i, final InterfaceC16660sJ interfaceC16660sJ) {
        final NumberPicker numberPicker = new NumberPicker(requireActivity());
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setValue(i);
        C69797Vvh c69797Vvh = new C69797Vvh(requireActivity());
        c69797Vvh.A07(numberPicker);
        c69797Vvh.A03(null, 2131954754);
        c69797Vvh.A04(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.section.search.SearchDebugSettingsFragment$showCacheLimitSelectionDialog$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InterfaceC16660sJ.this.invoke(Integer.valueOf(numberPicker.getValue()));
            }
        }, 2131968948);
        AbstractC50523MSb.A0p(c69797Vvh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast(String str) {
        C9GR.A09(getActivity(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItems(C51621MrE c51621MrE) {
        c51621MrE.toString();
        setItems(createMenuOptions(c51621MrE));
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int A02 = C0f9.A02(1594842746);
        super.onPause();
        getSettingsModel().A08(new SearchDebugSettingsFragment$sam$androidx_lifecycle_Observer$0(new SearchDebugSettingsFragment$onPause$1(this)));
        AbstractC25651Mw.A00(getSession()).A02(this.userBootstrapListener, C70704WfT.class);
        C0f9.A09(-727597239, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-39237189);
        super.onResume();
        C51621MrE c51621MrE = (C51621MrE) getSettingsModel().A02();
        if (c51621MrE != null) {
            updateItems(c51621MrE);
        }
        getSettingsModel().A06(this, new SearchDebugSettingsFragment$sam$androidx_lifecycle_Observer$0(new SearchDebugSettingsFragment$onResume$2(this)));
        AbstractC25651Mw.A00(getSession()).A01(this.userBootstrapListener, C70704WfT.class);
        C0f9.A09(2135988857, A02);
    }
}
