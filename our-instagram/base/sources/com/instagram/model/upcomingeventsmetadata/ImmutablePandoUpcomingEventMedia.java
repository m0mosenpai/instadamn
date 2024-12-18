package com.instagram.model.upcomingeventsmetadata;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C39305HXw;
import X.I4R;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoUpcomingEventMedia extends C17T implements UpcomingEventMedia {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(78);

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final ProductImageContainer BGV() {
        return (ProductImageContainer) A05(100313435, ImmutablePandoProductImageContainer.class);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final ImageInfo BGx() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final List CFe() {
        return A08(713258463, ImmutablePandoVideoVersion.class);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4R.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final String AXw() {
        return A0i(-363605003);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final Boolean B3N() {
        return getOptionalBooleanValueByHashCode(-1305025969);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final Boolean BB7() {
        return getOptionalBooleanValueByHashCode(53851633);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final Double CF5() {
        return getOptionalDoubleValueByHashCode(706299096);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final UpcomingEventMediaImpl F6f() {
        ProductImageContainerImpl productImageContainerImpl;
        ImageInfoImpl imageInfoImpl;
        String A0i = A0i(-363605003);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1305025969);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(53851633);
        String A0e = A0e();
        ProductImageContainer BGV = BGV();
        ArrayList arrayList = null;
        if (BGV != null) {
            productImageContainerImpl = BGV.F6D();
        } else {
            productImageContainerImpl = null;
        }
        ImageInfo BGx = BGx();
        if (BGx != null) {
            imageInfoImpl = BGx.F5B();
        } else {
            imageInfoImpl = null;
        }
        String A0i2 = A0i(1014577290);
        Double optionalDoubleValueByHashCode = getOptionalDoubleValueByHashCode(706299096);
        List CFe = CFe();
        if (CFe != null) {
            arrayList = AbstractC167017dG.A0q(CFe);
            Iterator it = CFe.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1Y(arrayList, it);
            }
        }
        return new UpcomingEventMediaImpl(imageInfoImpl, productImageContainerImpl, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalDoubleValueByHashCode, A0i, A0e, A0i2, arrayList);
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia
    public final String getProductType() {
        return A0i(1014577290);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
