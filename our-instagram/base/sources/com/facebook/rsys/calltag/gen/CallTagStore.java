package com.facebook.rsys.calltag.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class CallTagStore {

    /* loaded from: classes12.dex */
    public final class CProxy extends CallTagStore {
        public final NativeHolder mNativeHolder;

        public static native CallTagStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.calltag.gen.CallTagStore
        public native void submitTagUpdate(String str, long j, String str2);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CallTagStore)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void submitTagUpdate(String str, long j, String str2);
}
