package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class AdvantageAudienceDataImpl extends C0T6 implements AdvantageAudienceData, Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(44);
    public final XFBTargetingAutomationAdvantageAudienceStatus A00;
    public final Integer A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdvantageAudienceDataImpl) {
                AdvantageAudienceDataImpl advantageAudienceDataImpl = (AdvantageAudienceDataImpl) obj;
                if (this.A00 != advantageAudienceDataImpl.A00 || !C14360o3.A0K(this.A01, advantageAudienceDataImpl.A01)) {
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
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A01));
    }

    @Override // com.instagram.api.schemas.AdvantageAudienceData
    public final XFBTargetingAutomationAdvantageAudienceStatus AaJ() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AdvantageAudienceData
    public final Integer BTn() {
        return this.A01;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A00) * 31;
        Integer num = this.A01;
        if (num != null) {
            i = num.hashCode();
        }
        return A0M + i;
    }

    public AdvantageAudienceDataImpl(XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus, Integer num) {
        this.A00 = xFBTargetingAutomationAdvantageAudienceStatus;
        this.A01 = num;
    }
}
