package com.instagram.genericsurvey.fragment;

import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.AbstractC40655I0n;
import X.AbstractC43591JPw;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC66261U6f;
import X.AnonymousClass001;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C1ON;
import X.C1OU;
import X.C25621Ms;
import X.C38321qM;
import X.C39030HGg;
import X.C3G2;
import X.C3M4;
import X.C3XG;
import X.C41228IMt;
import X.C41326IQw;
import X.C42786IwO;
import X.C42800Iwc;
import X.C56352iT;
import X.C5I7;
import X.C6BQ;
import X.C82713mZ;
import X.HHB;
import X.HM1;
import X.IGH;
import X.IKO;
import X.IMM;
import X.InterfaceC09390do;
import X.InterfaceC43439JHd;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.J1C;
import X.JGA;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.viewpager.BakeOffViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public final class AdBakeOffFragment extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou, InterfaceC43439JHd, JGA {
    public int A00;
    public Toast A01;
    public HHB A02;
    public HM1 A03;
    public String A04;
    public IGH A05;
    public String A06;
    public IMM answerButtonController;
    public BakeoffFeedPairSectionController bakeoffFeedPairSectionController;
    public J1C bakeoffStoryPairSectionController;
    public ViewGroup contentContainer;
    public SpinnerImageView loadingSpinner;
    public C41228IMt navbarController;
    public ViewGroup retryViewGroup;
    public ViewStub retryViewStub;
    public final String A07 = AbstractC167017dG.A0j();
    public final List A09 = AbstractC166987dD.A1E();
    public final List A08 = AbstractC166987dD.A1E();
    public final Set A0A = AbstractC166987dD.A1H();
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);
    public final String A0C = "hot_or_not";

    @Override // X.InterfaceC43439JHd
    public final void D4W() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C41228IMt c41228IMt = this.navbarController;
        if (c41228IMt != null) {
            c41228IMt.A01(requireContext(), interfaceC56362iU);
        }
        List list = this.A09;
        if (AbstractC166987dD.A1b(list)) {
            C41228IMt c41228IMt2 = this.navbarController;
            if (c41228IMt2 != null) {
                HM1 hm1 = this.A03;
                if (hm1 != null) {
                    String str = hm1.A03;
                    if (str != null) {
                        TextView textView = c41228IMt2.A01;
                        String str2 = "pageTitle";
                        if (textView != null) {
                            textView.setText(str);
                            TextView textView2 = c41228IMt2.A00;
                            if (textView2 == null) {
                                str2 = "pageIndicator";
                            } else {
                                textView2.setVisibility(0);
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            C41228IMt c41228IMt3 = this.navbarController;
            if (c41228IMt3 != null) {
                c41228IMt3.A00(this.A00, 0, list.size());
            }
        }
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AbstractC166987dD.A1b(this.A09)) {
            A02(this);
        }
    }

    public static final C38321qM A00(AdBakeOffFragment adBakeOffFragment, int i, int i2) {
        C3XG c3xg;
        String A0n = AnonymousClass001.A0n("Media is null for mPairs[", "][", "]. Media id: %s, Ad id: %s", i, i2);
        IKO iko = (IKO) ((List) adBakeOffFragment.A09.get(i)).get(i2);
        C38321qM c38321qM = iko.A03;
        if (c38321qM != null || ((c3xg = iko.A02) != null && (c38321qM = AbstractC37300Gc1.A0E(c3xg)) != null)) {
            return c38321qM;
        }
        throw AbstractC166987dD.A14(A0n);
    }

    public static final void A01(AdBakeOffFragment adBakeOffFragment) {
        AbstractC12990ll A0o = AbstractC166987dD.A0o(adBakeOffFragment.A0B);
        String str = adBakeOffFragment.A06;
        C25621Ms A0D = AbstractC31179DnN.A0D(A0o);
        A0D.A0B("survey/get/");
        A0D.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "bakeoff");
        AbstractC37303Gc4.A15(A0D);
        A0D.A0H("extra_data_token", str);
        C1ON A0e = AbstractC25227BEk.A0e(A0D, HM1.class, C41326IQw.class);
        C39030HGg.A00(A0e, adBakeOffFragment, 8);
        adBakeOffFragment.schedule(A0e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.HjF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.genericsurvey.fragment.AdBakeOffFragment r10) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genericsurvey.fragment.AdBakeOffFragment.A02(com.instagram.genericsurvey.fragment.AdBakeOffFragment):void");
    }

    public static final void A03(AdBakeOffFragment adBakeOffFragment) {
        HHB hhb = adBakeOffFragment.A02;
        if (hhb == null) {
            C14360o3.A0F("analyticsHelper");
            throw C00O.createAndThrow();
        }
        hhb.A00 = System.currentTimeMillis();
        hhb.A01 = 0L;
        FragmentActivity requireActivity = adBakeOffFragment.requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(6));
        C56352iT AYT = ((BaseFragmentActivity) requireActivity).AYT();
        if (AYT != null) {
            AYT.A0T();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A04(AdBakeOffFragment adBakeOffFragment, int i, boolean z, boolean z2) {
        BakeoffFeedPairSectionController bakeoffFeedPairSectionController;
        HM1 hm1 = adBakeOffFragment.A03;
        if (hm1 != null && "bakeoff_feed_item".equals(hm1.A05)) {
            if (z2 && (bakeoffFeedPairSectionController = adBakeOffFragment.bakeoffFeedPairSectionController) != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(400L);
                alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                BakeOffViewPager bakeOffViewPager = bakeoffFeedPairSectionController.fragmentPager;
                if (bakeOffViewPager != null) {
                    bakeOffViewPager.startAnimation(alphaAnimation);
                }
            }
            adBakeOffFragment.A0A.add(String.valueOf(i));
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController2 = adBakeOffFragment.bakeoffFeedPairSectionController;
            if (bakeoffFeedPairSectionController2 != null) {
                bakeoffFeedPairSectionController2.setMode(i);
            }
            if (z && AbstractC166987dD.A1b(adBakeOffFragment.A09)) {
                C38321qM A00 = A00(adBakeOffFragment, adBakeOffFragment.A00, i);
                String str = adBakeOffFragment.A07;
                String A002 = AbstractC40655I0n.A00(adBakeOffFragment.A03, adBakeOffFragment.A00);
                String id = A00.getId();
                InterfaceC09390do interfaceC09390do = adBakeOffFragment.A0B;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                AbstractC167007dF.A1F(str, 0, A0r);
                C82713mZ A0M = AbstractC37302Gc3.A0M(adBakeOffFragment, "instagram_survey_", "media_impression");
                A0M.A70 = str;
                A0M.A6N = A002;
                A0M.A61 = id;
                AbstractC37302Gc3.A1R(A0M);
                AbstractC37304Gc5.A1P(A0r, A0M);
                String A0s = AbstractC31173DnH.A0s(adBakeOffFragment.A08, adBakeOffFragment.A00);
                String str2 = adBakeOffFragment.A04;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                AbstractC167007dF.A1G(A0s, 3, A0r2);
                C82713mZ A0M2 = AbstractC37302Gc3.A0M(adBakeOffFragment, "instagram_survey_", "bakeoff_action");
                A0M2.A0G(A0r2, A00);
                A0M2.A4P = "switch";
                A0M2.A6P = A0s;
                A0M2.A4O = str2;
                AbstractC37304Gc5.A1P(A0r2, A0M2);
            }
        } else {
            J1C j1c = adBakeOffFragment.bakeoffStoryPairSectionController;
            if (j1c != null) {
                Set set = adBakeOffFragment.A0A;
                C14360o3.A0B(set, 0);
                List list = j1c.A06;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (set.contains(((Reel) list.get(i2)).getId())) {
                        FixedTabBar fixedTabBar = j1c.A04;
                        if (fixedTabBar == null) {
                            C14360o3.A0F("fixedTabBar");
                            throw C00O.createAndThrow();
                        }
                        int i3 = i2;
                        if (fixedTabBar.A09) {
                            i3 = AbstractC31172DnG.A03(fixedTabBar.A07, 1) - i2;
                        }
                        ((View) fixedTabBar.A07.get(i3)).setSelected(true);
                    }
                }
            }
        }
        IMM imm = adBakeOffFragment.answerButtonController;
        if (imm != null) {
            imm.A00(AbstractC167007dF.A1P(adBakeOffFragment.A0A.size(), ((List) adBakeOffFragment.A09.get(adBakeOffFragment.A00)).size()));
        }
    }

    public final void A05(String str) {
        String str2 = this.A07;
        String A00 = AbstractC40655I0n.A00(this.A03, this.A00);
        UserSession A0r = AbstractC166987dD.A0r(this.A0B);
        AbstractC167007dF.A1F(str2, 0, A0r);
        C82713mZ A0M = AbstractC37302Gc3.A0M(this, "instagram_survey_", "exit_event");
        A0M.A70 = str2;
        A0M.A6N = A00;
        A0M.A5L = str;
        if (!C5I7.A00(A0r, A0M, this, C05F.A01)) {
            AbstractC37304Gc5.A1P(A0r, A0M);
        }
        if (!str.equals("back_button")) {
            if (getParentFragmentManager().A0L() == 0 && (requireActivity() instanceof ModalActivity)) {
                AbstractC25227BEk.A1B(this);
            } else {
                AbstractC25226BEj.A1P(this);
            }
        }
        IGH igh = this.A05;
        if (igh != null) {
            C6BQ.A0E(igh.A01, igh.A02, igh.A00);
        }
    }

    @Override // X.InterfaceC43439JHd
    public final void D3i() {
        A05("close_button");
    }

    @Override // X.InterfaceC43439JHd
    public final void D3m() {
        A05("done_button");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.6ab] */
    @Override // X.JGA
    public final void Ddy(C42800Iwc c42800Iwc, Reel reel, List list) {
        String str;
        String str2 = this.A07;
        String A00 = AbstractC40655I0n.A00(this.A03, this.A00);
        InterfaceC09390do interfaceC09390do = this.A0B;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 1);
        if (!reel.A15(A0r)) {
            C38321qM c38321qM = reel.A0A(A0r, 0).A0b;
            if (c38321qM != null) {
                str = c38321qM.getId();
                if (str == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            str = "";
        }
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        AbstractC167007dF.A1F(str2, 0, A0r2);
        C82713mZ A0M = AbstractC37302Gc3.A0M(this, "instagram_survey_", "media_impression");
        A0M.A70 = str2;
        A0M.A6N = A00;
        A0M.A61 = str;
        AbstractC37302Gc3.A1R(A0M);
        AbstractC37304Gc5.A1P(A0r2, A0M);
        this.A0A.add(AbstractC37301Gc2.A0i(reel));
        C1OU c1ou = C1OU.$redex_init_class;
        ?? obj = new Object();
        obj.A02(AbstractC166987dD.A0r(interfaceC09390do), reel.getId(), list);
        obj.A03(C3G2.A0H);
        obj.A08(str2);
        Bundle A002 = obj.A00();
        ReelViewerFragment reelViewerFragment = new ReelViewerFragment();
        reelViewerFragment.setArguments(A002);
        C140966Yy A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
        A0j.A0D(reelViewerFragment);
        A0j.A0A = AbstractC111324zv.A00(94);
        A0j.A04();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0C;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A05("back_button");
        FragmentActivity requireActivity = requireActivity();
        C1OU c1ou = C1OU.$redex_init_class;
        C3M4 A05 = C3M4.A05(requireActivity);
        if (A05 != null && A05.A0b()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.HHB, java.lang.Object, X.2pj] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(340336413);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        this.A06 = requireArguments.getString(AbstractC111324zv.A00(288));
        this.navbarController = new C41228IMt(AbstractC31177DnL.A09(this), this);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C14360o3.A07(childFragmentManager);
        InterfaceC09390do interfaceC09390do = this.A0B;
        this.bakeoffFeedPairSectionController = new BakeoffFeedPairSectionController(requireContext, childFragmentManager, AbstractC166987dD.A0r(interfaceC09390do), this);
        this.bakeoffStoryPairSectionController = new J1C(requireContext, this, AbstractC166987dD.A0r(interfaceC09390do), this);
        this.answerButtonController = new IMM(requireContext, this);
        ?? obj = new Object();
        this.A02 = obj;
        registerLifecycleListener(obj);
        A01(this);
        int i = requireArguments.getInt("GenericSurveyFragment.ARGUMENTS_BLOKS_GENERIC_SURVEY_DELEGATE_KEY", -1);
        if (i != -1) {
            this.A05 = (IGH) AbstractC66261U6f.A01(IGH.class, Integer.valueOf(i));
        }
        C0f9.A09(-411579094, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1646194751);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_bakeoff, viewGroup, false);
        this.contentContainer = (ViewGroup) inflate.requireViewById(R.id.content_container);
        this.retryViewStub = AbstractC31173DnH.A0G(inflate, R.id.hon_retry);
        this.loadingSpinner = AbstractC31180DnO.A0V(inflate);
        C0f9.A09(-165966369, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-747023049);
        super.onDestroy();
        AdBakeOffFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(1619897403, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-862421504);
        super.onDestroyView();
        C0f9.A09(-714016331, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C3M4 A05;
        int A02 = C0f9.A02(1915298365);
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        C1OU c1ou = C1OU.$redex_init_class;
        C3M4 A052 = C3M4.A05(requireActivity);
        if (A052 != null && A052.A0a() && (A05 = C3M4.A05(requireActivity())) != null) {
            A05.A0X(null, null, this, new C42786IwO(this));
        }
        AbstractC31179DnN.A1J(this, 8);
        C0f9.A09(-110589235, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-117066865);
        super.onStop();
        AbstractC31179DnN.A1J(this, 0);
        C0f9.A09(-1732084279, A02);
    }
}
