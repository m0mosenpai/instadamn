package X;

import android.os.Parcel;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.IListenableWorkerImpl$Stub$Proxy;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;

/* renamed from: X.SrL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63653SrL implements InterfaceC65305Thd {
    public final /* synthetic */ C2L1 A00;
    public final /* synthetic */ RemoteListenableWorker A01;
    public final /* synthetic */ String A02;

    public C63653SrL(C2L1 c2l1, RemoteListenableWorker remoteListenableWorker, String str) {
        this.A01 = remoteListenableWorker;
        this.A00 = c2l1;
        this.A02 = str;
    }

    @Override // X.InterfaceC65305Thd
    public final /* bridge */ /* synthetic */ void ATT(IWorkManagerImplCallback iWorkManagerImplCallback, Object obj) {
        C48412Ki CHq = this.A00.A04.A05().CHq(this.A02);
        RemoteListenableWorker remoteListenableWorker = this.A01;
        byte[] A01 = SQY.A01(new ParcelableRemoteWorkRequest(remoteListenableWorker.A01, CHq.A0I));
        IListenableWorkerImpl$Stub$Proxy iListenableWorkerImpl$Stub$Proxy = (IListenableWorkerImpl$Stub$Proxy) ((IListenableWorkerImpl) obj);
        int A03 = C0f9.A03(427052451);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IListenableWorkerImpl.A00);
            obtain.writeByteArray(A01);
            obtain.writeStrongInterface(iWorkManagerImplCallback);
            AbstractC58322PtE.A1A(iListenableWorkerImpl$Stub$Proxy.A00, obtain);
            obtain.recycle();
            C0f9.A0A(951945071, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-1028988993, A03);
            throw th;
        }
    }
}
