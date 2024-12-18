package com.instagram.discovery.refinement.model;

import X.C2I7;
import X.EnumC39536Hd7;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.keyword.Keyword;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class RefinementAttributes implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(66);
    public QueryInformation A00;
    public EnumC39536Hd7 A01;
    public Keyword A02;
    public String A03;
    public String A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RefinementAttributes refinementAttributes = (RefinementAttributes) obj;
            if (!C2I7.A00(this.A04, refinementAttributes.A04) || !C2I7.A00(this.A03, refinementAttributes.A03) || this.A05 != refinementAttributes.A05 || !C2I7.A00(this.A02, refinementAttributes.A02) || !C2I7.A00(this.A01, refinementAttributes.A01)) {
                return false;
            }
        }
        return true;
    }

    public final void A00() {
        EnumC39536Hd7 enumC39536Hd7;
        if (this.A04 != null) {
            enumC39536Hd7 = EnumC39536Hd7.CATEGORY_ID;
        } else if (this.A03 != null) {
            enumC39536Hd7 = EnumC39536Hd7.CATEGORY;
        } else if (this.A05) {
            enumC39536Hd7 = EnumC39536Hd7.ON_SALE;
        } else if (this.A02 == null) {
            return;
        } else {
            enumC39536Hd7 = EnumC39536Hd7.KEYWORD;
        }
        this.A01 = enumC39536Hd7;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, Boolean.valueOf(this.A05), this.A02, this.A01});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
    }
}
