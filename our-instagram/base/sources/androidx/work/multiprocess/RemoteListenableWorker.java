package androidx.work.multiprocess;

import X.AbstractC166987dD;
import X.AbstractC48352Kc;
import X.C2L1;
import X.C48442Kl;
import X.C48532Kv;
import X.C49182Nr;
import X.C62951SYt;
import X.C63581Spo;
import X.C63653SrL;
import X.InterfaceC65305Thd;
import X.TPN;
import android.content.ComponentName;
import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class RemoteListenableWorker extends AbstractC48352Kc {
    public static final String A03 = C48442Kl.A01("RemoteListenableWorker");
    public ComponentName A00;
    public final WorkerParameters A01;
    public final C62951SYt A02;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nr] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nt] */
    @Override // X.AbstractC48352Kc
    public final ListenableFuture startWork() {
        ?? obj = new Object();
        C48532Kv c48532Kv = this.mWorkerParams.A02;
        String obj2 = this.A01.A09.toString();
        String A032 = c48532Kv.A03("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        String A033 = c48532Kv.A03("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(A032)) {
            C48442Kl.A00();
            Log.e(A03, "Need to specify a package name for the Remote Service.");
            obj.A08(AbstractC166987dD.A12("Need to specify a package name for the Remote Service."));
            return obj;
        }
        if (TextUtils.isEmpty(A033)) {
            C48442Kl.A00();
            Log.e(A03, "Need to specify a class name for the Remote Service.");
            obj.A08(AbstractC166987dD.A12("Need to specify a class name for the Remote Service."));
            return obj;
        }
        this.A00 = new ComponentName(A032, A033);
        C49182Nr A00 = this.A02.A00(this.A00, new C63653SrL(C2L1.A00(this.mAppContext), this, obj2));
        C63581Spo c63581Spo = new C63581Spo(this, 0);
        Executor executor = this.mWorkerParams.A0A;
        ?? obj3 = new Object();
        A00.addListener(new TPN(c63581Spo, obj3, A00), executor);
        return obj3;
    }

    public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A01 = workerParameters;
        this.A02 = new C62951SYt(context, this.mWorkerParams.A0A);
    }

    @Override // X.AbstractC48352Kc
    public void onStopped() {
        final int stopReason = getStopReason();
        ComponentName componentName = this.A00;
        if (componentName != null) {
            this.A02.A00(componentName, new InterfaceC65305Thd() { // from class: X.SrK
                @Override // X.InterfaceC65305Thd
                public final void ATT(IWorkManagerImplCallback iWorkManagerImplCallback, Object obj) {
                    RemoteListenableWorker remoteListenableWorker = RemoteListenableWorker.this;
                    byte[] A01 = SQY.A01(new ParcelableInterruptRequest(remoteListenableWorker.A01.A09.toString(), stopReason));
                    IListenableWorkerImpl$Stub$Proxy iListenableWorkerImpl$Stub$Proxy = (IListenableWorkerImpl$Stub$Proxy) ((IListenableWorkerImpl) obj);
                    int A032 = C0f9.A03(543651921);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(IListenableWorkerImpl.A00);
                        obtain.writeByteArray(A01);
                        obtain.writeStrongInterface(iWorkManagerImplCallback);
                        AbstractC58319PtB.A1B(iListenableWorkerImpl$Stub$Proxy.A00, obtain, 2);
                        obtain.recycle();
                        C0f9.A0A(-583805937, A032);
                    } catch (Throwable th) {
                        obtain.recycle();
                        C0f9.A0A(-984696325, A032);
                        throw th;
                    }
                }
            });
        }
    }
}
