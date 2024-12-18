package com.instagram.direct.stella.api;

import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes9.dex */
public final class IStellaDirectMessagingService$Stub$Proxy implements IStellaDirectMessagingService {
    public IBinder A00;

    @Override // com.instagram.direct.stella.api.IStellaDirectMessagingService
    public final void ED8(ISendDirectMessageCallback iSendDirectMessageCallback) {
        int A03 = C0f9.A03(860595062);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.instagram.direct.stella.api.IStellaDirectMessagingService");
            obtain.writeStrongInterface(iSendDirectMessageCallback);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-208746454, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2084238884, A03);
            throw th;
        }
    }

    @Override // com.instagram.direct.stella.api.IStellaDirectMessagingService
    public final String EIw(String str) {
        int A03 = C0f9.A03(106142123);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.instagram.direct.stella.api.IStellaDirectMessagingService");
            obtain.writeString(str);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1639999035, A03);
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1408912335, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1029052551);
        IBinder iBinder = this.A00;
        C0f9.A0A(806264136, A03);
        return iBinder;
    }
}
