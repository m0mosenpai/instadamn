package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GG1 implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        FLR flr = (FLR) obj;
        C14360o3.A0B(userSession, 0);
        if (flr != null) {
            int i = flr.A02;
            int i2 = flr.A01;
            int i3 = flr.A00;
            C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
            C1GJ.A03(AbstractC31178DnM.A0K(A0C, "day", AbstractC31181DnP.A0G(A0C, "accounts/set_birthday/", i, i2, i3)));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
