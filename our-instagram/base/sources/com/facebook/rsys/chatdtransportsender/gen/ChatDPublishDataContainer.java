package com.facebook.rsys.chatdtransportsender.gen;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC72049XLp;
import X.C2N9;
import X.JQ0;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes12.dex */
public class ChatDPublishDataContainer {
    public static C2N9 CONVERTER = YAN.A00(30);
    public static long sMcfTypeId;
    public final Map additionalAnnotations;
    public final SignalingTransportCallback callbacks;
    public final byte[] data;
    public final SignalingTransportCallbackExt extCallbacks;
    public final Long flowId;
    public final String messageId;
    public final String messageType;
    public final String remoteSignalingId;
    public final McfReference sender;
    public final String traceId;

    public static native ChatDPublishDataContainer createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChatDPublishDataContainer)) {
                return false;
            }
            ChatDPublishDataContainer chatDPublishDataContainer = (ChatDPublishDataContainer) obj;
            if (this.sender.equals(chatDPublishDataContainer.sender) && Arrays.equals(this.data, chatDPublishDataContainer.data)) {
                Long l = this.flowId;
                Long l2 = chatDPublishDataContainer.flowId;
                if (l == null) {
                    if (l2 != null) {
                        return false;
                    }
                } else if (!l.equals(l2)) {
                    return false;
                }
                String str = this.traceId;
                String str2 = chatDPublishDataContainer.traceId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.messageId;
                String str4 = chatDPublishDataContainer.messageId;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.remoteSignalingId;
                String str6 = chatDPublishDataContainer.remoteSignalingId;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                SignalingTransportCallback signalingTransportCallback = this.callbacks;
                SignalingTransportCallback signalingTransportCallback2 = chatDPublishDataContainer.callbacks;
                if (signalingTransportCallback == null) {
                    if (signalingTransportCallback2 != null) {
                        return false;
                    }
                } else if (!signalingTransportCallback.equals(signalingTransportCallback2)) {
                    return false;
                }
                SignalingTransportCallbackExt signalingTransportCallbackExt = this.extCallbacks;
                SignalingTransportCallbackExt signalingTransportCallbackExt2 = chatDPublishDataContainer.extCallbacks;
                if (signalingTransportCallbackExt == null) {
                    if (signalingTransportCallbackExt2 != null) {
                        return false;
                    }
                } else if (!signalingTransportCallbackExt.equals(signalingTransportCallbackExt2)) {
                    return false;
                }
                String str7 = this.messageType;
                String str8 = chatDPublishDataContainer.messageType;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                Map map = this.additionalAnnotations;
                Map map2 = chatDPublishDataContainer.additionalAnnotations;
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
        int A02 = (((((((((((((((AbstractC72049XLp.A02(this.sender) + Arrays.hashCode(this.data)) * 31) + AbstractC167017dG.A0M(this.flowId)) * 31) + AbstractC167017dG.A0O(this.traceId)) * 31) + AbstractC167017dG.A0O(this.messageId)) * 31) + AbstractC167017dG.A0O(this.remoteSignalingId)) * 31) + AbstractC167017dG.A0M(this.callbacks)) * 31) + AbstractC167017dG.A0M(this.extCallbacks)) * 31) + AbstractC167017dG.A0O(this.messageType)) * 31;
        Map map = this.additionalAnnotations;
        if (map != null) {
            i = map.hashCode();
        }
        return A02 + i;
    }

    public ChatDPublishDataContainer(McfReference mcfReference, byte[] bArr, Long l, String str, String str2, String str3, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, String str4, Map map) {
        mcfReference.getClass();
        bArr.getClass();
        this.sender = mcfReference;
        this.data = bArr;
        this.flowId = l;
        this.traceId = str;
        this.messageId = str2;
        this.remoteSignalingId = str3;
        this.callbacks = signalingTransportCallback;
        this.extCallbacks = signalingTransportCallbackExt;
        this.messageType = str4;
        this.additionalAnnotations = map;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ChatDPublishDataContainer{sender=");
        A1C.append(this.sender);
        A1C.append(",data=");
        A1C.append(this.data);
        A1C.append(",flowId=");
        A1C.append(this.flowId);
        A1C.append(",traceId=");
        A1C.append(this.traceId);
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
        A1C.append(",additionalAnnotations=");
        return JQ0.A0l(this.additionalAnnotations, A1C);
    }
}
