package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class CallAdsInfoDictImpl extends C0T6 implements Parcelable, CallAdsInfoDict {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(90);
    public final String A00;
    public final boolean A01;

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final CallAdsInfoDictImpl ErZ() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallAdsInfoDictImpl) {
                CallAdsInfoDictImpl callAdsInfoDictImpl = (CallAdsInfoDictImpl) obj;
                if (!C14360o3.A0K(this.A00, callAdsInfoDictImpl.A00) || this.A01 != callAdsInfoDictImpl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final String BbU() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final boolean BvP() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CallAdsInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (BbU() != null) {
            A1I.put("parsed_phone_number", BbU());
        }
        BvP();
        return AbstractC37300Gc1.A05("XDTCallAdsInfoDict", AbstractC37301Gc2.A0r("should_render_phone_number_to_cta", Boolean.valueOf(BvP()), A1I));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }

    public CallAdsInfoDictImpl(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
