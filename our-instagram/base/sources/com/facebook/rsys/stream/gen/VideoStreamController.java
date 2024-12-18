package com.facebook.rsys.stream.gen;

import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class VideoStreamController {
    public static C2N9 CONVERTER = YAM.A00(57);

    /* loaded from: classes12.dex */
    public final class CProxy extends VideoStreamController {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoStreamController createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native int getError();

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void handleData(byte[] bArr);

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void handleFrame(RSVideoFrame rSVideoFrame);

        public native int hashCode();

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void setCapturePropertiesListener(VideoCapturePropertiesListener videoCapturePropertiesListener);

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void setEnable(boolean z);

        @Override // com.facebook.rsys.stream.gen.VideoStreamController
        public native void setVideoStreamSendParams(VideoStreamSendParams videoStreamSendParams);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof VideoStreamController)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract int getError();

    public abstract void handleData(byte[] bArr);

    public abstract void handleFrame(RSVideoFrame rSVideoFrame);

    public abstract void setCapturePropertiesListener(VideoCapturePropertiesListener videoCapturePropertiesListener);

    public abstract void setEnable(boolean z);

    public abstract void setVideoStreamSendParams(VideoStreamSendParams videoStreamSendParams);
}
