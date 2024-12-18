package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37302Gc3;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class XDTLazyFloatingContextItemImpl extends C0T6 implements Parcelable, XDTLazyFloatingContextItem {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(91);
    public final XDTFloatingContextItemType A00;
    public final User A01;

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTLazyFloatingContextItemImpl F41(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTLazyFloatingContextItemImpl F42(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XDTLazyFloatingContextItemImpl) {
                XDTLazyFloatingContextItemImpl xDTLazyFloatingContextItemImpl = (XDTLazyFloatingContextItemImpl) obj;
                if (this.A00 != xDTLazyFloatingContextItemImpl.A00 || !C14360o3.A0K(this.A01, xDTLazyFloatingContextItemImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTFloatingContextItemType B73() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final User CDj() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (B73() != null) {
            XDTFloatingContextItemType B73 = B73();
            if (B73 != null) {
                str = B73.A00;
            }
            A1I.put("floating_context_item_type", str);
        }
        AbstractC37302Gc3.A1T(CDj(), A1I);
        return AbstractC37300Gc1.A05("XDTLazyFloatingContextItem", AbstractC06930Yk.A0B(A1I));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public XDTLazyFloatingContextItemImpl(XDTFloatingContextItemType xDTFloatingContextItemType, User user) {
        this.A00 = xDTFloatingContextItemType;
        this.A01 = user;
    }

    @Override // com.instagram.api.schemas.XDTLazyFloatingContextItem
    public final XDTLazyFloatingContextItem EBF(C1DY c1dy) {
        return this;
    }
}
