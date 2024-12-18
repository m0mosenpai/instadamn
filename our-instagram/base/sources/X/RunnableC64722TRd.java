package X;

import androidx.work.multiprocess.RemoteWorkManagerClient;

/* renamed from: X.TRd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64722TRd implements Runnable {
    public final RemoteWorkManagerClient A00;

    static {
        C48442Kl.A01("SessionHandler");
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.A00.A02) {
        }
    }

    public RunnableC64722TRd(RemoteWorkManagerClient remoteWorkManagerClient) {
        this.A00 = remoteWorkManagerClient;
    }
}
