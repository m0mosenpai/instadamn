package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lvb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49582Lvb implements C0JG {
    public final /* synthetic */ int A00;

    public C49582Lvb(int i) {
        this.A00 = i;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
        C2IX c2ix = (C2IX) userSession.A01(C2IX.class, new C50251MHg(userSession, 42));
        int i = this.A00;
        InterfaceC19610xo ARD = c2ix.A00.ARD();
        ARD.E7D("direct_threads_badge_count", i);
        ARD.apply();
        interfaceC03960Jm.AIn(null);
    }
}
