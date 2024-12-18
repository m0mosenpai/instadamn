package com.facebookpay.incentives.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.C14360o3;
import X.C63470SlB;
import X.VFP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: classes11.dex */
public final class ECPOnsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = new C63470SlB(7);
    public final CurrencyAmount A00;
    public final String A01;
    public final VFP A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        AbstractC166997dE.A1I(parcel, this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String B38() {
        return this.A03;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final VFP BHM() {
        return this.A02;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final boolean CQZ() {
        return this.A07;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String getId() {
        return this.A04;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String getSubtitle() {
        return this.A05;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String getTitle() {
        return this.A06;
    }

    public ECPOnsiteOffer(CurrencyAmount currencyAmount, VFP vfp, String str, String str2, String str3, String str4, String str5, boolean z) {
        AbstractC25234BEr.A1P(str, str2, vfp);
        AbstractC167017dG.A1U(str4, str5);
        C14360o3.A0B(currencyAmount, 8);
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = vfp;
        this.A07 = z;
        this.A01 = str4;
        this.A03 = str5;
        this.A00 = currencyAmount;
    }
}
