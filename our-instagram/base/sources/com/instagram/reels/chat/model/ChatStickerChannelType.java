package com.instagram.reels.chat.model;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ChatStickerChannelType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ChatStickerChannelType[] A03;
    public static final ChatStickerChannelType A04;
    public static final ChatStickerChannelType A05;
    public static final ChatStickerChannelType A06;
    public static final ChatStickerChannelType A07;
    public static final ChatStickerChannelType A08;
    public static final ChatStickerChannelType A09;
    public static final ChatStickerChannelType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ChatStickerChannelType chatStickerChannelType = new ChatStickerChannelType("UNRECOGNIZED", 0, "ChatStickerChannelType_unspecified");
        A0A = chatStickerChannelType;
        ChatStickerChannelType chatStickerChannelType2 = new ChatStickerChannelType("AI_AGENT", 1, "ai_agent");
        A04 = chatStickerChannelType2;
        ChatStickerChannelType chatStickerChannelType3 = new ChatStickerChannelType("BROADCAST", 2, "broadcast");
        A05 = chatStickerChannelType3;
        ChatStickerChannelType chatStickerChannelType4 = new ChatStickerChannelType("DEFAULT", 3, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A06 = chatStickerChannelType4;
        ChatStickerChannelType chatStickerChannelType5 = new ChatStickerChannelType("DISCOVERABLE", 4, "discoverable");
        A07 = chatStickerChannelType5;
        ChatStickerChannelType chatStickerChannelType6 = new ChatStickerChannelType("LEGACY_CHAT_STICKER", 5, "");
        A08 = chatStickerChannelType6;
        ChatStickerChannelType chatStickerChannelType7 = new ChatStickerChannelType("SUBSCRIBER", 6, "subscriber");
        A09 = chatStickerChannelType7;
        ChatStickerChannelType[] chatStickerChannelTypeArr = {chatStickerChannelType, chatStickerChannelType2, chatStickerChannelType3, chatStickerChannelType4, chatStickerChannelType5, chatStickerChannelType6, chatStickerChannelType7};
        A03 = chatStickerChannelTypeArr;
        A02 = AbstractC12190kN.A00(chatStickerChannelTypeArr);
        ChatStickerChannelType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (ChatStickerChannelType chatStickerChannelType8 : values) {
            linkedHashMap.put(chatStickerChannelType8.A00, chatStickerChannelType8);
        }
        A01 = linkedHashMap;
        CREATOR = new C37324GcR(24);
    }

    public static ChatStickerChannelType valueOf(String str) {
        return (ChatStickerChannelType) Enum.valueOf(ChatStickerChannelType.class, str);
    }

    public static ChatStickerChannelType[] values() {
        return (ChatStickerChannelType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ChatStickerChannelType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
