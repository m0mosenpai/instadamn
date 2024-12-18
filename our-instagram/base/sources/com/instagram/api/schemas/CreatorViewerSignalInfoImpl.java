package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.AbstractC39879HmS;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerSignalInfoImpl extends C0T6 implements Parcelable, CreatorViewerSignalInfo {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(51);
    public final CreatorViewerSignalType A00;
    public final String A01;

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final CreatorViewerSignalInfoImpl Esv() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalInfoImpl) {
                CreatorViewerSignalInfoImpl creatorViewerSignalInfoImpl = (CreatorViewerSignalInfoImpl) obj;
                if (this.A00 != creatorViewerSignalInfoImpl.A00 || !C14360o3.A0K(this.A01, creatorViewerSignalInfoImpl.A01)) {
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
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final CreatorViewerSignalType BxH() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerSignalInfo", AbstractC39879HmS.A00(this));
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public CreatorViewerSignalInfoImpl(CreatorViewerSignalType creatorViewerSignalType, String str) {
        AbstractC167017dG.A1P(creatorViewerSignalType, str);
        this.A00 = creatorViewerSignalType;
        this.A01 = str;
    }
}
