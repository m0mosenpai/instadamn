package com.instagram.business.promote.model;

import X.C00O;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SelectedInterestRowItem implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(86);
    public AudienceInterest A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AudienceInterest audienceInterest = this.A00;
        if (audienceInterest != null) {
            parcel.writeParcelable(audienceInterest, i);
        } else {
            C14360o3.A0F("interest");
            throw C00O.createAndThrow();
        }
    }
}
