package com.facebook.assistant.stella.ipc.common.request;

import X.C52028N0a;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes9.dex */
public abstract class IpcRequest {
    public final C52028N0a A00;
    public final ImmutableMap A01;

    public IpcRequest(C52028N0a c52028N0a, ImmutableMap immutableMap) {
        this.A01 = immutableMap;
        this.A00 = c52028N0a;
    }
}
