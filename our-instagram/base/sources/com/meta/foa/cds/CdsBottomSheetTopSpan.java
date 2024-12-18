package com.meta.foa.cds;

import X.AbstractC25235BEs;
import X.AnonymousClass001;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public abstract class CdsBottomSheetTopSpan implements Parcelable {

    /* loaded from: classes9.dex */
    public final class Dp extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator CREATOR = C55344OhA.A00(57);
        public final int A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof Dp) && this.A00 == ((Dp) obj).A00);
        }

        public final int hashCode() {
            return this.A00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(this.A00);
        }

        public final String toString() {
            return AbstractC25235BEs.A0q("Dp(dp=", this.A00);
        }

        public Dp(int i) {
            this.A00 = i;
        }
    }

    /* loaded from: classes9.dex */
    public final class ScreenPercent extends CdsBottomSheetTopSpan {
        public static final Parcelable.Creator CREATOR = C55344OhA.A00(58);
        public final float A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof ScreenPercent) && Float.compare(this.A00, ((ScreenPercent) obj).A00) == 0);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public final String toString() {
            return AnonymousClass001.A0F("ScreenPercent(percent=", ')', this.A00);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeFloat(this.A00);
        }

        public ScreenPercent(float f) {
            this.A00 = f;
        }
    }
}
