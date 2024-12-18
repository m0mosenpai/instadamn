package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = VideoBroadcastVideoStreamingConfigDeserializer.class)
/* loaded from: classes10.dex */
public final class VideoBroadcastVideoStreamingConfig {

    @JsonProperty("bitRate")
    public final int bitRate;

    @JsonProperty("frameRate")
    public final int frameRate;

    @JsonProperty(IgReactMediaPickerNativeModule.HEIGHT)
    public final int height;

    @JsonProperty("iFrameInterval")
    public final float iFrameInterval;

    @JsonProperty("videoProfile")
    public final String videoProfile;

    @JsonProperty(IgReactMediaPickerNativeModule.WIDTH)
    public final int width;

    public VideoBroadcastVideoStreamingConfig(String str, float f, int i, int i2, int i3, int i4) {
        this.width = i4;
        this.height = i3;
        this.bitRate = i;
        this.frameRate = i2;
        this.videoProfile = str;
        this.iFrameInterval = f;
    }
}
