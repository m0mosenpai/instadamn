package com.instagram.model.keyword;

import X.C14360o3;
import X.C16930sl;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
public final class KeywordRecommendations implements Parcelable {
    public static final C55343Oh9 CREATOR = new C55343Oh9(87);
    public String A00;
    public String A01;
    public List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeTypedList(this.A02);
    }

    public KeywordRecommendations() {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 3);
        this.A00 = "";
        this.A01 = "";
        this.A02 = c16930sl;
    }
}
