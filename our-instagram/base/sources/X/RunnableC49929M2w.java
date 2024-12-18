package X;

import android.net.LocalServerSocket;
import java.io.IOException;

/* renamed from: X.M2w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49929M2w implements Runnable {
    public final /* synthetic */ C42871yF A00;
    public final /* synthetic */ String A01;

    public RunnableC49929M2w(C42871yF c42871yF, String str) {
        this.A00 = c42871yF;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LocalServerSocket localServerSocket;
        C42871yF c42871yF = this.A00;
        synchronized (c42871yF.A03) {
            localServerSocket = (LocalServerSocket) c42871yF.A05.get(this.A01);
        }
        if (localServerSocket != null) {
            try {
                localServerSocket.close();
            } catch (IOException unused) {
            }
        }
    }
}
