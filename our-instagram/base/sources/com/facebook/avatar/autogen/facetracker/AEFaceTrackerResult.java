package com.facebook.avatar.autogen.facetracker;

import X.C14360o3;

/* loaded from: classes9.dex */
public final class AEFaceTrackerResult {
    public final float bottom;
    public final int bytesPerRow;
    public byte[] data;
    public final int height;
    public final boolean isAutogenReady;
    public final boolean isEyesClosed;
    public final boolean isFace;
    public final float left;
    public final float pitch;
    public final float right;
    public final float roll;
    public final float top;
    public final int width;
    public final float yaw;

    public AEFaceTrackerResult(byte[] bArr, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i2, int i3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(bArr, 1);
        this.data = bArr;
        this.bytesPerRow = i;
        this.yaw = f;
        this.pitch = f2;
        this.roll = f3;
        this.top = f4;
        this.left = f5;
        this.bottom = f6;
        this.right = f7;
        this.width = i2;
        this.height = i3;
        this.isFace = z;
        this.isAutogenReady = z2;
        this.isEyesClosed = z3;
    }

    public final void setData(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        this.data = bArr;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getBytesPerRow() {
        return this.bytesPerRow;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getPitch() {
        return this.pitch;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getRoll() {
        return this.roll;
    }

    public final float getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getYaw() {
        return this.yaw;
    }

    public final boolean isAutogenReady() {
        return this.isAutogenReady;
    }

    public final boolean isEyesClosed() {
        return this.isEyesClosed;
    }

    public final boolean isFace() {
        return this.isFace;
    }
}
