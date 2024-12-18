package com.instagram.shopping.intf.productpicker;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.ProductCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class MultiProductPickerResult extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C37324GcR.A00(70);
    public final ProductCollectionFeedTaggingMeta A00;
    public final ProductCollection A01;
    public final List A02;
    public final Map A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultiProductPickerResult) {
                MultiProductPickerResult multiProductPickerResult = (MultiProductPickerResult) obj;
                if (!C14360o3.A0K(this.A02, multiProductPickerResult.A02) || !C14360o3.A0K(this.A03, multiProductPickerResult.A03) || !C14360o3.A0K(this.A01, multiProductPickerResult.A01) || !C14360o3.A0K(this.A00, multiProductPickerResult.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A03);
        while (A0s.hasNext()) {
            parcel.writeParcelable((Parcelable) AbstractC167027dH.A0O(parcel, A0s), i);
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public MultiProductPickerResult(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, ProductCollection productCollection, List list, Map map) {
        AbstractC167017dG.A1P(list, map);
        this.A02 = list;
        this.A03 = map;
        this.A01 = productCollection;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public MultiProductPickerResult() {
        this(null, null, C16930sl.A00, AbstractC06930Yk.A0E());
    }
}
