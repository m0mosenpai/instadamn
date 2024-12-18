package com.instagram.bloks.extensions.plugins.bkigactionwarequestotp;

import X.AbstractC31171DnF;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.C0f9;
import X.C14360o3;
import X.C63288Sgn;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class BloksWhatsAppCodeReceiverActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int A09 = AbstractC58321PtD.A09(this, 1298990936);
        super.onCreate(bundle);
        Intent intent = getIntent();
        C63288Sgn c63288Sgn = C63288Sgn.A00;
        C14360o3.A0A(intent);
        if (c63288Sgn.A02(intent)) {
            C14360o3.A0B(intent, 0);
            if (c63288Sgn.A02(intent) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null) {
                Intent A04 = AbstractC31171DnF.A04();
                A04.setAction("com.instagram.android.WHATSAPP_OTP");
                A04.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, stringExtra);
                AbstractC58322PtE.A0Z().A0C(getApplicationContext(), A04);
            }
        }
        finish();
        C0f9.A07(1573754259, A09);
    }
}
