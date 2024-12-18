package X;

import android.content.Intent;
import android.content.IntentFilter;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.2MO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2MO extends C2MH {
    @Override // X.C2MH
    public final void A05(Intent intent) {
        boolean z = false;
        if (intent.getAction() != null) {
            C48442Kl.A00();
            intent.getAction();
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode != 490310653 || !action.equals("android.intent.action.BATTERY_LOW")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                    return;
                } else {
                    z = true;
                }
                A03(Boolean.valueOf(z));
            }
        }
    }

    @Override // X.C2MJ
    public final /* bridge */ /* synthetic */ Object A00() {
        Intent registerReceiver = this.A01.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C48442Kl.A00();
            android.util.Log.e(AbstractC62299S5u.A00, "getInitialState - null intent received");
        } else {
            float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            if (registerReceiver.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1) == 1 || intExtra > 0.15f) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // X.C2MH
    public final IntentFilter A04() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
}
