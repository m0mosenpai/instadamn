package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39307HXy;
import X.JBW;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoStoryProductItemStickerTappableData extends C17T implements StoryProductItemStickerTappableDataIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(87);

    @Override // com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf
    public final ProductItemStickerBundleStyle BF5() {
        return (ProductItemStickerBundleStyle) A0N(3355, JBW.A00);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.StoryProductItemStickerTappableDataIntf
    public final StoryProductItemStickerTappableData F1E() {
        return new StoryProductItemStickerTappableData(BF5());
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
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
