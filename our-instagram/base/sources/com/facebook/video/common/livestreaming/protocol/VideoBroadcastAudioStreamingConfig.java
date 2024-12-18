package com.facebook.video.common.livestreaming.protocol;

import X.C51697MsS;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = VideoBroadcastAudioStreamingConfigDeserializer.class)
/* loaded from: classes10.dex */
public final class VideoBroadcastAudioStreamingConfig {

    @JsonProperty("bitRate")
    public final int bitRate;

    @JsonProperty("channels")
    public final int channels;

    @JsonProperty("profile")
    public final int profile;

    @JsonProperty("sampleRate")
    public final int sampleRate;

    @JsonProperty("useAudioASC")
    public final boolean useAudioASC;

    public VideoBroadcastAudioStreamingConfig(C51697MsS c51697MsS) {
        this.sampleRate = c51697MsS.A03;
        this.bitRate = c51697MsS.A00;
        this.channels = c51697MsS.A01;
        this.profile = c51697MsS.A02;
        this.useAudioASC = c51697MsS.A04;
    }
}
