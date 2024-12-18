package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NNQ extends AbstractC39705Hjb {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ String A03;

    public NNQ(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, String str) {
        this.A02 = c38321qM;
        this.A01 = userSession;
        this.A03 = str;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC39705Hjb
    public final void A01(AbstractC115105If abstractC115105If) {
        C9GR.A0F(this.A00, "igtv_remove_from_series_error", 2131964228);
    }

    @Override // X.AbstractC39705Hjb
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C38321qM c38321qM = this.A02;
        c38321qM.A0C.EW0(null);
        UserSession userSession = this.A01;
        C1DW.A00(userSession).A03(c38321qM);
        AbstractC25651Mw.A00(userSession).E4s(new LYM(this.A03, C05F.A0Y));
        C9GR.A01(this.A00, null, 2131964229, 0);
    }
}
