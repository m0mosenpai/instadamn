package com.instagram.business.promote.model;

import X.C00O;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes11.dex */
public final class PromoteButtonAction implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(64);
    public PromoteButtonActionType A00;
    public String A01;
    public String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        String str2 = this.A01;
        if (str2 != null) {
            parcel.writeString(str2);
            String str3 = this.A02;
            if (str3 != null) {
                parcel.writeString(str3);
                PromoteButtonActionType promoteButtonActionType = this.A00;
                if (promoteButtonActionType != null) {
                    parcel.writeParcelable(promoteButtonActionType, i);
                    return;
                }
                str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
            } else {
                str = "link";
            }
        } else {
            str = "displayText";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
