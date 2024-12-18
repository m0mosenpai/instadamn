package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = VideoBroadcastLiveTraceConfigDeserializer.class)
/* loaded from: classes10.dex */
public final class VideoBroadcastLiveTraceConfig {

    @JsonProperty("enabled")
    public final boolean enabled;

    @JsonProperty("sampleIntervalInSeconds")
    public final int sampleIntervalInSeconds;

    @JsonProperty("samplingSource")
    public final int samplingSource;

    public VideoBroadcastLiveTraceConfig(int i, int i2, boolean z) {
        this.enabled = z;
        this.sampleIntervalInSeconds = i;
        this.samplingSource = i2;
    }
}
