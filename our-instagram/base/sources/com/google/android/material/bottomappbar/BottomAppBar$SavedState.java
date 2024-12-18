package com.google.android.material.bottomappbar;

import X.C65884Tvo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes11.dex */
public class BottomAppBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C65884Tvo(5);
    public int A00;
    public boolean A01;

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
