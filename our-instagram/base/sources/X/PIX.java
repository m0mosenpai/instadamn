package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class PIX implements InterfaceC37203GaE {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ C54810OKj A02;
    public final /* synthetic */ N80 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC37203GaE
    public final void DFf() {
    }

    @Override // X.InterfaceC37203GaE
    public final void onCancel() {
    }

    public PIX(UserSession userSession, User user, C54810OKj c54810OKj, N80 n80, String str, String str2) {
        this.A03 = n80;
        this.A00 = userSession;
        this.A01 = user;
        this.A02 = c54810OKj;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.InterfaceC37203GaE
    public final void D6t() {
        C54810OKj c54810OKj = this.A02;
        String id = this.A01.getId();
        String str = this.A04;
        String str2 = this.A00.userId;
        String str3 = this.A05;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c54810OKj.A01, "ig_live_remove_follower");
        if (str2 == null) {
            str2 = "0";
        }
        MSY.A16(A0f, str2);
        MSY.A12(A0f, AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str)));
        AbstractC37300Gc1.A0l(A0f, str3);
        AbstractC37301Gc2.A15(A0f, c54810OKj.A00);
        A0f.AAP("method", "moderator_action_review");
        A0f.A9K("target_user_id", Long.valueOf(MSZ.A0D(id)));
        MSX.A1D(A0f);
        MSY.A17(A0f, C16930sl.A00);
    }

    @Override // X.InterfaceC37203GaE
    public final void onSuccess() {
        C9GR.A07(this.A03.requireContext(), 2131972334);
        FCA.A00(this.A00, this.A01);
    }
}
