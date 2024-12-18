package com.meta.trusteddevice.base;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0f9;
import X.C63406Sjd;
import X.RkB;
import X.SF7;
import X.SMY;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.trusteddevice.TdfCrossAppDeviceKeyCallback;

/* loaded from: classes10.dex */
public final class TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1 extends Binder implements TdfCrossAppDeviceKeyCallback {
    public final /* synthetic */ SMY A00;
    public final /* synthetic */ SF7 A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1(SMY smy, SF7 sf7) {
        this();
        this.A01 = sf7;
        this.A00 = smy;
        C0f9.A0A(-185408702, C0f9.A03(-1457354322));
    }

    @Override // com.trusteddevice.TdfCrossAppDeviceKeyCallback
    public final void D8l(String str) {
        int A0N = AbstractC167017dG.A0N(str, 6021994);
        C63406Sjd.A0E(this.A01.A00, null, new RkB(str));
        C0f9.A0A(652762376, A0N);
    }

    @Override // com.trusteddevice.TdfCrossAppDeviceKeyCallback
    public final void D8m(String str, String str2) {
        int A03 = C0f9.A03(894956790);
        AbstractC167017dG.A1N(str, str2);
        C63406Sjd.A0C(this.A01.A00, AbstractC166987dD.A1L(str, str2));
        C0f9.A0A(1241600512, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(244423031, C0f9.A03(-1115508519));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-146763181);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
                if (i != 1) {
                    if (i == 2) {
                        D8l(parcel.readString());
                    }
                } else {
                    D8m(parcel.readString(), parcel.readString());
                }
                parcel2.writeNoException();
                i3 = 1060128947;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
                i3 = -195116287;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(1368835365, A03);
        return onTransact;
    }

    public TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1() {
        int A03 = C0f9.A03(2009575616);
        attachInterface(this, "com.trusteddevice.TdfCrossAppDeviceKeyCallback");
        C0f9.A0A(497880386, A03);
    }
}
