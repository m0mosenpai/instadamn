package com.google.android.gms.internal.p002authapi;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public abstract class zba implements IInterface {
    public final String A00;
    public final IBinder A01;

    public zba(String str, IBinder iBinder) {
        int A03 = C0f9.A03(203213487);
        this.A01 = iBinder;
        this.A00 = str;
        C0f9.A0A(496381104, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(250671105);
        IBinder iBinder = this.A01;
        C0f9.A0A(1592559146, A03);
        return iBinder;
    }

    public static Parcel A00(IInterface iInterface, Parcelable parcelable, zba zbaVar) {
        int A03 = C0f9.A03(1625149835);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(zbaVar.A00);
        C0f9.A0A(-135530439, A03);
        obtain.writeStrongBinder(iInterface.asBinder());
        if (parcelable == null) {
            obtain.writeInt(0);
            return obtain;
        }
        obtain.writeInt(1);
        parcelable.writeToParcel(obtain, 0);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = C0f9.A03(-1096005477);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A01, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(-864740470, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(849984768, A03);
            throw th;
        }
    }
}
