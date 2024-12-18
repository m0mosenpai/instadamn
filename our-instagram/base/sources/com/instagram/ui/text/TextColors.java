package com.instagram.ui.text;

import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class TextColors implements Parcelable {
    public static final TextColors A02;
    public static final TextColors A03;
    public static final Parcelable.Creator CREATOR;
    public int A00;
    public TextShadow A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }

    static {
        TextShadow textShadow = TextShadow.A03;
        A02 = new TextColors(textShadow, -1);
        A03 = new TextColors(textShadow, Integer.MAX_VALUE);
        CREATOR = new C9Ay(64);
    }

    public TextColors(TextShadow textShadow, int i) {
        this.A00 = i;
        this.A01 = textShadow;
    }

    public TextColors() {
    }
}
