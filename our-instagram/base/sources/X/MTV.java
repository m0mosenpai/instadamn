package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class MTV implements InterfaceC81993lL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ C3G7 A03;
    public final /* synthetic */ String A04;

    public MTV(Reel reel, C3G7 c3g7, String str, int i, int i2) {
        this.A03 = c3g7;
        this.A02 = reel;
        this.A00 = i;
        this.A04 = str;
        this.A01 = i2;
    }

    @Override // X.InterfaceC81993lL
    public final void DPm(String str) {
        C3G7 c3g7 = this.A03;
        c3g7.A05.remove(this);
        AbstractC82003lM.A00(c3g7.A03).A03(this);
    }

    @Override // X.InterfaceC81993lL
    public final void DPz(String str, boolean z) {
        C3G7 c3g7 = this.A03;
        c3g7.A05.remove(this);
        UserSession userSession = c3g7.A03;
        AbstractC82003lM.A00(userSession).A03(this);
        Reel reel = this.A02;
        if (reel.A0O(userSession).size() > this.A00) {
            C42981yQ A00 = AbstractC42951yN.A00(userSession);
            String str2 = this.A04;
            A00.A05(str2, AbstractC166987dD.A1J(c3g7.A04(reel, str2, this.A01)));
        }
    }
}
