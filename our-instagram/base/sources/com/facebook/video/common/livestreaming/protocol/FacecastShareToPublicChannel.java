package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = FacecastShareToPublicChannelDeserializer.class)
/* loaded from: classes10.dex */
public abstract class FacecastShareToPublicChannel {

    @JsonProperty("initialToggleState")
    public final boolean initialToggleState;

    @JsonProperty("threadName")
    public final String threadName;
}
