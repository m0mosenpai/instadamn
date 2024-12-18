package com.instagram.discovery.api.model;

import X.C14360o3;
import X.C69110Vi0;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes11.dex */
public final class SectionPagination implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(51);
    public final String A00;
    public final String A01;
    public final List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A02);
        parcel.writeString(this.A01);
    }

    public SectionPagination(String str, String str2, List list) {
        this.A00 = str;
        this.A02 = list;
        this.A01 = str2;
    }

    public SectionPagination(C69110Vi0 c69110Vi0) {
        this(c69110Vi0.A00, c69110Vi0.A01, c69110Vi0.A02);
    }
}
