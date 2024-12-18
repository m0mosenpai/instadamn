package com.facebook.wearable.applinks;

import X.C63472SlD;
import android.os.Parcelable;
import com.oculus.applinks.LinkAppRegisterRequest;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class AppLinkRegisterRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(AppLinkRegisterRequest.class);

    @SafeParcelable.Field(1)
    public byte[] appPublicKey;

    @SafeParcelable.Field(2)
    public int testAppNumber = 0;

    public AppLinkRegisterRequest(LinkAppRegisterRequest linkAppRegisterRequest) {
        this.appPublicKey = linkAppRegisterRequest.appPublicKey_.A05();
    }

    public AppLinkRegisterRequest() {
    }
}
