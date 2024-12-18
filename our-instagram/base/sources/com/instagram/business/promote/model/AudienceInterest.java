package com.instagram.business.promote.model;

import X.AbstractC167017dG;
import X.C00O;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes11.dex */
public final class AudienceInterest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(47);
    public String A00;
    public String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
                AudienceInterest audienceInterest = (AudienceInterest) obj;
                if (!C14360o3.A0K(A00(), audienceInterest.A00()) || !C14360o3.A0K(A01(), audienceInterest.A01())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(A00());
        parcel.writeString(A01());
    }

    public final String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        throw C00O.createAndThrow();
    }

    public final String A01() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        throw C00O.createAndThrow();
    }

    public final int hashCode() {
        return A00().hashCode();
    }
}
