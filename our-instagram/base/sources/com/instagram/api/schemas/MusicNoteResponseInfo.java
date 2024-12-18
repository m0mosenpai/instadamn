package com.instagram.api.schemas;

import X.AbstractC40098HqQ;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes3.dex */
public final class MusicNoteResponseInfo extends C0T6 implements Parcelable, MusicNoteResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new C206159Ax(61);
    public final MusicInfo A00;
    public final User A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final String A05;

    public MusicNoteResponseInfo(MusicInfo musicInfo, User user, Boolean bool, Boolean bool2, Integer num, String str) {
        C14360o3.A0B(musicInfo, 3);
        this.A02 = bool;
        this.A03 = bool2;
        this.A00 = musicInfo;
        this.A04 = num;
        this.A01 = user;
        this.A05 = str;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final MusicNoteResponseInfo Ex2(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicNoteResponseInfo) {
                MusicNoteResponseInfo musicNoteResponseInfo = (MusicNoteResponseInfo) obj;
                if (!C14360o3.A0K(this.A02, musicNoteResponseInfo.A02) || !C14360o3.A0K(this.A03, musicNoteResponseInfo.A03) || !C14360o3.A0K(this.A00, musicNoteResponseInfo.A00) || !C14360o3.A0K(this.A04, musicNoteResponseInfo.A04) || !C14360o3.A0K(this.A01, musicNoteResponseInfo.A01) || !C14360o3.A0K(this.A05, musicNoteResponseInfo.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A02;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A03;
        int hashCode2 = (((hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.A00.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        User user = this.A01;
        int hashCode4 = (hashCode3 + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.A05;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A03;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        Integer num = this.A04;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final MusicInfo BVc() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final Integer BY2() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final User BZk() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final String Bsf() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final Boolean Cby() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final Boolean Cdb() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.MusicNoteResponseInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMusicNoteResponseInfo", AbstractC40098HqQ.A00(this));
    }
}
