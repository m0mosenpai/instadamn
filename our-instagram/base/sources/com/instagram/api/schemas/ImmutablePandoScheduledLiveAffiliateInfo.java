package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoScheduledLiveAffiliateInfo extends C17T implements ScheduledLiveAffiliateInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(75);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ScheduledLiveAffiliateInfo
    public final ScheduledLiveAffiliateInfoImpl EzJ() {
        return new ScheduledLiveAffiliateInfoImpl(A0i(267098696));
    }

    @Override // com.instagram.api.schemas.ScheduledLiveAffiliateInfo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0i(267098696) != null) {
            A0X.put("disclosure_tag", A0i(267098696));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
