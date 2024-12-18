package com.facebookpay.confirmation.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ECPConfirmationUpsellAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(32);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public ECPConfirmationUpsellAction(String str, String str2, String str3, String str4, String str5) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationUpsellAction) {
                ECPConfirmationUpsellAction eCPConfirmationUpsellAction = (ECPConfirmationUpsellAction) obj;
                if (!C14360o3.A0K(this.A04, eCPConfirmationUpsellAction.A04) || !C14360o3.A0K(this.A00, eCPConfirmationUpsellAction.A00) || !C14360o3.A0K(this.A01, eCPConfirmationUpsellAction.A01) || !C14360o3.A0K(this.A03, eCPConfirmationUpsellAction.A03) || !C14360o3.A0K(this.A02, eCPConfirmationUpsellAction.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A00, this.A04.hashCode() * 31))) + AbstractC167017dG.A0O(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECPConfirmationUpsellAction(type=");
        sb.append(this.A04);
        sb.append(", actionType=");
        sb.append(this.A00);
        sb.append(", iconName=");
        sb.append(this.A01);
        sb.append(", title=");
        sb.append(this.A03);
        sb.append(", linkUrl=");
        return AbstractC25236BEt.A0Y(this.A02, sb);
    }
}
