package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.IAH;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoUpcomingEventLiveMetadata extends C17T implements UpcomingEventLiveMetadata {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(99);
    public ScheduledLiveProductsMetadataIntf A00;

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final ScheduledLiveProductsMetadataIntf Bui() {
        ScheduledLiveProductsMetadataIntf scheduledLiveProductsMetadataIntf = this.A00;
        if (scheduledLiveProductsMetadataIntf == null) {
            return (ScheduledLiveProductsMetadataIntf) A05(-1648702171, ImmutablePandoScheduledLiveProductsMetadata.class);
        }
        return scheduledLiveProductsMetadataIntf;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, IAH.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final String AiJ() {
        return A0j(246302041);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final boolean BO0() {
        return getBooleanValueByHashCode(201661944);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final String Bf3() {
        return A0j(1878451178);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final Integer CGc() {
        return getOptionalIntValueByHashCode(1941332754);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final Boolean CQq() {
        return getOptionalBooleanValueByHashCode(-81031001);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final boolean CcQ() {
        return getBooleanValueByHashCode(-433113869);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final UpcomingEventLiveMetadata ECJ(C1DY c1dy) {
        ScheduledLiveProductsMetadataIntf Bui = Bui();
        if (Bui != null) {
            Bui.ECG(c1dy);
        } else {
            Bui = null;
        }
        this.A00 = Bui;
        return this;
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final UpcomingEventLiveMetadataImpl F7c(C1DY c1dy) {
        ScheduledLiveProductsMetadata scheduledLiveProductsMetadata;
        String A0j = A0j(246302041);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-81031001);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-433113869);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(201661944);
        String A0j2 = A0j(1878451178);
        ScheduledLiveProductsMetadataIntf Bui = Bui();
        if (Bui != null) {
            scheduledLiveProductsMetadata = Bui.F7X(c1dy);
        } else {
            scheduledLiveProductsMetadata = null;
        }
        return new UpcomingEventLiveMetadataImpl(scheduledLiveProductsMetadata, optionalBooleanValueByHashCode, getOptionalIntValueByHashCode(1941332754), A0j, A0j2, booleanValueByHashCode, booleanValueByHashCode2);
    }

    @Override // com.instagram.user.model.UpcomingEventLiveMetadata
    public final UpcomingEventLiveMetadataImpl F7d(C1DV c1dv) {
        return F7c(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
