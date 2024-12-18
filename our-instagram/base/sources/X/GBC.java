package X;

import com.instagram.phonenumber.model.CountryCodeData;

/* loaded from: classes6.dex */
public final class GBC implements GY8 {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;

    public GBC(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = c6fq;
        this.A01 = interfaceC103384lE;
    }

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        C14360o3.A0B(countryCodeData, 0);
        C6FQ c6fq = this.A00;
        InterfaceC103384lE interfaceC103384lE = this.A01;
        C6FX A0s = AbstractC25225BEi.A0s();
        A0s.A03(countryCodeData.A00, 0);
        A0s.A02(countryCodeData.A02);
        A0s.A03(countryCodeData.A01, 2);
        AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
    }
}
