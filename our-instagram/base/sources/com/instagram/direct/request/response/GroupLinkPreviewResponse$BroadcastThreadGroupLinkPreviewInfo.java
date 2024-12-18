package com.instagram.direct.request.response;

import X.AbstractC167027dH;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(37);
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final boolean A03;
    public final String A04;
    public final boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo(ImageUrl imageUrl, String str, String str2, int i, boolean z, boolean z2) {
        AbstractC167027dH.A13(str, str2, imageUrl);
        this.A02 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A05 = z;
        this.A03 = z2;
        this.A00 = i;
    }
}
