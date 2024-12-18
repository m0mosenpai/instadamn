package com.instagram.direct.msys.plugins.mcidberrorhandlerplugin;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public class IGDirectAndroidMCIDBErrorPluginCallbacks {

    /* loaded from: classes12.dex */
    public class MCIDBErrorHandlerCompletionCallback {
        public final NativeHolder mNativeHolder;

        private native void runJNI(boolean z);

        static {
            C09170dP.A0C("IGDirectAndroidMCIDBErrorPluginjni");
        }

        public MCIDBErrorHandlerCompletionCallback(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public void run(boolean z) {
            runJNI(z);
        }
    }
}
