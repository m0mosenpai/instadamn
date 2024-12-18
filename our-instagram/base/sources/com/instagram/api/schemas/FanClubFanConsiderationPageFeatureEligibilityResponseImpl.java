package com.instagram.api.schemas;

import X.AbstractC31221Do4;
import X.C0T6;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class FanClubFanConsiderationPageFeatureEligibilityResponseImpl extends C0T6 implements Parcelable, FanClubFanConsiderationPageFeatureEligibilityResponse {
    public static final Parcelable.Creator CREATOR = new C206149Aw(89);
    public final boolean A00;
    public final boolean A01;

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final FanClubFanConsiderationPageFeatureEligibilityResponseImpl EtP() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClubFanConsiderationPageFeatureEligibilityResponseImpl) {
                FanClubFanConsiderationPageFeatureEligibilityResponseImpl fanClubFanConsiderationPageFeatureEligibilityResponseImpl = (FanClubFanConsiderationPageFeatureEligibilityResponseImpl) obj;
                if (this.A00 != fanClubFanConsiderationPageFeatureEligibilityResponseImpl.A00 || this.A01 != fanClubFanConsiderationPageFeatureEligibilityResponseImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFanClubFanConsiderationPageFeatureEligibilityResponse", AbstractC31221Do4.A00(this));
    }

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final boolean getShouldShowContentPreview() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final boolean getShouldShowSocialContext() {
        return this.A01;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public FanClubFanConsiderationPageFeatureEligibilityResponseImpl(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
