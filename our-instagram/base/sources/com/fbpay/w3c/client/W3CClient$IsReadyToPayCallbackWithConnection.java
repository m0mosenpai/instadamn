package com.fbpay.w3c.client;

import X.AbstractC37304Gc5;
import X.C0f9;
import X.C14360o3;
import X.C2GP;
import X.OHy;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import org.chromium.IsReadyToPayServiceCallback;

/* loaded from: classes10.dex */
public final class W3CClient$IsReadyToPayCallbackWithConnection extends Binder implements IsReadyToPayServiceCallback {
    public final ServiceConnection A00;
    public final OHy A01;
    public final /* synthetic */ C2GP A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3CClient$IsReadyToPayCallbackWithConnection(ServiceConnection serviceConnection, C2GP c2gp, OHy oHy) {
        this();
        C14360o3.A0B(oHy, 2);
        this.A02 = c2gp;
        int A03 = C0f9.A03(340105661);
        this.A01 = oHy;
        this.A00 = serviceConnection;
        C0f9.A0A(603062361, A03);
    }

    @Override // org.chromium.IsReadyToPayServiceCallback
    public final void CJu(boolean z) {
        int A03 = C0f9.A03(571402971);
        try {
            this.A01.A00(z);
            C2GP.A02(this.A00, this.A02);
            C0f9.A0A(-1855064531, A03);
        } catch (Throwable th) {
            C2GP.A02(this.A00, this.A02);
            C0f9.A0A(2065774221, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1062875995, C0f9.A03(1847805771));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(595941057);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("org.chromium.IsReadyToPayServiceCallback");
                if (i == 1) {
                    CJu(AbstractC37304Gc5.A1V(parcel));
                    i3 = 933607406;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("org.chromium.IsReadyToPayServiceCallback");
                i3 = -71856580;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-2043261294, A03);
        return onTransact;
    }

    public W3CClient$IsReadyToPayCallbackWithConnection() {
        int A03 = C0f9.A03(283946562);
        attachInterface(this, "org.chromium.IsReadyToPayServiceCallback");
        C0f9.A0A(1757333620, A03);
    }
}
