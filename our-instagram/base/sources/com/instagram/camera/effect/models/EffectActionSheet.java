package com.instagram.camera.effect.models;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class EffectActionSheet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(93);
    public List A00;
    public List A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
        parcel.writeStringList(this.A01);
    }

    public EffectActionSheet() {
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        this.A00 = emptyList;
        List emptyList2 = Collections.emptyList();
        C14360o3.A07(emptyList2);
        this.A01 = emptyList2;
    }
}
