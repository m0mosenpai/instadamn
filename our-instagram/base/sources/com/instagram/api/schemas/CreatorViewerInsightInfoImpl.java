package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.AbstractC39870HmJ;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerInsightInfoImpl extends C0T6 implements Parcelable, CreatorViewerInsightInfo {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(46);
    public final CreatorViewerInsightTypeV2 A00;
    public final FormattedString A01;
    public final String A02;

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final CreatorViewerInsightInfoImpl Eso() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerInsightInfoImpl) {
                CreatorViewerInsightInfoImpl creatorViewerInsightInfoImpl = (CreatorViewerInsightInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, creatorViewerInsightInfoImpl.A01) || this.A00 != creatorViewerInsightInfoImpl.A00 || !C14360o3.A0K(this.A02, creatorViewerInsightInfoImpl.A02)) {
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
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final FormattedString B8J() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final CreatorViewerInsightTypeV2 BII() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerInsightInfo", AbstractC39870HmJ.A00(this));
    }

    @Override // com.instagram.api.schemas.CreatorViewerInsightInfo
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A01) * 31));
    }

    public CreatorViewerInsightInfoImpl(CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2, FormattedString formattedString, String str) {
        AbstractC167017dG.A1R(creatorViewerInsightTypeV2, str);
        this.A01 = formattedString;
        this.A00 = creatorViewerInsightTypeV2;
        this.A02 = str;
    }
}
