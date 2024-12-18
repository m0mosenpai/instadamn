package com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model;

import X.AbstractC166997dE;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public enum EffectInfoBottomSheetMode implements Parcelable {
    NORMAL,
    SHOPPING,
    SHOPPING_TEST,
    TRY_ON;

    public static final Parcelable.Creator CREATOR = new LNM(52);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC166997dE.A1I(parcel, this);
    }
}
