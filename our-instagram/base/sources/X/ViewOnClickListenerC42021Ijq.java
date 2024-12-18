package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.Ijq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42021Ijq implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ IntentAwareAdPivotState A05;
    public final /* synthetic */ C75113Zb A06;
    public final /* synthetic */ C64052vQ A07;
    public final /* synthetic */ HBC A08;
    public final /* synthetic */ C64042vP A09;
    public final /* synthetic */ C60662pp A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ List A0C;

    public ViewOnClickListenerC42021Ijq(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, C75113Zb c75113Zb, C64052vQ c64052vQ, HBC hbc, C64042vP c64042vP, C60662pp c60662pp, Integer num, List list, int i) {
        this.A05 = intentAwareAdPivotState;
        this.A03 = userSession;
        this.A04 = c38321qM;
        this.A08 = hbc;
        this.A0A = c60662pp;
        this.A06 = c75113Zb;
        this.A01 = view;
        this.A02 = interfaceC11380iw;
        this.A0C = list;
        this.A07 = c64052vQ;
        this.A09 = c64042vP;
        this.A00 = i;
        this.A0B = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum2;
        InterfaceC88193wT BFe;
        ClipsViewerSource clipsViewerSource;
        InterfaceC88193wT BFe2;
        int A05 = C0f9.A05(-804277525);
        IntentAwareAdPivotState intentAwareAdPivotState = this.A05;
        UserSession userSession = this.A03;
        C38321qM c38321qM = this.A04;
        intentAwareAdPivotState.A06 = AbstractC41071vF.A07(userSession, c38321qM);
        HBC hbc = this.A08;
        int i = hbc.A00;
        C71113Gx c71113Gx = C5MB.A00;
        if (((c71113Gx.A01(Integer.valueOf(i)) && C18U.A06(C06090Tz.A06, userSession, 36312874759751177L)) || (i == 3 && C18U.A06(C06090Tz.A06, userSession, 36312874759816714L))) && c38321qM.Cff()) {
            InterfaceC39541sb A0F = AbstractC37300Gc1.A0F(c38321qM);
            if (A0F != null && (BFe2 = A0F.BFe()) != null) {
                iGAdsFeedVideoWBViewerTypeEnum = BFe2.BFM();
            } else {
                iGAdsFeedVideoWBViewerTypeEnum = null;
            }
            if (iGAdsFeedVideoWBViewerTypeEnum == IGAdsFeedVideoWBViewerTypeEnum.A0A) {
                C60662pp c60662pp = this.A0A;
                C75113Zb c75113Zb = this.A06;
                View view2 = this.A01;
                InterfaceC11380iw interfaceC11380iw = this.A02;
                C14360o3.A0C(interfaceC11380iw, AbstractC111324zv.A00(7));
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) interfaceC11380iw;
                int i2 = hbc.A00;
                String id = hbc.getId();
                AbstractC167007dF.A1G(interfaceC60442pS, 3, id);
                C41116IIh A01 = c60662pp.A09().A01();
                Integer valueOf = Integer.valueOf(i2);
                if (c71113Gx.A01(valueOf)) {
                    clipsViewerSource = ClipsViewerSource.A1Q;
                } else {
                    clipsViewerSource = ClipsViewerSource.A1R;
                }
                C39B A00 = IAQ.A00(clipsViewerSource);
                if (A00 != null) {
                    C86833tv c86833tv = C86833tv.A00;
                    UserSession userSession2 = A01.A00;
                    C60662pp c60662pp2 = A01.A02;
                    IAR A0B = c86833tv.A0B(c60662pp2.requireContext(), userSession2, c38321qM, A00);
                    C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.watchandbrowse.model.ClipsWatchAndBrowseConfig");
                    C72309Xb6 c72309Xb6 = (C72309Xb6) A0B;
                    Integer num = C05F.A00;
                    C71313Hs.A00(userSession2).A0A(view2, new C79623hD(new C86933u7(c60662pp2.requireContext(), c75113Zb, userSession2, c38321qM), userSession2, c38321qM, interfaceC60442pS, "in_app_browser_v2", C16910sj.A00));
                    C71313Hs.A00(userSession2).A07(view2, EnumC71343Hv.A0H, new String[0], 1);
                    FragmentActivity requireActivity = c60662pp2.requireActivity();
                    C116875Qr c116875Qr = new C116875Qr(clipsViewerSource, userSession2);
                    c116875Qr.A1D = c38321qM.getId();
                    c116875Qr.A1h = false;
                    c116875Qr.A1d = false;
                    Integer num2 = c72309Xb6.A0B;
                    C14360o3.A0B(num2, 0);
                    c116875Qr.A0T = num2;
                    c116875Qr.A0Z = Integer.valueOf(c72309Xb6.A0A);
                    c116875Qr.A01(Xjh.A00(c72309Xb6));
                    C14360o3.A0B(num, 0);
                    c116875Qr.A0Q = num;
                    c116875Qr.A1E = interfaceC60442pS.getModuleName();
                    c116875Qr.A18 = AbstractC41071vF.A07(userSession2, c38321qM);
                    c116875Qr.A1B = AbstractC41071vF.A0F(userSession2, c38321qM);
                    C37528Gfk A002 = IntentAwareAdsInfoIntf.A00.A00();
                    A002.A02 = valueOf;
                    A002.A06 = id;
                    c116875Qr.A0D = A002.A00();
                    AbstractC41751IeQ.A01(requireActivity, c116875Qr, userSession2, false);
                }
            } else {
                InterfaceC39541sb A0F2 = AbstractC37300Gc1.A0F(c38321qM);
                if (A0F2 != null && (BFe = A0F2.BFe()) != null) {
                    iGAdsFeedVideoWBViewerTypeEnum2 = BFe.BFM();
                } else {
                    iGAdsFeedVideoWBViewerTypeEnum2 = null;
                }
                boolean A1X = AbstractC167007dF.A1X(iGAdsFeedVideoWBViewerTypeEnum2, IGAdsFeedVideoWBViewerTypeEnum.A06);
                C60662pp c60662pp3 = this.A0A;
                if (A1X) {
                    c60662pp3.A0N(c38321qM, hbc.getId(), hbc.A00);
                } else {
                    c60662pp3.A0J(c38321qM, intentAwareAdPivotState, hbc, this.A0C);
                }
            }
        } else {
            this.A0A.A0I(c38321qM, intentAwareAdPivotState, hbc, this.A0C);
        }
        C28492Chk.A04(userSession, c38321qM, this.A07, hbc);
        this.A09.A0F(intentAwareAdPivotState, hbc, this.A0B, this.A00);
        C0f9.A0C(924183251, A05);
    }
}
