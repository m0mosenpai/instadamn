package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC40351Huv;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class StoryUnlockableStickerDataImpl extends C0T6 implements Parcelable, StoryUnlockableStickerData {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(37);
    public final ImageURIDict A00;
    public final UnlockableStickerStatus A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final StoryUnlockableStickerDataImpl F2M() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryUnlockableStickerDataImpl) {
                StoryUnlockableStickerDataImpl storyUnlockableStickerDataImpl = (StoryUnlockableStickerDataImpl) obj;
                if (!C14360o3.A0K(this.A02, storyUnlockableStickerDataImpl.A02) || !C14360o3.A0K(this.A03, storyUnlockableStickerDataImpl.A03) || !C14360o3.A0K(this.A00, storyUnlockableStickerDataImpl.A00) || this.A01 != storyUnlockableStickerDataImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final ImageURIDict C83() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final UnlockableStickerStatus CCl() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryUnlockableStickerData", AbstractC40351Huv.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final String getId() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerData
    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public StoryUnlockableStickerDataImpl(ImageURIDict imageURIDict, UnlockableStickerStatus unlockableStickerStatus, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = imageURIDict;
        this.A01 = unlockableStickerStatus;
    }
}
