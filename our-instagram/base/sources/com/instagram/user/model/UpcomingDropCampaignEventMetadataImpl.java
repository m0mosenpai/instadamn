package com.instagram.user.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.AbstractC25233BEq;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C55344OhA;
import X.IAE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpcomingDropCampaignEventMetadataImpl extends C0T6 implements Parcelable, UpcomingDropCampaignEventMetadata {
    public static final Parcelable.Creator CREATOR = new C55344OhA(22);
    public final UpcomingEventMedia A00;
    public final ProductCollection A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public UpcomingDropCampaignEventMetadataImpl(UpcomingEventMedia upcomingEventMedia, ProductCollection productCollection, User user, String str, String str2, List list) {
        AbstractC25233BEq.A0x(3, str, str2, user);
        C14360o3.A0B(list, 6);
        this.A01 = productCollection;
        this.A00 = upcomingEventMedia;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = user;
        this.A05 = list;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingDropCampaignEventMetadataImpl F7Y(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingDropCampaignEventMetadataImpl F7Z(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingDropCampaignEventMetadataImpl) {
                UpcomingDropCampaignEventMetadataImpl upcomingDropCampaignEventMetadataImpl = (UpcomingDropCampaignEventMetadataImpl) obj;
                if (!C14360o3.A0K(this.A01, upcomingDropCampaignEventMetadataImpl.A01) || !C14360o3.A0K(this.A00, upcomingDropCampaignEventMetadataImpl.A00) || !C14360o3.A0K(this.A03, upcomingDropCampaignEventMetadataImpl.A03) || !C14360o3.A0K(this.A04, upcomingDropCampaignEventMetadataImpl.A04) || !C14360o3.A0K(this.A02, upcomingDropCampaignEventMetadataImpl.A02) || !C14360o3.A0K(this.A05, upcomingDropCampaignEventMetadataImpl.A05)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        this.A02.writeToParcel(parcel, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A05);
        while (A0u.hasNext()) {
            ((ProductDetailsProductItemDict) A0u.next()).writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final ProductCollection Ap9() {
        return this.A01;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingEventMedia AsQ() {
        return this.A00;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final String AzY() {
        return this.A03;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final String BML() {
        return this.A04;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final User BSW() {
        return this.A02;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final List BhR() {
        return this.A05;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUpcomingDropCampaignEventMetadata", IAE.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, ((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00)) * 31))));
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingDropCampaignEventMetadata ECH(C1DY c1dy) {
        return this;
    }
}
