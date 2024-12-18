package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class Q1w extends BroadcastReceiver implements Runnable {
    public final Handler A00;
    public final InterfaceC65186TfU A01;
    public final /* synthetic */ SD0 A02;

    public Q1w(Handler handler, InterfaceC65186TfU interfaceC65186TfU, SD0 sd0) {
        this.A02 = sd0;
        this.A00 = handler;
        this.A01 = interfaceC65186TfU;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, 665039437);
        if (AbstractC111324zv.A00(3881).equals(intent.getAction())) {
            this.A00.post(this);
        }
        C0f9.A0E(1045136510, A04, intent);
    }
}
