package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = VideoBroadcastLiveWithConfigDeserializer.class)
/* loaded from: classes10.dex */
public abstract class VideoBroadcastLiveWithConfig {

    @JsonProperty("isCenterCropOutputFrameEnabled")
    public final boolean isCenterCropOutputFrameEnabled;

    @JsonProperty("isMuteModerationEnabled")
    public final boolean isMuteModerationEnabled;

    @JsonProperty("isUseRtmpDimensionsForLiveswapEnabled")
    public final boolean isUseRtmpDimensionsForLiveSwapEnabled;
}
