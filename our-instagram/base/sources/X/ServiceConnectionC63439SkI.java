package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SkI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63439SkI implements ServiceConnection {
    public AtomicBoolean A00 = AbstractC166997dE.A17();
    public final BlockingQueue A01 = new LinkedBlockingDeque();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.A01.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }
}
