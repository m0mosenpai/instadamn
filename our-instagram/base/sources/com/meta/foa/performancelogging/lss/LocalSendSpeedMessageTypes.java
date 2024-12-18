package com.meta.foa.performancelogging.lss;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class LocalSendSpeedMessageTypes {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ LocalSendSpeedMessageTypes[] $VALUES;
    public final String typeName;
    public static final LocalSendSpeedMessageTypes TEXT = new LocalSendSpeedMessageTypes("TEXT", 0, "text");
    public static final LocalSendSpeedMessageTypes AUDIO = new LocalSendSpeedMessageTypes("AUDIO", 1, MediaStreamTrack.AUDIO_TRACK_KIND);
    public static final LocalSendSpeedMessageTypes STICKER = new LocalSendSpeedMessageTypes("STICKER", 2, "sticker");
    public static final LocalSendSpeedMessageTypes GIF = new LocalSendSpeedMessageTypes("GIF", 3, "gif");
    public static final LocalSendSpeedMessageTypes PHOTO = new LocalSendSpeedMessageTypes("PHOTO", 4, "photo");
    public static final LocalSendSpeedMessageTypes VIDEO = new LocalSendSpeedMessageTypes("VIDEO", 5, MediaStreamTrack.VIDEO_TRACK_KIND);
    public static final LocalSendSpeedMessageTypes COLLECTION = new LocalSendSpeedMessageTypes("COLLECTION", 6, "collection");
    public static final LocalSendSpeedMessageTypes EPHEMERAL_PHOTO = new LocalSendSpeedMessageTypes("EPHEMERAL_PHOTO", 7, "ephemeral_photo");
    public static final LocalSendSpeedMessageTypes EPHEMERAL_VIDEO = new LocalSendSpeedMessageTypes("EPHEMERAL_VIDEO", 8, "ephemeral_video");
    public static final LocalSendSpeedMessageTypes REACTION = new LocalSendSpeedMessageTypes("REACTION", 9, "reaction");

    public static final /* synthetic */ LocalSendSpeedMessageTypes[] $values() {
        return new LocalSendSpeedMessageTypes[]{TEXT, AUDIO, STICKER, GIF, PHOTO, VIDEO, COLLECTION, EPHEMERAL_PHOTO, EPHEMERAL_VIDEO, REACTION};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        LocalSendSpeedMessageTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static LocalSendSpeedMessageTypes valueOf(String str) {
        return (LocalSendSpeedMessageTypes) Enum.valueOf(LocalSendSpeedMessageTypes.class, str);
    }

    public static LocalSendSpeedMessageTypes[] values() {
        return (LocalSendSpeedMessageTypes[]) $VALUES.clone();
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public LocalSendSpeedMessageTypes(String str, int i, String str2) {
        this.typeName = str2;
    }
}
