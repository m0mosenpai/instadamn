package com.facebook.wearable.applinks;

import X.C63472SlD;
import android.os.Parcelable;
import com.oculus.applinks.LinkAppDeviceIdentityRequest;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class AppLinkDeviceIdentityRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(AppLinkDeviceIdentityRequest.class);

    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityRequest(LinkAppDeviceIdentityRequest linkAppDeviceIdentityRequest) {
        this.serviceUUID = linkAppDeviceIdentityRequest.serviceUUID_.A05();
    }

    public AppLinkDeviceIdentityRequest() {
    }
}
