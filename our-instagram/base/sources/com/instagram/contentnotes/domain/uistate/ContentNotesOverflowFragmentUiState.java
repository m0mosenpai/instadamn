package com.instagram.contentnotes.domain.uistate;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class ContentNotesOverflowFragmentUiState extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(30);
    public final String A00;
    public final List A01;

    public ContentNotesOverflowFragmentUiState(String str, List list) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentNotesOverflowFragmentUiState) {
                ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState = (ContentNotesOverflowFragmentUiState) obj;
                if (!C14360o3.A0K(this.A00, contentNotesOverflowFragmentUiState.A00) || !C14360o3.A0K(this.A01, contentNotesOverflowFragmentUiState.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            ((NotesPogThoughtBubbleUiState) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ContentNotesOverflowFragmentUiState(mediaId=");
        A1C.append(this.A00);
        A1C.append(", notes=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
