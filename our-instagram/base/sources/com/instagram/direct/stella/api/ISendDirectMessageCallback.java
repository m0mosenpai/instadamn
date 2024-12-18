package com.instagram.direct.stella.api;

import X.AbstractC167007dF;
import X.AbstractC37304Gc5;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes9.dex */
public interface ISendDirectMessageCallback extends IInterface {

    /* loaded from: classes9.dex */
    public abstract class Stub extends Binder implements ISendDirectMessageCallback {

        /* loaded from: classes9.dex */
        public final class Proxy implements ISendDirectMessageCallback {
            public IBinder A00;

            @Override // com.instagram.direct.stella.api.ISendDirectMessageCallback
            public final void DTG(String str, boolean z) {
                int A03 = C0f9.A03(-1360338813);
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                    obtain.writeString(str);
                    obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
                    this.A00.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    C0f9.A0A(-479674401, A03);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    C0f9.A0A(-1870667507, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int A03 = C0f9.A03(-360543626);
                IBinder iBinder = this.A00;
                C0f9.A0A(-159436244, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C0f9.A03(-2114044973);
            attachInterface(this, "com.instagram.direct.stella.api.ISendDirectMessageCallback");
            C0f9.A0A(179903892, A03);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(1736290455, C0f9.A03(222844540));
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(-1005476829);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                    if (i == 1) {
                        DTG(parcel.readString(), AbstractC37304Gc5.A1V(parcel));
                        parcel2.writeNoException();
                        i3 = 2081623580;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                    i3 = -1535127674;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C0f9.A0A(668842400, A03);
            return onTransact;
        }
    }

    void DTG(String str, boolean z);
}
