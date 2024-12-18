package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class StoryMultiProductStickerLinkDataImpl extends C0T6 implements Parcelable, StoryMultiProductStickerLinkData {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(18);
    public final Integer A00;

    @Override // com.instagram.api.schemas.StoryMultiProductStickerLinkData
    public final StoryMultiProductStickerLinkDataImpl F0y() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StoryMultiProductStickerLinkDataImpl) && C14360o3.A0K(this.A00, ((StoryMultiProductStickerLinkDataImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
    }

    @Override // com.instagram.api.schemas.StoryMultiProductStickerLinkData
    public final Integer BNX() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public StoryMultiProductStickerLinkDataImpl(Integer num) {
        this.A00 = num;
    }

    @Override // com.instagram.api.schemas.StoryMultiProductStickerLinkData
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        Integer num = this.A00;
        if (num != null) {
            A0X.put("linkType", num);
        }
        return AbstractC37300Gc1.A05("XDTStoryMultiProductStickerLinkData", AbstractC06930Yk.A0B(A0X));
    }
}
