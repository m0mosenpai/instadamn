package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperObject;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public class FlipperSocketEventHandlerImpl {
    public final HybridData mHybridData;

    private native FlipperObject reportAuthenticationChallengeReceived();

    private native void reportConnectionEvent(int i, String str);

    private native void reportMessageReceived(String str);

    public FlipperSocketEventHandlerImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
