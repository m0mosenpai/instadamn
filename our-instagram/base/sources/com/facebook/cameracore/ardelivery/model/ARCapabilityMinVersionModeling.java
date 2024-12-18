package com.facebook.cameracore.ardelivery.model;

import X.AbstractC50102Ry;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(5);
    public static final long serialVersionUID = 0;
    public VersionedCapability mCapability;
    public int mMinVersion;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
            if (!AbstractC50102Ry.A00(this.mCapability, aRCapabilityMinVersionModeling.mCapability) || !AbstractC50102Ry.A00(Integer.valueOf(this.mMinVersion), Integer.valueOf(aRCapabilityMinVersionModeling.mMinVersion))) {
                return false;
            }
        }
        return true;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getCapabilityXplatValue() {
        return this.mCapability.getXplatValue();
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mCapability, Integer.valueOf(this.mMinVersion)});
    }

    public boolean isCapabilityBodyTracking() {
        return AbstractC50102Ry.A00(this.mCapability, VersionedCapability.BodyTracking);
    }

    public boolean isCapabilityFacetracker() {
        return AbstractC50102Ry.A00(this.mCapability, VersionedCapability.Facetracker);
    }

    public boolean isCapabilityGazeCorrection() {
        return AbstractC50102Ry.A00(this.mCapability, VersionedCapability.GazeCorrection);
    }

    public boolean isCapabilityHairSegmentation() {
        return AbstractC50102Ry.A00(this.mCapability, VersionedCapability.HairSegmentation);
    }

    public boolean isCapabilitySegmentation() {
        return AbstractC50102Ry.A00(this.mCapability, VersionedCapability.Segmentation);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("capability: ");
        sb.append(this.mCapability);
        sb.append(", minVersion:");
        sb.append(this.mMinVersion);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCapability.ordinal());
        parcel.writeInt(this.mMinVersion);
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.mCapability = VersionedCapability.values()[parcel.readInt()];
        this.mMinVersion = parcel.readInt();
    }

    public ARCapabilityMinVersionModeling(int i, int i2) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        fromXplatValue.getClass();
        this.mCapability = fromXplatValue;
        this.mMinVersion = i2;
    }

    public ARCapabilityMinVersionModeling(VersionedCapability versionedCapability, int i) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
    }

    public /* synthetic */ ARCapabilityMinVersionModeling(Parcel parcel, C206149Aw c206149Aw) {
        this(parcel);
    }

    public ARCapabilityMinVersionModeling() {
    }
}
