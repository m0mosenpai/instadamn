package com.facebook.wearable.applinks;

import X.C63472SlD;
import android.os.Parcelable;
import com.oculus.applinks.LinkAppRegisterResponse;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class AppLinkRegisterResponse extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(AppLinkRegisterResponse.class);

    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkRegisterResponse(LinkAppRegisterResponse linkAppRegisterResponse) {
        this.serviceUUID = linkAppRegisterResponse.serviceUUID_.A05();
    }

    public AppLinkRegisterResponse() {
    }
}
