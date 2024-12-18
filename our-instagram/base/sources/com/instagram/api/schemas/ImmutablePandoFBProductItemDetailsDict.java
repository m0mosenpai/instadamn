package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.C41166IKf;
import android.os.Parcel;
import com.instagram.model.shopping.productcheckoutproperties.ImmutablePandoProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;

/* loaded from: classes7.dex */
public final class ImmutablePandoFBProductItemDetailsDict extends C17T implements FBProductItemDetailsDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(66);

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final /* synthetic */ C41166IKf AKJ() {
        return new C41166IKf(this);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final ProductCheckoutPropertiesIntf AnN() {
        return (ProductCheckoutPropertiesIntf) A05(2021764556, ImmutablePandoProductCheckoutProperties.class);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final ProductImageContainer BPX() {
        return (ProductImageContainer) A05(798171989, ImmutablePandoProductImageContainer.class);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final ProductImageContainer C85() {
        return (ProductImageContainer) A05(2074606664, ImmutablePandoProductImageContainer.class);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final Boolean BCz() {
        return getOptionalBooleanValueByHashCode(-971305057);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String BNr() {
        return A0i(-1088955442);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String BNs() {
        return A0i(571176008);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String Baz() {
        return A0j(-803548981);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String Bb3() {
        return A0i(883692091);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String Bb5() {
        return A0i(-1687498684);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String BhE() {
        return A0i(1014375387);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String C2g() {
        return A0i(-1284445987);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String C2h() {
        return A0i(215918617);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final FBProductItemDetailsDictImpl EtM() {
        ProductCheckoutProperties productCheckoutProperties;
        ProductImageContainerImpl productImageContainerImpl;
        ProductCheckoutPropertiesIntf AnN = AnN();
        ProductImageContainerImpl productImageContainerImpl2 = null;
        if (AnN != null) {
            productCheckoutProperties = AnN.F69();
        } else {
            productCheckoutProperties = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-971305057);
        String A0i = A0i(-1088955442);
        String A0i2 = A0i(571176008);
        ProductImageContainer BPX = BPX();
        if (BPX != null) {
            productImageContainerImpl = BPX.F6D();
        } else {
            productImageContainerImpl = null;
        }
        String A0j = A0j(-803548981);
        String A0i3 = A0i(883692091);
        String A0i4 = A0i(-1687498684);
        String A0j2 = A0j(1753008747);
        String A0i5 = A0i(1014375387);
        String A0i6 = A0i(-1284445987);
        String A0i7 = A0i(215918617);
        ProductImageContainer C85 = C85();
        if (C85 != null) {
            productImageContainerImpl2 = C85.F6D();
        }
        return new FBProductItemDetailsDictImpl(productCheckoutProperties, productImageContainerImpl, productImageContainerImpl2, optionalBooleanValueByHashCode, A0i, A0i2, A0j, A0i3, A0i4, A0j2, A0i5, A0i6, A0i7);
    }

    @Override // com.instagram.api.schemas.FBProductItemDetailsDict
    public final String getProductId() {
        return A0j(1753008747);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
