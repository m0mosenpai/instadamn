package com.facebook.rsys.filelogging.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class FileLogUploadCallbacks {

    /* loaded from: classes12.dex */
    public final class CProxy extends FileLogUploadCallbacks {
        public final NativeHolder mNativeHolder;

        public static native FileLogUploadCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadCallbacks
        public native void cancel();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadCallbacks
        public native void failure();

        public native int hashCode();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadCallbacks
        public native void success(String str);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof FileLogUploadCallbacks)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cancel();

    public abstract void failure();

    public abstract void success(String str);
}
