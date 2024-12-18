package com.facebook.rsys.videoeffectcommunication.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.AbstractC50523MSb;
import X.C2N9;
import X.JQ0;
import X.YAL;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class VideoEffectCommunicationMultipeerMessage {
    public static C2N9 CONVERTER = new YAL(8);
    public static long sMcfTypeId;
    public final byte[] binaryMessage;
    public final long effectId;
    public final String message;
    public final String senderId;
    public final String topic;

    public static native VideoEffectCommunicationMultipeerMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationMultipeerMessage)) {
                return false;
            }
            VideoEffectCommunicationMultipeerMessage videoEffectCommunicationMultipeerMessage = (VideoEffectCommunicationMultipeerMessage) obj;
            if (this.effectId == videoEffectCommunicationMultipeerMessage.effectId && this.topic.equals(videoEffectCommunicationMultipeerMessage.topic) && this.message.equals(videoEffectCommunicationMultipeerMessage.message)) {
                byte[] bArr = this.binaryMessage;
                byte[] bArr2 = videoEffectCommunicationMultipeerMessage.binaryMessage;
                if (bArr == null) {
                    if (bArr2 != null) {
                        return false;
                    }
                } else if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                String str = this.senderId;
                String str2 = videoEffectCommunicationMultipeerMessage.senderId;
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC166997dE.A0K(this.message, AbstractC166997dE.A0K(this.topic, JQ0.A01(AbstractC25228BEl.A03(this.effectId)))) + AbstractC167017dG.A0M(this.binaryMessage)) * 31) + AbstractC25227BEk.A07(this.senderId);
    }

    public VideoEffectCommunicationMultipeerMessage(long j, String str, String str2, byte[] bArr, String str3) {
        str.getClass();
        str2.getClass();
        this.effectId = j;
        this.topic = str;
        this.message = str2;
        this.binaryMessage = bArr;
        this.senderId = str3;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEffectCommunicationMultipeerMessage{effectId=");
        A1C.append(this.effectId);
        A1C.append(",topic=");
        A1C.append(this.topic);
        A1C.append(",message=");
        A1C.append(this.message);
        A1C.append(",binaryMessage=");
        A1C.append(this.binaryMessage);
        A1C.append(",senderId=");
        return AbstractC50523MSb.A0W(this.senderId, A1C);
    }
}
