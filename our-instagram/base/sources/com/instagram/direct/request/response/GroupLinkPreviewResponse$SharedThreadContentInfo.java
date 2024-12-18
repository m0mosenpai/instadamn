package com.instagram.direct.request.response;

import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MessagingOffPlatformShareType;

/* loaded from: classes6.dex */
public final class GroupLinkPreviewResponse$SharedThreadContentInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(38);
    public final MessagingOffPlatformShareType A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public GroupLinkPreviewResponse$SharedThreadContentInfo(MessagingOffPlatformShareType messagingOffPlatformShareType, String str, String str2) {
        this.A00 = messagingOffPlatformShareType;
        this.A01 = str;
        this.A02 = str2;
    }
}
