package com.instagram.leadgen.core.model.disclaimer;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
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
public final class LeadGenCustomDisclaimer extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(21);
    public final LeadGenCustomDisclaimerBody A00;
    public final String A01;
    public final List A02;

    public LeadGenCustomDisclaimer(LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody, String str, List list) {
        C14360o3.A0B(leadGenCustomDisclaimerBody, 2);
        this.A01 = str;
        this.A00 = leadGenCustomDisclaimerBody;
        this.A02 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenCustomDisclaimer) {
                LeadGenCustomDisclaimer leadGenCustomDisclaimer = (LeadGenCustomDisclaimer) obj;
                if (!C14360o3.A0K(this.A01, leadGenCustomDisclaimer.A01) || !C14360o3.A0K(this.A00, leadGenCustomDisclaimer.A00) || !C14360o3.A0K(this.A02, leadGenCustomDisclaimer.A02)) {
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
        this.A00.writeToParcel(parcel, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            ((LeadGenCustomDisclaimerCheckbox) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0O(this.A01) * 31));
    }
}
