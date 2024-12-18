package com.instagram.rtc.rsys.proxies;

import com.instagram.rtc.rsys.models.HttpRequest;

/* loaded from: classes9.dex */
public abstract class SignalingSenderProxy {
    public abstract void sendHttpSignalingMessage(HttpRequest httpRequest, SignalingHttpSenderCallback signalingHttpSenderCallback, boolean z);
}
