package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40424HwF;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class TrackMetadataImpl extends C0T6 implements TrackMetadata, Parcelable {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(71);
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    @Override // com.instagram.api.schemas.TrackMetadata
    public final TrackMetadataImpl F3Q() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TrackMetadataImpl) {
                TrackMetadataImpl trackMetadataImpl = (TrackMetadataImpl) obj;
                if (this.A06 != trackMetadataImpl.A06 || !C14360o3.A0K(this.A05, trackMetadataImpl.A05) || !C14360o3.A0K(this.A03, trackMetadataImpl.A03) || !C14360o3.A0K(this.A04, trackMetadataImpl.A04) || this.A07 != trackMetadataImpl.A07 || !C14360o3.A0K(this.A00, trackMetadataImpl.A00) || !C14360o3.A0K(this.A01, trackMetadataImpl.A01) || !C14360o3.A0K(this.A02, trackMetadataImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        AbstractC31179DnN.A0q(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        AbstractC31179DnN.A0p(parcel, this.A00);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final List AyW() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Long AyX() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Integer Bg7() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Integer CAx() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Boolean Cer() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTrackMetadata", AbstractC40424HwF.A00(this));
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final boolean getAllowMediaCreationWithMusic() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final String getFormattedClipsMediaCount() {
        return this.A04;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A07, (((((AbstractC25225BEi.A08(this.A06) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final boolean isBookmarked() {
        return this.A07;
    }

    public TrackMetadataImpl(Boolean bool, Integer num, Integer num2, Long l, String str, List list, boolean z, boolean z2) {
        this.A06 = z;
        this.A05 = list;
        this.A03 = l;
        this.A04 = str;
        this.A07 = z2;
        this.A00 = bool;
        this.A01 = num;
        this.A02 = num2;
    }
}
