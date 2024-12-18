package com.instagram.ui.primer;

import X.AbstractC25226BEj;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public abstract class IconConfig implements Parcelable {

    /* loaded from: classes8.dex */
    public final class IconWithTextConfig extends IconConfig {
        public static final Parcelable.Creator CREATOR = new C55344OhA(9);
        public final int A00;
        public final String A01;

        public IconWithTextConfig(int i, String str) {
            C14360o3.A0B(str, 2);
            this.A00 = i;
            this.A01 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof IconWithTextConfig) {
                    IconWithTextConfig iconWithTextConfig = (IconWithTextConfig) obj;
                    if (this.A00 != iconWithTextConfig.A00 || !C14360o3.A0K(this.A01, iconWithTextConfig.A01)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(this.A00);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return AbstractC25226BEj.A03(this.A01, this.A00 * 31);
        }
    }

    /* loaded from: classes8.dex */
    public final class SimpleIconConfig extends IconConfig {
        public static final Parcelable.Creator CREATOR = new C55344OhA(10);
        public final int A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof SimpleIconConfig) && this.A00 == ((SimpleIconConfig) obj).A00);
        }

        public final int hashCode() {
            return this.A00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(this.A00);
        }

        public SimpleIconConfig(int i) {
            this.A00 = i;
        }
    }
}
