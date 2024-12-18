package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class StoryJoinChatStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryJoinChatStatus[] A03;
    public static final StoryJoinChatStatus A04;
    public static final StoryJoinChatStatus A05;
    public static final StoryJoinChatStatus A06;
    public static final StoryJoinChatStatus A07;
    public static final StoryJoinChatStatus A08;
    public static final StoryJoinChatStatus A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryJoinChatStatus storyJoinChatStatus = new StoryJoinChatStatus("UNRECOGNIZED", 0, "StoryJoinChatStatus_unspecified");
        A09 = storyJoinChatStatus;
        StoryJoinChatStatus storyJoinChatStatus2 = new StoryJoinChatStatus("CHAT_ENDED", 1, "chat_ended");
        A05 = storyJoinChatStatus2;
        StoryJoinChatStatus storyJoinChatStatus3 = new StoryJoinChatStatus("CHAT_FULL", 2, "chat_full");
        A06 = storyJoinChatStatus3;
        StoryJoinChatStatus storyJoinChatStatus4 = new StoryJoinChatStatus("DEFAULT", 3, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A07 = storyJoinChatStatus4;
        StoryJoinChatStatus storyJoinChatStatus5 = new StoryJoinChatStatus("ACCEPTED", 4, "joined_chat");
        A04 = storyJoinChatStatus5;
        StoryJoinChatStatus storyJoinChatStatus6 = new StoryJoinChatStatus("PENDING", 5, "requested_chat");
        A08 = storyJoinChatStatus6;
        StoryJoinChatStatus[] storyJoinChatStatusArr = {storyJoinChatStatus, storyJoinChatStatus2, storyJoinChatStatus3, storyJoinChatStatus4, storyJoinChatStatus5, storyJoinChatStatus6};
        A03 = storyJoinChatStatusArr;
        A02 = AbstractC12190kN.A00(storyJoinChatStatusArr);
        StoryJoinChatStatus[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (StoryJoinChatStatus storyJoinChatStatus7 : values) {
            linkedHashMap.put(storyJoinChatStatus7.A00, storyJoinChatStatus7);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(17);
    }

    public static StoryJoinChatStatus valueOf(String str) {
        return (StoryJoinChatStatus) Enum.valueOf(StoryJoinChatStatus.class, str);
    }

    public static StoryJoinChatStatus[] values() {
        return (StoryJoinChatStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryJoinChatStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
