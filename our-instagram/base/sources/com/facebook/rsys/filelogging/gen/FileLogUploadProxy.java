package com.facebook.rsys.filelogging.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class FileLogUploadProxy {

    /* loaded from: classes12.dex */
    public final class CProxy extends FileLogUploadProxy {
        public final NativeHolder mNativeHolder;

        public static native FileLogUploadProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadProxy
        public native void upload(byte[] bArr, String str, FileLogUploadCallbacks fileLogUploadCallbacks);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof FileLogUploadProxy)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void upload(byte[] bArr, String str, FileLogUploadCallbacks fileLogUploadCallbacks);
}
