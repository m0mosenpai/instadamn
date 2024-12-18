package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ScheduledLiveAffiliateInfoImpl extends C0T6 implements Parcelable, ScheduledLiveAffiliateInfo {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(93);
    public final String A00;

    @Override // com.instagram.api.schemas.ScheduledLiveAffiliateInfo
    public final ScheduledLiveAffiliateInfoImpl EzJ() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ScheduledLiveAffiliateInfoImpl) && C14360o3.A0K(this.A00, ((ScheduledLiveAffiliateInfoImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public ScheduledLiveAffiliateInfoImpl(String str) {
        this.A00 = str;
    }

    @Override // com.instagram.api.schemas.ScheduledLiveAffiliateInfo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("disclosure_tag", str);
        }
        return AbstractC37300Gc1.A05("XDTScheduledLiveAffiliateInfo", AbstractC06930Yk.A0B(A0X));
    }
}
