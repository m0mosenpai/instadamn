package com.facebook.browser.lite.ipc;

import X.AbstractC167007dF;
import X.AbstractC37304Gc5;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public interface AutofillOptOutCallback extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends Binder implements AutofillOptOutCallback {

        /* loaded from: classes10.dex */
        public final class Proxy implements AutofillOptOutCallback {
            public IBinder A00;

            @Override // com.facebook.browser.lite.ipc.AutofillOptOutCallback
            public final void D1E(String str, boolean z) {
                int A03 = C0f9.A03(1246329137);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    obtain.writeString(str);
                    obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
                    this.A00.transact(1, obtain, null, 1);
                    obtain.recycle();
                    C0f9.A0A(971855976, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    C0f9.A0A(649622755, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int A03 = C0f9.A03(-1936173714);
                IBinder iBinder = this.A00;
                C0f9.A0A(-820015047, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C0f9.A03(-1742465275);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillOptOutCallback");
            C0f9.A0A(602685671, A03);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(-387477542, C0f9.A03(-617270258));
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(-454439569);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    if (i == 1) {
                        D1E(parcel.readString(), AbstractC37304Gc5.A1V(parcel));
                        i3 = -2058053722;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    i3 = -918341382;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C0f9.A0A(1617105194, A03);
            return onTransact;
        }
    }

    void D1E(String str, boolean z);
}
