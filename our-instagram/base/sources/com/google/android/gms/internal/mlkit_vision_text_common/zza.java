package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(String str, IBinder iBinder) {
        int A03 = C0f9.A03(-1733163431);
        this.A00 = iBinder;
        this.A01 = str;
        C0f9.A0A(1374478656, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(213297439);
        IBinder iBinder = this.A00;
        C0f9.A0A(1402986701, A03);
        return iBinder;
    }

    public final Parcel A00() {
        int A03 = C0f9.A03(1681264973);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C0f9.A0A(-2125490481, A03);
        return obtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        int A03 = C0f9.A03(1177033838);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
                parcel.recycle();
                C0f9.A0A(1969186472, A03);
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                C0f9.A0A(-1191008587, A03);
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(886701148, A03);
            throw th;
        }
    }

    public final void A02(Parcel parcel, int i) {
        int A03 = C0f9.A03(-1335711506);
        Parcel obtain = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(this.A00, parcel, obtain, i);
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(1025831553, A03);
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            C0f9.A0A(1724044070, A03);
            throw th;
        }
    }
}
