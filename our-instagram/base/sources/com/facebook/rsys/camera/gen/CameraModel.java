package com.facebook.rsys.camera.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class CameraModel {
    public static C2N9 CONVERTER = C55648OnZ.A00(21);
    public static long sMcfTypeId;
    public final int activeCameraIdx;
    public final boolean cameraEverOn;
    public final boolean cameraOn;
    public final boolean cameraPaused;
    public final int cameraState;
    public final ArrayList cameras;
    public final StreamInfo streamInfo;
    public final int targetCaptureResolutionHeight;
    public final int targetCaptureResolutionWidth;
    public final int targetFps;
    public final boolean userHasDeclinedVideoPrompt;

    public static native CameraModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraModel)) {
            return false;
        }
        CameraModel cameraModel = (CameraModel) obj;
        return this.cameraOn == cameraModel.cameraOn && this.cameraState == cameraModel.cameraState && this.cameraPaused == cameraModel.cameraPaused && this.activeCameraIdx == cameraModel.activeCameraIdx && this.cameras.equals(cameraModel.cameras) && this.cameraEverOn == cameraModel.cameraEverOn && this.userHasDeclinedVideoPrompt == cameraModel.userHasDeclinedVideoPrompt && this.targetFps == cameraModel.targetFps && this.targetCaptureResolutionWidth == cameraModel.targetCaptureResolutionWidth && this.targetCaptureResolutionHeight == cameraModel.targetCaptureResolutionHeight && this.streamInfo.equals(cameraModel.streamInfo);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.streamInfo, (((((((((AbstractC166997dE.A0J(this.cameras, (((((JQ0.A01(this.cameraOn ? 1 : 0) + this.cameraState) * 31) + (this.cameraPaused ? 1 : 0)) * 31) + this.activeCameraIdx) * 31) + (this.cameraEverOn ? 1 : 0)) * 31) + (this.userHasDeclinedVideoPrompt ? 1 : 0)) * 31) + this.targetFps) * 31) + this.targetCaptureResolutionWidth) * 31) + this.targetCaptureResolutionHeight) * 31);
    }

    public CameraModel(boolean z, int i, boolean z2, int i2, ArrayList arrayList, boolean z3, boolean z4, int i3, int i4, int i5, StreamInfo streamInfo) {
        arrayList.getClass();
        streamInfo.getClass();
        this.cameraOn = z;
        this.cameraState = i;
        this.cameraPaused = z2;
        this.activeCameraIdx = i2;
        this.cameras = arrayList;
        this.cameraEverOn = z3;
        this.userHasDeclinedVideoPrompt = z4;
        this.targetFps = i3;
        this.targetCaptureResolutionWidth = i4;
        this.targetCaptureResolutionHeight = i5;
        this.streamInfo = streamInfo;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CameraModel{cameraOn=");
        A1C.append(this.cameraOn);
        A1C.append(",cameraState=");
        A1C.append(this.cameraState);
        A1C.append(",cameraPaused=");
        A1C.append(this.cameraPaused);
        A1C.append(",activeCameraIdx=");
        A1C.append(this.activeCameraIdx);
        A1C.append(",cameras=");
        A1C.append(this.cameras);
        A1C.append(",cameraEverOn=");
        A1C.append(this.cameraEverOn);
        A1C.append(",userHasDeclinedVideoPrompt=");
        A1C.append(this.userHasDeclinedVideoPrompt);
        A1C.append(",targetFps=");
        A1C.append(this.targetFps);
        A1C.append(",targetCaptureResolutionWidth=");
        A1C.append(this.targetCaptureResolutionWidth);
        A1C.append(",targetCaptureResolutionHeight=");
        A1C.append(this.targetCaptureResolutionHeight);
        A1C.append(",streamInfo=");
        return JQ0.A0l(this.streamInfo, A1C);
    }
}
