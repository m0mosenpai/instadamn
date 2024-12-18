package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoShoppingBrandWithProducts extends C17T implements ShoppingBrandWithProducts {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(78);

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final User CDj() {
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'user' field.");
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final String ArN() {
        return A0h(1116609854);
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final List BhO() {
        return A0o(-1571931561, ImmutablePandoProductWithMediaImage.class);
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final List BhR() {
        return A08(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
    }

    @Override // com.instagram.api.schemas.ShoppingBrandWithProducts
    public final ShoppingBrandWithProductsImpl EzU(C1DY c1dy) {
        ArrayList arrayList;
        ProductDetailsSellerBadgeContentImpl productDetailsSellerBadgeContentImpl;
        String A0h = A0h(1116609854);
        List BhO = BhO();
        ArrayList A0i = AbstractC167007dF.A0i(BhO);
        Iterator it = BhO.iterator();
        while (it.hasNext()) {
            A0i.add(((ProductWithMediaImage) it.next()).Eyb(c1dy));
        }
        List BhR = BhR();
        ShoppingBrandWithProductsSubtitle shoppingBrandWithProductsSubtitle = null;
        if (BhR != null) {
            arrayList = AbstractC167007dF.A0i(BhR);
            Iterator it2 = BhR.iterator();
            while (it2.hasNext()) {
                AbstractC37304Gc5.A1D(c1dy, arrayList, it2);
            }
        } else {
            arrayList = null;
        }
        ProductDetailsSellerBadgeContent productDetailsSellerBadgeContent = (ProductDetailsSellerBadgeContent) A05(15626979, ImmutablePandoProductDetailsSellerBadgeContent.class);
        if (productDetailsSellerBadgeContent != null) {
            productDetailsSellerBadgeContentImpl = productDetailsSellerBadgeContent.EyL();
        } else {
            productDetailsSellerBadgeContentImpl = null;
        }
        ShoppingBrandWithProductsSubtitleIntf shoppingBrandWithProductsSubtitleIntf = (ShoppingBrandWithProductsSubtitleIntf) A05(-2060497896, ImmutablePandoShoppingBrandWithProductsSubtitle.class);
        if (shoppingBrandWithProductsSubtitleIntf != null) {
            shoppingBrandWithProductsSubtitle = shoppingBrandWithProductsSubtitleIntf.EzV();
        }
        return new ShoppingBrandWithProductsImpl(productDetailsSellerBadgeContentImpl, shoppingBrandWithProductsSubtitle, (User) AbstractC37303Gc4.A07(c1dy, this, 3599307), A0h, A0i, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
