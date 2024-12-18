package com.meta.hera.engine.device;

import X.InterfaceC65289ThM;
import X.InterfaceC65446TkI;
import X.RaB;
import X.TEY;

/* loaded from: classes10.dex */
public final class PhonePeripheralState extends RaB implements InterfaceC65446TkI {
    public static final PhonePeripheralState DEFAULT_INSTANCE;
    public static volatile InterfaceC65289ThM PARSER = null;
    public static final int PHONE_APPLICATION_LIFECYCLE_STATE_FIELD_NUMBER = 1;
    public int bitField0_;
    public int phoneApplicationLifecycleState_;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.RaB, com.meta.hera.engine.device.PhonePeripheralState, java.lang.Object] */
    static {
        ?? raB = new RaB();
        DEFAULT_INSTANCE = raB;
        TEY.A03(PhonePeripheralState.class, raB);
    }
}
