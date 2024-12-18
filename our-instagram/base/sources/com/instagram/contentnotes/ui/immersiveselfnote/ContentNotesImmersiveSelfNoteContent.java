package com.instagram.contentnotes.ui.immersiveselfnote;

import X.AbstractC167007dF;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* loaded from: classes5.dex */
public final class ContentNotesImmersiveSelfNoteContent extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(34);
    public final ContentNoteMetadata A00;
    public final NotesPogThoughtBubbleUiState A01;
    public final boolean A02;
    public final boolean A03;

    public ContentNotesImmersiveSelfNoteContent(ContentNoteMetadata contentNoteMetadata, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, boolean z, boolean z2) {
        AbstractC167007dF.A1F(contentNoteMetadata, 1, notesPogThoughtBubbleUiState);
        this.A00 = contentNoteMetadata;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = notesPogThoughtBubbleUiState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }
}
