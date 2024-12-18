package com.meta.hera.engine.device;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class DeviceActions$UnregisterDevice extends RaB implements InterfaceC65446TkI {
    public static final DeviceActions$UnregisterDevice DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static volatile InterfaceC65289ThM PARSER;
    public String deviceId_ = "";

    static {
        DeviceActions$UnregisterDevice deviceActions$UnregisterDevice = new DeviceActions$UnregisterDevice();
        DEFAULT_INSTANCE = deviceActions$UnregisterDevice;
        TEY.A03(DeviceActions$UnregisterDevice.class, deviceActions$UnregisterDevice);
    }
}
