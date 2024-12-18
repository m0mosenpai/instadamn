package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.AbstractC167017dG;
import X.BB1;
import X.LS4;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;

/* loaded from: classes8.dex */
public final class MultipeerServiceDelegateBridge {
    public BB1 delegate;

    public final void sendBinaryMessage(String str, byte[] bArr, boolean z) {
        BB1 bb1 = this.delegate;
        if (bb1 != null) {
            boolean A1a = AbstractC167017dG.A1a(str, bArr);
            VideoEffectCommunicationApi videoEffectCommunicationApi = ((LS4) bb1).A02.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.sendMultipeerBinaryMessage(str, bArr, A1a);
            }
        }
    }

    public final void sendMessage(String str, String str2, boolean z) {
        BB1 bb1 = this.delegate;
        if (bb1 != null) {
            boolean A1a = AbstractC167017dG.A1a(str, str2);
            VideoEffectCommunicationApi videoEffectCommunicationApi = ((LS4) bb1).A02.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.sendMultipeerMessage(str, str2, A1a);
            }
        }
    }

    public final void setBinaryMessageTopicHandler(String str, Object obj) {
        BB1 bb1 = this.delegate;
        if (bb1 != null) {
            AbstractC167017dG.A1N(str, obj);
            ((LS4) bb1).A00.put(str, obj);
        }
    }

    public final void setTopicHandler(String str, Object obj) {
        BB1 bb1 = this.delegate;
        if (bb1 != null) {
            AbstractC167017dG.A1N(str, obj);
            ((LS4) bb1).A01.put(str, obj);
        }
    }
}
