package com.meta.hera.engine.device;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.InterfaceC65692TsE;
import X.RYz;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class DeviceState extends RaB implements InterfaceC65446TkI {
    public static final DeviceState DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 1;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int SEARCH_REQUEST_ID_FIELD_NUMBER = 2;
    public InterfaceC65692TsE devices_ = RYz.A02;
    public int searchRequestId_;

    static {
        DeviceState deviceState = new DeviceState();
        DEFAULT_INSTANCE = deviceState;
        TEY.A03(DeviceState.class, deviceState);
    }
}
