package androidx.work.multiprocess;

import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IWorkManagerImplCallback$Stub$Proxy implements IWorkManagerImplCallback {
    public IBinder A00;

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void DG4(String error) {
        int A03 = C0f9.A03(-789005235);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWorkManagerImplCallback.A00);
            obtain.writeString(error);
            AbstractC58319PtB.A1B(this.A00, obtain, 2);
            obtain.recycle();
            C0f9.A0A(110525406, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(752696391, A03);
            throw th;
        }
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void DqM(byte[] response) {
        int A03 = C0f9.A03(-244052650);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IWorkManagerImplCallback.A00);
            obtain.writeByteArray(response);
            AbstractC58322PtE.A1A(this.A00, obtain);
            obtain.recycle();
            C0f9.A0A(1542082147, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(763151382, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-947407510);
        IBinder iBinder = this.A00;
        C0f9.A0A(-2047923711, A03);
        return iBinder;
    }
}
