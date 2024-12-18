package com.meta.hera.engine.device;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class DevicePeripheralState extends RaB implements InterfaceC65446TkI {
    public static final DevicePeripheralState DEFAULT_INSTANCE;
    public static final int DEVICE_BATTERY_STATE_FIELD_NUMBER = 4;
    public static final int DEVICE_CAMERA_ERROR_STATE_FIELD_NUMBER = 6;
    public static final int DEVICE_PEAK_POWER_STATE_FIELD_NUMBER = 5;
    public static final int DEVICE_THERMAL_STATE_FIELD_NUMBER = 3;
    public static final int GLASSES_HINGE_STATE_FIELD_NUMBER = 1;
    public static final int GLASSES_MOUNT_STATE_FIELD_NUMBER = 2;
    public static volatile InterfaceC65289ThM PARSER;
    public int bitField0_;
    public int deviceBatteryState_;
    public int deviceCameraErrorState_;
    public int devicePeakPowerState_;
    public int deviceThermalState_;
    public int glassesHingeState_;
    public int glassesMountState_;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.RaB, java.lang.Object, com.meta.hera.engine.device.DevicePeripheralState] */
    static {
        ?? raB = new RaB();
        DEFAULT_INSTANCE = raB;
        TEY.A03(DevicePeripheralState.class, raB);
    }
}
