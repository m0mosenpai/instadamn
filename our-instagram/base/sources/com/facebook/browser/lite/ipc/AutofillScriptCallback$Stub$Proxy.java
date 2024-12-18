package com.facebook.browser.lite.ipc;

import X.AbstractC58322PtE;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class AutofillScriptCallback$Stub$Proxy implements AutofillScriptCallback {
    public IBinder A00;

    @Override // com.facebook.browser.lite.ipc.AutofillScriptCallback
    public final void D1B(String str) {
        int A03 = C0f9.A03(-1602331463);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillScriptCallback");
            obtain.writeString(str);
            AbstractC58322PtE.A1A(this.A00, obtain);
            obtain.recycle();
            C0f9.A0A(1342121282, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-1732556768, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(475732767);
        IBinder iBinder = this.A00;
        C0f9.A0A(700273535, A03);
        return iBinder;
    }
}
