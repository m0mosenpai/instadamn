package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40051Hpd;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class LoyaltyToplineInfoDictImpl extends C0T6 implements Parcelable, LoyaltyToplineInfoDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(78);
    public final Boolean A00;
    public final String A01;

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final LoyaltyToplineInfoDictImpl Ew8() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoyaltyToplineInfoDictImpl) {
                LoyaltyToplineInfoDictImpl loyaltyToplineInfoDictImpl = (LoyaltyToplineInfoDictImpl) obj;
                if (!C14360o3.A0K(this.A00, loyaltyToplineInfoDictImpl.A00) || !C14360o3.A0K(this.A01, loyaltyToplineInfoDictImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final String BPQ() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final Boolean Cfr() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.LoyaltyToplineInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTLoyaltyToplineInfoDict", AbstractC40051Hpd.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public LoyaltyToplineInfoDictImpl(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}
