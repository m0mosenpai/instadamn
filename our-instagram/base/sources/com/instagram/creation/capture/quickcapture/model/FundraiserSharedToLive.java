package com.instagram.creation.capture.quickcapture.model;

import X.AbstractC38851rI;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes4.dex */
public class FundraiserSharedToLive implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(55);
    public User A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        try {
            User user = this.A00;
            user.getClass();
            Parcelable.Creator creator = User.CREATOR;
            str = AbstractC38851rI.A07(user);
        } catch (IOException unused) {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public FundraiserSharedToLive(Parcel parcel) {
        User A04;
        String readString = parcel.readString();
        if (readString == null) {
            A04 = null;
        } else {
            try {
                Parcelable.Creator creator = User.CREATOR;
                A04 = AbstractC38851rI.A04(readString);
            } catch (IOException unused) {
                this.A00 = null;
            }
        }
        this.A00 = A04;
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public FundraiserSharedToLive(User user, String str, String str2, String str3, String str4) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
