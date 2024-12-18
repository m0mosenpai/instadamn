package com.instagram.direct.msys.plugins.mcidberrorhandlerplugin;

import X.C14360o3;
import com.facebook.msys.mcf.MsysError;
import com.instagram.direct.msys.plugins.mcidberrorhandlerplugin.IGDirectAndroidMCIDBErrorPluginCallbacks;

/* loaded from: classes12.dex */
public final class IGDirectAndroidMCIDBErrorPluginSessionless extends Sessionless {
    @Override // com.instagram.direct.msys.plugins.mcidberrorhandlerplugin.Sessionless
    public void IGDirectAndroidMCIDBErrorSessionlessImpl_MCIDBErrorHandlerHandleDBOpenFailure(int i, MsysError msysError, IGDirectAndroidMCIDBErrorPluginCallbacks.MCIDBErrorHandlerCompletionCallback mCIDBErrorHandlerCompletionCallback) {
        C14360o3.A0B(mCIDBErrorHandlerCompletionCallback, 2);
        mCIDBErrorHandlerCompletionCallback.run(true);
    }
}
