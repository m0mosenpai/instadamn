package com.instagram.model.shopping;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.I3E;
import X.JDA;
import X.JDB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductArEffectMetadata extends C17T implements ProductArEffectMetadataIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(49);

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final Map B0W() {
        return null;
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final ContainerEffectEnum Aqh() {
        return (ContainerEffectEnum) A0N(31904362, JDA.A00);
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final DynamicEffectState B00() {
        return (DynamicEffectState) A0N(1993431139, JDB.A00);
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final EffectThumbnailImageDictIntf B0g() {
        return (EffectThumbnailImageDictIntf) A05(1217710490, ImmutablePandoEffectThumbnailImageDict.class);
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I3E.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final String B0X() {
        return A0i(469587505);
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final ProductArEffectMetadata F5u() {
        ContainerEffectEnum Aqh = Aqh();
        DynamicEffectState B00 = B00();
        String A0j = A0j(-1468661111);
        EffectThumbnailImageDict effectThumbnailImageDict = null;
        String A0i = A0i(469587505);
        EffectThumbnailImageDictIntf B0g = B0g();
        if (B0g != null) {
            effectThumbnailImageDict = B0g.F5t();
        }
        return new ProductArEffectMetadata(Aqh, B00, effectThumbnailImageDict, A0j, A0i, null);
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final String getEffectId() {
        return A0j(-1468661111);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
