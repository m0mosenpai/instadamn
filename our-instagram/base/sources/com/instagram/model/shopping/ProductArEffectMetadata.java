package com.instagram.model.shopping;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.I3E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ProductArEffectMetadata extends C0T6 implements Parcelable, ProductArEffectMetadataIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(10);
    public final ContainerEffectEnum A00;
    public final DynamicEffectState A01;
    public final EffectThumbnailImageDict A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final ProductArEffectMetadata F5u() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductArEffectMetadata) {
                ProductArEffectMetadata productArEffectMetadata = (ProductArEffectMetadata) obj;
                if (this.A00 != productArEffectMetadata.A00 || this.A01 != productArEffectMetadata.A01 || !C14360o3.A0K(this.A03, productArEffectMetadata.A03) || !C14360o3.A0K(this.A05, productArEffectMetadata.A05) || !C14360o3.A0K(this.A04, productArEffectMetadata.A04) || !C14360o3.A0K(this.A02, productArEffectMetadata.A02)) {
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
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        HashMap hashMap = this.A05;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                parcel.writeString((String) AbstractC167027dH.A0O(parcel, A14));
            }
        }
        parcel.writeString(this.A04);
        EffectThumbnailImageDict effectThumbnailImageDict = this.A02;
        if (effectThumbnailImageDict == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectThumbnailImageDict.writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final ContainerEffectEnum Aqh() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final DynamicEffectState B00() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final /* bridge */ /* synthetic */ Map B0W() {
        return this.A05;
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final String B0X() {
        return this.A04;
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final /* bridge */ /* synthetic */ EffectThumbnailImageDictIntf B0g() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProductAREffectMetadataDict", I3E.A00(this));
    }

    @Override // com.instagram.model.shopping.ProductArEffectMetadataIntf
    public final String getEffectId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public ProductArEffectMetadata(ContainerEffectEnum containerEffectEnum, DynamicEffectState dynamicEffectState, EffectThumbnailImageDict effectThumbnailImageDict, String str, String str2, HashMap hashMap) {
        this.A00 = containerEffectEnum;
        this.A01 = dynamicEffectState;
        this.A03 = str;
        this.A05 = hashMap;
        this.A04 = str2;
        this.A02 = effectThumbnailImageDict;
    }
}
