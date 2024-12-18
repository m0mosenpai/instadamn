package com.facebook.rsys.livevideo.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class LiveVideoBroadcastLifecycleCallback {
    public static C2N9 CONVERTER = YAN.A00(57);

    /* loaded from: classes12.dex */
    public final class CProxy extends LiveVideoBroadcastLifecycleCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LiveVideoBroadcastLifecycleCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastCancelled(boolean z);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastCreated(boolean z);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastEnded(boolean z);

        @Override // com.facebook.rsys.livevideo.gen.LiveVideoBroadcastLifecycleCallback
        public native void roomsBroadcastStarted(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof LiveVideoBroadcastLifecycleCallback)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void roomsBroadcastCancelled(boolean z);

    public abstract void roomsBroadcastCreated(boolean z);

    public abstract void roomsBroadcastEnded(boolean z);

    public abstract void roomsBroadcastStarted(boolean z);
}
