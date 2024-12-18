package com.instagram.model.shopping.productlaunchinformation;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC40743I3x;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ProductLaunchInformationImpl extends C0T6 implements Parcelable, ProductLaunchInformation {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(52);
    public final Boolean A00;
    public final Boolean A01;
    public final Long A02;
    public final String A03;

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final ProductLaunchInformationImpl F6E() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductLaunchInformationImpl) {
                ProductLaunchInformationImpl productLaunchInformationImpl = (ProductLaunchInformationImpl) obj;
                if (!C14360o3.A0K(this.A03, productLaunchInformationImpl.A03) || !C14360o3.A0K(this.A00, productLaunchInformationImpl.A00) || !C14360o3.A0K(this.A01, productLaunchInformationImpl.A01) || !C14360o3.A0K(this.A02, productLaunchInformationImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        AbstractC31179DnN.A0p(parcel, this.A00);
        AbstractC31179DnN.A0p(parcel, this.A01);
        AbstractC31179DnN.A0q(parcel, this.A02);
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final String AzZ() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final Boolean BBz() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final Long BMJ() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final Boolean CW6() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProductLaunchInformationDict", AbstractC40743I3x.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public ProductLaunchInformationImpl(Boolean bool, Boolean bool2, Long l, String str) {
        this.A03 = str;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = l;
    }
}
