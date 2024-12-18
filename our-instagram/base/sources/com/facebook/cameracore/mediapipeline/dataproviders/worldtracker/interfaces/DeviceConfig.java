package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class DeviceConfig implements Parcelable {
    public final double attitudeTimeDelay;
    public final double imuFromLandscapeCameraX;
    public final double imuFromLandscapeCameraY;
    public final double imuFromLandscapeCameraZ;
    public final boolean isCalibratedDeviceConfig;
    public final boolean isSlamCapable;
    public CameraConfig mCameraConfig;
    public final boolean skipAttitudeInput;
    public final String slamConfigurationParams;
    public final boolean useVisionOnlySlam;
    public static final Boolean DEFAULT_SKIP_ATTITUDE_INPUT = false;
    public static final Boolean DEFAULT_USE_VISION_ONLY_SLAM = false;
    public static final Boolean DEFAULT_IS_SLAM_CAPABLE = false;
    public static final Boolean DEFAULT_IS_CALIBRATED_DEVICE = false;
    public static final Parcelable.Creator CREATOR = new C206149Aw(16);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CameraConfig getCameraConfig() {
        return this.mCameraConfig;
    }

    public double getCameraDistortion1() {
        return this.mCameraConfig.A00;
    }

    public double getCameraDistortion2() {
        return this.mCameraConfig.A01;
    }

    public double getCameraFocalLength() {
        return this.mCameraConfig.A02;
    }

    public double getCameraPrincipalPointX() {
        return this.mCameraConfig.A03;
    }

    public double getCameraPrincipalPointY() {
        return this.mCameraConfig.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.imuFromLandscapeCameraX);
        parcel.writeDouble(this.imuFromLandscapeCameraY);
        parcel.writeDouble(this.imuFromLandscapeCameraZ);
        parcel.writeByte(this.skipAttitudeInput ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.attitudeTimeDelay);
        parcel.writeByte(this.useVisionOnlySlam ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSlamCapable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.slamConfigurationParams);
        parcel.writeParcelable(this.mCameraConfig, i);
        parcel.writeByte(this.isCalibratedDeviceConfig ? (byte) 1 : (byte) 0);
    }

    public DeviceConfig(Parcel parcel) {
        this.imuFromLandscapeCameraX = parcel.readDouble();
        this.imuFromLandscapeCameraY = parcel.readDouble();
        this.imuFromLandscapeCameraZ = parcel.readDouble();
        this.skipAttitudeInput = parcel.readByte() != 0;
        this.attitudeTimeDelay = parcel.readDouble();
        this.useVisionOnlySlam = parcel.readByte() != 0;
        this.isSlamCapable = parcel.readByte() != 0;
        this.slamConfigurationParams = parcel.readString();
        this.mCameraConfig = (CameraConfig) parcel.readParcelable(CameraConfig.class.getClassLoader());
        this.isCalibratedDeviceConfig = parcel.readByte() != 0;
    }

    public DeviceConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Boolean bool, double d9, Boolean bool2, Boolean bool3, String str, Boolean bool4) {
        this.mCameraConfig = new CameraConfig(d, d2, d3, d4, d5);
        this.imuFromLandscapeCameraX = d6;
        this.imuFromLandscapeCameraY = d7;
        this.imuFromLandscapeCameraZ = 0.0d;
        this.skipAttitudeInput = false;
        this.attitudeTimeDelay = d9;
        this.useVisionOnlySlam = bool2.booleanValue();
        this.isSlamCapable = bool3.booleanValue();
        this.slamConfigurationParams = "";
        this.isCalibratedDeviceConfig = bool4.booleanValue();
    }
}
