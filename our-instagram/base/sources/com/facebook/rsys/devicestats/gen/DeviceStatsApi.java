package com.facebook.rsys.devicestats.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class DeviceStatsApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(27);

    /* loaded from: classes9.dex */
    public final class CProxy extends DeviceStatsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DeviceStatsApi createDeviceStatsApi();

        public static native DeviceStatsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devicestats.gen.DeviceStatsApi
        public native BatteryStatsReader getBatteryStatsReader();

        public native int hashCode();

        @Override // com.facebook.rsys.devicestats.gen.DeviceStatsApi
        public native void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof DeviceStatsApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract BatteryStatsReader getBatteryStatsReader();

    public abstract void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);
}
