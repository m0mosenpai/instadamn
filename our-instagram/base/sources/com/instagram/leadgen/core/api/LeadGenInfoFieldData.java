package com.instagram.leadgen.core.api;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes9.dex */
public final class LeadGenInfoFieldData extends C0T6 implements Parcelable, LeadGenInfoFieldDataIntf {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(12);
    public final String A00;
    public final List A01;
    public final boolean A02;

    public LeadGenInfoFieldData(String str, List list, boolean z) {
        C14360o3.A0B(str, 2);
        this.A02 = z;
        this.A00 = str;
        this.A01 = list;
    }

    @Override // com.instagram.leadgen.core.api.LeadGenInfoFieldDataIntf
    public final LeadGenInfoFieldData F52() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenInfoFieldData) {
                LeadGenInfoFieldData leadGenInfoFieldData = (LeadGenInfoFieldData) obj;
                if (this.A02 != leadGenInfoFieldData.A02 || !C14360o3.A0K(this.A00, leadGenInfoFieldData.A00) || !C14360o3.A0K(this.A01, leadGenInfoFieldData.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeStringList(this.A01);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A00, AbstractC25225BEi.A08(this.A02)) + AbstractC167017dG.A0M(this.A01);
    }
}
