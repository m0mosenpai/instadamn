package com.instagram.contentnotes.data.immersive.params;

import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class ContentNotesImmersiveCreationUiState extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(25);
    public final ContentNotesImmersiveMimicryParams A00;
    public final String A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams = this.A00;
        if (contentNotesImmersiveMimicryParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentNotesImmersiveMimicryParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }

    public ContentNotesImmersiveCreationUiState(ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams, String str, boolean z) {
        this.A02 = z;
        this.A00 = contentNotesImmersiveMimicryParams;
        this.A01 = str;
    }
}
