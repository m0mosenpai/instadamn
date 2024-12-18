package com.facebook.browser.lite.viewmode;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43594JPz;
import X.C63475SlG;
import X.VD2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public abstract class IABViewModeLaunchConfig implements Parcelable {
    public final VD2 A00;

    /* loaded from: classes10.dex */
    public final class FullScreen extends IABViewModeLaunchConfig {
        public static final FullScreen A00 = new FullScreen();
        public static final Parcelable.Creator CREATOR = C63475SlG.A02(27);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public FullScreen() {
            super(VD2.A02);
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("IABViewModeLaunchConfig(initViewMode=");
            return AbstractC167017dG.A0o(this.A00, A1C);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes10.dex */
    public final class FullSheet extends IABViewModeLaunchConfig {
        public static final FullSheet A00 = new FullSheet();
        public static final Parcelable.Creator CREATOR = C63475SlG.A02(28);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public FullSheet() {
            super(VD2.A03);
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("IABViewModeLaunchConfig(initViewMode=");
            return AbstractC167017dG.A0o(this.A00, A1C);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes10.dex */
    public final class HalfSheet extends IABViewModeLaunchConfig {
        public static final HalfSheet A00 = new HalfSheet();
        public static final Parcelable.Creator CREATOR = C63475SlG.A02(29);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public HalfSheet() {
            super(VD2.A04);
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("IABViewModeLaunchConfig(initViewMode=");
            return AbstractC167017dG.A0o(this.A00, A1C);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes10.dex */
    public final class Peek extends IABViewModeLaunchConfig {
        public static final Peek A00 = new Peek();
        public static final Parcelable.Creator CREATOR = C63475SlG.A02(30);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Peek() {
            super(VD2.A05);
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("IABViewModeLaunchConfig(initViewMode=");
            return AbstractC167017dG.A0o(this.A00, A1C);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    public IABViewModeLaunchConfig(VD2 vd2) {
        this.A00 = vd2;
    }
}
