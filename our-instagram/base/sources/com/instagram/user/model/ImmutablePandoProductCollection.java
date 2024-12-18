package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.IA9;
import X.JE8;
import X.JE9;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionCover;
import com.instagram.model.shopping.productcollection.ImmutablePandoProductCollectionDropsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductCollection extends C17T implements ProductCollection {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(92);
    public List A00;

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionReviewStatus ApC() {
        return (ProductCollectionReviewStatus) A0N(1212741336, JE8.A00);
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionV2Type ApF() {
        return (ProductCollectionV2Type) A0N(1060506683, JE9.A00);
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionCover AsD() {
        return (ProductCollectionCover) A05(94852023, ImmutablePandoProductCollectionCover.class);
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionDropsMetadata Azb() {
        return (ProductCollectionDropsMetadata) A05(-309579179, ImmutablePandoProductCollectionDropsMetadata.class);
    }

    @Override // com.instagram.user.model.ProductCollection
    public final List CEC() {
        return this.A00;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollection ECD(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(111578632, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionImpl F7R(C1DV c1dv) {
        if (c1dv == null) {
            c1dv = AbstractC37301Gc2.A08();
        }
        return F7Q(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.user.model.ProductCollection
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, IA9.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String Ap3() {
        return A0i(-821242276);
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String BSZ() {
        return A0i(574223090);
    }

    @Override // com.instagram.user.model.ProductCollection
    public final ProductCollectionImpl F7Q(C1DY c1dy) {
        ProductCollectionCoverImpl productCollectionCoverImpl;
        ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl;
        String A0i = A0i(-821242276);
        ProductCollectionReviewStatus ApC = ApC();
        ProductCollectionV2Type ApF = ApF();
        ProductCollectionCover AsD = AsD();
        ArrayList arrayList = null;
        if (AsD != null) {
            productCollectionCoverImpl = AsD.F6B();
        } else {
            productCollectionCoverImpl = null;
        }
        String A0T = A0T();
        ProductCollectionDropsMetadata Azb = Azb();
        if (Azb != null) {
            productCollectionDropsMetadataImpl = Azb.F6C();
        } else {
            productCollectionDropsMetadataImpl = null;
        }
        String A0i2 = A0i(574223090);
        String A0U = A0U();
        String A0Y = A0Y();
        ImmutableList A08 = A08(111578632, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, A0q, it);
            }
            if (A0q != null) {
                arrayList = AbstractC167017dG.A0q(A0q);
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A18(c1dy, arrayList, it2);
                }
            }
        }
        return new ProductCollectionImpl(ApF, ApC, productCollectionCoverImpl, productCollectionDropsMetadataImpl, A0i, A0T, A0i2, A0U, A0Y, arrayList);
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String getDescription() {
        return A0T();
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String getSubtitle() {
        return A0U();
    }

    @Override // com.instagram.user.model.ProductCollection
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
