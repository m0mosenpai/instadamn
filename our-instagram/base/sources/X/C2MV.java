package X;

import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.2MV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2MV extends C2MH {
    @Override // X.C2MH
    public final void A05(Intent intent) {
        boolean z = false;
        if (intent.getAction() != null) {
            C48442Kl.A00();
            intent.getAction();
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        z = true;
                    } else {
                        return;
                    }
                } else if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    return;
                }
                A03(Boolean.valueOf(z));
            }
        }
    }

    @Override // X.C2MJ
    public final /* bridge */ /* synthetic */ Object A00() {
        String action;
        int hashCode;
        Intent registerReceiver = this.A01.registerReceiver(null, A04());
        boolean z = false;
        if (registerReceiver == null || registerReceiver.getAction() == null || ((action = registerReceiver.getAction()) != null && (hashCode = action.hashCode()) != -1181163412 && hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK"))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.C2MH
    public final IntentFilter A04() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
}
