package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes9.dex */
public final class N6K extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, JGA, InterfaceC64632wM {
    public static final String __redex_internal_original_name = "BrandedContentApproveMediaFragment";
    public RectF A00;
    public ViewGroup A01;
    public SpinnerImageView A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC64642wN
    public final void DSW(C5GM c5gm) {
    }

    @Override // X.InterfaceC64642wN
    public final void DSX(C5GM c5gm) {
    }

    @Override // X.JGA
    public final void Ddy(C42800Iwc c42800Iwc, Reel reel, List list) {
        HashSet A1H = AbstractC166987dD.A1H();
        String str = this.A06;
        if (str == null) {
            C14360o3.A0F("mediaId");
            throw C00O.createAndThrow();
        }
        A1H.add(str);
        this.A00 = AbstractC13880nE.A0G(c42800Iwc.A06);
        C3M4 A06 = C1OU.A06(requireActivity(), AbstractC166987dD.A0r(this.A07));
        RectF rectF = this.A00;
        if (rectF != null) {
            A06.A0V(null, rectF, this, reel, C3G2.A0L, new C36678GEy(0, this, reel, A1H), null, null, -1, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969330);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(N6K n6k) {
        SpinnerImageView spinnerImageView = n6k.A02;
        if (spinnerImageView == null) {
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        AbstractC31171DnF.A1M(spinnerImageView);
        MSY.A1M(n6k, AbstractC25235BEs.A0S(n6k), 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        X.C14360o3.A0F("creatorId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        X.LL0.A04(r10, r4, r3, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r0 == null) goto L16;
     */
    @Override // X.InterfaceC64652wO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSV(X.C69393Vmd r11, X.C5GM r12) {
        /*
            r10 = this;
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r10.A02
            if (r0 != 0) goto Le
            java.lang.String r9 = "spinner"
        L6:
            X.C14360o3.A0F(r9)
        L9:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            X.AbstractC31171DnF.A1M(r0)
            java.lang.String r1 = r11.A01
            java.lang.String r0 = "branded_content_pending_tag_accept"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            java.lang.String r8 = "creatorId"
            java.lang.String r9 = "entryPoint"
            java.lang.String r7 = "mediaId"
            java.lang.String r5 = "entrypoint"
            java.lang.String r6 = "media_id"
            java.lang.String r2 = "action_type"
            if (r0 == 0) goto L56
            X.2k6 r1 = X.AbstractC25235BEs.A0S(r10)
            r0 = 13
            X.MSY.A1M(r10, r1, r0)
            X.0do r0 = r10.A07
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r0)
            java.lang.Integer r3 = X.C05F.A03
            java.lang.String r0 = "approve_request"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r2, r0)
            java.lang.String r0 = r10.A06
            if (r0 == 0) goto L8c
            X.0e4 r1 = X.AbstractC166987dD.A1L(r6, r0)
            java.lang.String r0 = r10.A05
            if (r0 == 0) goto L6
            java.util.LinkedHashMap r1 = X.AbstractC25232BEp.A1F(r5, r0, r2, r1)
            java.lang.String r0 = r10.A03
            if (r0 != 0) goto L91
        L52:
            X.C14360o3.A0F(r8)
            goto L9
        L56:
            java.lang.String r1 = r11.A01
            java.lang.String r0 = "branded_content_pending_tag_reject"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L94
            X.2k6 r1 = X.AbstractC25235BEs.A0S(r10)
            r0 = 14
            X.MSY.A1M(r10, r1, r0)
            X.0do r0 = r10.A07
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r0)
            java.lang.Integer r3 = X.C05F.A03
            java.lang.String r0 = "decline_request"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r2, r0)
            java.lang.String r0 = r10.A06
            if (r0 == 0) goto L8c
            X.0e4 r1 = X.AbstractC166987dD.A1L(r6, r0)
            java.lang.String r0 = r10.A05
            if (r0 == 0) goto L6
            java.util.LinkedHashMap r1 = X.AbstractC25232BEp.A1F(r5, r0, r2, r1)
            java.lang.String r0 = r10.A03
            if (r0 != 0) goto L91
            goto L52
        L8c:
            X.C14360o3.A0F(r7)
            goto L9
        L91:
            X.LL0.A04(r10, r4, r3, r0, r1)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6K.DSV(X.Vmd, X.5GM):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1663580439);
        super.onCreate(bundle);
        this.A06 = AbstractC153636vY.A01(requireArguments(), "ARGUMENT_MEDIA_ID");
        this.A04 = AbstractC153636vY.A01(requireArguments(), AbstractC31581Du9.A01());
        this.A03 = AbstractC153636vY.A01(requireArguments(), "ARGUMENT_BRANDED_CONTENT_USER_ID");
        this.A05 = AbstractC153636vY.A01(requireArguments(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        C0f9.A09(584884575, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(767701589);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.violation_alert_fragment, false);
        this.A01 = (ViewGroup) A07.findViewById(R.id.branded_content_violation_alert_list);
        this.A02 = (SpinnerImageView) A07.findViewById(R.id.preview_image_spinner);
        A00(this);
        C0f9.A09(-1095375345, A02);
        return A07;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        ViewTreeObserver viewTreeObserver;
        int A02 = C0f9.A02(-291522482);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a() && (view = this.mView) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC55502Okv.A00(viewTreeObserver, A05, this, 0);
        }
        C0f9.A09(-24996400, A02);
    }
}
