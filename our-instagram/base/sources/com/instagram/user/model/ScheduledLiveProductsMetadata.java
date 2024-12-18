package com.instagram.user.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C55344OhA;
import X.IAB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ScheduledLiveProductsMetadata extends C0T6 implements Parcelable, ScheduledLiveProductsMetadataIntf {
    public static final Parcelable.Creator CREATOR = new C55344OhA(20);
    public final ScheduledLiveAffiliateInfo A00;
    public final ScheduledLiveDiscountInfo A01;
    public final ProductCollection A02;
    public final User A03;
    public final List A04;

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveProductsMetadata F7X(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScheduledLiveProductsMetadata) {
                ScheduledLiveProductsMetadata scheduledLiveProductsMetadata = (ScheduledLiveProductsMetadata) obj;
                if (!C14360o3.A0K(this.A00, scheduledLiveProductsMetadata.A00) || !C14360o3.A0K(this.A02, scheduledLiveProductsMetadata.A02) || !C14360o3.A0K(this.A01, scheduledLiveProductsMetadata.A01) || !C14360o3.A0K(this.A03, scheduledLiveProductsMetadata.A03) || !C14360o3.A0K(this.A04, scheduledLiveProductsMetadata.A04)) {
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
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        User user = this.A03;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, i);
        }
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
        while (A0l.hasNext()) {
            ((ProductWrapper) A0l.next()).writeToParcel(parcel, i);
        }
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveAffiliateInfo AaO() {
        return this.A00;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ProductCollection Ap9() {
        return this.A02;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveDiscountInfo AyI() {
        return this.A01;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final User BSW() {
        return this.A03;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final List BhR() {
        return this.A04;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTScheduledLiveProductsConsumptionPayload", IAB.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public ScheduledLiveProductsMetadata(ScheduledLiveAffiliateInfo scheduledLiveAffiliateInfo, ScheduledLiveDiscountInfo scheduledLiveDiscountInfo, ProductCollection productCollection, User user, List list) {
        this.A00 = scheduledLiveAffiliateInfo;
        this.A02 = productCollection;
        this.A01 = scheduledLiveDiscountInfo;
        this.A03 = user;
        this.A04 = list;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveProductsMetadataIntf ECG(C1DY c1dy) {
        return this;
    }
}
