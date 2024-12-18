package com.facebook.rsys.audio.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class AudioProxy {
    public static C2N9 CONVERTER = C55648OnZ.A00(4);

    /* loaded from: classes9.dex */
    public final class CProxy extends AudioProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native ArrayList createAvailableAudioInputRoutes();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native ArrayList createAvailableAudioOutputRoutes();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setApi(AudioApi audioApi);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioInputRoute(AudioInputRoute audioInputRoute);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioOn(boolean z, boolean z2);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2);

        @Override // com.facebook.rsys.audio.gen.AudioProxy
        public native void setIsCallActive(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AudioProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ArrayList createAvailableAudioInputRoutes();

    public abstract ArrayList createAvailableAudioOutputRoutes();

    public abstract void setApi(AudioApi audioApi);

    public abstract void setAudioDeviceModule(AudioDeviceModule audioDeviceModule);

    public abstract void setAudioInputRoute(AudioInputRoute audioInputRoute);

    public abstract void setAudioOn(boolean z, boolean z2);

    public abstract void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2);

    public abstract void setIsCallActive(boolean z);
}
