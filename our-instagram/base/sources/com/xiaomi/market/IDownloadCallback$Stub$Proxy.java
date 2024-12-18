package com.xiaomi.market;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes11.dex */
public final class IDownloadCallback$Stub$Proxy implements IDownloadCallback {
    public IBinder A00;

    @Override // com.xiaomi.market.IDownloadCallback
    public final void Dc0(String str, float f, long j) {
        int A03 = C0f9.A03(-564295723);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeLong(100L);
            obtain.writeFloat(f);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 3);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(755066518, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-259536704, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IDownloadCallback
    public final void DEI(String str, int i, String str2) {
        int A03 = C0f9.A03(-2107269528);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 2);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(844029172, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1818176817, A03);
            throw th;
        }
    }

    @Override // com.xiaomi.market.IDownloadCallback
    public final void DoN(String str, int i, String str2) {
        int A03 = C0f9.A03(98528078);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.xiaomi.market.IDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-755031180, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-865783883, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1509759323);
        IBinder iBinder = this.A00;
        C0f9.A0A(1713897700, A03);
        return iBinder;
    }
}
