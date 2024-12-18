package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class StoryProductItemStickerTappableData extends C0T6 implements Parcelable, StoryProductItemStickerTappableDataIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(21);
    public final ProductItemStickerBundleStyle A00;

    @Override // com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf
    public final StoryProductItemStickerTappableData F1E() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof StoryProductItemStickerTappableData) && this.A00 == ((StoryProductItemStickerTappableData) obj).A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf
    public final ProductItemStickerBundleStyle BF5() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public StoryProductItemStickerTappableData(ProductItemStickerBundleStyle productItemStickerBundleStyle) {
        this.A00 = productItemStickerBundleStyle;
    }

    @Override // com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        String str;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (BF5() != null) {
            ProductItemStickerBundleStyle BF5 = BF5();
            if (BF5 != null) {
                str = BF5.A00;
            } else {
                str = null;
            }
            AbstractC37300Gc1.A12(str, A0X);
        }
        return AbstractC37300Gc1.A05("XDTStoryProductItemStickerTappableData", AbstractC06930Yk.A0B(A0X));
    }
}
