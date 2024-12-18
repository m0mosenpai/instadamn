package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC39883HmW;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerSignalPlainDetailsImpl extends C0T6 implements Parcelable, CreatorViewerSignalPlainDetails {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(53);
    public final FormattedString A00;
    public final String A01;

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final CreatorViewerSignalPlainDetailsImpl Esy() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalPlainDetailsImpl) {
                CreatorViewerSignalPlainDetailsImpl creatorViewerSignalPlainDetailsImpl = (CreatorViewerSignalPlainDetailsImpl) obj;
                if (!C14360o3.A0K(this.A01, creatorViewerSignalPlainDetailsImpl.A01) || !C14360o3.A0K(this.A00, creatorViewerSignalPlainDetailsImpl.A00)) {
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

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final String BEi() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final FormattedString C3a() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalPlainDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerSignalPlainDetails", AbstractC39883HmW.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public CreatorViewerSignalPlainDetailsImpl(FormattedString formattedString, String str) {
        this.A01 = str;
        this.A00 = formattedString;
    }
}
