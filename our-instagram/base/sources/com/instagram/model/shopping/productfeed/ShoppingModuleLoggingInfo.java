package com.instagram.model.shopping.productfeed;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import X.EnumC39581Hdr;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ShoppingModuleLoggingInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(50);
    public String A04 = "";
    public String A05 = "";
    public long A00 = -1;
    public String A06 = "";
    public EnumC39581Hdr A03 = null;
    public long A02 = -1;
    public long A01 = -1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingModuleLoggingInfo) {
                ShoppingModuleLoggingInfo shoppingModuleLoggingInfo = (ShoppingModuleLoggingInfo) obj;
                if (!C14360o3.A0K(this.A04, shoppingModuleLoggingInfo.A04) || !C14360o3.A0K(this.A05, shoppingModuleLoggingInfo.A05) || this.A00 != shoppingModuleLoggingInfo.A00 || !C14360o3.A0K(this.A06, shoppingModuleLoggingInfo.A06) || this.A03 != shoppingModuleLoggingInfo.A03 || this.A02 != shoppingModuleLoggingInfo.A02 || this.A01 != shoppingModuleLoggingInfo.A01) {
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
        parcel.writeString(this.A05);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        EnumC39581Hdr enumC39581Hdr = this.A03;
        if (enumC39581Hdr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC39581Hdr);
        }
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A02, (AbstractC166997dE.A0K(this.A06, AbstractC167007dF.A07(this.A00, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A04)))) + AbstractC167017dG.A0M(this.A03)) * 31);
        long j = this.A01;
        return A07 + ((int) (j ^ (j >>> 32)));
    }
}
