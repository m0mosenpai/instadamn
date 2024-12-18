package com.meta.hera.engine.device;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class DeviceActions$UpdatePeripheralState extends RaB implements InterfaceC65446TkI {
    public static final DeviceActions$UpdatePeripheralState DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int DEVICE_PERIPHERAL_STATE_FIELD_NUMBER = 2;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int PHONE_PERIPHERAL_STATE_FIELD_NUMBER = 3;
    public Object delta_;
    public int deltaCase_ = 0;
    public String deviceId_ = "";

    static {
        DeviceActions$UpdatePeripheralState deviceActions$UpdatePeripheralState = new DeviceActions$UpdatePeripheralState();
        DEFAULT_INSTANCE = deviceActions$UpdatePeripheralState;
        TEY.A03(DeviceActions$UpdatePeripheralState.class, deviceActions$UpdatePeripheralState);
    }
}
