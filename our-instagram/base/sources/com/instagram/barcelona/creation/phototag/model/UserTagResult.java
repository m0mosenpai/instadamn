package com.instagram.barcelona.creation.phototag.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25231BEo;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UserTagResult extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(13);
    public final String A00;
    public final String A01;
    public final List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserTagResult) {
                UserTagResult userTagResult = (UserTagResult) obj;
                if (!C14360o3.A0K(this.A01, userTagResult.A01) || !C14360o3.A0K(this.A00, userTagResult.A00) || !C14360o3.A0K(this.A02, userTagResult.A02)) {
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
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A02);
        while (A0u.hasNext()) {
            ((UserTag) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A00, this.A01.hashCode() * 31) + this.A02.hashCode();
    }

    public UserTagResult(String str, String str2, List list) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }
}
