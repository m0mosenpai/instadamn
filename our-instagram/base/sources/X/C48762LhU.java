package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.LhU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48762LhU implements InterfaceC50466MPu {
    public final /* synthetic */ L8C A00;

    @Override // X.InterfaceC50466MPu
    public final void CpT(User user) {
        C14360o3.A0B(user, 0);
        L8C l8c = this.A00;
        UserSession userSession = l8c.A07;
        AbstractC135966Db.A01(userSession).A0D(EnumC46303KeZ.A0D);
        LKo.A00.A05(l8c.A05, l8c.A06, userSession, user);
    }

    @Override // X.InterfaceC50466MPu
    public final void FDS(User user) {
        C14360o3.A0B(user, 0);
        LKo lKo = LKo.A00;
        L8C l8c = this.A00;
        lKo.A06(l8c.A05.requireActivity(), null, l8c.A06, l8c.A07, null, user.getId(), false);
    }

    public C48762LhU(L8C l8c) {
        this.A00 = l8c;
    }
}
