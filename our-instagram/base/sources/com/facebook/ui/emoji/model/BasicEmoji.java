package com.facebook.ui.emoji.model;

import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class BasicEmoji extends Emoji {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(69);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BasicEmoji) && this.A00.equals(((BasicEmoji) obj).A00));
    }

    @Override // com.facebook.ui.emoji.model.Emoji
    public final String A03() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    public BasicEmoji(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public BasicEmoji(String str) {
        this.A00 = str;
    }
}
