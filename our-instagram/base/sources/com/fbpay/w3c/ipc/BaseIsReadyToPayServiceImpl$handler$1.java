package com.fbpay.w3c.ipc;

import X.C0f9;
import X.C14360o3;
import X.C2J7;
import X.C62968SZl;
import X.TOS;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.instagram.fbpay.w3c.ipc.IsReadyToPayServiceImpl;
import org.chromium.IsReadyToPayService;
import org.chromium.IsReadyToPayServiceCallback;

/* loaded from: classes10.dex */
public final class BaseIsReadyToPayServiceImpl$handler$1 extends Binder implements IsReadyToPayService {
    public final /* synthetic */ IsReadyToPayServiceImpl A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseIsReadyToPayServiceImpl$handler$1(IsReadyToPayServiceImpl isReadyToPayServiceImpl) {
        this();
        this.A00 = isReadyToPayServiceImpl;
        C0f9.A0A(-963490237, C0f9.A03(1861477710));
    }

    @Override // org.chromium.IsReadyToPayService
    public final void Cba(IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        int A03 = C0f9.A03(-1049630147);
        C14360o3.A0B(isReadyToPayServiceCallback, 0);
        C62968SZl c62968SZl = (C62968SZl) C2J7.A00().A03.getValue();
        IsReadyToPayServiceImpl isReadyToPayServiceImpl = this.A00;
        C14360o3.A0B(isReadyToPayServiceImpl, 0);
        if (!c62968SZl.A01(isReadyToPayServiceImpl, null)) {
            isReadyToPayServiceCallback.CJu(false);
        } else {
            isReadyToPayServiceImpl.A00.post(new TOS(isReadyToPayServiceImpl, isReadyToPayServiceCallback));
        }
        C0f9.A0A(-440141967, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(406429348, C0f9.A03(809232851));
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.chromium.IsReadyToPayServiceCallback$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IsReadyToPayServiceCallback isReadyToPayServiceCallback;
        int A03 = C0f9.A03(1467281001);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("org.chromium.IsReadyToPayService");
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        isReadyToPayServiceCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.IsReadyToPayServiceCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof IsReadyToPayServiceCallback)) {
                            isReadyToPayServiceCallback = (IsReadyToPayServiceCallback) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            int A032 = C0f9.A03(295817915);
                            obj.A00 = readStrongBinder;
                            C0f9.A0A(1595062059, A032);
                            isReadyToPayServiceCallback = obj;
                        }
                    }
                    Cba(isReadyToPayServiceCallback);
                    i3 = -1781826570;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("org.chromium.IsReadyToPayService");
                i3 = -1969948559;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-335294993, A03);
        return onTransact;
    }

    public BaseIsReadyToPayServiceImpl$handler$1() {
        int A03 = C0f9.A03(-1685531222);
        attachInterface(this, "org.chromium.IsReadyToPayService");
        C0f9.A0A(1814162377, A03);
    }
}
