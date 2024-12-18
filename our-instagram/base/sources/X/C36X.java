package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.36X, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36X implements InterfaceC61752rc {
    public boolean A00;
    public final UserSession A01;
    public final C65192xH A02;
    public final C669430l A03;

    public C36X(UserSession userSession, C65192xH c65192xH, C669430l c669430l) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = c65192xH;
        this.A03 = c669430l;
    }

    @Override // X.InterfaceC61752rc
    public final void DNl() {
    }

    @Override // X.InterfaceC61752rc
    public final void DNz() {
        this.A00 = false;
    }

    public static final String A00(C38321qM c38321qM, C36X c36x) {
        String A2W;
        UserSession userSession = c36x.A01;
        if ((C18U.A06(C06090Tz.A05, userSession, 36312866155922778L) || AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession))) && c38321qM.A2W() != null) {
            A2W = c38321qM.A2W();
        } else {
            A2W = c38321qM.getId();
        }
        if (A2W != null) {
            return A2W;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(C38321qM c38321qM, C75113Zb c75113Zb, EnumC71153Hb enumC71153Hb, Integer num) {
        C669430l c669430l = this.A03;
        if (c669430l != null) {
            c669430l.A06(c38321qM, c75113Zb, enumC71153Hb, num, this.A02.BK6(A00(c38321qM, this)));
        }
    }

    @Override // X.InterfaceC61752rc
    public final /* bridge */ /* synthetic */ void DNG(Object obj, int i) {
    }
}
