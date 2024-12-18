package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes6.dex */
public final class G4K implements InterfaceC165017Zq {
    public final /* synthetic */ C32702EaT A00;

    public G4K(C32702EaT c32702EaT) {
        this.A00 = c32702EaT;
    }

    @Override // X.InterfaceC165017Zq
    public final void DT8(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        C32702EaT c32702EaT = this.A00;
        InterfaceC09390do interfaceC09390do = c32702EaT.A0S;
        C81663kb B3U = AbstractC28761aE.A00(AbstractC166987dD.A0r(interfaceC09390do)).B3U(c32702EaT.A0G());
        if (B3U != null) {
            Dz7 A0E = c32702EaT.A0E();
            GWH.A01(Dz7.A01(A0E), A0E, 12);
            if (messageIdentifier != null) {
                c32702EaT.AEG("questions", "CREATED", messageIdentifier.A01, AbstractC47991LKc.A00(AbstractC166987dD.A0r(interfaceC09390do), B3U.C7g()), null);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
