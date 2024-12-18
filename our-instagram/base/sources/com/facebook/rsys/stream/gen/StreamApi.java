package com.facebook.rsys.stream.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class StreamApi {
    public static C2N9 CONVERTER = YAM.A00(53);

    /* loaded from: classes12.dex */
    public final class CProxy extends StreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.stream.gen.StreamApi
        public native VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof StreamApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);
}
