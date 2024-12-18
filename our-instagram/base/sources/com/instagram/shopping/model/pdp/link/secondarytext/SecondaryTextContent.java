package com.instagram.shopping.model.pdp.link.secondarytext;

import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes7.dex */
public final class SecondaryTextContent implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(83);
    public String A00 = "";
    public List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }
}
