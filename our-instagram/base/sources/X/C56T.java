package X;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.56T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56T implements Runnable {
    public final /* synthetic */ C42871yF A00;
    public final /* synthetic */ C56R A01;
    public final /* synthetic */ C56S A02;
    public final /* synthetic */ Executor A03;

    public C56T(C42871yF c42871yF, C56R c56r, C56S c56s, Executor executor) {
        this.A00 = c42871yF;
        this.A03 = executor;
        this.A02 = c56s;
        this.A01 = c56r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C42871yF c42871yF = this.A00;
        String str = c42871yF.A06;
        try {
            LocalServerSocket localServerSocket = new LocalServerSocket(str);
            AbstractC459729h.A01("LocalSocketVideoProxy", "Socket server started, address: %s", str);
            Object obj = c42871yF.A03;
            synchronized (obj) {
                map = c42871yF.A05;
                map.put(str, localServerSocket);
            }
            loop0: while (true) {
                LocalSocket localSocket = null;
                while (localServerSocket.getFileDescriptor() != null) {
                    try {
                        localSocket = localServerSocket.accept();
                        synchronized (c42871yF.A02) {
                            while (true) {
                                List list = c42871yF.A04;
                                if (list.size() <= c42871yF.A01) {
                                    break;
                                }
                                LocalSocket localSocket2 = (LocalSocket) list.remove(0);
                                AbstractC459729h.A01("LocalSocketVideoProxy", "Closing client %s due to excess limit %d", localSocket2, Integer.valueOf(list.size() + 1));
                                try {
                                    localSocket2.close();
                                } catch (IOException unused) {
                                }
                            }
                        }
                    } catch (IOException e) {
                        android.util.Log.e("LocalSocketVideoProxy", String.format("Error connecting to client", new Object[0]), e);
                        if (localSocket != null) {
                            try {
                                localSocket.close();
                            } catch (IOException unused2) {
                            }
                        }
                        localSocket = null;
                    }
                    if (localSocket != null) {
                        break;
                    }
                }
                synchronized (obj) {
                    map.remove(str);
                }
                return;
                this.A03.execute(new RunnableC58458Pvj(localSocket, this));
            }
        } catch (IOException e2) {
            throw new RuntimeException("Error initializing server", e2);
        }
    }
}
