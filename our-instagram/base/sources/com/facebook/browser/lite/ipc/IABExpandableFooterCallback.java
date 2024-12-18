package com.facebook.browser.lite.ipc;

import X.AbstractC58322PtE;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public interface IABExpandableFooterCallback extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends Binder implements IABExpandableFooterCallback {

        /* loaded from: classes10.dex */
        public final class Proxy implements IABExpandableFooterCallback {
            public IBinder A00;

            @Override // com.facebook.browser.lite.ipc.IABExpandableFooterCallback
            public final void D1C(String str, String str2, double d, String str3) {
                int A03 = C0f9.A03(893140729);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeDouble(d);
                    obtain.writeString(str3);
                    AbstractC58322PtE.A1A(this.A00, obtain);
                    obtain.recycle();
                    C0f9.A0A(1226484439, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    C0f9.A0A(-475971728, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int A03 = C0f9.A03(472501629);
                IBinder iBinder = this.A00;
                C0f9.A0A(457218659, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = C0f9.A03(453438949);
            attachInterface(this, "com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
            C0f9.A0A(-1861435123, A03);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(1860539680, C0f9.A03(-247830641));
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(2007894037);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                    if (i == 1) {
                        D1C(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
                        i3 = -1584519834;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                    i3 = -52343557;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C0f9.A0A(-1111277495, A03);
            return onTransact;
        }
    }

    void D1C(String str, String str2, double d, String str3);
}
