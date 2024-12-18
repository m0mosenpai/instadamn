package com.facebook.rsys.photobooth.gen;

import X.C2N9;
import X.C55648OnZ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes9.dex */
public abstract class PhotoboothApi {
    public static C2N9 CONVERTER = C55648OnZ.A00(63);

    /* loaded from: classes9.dex */
    public final class CProxy extends PhotoboothApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native PhotoboothApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.photobooth.gen.PhotoboothApi
        public native void cancelPhotoboothSession();

        public native int hashCode();

        @Override // com.facebook.rsys.photobooth.gen.PhotoboothApi
        public native void sendSnapshotNotification();

        @Override // com.facebook.rsys.photobooth.gen.PhotoboothApi
        public native void startPhotoboothSession();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof PhotoboothApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cancelPhotoboothSession();

    public abstract void sendSnapshotNotification();

    public abstract void startPhotoboothSession();
}
