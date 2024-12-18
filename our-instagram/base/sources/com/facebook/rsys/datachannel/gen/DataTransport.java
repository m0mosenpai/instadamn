package com.facebook.rsys.datachannel.gen;

import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class DataTransport {
    public static C2N9 CONVERTER = YAN.A00(43);

    /* loaded from: classes12.dex */
    public final class CProxy extends DataTransport {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DataTransport createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void sendData(byte[] bArr);

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void setListener(DataTransportListener dataTransportListener);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof DataTransport)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendData(byte[] bArr);

    public abstract void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

    public abstract void setListener(DataTransportListener dataTransportListener);
}
