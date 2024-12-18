package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class IgPromoAdsExtension extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(13);
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgPromoAdsExtension) {
                IgPromoAdsExtension igPromoAdsExtension = (IgPromoAdsExtension) obj;
                if (!C14360o3.A0K(this.A00, igPromoAdsExtension.A00) || !C14360o3.A0K(this.A02, igPromoAdsExtension.A02) || this.A03 != igPromoAdsExtension.A03 || !C14360o3.A0K(this.A01, igPromoAdsExtension.A01)) {
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
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            ((IgPromoAdsPromoCode) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0O(this.A00) * 31)) + AbstractC25227BEk.A07(this.A01);
    }

    public IgPromoAdsExtension(List list, boolean z, String str, String str2) {
        this.A00 = str;
        this.A02 = list;
        this.A03 = z;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IgPromoAdsExtension(advertiserName=");
        A1C.append(this.A00);
        A1C.append(", promoCodes=");
        A1C.append(this.A02);
        A1C.append(", isAutofillEnabled=");
        A1C.append(this.A03);
        A1C.append(", footerSubtype=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
