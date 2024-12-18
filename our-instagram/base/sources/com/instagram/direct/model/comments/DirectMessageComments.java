package com.instagram.direct.model.comments;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class DirectMessageComments extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(80);
    public int A00 = 0;
    public String A01 = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMessageComments) {
                DirectMessageComments directMessageComments = (DirectMessageComments) obj;
                if (this.A00 != directMessageComments.A00 || !C14360o3.A0K(this.A01, directMessageComments.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }
}
