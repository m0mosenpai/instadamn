package com.instagram.debug.devoptions.direct.burner;

import X.AbstractC12190kN;
import X.AbstractC167007dF;
import X.C14360o3;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BurnerSendSettingsConfig {
    public static final int $stable = 8;
    public String buckId;
    public boolean isTLC;
    public int messageCount;
    public MessageType messageType;
    public String targetUserId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class MessageType {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ MessageType[] $VALUES;
        public final int value;
        public static final MessageType TEXT = new MessageType("TEXT", 0, 0);
        public static final MessageType IMAGES = new MessageType("IMAGES", 1, 1);
        public static final MessageType VIDEOS = new MessageType("VIDEOS", 2, 2);

        public static final /* synthetic */ MessageType[] $values() {
            return new MessageType[]{TEXT, IMAGES, VIDEOS};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            MessageType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) $VALUES.clone();
        }

        public MessageType(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public BurnerSendSettingsConfig(String str, int i, boolean z, MessageType messageType, String str2) {
        AbstractC167007dF.A1F(str, 1, messageType);
        this.buckId = str;
        this.messageCount = i;
        this.isTLC = z;
        this.messageType = messageType;
        this.targetUserId = str2;
    }

    public final void setBuckId(String str) {
        C14360o3.A0B(str, 0);
        this.buckId = str;
    }

    public final void setMessageType(MessageType messageType) {
        C14360o3.A0B(messageType, 0);
        this.messageType = messageType;
    }

    public final String getBuckId() {
        return this.buckId;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final MessageType getMessageType() {
        return this.messageType;
    }

    public final String getTargetUserId() {
        return this.targetUserId;
    }

    public final boolean isTLC() {
        return this.isTLC;
    }

    public final void setMessageCount(int i) {
        this.messageCount = i;
    }

    public final void setTLC(boolean z) {
        this.isTLC = z;
    }

    public final void setTargetUserId(String str) {
        this.targetUserId = str;
    }

    public /* synthetic */ BurnerSendSettingsConfig(String str, int i, boolean z, MessageType messageType, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) == 0 ? z : true, (i2 & 8) != 0 ? MessageType.TEXT : messageType, (i2 & 16) != 0 ? null : str2);
    }

    public BurnerSendSettingsConfig() {
        this("", 1, true, MessageType.TEXT, null);
    }
}
