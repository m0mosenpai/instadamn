package com.google.android.material.slider;

import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(14);
    public float A00;
    public float A01;
    public float A02;
    public ArrayList A03;
    public boolean A04;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeList(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeBooleanArray(new boolean[]{this.A04});
    }
}
