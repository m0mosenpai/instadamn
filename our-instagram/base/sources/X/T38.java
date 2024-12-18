package X;

import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class T38 implements InterfaceC65508Tld {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC65508Tld
    public final void DcL(Boolean bool, Integer num, Throwable th) {
        C14360o3.A0B(th, 0);
        LinkedHashMap A1F = AbstractC25232BEp.A1F("auth_factor_expired", bool, AbstractC166987dD.A1L("exception", th.toString()), AbstractC166987dD.A1L("remaining_attempts", AbstractC31180DnO.A0k(num)));
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
        C131845xK.A00((C6FQ) this.A01, AbstractC58320PtC.A0g(A1F), interfaceC103384lE);
    }

    @Override // X.InterfaceC65508Tld
    public final void DcO(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
        C131845xK.A00((C6FQ) this.A01, AbstractC58320PtC.A0g(str), interfaceC103384lE);
    }

    public T38(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, int i) {
        this.A00 = i;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE2;
    }
}
