package com.meta.trusteddevice.base;

import X.AbstractC167017dG;
import X.C0f9;
import X.C63406Sjd;
import X.RkB;
import X.SF7;
import X.SMY;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback;

/* loaded from: classes10.dex */
public final class TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1 extends Binder implements TdfTrustChainBindingSignPttPayloadCallback {
    public final /* synthetic */ SMY A00;
    public final /* synthetic */ SF7 A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1(SMY smy, SF7 sf7) {
        this();
        this.A01 = sf7;
        this.A00 = smy;
        C0f9.A0A(-458073524, C0f9.A03(2046777745));
    }

    @Override // com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback
    public final void DcM(String str) {
        int A0N = AbstractC167017dG.A0N(str, -1485079283);
        C63406Sjd.A0E(this.A01.A00, null, new RkB(str));
        C0f9.A0A(-1029104835, A0N);
    }

    @Override // com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback
    public final void DcN(String str) {
        int A0N = AbstractC167017dG.A0N(str, -1066979249);
        C63406Sjd.A0C(this.A01.A00, str);
        C0f9.A0A(493341235, A0N);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(814833341, C0f9.A03(-1667484056));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(49073978);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
                if (i != 1) {
                    if (i == 2) {
                        DcM(parcel.readString());
                    }
                } else {
                    DcN(parcel.readString());
                }
                parcel2.writeNoException();
                i3 = -835153693;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
                i3 = -695747762;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-971539735, A03);
        return onTransact;
    }

    public TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1() {
        int A03 = C0f9.A03(1764142410);
        attachInterface(this, "com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
        C0f9.A0A(1241891041, A03);
    }
}
