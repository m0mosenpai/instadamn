package X;

import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class T3T implements InterfaceC65388TjL {
    public final /* synthetic */ SPP A00;
    public final /* synthetic */ C63001SaP A01;

    public T3T(SPP spp, C63001SaP c63001SaP) {
        this.A00 = spp;
        this.A01 = c63001SaP;
    }

    @Override // X.InterfaceC65388TjL
    public final /* bridge */ /* synthetic */ void Dgi(Object obj, String str, Throwable th) {
        InterfaceC103384lE interfaceC103384lE;
        C6FX A0s;
        SPP spp = this.A00;
        SX5 sx5 = spp.A01.A02;
        sx5.A03.remove(this.A01);
        C62559SGk c62559SGk = spp.A02;
        if (obj != null) {
            interfaceC103384lE = c62559SGk.A02;
            A0s = AbstractC31179DnN.A0I(obj);
        } else {
            if (th == null) {
                th = new Exception("An unknown error was thrown during the authorization process");
            }
            LinkedHashMap A1F = AbstractC25232BEp.A1F("auth_factor_expired", null, AbstractC166987dD.A1L("exception", th.toString()), AbstractC166987dD.A1L("remaining_attempts", null));
            interfaceC103384lE = c62559SGk.A01;
            A0s = AbstractC25225BEi.A0s();
            A0s.A03(A1F, 0);
        }
        C131845xK.A00(c62559SGk.A00, A0s.A00(), interfaceC103384lE);
    }
}
