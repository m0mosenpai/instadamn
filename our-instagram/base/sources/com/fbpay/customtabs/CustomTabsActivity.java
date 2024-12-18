package com.fbpay.customtabs;

import X.AbstractC08820cl;
import X.AbstractC58321PtD;
import X.AbstractC58323PtF;
import X.C0f9;
import X.C14360o3;
import X.C63165SeP;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes10.dex */
public abstract class CustomTabsActivity extends Activity {
    public boolean A00 = true;

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        if ("action_custom_tab_redirect".equals(intent.getAction())) {
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A09 = AbstractC58321PtD.A09(this, -1940133220);
        super.onCreate(bundle);
        if (!AbstractC58323PtF.A1W(this)) {
            finish();
            i = -350200869;
        } else {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("extra_url");
                if (stringExtra == null) {
                    finish();
                    i = -133691908;
                } else {
                    new C63165SeP().A01().A00(this, AbstractC08820cl.A03(stringExtra));
                    this.A00 = true;
                }
            }
            i = -1908787341;
        }
        C0f9.A07(i, A09);
    }

    @Override // android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-1358194371);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        C0f9.A07(623441748, A00);
    }
}
