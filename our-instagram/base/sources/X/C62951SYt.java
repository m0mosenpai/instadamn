package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.multiprocess.RemoteCallback;
import java.util.concurrent.Executor;

/* renamed from: X.SYt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62951SYt {
    public static final String A04 = C48442Kl.A01("ListenableWorkerImplClient");
    public ServiceConnectionC63446SkP A00;
    public final Context A01;
    public final Object A02 = AbstractC58318PtA.A0b();
    public final Executor A03;

    public final C49182Nr A00(ComponentName componentName, InterfaceC65305Thd interfaceC65305Thd) {
        C49182Nr c49182Nr;
        synchronized (this.A02) {
            if (this.A00 == null) {
                C48442Kl.A00();
                componentName.getPackageName();
                componentName.getClassName();
                this.A00 = new ServiceConnectionC63446SkP();
                try {
                    Intent A042 = AbstractC31171DnF.A04();
                    A042.setComponent(componentName);
                    if (!this.A01.bindService(A042, this.A00, 1)) {
                        ServiceConnectionC63446SkP serviceConnectionC63446SkP = this.A00;
                        RuntimeException A18 = AbstractC166987dD.A18("Unable to bind to service");
                        C48442Kl.A00();
                        android.util.Log.e(A04, "Unable to bind to service", A18);
                        serviceConnectionC63446SkP.A00.A08(A18);
                    }
                } catch (Throwable th) {
                    ServiceConnectionC63446SkP serviceConnectionC63446SkP2 = this.A00;
                    C48442Kl.A00();
                    android.util.Log.e(A04, "Unable to bind to service", th);
                    serviceConnectionC63446SkP2.A00.A08(th);
                }
            }
            c49182Nr = this.A00.A00;
        }
        RemoteCallback remoteCallback = new RemoteCallback();
        c49182Nr.addListener(new TQS(this, remoteCallback, interfaceC65305Thd, c49182Nr), this.A03);
        int A03 = C0f9.A03(-764495376);
        C49182Nr c49182Nr2 = remoteCallback.A02;
        C0f9.A0A(1363793704, A03);
        return c49182Nr2;
    }

    public C62951SYt(Context context, Executor executor) {
        this.A01 = context;
        this.A03 = executor;
    }
}
