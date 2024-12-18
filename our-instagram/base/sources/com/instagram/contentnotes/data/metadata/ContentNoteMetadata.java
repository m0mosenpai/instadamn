package com.instagram.contentnotes.data.metadata;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class ContentNoteMetadata extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(27);
    public final ImageUrl A00;
    public final User A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public ContentNoteMetadata(ImageUrl imageUrl, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AbstractC167007dF.A1F(str, 1, str4);
        C14360o3.A0B(user, 10);
        this.A08 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A0A = str6;
        this.A03 = num;
        this.A05 = str7;
        this.A02 = num2;
        this.A01 = user;
        this.A00 = imageUrl;
        this.A0B = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        parcel.writeString(this.A05);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A0B ? 1 : 0);
    }
}
