package com.instagram.model.shopping;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class CompoundProductId extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(8);
    public String A00;
    public String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CompoundProductId) {
                CompoundProductId compoundProductId = (CompoundProductId) obj;
                if (!C14360o3.A0K(this.A01, compoundProductId.A01) || !C14360o3.A0K(this.A00, compoundProductId.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public CompoundProductId(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    public CompoundProductId() {
        this("", "");
    }
}
