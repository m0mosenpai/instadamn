package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BU2 extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final SPM A02;
    public final InterfaceC31137Dmc A03;
    public final C51722Yv A04;
    public final ClipsViewerConfig A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        Boolean bool;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A00;
        boolean z = false;
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.CdW()) {
            z = true;
        }
        if (z) {
            UserSession userSession = this.A06;
            boolean A05 = AbstractC25381BKy.A05(c120985dq, userSession);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                long A07 = AbstractC77623dm.A07(c76223bS);
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A00 = C9CU.A00(null, C05F.A00, 0, A07);
                Integer num = C05F.A01;
                C51722Yv A0a = AbstractC25233BEq.A0a(C9CU.A00(A00, num, 0, A07), C05F.A0C, 0.0f);
                Integer num2 = C05F.A0D;
                C51722Yv A002 = C9CV.A00(A0a, num2, "clips_sponsored_label_glyph_tag", 4);
                Drawable A0N = AbstractC25228BEl.A0N(c76223bS, R.drawable.instagram_ads_pano_filled_16);
                AbstractC25233BEq.A10(A0N, c76223bS, R.color.audio_bar_action_color_enabled);
                Drawable mutate = A0N.mutate();
                if (A05) {
                    AbstractC25233BEq.A10(mutate, c76223bS, R.color.fds_white_alpha80);
                }
                C14360o3.A07(mutate);
                BNU bnu = new BNU(mutate, null, A002, false);
                C51682Yq A02 = BPH.A02(c76223bS, AbstractC25233BEq.A0N(EnumC77673dr.A0S, null), c120985dq.A06().A0i, A05);
                C37644Ghd c37644Ghd = this.A01;
                C75113Zb c75113Zb = c37644Ghd.A0E;
                if (c75113Zb != null) {
                    i = c75113Zb.A03;
                } else {
                    i = -1;
                    if (c38321qM.A5M()) {
                        i = 0;
                    }
                }
                User A14 = AbstractC25226BEj.A14(c38321qM);
                if (A14 != null) {
                    bool = Boolean.valueOf(A14.A2N());
                } else {
                    bool = null;
                }
                boolean A04 = C76493bt.A04(AbstractC77363dM.A00(c76223bS), userSession, c38321qM, bool, i);
                boolean A003 = BT8.A00(userSession);
                C2XI A0j = AbstractC25228BEl.A0j(c76223bS, 0.0f);
                C77123cy A004 = AbstractC77063cs.A00(c76223bS, C29867DFh.A00);
                InterfaceC31137Dmc interfaceC31137Dmc = this.A03;
                BU1 bu1 = new BU1(c120985dq, c37644Ghd, userSession, interfaceC31137Dmc);
                AbstractC77313dH.A00(c76223bS, new C29708D8b(7, A0j, A004, this, A003), new Object[]{c37644Ghd});
                C51722Yv c51722Yv = this.A04;
                C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
                C51722Yv A01 = BPH.A01(A12, null, false, false, false, A05);
                C9CV A0o = AbstractC25225BEi.A0o(num, Boolean.valueOf(AbstractC167007dF.A1W(interfaceC31137Dmc)), 4);
                if (A01 == c75933ay) {
                    A01 = null;
                }
                AbstractC25230BEn.A1G(bu1, AbstractC25233BEq.A0I(bnu, A02, A12.A00), A12, AbstractC25231BEo.A0Y(AbstractC25396BLn.A02(EnumC71343Hv.A0c, AbstractC25231BEo.A0X(A0j, C9CV.A00(AbstractC25225BEi.A0h(A01, A0o), num2, "clips_sponsored_label_tag", 4), C05F.A02), c120985dq, userSession, this.A07, A04), DRY.A00(this, A12, 0)));
                return AbstractC76963ci.A0I(A12, c76223bS, c51722Yv);
            }
        }
        return null;
    }

    public BU2(C51722Yv c51722Yv, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, SPM spm, InterfaceC31137Dmc interfaceC31137Dmc) {
        AbstractC167027dH.A13(c120985dq, userSession, c37644Ghd);
        AbstractC167007dF.A1H(interfaceC60442pS, 5, clipsViewerConfig);
        this.A00 = c120985dq;
        this.A06 = userSession;
        this.A01 = c37644Ghd;
        this.A04 = c51722Yv;
        this.A07 = interfaceC60442pS;
        this.A03 = interfaceC31137Dmc;
        this.A05 = clipsViewerConfig;
        this.A02 = spm;
    }
}
