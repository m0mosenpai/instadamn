package X;

import android.net.NetworkInfo;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6A9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6A9 implements InterfaceC15680qO {
    public static final C6AA A03 = new Object();
    public static volatile C6A9 A04;
    public final NetworkSession A00;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        boolean isConnected;
        if (networkInfo == null) {
            isConnected = false;
        } else {
            isConnected = networkInfo.isConnected();
        }
        synchronized (this) {
            AtomicBoolean atomicBoolean = this.A01;
            if (atomicBoolean.get() != isConnected) {
                atomicBoolean.set(isConnected);
                Execution.executeAsync(new C6AB(this, isConnected), null, 1);
            }
        }
    }

    public C6A9(NetworkSession networkSession) {
        this.A00 = networkSession;
    }
}
