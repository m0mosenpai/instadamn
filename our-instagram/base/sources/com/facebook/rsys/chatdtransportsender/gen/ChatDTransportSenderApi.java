package com.facebook.rsys.chatdtransportsender.gen;

import X.C2N9;
import X.XkB;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mcs.SyncHandler;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class ChatDTransportSenderApi {
    public static C2N9 CONVERTER = YAN.A00(31);

    /* loaded from: classes12.dex */
    public final class CProxy extends ChatDTransportSenderApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ChatDTransportSenderApi createApiJni(SyncHandler syncHandler, int i, double d, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4);

        public static native ChatDTransportSenderApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi
        public native void activeConnection();

        @Override // com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi
        public native void earlyConnection(int i);

        @Override // com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi
        public native boolean hasChatDSender();

        public native int hashCode();

        @Override // com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi
        public native void idleConnection();

        @Override // com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi
        public native void send(ChatDTransportSenderSendInput chatDTransportSenderSendInput);

        @Override // com.facebook.rsys.chatdtransportsender.gen.ChatDTransportSenderApi
        public native boolean shouldCreateMqttTransport();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof ChatDTransportSenderApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        static {
            XkB.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void activeConnection();

    public abstract void earlyConnection(int i);

    public abstract boolean hasChatDSender();

    public abstract void idleConnection();

    public abstract void send(ChatDTransportSenderSendInput chatDTransportSenderSendInput);

    public abstract boolean shouldCreateMqttTransport();
}
