package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC39885HmY;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerSignalReelsTextDetailsImpl extends C0T6 implements Parcelable, CreatorViewerSignalReelsTextDetails {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(54);
    public final ClipsTextFormatType A00;
    public final FormattedString A01;

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final CreatorViewerSignalReelsTextDetailsImpl Esz() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalReelsTextDetailsImpl) {
                CreatorViewerSignalReelsTextDetailsImpl creatorViewerSignalReelsTextDetailsImpl = (CreatorViewerSignalReelsTextDetailsImpl) obj;
                if (!C14360o3.A0K(this.A01, creatorViewerSignalReelsTextDetailsImpl.A01) || this.A00 != creatorViewerSignalReelsTextDetailsImpl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final FormattedString C3a() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final ClipsTextFormatType C6K() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerSignalReelsTextDetails", AbstractC39885HmY.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public CreatorViewerSignalReelsTextDetailsImpl(ClipsTextFormatType clipsTextFormatType, FormattedString formattedString) {
        this.A01 = formattedString;
        this.A00 = clipsTextFormatType;
    }
}
