package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.C41213IMc;
import X.IAG;
import X.JEE;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.EventPageNavigationMetadataImpl;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import com.instagram.api.schemas.ImmutablePandoEventPageNavigationMetadata;
import com.instagram.api.schemas.ImmutablePandoIGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;

/* loaded from: classes7.dex */
public final class ImmutablePandoUpcomingEvent extends C17T implements UpcomingEvent {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(98);
    public UpcomingDropCampaignEventMetadata A00;
    public UpcomingEventLiveMetadata A01;
    public User A02;

    @Override // com.instagram.user.model.UpcomingEvent
    public final /* synthetic */ C41213IMc AKp() {
        return new C41213IMc(this);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingDropCampaignEventMetadata Aza() {
        UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata = this.A00;
        if (upcomingDropCampaignEventMetadata == null) {
            return (UpcomingDropCampaignEventMetadata) A05(348906851, ImmutablePandoUpcomingDropCampaignEventMetadata.class);
        }
        return upcomingDropCampaignEventMetadata;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final EventPageNavigationMetadata B2l() {
        return (EventPageNavigationMetadata) A05(2132109818, ImmutablePandoEventPageNavigationMetadata.class);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final IGLocalEventDict BG0() {
        return (IGLocalEventDict) A05(-215380848, ImmutablePandoIGLocalEventDict.class);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventLiveMetadata BNx() {
        UpcomingEventLiveMetadata upcomingEventLiveMetadata = this.A01;
        if (upcomingEventLiveMetadata == null) {
            return (UpcomingEventLiveMetadata) A05(-1273346782, ImmutablePandoUpcomingEventLiveMetadata.class);
        }
        return upcomingEventLiveMetadata;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventMedia BQO() {
        return (UpcomingEventMedia) A05(103772132, ImmutablePandoUpcomingEventMedia.class);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final User Bah() {
        return this.A02;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventIDType CD5() {
        return (UpcomingEventIDType) A0M(-453030570, JEE.A00);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventImpl F7a(C1DY c1dy) {
        UpcomingDropCampaignEventMetadataImpl upcomingDropCampaignEventMetadataImpl;
        EventPageNavigationMetadataImpl eventPageNavigationMetadataImpl;
        IGLocalEventDictImpl iGLocalEventDictImpl;
        UpcomingEventLiveMetadataImpl upcomingEventLiveMetadataImpl;
        UpcomingEventMediaImpl upcomingEventMediaImpl;
        User A0N;
        UpcomingDropCampaignEventMetadata Aza = Aza();
        User user = null;
        if (Aza != null) {
            upcomingDropCampaignEventMetadataImpl = Aza.F7Y(c1dy);
        } else {
            upcomingDropCampaignEventMetadataImpl = null;
        }
        Long A0L = A0L(1725551537);
        EventPageNavigationMetadata B2l = B2l();
        if (B2l != null) {
            eventPageNavigationMetadataImpl = B2l.EtE();
        } else {
            eventPageNavigationMetadataImpl = null;
        }
        String A0g = A0g();
        IGLocalEventDict BG0 = BG0();
        if (BG0 != null) {
            iGLocalEventDictImpl = BG0.Ev7();
        } else {
            iGLocalEventDictImpl = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1604645158);
        Long A0L2 = A0L(1505271864);
        UpcomingEventLiveMetadata BNx = BNx();
        if (BNx != null) {
            upcomingEventLiveMetadataImpl = BNx.F7c(c1dy);
        } else {
            upcomingEventLiveMetadataImpl = null;
        }
        UpcomingEventMedia BQO = BQO();
        if (BQO != null) {
            upcomingEventMediaImpl = BQO.F6f();
        } else {
            upcomingEventMediaImpl = null;
        }
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, 106164915);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = (User) c1dy.A00(A0N);
        }
        return new UpcomingEventImpl(eventPageNavigationMetadataImpl, iGLocalEventDictImpl, CD5(), upcomingEventMediaImpl, upcomingDropCampaignEventMetadataImpl, upcomingEventLiveMetadataImpl, user, optionalBooleanValueByHashCode, A0L, A0L2, A0g, A0j(356255459), A0S(), A03(-1573145462), getBooleanValueByHashCode(-244359052));
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventImpl F7b(C1DV c1dv) {
        if (c1dv == null) {
            c1dv = AbstractC37301Gc2.A08();
        }
        return F7a(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, IAG.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final Long B24() {
        return A0L(1725551537);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final Long BLn() {
        return A0L(1505271864);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final Boolean CW7() {
        return getOptionalBooleanValueByHashCode(-1604645158);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEvent ECI(C1DY c1dy) {
        UpcomingDropCampaignEventMetadata Aza = Aza();
        UpcomingEventLiveMetadata upcomingEventLiveMetadata = null;
        if (Aza != null) {
            Aza.ECH(c1dy);
        } else {
            Aza = null;
        }
        this.A00 = Aza;
        UpcomingEventLiveMetadata BNx = BNx();
        if (BNx != null) {
            BNx.ECJ(c1dy);
            upcomingEventLiveMetadata = BNx;
        }
        this.A01 = upcomingEventLiveMetadata;
        this.A02 = AbstractC37303Gc4.A0J(c1dy, this, 106164915);
        return this;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final String getId() {
        return A0g();
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final boolean getReminderEnabled() {
        return getBooleanValueByHashCode(-244359052);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final long getStartTime() {
        return A03(-1573145462);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final String getStrongId() {
        return A0j(356255459);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final String getTitle() {
        return A0S();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
