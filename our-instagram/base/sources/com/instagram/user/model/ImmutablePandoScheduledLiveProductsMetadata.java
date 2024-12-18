package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import X.IAB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ImmutablePandoScheduledLiveDiscountInfo;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoScheduledLiveProductsMetadata extends C17T implements ScheduledLiveProductsMetadataIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(95);
    public ProductCollection A00;
    public User A01;
    public List A02;

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveAffiliateInfo AaO() {
        return (ScheduledLiveAffiliateInfo) A05(-1521819552, ImmutablePandoScheduledLiveAffiliateInfo.class);
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ProductCollection Ap9() {
        return AbstractC37303Gc4.A0H(this, this.A00);
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveDiscountInfo AyI() {
        return (ScheduledLiveDiscountInfo) A05(-133183252, ImmutablePandoScheduledLiveDiscountInfo.class);
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final User BSW() {
        return this.A01;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final List BhR() {
        List list = this.A02;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductWrapper.class);
        }
        return list;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveProductsMetadataIntf ECG(C1DY c1dy) {
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        ArrayList arrayList = null;
        if (A0H != null) {
            A0H.ECD(c1dy);
        } else {
            A0H = null;
        }
        this.A00 = A0H;
        this.A01 = AbstractC37303Gc4.A0J(c1dy, this, -505296440);
        List<ProductWrapperIntf> BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            for (ProductWrapperIntf productWrapperIntf : BhR) {
                productWrapperIntf.ECF(c1dy);
                arrayList.add(productWrapperIntf);
            }
        }
        this.A02 = arrayList;
        return this;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, IAB.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.ScheduledLiveProductsMetadataIntf
    public final ScheduledLiveProductsMetadata F7X(C1DY c1dy) {
        ScheduledLiveAffiliateInfoImpl scheduledLiveAffiliateInfoImpl;
        ProductCollectionImpl productCollectionImpl;
        ScheduledLiveDiscountInfoImpl scheduledLiveDiscountInfoImpl;
        User user;
        User A0N;
        ScheduledLiveAffiliateInfo AaO = AaO();
        ArrayList arrayList = null;
        if (AaO != null) {
            scheduledLiveAffiliateInfoImpl = AaO.EzJ();
        } else {
            scheduledLiveAffiliateInfoImpl = null;
        }
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        if (A0H != null) {
            productCollectionImpl = A0H.F7Q(c1dy);
        } else {
            productCollectionImpl = null;
        }
        ScheduledLiveDiscountInfo AyI = AyI();
        if (AyI != null) {
            scheduledLiveDiscountInfoImpl = AyI.EzK();
        } else {
            scheduledLiveDiscountInfoImpl = null;
        }
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -505296440);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        List BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductWrapperIntf) it.next()).F7U(c1dy));
            }
        }
        return new ScheduledLiveProductsMetadata(scheduledLiveAffiliateInfoImpl, scheduledLiveDiscountInfoImpl, productCollectionImpl, user, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
