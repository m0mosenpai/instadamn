package com.meta.hera.engine.device;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class Device extends RaB implements InterfaceC65446TkI {
    public static final Device DEFAULT_INSTANCE;
    public static final int DEVICE_PERIPHERAL_STATE_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_HEARTBEAT_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int PHONE_PERIPHERAL_STATE_FIELD_NUMBER = 7;
    public static final int ROLE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 4;
    public int bitField0_;
    public long lastHeartbeatTimestampMs_;
    public Object peripheralState_;
    public int role_;
    public int status_;
    public int peripheralStateCase_ = 0;
    public String id_ = "";
    public String name_ = "";

    static {
        Device device = new Device();
        DEFAULT_INSTANCE = device;
        TEY.A03(Device.class, device);
    }
}
