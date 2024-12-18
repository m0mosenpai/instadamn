package com.instagram.shopping.model.taggingfeed;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC25233BEq;
import X.AbstractC50522MSa;
import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class TaggingFeedMultiSelectState extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(92);
    public ProductCollectionFeedTaggingMeta A00;
    public List A01;
    public Map A02;
    public Map A03;
    public Map A04;

    public TaggingFeedMultiSelectState(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, ProductCollection productCollection, List list, Map map) {
        this(null, C16930sl.A00, AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E());
        Map A0E;
        if (productCollection != null) {
            String Ap3 = productCollection.Ap3();
            this.A02 = AbstractC167007dF.A0n(Ap3 == null ? "" : Ap3, productCollection);
            return;
        }
        if (list != null) {
            A0E = AbstractC25225BEi.A18(AbstractC50522MSa.A09(list));
            for (Object obj : list) {
                A0E.put(((Product) obj).A0H, obj);
            }
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        this.A04 = A0E;
        this.A03 = map == null ? AbstractC06930Yk.A0E() : map;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public static final TaggingFeedMultiSelectState A00(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, List list, Map map, Map map2, Map map3) {
        C14360o3.A0B(map, 0);
        AbstractC167027dH.A13(map2, map3, list);
        return new TaggingFeedMultiSelectState(productCollectionFeedTaggingMeta, list, map, map2, map3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaggingFeedMultiSelectState) {
                TaggingFeedMultiSelectState taggingFeedMultiSelectState = (TaggingFeedMultiSelectState) obj;
                if (!C14360o3.A0K(this.A04, taggingFeedMultiSelectState.A04) || !C14360o3.A0K(this.A03, taggingFeedMultiSelectState.A03) || !C14360o3.A0K(this.A02, taggingFeedMultiSelectState.A02) || !C14360o3.A0K(this.A01, taggingFeedMultiSelectState.A01) || !C14360o3.A0K(this.A00, taggingFeedMultiSelectState.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A04);
        while (A0s.hasNext()) {
            parcel.writeParcelable((Parcelable) AbstractC167027dH.A0O(parcel, A0s), i);
        }
        Iterator A0s2 = AbstractC167017dG.A0s(parcel, this.A03);
        while (A0s2.hasNext()) {
            ((ProductCollectionFeedTaggingMeta) AbstractC167027dH.A0O(parcel, A0s2)).writeToParcel(parcel, i);
        }
        Iterator A0s3 = AbstractC167017dG.A0s(parcel, this.A02);
        while (A0s3.hasNext()) {
            parcel.writeParcelable((Parcelable) AbstractC167027dH.A0O(parcel, A0s3), i);
        }
        parcel.writeStringList(this.A01);
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = this.A00;
        if (productCollectionFeedTaggingMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productCollectionFeedTaggingMeta.writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A04)))) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TaggingFeedMultiSelectState(selectedProductIdToProductsMap=");
        A1C.append(this.A04);
        A1C.append(", selectedProductIdToCollectionMetaMap=");
        A1C.append(this.A03);
        A1C.append(", selectedCollectionIdToCollectionsMap=");
        A1C.append(this.A02);
        A1C.append(", productOrVariantSelectionIds=");
        A1C.append(this.A01);
        A1C.append(", selectedCollectionInformationMetadata=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public TaggingFeedMultiSelectState(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, List list, Map map, Map map2, Map map3) {
        AbstractC25233BEq.A0w(2, map2, map3, list);
        this.A04 = map;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = list;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public TaggingFeedMultiSelectState() {
        this(null, C16930sl.A00, AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E());
    }
}
