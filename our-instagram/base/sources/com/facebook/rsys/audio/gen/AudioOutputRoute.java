package com.facebook.rsys.audio.gen;

import X.AbstractC25226BEj;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C2N9;
import X.C55648OnZ;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class AudioOutputRoute {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final AudioOutputRoute UNKNOWN = new AudioOutputRoute("unknown_device", "unknown");
    public static final AudioOutputRoute EARPIECE = new AudioOutputRoute("earpiece_device", "earpiece");
    public static final AudioOutputRoute SPEAKER = new AudioOutputRoute("speaker_device", "speaker");
    public static final AudioOutputRoute HEADSET = new AudioOutputRoute("headset_device", "headset");
    public static final AudioOutputRoute BLUETOOTH = new AudioOutputRoute("bluetooth_device", NetInfoModule.CONNECTION_TYPE_BLUETOOTH);
    public static final AudioOutputRoute BLUETOOTH_A2DP = new AudioOutputRoute("bluetooth_device", "BluetoothA2DPOutput");
    public static final AudioOutputRoute BLUETOOTH_LE = new AudioOutputRoute("bluetooth_device", "BluetoothLE");
    public static final AudioOutputRoute BLUETOOTH_HFP = new AudioOutputRoute("bluetooth_device", "BluetoothHFP");
    public static C2N9 CONVERTER = C55648OnZ.A00(3);

    public static native AudioOutputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioOutputRoute)) {
            return false;
        }
        AudioOutputRoute audioOutputRoute = (AudioOutputRoute) obj;
        return this.identifier.equals(audioOutputRoute.identifier) && this.name.equals(audioOutputRoute.name);
    }

    public int hashCode() {
        return AbstractC25226BEj.A03(this.name, AbstractC50523MSb.A02(this.identifier));
    }

    public String toString() {
        return AnonymousClass001.A11("AudioOutputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public AudioOutputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}
