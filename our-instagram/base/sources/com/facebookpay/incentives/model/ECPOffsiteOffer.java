package com.facebookpay.incentives.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63470SlB;
import X.VFP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: classes11.dex */
public final class ECPOffsiteOffer implements ECPIncentive {
    public static final Parcelable.Creator CREATOR = new C63470SlB(6);
    public final VFP A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final CurrencyAmount A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A04, i);
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String B38() {
        return this.A05;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final VFP BHM() {
        return this.A00;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final boolean CQZ() {
        return this.A03;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String getId() {
        return this.A01;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String getSubtitle() {
        return this.A06;
    }

    @Override // com.facebookpay.incentives.model.ECPIncentive
    public final String getTitle() {
        return this.A07;
    }

    public ECPOffsiteOffer(CurrencyAmount currencyAmount, VFP vfp, String str, String str2, String str3, String str4, String str5, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(vfp, 5);
        this.A01 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A06 = str4;
        this.A00 = vfp;
        this.A03 = z;
        this.A05 = str5;
        this.A04 = currencyAmount;
    }
}
