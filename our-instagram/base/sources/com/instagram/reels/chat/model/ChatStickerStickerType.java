package com.instagram.reels.chat.model;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ChatStickerStickerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ChatStickerStickerType[] A03;
    public static final ChatStickerStickerType A04;
    public static final ChatStickerStickerType A05;
    public static final ChatStickerStickerType A06;
    public static final ChatStickerStickerType A07;
    public static final ChatStickerStickerType A08;
    public static final ChatStickerStickerType A09;
    public static final ChatStickerStickerType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ChatStickerStickerType chatStickerStickerType = new ChatStickerStickerType("UNRECOGNIZED", 0, "ChatStickerStickerType_unspecified");
        A0A = chatStickerStickerType;
        ChatStickerStickerType chatStickerStickerType2 = new ChatStickerStickerType("AGENT_PROFILE_STICKER", 1, "agent_profile_sticker");
        A04 = chatStickerStickerType2;
        ChatStickerStickerType chatStickerStickerType3 = new ChatStickerStickerType("CHALLENGE_STICKER", 2, "challenge_sticker");
        A05 = chatStickerStickerType3;
        ChatStickerStickerType chatStickerStickerType4 = new ChatStickerStickerType("CLIPS_JOIN_CHAT_STICKER", 3, "clips_join_chat_sticker");
        A06 = chatStickerStickerType4;
        ChatStickerStickerType chatStickerStickerType5 = new ChatStickerStickerType("JOIN_CHAT_STICKER", 4, "join_chat_sticker");
        A07 = chatStickerStickerType5;
        ChatStickerStickerType chatStickerStickerType6 = new ChatStickerStickerType("LEGACY", 5, "");
        A08 = chatStickerStickerType6;
        ChatStickerStickerType chatStickerStickerType7 = new ChatStickerStickerType("MESSAGE_STICKER", 6, "message_sticker");
        A09 = chatStickerStickerType7;
        ChatStickerStickerType[] chatStickerStickerTypeArr = {chatStickerStickerType, chatStickerStickerType2, chatStickerStickerType3, chatStickerStickerType4, chatStickerStickerType5, chatStickerStickerType6, chatStickerStickerType7};
        A03 = chatStickerStickerTypeArr;
        A02 = AbstractC12190kN.A00(chatStickerStickerTypeArr);
        ChatStickerStickerType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (ChatStickerStickerType chatStickerStickerType8 : values) {
            linkedHashMap.put(chatStickerStickerType8.A00, chatStickerStickerType8);
        }
        A01 = linkedHashMap;
        CREATOR = new C37324GcR(25);
    }

    public static ChatStickerStickerType valueOf(String str) {
        return (ChatStickerStickerType) Enum.valueOf(ChatStickerStickerType.class, str);
    }

    public static ChatStickerStickerType[] values() {
        return (ChatStickerStickerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ChatStickerStickerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
