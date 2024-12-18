package com.instagram.direct.inbox.notes.reply;

import X.AbstractC31179DnN;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.TrackData;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class MusicNoteQuickReplySheetContent extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(10);
    public final int A00;
    public final int A01;
    public final TrackData A02;
    public final User A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final boolean A07;

    public MusicNoteQuickReplySheetContent(TrackData trackData, User user, Boolean bool, Boolean bool2, String str, int i, int i2, boolean z) {
        C14360o3.A0B(trackData, 5);
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str;
        this.A07 = z;
        this.A02 = trackData;
        this.A03 = user;
        this.A04 = bool;
        this.A05 = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        AbstractC31179DnN.A0p(parcel, this.A04);
        AbstractC31179DnN.A0p(parcel, this.A05);
    }
}
