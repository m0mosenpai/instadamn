package com.instagram.contentnotes.data.immersive.params;

import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class ContentNotesImmersiveMimicryParams extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(26);
    public final int A00;
    public final ContentNotesCoordinates A01;
    public final boolean A02;

    public ContentNotesImmersiveMimicryParams(ContentNotesCoordinates contentNotesCoordinates, int i, boolean z) {
        C14360o3.A0B(contentNotesCoordinates, 2);
        this.A02 = z;
        this.A01 = contentNotesCoordinates;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
