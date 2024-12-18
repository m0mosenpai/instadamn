package androidx.work.impl.background.systemalarm;

import X.AbstractServiceC09080dF;
import X.C0f9;
import X.C48442Kl;
import X.C63650SrG;
import X.InterfaceC65191TfZ;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes10.dex */
public class SystemAlarmService extends AbstractServiceC09080dF implements InterfaceC65191TfZ {
    public C63650SrG A00;
    public boolean A01;

    static {
        C48442Kl.A01("SystemAlarmService");
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-488916408);
        super.onCreate();
        C63650SrG c63650SrG = new C63650SrG(this);
        this.A00 = c63650SrG;
        if (c63650SrG.A02 != null) {
            C48442Kl.A00();
            Log.e(C63650SrG.A0B, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            c63650SrG.A02 = this;
        }
        this.A01 = false;
        C0f9.A0B(-28763192, A04);
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(-253960804);
        super.onDestroy();
        this.A01 = true;
        C63650SrG c63650SrG = this.A00;
        C48442Kl.A00();
        c63650SrG.A04.A03(c63650SrG);
        c63650SrG.A02 = null;
        C0f9.A0B(563478687, A04);
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final int onStartCommand(Intent intent, int flags, int startId) {
        int A04 = C0f9.A04(1318340339);
        super.onStartCommand(intent, flags, startId);
        if (this.A01) {
            C48442Kl.A00();
            C63650SrG c63650SrG = this.A00;
            C48442Kl.A00();
            c63650SrG.A04.A03(c63650SrG);
            c63650SrG.A02 = null;
            C63650SrG c63650SrG2 = new C63650SrG(this);
            this.A00 = c63650SrG2;
            if (c63650SrG2.A02 != null) {
                C48442Kl.A00();
                Log.e(C63650SrG.A0B, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                c63650SrG2.A02 = this;
            }
            this.A01 = false;
        }
        if (intent != null) {
            this.A00.A02(intent, startId);
        }
        C0f9.A0B(239442611, A04);
        return 3;
    }
}
