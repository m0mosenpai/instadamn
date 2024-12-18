package com.facebookpay.confirmation.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ECPConfirmationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(31);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ECPConfirmationParams(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC25233BEq.A0w(1, str, str3, str4);
        C14360o3.A0B(str6, 7);
        this.A03 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationParams) {
                ECPConfirmationParams eCPConfirmationParams = (ECPConfirmationParams) obj;
                if (!C14360o3.A0K(this.A03, eCPConfirmationParams.A03) || !C14360o3.A0K(this.A02, eCPConfirmationParams.A02) || !C14360o3.A0K(this.A05, eCPConfirmationParams.A05) || !C14360o3.A0K(this.A04, eCPConfirmationParams.A04) || !C14360o3.A0K(this.A06, eCPConfirmationParams.A06) || !C14360o3.A0K(this.A00, eCPConfirmationParams.A00) || !C14360o3.A0K(this.A01, eCPConfirmationParams.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        ECPConfirmationUpsellSection eCPConfirmationUpsellSection = this.A00;
        if (eCPConfirmationUpsellSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPConfirmationUpsellSection.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, ((this.A03.hashCode() * 31) + AbstractC167017dG.A0O(this.A02)) * 31)) + AbstractC167017dG.A0O(this.A06)) * 31;
        ECPConfirmationUpsellSection eCPConfirmationUpsellSection = this.A00;
        if (eCPConfirmationUpsellSection != null) {
            i = eCPConfirmationUpsellSection.hashCode();
        }
        return ((A0K + i) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECPConfirmationParams(paymentSectionTitle=");
        sb.append(this.A03);
        sb.append(", paymentSectionSubtitle=");
        sb.append(this.A02);
        sb.append(", seeReceiptTitle=");
        sb.append(this.A05);
        sb.append(", seeReceiptLinkUrl=");
        sb.append(this.A04);
        sb.append(", upsellPINTitle=");
        sb.append(this.A06);
        sb.append(", upsellSection=");
        sb.append(this.A00);
        sb.append(", ctaType=");
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }
}
