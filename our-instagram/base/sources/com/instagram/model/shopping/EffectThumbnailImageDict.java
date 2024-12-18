package com.instagram.model.shopping;

import X.AbstractC06930Yk;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class EffectThumbnailImageDict extends C0T6 implements Parcelable, EffectThumbnailImageDictIntf {
    public static final Parcelable.Creator CREATOR = new C9Ay(31);
    public final ImageUrl A00;

    @Override // com.instagram.model.shopping.EffectThumbnailImageDictIntf
    public final EffectThumbnailImageDict F5t() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof EffectThumbnailImageDict) && C14360o3.A0K(this.A00, ((EffectThumbnailImageDict) obj).A00));
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            return 0;
        }
        return imageUrl.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.model.shopping.EffectThumbnailImageDictIntf
    public final ImageUrl CDO() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.EffectThumbnailImageDictIntf
    public final TreeUpdaterJNI F7o() {
        String str;
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (CDO() != null) {
            ImageUrl CDO = CDO();
            if (CDO != null) {
                str = CDO.getUrl();
            } else {
                str = null;
            }
            linkedHashMap.put("uri", str);
        }
        return new TreeUpdaterJNI("XDTEffectThumbnailImageDict", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public EffectThumbnailImageDict(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
