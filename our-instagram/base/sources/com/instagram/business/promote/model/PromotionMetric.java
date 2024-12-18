package com.instagram.business.promote.model;

import X.C00O;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PromotionMetric implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(82);
    public Integer A00;
    public String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        String str = this.A01;
        if (str != null) {
            parcel.writeString(str);
            parcel.writeValue(this.A00);
        } else {
            C14360o3.A0F("metricName");
            throw C00O.createAndThrow();
        }
    }
}
