package com.google.android.material.navigation;

import X.C65884Tvo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes11.dex */
public class NavigationBarView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C65884Tvo(9);
    public Bundle A00;

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.A00);
    }
}
