package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC39966Hnv;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IABPostClickDataDictImpl extends C0T6 implements Parcelable, IABPostClickDataDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(10);
    public final IGBWPIABPostClickDataExtensionDict A00;
    public final List A01;

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final IABPostClickDataDictImpl EuD() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABPostClickDataDictImpl) {
                IABPostClickDataDictImpl iABPostClickDataDictImpl = (IABPostClickDataDictImpl) obj;
                if (!C14360o3.A0K(this.A00, iABPostClickDataDictImpl.A00) || !C14360o3.A0K(this.A01, iABPostClickDataDictImpl.A01)) {
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
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0l, i);
        }
    }

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final IGBWPIABPostClickDataExtensionDict AjM() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final List B15() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIABPostClickDataDict", AbstractC39966Hnv.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public IABPostClickDataDictImpl(IGBWPIABPostClickDataExtensionDict iGBWPIABPostClickDataExtensionDict, List list) {
        this.A00 = iGBWPIABPostClickDataExtensionDict;
        this.A01 = list;
    }
}
