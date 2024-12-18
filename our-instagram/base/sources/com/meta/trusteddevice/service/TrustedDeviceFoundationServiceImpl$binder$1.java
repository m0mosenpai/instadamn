package com.meta.trusteddevice.service;

import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.C0f9;
import X.C14360o3;
import X.C49352Or;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Base64;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.trusteddevice.TdfCrossAppDeviceKeyCallback;
import com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback;
import com.trusteddevice.TrustedDeviceFoundationService;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class TrustedDeviceFoundationServiceImpl$binder$1 extends Binder implements TrustedDeviceFoundationService {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.trusteddevice.TrustedDeviceFoundationService$Stub$Proxy, com.trusteddevice.TrustedDeviceFoundationService] */
    public static TrustedDeviceFoundationService A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.trusteddevice.TrustedDeviceFoundationService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof TrustedDeviceFoundationService)) {
            return (TrustedDeviceFoundationService) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = C0f9.A03(1777308267);
        obj.A00 = iBinder;
        C0f9.A0A(-219579509, A03);
        return obj;
    }

    public TrustedDeviceFoundationServiceImpl$binder$1() {
        int A03 = C0f9.A03(-1371540307);
        attachInterface(this, "com.trusteddevice.TrustedDeviceFoundationService");
        C0f9.A0A(952489638, A03);
        C0f9.A0A(86718919, C0f9.A03(958367783));
    }

    @Override // com.trusteddevice.TrustedDeviceFoundationService
    public final void BZP(TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback) {
        int A0N = AbstractC167017dG.A0N(tdfCrossAppDeviceKeyCallback, 888820015);
        try {
            C49352Or c49352Or = new C49352Or("autofill_key");
            String encodeToString = Base64.encodeToString(c49352Or.A03(), 2);
            C14360o3.A07(encodeToString);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(c49352Or.A03());
            byte[] digest = messageDigest.digest();
            C14360o3.A07(digest);
            String A0x = AbstractC58319PtB.A0x(digest);
            C14360o3.A07(A0x);
            tdfCrossAppDeviceKeyCallback.D8m(encodeToString, A0x);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Could not fetch device key and/or fingerprint";
            }
            tdfCrossAppDeviceKeyCallback.D8l(message);
        }
        C0f9.A0A(298862475, A0N);
    }

    @Override // com.trusteddevice.TrustedDeviceFoundationService
    public final void Ely(TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback, byte[] bArr) {
        int A03 = C0f9.A03(1754526082);
        AbstractC167017dG.A1N(bArr, tdfTrustChainBindingSignPttPayloadCallback);
        try {
            tdfTrustChainBindingSignPttPayloadCallback.DcN(new C49352Or("autofill_key").A02(bArr));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Could not sign payload";
            }
            tdfTrustChainBindingSignPttPayloadCallback.DcM(message);
        }
        C0f9.A0A(1560994886, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1835662453, C0f9.A03(147517702));
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.trusteddevice.TdfCrossAppDeviceKeyCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03;
        int i4;
        TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback;
        TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback;
        int A032 = C0f9.A03(271649577);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.trusteddevice.TrustedDeviceFoundationService");
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                A03 = C0f9.A03(1115787087);
                                i4 = 1578985273;
                            }
                        } else {
                            byte[] createByteArray = parcel.createByteArray();
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder == null) {
                                tdfTrustChainBindingSignPttPayloadCallback = null;
                            } else {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
                                if (queryLocalInterface != null && (queryLocalInterface instanceof TdfTrustChainBindingSignPttPayloadCallback)) {
                                    tdfTrustChainBindingSignPttPayloadCallback = (TdfTrustChainBindingSignPttPayloadCallback) queryLocalInterface;
                                } else {
                                    ?? obj = new Object();
                                    int A033 = C0f9.A03(1140012108);
                                    obj.A00 = readStrongBinder;
                                    C0f9.A0A(-1056416580, A033);
                                    tdfTrustChainBindingSignPttPayloadCallback = obj;
                                }
                            }
                            Ely(tdfTrustChainBindingSignPttPayloadCallback, createByteArray);
                        }
                    } else {
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            tdfCrossAppDeviceKeyCallback = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
                            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof TdfCrossAppDeviceKeyCallback)) {
                                tdfCrossAppDeviceKeyCallback = (TdfCrossAppDeviceKeyCallback) queryLocalInterface2;
                            } else {
                                ?? obj2 = new Object();
                                int A034 = C0f9.A03(-1816182754);
                                obj2.A00 = readStrongBinder2;
                                C0f9.A0A(-1369539470, A034);
                                tdfCrossAppDeviceKeyCallback = obj2;
                            }
                        }
                        BZP(tdfCrossAppDeviceKeyCallback);
                    }
                    parcel2.writeNoException();
                    i3 = -1748581730;
                    C0f9.A0A(i3, A032);
                    return true;
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    readStrongBinder3.queryLocalInterface("com.trusteddevice.TdfCrossAppRegistrationCallback");
                    ExternalProvider externalProvider = ExternalProviders.A07;
                    externalProvider.A07().A00(6, 22, 161864556, 0L, externalProvider.A07().A00(6, 21, 651056728, 0L, 0));
                }
                A03 = C0f9.A03(1577274277);
                i4 = 1317880184;
                C0f9.A0A(i4, A03);
                parcel2.writeNoException();
                i3 = -1748581730;
                C0f9.A0A(i3, A032);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.trusteddevice.TrustedDeviceFoundationService");
                i3 = -1989194703;
                C0f9.A0A(i3, A032);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(160569117, A032);
        return onTransact;
    }
}
