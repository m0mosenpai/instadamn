package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC37300Gc1;
import X.AbstractC39868HmH;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerContextCTAImpl extends C0T6 implements Parcelable, CreatorViewerContextCTA {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(42);
    public final CreatorViewerContextCTATarget A00;
    public final CreatorViewerContextCTAType A01;
    public final FormattedString A02;
    public final FormattedString A03;
    public final String A04;
    public final String A05;

    public CreatorViewerContextCTAImpl(CreatorViewerContextCTATarget creatorViewerContextCTATarget, CreatorViewerContextCTAType creatorViewerContextCTAType, FormattedString formattedString, FormattedString formattedString2, String str, String str2) {
        AbstractC25229BEm.A1I(creatorViewerContextCTAType, 1, str2);
        this.A01 = creatorViewerContextCTAType;
        this.A00 = creatorViewerContextCTATarget;
        this.A02 = formattedString;
        this.A03 = formattedString2;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final CreatorViewerContextCTAImpl Esm() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerContextCTAImpl) {
                CreatorViewerContextCTAImpl creatorViewerContextCTAImpl = (CreatorViewerContextCTAImpl) obj;
                if (this.A01 != creatorViewerContextCTAImpl.A01 || this.A00 != creatorViewerContextCTAImpl.A00 || !C14360o3.A0K(this.A02, creatorViewerContextCTAImpl.A02) || !C14360o3.A0K(this.A03, creatorViewerContextCTAImpl.A03) || !C14360o3.A0K(this.A04, creatorViewerContextCTAImpl.A04) || !C14360o3.A0K(this.A05, creatorViewerContextCTAImpl.A05)) {
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
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final CreatorViewerContextCTAType ArJ() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final CreatorViewerContextCTATarget Ato() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final FormattedString B3S() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final FormattedString B8J() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final String BEi() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerContextCTA", AbstractC39868HmH.A00(this));
    }

    @Override // com.instagram.api.schemas.CreatorViewerContextCTA
    public final String getText() {
        return this.A05;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, (((((((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31);
    }
}
