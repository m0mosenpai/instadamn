package android.support.v4.media;

import X.AnonymousClass001;
import X.Py5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = Py5.A00(3);
    public final float A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.A01;
    }

    public final String toString() {
        String valueOf;
        int i = this.A01;
        float f = this.A00;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        return AnonymousClass001.A05(i, "Rating:style=", " rating=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public RatingCompat(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }
}
