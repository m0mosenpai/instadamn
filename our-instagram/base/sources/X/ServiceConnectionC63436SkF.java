package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.ar.core.dependencies.c;
import com.google.ar.core.dependencies.f;
import java.util.Iterator;

/* renamed from: X.SkF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63436SkF implements ServiceConnection {
    public final /* synthetic */ C62915SWw A00;

    public ServiceConnectionC63436SkF(C62915SWw c62915SWw) {
        this.A00 = c62915SWw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar;
        C62915SWw c62915SWw = this.A00;
        synchronized (c62915SWw) {
            if (iBinder == null) {
                fVar = 0;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
                if (queryLocalInterface instanceof f) {
                    fVar = (f) queryLocalInterface;
                } else {
                    c cVar = new c("com.google.android.play.core.install.protocol.IInstallService", iBinder);
                    C0f9.A0A(2876430, C0f9.A03(1052700873));
                    fVar = cVar;
                }
            }
            c62915SWw.A01 = fVar;
            c62915SWw.A04 = 3;
            Iterator it = c62915SWw.A03.iterator();
            while (it.hasNext()) {
                AbstractC58319PtB.A1N(it);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C62915SWw c62915SWw = this.A00;
        synchronized (c62915SWw) {
            c62915SWw.A04 = 1;
            c62915SWw.A01 = null;
        }
    }
}
