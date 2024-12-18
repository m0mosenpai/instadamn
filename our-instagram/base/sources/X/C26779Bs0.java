package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Bs0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26779Bs0 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiAgentsHomeFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A08 = AbstractC111324zv.A00(4576);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r21 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C26021BfA r17, X.C26003Ber r18, X.C26779Bs0 r19, int r20, boolean r21) {
        /*
            r12 = 0
            r0 = r17
            r14 = r19
            if (r21 != 0) goto L38
            X.0do r1 = r14.A00
            X.CfW r3 = X.AbstractC25226BEj.A0p(r1)
            java.lang.String r6 = r0.A07
            X.CAe r2 = r0.A00
            java.lang.String r7 = r2.A01()
            java.lang.String r8 = r0.A06
            r1 = r18
            if (r18 == 0) goto L1f
            java.lang.String r10 = r1.A03
            if (r10 != 0) goto L21
        L1f:
            java.lang.String r10 = ""
        L21:
            if (r18 == 0) goto Lb9
            int r1 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L29:
            com.instagram.api.schemas.IGAIAgentType r4 = r2.A00()
            java.lang.String r11 = r2.A02()
            java.lang.String r9 = "home"
            r13 = r20
            r3.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L38:
            java.lang.String r5 = r0.A03
            if (r5 == 0) goto L40
            r19 = r5
            if (r21 != 0) goto L42
        L40:
            r19 = r12
        L42:
            X.CAe r4 = r0.A00
            boolean r1 = r0.A0B
            if (r1 == 0) goto L67
            androidx.fragment.app.FragmentActivity r2 = r14.getActivity()
            if (r2 == 0) goto L66
            X.0do r0 = r14.A04
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r1 = X.AbstractC25231BEo.A0f(r0)
            java.lang.String r4 = r4.A03()
            X.0do r0 = r14.A02
            java.lang.String r5 = X.AbstractC25225BEi.A15(r0)
            r8 = 1
            r3 = r14
            r6 = r12
            r7 = r19
            r1.A08(r2, r3, r4, r5, r6, r7, r8)
        L66:
            return
        L67:
            boolean r1 = r4 instanceof X.C26682BqP
            androidx.fragment.app.FragmentActivity r13 = r14.getActivity()
            if (r1 == 0) goto L91
            if (r13 == 0) goto L66
            X.0do r1 = r14.A04
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r12 = X.AbstractC25231BEo.A0f(r1)
            X.0do r1 = r14.A02
            java.lang.String r16 = X.AbstractC25225BEi.A15(r1)
            X.BqP r4 = (X.C26682BqP) r4
            java.lang.String r2 = r4.A00
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r0.A04
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.AbstractC25225BEi.A0t(r0)
            r17 = r2
            r18 = r1
            r12.A04(r13, r14, r15, r16, r17, r18)
            return
        L91:
            if (r13 == 0) goto L66
            X.0do r1 = r14.A04
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r12 = X.AbstractC25231BEo.A0f(r1)
            java.lang.String r3 = r0.A06
            java.lang.String r1 = r0.A04
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.AbstractC25225BEi.A0t(r1)
            java.lang.String r2 = r0.A09
            java.lang.String r18 = r4.A03()
            X.0do r1 = r14.A02
            java.lang.String r20 = X.AbstractC25225BEi.A15(r1)
            java.lang.String r0 = r0.A0A
            r17 = r2
            r21 = r0
            r16 = r3
            r12.A06(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        Lb9:
            r5 = r12
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26779Bs0.A00(X.BfA, X.Ber, X.Bs0, int, boolean):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28370CfW A0p = AbstractC25226BEj.A0p(this.A00);
        String A15 = AbstractC25225BEi.A15(this.A02);
        if (A15 == null) {
            A15 = "unknown";
        }
        C25531Mh A00 = C28370CfW.A00(A0p);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("ai_home_screen_shown");
            A00.A0u(A0p.A02);
            AbstractC25233BEq.A18(A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A15);
        }
        C29166CtX c29166CtX = (C29166CtX) A0p.A03.getValue();
        long flowStartForMarker = ((UserFlowLoggerImpl) c29166CtX.A02.getValue()).flowStartForMarker(895696558, PublicKeyCredentialControllerUtility.JSON_KEY_USER, true);
        c29166CtX.A00 = flowStartForMarker;
        DH6 dh6 = new DH6(c29166CtX, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A15, 15);
        if (0 != flowStartForMarker) {
            dh6.invoke();
        }
    }

    public static final void A01(C26779Bs0 c26779Bs0) {
        String str;
        C28370CfW A0p = AbstractC25226BEj.A0p(c26779Bs0.A00);
        String A00 = AbstractC111324zv.A00(1905);
        A0p.A03(A00);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("AiStudioArgumentKeys.creation_entry_point", A00);
        A0b.putParcelable("utm_metadata", (UtmMetadata) c26779Bs0.A06.getValue());
        InterfaceC09390do interfaceC09390do = c26779Bs0.A04;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        boolean A06 = C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36330101860090558L);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        FragmentActivity activity = c26779Bs0.getActivity();
        if (A06) {
            str = "AI_CREATION_CUSTOM_AI";
        } else {
            str = "AI_CREATION_TEMPLATES";
        }
        AbstractC25230BEn.A1A(c26779Bs0, C6XJ.A03(activity, A0b, A0o, ModalActivity.class, str));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26779Bs0() {
        DGX A00 = DGX.A00(this, 33);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, DGX.A00(DGX.A00(this, 30), 31));
        this.A07 = AbstractC25225BEi.A0a(DGX.A00(A002, 32), A00, new C29897DGl(12, null, A002), AbstractC25225BEi.A1D(C25853Bc8.class));
        this.A01 = C1XM.A00(DGX.A00(this, 26));
        this.A02 = C1XM.A00(DGX.A00(this, 27));
        this.A03 = C1XM.A00(DGX.A00(this, 28));
        this.A06 = C1XM.A00(new D5m(this));
        this.A05 = C1XM.A00(DA4.A00);
        this.A00 = C1XM.A00(DGX.A00(this, 25));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952639);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A04), 36325081042989752L)) {
            C3LO c3lo = new C3LO();
            c3lo.A0K = AbstractC166997dE.A0N(this).getString(2131952631);
            ViewOnClickListenerC28667ClF.A02(c3lo, interfaceC56362iU, this, 13);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1305560069);
        super.onCreate(bundle);
        AbstractC25226BEj.A0r(this.A01).A06.markerStart(895683758);
        ((C25853Bc8) this.A07.getValue()).A00(AbstractC25225BEi.A15(this.A03));
        C0f9.A09(-1867536590, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2139142788);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30480DbP.A00(this, 8), 339966549);
        C0f9.A09(1260259408, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2112050079);
        super.onDestroy();
        C29166CtX c29166CtX = (C29166CtX) AbstractC25226BEj.A0p(this.A00).A03.getValue();
        C50157MDk c50157MDk = new C50157MDk(c29166CtX, 14);
        if (0 != c29166CtX.A00) {
            c50157MDk.invoke();
        }
        AbstractC25226BEj.A0r(this.A01).A02(C05F.A0C);
        C0f9.A09(-1425090497, A02);
    }
}
