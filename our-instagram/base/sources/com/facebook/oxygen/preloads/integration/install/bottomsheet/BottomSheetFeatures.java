package com.facebook.oxygen.preloads.integration.install.bottomsheet;

import X.AbstractC62308S6d;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class BottomSheetFeatures extends C0T6 implements Parcelable {
    public final Integer A00;
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(48);
    public static final BottomSheetFeatures A01 = new BottomSheetFeatures(AbstractC62308S6d.A00);

    public BottomSheetFeatures(Integer num) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        if (1 - this.A00.intValue() != 0) {
            str = "SHOW_ALWAYS";
        } else {
            str = "SHOW_NO_WIFI";
        }
        parcel.writeString(str);
    }
}
