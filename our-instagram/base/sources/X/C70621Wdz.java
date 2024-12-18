package X;

import android.os.Bundle;

/* renamed from: X.Wdz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70621Wdz implements XCJ {
    public final /* synthetic */ V16 A00;
    public final /* synthetic */ C70654Wea A01;
    public final /* synthetic */ InterfaceC72003XEr A02;

    @Override // X.XCJ
    public final void DFf() {
    }

    @Override // X.XCJ
    public final void DqC(String str) {
        C14360o3.A0B(str, 0);
        V16 v16 = this.A00;
        W6I w6i = v16.A07;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        String obj = VG4.A1F.toString();
        C70654Wea c70654Wea = (C70654Wea) this.A02;
        w6i.A05("ads_manager", obj, c70654Wea.BZZ());
        C140966Yy c140966Yy = new C140966Yy(v16.requireActivity(), v16.getSession());
        AbstractC65702TsY.A0q();
        String BZZ = c70654Wea.BZZ();
        String str2 = this.A01.A0B;
        Bundle A0E = AbstractC31174DnI.A0E(BZZ, 0);
        A0E.putString("media_id", BZZ);
        A0E.putString("access_token", str);
        A0E.putString("ad_account_id", str2);
        V0s v0s = new V0s();
        v0s.setArguments(A0E);
        c140966Yy.A0D(v0s);
        c140966Yy.A04();
    }

    public C70621Wdz(V16 v16, C70654Wea c70654Wea, InterfaceC72003XEr interfaceC72003XEr) {
        this.A00 = v16;
        this.A02 = interfaceC72003XEr;
        this.A01 = c70654Wea;
    }
}
