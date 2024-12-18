package com.instagram.contentnotes.domain.uistate;

import X.AbstractC25235BEs;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class NoteTextStringLiteralContent extends C0T6 implements NoteTextContent {
    public static final Parcelable.Creator CREATOR = new LNM(31);
    public final String A00;

    public NoteTextStringLiteralContent(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NoteTextStringLiteralContent) && C14360o3.A0K(this.A00, ((NoteTextStringLiteralContent) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("NoteTextStringLiteralContent(text=", this.A00);
    }
}
