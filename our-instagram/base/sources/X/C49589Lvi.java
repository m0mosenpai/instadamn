package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lvi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49589Lvi implements C0JG {
    public final /* synthetic */ KPN A00;
    public final /* synthetic */ C2T6 A01;
    public final /* synthetic */ L85 A02;

    public C49589Lvi(KPN kpn, C2T6 c2t6, L85 l85) {
        this.A00 = kpn;
        this.A01 = c2t6;
        this.A02 = l85;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
        KPN kpn = this.A00;
        kpn.A05("OTC_NOTIFICATION_CHECKING_BACKGROUND_ACCOUNT");
        C2T6.A00(userSession, kpn, this.A02);
        interfaceC03960Jm.AIn(null);
    }
}
