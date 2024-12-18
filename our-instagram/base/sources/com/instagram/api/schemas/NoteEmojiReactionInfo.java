package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40109Hqc;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class NoteEmojiReactionInfo extends C0T6 implements Parcelable, NoteEmojiReactionInfoIntf {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(17);
    public final NoteReactionType A00;
    public final User A01;
    public final Boolean A02;
    public final String A03;

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteEmojiReactionInfo ExK(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteEmojiReactionInfo ExL(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoteEmojiReactionInfo) {
                NoteEmojiReactionInfo noteEmojiReactionInfo = (NoteEmojiReactionInfo) obj;
                if (!C14360o3.A0K(this.A03, noteEmojiReactionInfo.A03) || !C14360o3.A0K(this.A02, noteEmojiReactionInfo.A02) || this.A00 != noteEmojiReactionInfo.A00 || !C14360o3.A0K(this.A01, noteEmojiReactionInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A02) ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteReactionType Bkj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final User CDj() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final Boolean Cf9() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTNoteEmojiReactionInfo", AbstractC40109Hqc.A00(this));
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final String getEmoji() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public NoteEmojiReactionInfo(NoteReactionType noteReactionType, User user, Boolean bool, String str) {
        this.A03 = str;
        this.A02 = bool;
        this.A00 = noteReactionType;
        this.A01 = user;
    }

    @Override // com.instagram.api.schemas.NoteEmojiReactionInfoIntf
    public final NoteEmojiReactionInfoIntf E9S(C1DY c1dy) {
        return this;
    }
}
