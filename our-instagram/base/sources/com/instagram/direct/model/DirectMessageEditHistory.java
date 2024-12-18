package com.instagram.direct.model;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class DirectMessageEditHistory extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(78);
    public long A00;
    public String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMessageEditHistory) {
                DirectMessageEditHistory directMessageEditHistory = (DirectMessageEditHistory) obj;
                if (!C14360o3.A0K(this.A01, directMessageEditHistory.A01) || this.A00 != directMessageEditHistory.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        long j = this.A00;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
