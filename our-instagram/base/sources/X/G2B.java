package X;

import android.view.ViewStub;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G2B implements InterfaceC37193Ga4 {
    public final User A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;

    public G2B(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        C14360o3.A0B(str2, 3);
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = interfaceC11380iw;
        User A0k = AbstractC31174DnI.A0k(userSession, str2);
        if (A0k != null) {
            this.A00 = A0k;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37193Ga4
    public final void CNX(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        C14360o3.A0B(viewStub, 0);
        AbstractC31181DnP.A09(viewStub).setUrl(this.A00.Bhu(), this.A01);
    }

    @Override // X.InterfaceC37193Ga4
    public final /* synthetic */ void DDM(C148336m3 c148336m3) {
    }

    @Override // X.InterfaceC37193Ga4
    public final void EOe(C2EC c2ec, C2DS c2ds, DirectShareTarget directShareTarget, String str, boolean z) {
        AbstractC167017dG.A1O(str, c2ec);
        UserSession userSession = this.A02;
        AbstractC165967bO.A00(userSession).EOZ(null, c2ec.BKb(), str, NetInfoModule.CONNECTION_TYPE_NONE, null, z);
        AbstractC34052F1f.A00(userSession, this.A04);
        C162337Ov.A0L(this.A01, userSession, this.A03, "", "");
    }

    @Override // X.InterfaceC37193Ga4
    public final User CE6() {
        return this.A00;
    }
}
