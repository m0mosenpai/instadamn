package X;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.RemoteCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes10.dex */
public final class TQS implements Runnable {
    public final /* synthetic */ C62951SYt A00;
    public final /* synthetic */ RemoteCallback A01;
    public final /* synthetic */ InterfaceC65305Thd A02;
    public final /* synthetic */ ListenableFuture A03;

    public TQS(C62951SYt c62951SYt, RemoteCallback remoteCallback, InterfaceC65305Thd interfaceC65305Thd, ListenableFuture listenableFuture) {
        this.A00 = c62951SYt;
        this.A03 = listenableFuture;
        this.A01 = remoteCallback;
        this.A02 = interfaceC65305Thd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            IListenableWorkerImpl iListenableWorkerImpl = (IListenableWorkerImpl) this.A03.get();
            RemoteCallback remoteCallback = this.A01;
            IBinder asBinder = iListenableWorkerImpl.asBinder();
            int A03 = C0f9.A03(-1341687036);
            remoteCallback.A00 = asBinder;
            try {
                asBinder.linkToDeath(remoteCallback.A01, 0);
            } catch (RemoteException e) {
                RemoteCallback.A00(remoteCallback, e);
            }
            C0f9.A0A(-2147220116, A03);
            this.A00.A03.execute(new TMm(iListenableWorkerImpl, this));
        } catch (InterruptedException | ExecutionException e2) {
            C48442Kl.A00();
            android.util.Log.e(C62951SYt.A04, "Unable to bind to service", e2);
            RunnableC64729TRl.A00(this.A01, e2);
        }
    }
}
