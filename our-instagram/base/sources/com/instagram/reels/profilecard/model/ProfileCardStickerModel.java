package com.instagram.reels.profilecard.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* loaded from: classes4.dex */
public final class ProfileCardStickerModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(30);
    public final MusicOverlayStickerModel A00;
    public final String A01;
    public final String A02;

    public ProfileCardStickerModel(MusicOverlayStickerModel musicOverlayStickerModel, String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = musicOverlayStickerModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileCardStickerModel) {
                ProfileCardStickerModel profileCardStickerModel = (ProfileCardStickerModel) obj;
                if (!C14360o3.A0K(this.A01, profileCardStickerModel.A01) || !C14360o3.A0K(this.A02, profileCardStickerModel.A02) || !C14360o3.A0K(this.A00, profileCardStickerModel.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
