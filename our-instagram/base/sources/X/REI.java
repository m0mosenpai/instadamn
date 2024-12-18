package X;

import android.os.Bundle;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;

/* loaded from: classes10.dex */
public class REI extends Q8X {
    public C2GT A00;
    public C2GT A01;
    public C2GT A02;
    public AddressFormFieldsConfig A03;
    public FBPayLoggerData A04;
    public FbPayNewCreditCardOption A05;
    public SMF A06;
    public SMH A07;
    public String A08;
    public final C2GC A0E;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final C2GS A09 = AbstractC58318PtA.A0J();
    public final C2GS A0A = AbstractC58318PtA.A0J();
    public final C2GS A0B = AbstractC58318PtA.A0J();
    public final java.util.Set A0G = AbstractC166987dD.A1H();
    public final java.util.Set A0F = AbstractC166987dD.A1H();
    public final InterfaceC58362lv A0C = new C63627SqZ(this, 23);
    public final InterfaceC58362lv A0D = new C63627SqZ(this, 24);

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C2GT c2gt = this.A00;
        if (c2gt != null) {
            c2gt.A08(this.A0C);
        }
    }

    public REI(C2GC c2gc, SMF smf, SMH smh, String str, EnumC61116RfW[] enumC61116RfWArr, boolean z, boolean z2, boolean z3) {
        for (EnumC61116RfW enumC61116RfW : enumC61116RfWArr) {
            this.A0G.add(enumC61116RfW);
        }
        this.A0H = z;
        this.A0I = z2;
        this.A0J = z3;
        this.A06 = smf;
        this.A07 = smh;
        this.A0E = c2gc;
        C58252li c58252li = smf.A03;
        smf.A00(this.A0G);
        this.A01 = C75M.A01(c58252li, new TW2(str, this, 0));
        C63627SqZ.A02(c58252li, super.A03, this, 25);
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A04 = AbstractC58320PtC.A0Z(bundle);
    }
}
