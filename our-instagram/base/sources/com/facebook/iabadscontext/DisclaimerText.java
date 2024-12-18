package com.facebook.iabadscontext;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class DisclaimerText extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(2);
    public final String A00;
    public final List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerText) {
                DisclaimerText disclaimerText = (DisclaimerText) obj;
                if (!C14360o3.A0K(this.A00, disclaimerText.A00) || !C14360o3.A0K(this.A01, disclaimerText.A01)) {
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
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, list);
        while (A0u.hasNext()) {
            ((DisclaimerBodyUrlRanges) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public DisclaimerText(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
