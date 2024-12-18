package com.instagram.profile.intf;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class MultipleLinksEditModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(20);
    public final Integer A00;
    public final String A01;

    public MultipleLinksEditModel(Integer num, String str) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultipleLinksEditModel) {
                MultipleLinksEditModel multipleLinksEditModel = (MultipleLinksEditModel) obj;
                if (this.A00 != multipleLinksEditModel.A00 || !C14360o3.A0K(this.A01, multipleLinksEditModel.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        if (1 - this.A00.intValue() != 0) {
            str = "CREATE";
        } else {
            str = "EDIT";
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "CREATE";
        } else {
            str = "EDIT";
        }
        return ((str.hashCode() + intValue) * 31) + AbstractC167017dG.A0O(this.A01);
    }
}
