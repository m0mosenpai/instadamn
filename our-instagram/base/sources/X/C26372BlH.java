package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;

/* renamed from: X.BlH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26372BlH extends AbstractC51572Yf {
    public final UserSession A00;
    public final C37644Ghd A01;
    public final InterfaceC31137Dmc A02;

    public C26372BlH(C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(c76223bS, 0);
        UserSession userSession = this.A00;
        if ((!C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250583743L) || !this.A01.A0a) && (!C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250780353L) || !this.A01.A0e)) {
            return null;
        }
        String A0F = AbstractC77623dm.A0F(c76223bS, 2131955407);
        Integer num = C05F.A01;
        C2XE ArD = c76223bS.ArD();
        Context A0E = AbstractC25225BEi.A0E(ArD);
        int A02 = AbstractC25232BEp.A02(A0E, c76223bS);
        long A09 = AbstractC77623dm.A09(c76223bS);
        Integer num2 = C05F.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        C14360o3.A08(typeface);
        Typeface A03 = AbstractC14710oj.A03(A0E, typeface, num2);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(ArD, null, A0F, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A02, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(A03, c76223bS, A0a, A0D);
        AbstractC25230BEn.A1M(A0a, num2, num);
        AbstractC25230BEn.A1J(A0a, 1.0f, false);
        A0a.A0M(1);
        A0a.A0c(false);
        AbstractC25232BEp.A1N(A0a, false);
        C51682Yq A0A = A0a.A0A();
        CUJ As5 = this.A02.As5();
        C51762Yz A00 = C29902DGq.A00(c76223bS, As5, 29);
        AbstractC77313dH.A00(c76223bS, DH2.A01(A00, As5, AbstractC25225BEi.A1F(), 36), new Object[]{As5});
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(C9CU.A00(null, C05F.A04, 0, AbstractC77623dm.A04(c76223bS)), num2, DRR.A00(As5, 38), null), num, DRR.A00(As5, 39), null);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C26280Bjn A032 = C26658Bpt.A03(A12.ArD());
        C26658Bpt c26658Bpt = A032.A01;
        C2XH c2xh = ((AbstractC77733dx) A032).A02;
        c26658Bpt.A00 = c2xh.A01(R.attr.igds_color_progress_bar_on_media);
        A032.A02.set(0);
        ((AbstractC77733dx) A032).A00.A0a().A0F(c2xh.A00(1.0f));
        A032.A04();
        A12.A00(A032.A0A());
        long A0C = AbstractC77623dm.A0C(A12);
        C51722Yv A0D2 = AbstractC25234BEr.A0D(null, AbstractC25227BEk.A0c(A0C), 0, AbstractC77623dm.A0D(A12, R.dimen.ai_agent_share_profile_sticker_padding));
        Integer num3 = C05F.A0D;
        C51722Yv A0h = AbstractC25225BEi.A0h(A0D2, AbstractC25225BEi.A0o(num3, "clips_delayed_skip_ads_snack_bar_styled_timer", 4));
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        String valueOf = String.valueOf(AbstractC166987dD.A0H(A00.A03));
        if (!C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250583743L) && C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250780353L)) {
            interfaceC09390do = C3Oc.A0H;
        } else {
            interfaceC09390do = C3Oc.A0D;
        }
        RingSpec ringSpec = (RingSpec) interfaceC09390do.getValue();
        long A0N = AbstractC25230BEn.A0N();
        C51722Yv A002 = C9CV.A00(C9CU.A00(C9CU.A00(null, num2, 0, A0N), num, 0, A0N), num3, "clips_snack_bar_delayed_skip_ads_timer_progress_ring", 4);
        EnumC77923eK enumC77923eK = EnumC77923eK.A02;
        Float valueOf2 = Float.valueOf(5.0f);
        C77943eM c77943eM = new C77943eM(A002, ringSpec, enumC77923eK, valueOf2, valueOf2);
        C51722Yv A15 = AbstractC25232BEp.A15(null, C05F.A0Y, EnumC77933eL.ABSOLUTE);
        C2XE ArD2 = A13.ArD();
        Context A0E2 = AbstractC25225BEi.A0E(ArD2);
        int A04 = AbstractC25228BEl.A04(A0E2, A13);
        long A092 = AbstractC77623dm.A09(A13);
        Typeface A033 = AbstractC14710oj.A03(A0E2, typeface, num2);
        C77723dw A0a2 = AbstractC25231BEo.A0a(ArD2, null, valueOf, 0);
        AbstractC25233BEq.A1B(A13, A0a2, A04, A092);
        A0a2.A0S(0);
        AbstractC25234BEr.A0o(A033, A13, A0a2, A0D);
        A0a2.A0X(num2);
        AbstractC25234BEr.A1C(A0a2, num, 1.0f);
        C51682Yq A0g = AbstractC25230BEn.A0g(null, A15, A0a2);
        AbstractC25226BEj.A1R(AbstractC25233BEq.A0I(A0g, c77943eM, ArD2), A13, C9CU.A00(null, C05F.A0E, 0, AbstractC25229BEm.A0J()));
        AbstractC25231BEo.A1A(A0A, A13, A12, A0h);
        return AbstractC76963ci.A03(A12, c76223bS, A0e);
    }
}
