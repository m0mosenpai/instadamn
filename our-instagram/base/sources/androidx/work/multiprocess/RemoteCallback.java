package androidx.work.multiprocess;

import X.AbstractC166987dD;
import X.C0f9;
import X.C49182Nr;
import X.C63462Skh;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class RemoteCallback extends Binder implements IWorkManagerImplCallback {
    public IBinder A00;
    public final IBinder.DeathRecipient A01;
    public final C49182Nr A02;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.2Nr] */
    public RemoteCallback() {
        int A03 = C0f9.A03(-1814143413);
        attachInterface(this, IWorkManagerImplCallback.A00);
        C0f9.A0A(280964456, A03);
        int A032 = C0f9.A03(82497104);
        this.A00 = null;
        this.A02 = new Object();
        this.A01 = new C63462Skh(this);
        C0f9.A0A(-1621771810, A032);
    }

    public static void A00(RemoteCallback remoteCallback, Throwable th) {
        int A03 = C0f9.A03(433217085);
        remoteCallback.A02.A08(th);
        int A032 = C0f9.A03(2045377316);
        IBinder iBinder = remoteCallback.A00;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(remoteCallback.A01, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        C0f9.A0A(901301854, A032);
        C0f9.A0A(2104046337, C0f9.A03(1474174170));
        C0f9.A0A(-332758699, A03);
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void DG4(String str) {
        int A03 = C0f9.A03(-533476537);
        A00(this, AbstractC166987dD.A18(str));
        C0f9.A0A(-1795988118, A03);
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void DqM(byte[] bArr) {
        int A03 = C0f9.A03(1096329657);
        this.A02.A07(bArr);
        int A032 = C0f9.A03(2045377316);
        IBinder iBinder = this.A00;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.A01, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        C0f9.A0A(901301854, A032);
        C0f9.A0A(2104046337, C0f9.A03(1474174170));
        C0f9.A0A(2141265685, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1332910552, C0f9.A03(2145957569));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int code, Parcel data, Parcel reply, int flags) {
        int i;
        int A03 = C0f9.A03(-1152981776);
        String str = IWorkManagerImplCallback.A00;
        boolean z = true;
        if (code >= 1) {
            if (code <= 16777215) {
                data.enforceInterface(str);
                if (code != 1) {
                    if (code == 2) {
                        DG4(data.readString());
                    }
                } else {
                    DqM(data.createByteArray());
                }
                i = -1027841409;
            } else if (code == 1598968902) {
                reply.writeString(str);
                i = 976685070;
            }
            C0f9.A0A(i, A03);
            return z;
        }
        z = super.onTransact(code, data, reply, flags);
        i = 2119956713;
        C0f9.A0A(i, A03);
        return z;
    }
}
