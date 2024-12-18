package com.instagram.api.schemas;

import X.AbstractC40220Hsj;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes2.dex */
public final class RingSpecPointImpl extends C0T6 implements Parcelable, RingSpecPoint {
    public static final Parcelable.Creator CREATOR = new C206139Av(2);
    public final float A00;
    public final float A01;

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final RingSpecPointImpl EzG() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RingSpecPointImpl) {
                RingSpecPointImpl ringSpecPointImpl = (RingSpecPointImpl) obj;
                if (Float.compare(this.A00, ringSpecPointImpl.A00) != 0 || Float.compare(this.A01, ringSpecPointImpl.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
    }

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final float CI0() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final float CIZ() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRingSpecPoint", AbstractC40220Hsj.A00(this));
    }

    public RingSpecPointImpl(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
