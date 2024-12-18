package com.instagram.profile.analytics;

import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class ProfileSession extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(54);
    public final String A00;
    public final String A01;
    public final String A02;

    public ProfileSession(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileSession) {
                ProfileSession profileSession = (ProfileSession) obj;
                if (!C14360o3.A0K(this.A01, profileSession.A01) || !C14360o3.A0K(this.A02, profileSession.A02) || !C14360o3.A0K(this.A00, profileSession.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
