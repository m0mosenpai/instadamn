package com.facebook.ui.emoji.model;

import X.AbstractC25226BEj;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class DrawableBackedEmoji extends Emoji {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(70);
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableBackedEmoji)) {
            return false;
        }
        DrawableBackedEmoji drawableBackedEmoji = (DrawableBackedEmoji) obj;
        return this.A00 == drawableBackedEmoji.A00 && this.A01.equals(drawableBackedEmoji.A01);
    }

    @Override // com.facebook.ui.emoji.model.Emoji
    public final String A03() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, this.A00 * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public DrawableBackedEmoji(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }
}
