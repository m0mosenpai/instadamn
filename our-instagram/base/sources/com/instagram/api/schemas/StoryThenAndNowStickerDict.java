package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40342Hum;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class StoryThenAndNowStickerDict extends C0T6 implements Parcelable, StoryThenAndNowStickerDictIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(33);
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final StoryThenAndNowStickerDict F2F() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryThenAndNowStickerDict) {
                StoryThenAndNowStickerDict storyThenAndNowStickerDict = (StoryThenAndNowStickerDict) obj;
                if (!C14360o3.A0K(this.A01, storyThenAndNowStickerDict.A01) || !C14360o3.A0K(this.A02, storyThenAndNowStickerDict.A02) || !C14360o3.A0K(this.A03, storyThenAndNowStickerDict.A03) || !C14360o3.A0K(this.A00, storyThenAndNowStickerDict.A00)) {
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
        parcel.writeString(this.A03);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final String AaS() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final String Aft() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final Boolean CQX() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryThenAndNowStickerDict", AbstractC40342Hum.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryThenAndNowStickerDictIntf
    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public StoryThenAndNowStickerDict(Boolean bool, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = bool;
    }
}
