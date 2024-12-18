package com.facebook.react.uimanager.events;

import X.InterfaceC65657Tqj;
import X.R6D;

/* loaded from: classes10.dex */
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i, int i2, String str, InterfaceC65657Tqj interfaceC65657Tqj);

    void receiveEvent(int i, int i2, String str, boolean z, int i3, InterfaceC65657Tqj interfaceC65657Tqj, int i4);

    @Deprecated
    void receiveTouches(R6D r6d);
}
