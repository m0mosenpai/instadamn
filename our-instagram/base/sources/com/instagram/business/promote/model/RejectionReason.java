package com.instagram.business.promote.model;

import X.C00O;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes11.dex */
public final class RejectionReason implements Parcelable {
    public static final C70220WId CREATOR = new C70220WId(83);
    public String A00;
    public List A01;
    public boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        String str2 = this.A00;
        if (str2 != null) {
            parcel.writeString(str2);
            parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
            List list = this.A01;
            if (list != null) {
                parcel.writeTypedList(list);
                return;
            }
            str = "ranges";
        } else {
            str = "text";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
