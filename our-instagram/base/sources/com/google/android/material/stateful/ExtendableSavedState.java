package com.google.android.material.stateful;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.C005001p;
import X.C63467Sl7;
import X.JQ0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes10.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C63467Sl7(2);
    public final C005001p A00;

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new C005001p(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ExtendableSavedState{");
        AbstractC58318PtA.A1T(A1C, System.identityHashCode(this));
        A1C.append(" states=");
        return JQ0.A0l(this.A00, A1C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C005001p c005001p = this.A00;
        int size = c005001p.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = c005001p.A05(i2);
            bundleArr[i2] = c005001p.A06(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
