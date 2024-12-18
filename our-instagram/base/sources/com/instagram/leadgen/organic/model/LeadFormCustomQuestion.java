package com.instagram.leadgen.organic.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.EnumC53203Nfz;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes9.dex */
public final class LeadFormCustomQuestion extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(27);
    public final EnumC53203Nfz A00;
    public final String A01;
    public final List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadFormCustomQuestion) {
                LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) obj;
                if (!C14360o3.A0K(this.A01, leadFormCustomQuestion.A01) || this.A00 != leadFormCustomQuestion.A00 || !C14360o3.A0K(this.A02, leadFormCustomQuestion.A02)) {
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
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeStringList(this.A02);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public LeadFormCustomQuestion(EnumC53203Nfz enumC53203Nfz, String str, List list) {
        AbstractC167027dH.A13(str, enumC53203Nfz, list);
        this.A01 = str;
        this.A00 = enumC53203Nfz;
        this.A02 = list;
    }
}
