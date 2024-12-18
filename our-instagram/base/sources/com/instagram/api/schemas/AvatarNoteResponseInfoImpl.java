package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC39763HkZ;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class AvatarNoteResponseInfoImpl extends C0T6 implements Parcelable, AvatarNoteResponseInfo {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(66);
    public final MediaType A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final AvatarNoteResponseInfoImpl Er8() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarNoteResponseInfoImpl) {
                AvatarNoteResponseInfoImpl avatarNoteResponseInfoImpl = (AvatarNoteResponseInfoImpl) obj;
                if (this.A00 != avatarNoteResponseInfoImpl.A00 || !C14360o3.A0K(this.A01, avatarNoteResponseInfoImpl.A01) || !C14360o3.A0K(this.A02, avatarNoteResponseInfoImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final MediaType Aef() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final String Aeg() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final String Amg() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.AvatarNoteResponseInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAvatarNoteResponseInfo", AbstractC39763HkZ.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A02);
    }

    public AvatarNoteResponseInfoImpl(MediaType mediaType, String str, String str2) {
        AbstractC167017dG.A1P(mediaType, str);
        this.A00 = mediaType;
        this.A01 = str;
        this.A02 = str2;
    }
}
