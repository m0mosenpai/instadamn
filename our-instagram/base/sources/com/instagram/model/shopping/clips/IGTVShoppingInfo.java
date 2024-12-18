package com.instagram.model.shopping.clips;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41856IgA;
import X.I3T;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IGTVShoppingInfo extends C0T6 implements Parcelable, IGTVShoppingInfoIntf {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(24);
    public final ClipsShoppingCTABar A00;
    public final ProductCollection A01;
    public final User A02;
    public final List A03;

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final IGTVShoppingInfo F60(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final IGTVShoppingInfo F61(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGTVShoppingInfo) {
                IGTVShoppingInfo iGTVShoppingInfo = (IGTVShoppingInfo) obj;
                if (!C14360o3.A0K(this.A00, iGTVShoppingInfo.A00) || !C14360o3.A0K(this.A01, iGTVShoppingInfo.A01) || !C14360o3.A0K(this.A02, iGTVShoppingInfo.A02) || !C14360o3.A0K(this.A03, iGTVShoppingInfo.A03)) {
                }
            }
            return false;
        }
        return true;
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
        parcel.writeParcelable(this.A02, i);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0l, i);
        }
    }

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final /* bridge */ /* synthetic */ ClipsShoppingCTABarIntf AoW() {
        return this.A00;
    }

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final ProductCollection Ap9() {
        return this.A01;
    }

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final User BSW() {
        return this.A02;
    }

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final List BhR() {
        return this.A03;
    }

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGTVProductsConsumptionPayload", I3T.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public IGTVShoppingInfo(ClipsShoppingCTABar clipsShoppingCTABar, ProductCollection productCollection, User user, List list) {
        this.A00 = clipsShoppingCTABar;
        this.A01 = productCollection;
        this.A02 = user;
        this.A03 = list;
    }

    @Override // com.instagram.model.shopping.clips.IGTVShoppingInfoIntf
    public final IGTVShoppingInfoIntf EBo(C1DY c1dy) {
        return this;
    }
}
