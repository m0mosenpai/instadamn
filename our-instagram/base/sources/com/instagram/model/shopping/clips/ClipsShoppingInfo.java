package com.instagram.model.shopping.clips;

import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C9Ay;
import X.I3R;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ClipsShoppingInfo extends C0T6 implements ClipsShoppingInfoIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(33);
    public final ClipsShoppingCTABar A00;
    public final ProductCollection A01;
    public final List A02;

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final ClipsShoppingInfoIntf EBn(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final ClipsShoppingInfo F5z(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsShoppingInfo) {
                ClipsShoppingInfo clipsShoppingInfo = (ClipsShoppingInfo) obj;
                if (!C14360o3.A0K(this.A00, clipsShoppingInfo.A00) || !C14360o3.A0K(this.A01, clipsShoppingInfo.A01) || !C14360o3.A0K(this.A02, clipsShoppingInfo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ClipsShoppingCTABar clipsShoppingCTABar = this.A00;
        int hashCode = (clipsShoppingCTABar == null ? 0 : clipsShoppingCTABar.hashCode()) * 31;
        ProductCollection productCollection = this.A01;
        int hashCode2 = (hashCode + (productCollection == null ? 0 : productCollection.hashCode())) * 31;
        List list = this.A02;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        ClipsShoppingCTABar clipsShoppingCTABar = this.A00;
        if (clipsShoppingCTABar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipsShoppingCTABar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A01, i);
        List list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final /* bridge */ /* synthetic */ ClipsShoppingCTABarIntf AoW() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final ProductCollection Ap9() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final List BhR() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsProductsConsumptionPayload", I3R.A00(this));
    }

    public ClipsShoppingInfo(ClipsShoppingCTABar clipsShoppingCTABar, ProductCollection productCollection, List list) {
        this.A00 = clipsShoppingCTABar;
        this.A01 = productCollection;
        this.A02 = list;
    }
}
