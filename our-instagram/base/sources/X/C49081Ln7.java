package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Ln7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49081Ln7 implements InterfaceC165507ad, InterfaceC165297aI, InterfaceC165337aM, InterfaceC165347aN, C7XX {
    public final UserSession A00;
    public final InterfaceC165297aI A01;
    public final InterfaceC165227aB A02;

    @Override // X.InterfaceC165507ad
    public final boolean CQu() {
        return false;
    }

    @Override // X.InterfaceC165347aN
    public final void EkI(C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
    }

    @Override // X.C7XX
    public final void EnH(C7S5 c7s5, MessageIdentifier messageIdentifier, String str) {
    }

    @Override // X.InterfaceC165347aN
    public final void F81(MessageIdentifier messageIdentifier, boolean z) {
    }

    @Override // X.InterfaceC165337aM
    public final C2056398n Axi() {
        return AbstractC2056298m.A00(this.A00);
    }

    @Override // X.InterfaceC165297aI
    public final void DDJ(MessageIdentifier messageIdentifier, boolean z) {
        InterfaceC165297aI interfaceC165297aI = this.A01;
        if (interfaceC165297aI instanceof C49091LnH) {
            ((C49091LnH) interfaceC165297aI).A00 = this.A02;
        }
        if (interfaceC165297aI != null) {
            interfaceC165297aI.DDJ(messageIdentifier, z);
        }
    }

    public C49081Ln7(UserSession userSession, InterfaceC165297aI interfaceC165297aI, InterfaceC165227aB interfaceC165227aB) {
        AbstractC167017dG.A1Q(userSession, interfaceC165227aB);
        this.A00 = userSession;
        this.A01 = interfaceC165297aI;
        this.A02 = interfaceC165227aB;
    }
}
