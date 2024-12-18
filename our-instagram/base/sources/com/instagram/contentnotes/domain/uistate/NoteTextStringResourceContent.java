package com.instagram.contentnotes.domain.uistate;

import X.AbstractC25235BEs;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class NoteTextStringResourceContent extends C0T6 implements NoteTextContent {
    public static final Parcelable.Creator CREATOR = new LNM(32);
    public final int A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NoteTextStringResourceContent) && this.A00 == ((NoteTextStringResourceContent) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("NoteTextStringResourceContent(textResourceId=", this.A00);
    }

    public NoteTextStringResourceContent(int i) {
        this.A00 = i;
    }
}
