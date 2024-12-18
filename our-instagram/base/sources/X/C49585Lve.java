package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lve, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49585Lve implements C0JG {
    public final /* synthetic */ InterfaceC16620sF A00;

    public C49585Lve(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // X.C0JG
    public final void ATM(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm) {
        AbstractC167017dG.A1N(userSession, interfaceC03960Jm);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323603574631835L);
        InterfaceC16620sF interfaceC16620sF = this.A00;
        if (A06) {
            interfaceC16620sF.invoke(userSession, interfaceC03960Jm);
        } else {
            interfaceC16620sF.invoke(userSession, null);
            interfaceC03960Jm.AIn(null);
        }
    }
}
