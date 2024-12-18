package com.instagram.model.rtc;

import X.AbstractC25235BEs;
import X.AbstractC43593JPy;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class RtcCallKey extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(0);
    public final String A00;

    public RtcCallKey(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.model.rtc.RtcCallKey");
        return C14360o3.A0K(this.A00, ((RtcCallKey) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("RtcCallKey(serverInfoData=", this.A00);
    }
}
