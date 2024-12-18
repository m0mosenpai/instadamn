package com.google.android.gms.internal.common;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes10.dex */
public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(String str, IBinder iBinder) {
        int A03 = C0f9.A03(-916451897);
        this.A00 = iBinder;
        this.A01 = str;
        C0f9.A0A(-816241654, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1190100001);
        IBinder iBinder = this.A00;
        C0f9.A0A(-170944782, A03);
        return iBinder;
    }

    public static IObjectWrapper A00(Parcel parcel, zza zzaVar, int i) {
        Parcel A02 = zzaVar.A02(parcel, i);
        IObjectWrapper A01 = IObjectWrapper.Stub.A01(A02.readStrongBinder());
        A02.recycle();
        return A01;
    }

    public final Parcel A01() {
        int A03 = C0f9.A03(-24564629);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C0f9.A0A(1470833525, A03);
        return obtain;
    }

    public final Parcel A02(Parcel parcel, int i) {
        int A03 = C0f9.A03(1026128298);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
                parcel.recycle();
                C0f9.A0A(-854325858, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                C0f9.A0A(-784283495, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(882642655, A03);
            throw th;
        }
    }
}
