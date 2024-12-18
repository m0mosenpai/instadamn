package com.meta.foa.cds;

import X.AnonymousClass001;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: classes5.dex */
public abstract class CdsBottomSheetDimmingBehaviour implements Parcelable {

    /* loaded from: classes5.dex */
    public final class Default extends CdsBottomSheetDimmingBehaviour {
        public static final Default A00 = new Object();
        public static final Parcelable.Creator CREATOR = new C55344OhA(55);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return -1522220413;
        }

        public final String toString() {
            return ServerW3CShippingAddressConstants.DEFAULT;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes5.dex */
    public final class FixedAlpha extends CdsBottomSheetDimmingBehaviour {
        public static final Parcelable.Creator CREATOR = new C55344OhA(56);
        public final float A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof FixedAlpha) && Float.compare(this.A00, ((FixedAlpha) obj).A00) == 0);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.A00);
        }

        public final String toString() {
            return AnonymousClass001.A0F("FixedAlpha(alpha=", ')', this.A00);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeFloat(this.A00);
        }

        public FixedAlpha(float f) {
            this.A00 = f;
        }

        public FixedAlpha() {
            this(0.5f);
        }
    }
}
