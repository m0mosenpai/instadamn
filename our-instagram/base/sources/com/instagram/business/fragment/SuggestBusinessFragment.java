package com.instagram.business.fragment;

import X.AbstractC151506rw;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC31180DnO;
import X.AbstractC35211Fg4;
import X.AbstractC59962oe;
import X.C0f9;
import X.C1I4;
import X.C1ON;
import X.C31500Dsk;
import X.C31650DvG;
import X.C31722DwR;
import X.C32548EUy;
import X.C34405FEv;
import X.C34688FPz;
import X.C35925Ftj;
import X.C3MC;
import X.C56352iT;
import X.C67919V2j;
import X.C69015Vfr;
import X.E0L;
import X.EVM;
import X.FQW;
import X.InterfaceC37190Ga1;
import X.InterfaceC37222GaX;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class SuggestBusinessFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC37190Ga1 {
    public C67919V2j A00;
    public BusinessFlowAnalyticsLogger A01;
    public C31500Dsk A02;
    public C34688FPz A03;
    public UserSession A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public int A0A;
    public int A0B;
    public FQW A0D;
    public InterfaceC37222GaX A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public C56352iT mActionBarService;
    public BusinessNavBar mBusinessNavBar;
    public EVM mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public IgdsStepperHeader mStepperHeader;
    public boolean A09 = true;
    public final InterfaceC41501vz A0I = C31650DvG.A00(this, 9);
    public C1I4 A0C = new E0L(this, 2);

    public static C67919V2j A00(SuggestBusinessFragment suggestBusinessFragment) {
        C67919V2j c67919V2j = suggestBusinessFragment.A00;
        if (c67919V2j == null) {
            C67919V2j c67919V2j2 = new C67919V2j(suggestBusinessFragment.requireContext(), new C34405FEv(suggestBusinessFragment), suggestBusinessFragment, suggestBusinessFragment.A04, suggestBusinessFragment.A0G, suggestBusinessFragment.A0F);
            suggestBusinessFragment.A00 = c67919V2j2;
            return c67919V2j2;
        }
        return c67919V2j;
    }

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        this.A09 = false;
        A03(this, "continue", null);
        InterfaceC37222GaX interfaceC37222GaX = this.A0E;
        if (interfaceC37222GaX != null) {
            ((BusinessConversionActivity) interfaceC37222GaX).CnD(null);
        } else {
            AbstractC25226BEj.A1Q(this);
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "suggest_business_fragment";
    }

    public static void A01(SuggestBusinessFragment suggestBusinessFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.CjJ(new Y7A("pro_account_suggestions", suggestBusinessFragment.A05, null, null, null, null, null, null));
        }
    }

    public static void A02(SuggestBusinessFragment suggestBusinessFragment) {
        if (suggestBusinessFragment.mView != null && suggestBusinessFragment.A07 != null) {
            C67919V2j A00 = A00(suggestBusinessFragment);
            List list = suggestBusinessFragment.A07;
            if (list != null) {
                A00.A00 = list;
                A00.A00();
            }
            List list2 = suggestBusinessFragment.A07;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            for (int i = 0; i < list2.size(); i++) {
                User user = ((C69015Vfr) list2.get(i)).A01;
                if (user != null) {
                    builder.add((Object) user);
                    builder2.add((Object) user.getId());
                }
            }
            UserSession userSession = suggestBusinessFragment.A04;
            ImmutableList build = builder.build();
            AbstractC167017dG.A1N(userSession, build);
            C1ON A03 = AbstractC151506rw.A03(userSession, build);
            C32548EUy.A01(A03, suggestBusinessFragment, 23);
            suggestBusinessFragment.schedule(A03);
        }
    }

    public static void A03(SuggestBusinessFragment suggestBusinessFragment, String str, Map map) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("pro_account_suggestions", suggestBusinessFragment.A05, str, null, null, null, map, null));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("");
        C31722DwR.A01(ViewOnClickListenerC35690FpP.A00(this, 39), interfaceC56362iU, new Object());
        ViewOnClickListenerC35690FpP.A02(AbstractC31176DnK.A0I(), interfaceC56362iU, this, 40);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A09 && (businessFlowAnalyticsLogger = this.A01) != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("pro_account_suggestions", this.A05, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0E = AbstractC35211Fg4.A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1391987609);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC31176DnK.A0S(this);
        this.A05 = AbstractC31173DnH.A0j(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A08 = requireArguments.getBoolean("ARG_CHECKLIST_ITEM_COMPLETED", false);
        String string = requireArguments.getString("suggested_business_fetch_entry_point");
        this.A06 = "";
        if (string != null) {
            this.A06 = string;
        }
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A0E, this, this.A04);
        this.A01 = A00;
        if (A00 != null) {
            A00.Clo(new Y7A("pro_account_suggestions", this.A05, null, null, null, null, null, null));
        }
        this.A02 = new C31500Dsk(this.A04, this);
        this.A03 = new C34688FPz();
        this.A0H = requireArguments.getBoolean("ARG_SHOW_STEPPER_HEADER", false);
        this.A0B = requireArguments.getInt("ARG_STEP_INDEX", -1);
        this.A0A = requireArguments.getInt("ARG_STEP_COUNT", -1);
        this.A0G = requireArguments.getString("ARG_TITLE", requireContext().getString(2131974860));
        this.A0F = requireArguments.getString("ARG_SUB_TITLE", requireContext().getString(2131974859));
        C0f9.A09(-72314051, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1925800858);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.suggest_business_fragment);
        BusinessNavBar businessNavBar = (BusinessNavBar) A0A.requireViewById(R.id.navigation_bar);
        this.mBusinessNavBar = businessNavBar;
        EVM evm = new EVM(businessNavBar, this, 2131968535, -1);
        this.mBusinessNavBarHelper = evm;
        registerLifecycleListener(evm);
        this.mLoadingSpinner = (SpinnerImageView) A0A.requireViewById(R.id.loading_indicator);
        String A0b = AbstractC31180DnO.A0b(this);
        A0b.getClass();
        this.A05 = A0b;
        this.mActionBarService = AbstractC31176DnK.A0J(this);
        this.mBusinessNavBar.setVisibility(8);
        InterfaceC37222GaX interfaceC37222GaX = this.A0E;
        if (interfaceC37222GaX != null && interfaceC37222GaX.E3v() == null) {
            this.mBusinessNavBar.setPrimaryButtonText(2131961124);
        }
        C0f9.A09(1206583995, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-785230903);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        AbstractC25651Mw.A00(this.A04).A02(this.A0I, C3MC.class);
        C0f9.A09(358279542, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.mRecyclerView = A0F;
        A0F.A14(this.A0C);
        if (this.A01 != null) {
            this.A0D = new FQW(this.mRecyclerView, A00(this), this);
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.mBusinessNavBar.A01(this.mRecyclerView);
        this.mRecyclerView.setAdapter(A00(this));
        AbstractC25651Mw.A00(this.A04).A01(this.A0I, C3MC.class);
        if (this.A0H) {
            IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
            this.mStepperHeader = igdsStepperHeader;
            igdsStepperHeader.setVisibility(0);
            this.mStepperHeader.A02(this.A0B, this.A0A);
        }
        if (this.A07 == null) {
            SpinnerImageView spinnerImageView = this.mLoadingSpinner;
            if (spinnerImageView != null && this.mBusinessNavBar != null) {
                spinnerImageView.setVisibility(0);
            }
            this.A03.A00(new C35925Ftj(this), this.A04, this, this.A06);
            return;
        }
        A02(this);
    }
}
