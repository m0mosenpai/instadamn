package com.instagram.barcelona.creation.phototag.model;

import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.barcelona.search.model.ResultUserInfo;

/* loaded from: classes11.dex */
public final class UserTag extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(12);
    public final float A00;
    public final float A01;
    public final ResultUserInfo A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UserTag) && C14360o3.A0K(this.A02.A00, ((UserTag) obj).A02.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public UserTag(ResultUserInfo resultUserInfo, String str, String str2, float f, float f2) {
        AbstractC167027dH.A13(str, str2, resultUserInfo);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = resultUserInfo;
        this.A00 = f;
        this.A01 = f2;
    }
}
