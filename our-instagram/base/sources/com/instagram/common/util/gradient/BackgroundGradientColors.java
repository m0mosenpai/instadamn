package com.instagram.common.util.gradient;

import X.AbstractC56842jH;
import X.C14360o3;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.util.gradient.BackgroundGradientColors;

/* loaded from: classes.dex */
public final class BackgroundGradientColors implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0oN
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            C14360o3.A0B(parcel, 0);
            BackgroundGradientColors backgroundGradientColors = new BackgroundGradientColors(0, 0);
            backgroundGradientColors.A01 = parcel.readInt();
            backgroundGradientColors.A00 = parcel.readInt();
            return backgroundGradientColors;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackgroundGradientColors[i];
        }
    };
    public int A00;
    public int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public final BackgroundGradientColors A00(int i) {
        return new BackgroundGradientColors(AbstractC56842jH.A06(this.A01, i), AbstractC56842jH.A06(this.A00, i));
    }

    public BackgroundGradientColors(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public BackgroundGradientColors() {
        this(0, 0);
    }
}
