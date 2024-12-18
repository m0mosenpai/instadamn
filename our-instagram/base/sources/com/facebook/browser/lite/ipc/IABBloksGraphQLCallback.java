package com.facebook.browser.lite.ipc;

import X.AbstractC58322PtE;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public interface IABBloksGraphQLCallback extends IInterface {

    /* loaded from: classes10.dex */
    public abstract class Stub extends Binder implements IABBloksGraphQLCallback {

        /* loaded from: classes10.dex */
        public final class Proxy implements IABBloksGraphQLCallback {
            public IBinder A00;

            @Override // com.facebook.browser.lite.ipc.IABBloksGraphQLCallback
            public final void D1B(String str) {
                int A03 = C0f9.A03(252985085);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
                    obtain.writeString(str);
                    AbstractC58322PtE.A1A(this.A00, obtain);
                    obtain.recycle();
                    C0f9.A0A(671523943, A03);
                } catch (Throwable th) {
                    obtain.recycle();
                    C0f9.A0A(-1202713748, A03);
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int A03 = C0f9.A03(1864703456);
                IBinder iBinder = this.A00;
                C0f9.A0A(793954775, A03);
                return iBinder;
            }
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.browser.lite.ipc.IABBloksGraphQLCallback, com.facebook.browser.lite.ipc.IABBloksGraphQLCallback$Stub$Proxy, java.lang.Object] */
        public static IABBloksGraphQLCallback A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IABBloksGraphQLCallback)) {
                return (IABBloksGraphQLCallback) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = C0f9.A03(-1834413364);
            obj.A00 = iBinder;
            C0f9.A0A(319826482, A03);
            return obj;
        }

        public Stub() {
            int A03 = C0f9.A03(1105193225);
            attachInterface(this, "com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
            C0f9.A0A(-638811634, A03);
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(-15576269, C0f9.A03(-1840867321));
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = C0f9.A03(665434273);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
                    if (i == 1) {
                        D1B(parcel.readString());
                        i3 = -1802016688;
                        C0f9.A0A(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
                    i3 = -1474905564;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            C0f9.A0A(-1245108017, A03);
            return onTransact;
        }
    }

    void D1B(String str);
}
