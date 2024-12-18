package com.instagram.contentnotes.domain.immersivereply;

import X.AbstractC167007dF;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class ContentNotesImmersiveReplyContent extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(29);
    public final NoteCustomTheme A00;
    public final ContentNotesCoordinates A01;
    public final ContentNoteMetadata A02;
    public final NoteAudience A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public ContentNotesImmersiveReplyContent(NoteCustomTheme noteCustomTheme, ContentNotesCoordinates contentNotesCoordinates, ContentNoteMetadata contentNoteMetadata, NoteAudience noteAudience, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(str, 1);
        AbstractC25234BEr.A1R(str2, str3, str4, str5, noteAudience);
        AbstractC167007dF.A1J(str6, 7, contentNoteMetadata);
        this.A0A = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A07 = str4;
        this.A05 = str5;
        this.A03 = noteAudience;
        this.A09 = str6;
        this.A0C = z;
        this.A02 = contentNoteMetadata;
        this.A0D = z2;
        this.A0E = z3;
        this.A04 = l;
        this.A01 = contentNotesCoordinates;
        this.A0G = z4;
        this.A0H = z5;
        this.A00 = noteCustomTheme;
        this.A0F = z6;
        this.A0B = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        Long l = this.A04;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A0F ? 1 : 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0B);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
    }
}
