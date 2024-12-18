package com.instagram.direct.inbox.clipsinteractionreply;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class ClipsInteractionReplySheetContent extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(7);
    public final SocialContextType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
    }

    public ClipsInteractionReplySheetContent(SocialContextType socialContextType, ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5) {
        AbstractC167027dH.A13(str, str2, str3);
        AbstractC167007dF.A1H(socialContextType, 5, str5);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A00 = socialContextType;
        this.A01 = imageUrl;
        this.A06 = str5;
    }
}
