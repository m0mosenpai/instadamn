package com.instagram.clips.model.metadata;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class PlaylistContext extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(52);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PlaylistContext) && C14360o3.A0K(this.A00, ((PlaylistContext) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public PlaylistContext(String str) {
        this.A00 = str;
    }

    public PlaylistContext() {
        this(null);
    }
}
