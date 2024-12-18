package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;

/* loaded from: classes10.dex */
public final class TKM implements Runnable {
    public final /* synthetic */ ServiceConnection A00;

    public TKM(ServiceConnection serviceConnection) {
        this.A00 = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onServiceConnected(new ComponentName("", ""), new Binder());
    }
}
