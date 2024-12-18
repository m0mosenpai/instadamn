package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.9R9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9R9 extends BroadcastReceiver {
    public final /* synthetic */ C210059Qt A00;

    public C9R9(C210059Qt c210059Qt) {
        this.A00 = c210059Qt;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        int A01 = C0f9.A01(1096517738);
        C0fM.A01(this, context, intent);
        this.A00.A03.post(new Runnable() { // from class: X.8wr
            @Override // java.lang.Runnable
            public final void run() {
                C9R9 c9r9 = this;
                Intent intent2 = intent;
                C210059Qt c210059Qt = c9r9.A00;
                synchronized (c210059Qt) {
                    if (!c210059Qt.A05) {
                        return;
                    }
                    String action = intent2.getAction();
                    if (action != null) {
                        boolean z = true;
                        if (action.equals("android.intent.action.HEADSET_PLUG")) {
                            if (intent2.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, 0) == 0) {
                                for (AudioDeviceInfo audioDeviceInfo : c210059Qt.A02.getDevices(2)) {
                                    if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                                        break;
                                    }
                                }
                                z = false;
                            }
                            c210059Qt.A03.post(new C9R8(c210059Qt, z));
                        }
                        if (action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                            if (intent2.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0) != 2) {
                                for (AudioDeviceInfo audioDeviceInfo2 : c210059Qt.A02.getDevices(2)) {
                                    if (audioDeviceInfo2.getType() == 4 || audioDeviceInfo2.getType() == 3) {
                                        break;
                                    }
                                }
                                z = false;
                            }
                            c210059Qt.A03.post(new C9R8(c210059Qt, z));
                        }
                    }
                }
            }
        });
        C0f9.A0E(-1826468405, A01, intent);
    }
}
