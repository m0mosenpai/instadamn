package com.instagram.creation.genai.magicmod.model;

import X.C14360o3;
import X.LNM;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class ExpanderConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(70);
    public final Rect A00;

    public ExpanderConfig(Rect rect) {
        C14360o3.A0B(rect, 1);
        this.A00 = rect;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
