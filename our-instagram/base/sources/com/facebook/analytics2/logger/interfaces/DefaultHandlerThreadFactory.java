package com.facebook.analytics2.logger.interfaces;

import X.AbstractC09770fa;
import X.InterfaceC37781pG;
import android.content.Context;
import android.os.HandlerThread;

/* loaded from: classes12.dex */
public class DefaultHandlerThreadFactory implements InterfaceC37781pG {
    @Override // X.InterfaceC37781pG
    public final boolean E7g() {
        return true;
    }

    @Override // X.InterfaceC37781pG
    public final HandlerThread ALb(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }

    public DefaultHandlerThreadFactory(Context context) {
    }
}
