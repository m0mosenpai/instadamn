package com.instagram.api.schemas;

import X.AbstractC65733Tt8;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class MediaCroppingCoordinates extends C0T6 implements Parcelable, MediaCroppingCoordinatesIntf {
    public static final Parcelable.Creator CREATOR = new C206159Ax(40);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final MediaCroppingCoordinates EwF() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaCroppingCoordinates) {
                MediaCroppingCoordinates mediaCroppingCoordinates = (MediaCroppingCoordinates) obj;
                if (Float.compare(this.A00, mediaCroppingCoordinates.A00) != 0 || Float.compare(this.A01, mediaCroppingCoordinates.A01) != 0 || Float.compare(this.A02, mediaCroppingCoordinates.A02) != 0 || Float.compare(this.A03, mediaCroppingCoordinates.A03) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtD() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtG() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtI() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtJ() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaCroppingCoordinates", AbstractC65733Tt8.A00(this));
    }

    public MediaCroppingCoordinates(float f, float f2, float f3, float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
