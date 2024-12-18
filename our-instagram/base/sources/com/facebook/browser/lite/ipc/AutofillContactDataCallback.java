package com.facebook.browser.lite.ipc;

import X.AbstractC58322PtE;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes10.dex */
public interface AutofillContactDataCallback extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends Binder implements AutofillContactDataCallback {

        /* loaded from: classes10.dex */
        public final class Proxy implements AutofillContactDataCallback {
            public IBinder A00;

            @Override // com.facebook.browser.lite.ipc.AutofillContactDataCallback
            public final void D1F(List list) {
                int A03 = C0f9.A03(217903108);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    obtain.writeStringList(list);
                    AbstractC58322PtE.A1A(this.A00, obtain);
                    obtain.recycle();
                    C0f9.A0A(1074029818, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    C0f9.A0A(955285902, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int A03 = C0f9.A03(2097453670);
                IBinder iBinder = this.A00;
                C0f9.A0A(956006122, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C0f9.A03(277936071);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillContactDataCallback");
            C0f9.A0A(1177855588, A03);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(595727461, C0f9.A03(340444089));
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(1068407367);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    if (i == 1) {
                        D1F(parcel.createStringArrayList());
                        i3 = 1681541556;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                    i3 = -1746015955;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C0f9.A0A(-812655039, A03);
            return onTransact;
        }
    }

    void D1F(List list);
}
