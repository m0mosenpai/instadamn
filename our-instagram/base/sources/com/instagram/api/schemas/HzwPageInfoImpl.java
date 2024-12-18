package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class HzwPageInfoImpl extends C0T6 implements Parcelable, HzwPageInfo {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(9);
    public final Boolean A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HzwPageInfoImpl) {
                HzwPageInfoImpl hzwPageInfoImpl = (HzwPageInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, hzwPageInfoImpl.A01) || !C14360o3.A0K(this.A00, hzwPageInfoImpl.A00)) {
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
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A00) ? 1 : 0);
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public HzwPageInfoImpl(String str, Boolean bool) {
        this.A01 = str;
        this.A00 = bool;
    }
}
