package com.facebookpay.confirmation.model;

import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class ECPConfirmationUpsellSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(33);
    public final String A00;
    public final List A01;

    public ECPConfirmationUpsellSection(String str, List list) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPConfirmationUpsellSection) {
                ECPConfirmationUpsellSection eCPConfirmationUpsellSection = (ECPConfirmationUpsellSection) obj;
                if (!C14360o3.A0K(this.A00, eCPConfirmationUpsellSection.A00) || !C14360o3.A0K(this.A01, eCPConfirmationUpsellSection.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            ((ECPConfirmationUpsellAction) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECPConfirmationUpsellSection(upsellSectionTitle=");
        sb.append(this.A00);
        sb.append(", upsellActions=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }
}
