package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes6.dex */
public final class G4J implements InterfaceC165017Zq {
    public final /* synthetic */ C32706EaX A00;

    public G4J(C32706EaX c32706EaX) {
        this.A00 = c32706EaX;
    }

    @Override // X.InterfaceC165017Zq
    public final void DT8(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        C81543kP c81543kP;
        C32706EaX c32706EaX = this.A00;
        C81663kb A0F = c32706EaX.A0F();
        if (A0F != null && (c81543kP = A0F.A01.A0t) != null && c81543kP.A0I) {
            Dz7 A0E = c32706EaX.A0E();
            GWH.A01(Dz7.A01(A0E), A0E, 12);
            if (messageIdentifier != null) {
                c32706EaX.AEG("challenges", "CREATED", messageIdentifier.A01, AbstractC47991LKc.A00(AbstractC166987dD.A0r(c32706EaX.A0S), A0F.C7g()), null);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
