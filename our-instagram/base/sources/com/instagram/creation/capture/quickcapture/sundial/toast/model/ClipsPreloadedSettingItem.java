package com.instagram.creation.capture.quickcapture.sundial.toast.model;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C14360o3;
import X.EnumC185548Kw;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes4.dex */
public final class ClipsPreloadedSettingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(62);
    public Boolean A00;
    public String A01;
    public String A02;
    public final EnumC185548Kw A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;

    public ClipsPreloadedSettingItem(EnumC185548Kw enumC185548Kw, ImageUrl imageUrl, String str, String str2) {
        AbstractC167027dH.A0a(1, str, str2, imageUrl, enumC185548Kw);
        this.A06 = str;
        this.A05 = str2;
        this.A04 = imageUrl;
        this.A03 = enumC185548Kw;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A04, i);
        AbstractC166997dE.A1I(parcel, this.A03);
    }
}
