package com.facebook.browser.lite.ipc;

import X.AbstractC58322PtE;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes10.dex */
public interface IABExtensionEventHandlerCallback extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends Binder implements IABExtensionEventHandlerCallback {

        /* loaded from: classes10.dex */
        public final class Proxy implements IABExtensionEventHandlerCallback {
            public IBinder A00;

            @Override // com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback
            public final void D1F(List list) {
                int A03 = C0f9.A03(343207619);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                    if (list != null) {
                        int size = list.size();
                        obtain.writeInt(size);
                        for (int i = 0; i < size; i++) {
                            Parcelable parcelable = (Parcelable) list.get(i);
                            if (parcelable != null) {
                                obtain.writeInt(1);
                                parcelable.writeToParcel(obtain, 0);
                            } else {
                                obtain.writeInt(0);
                            }
                        }
                    } else {
                        obtain.writeInt(-1);
                    }
                    AbstractC58322PtE.A1A(this.A00, obtain);
                    obtain.recycle();
                    C0f9.A0A(525877669, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    C0f9.A0A(1478802445, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int A03 = C0f9.A03(585042068);
                IBinder iBinder = this.A00;
                C0f9.A0A(2073608240, A03);
                return iBinder;
            }
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback$Stub$Proxy, com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback] */
        public static IABExtensionEventHandlerCallback A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IABExtensionEventHandlerCallback)) {
                return (IABExtensionEventHandlerCallback) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = C0f9.A03(-1190475058);
            obj.A00 = iBinder;
            C0f9.A0A(1487629942, A03);
            return obj;
        }

        public Stub() {
            int A03 = C0f9.A03(-139052413);
            attachInterface(this, "com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
            C0f9.A0A(1803873047, A03);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(-32870102, C0f9.A03(-953322939));
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(2120226932);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                    if (i == 1) {
                        D1F(parcel.createTypedArrayList(IABExtensionEventHandlerPayload.CREATOR));
                        i3 = -1770727813;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                    i3 = 746145367;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C0f9.A0A(-1683237057, A03);
            return onTransact;
        }
    }

    void D1F(List list);
}
