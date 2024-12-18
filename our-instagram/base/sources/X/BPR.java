package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BPR extends AbstractC51572Yf {
    public final InterfaceC31162Dn6 A00;
    public final BPQ A01;
    public final C51722Yv A02;
    public final UserSession A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        BNU bnu;
        Integer num;
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A02;
        C9CV A0o = AbstractC25225BEi.A0o(C05F.A1F, DRV.A00(this, 44), 4);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A00 = C9CV.A00(AbstractC25225BEi.A0h(c51722Yv, A0o), C05F.A04, DRY.A00(this, c76223bS, 3), 4);
        DRV A002 = DRV.A00(this, 45);
        Integer num2 = C05F.A00;
        C51722Yv A0e = AbstractC25230BEn.A0e(A00, num2, A002, null);
        BPQ bpq = this.A01;
        String str = bpq.A07;
        if (str != null) {
            A0e = C9CV.A00(A0e, C05F.A0N, str, 0);
        }
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        long A07 = AbstractC77623dm.A07(A12);
        int i = bpq.A01;
        if (i != 0) {
            C51722Yv A0a = AbstractC25233BEq.A0a(AbstractC25234BEr.A0L(null, num2, 0, A07), C05F.A0C, 0.0f);
            Drawable A0N = AbstractC25228BEl.A0N(A12, i);
            AbstractC25233BEq.A10(A0N, A12, R.color.audio_bar_action_color_enabled);
            bnu = new BNU(A0N, null, A0a, false);
        } else {
            bnu = null;
        }
        C2XE ArD = A12.ArD();
        Resources A0M = AbstractC166997dE.A0M(ArD.A0C);
        C5QE c5qe = bpq.A03;
        C14360o3.A0B(c5qe, 1);
        C51682Yq A02 = BPH.A02(A12, null, c5qe.A01(A0M).toString(), false);
        if (bpq.A09) {
            num = Integer.valueOf((int) (AbstractC167007dF.A0K(r3).widthPixels * 0.4d));
        } else {
            num = null;
        }
        return AbstractC25227BEk.A0W(AbstractC76963ci.A0H(AbstractC25233BEq.A0I(bnu, A02, ArD), A12, BPH.A01(A12, num, false, false, false, false)), A12, c76223bS, A0e);
    }

    public BPR(C51722Yv c51722Yv, UserSession userSession, InterfaceC31162Dn6 interfaceC31162Dn6, BPQ bpq) {
        AbstractC25234BEr.A1P(bpq, interfaceC31162Dn6, userSession);
        this.A01 = bpq;
        this.A00 = interfaceC31162Dn6;
        this.A02 = c51722Yv;
        this.A03 = userSession;
    }
}
