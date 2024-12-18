package com.instagram.user.model;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C55344OhA;
import X.IAH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class UpcomingEventLiveMetadataImpl extends C0T6 implements UpcomingEventLiveMetadata, Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(24);
    public final ScheduledLiveProductsMetadata A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final UpcomingEventLiveMetadataImpl F7c(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final UpcomingEventLiveMetadataImpl F7d(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingEventLiveMetadataImpl) {
                UpcomingEventLiveMetadataImpl upcomingEventLiveMetadataImpl = (UpcomingEventLiveMetadataImpl) obj;
                if (!C14360o3.A0K(this.A03, upcomingEventLiveMetadataImpl.A03) || !C14360o3.A0K(this.A01, upcomingEventLiveMetadataImpl.A01) || this.A05 != upcomingEventLiveMetadataImpl.A05 || this.A06 != upcomingEventLiveMetadataImpl.A06 || !C14360o3.A0K(this.A04, upcomingEventLiveMetadataImpl.A04) || !C14360o3.A0K(this.A00, upcomingEventLiveMetadataImpl.A00) || !C14360o3.A0K(this.A02, upcomingEventLiveMetadataImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        AbstractC31179DnN.A0p(parcel, this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = this.A00;
        if (scheduledLiveProductsMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scheduledLiveProductsMetadata.writeToParcel(parcel, i);
        }
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final String AiJ() {
        return this.A03;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final boolean BO0() {
        return this.A06;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final String Bf3() {
        return this.A04;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final /* bridge */ /* synthetic */ ScheduledLiveProductsMetadataIntf Bui() {
        return this.A00;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final Integer CGc() {
        return this.A02;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final Boolean CQq() {
        return this.A01;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final boolean CcQ() {
        return this.A05;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUpcomingEventLiveMetadataDict", IAH.A00(this));
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, ((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public UpcomingEventLiveMetadataImpl(ScheduledLiveProductsMetadata scheduledLiveProductsMetadata, Boolean bool, Integer num, String str, String str2, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = bool;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = str2;
        this.A00 = scheduledLiveProductsMetadata;
        this.A02 = num;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final UpcomingEventLiveMetadata ECJ(C1DY c1dy) {
        return this;
    }
}
