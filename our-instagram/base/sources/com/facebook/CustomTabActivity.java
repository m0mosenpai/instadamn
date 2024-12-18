package com.facebook;

import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.C0f9;
import X.C41451vu;
import X.C64470TFg;
import X.C64471TFh;
import X.C64473TFj;
import X.InterfaceC41501vz;
import X.MSW;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes10.dex */
public class CustomTabActivity extends Activity {
    public InterfaceC41501vz A00 = null;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            C41451vu c41451vu = C41451vu.A01;
            c41451vu.E4s(new C64471TFh(getIntent().getDataString()));
            C64473TFj c64473TFj = new C64473TFj(this, 0);
            this.A00 = c64473TFj;
            c41451vu.A02(c64473TFj, C64470TFg.class);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A09 = AbstractC58321PtD.A09(this, 348390450);
        super.onCreate(bundle);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
        }
        Intent A08 = MSW.A08(this, CustomTabMainActivity.class);
        A08.setAction("CustomTabActivity.action_customTabRedirect");
        A08.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
        A08.addFlags(603979776);
        AbstractC58322PtE.A0Z().A0F(this, A08, 2);
        C0f9.A07(1055699055, A09);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-739852603);
        InterfaceC41501vz interfaceC41501vz = this.A00;
        if (interfaceC41501vz != null) {
            C41451vu.A01.A03(interfaceC41501vz, C64470TFg.class);
        }
        super.onDestroy();
        C0f9.A07(1570583838, A00);
    }
}
