package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40353Hux;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class StoryUnlockableStickerTappableObjectImpl extends C0T6 implements Parcelable, StoryUnlockableStickerTappableObject {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(38);
    public final String A00;
    public final String A01;
    public final List A02;

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final StoryUnlockableStickerTappableObjectImpl F2N() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryUnlockableStickerTappableObjectImpl) {
                StoryUnlockableStickerTappableObjectImpl storyUnlockableStickerTappableObjectImpl = (StoryUnlockableStickerTappableObjectImpl) obj;
                if (!C14360o3.A0K(this.A02, storyUnlockableStickerTappableObjectImpl.A02) || !C14360o3.A0K(this.A00, storyUnlockableStickerTappableObjectImpl.A00) || !C14360o3.A0K(this.A01, storyUnlockableStickerTappableObjectImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final List C0p() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryUnlockableStickerTappableObject", AbstractC40353Hux.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final String getSubtitle() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryUnlockableStickerTappableObject
    public final String getTitle() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public StoryUnlockableStickerTappableObjectImpl(String str, String str2, List list) {
        this.A02 = list;
        this.A00 = str;
        this.A01 = str2;
    }
}
