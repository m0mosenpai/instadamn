package com.facebook.rsys.callmanager.callclient.gen;

import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callmanager.gen.UserContext;

/* loaded from: classes9.dex */
public abstract class CallManagerCallClientCallbacks {
    public abstract CallClient createCallClient(String str, UserContext userContext, CallContext callContext);

    public abstract void onCallAdded(CallClient callClient);

    public abstract void onCallRemoved(CallClient callClient);
}
