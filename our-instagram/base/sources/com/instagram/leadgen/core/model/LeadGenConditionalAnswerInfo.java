package com.instagram.leadgen.core.model;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class LeadGenConditionalAnswerInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(16);
    public final List A00;
    public final Map A01;

    public LeadGenConditionalAnswerInfo(List list, Map map) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenConditionalAnswerInfo) {
                LeadGenConditionalAnswerInfo leadGenConditionalAnswerInfo = (LeadGenConditionalAnswerInfo) obj;
                if (!C14360o3.A0K(this.A00, leadGenConditionalAnswerInfo.A00) || !C14360o3.A0K(this.A01, leadGenConditionalAnswerInfo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
        Iterator A0s = AbstractC167017dG.A0s(parcel, this.A01);
        while (A0s.hasNext()) {
            ((LeadGenConditionalAnswerInfo) AbstractC167027dH.A0O(parcel, A0s)).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }
}
