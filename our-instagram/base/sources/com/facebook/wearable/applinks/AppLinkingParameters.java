package com.facebook.wearable.applinks;

import X.C63472SlD;
import android.os.ParcelUuid;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class AppLinkingParameters extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(AppLinkingParameters.class);

    @SafeParcelable.Field(3)
    public byte[] devicePublicKey;

    @SafeParcelable.Field(2)
    public byte[] linkedAppPrivateKey;

    @SafeParcelable.Field(1)
    public ParcelUuid serviceUUID;

    public AppLinkingParameters(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
        this.serviceUUID = parcelUuid;
        this.linkedAppPrivateKey = bArr;
        this.devicePublicKey = bArr2;
    }

    public AppLinkingParameters() {
    }
}
