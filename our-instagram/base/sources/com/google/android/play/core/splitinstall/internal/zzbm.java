package com.google.android.play.core.splitinstall.internal;

import X.AbstractC58319PtB;
import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class zzbm implements IInterface, zzbo {
    public final IBinder A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(210492270);
        IBinder iBinder = this.A00;
        C0f9.A0A(25356761, A03);
        return iBinder;
    }

    public zzbm(IBinder iBinder) {
        int A03 = C0f9.A03(-1581730868);
        this.A00 = iBinder;
        C0f9.A0A(199081014, A03);
        C0f9.A0A(1229888723, C0f9.A03(-174297378));
    }

    public final Parcel A00() {
        int A03 = C0f9.A03(1945677728);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        C0f9.A0A(-818381903, A03);
        return obtain;
    }

    public final void A01(Parcel parcel, int i) {
        int A03 = C0f9.A03(1763831065);
        try {
            AbstractC58319PtB.A1B(this.A00, parcel, i);
            parcel.recycle();
            C0f9.A0A(-124666491, A03);
        } catch (Throwable th) {
            parcel.recycle();
            C0f9.A0A(-929959655, A03);
            throw th;
        }
    }
}
