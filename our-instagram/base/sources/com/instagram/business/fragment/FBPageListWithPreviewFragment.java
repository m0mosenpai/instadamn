package com.instagram.business.fragment;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC35211Fg4;
import X.AbstractC49092Nc;
import X.AbstractC59962oe;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C34693FQe;
import X.C35034Fc7;
import X.C35788FrQ;
import X.EQ9;
import X.EVM;
import X.EnumC151596s5;
import X.InterfaceC09390do;
import X.InterfaceC37190Ga1;
import X.InterfaceC37222GaX;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.Y7A;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class FBPageListWithPreviewFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC37190Ga1 {
    public BusinessFlowAnalyticsLogger A00;
    public InterfaceC37222GaX A01;
    public PageSelectionOverrideData A02;
    public C34693FQe A03;
    public AbstractC18680vv A04;
    public boolean A05;
    public boolean A06;
    public InterfaceC56362iU A07;
    public EQ9 A08;
    public BusinessInfo A09;
    public String A0A;
    public boolean A0B;
    public final Handler A0C = AbstractC167007dF.A0J();
    public BusinessNavBar mBusinessNavBar;
    public EVM mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public IgdsStepperHeader mStepperHeader;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fb_page_list_with_preview";
    }

    @Override // X.InterfaceC37190Ga1
    public final void APP() {
        if (this.A05) {
            this.A07.ARS(false);
            this.A07.setIsLoading(true);
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void ARU() {
        if (this.A05) {
            this.A07.ARS(true);
            this.A07.setIsLoading(false);
        }
    }

    @Override // X.InterfaceC37190Ga1
    public final void Dao() {
        this.A03.A00("continue");
    }

    @Override // X.InterfaceC37190Ga1
    public final void DjW() {
        if (!this.A06 && !this.A05 && this.A01 != null) {
            this.A03.A00("skip");
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Clj(new Y7A("page_selection", this.A03.A06, null, null, null, null, null, null));
            }
            InterfaceC37222GaX interfaceC37222GaX = this.A01;
            if (interfaceC37222GaX != null) {
                ((BusinessConversionActivity) interfaceC37222GaX).A0p(null, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r3) {
        /*
            r2 = this;
            r2.A07 = r3
            boolean r0 = r2.A06
            if (r0 == 0) goto L2c
            r0 = 2131964387(0x7f1331e3, float:1.9565554E38)
        L9:
            r3.Efu(r0)
        Lc:
            boolean r0 = r2.A0B
            if (r0 == 0) goto L19
            X.3LO r1 = X.AbstractC31174DnI.A0K()
            r0 = 16
            X.ViewOnClickListenerC35690FpP.A02(r1, r3, r2, r0)
        L19:
            boolean r0 = r2.A05
            if (r0 == 0) goto L2b
            X.Ffp r1 = new X.Ffp
            r1.<init>()
            r0 = 17
            X.FpP r0 = X.ViewOnClickListenerC35690FpP.A00(r2, r0)
            X.C31722DwR.A01(r0, r3, r1)
        L2b:
            return
        L2c:
            boolean r0 = r2.A05
            if (r0 == 0) goto Lc
            r0 = 2131973324(0x7f1354cc, float:1.958368E38)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        C34693FQe c34693FQe = this.A03;
        boolean z = this.A0B;
        boolean z2 = c34693FQe.A09;
        if (!z2 && !c34693FQe.A08 && (businessFlowAnalyticsLogger = c34693FQe.A01) != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("page_selection", c34693FQe.A06, null, null, null, null, null, null));
        }
        if (!z2 && !c34693FQe.A08) {
            InterfaceC37222GaX interfaceC37222GaX = c34693FQe.A02;
            if (interfaceC37222GaX != null) {
                if (z) {
                    AbstractC31179DnN.A1T(interfaceC37222GaX);
                }
                return true;
            }
            return false;
        }
        InterfaceC37222GaX interfaceC37222GaX2 = c34693FQe.A02;
        interfaceC37222GaX2.getClass();
        interfaceC37222GaX2.AGf();
        return true;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A01 = AbstractC35211Fg4.A01(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (r2 != X.EnumC151596s5.A0C) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r2 != X.EnumC151596s5.A0B) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        if (r2 != com.instagram.business.controller.datamodel.ConversionStep.A0G) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r8.A01 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0.E3v() != null) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 1000815852(0x3ba73cec, float:0.005103698)
            int r2 = X.C0f9.A02(r0)
            r0 = 2131625441(0x7f0e05e1, float:1.887809E38)
            r6 = 0
            android.view.View r3 = r9.inflate(r0, r10, r6)
            r0 = 2131436871(0x7f0b2547, float:1.8495625E38)
            android.view.View r5 = r3.requireViewById(r0)
            com.instagram.business.ui.BusinessNavBar r5 = (com.instagram.business.ui.BusinessNavBar) r5
            r8.mBusinessNavBar = r5
            X.GaX r0 = r8.A01
            if (r0 == 0) goto L27
            com.instagram.business.controller.datamodel.ConversionStep r0 = r0.E3v()
            r4 = 2131961124(0x7f132524, float:1.9558936E38)
            if (r0 == 0) goto L2a
        L27:
            r4 = 2131968535(0x7f134217, float:1.9573967E38)
        L2a:
            r1 = 2131961126(0x7f132526, float:1.955894E38)
            X.EVM r0 = new X.EVM
            r0.<init>(r5, r8, r4, r1)
            r8.mBusinessNavBarHelper = r0
            com.instagram.business.ui.BusinessNavBar r4 = r8.mBusinessNavBar
            boolean r0 = r8.A06
            if (r0 != 0) goto L43
            boolean r0 = r8.A05
            if (r0 != 0) goto L43
            X.GaX r1 = r8.A01
            r0 = 1
            if (r1 != 0) goto L44
        L43:
            r0 = 0
        L44:
            r4.A02(r0)
            X.FQe r4 = r8.A03
            com.instagram.business.ui.BusinessNavBar r7 = r8.mBusinessNavBar
            androidx.fragment.app.Fragment r1 = r4.A00
            r0 = 2131965052(0x7f13347c, float:1.9566903E38)
            java.lang.String r5 = r1.getString(r0)
            X.0ll r4 = r4.A05
            r0 = 2131962046(0x7f1328be, float:1.9560806E38)
            java.lang.String r1 = X.AbstractC31174DnI.A0w(r1, r5, r0)
            java.lang.String r0 = "https://help.instagram.com/402748553849926"
            r7.setFooterTerms(r4, r5, r1, r0)
            android.view.View r1 = r7.A00
            r0 = 8
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r7.A02
            r0.setVisibility(r6)
            com.instagram.common.ui.text.TitleTextView r0 = r7.A03
            r0.setPadding(r6, r6, r6, r6)
            r7.A00()
            X.FQe r1 = r8.A03
            X.EVM r0 = r8.mBusinessNavBarHelper
            r1.A04 = r0
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r8.A02
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L91
            com.instagram.business.ui.BusinessNavBar r1 = r8.mBusinessNavBar
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r8.A02
            java.lang.String r0 = r0.A06
            r1.setPrimaryButtonText(r0)
        L91:
            X.EVM r0 = r8.mBusinessNavBarHelper
            r8.registerLifecycleListener(r0)
            r0 = 604869572(0x240d93c4, float:3.0699664E-17)
            X.C0f9.A09(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.FBPageListWithPreviewFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1257104011);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        C0f9.A09(285532217, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        HashMap A1G;
        IgdsStepperHeader igdsStepperHeader;
        int A00;
        int A002;
        super.onViewCreated(view, bundle);
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.mRecyclerView = A0F;
        this.mBusinessNavBar.A01(A0F);
        if (this.A05) {
            this.mBusinessNavBar.setVisibility(8);
        }
        InterfaceC37222GaX interfaceC37222GaX = this.A01;
        if (interfaceC37222GaX != null) {
            EnumC151596s5 enumC151596s5 = ((BusinessConversionActivity) interfaceC37222GaX).A02;
            String str = "_flowType";
            if (enumC151596s5 != null) {
                if (enumC151596s5 == EnumC151596s5.A0C || enumC151596s5 == EnumC151596s5.A0B) {
                    IgdsStepperHeader igdsStepperHeader2 = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
                    this.mStepperHeader = igdsStepperHeader2;
                    igdsStepperHeader2.setVisibility(0);
                    PageSelectionOverrideData pageSelectionOverrideData = this.A02;
                    if (pageSelectionOverrideData != null) {
                        igdsStepperHeader = this.mStepperHeader;
                        A00 = pageSelectionOverrideData.A01;
                        A002 = pageSelectionOverrideData.A00;
                    } else {
                        InterfaceC37222GaX interfaceC37222GaX2 = this.A01;
                        if (interfaceC37222GaX2 != null) {
                            igdsStepperHeader = this.mStepperHeader;
                            C35034Fc7 c35034Fc7 = ((BusinessConversionActivity) interfaceC37222GaX2).A01;
                            if (c35034Fc7 != null) {
                                A00 = C35034Fc7.A00(c35034Fc7, c35034Fc7.A00.A00 + 1) - 1;
                                C35034Fc7 c35034Fc72 = ((BusinessConversionActivity) this.A01).A01;
                                if (c35034Fc72 != null) {
                                    A002 = C35034Fc7.A00(c35034Fc72, c35034Fc72.A00.A01.size());
                                }
                            }
                            str = "conversionLogic";
                        }
                    }
                    igdsStepperHeader.A02(A00, A002);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        this.mLoadingSpinner = (SpinnerImageView) view.requireViewById(R.id.loading_indicator);
        C34693FQe c34693FQe = this.A03;
        InterfaceC37222GaX interfaceC37222GaX3 = c34693FQe.A02;
        if (interfaceC37222GaX3 != null && (businessFlowAnalyticsLogger = c34693FQe.A01) != null) {
            if (c34693FQe.A07) {
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) interfaceC37222GaX3;
                A1G = AbstractC166987dD.A1G();
                InterfaceC09390do interfaceC09390do = businessConversionActivity.A09;
                interfaceC09390do.getValue();
                UserSession A0r = AbstractC166987dD.A0r(businessConversionActivity.A0H);
                CallerContext callerContext = C35788FrQ.A0B;
                C14360o3.A0B(A0r, 0);
                A1G.put("is_fb_linked_when_enter_flow", String.valueOf(AbstractC49092Nc.A00(A0r).A00(C35788FrQ.A0B, "ig_professional_conversion_flow")));
                interfaceC09390do.getValue();
                A1G.put("is_fb_page_admin_when_enter_flow", "UNKNOWN");
            } else {
                A1G = AbstractC166987dD.A1G();
            }
            businessFlowAnalyticsLogger.Clo(new Y7A("page_selection", c34693FQe.A06, null, null, null, A1G, null, null));
        }
    }
}
