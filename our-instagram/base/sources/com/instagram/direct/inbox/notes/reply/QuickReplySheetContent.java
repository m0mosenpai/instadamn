package com.instagram.direct.inbox.notes.reply;

import X.AbstractC167007dF;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudience;

/* loaded from: classes8.dex */
public final class QuickReplySheetContent extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(11);
    public final long A00;
    public final GIFNoteResponseInfo A01;
    public final LocationNoteResponseInfo A02;
    public final NotePogImageDict A03;
    public final NotePogVideoDict A04;
    public final ImageUrl A05;
    public final ContentNoteMetadata A06;
    public final NoteAudience A07;
    public final MusicNoteQuickReplySheetContent A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final int A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0B);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0K);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        MusicNoteQuickReplySheetContent musicNoteQuickReplySheetContent = this.A08;
        if (musicNoteQuickReplySheetContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicNoteQuickReplySheetContent.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
    }

    public QuickReplySheetContent(GIFNoteResponseInfo gIFNoteResponseInfo, LocationNoteResponseInfo locationNoteResponseInfo, NotePogImageDict notePogImageDict, NotePogVideoDict notePogVideoDict, ImageUrl imageUrl, ContentNoteMetadata contentNoteMetadata, NoteAudience noteAudience, MusicNoteQuickReplySheetContent musicNoteQuickReplySheetContent, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AbstractC25234BEr.A1P(str, str2, str3);
        AbstractC167007dF.A1J(str4, 6, noteAudience);
        C14360o3.A0B(str5, 10);
        this.A0F = str;
        this.A0A = str2;
        this.A05 = imageUrl;
        this.A0B = str3;
        this.A00 = j;
        this.A09 = str4;
        this.A0L = z;
        this.A0K = i;
        this.A07 = noteAudience;
        this.A0E = str5;
        this.A0M = z2;
        this.A0P = z3;
        this.A0H = z4;
        this.A0J = z5;
        this.A0I = z6;
        this.A0D = str6;
        this.A0C = str7;
        this.A08 = musicNoteQuickReplySheetContent;
        this.A02 = locationNoteResponseInfo;
        this.A04 = notePogVideoDict;
        this.A03 = notePogImageDict;
        this.A01 = gIFNoteResponseInfo;
        this.A06 = contentNoteMetadata;
        this.A0O = z7;
        this.A0N = z8;
        this.A0G = z9;
    }
}
