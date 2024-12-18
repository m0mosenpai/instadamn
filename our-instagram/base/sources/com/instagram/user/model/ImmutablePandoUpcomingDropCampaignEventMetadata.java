package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37302Gc3;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.IAE;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoUpcomingDropCampaignEventMetadata extends C17T implements UpcomingDropCampaignEventMetadata {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(97);
    public ProductCollection A00;
    public User A01;
    public List A02;

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final ProductCollection Ap9() {
        return AbstractC37303Gc4.A0H(this, this.A00);
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingEventMedia AsQ() {
        return (UpcomingEventMedia) A05(175980892, ImmutablePandoUpcomingEventMedia.class);
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final User BSW() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'merchant' field.");
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final List BhR() {
        List list = this.A02;
        if (list == null) {
            return A0o(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingDropCampaignEventMetadata ECH(C1DY c1dy) {
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        if (A0H != null) {
            A0H.ECD(c1dy);
        } else {
            A0H = null;
        }
        this.A00 = A0H;
        this.A01 = AbstractC37302Gc3.A0P(c1dy, this, -505296440);
        List<ProductDetailsProductItemDictIntf> BhR = BhR();
        ArrayList A0q = AbstractC167017dG.A0q(BhR);
        for (ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf : BhR) {
            productDetailsProductItemDictIntf.ECE(c1dy);
            A0q.add(productDetailsProductItemDictIntf);
        }
        this.A02 = A0q;
        return this;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingDropCampaignEventMetadataImpl F7Y(C1DY c1dy) {
        ProductCollectionImpl productCollectionImpl;
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        UpcomingEventMediaImpl upcomingEventMediaImpl = null;
        if (A0H != null) {
            productCollectionImpl = A0H.F7Q(c1dy);
        } else {
            productCollectionImpl = null;
        }
        UpcomingEventMedia AsQ = AsQ();
        if (AsQ != null) {
            upcomingEventMediaImpl = AsQ.F6f();
        }
        String A0k = A0k(-1068649126);
        String A0h = A0h(2034986993);
        User user = (User) AbstractC37303Gc4.A07(c1dy, this, -505296440);
        List BhR = BhR();
        ArrayList A0q = AbstractC167017dG.A0q(BhR);
        Iterator it = BhR.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1D(c1dy, A0q, it);
        }
        return new UpcomingDropCampaignEventMetadataImpl(upcomingEventMediaImpl, productCollectionImpl, user, A0k, A0h, A0q);
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, IAE.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final String AzY() {
        return A0k(-1068649126);
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final String BML() {
        return A0h(2034986993);
    }

    @Override // com.instagram.user.model.UpcomingDropCampaignEventMetadata
    public final UpcomingDropCampaignEventMetadataImpl F7Z(C1DV c1dv) {
        return F7Y(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
