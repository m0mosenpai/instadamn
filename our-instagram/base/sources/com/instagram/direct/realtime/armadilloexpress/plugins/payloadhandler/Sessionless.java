package com.instagram.direct.realtime.armadilloexpress.plugins.payloadhandler;

import java.util.List;

/* loaded from: classes8.dex */
public abstract class Sessionless {
    public abstract List IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayload(String str, byte[] bArr, long j);

    private List IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayloadJNI(String str, byte[] bArr, long j) {
        List IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayload = IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayload(str, bArr, j);
        if (IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayload == null) {
            return null;
        }
        return IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayload;
    }
}
