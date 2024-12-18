package com.instagram.user.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25236BEt;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41213IMc;
import X.C55344OhA;
import X.IAG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.api.schemas.IGLocalEventDict;
import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;

/* loaded from: classes7.dex */
public final class UpcomingEventImpl extends C0T6 implements UpcomingEvent, Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(23);
    public final long A00;
    public final EventPageNavigationMetadata A01;
    public final IGLocalEventDict A02;
    public final UpcomingEventIDType A03;
    public final UpcomingEventMedia A04;
    public final UpcomingDropCampaignEventMetadata A05;
    public final UpcomingEventLiveMetadata A06;
    public final User A07;
    public final Boolean A08;
    public final Long A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public UpcomingEventImpl(EventPageNavigationMetadata eventPageNavigationMetadata, IGLocalEventDict iGLocalEventDict, UpcomingEventIDType upcomingEventIDType, UpcomingEventMedia upcomingEventMedia, UpcomingDropCampaignEventMetadata upcomingDropCampaignEventMetadata, UpcomingEventLiveMetadata upcomingEventLiveMetadata, User user, Boolean bool, Long l, Long l2, String str, String str2, String str3, long j, boolean z) {
        C14360o3.A0B(str, 4);
        AbstractC25229BEm.A1O(str3, 14, upcomingEventIDType);
        this.A05 = upcomingDropCampaignEventMetadata;
        this.A09 = l;
        this.A01 = eventPageNavigationMetadata;
        this.A0B = str;
        this.A02 = iGLocalEventDict;
        this.A08 = bool;
        this.A0A = l2;
        this.A06 = upcomingEventLiveMetadata;
        this.A04 = upcomingEventMedia;
        this.A07 = user;
        this.A0E = z;
        this.A00 = j;
        this.A0C = str2;
        this.A0D = str3;
        this.A03 = upcomingEventIDType;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventImpl F7a(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventImpl F7b(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingEventImpl) {
                UpcomingEventImpl upcomingEventImpl = (UpcomingEventImpl) obj;
                if (!C14360o3.A0K(this.A05, upcomingEventImpl.A05) || !C14360o3.A0K(this.A09, upcomingEventImpl.A09) || !C14360o3.A0K(this.A01, upcomingEventImpl.A01) || !C14360o3.A0K(this.A0B, upcomingEventImpl.A0B) || !C14360o3.A0K(this.A02, upcomingEventImpl.A02) || !C14360o3.A0K(this.A08, upcomingEventImpl.A08) || !C14360o3.A0K(this.A0A, upcomingEventImpl.A0A) || !C14360o3.A0K(this.A06, upcomingEventImpl.A06) || !C14360o3.A0K(this.A04, upcomingEventImpl.A04) || !C14360o3.A0K(this.A07, upcomingEventImpl.A07) || this.A0E != upcomingEventImpl.A0E || this.A00 != upcomingEventImpl.A00 || !C14360o3.A0K(this.A0C, upcomingEventImpl.A0C) || !C14360o3.A0K(this.A0D, upcomingEventImpl.A0D) || this.A03 != upcomingEventImpl.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A05, i);
        AbstractC31179DnN.A0q(parcel, this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A02, i);
        AbstractC31179DnN.A0p(parcel, this.A08);
        AbstractC31179DnN.A0q(parcel, this.A0A);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A04, i);
        User user = this.A07;
        if (user == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            user.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A03, i);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final /* bridge */ /* synthetic */ C41213IMc AKp() {
        return new C41213IMc(this);
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingDropCampaignEventMetadata Aza() {
        return this.A05;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final Long B24() {
        return this.A09;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final EventPageNavigationMetadata B2l() {
        return this.A01;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final IGLocalEventDict BG0() {
        return this.A02;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final Long BLn() {
        return this.A0A;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventLiveMetadata BNx() {
        return this.A06;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventMedia BQO() {
        return this.A04;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final User Bah() {
        return this.A07;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEventIDType CD5() {
        return this.A03;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final Boolean CW7() {
        return this.A08;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUpcomingEventDict", IAG.A00(this));
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final String getId() {
        return this.A0B;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final boolean getReminderEnabled() {
        return this.A0E;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final long getStartTime() {
        return this.A00;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final String getStrongId() {
        return this.A0C;
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final String getTitle() {
        return this.A0D;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0K(this.A0D, (AbstractC25236BEt.A01(this.A00, AbstractC167007dF.A0D(this.A0E, (((((((((((AbstractC166997dE.A0K(this.A0B, ((((AbstractC167017dG.A0M(this.A05) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31)) + AbstractC25227BEk.A07(this.A0C)) * 31));
    }

    @Override // com.instagram.user.model.UpcomingEvent
    public final UpcomingEvent ECI(C1DY c1dy) {
        return this;
    }
}
