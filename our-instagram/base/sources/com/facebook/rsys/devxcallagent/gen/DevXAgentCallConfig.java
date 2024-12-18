package com.facebook.rsys.devxcallagent.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class DevXAgentCallConfig {
    public static C2N9 CONVERTER = C55648OnZ.A00(29);
    public static long sMcfTypeId;
    public final AudioProxy audioProxy;
    public final CameraProxy cameraProxy;
    public final ArrayList features;
    public final ScreenShareProxy screenShareProxy;

    public static native DevXAgentCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DevXAgentCallConfig)) {
                return false;
            }
            DevXAgentCallConfig devXAgentCallConfig = (DevXAgentCallConfig) obj;
            CameraProxy cameraProxy = this.cameraProxy;
            CameraProxy cameraProxy2 = devXAgentCallConfig.cameraProxy;
            if (cameraProxy == null) {
                if (cameraProxy2 != null) {
                    return false;
                }
            } else if (!cameraProxy.equals(cameraProxy2)) {
                return false;
            }
            AudioProxy audioProxy = this.audioProxy;
            AudioProxy audioProxy2 = devXAgentCallConfig.audioProxy;
            if (audioProxy == null) {
                if (audioProxy2 != null) {
                    return false;
                }
            } else if (!audioProxy.equals(audioProxy2)) {
                return false;
            }
            ScreenShareProxy screenShareProxy = this.screenShareProxy;
            ScreenShareProxy screenShareProxy2 = devXAgentCallConfig.screenShareProxy;
            if (screenShareProxy == null) {
                if (screenShareProxy2 != null) {
                    return false;
                }
            } else if (!screenShareProxy.equals(screenShareProxy2)) {
                return false;
            }
            ArrayList arrayList = this.features;
            ArrayList arrayList2 = devXAgentCallConfig.features;
            if (arrayList != null) {
                if (!arrayList.equals(arrayList2)) {
                    return false;
                }
            } else if (arrayList2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((JQ0.A01(AbstractC167017dG.A0M(this.cameraProxy)) + AbstractC167017dG.A0M(this.audioProxy)) * 31) + AbstractC167017dG.A0M(this.screenShareProxy)) * 31) + AbstractC166997dE.A0I(this.features);
    }

    public DevXAgentCallConfig(CameraProxy cameraProxy, AudioProxy audioProxy, ScreenShareProxy screenShareProxy, ArrayList arrayList) {
        this.cameraProxy = cameraProxy;
        this.audioProxy = audioProxy;
        this.screenShareProxy = screenShareProxy;
        this.features = arrayList;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DevXAgentCallConfig{cameraProxy=");
        A1C.append(this.cameraProxy);
        A1C.append(",audioProxy=");
        A1C.append(this.audioProxy);
        A1C.append(",screenShareProxy=");
        A1C.append(this.screenShareProxy);
        A1C.append(",features=");
        return JQ0.A0l(this.features, A1C);
    }
}
