package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.Sx7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63981Sx7 implements InterfaceC65341TiM {
    public final IBinder A00;

    public C63981Sx7(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // X.InterfaceC65341TiM
    public final void CgT(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
