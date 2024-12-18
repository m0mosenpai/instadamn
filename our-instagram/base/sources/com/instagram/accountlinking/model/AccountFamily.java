package com.instagram.accountlinking.model;

import X.C206149Aw;
import X.EnumC2050795x;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes4.dex */
public final class AccountFamily implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(37);
    public EnumC2050795x A00;
    public User A01;
    public String A02;
    public List A03;
    public List A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A00);
        parcel.writeTypedList(this.A04);
        parcel.writeTypedList(this.A03);
    }
}
