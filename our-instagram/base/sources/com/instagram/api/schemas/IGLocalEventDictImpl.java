package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC39992HoZ;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IGLocalEventDictImpl extends C0T6 implements Parcelable, IGLocalEventDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(38);
    public final EventVisibilityType A00;
    public final String A01;

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final IGLocalEventDictImpl Ev7() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGLocalEventDictImpl) {
                IGLocalEventDictImpl iGLocalEventDictImpl = (IGLocalEventDictImpl) obj;
                if (!C14360o3.A0K(this.A01, iGLocalEventDictImpl.A01) || this.A00 != iGLocalEventDictImpl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final String BFa() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final EventVisibilityType BFb() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGLocalEventDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGLocalEventDict", AbstractC39992HoZ.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public IGLocalEventDictImpl(EventVisibilityType eventVisibilityType, String str) {
        this.A01 = str;
        this.A00 = eventVisibilityType;
    }
}
