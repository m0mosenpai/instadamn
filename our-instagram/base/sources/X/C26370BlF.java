package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.BlF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26370BlF extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31137Dmc A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC31137Dmc interfaceC31137Dmc;
        CUJ As5;
        C14360o3.A0B(c76223bS, 0);
        C37644Ghd c37644Ghd = this.A01;
        if (!c37644Ghd.A0b || (interfaceC31137Dmc = this.A02) == null || (As5 = interfaceC31137Dmc.As5()) == null) {
            return null;
        }
        C51762Yz A00 = C29902DGq.A00(c76223bS, As5, 26);
        AbstractC77313dH.A00(c76223bS, new D8J(45, A00, As5), new Object[]{As5});
        String A0G = AbstractC77623dm.A0G(c76223bS, A00.A03, 2131955406);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = C9CU.A00(null, C05F.A0j, 0, AbstractC77623dm.A04(c76223bS));
        Integer num = C05F.A01;
        C51722Yv A003 = C9CV.A00(A002, num, "android.widget.Button", 0);
        C2XE ArD = c76223bS.ArD();
        Context A0E = AbstractC25225BEi.A0E(ArD);
        int A02 = AbstractC25232BEp.A02(A0E, c76223bS);
        long A09 = AbstractC77623dm.A09(c76223bS);
        Integer num2 = C05F.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        C14360o3.A08(typeface);
        Typeface A03 = AbstractC14710oj.A03(A0E, typeface, num2);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(ArD, null, A0G, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A02, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(A03, c76223bS, A0a, A0D);
        A0a.A0X(num2);
        AbstractC25234BEr.A1B(A0a, num);
        A0a.A0M(1);
        A0a.A0c(false);
        AbstractC25232BEp.A1N(A0a, false);
        C51682Yq A0X = AbstractC25227BEk.A0X(A003, A0a);
        C2XI A0j = AbstractC25228BEl.A0j(c76223bS, 0.0f);
        AbstractC77313dH.A00(c76223bS, DH2.A01(A0j, AbstractC77063cs.A00(c76223bS, DF3.A00), this, 35), new Object[]{c37644Ghd});
        C51722Yv A0X2 = AbstractC25231BEo.A0X(A0j, null, C05F.A03);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        AbstractC25234BEr.A12(A0X, A12.A00, A12, C9CV.A00(AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(AbstractC25233BEq.A0Y(C9CV.A00(C9CU.A00(AbstractC25233BEq.A0R(null, AbstractC25227BEk.A0Y(0, AbstractC77623dm.A0D(A12, R.dimen.afi_margin_top)), 0, AbstractC77623dm.A0D(A12, R.dimen.accent_edge_thickness)), C05F.A0A, 0, AbstractC77623dm.A07(A12)), num2, AbstractC77623dm.A0E(A12, R.drawable.clips_viewer_pill_background_attribute_pill_system), 4), A12, num, R.dimen.asset_picker_section_title_horizontal_padding, 0), num2, DRR.A00(As5, 31), null), num, DRR.A00(As5, 32), null), C05F.A0D, "clips_delayed_skip_ads_iteration_1_timer", 4));
        return AbstractC76963ci.A0I(A12, c76223bS, A0X2);
    }

    public C26370BlF(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31137Dmc interfaceC31137Dmc) {
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31137Dmc;
    }
}
