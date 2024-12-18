package com.instagram.business.fragment;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC35211Fg4;
import X.AbstractC53242c7;
import X.AbstractC54852fj;
import X.AbstractC59962oe;
import X.AbstractC72153Lo;
import X.AnonymousClass693;
import X.C06090Tz;
import X.C0f9;
import X.C155046xt;
import X.C1QO;
import X.C31500Dsk;
import X.C31650DvG;
import X.C32548EUy;
import X.C34404FEu;
import X.C34650FOi;
import X.C34716FRb;
import X.C35280FhF;
import X.C35792FrU;
import X.C3LO;
import X.C3LY;
import X.C66362zD;
import X.C66392zG;
import X.C68U;
import X.EXG;
import X.EnumC151596s5;
import X.FKC;
import X.InterfaceC37222GaX;
import X.InterfaceC41501vz;
import X.InterfaceC53742dD;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import X.Y7A;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* loaded from: classes6.dex */
public class OnboardingCheckListFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public Handler A00;
    public C34650FOi A01;
    public FKC A02;
    public C34404FEu A03;
    public C34716FRb A04;
    public C31500Dsk A05;
    public C66362zD A06;
    public UserSession A07;
    public String A08;
    public boolean A0A;
    public InterfaceC56362iU A0B;
    public InterfaceC37222GaX A0C;
    public boolean A0D;
    public BusinessNavBar mBusinessNavBar;
    public ImageView mConfettiView;
    public IgdsHeadline mHeadline;
    public ViewGroup mLayoutContent;
    public ProgressBar mProgressBar;
    public RecyclerView mRecyclerView;
    public TextView mSkipOcButton;
    public View mSkipOcContainer;
    public TextView mStepsCompletedTextView;
    public boolean A09 = true;
    public final InterfaceC41501vz A0E = C31650DvG.A00(this, 8);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "onboarding_checklist_fragment";
    }

    public final void A00() {
        InterfaceC37222GaX interfaceC37222GaX = this.A0C;
        if (interfaceC37222GaX != null) {
            interfaceC37222GaX.AGf();
        } else {
            AbstractC25226BEj.A1Q(this);
        }
        InterfaceC53742dD interfaceC53742dD = (InterfaceC53742dD) AbstractC54852fj.A00();
        if (interfaceC53742dD != null) {
            AbstractC72153Lo.A00 = true;
            interfaceC53742dD.EfJ(C1QO.A0E);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        boolean z = this.A09;
        C34716FRb c34716FRb = this.A04;
        if (z) {
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = c34716FRb.A04;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Cid(new Y7A("onboarding_checklist", c34716FRb.A08, null, null, null, null, null, null));
            }
        } else {
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = c34716FRb.A04;
            if (businessFlowAnalyticsLogger2 != null) {
                businessFlowAnalyticsLogger2.CjL(new Y7A("onboarding_checklist", c34716FRb.A08, null, null, null, null, null, null));
            }
        }
        if (this.A08.equals("profile")) {
            AbstractC31179DnN.A1K(this, 0);
        }
        boolean z2 = this.A0D;
        InterfaceC37222GaX interfaceC37222GaX = this.A0C;
        if (z2) {
            interfaceC37222GaX.getClass();
            AbstractC31179DnN.A1T(interfaceC37222GaX);
            return true;
        }
        if (!AbstractC35211Fg4.A03(interfaceC37222GaX)) {
            return false;
        }
        A00();
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ActionButton Eha = interfaceC56362iU.Eha(ViewOnClickListenerC35690FpP.A00(this, 29), R.drawable.instagram_x_pano_outline_24);
        Eha.setColorFilter(AbstractC31174DnI.A09(requireContext(), AbstractC53242c7.A08(requireContext())));
        AbstractC31173DnH.A1E(Eha, this, 2131956237);
        if (this.A0D) {
            C3LO A0K = AbstractC31174DnI.A0K();
            A0K.A0G = ViewOnClickListenerC35690FpP.A00(this, 30);
            A0K.A05 = 2131956237;
            interfaceC56362iU.Ehd(new C3LY(A0K));
        }
        this.A0B = interfaceC56362iU;
        interfaceC56362iU.C95().setVisibility(8);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0C = AbstractC35211Fg4.A01(this);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.FOi, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC37222GaX interfaceC37222GaX;
        InterfaceC37222GaX interfaceC37222GaX2;
        boolean z;
        InterfaceC37222GaX interfaceC37222GaX3;
        int A02 = C0f9.A02(415085458);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = AbstractC31176DnK.A0S(this);
        String A0Z = AbstractC31171DnF.A0Z(requireArguments);
        if (A0Z == null) {
            A0Z = "";
        }
        this.A08 = A0Z;
        BusinessFlowAnalyticsLogger A00 = AbstractC35211Fg4.A00(this.A0C, this, this.A07);
        this.A01 = new Object();
        this.A03 = new C34404FEu(this.A07);
        this.A02 = new FKC(requireContext());
        this.A00 = AbstractC167007dF.A0J();
        InterfaceC37222GaX interfaceC37222GaX4 = this.A0C;
        if ((interfaceC37222GaX4 != null && interfaceC37222GaX4.B77() == EnumC151596s5.A04) || (((interfaceC37222GaX = this.A0C) != null && interfaceC37222GaX.B77() == EnumC151596s5.A03) || (((interfaceC37222GaX2 = this.A0C) != null && interfaceC37222GaX2.B77() == EnumC151596s5.A06) || (AbstractC35211Fg4.A03(this.A0C) && (interfaceC37222GaX3 = this.A0C) != null && interfaceC37222GaX3.E3w() != ConversionStep.A0G)))) {
            z = true;
        } else {
            z = false;
        }
        this.A0D = z;
        AbstractC35211Fg4.A02(this.A0C);
        C31500Dsk c31500Dsk = new C31500Dsk(this.A07, this);
        this.A05 = c31500Dsk;
        this.A04 = new C34716FRb(A00, this, c31500Dsk, this.A07, this.A08);
        AbstractC25651Mw.A00(this.A07).A01(this.A0E, C155046xt.class);
        C34716FRb c34716FRb = this.A04;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = c34716FRb.A04;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clo(new Y7A("onboarding_checklist", c34716FRb.A08, null, null, null, null, null, null));
        }
        C0f9.A09(138482686, A02);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1390027536);
        View inflate = layoutInflater.inflate(R.layout.onboarding_check_list_fragment, viewGroup, false);
        this.mRecyclerView = AbstractC31172DnG.A0G(inflate, R.id.recycler_onboarding_check_list);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A08 = true;
        A0R.A01(new EXG(this, AbstractC31178DnM.A1X(C06090Tz.A05, this.A07, 36326167669782239L)));
        this.A06 = AbstractC31173DnH.A0R(A0R, new Object());
        AbstractC31177DnL.A17(this, this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.A06);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.onboarding_checklist_headline);
        this.mHeadline = A0Q;
        A0Q.setVisibility(0);
        this.mStepsCompletedTextView = AbstractC166997dE.A0T(inflate, R.id.text_steps_completed);
        this.mProgressBar = (ProgressBar) inflate.requireViewById(R.id.progressbar_loading);
        this.mLayoutContent = AbstractC31173DnH.A0F(inflate, R.id.layout_content);
        this.mConfettiView = AbstractC31173DnH.A0I(inflate, R.id.image_confetti);
        this.mBusinessNavBar = (BusinessNavBar) inflate.requireViewById(R.id.navigation_bar);
        CallerContext callerContext = C35792FrU.A00;
        FKC fkc = this.A02;
        fkc.A00 = this.mConfettiView;
        AnonymousClass693 A00 = C68U.A00(fkc.A02, R.raw.countdown_sticker_confetti);
        fkc.A01 = A00;
        if (A00 != null) {
            A00.A8x(new C35280FhF(fkc, 4));
        }
        ImageView imageView = fkc.A00;
        if (imageView != null) {
            imageView.setImageDrawable(fkc.A01);
        }
        this.mBusinessNavBar.setPrimaryButtonOnclickListeners(ViewOnClickListenerC35690FpP.A00(this, 28));
        C0f9.A09(1573267864, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1164212644);
        super.onDestroy();
        AbstractC25651Mw.A00(this.A07).A02(this.A0E, C155046xt.class);
        C0f9.A09(41845197, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2086006061);
        super.onDestroyView();
        InterfaceC56362iU interfaceC56362iU = this.A0B;
        if (interfaceC56362iU != null) {
            interfaceC56362iU.C95().setVisibility(0);
        }
        this.mProgressBar = null;
        this.mLayoutContent = null;
        this.mConfettiView = null;
        C0f9.A09(-1641870030, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(102267022);
        super.onStart();
        if (this.A08.equals("profile")) {
            AbstractC31179DnN.A1K(this, 8);
        }
        C0f9.A09(-818054959, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C34716FRb c34716FRb = this.A04;
        List list = c34716FRb.A03;
        if (list == null) {
            c34716FRb.A06.A02(new C32548EUy(c34716FRb, 31), c34716FRb.A08);
            return;
        }
        OnboardingCheckListFragment onboardingCheckListFragment = c34716FRb.A05;
        ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
        if (progressBar != null && onboardingCheckListFragment.mLayoutContent != null) {
            progressBar.setVisibility(8);
            onboardingCheckListFragment.mLayoutContent.setVisibility(0);
        }
        c34716FRb.A02(list);
    }
}
