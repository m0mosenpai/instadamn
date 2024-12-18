package com.facebook.rsys.appstate.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class AppstateApi {
    public static C2N9 CONVERTER = YAN.A00(0);

    /* loaded from: classes12.dex */
    public final class CProxy extends AppstateApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AppstateApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsBackgrounded(boolean z);

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsPictureInPicture(boolean z);

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsScreenOff(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof AppstateApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setIsBackgrounded(boolean z);

    public abstract void setIsPictureInPicture(boolean z);

    public abstract void setIsScreenOff(boolean z);
}
