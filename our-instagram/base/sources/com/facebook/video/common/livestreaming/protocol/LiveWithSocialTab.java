package com.facebook.video.common.livestreaming.protocol;

import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = LiveWithSocialTabDeserializer.class)
/* loaded from: classes10.dex */
public abstract class LiveWithSocialTab {

    @JsonProperty("'id")
    public final String id;

    @JsonProperty(DialogModule.KEY_TITLE)
    public final String title;
}
