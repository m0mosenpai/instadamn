package com.facebook.rsys.chatdtransportsender.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes12.dex */
public class ChatDTransportSenderSendInput {
    public static C2N9 CONVERTER = YAN.A00(32);
    public static long sMcfTypeId;
    public final SignalingTransportCallback callbacks;
    public final SignalingTransportCallbackExt extCallbacks;
    public final Long flowId;
    public final Map loggingAnnotations;
    public final byte[] message;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;

    public static native ChatDTransportSenderSendInput createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatDTransportSenderSendInput)) {
                return false;
            }
            ChatDTransportSenderSendInput chatDTransportSenderSendInput = (ChatDTransportSenderSendInput) obj;
            if (Arrays.equals(this.message, chatDTransportSenderSendInput.message)) {
                Long l = this.flowId;
                Long l2 = chatDTransportSenderSendInput.flowId;
                if (l == null) {
                    if (l2 != null) {
                        return false;
                    }
                } else if (!l.equals(l2)) {
                    return false;
                }
                String str = this.messageId;
                String str2 = chatDTransportSenderSendInput.messageId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.remoteSignalingId;
                String str4 = chatDTransportSenderSendInput.remoteSignalingId;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                SignalingTransportCallback signalingTransportCallback = this.callbacks;
                SignalingTransportCallback signalingTransportCallback2 = chatDTransportSenderSendInput.callbacks;
                if (signalingTransportCallback == null) {
                    if (signalingTransportCallback2 != null) {
                        return false;
                    }
                } else if (!signalingTransportCallback.equals(signalingTransportCallback2)) {
                    return false;
                }
                SignalingTransportCallbackExt signalingTransportCallbackExt = this.extCallbacks;
                SignalingTransportCallbackExt signalingTransportCallbackExt2 = chatDTransportSenderSendInput.extCallbacks;
                if (signalingTransportCallbackExt == null) {
                    if (signalingTransportCallbackExt2 != null) {
                        return false;
                    }
                } else if (!signalingTransportCallbackExt.equals(signalingTransportCallbackExt2)) {
                    return false;
                }
                String str5 = this.messageType;
                String str6 = chatDTransportSenderSendInput.messageType;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                Map map = this.loggingAnnotations;
                Map map2 = chatDTransportSenderSendInput.loggingAnnotations;
                if (map != null) {
                    if (!map.equals(map2)) {
                        return false;
                    }
                } else if (map2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A01 = (((((((((((JQ0.A01(Arrays.hashCode(this.message)) + AbstractC167017dG.A0M(this.flowId)) * 31) + AbstractC167017dG.A0O(this.messageId)) * 31) + AbstractC167017dG.A0O(this.remoteSignalingId)) * 31) + AbstractC167017dG.A0M(this.callbacks)) * 31) + AbstractC167017dG.A0M(this.extCallbacks)) * 31) + AbstractC167017dG.A0O(this.messageType)) * 31;
        Map map = this.loggingAnnotations;
        if (map != null) {
            i = map.hashCode();
        }
        return A01 + i;
    }

    public ChatDTransportSenderSendInput(byte[] bArr, Long l, String str, String str2, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, String str3, Map map) {
        bArr.getClass();
        this.message = bArr;
        this.flowId = l;
        this.messageId = str;
        this.remoteSignalingId = str2;
        this.callbacks = signalingTransportCallback;
        this.extCallbacks = signalingTransportCallbackExt;
        this.messageType = str3;
        this.loggingAnnotations = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ChatDTransportSenderSendInput{message=");
        A1C.append(this.message);
        A1C.append(",flowId=");
        A1C.append(this.flowId);
        A1C.append(",messageId=");
        A1C.append(this.messageId);
        A1C.append(",remoteSignalingId=");
        A1C.append(this.remoteSignalingId);
        A1C.append(",callbacks=");
        A1C.append(this.callbacks);
        A1C.append(",extCallbacks=");
        A1C.append(this.extCallbacks);
        A1C.append(",messageType=");
        A1C.append(this.messageType);
        A1C.append(",loggingAnnotations=");
        return JQ0.A0l(this.loggingAnnotations, A1C);
    }
}
