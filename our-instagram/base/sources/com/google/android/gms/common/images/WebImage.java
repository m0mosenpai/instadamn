package com.google.android.gms.common.images;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import X.SSI;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(35);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof WebImage)) {
                WebImage webImage = (WebImage) obj;
                if (!SSI.A01(this.A03, webImage.A03) || this.A01 != webImage.A01 || this.A02 != webImage.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A03.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A0A(parcel, this.A03, 2, i, false);
        AbstractC128825rw.A07(parcel, 3, this.A01);
        AbstractC58322PtE.A1B(parcel, this.A02, A06);
    }

    public WebImage(Uri uri, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = uri;
        this.A01 = i2;
        this.A02 = i3;
    }
}
