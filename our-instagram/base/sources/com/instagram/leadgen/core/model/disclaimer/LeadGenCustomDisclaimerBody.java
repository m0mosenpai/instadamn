package com.instagram.leadgen.core.model.disclaimer;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class LeadGenCustomDisclaimerBody extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(22);
    public final String A00;
    public final List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimerBody) {
                LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody = (LeadGenCustomDisclaimerBody) obj;
                if (!C14360o3.A0K(this.A00, leadGenCustomDisclaimerBody.A00) || !C14360o3.A0K(this.A01, leadGenCustomDisclaimerBody.A01)) {
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
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            ((LeadGenCustomDisclaimerBodyUrlRanges) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }

    public LeadGenCustomDisclaimerBody(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
