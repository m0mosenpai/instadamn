package androidx.work.multiprocess;

import X.C0f9;
import X.C48442Kl;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes10.dex */
public class RemoteWorkManagerService extends Service {
    public IBinder A00;

    static {
        C48442Kl.A01("RemoteWorkManagerService");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C48442Kl.A00();
        return this.A00;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1738493411);
        super.onCreate();
        this.A00 = new RemoteWorkManagerImpl(this);
        C0f9.A0B(-636072557, A04);
    }
}
