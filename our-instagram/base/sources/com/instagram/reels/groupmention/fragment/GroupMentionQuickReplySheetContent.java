package com.instagram.reels.groupmention.fragment;

import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class GroupMentionQuickReplySheetContent extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(26);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public GroupMentionQuickReplySheetContent(ImageUrl imageUrl, String str, String str2) {
        AbstractC167027dH.A13(str, str2, imageUrl);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = imageUrl;
    }
}
