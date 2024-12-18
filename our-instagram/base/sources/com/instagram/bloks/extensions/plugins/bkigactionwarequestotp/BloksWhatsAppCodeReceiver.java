package com.instagram.bloks.extensions.plugins.bkigactionwarequestotp;

import X.AbstractC166987dD;
import X.AbstractC19750y3;
import X.AbstractC31171DnF;
import X.AbstractC58322PtE;
import X.C0QK;
import X.C14360o3;
import X.C17320tT;
import X.C63288Sgn;
import X.InterfaceC08190bh;
import X.InterfaceC19610xo;
import android.content.Context;
import android.content.Intent;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class BloksWhatsAppCodeReceiver extends C0QK {
    @Override // X.AbstractC07560aV
    public final void A05(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        Intent intent2;
        String stringExtra;
        String stringExtra2;
        C14360o3.A0B(context, 0);
        C63288Sgn c63288Sgn = C63288Sgn.A00;
        if (c63288Sgn.A02(intent)) {
            if (c63288Sgn.A02(intent) && (stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null) {
                intent2 = AbstractC31171DnF.A04();
                intent2.setAction("com.instagram.android.WHATSAPP_OTP");
                intent2.putExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, stringExtra2);
            } else {
                intent2 = null;
            }
            if (c63288Sgn.A02(intent) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null) {
                C17320tT A01 = AbstractC19750y3.A01("com.instagram.android.WHATSAPP_OTP");
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD = A01.ARD();
                JSONObject A0q = AbstractC31171DnF.A0q();
                try {
                    A0q.put("otp", stringExtra);
                    A0q.put("ct", currentTimeMillis);
                } catch (JSONException unused) {
                }
                ARD.E7K("otp_data", AbstractC166987dD.A19(A0q));
                ARD.apply();
            }
            if (intent2 != null) {
                AbstractC58322PtE.A0Z().A0C(context, intent2);
            }
        }
    }
}
