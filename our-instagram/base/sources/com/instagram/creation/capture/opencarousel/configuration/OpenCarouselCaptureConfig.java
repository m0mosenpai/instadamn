package com.instagram.creation.capture.opencarousel.configuration;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class OpenCarouselCaptureConfig extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(44);
    public final float A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public OpenCarouselCaptureConfig(String str, String str2, float f, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = f;
        this.A03 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OpenCarouselCaptureConfig) {
                OpenCarouselCaptureConfig openCarouselCaptureConfig = (OpenCarouselCaptureConfig) obj;
                if (!C14360o3.A0K(this.A01, openCarouselCaptureConfig.A01) || !C14360o3.A0K(this.A02, openCarouselCaptureConfig.A02) || Float.compare(this.A00, openCarouselCaptureConfig.A00) != 0 || this.A03 != openCarouselCaptureConfig.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A00((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31, this.A00));
    }
}
