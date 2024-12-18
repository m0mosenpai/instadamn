package com.instagram.model.shopping.clips;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import X.I3R;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductWrapper;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapperIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoClipsShoppingInfo extends C17T implements ClipsShoppingInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(53);
    public ProductCollection A00;
    public List A01;

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final ClipsShoppingCTABarIntf AoW() {
        return (ClipsShoppingCTABarIntf) A05(-2003911895, ImmutablePandoClipsShoppingCTABar.class);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final ProductCollection Ap9() {
        return AbstractC37303Gc4.A0H(this, this.A00);
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final List BhR() {
        List list = this.A01;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductWrapper.class);
        }
        return list;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final ClipsShoppingInfoIntf EBn(C1DY c1dy) {
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        ArrayList arrayList = null;
        if (A0H != null) {
            A0H.ECD(c1dy);
        } else {
            A0H = null;
        }
        this.A00 = A0H;
        List<ProductWrapperIntf> BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            for (ProductWrapperIntf productWrapperIntf : BhR) {
                productWrapperIntf.ECF(c1dy);
                arrayList.add(productWrapperIntf);
            }
        }
        this.A01 = arrayList;
        return this;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I3R.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.shopping.clips.ClipsShoppingInfoIntf
    public final ClipsShoppingInfo F5z(C1DY c1dy) {
        ClipsShoppingCTABar clipsShoppingCTABar;
        ProductCollectionImpl productCollectionImpl;
        ClipsShoppingCTABarIntf AoW = AoW();
        ArrayList arrayList = null;
        if (AoW != null) {
            clipsShoppingCTABar = AoW.F5y();
        } else {
            clipsShoppingCTABar = null;
        }
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        if (A0H != null) {
            productCollectionImpl = A0H.F7Q(c1dy);
        } else {
            productCollectionImpl = null;
        }
        List BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductWrapperIntf) it.next()).F7U(c1dy));
            }
        }
        return new ClipsShoppingInfo(clipsShoppingCTABar, productCollectionImpl, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
