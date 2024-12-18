package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.InterfaceC150176pN;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;

/* loaded from: classes4.dex */
public class CancelableLoadToken implements CancelableToken {
    public InterfaceC150176pN mLoadToken;

    @Override // com.facebook.cameracore.ardelivery.listener.CancelableToken
    public boolean cancel() {
        InterfaceC150176pN interfaceC150176pN = this.mLoadToken;
        if (interfaceC150176pN != null) {
            return interfaceC150176pN.cancel();
        }
        return false;
    }

    public CancelableLoadToken(InterfaceC150176pN interfaceC150176pN) {
        this.mLoadToken = interfaceC150176pN;
    }
}
