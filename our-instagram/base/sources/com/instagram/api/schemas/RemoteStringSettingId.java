package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class RemoteStringSettingId implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RemoteStringSettingId[] A03;
    public static final RemoteStringSettingId A04;
    public static final RemoteStringSettingId A05;
    public static final RemoteStringSettingId A06;
    public static final RemoteStringSettingId A07;
    public static final RemoteStringSettingId A08;
    public static final RemoteStringSettingId A09;
    public static final RemoteStringSettingId A0A;
    public static final RemoteStringSettingId A0B;
    public static final RemoteStringSettingId A0C;
    public static final RemoteStringSettingId A0D;
    public static final RemoteStringSettingId A0E;
    public static final RemoteStringSettingId A0F;
    public static final RemoteStringSettingId A0G;
    public static final RemoteStringSettingId A0H;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        RemoteStringSettingId remoteStringSettingId = new RemoteStringSettingId("UNRECOGNIZED", 0, "RemoteStringSettingId_unspecified");
        A0G = remoteStringSettingId;
        RemoteStringSettingId remoteStringSettingId2 = new RemoteStringSettingId("ACCOUNT_SCREEN_HEADER", 1, "account_screen_header");
        A04 = remoteStringSettingId2;
        RemoteStringSettingId remoteStringSettingId3 = new RemoteStringSettingId("ALLOW_WEBSITE_EMBEDS", 2, "allow_website_embeds");
        A05 = remoteStringSettingId3;
        RemoteStringSettingId remoteStringSettingId4 = new RemoteStringSettingId("DAILY_LIMIT", 3, "daily_limit");
        A06 = remoteStringSettingId4;
        RemoteStringSettingId remoteStringSettingId5 = new RemoteStringSettingId("MESSAGE_REACHABILITY_GROUP_MESSAGE", 4, "message_reachability_group_message");
        A07 = remoteStringSettingId5;
        RemoteStringSettingId remoteStringSettingId6 = new RemoteStringSettingId("MESSAGE_REACHABILITY_IG_VERIFIED", 5, "message_reachability_ig_verified");
        A08 = remoteStringSettingId6;
        RemoteStringSettingId remoteStringSettingId7 = new RemoteStringSettingId("MESSAGE_REACHABILITY_ONE_ON_ONE_MESSAGE", 6, "message_reachability_one_on_one_message");
        A09 = remoteStringSettingId7;
        RemoteStringSettingId remoteStringSettingId8 = new RemoteStringSettingId("SENSITIVE_CONTENT_CONTROL", 7, "sensitive_content_control");
        A0A = remoteStringSettingId8;
        RemoteStringSettingId remoteStringSettingId9 = new RemoteStringSettingId("SERVER_TEST_ONLY_DO_NOT_USE", 8, "server_test_only_do_not_use");
        A0B = remoteStringSettingId9;
        RemoteStringSettingId remoteStringSettingId10 = new RemoteStringSettingId("SHARE_STORY_TO_FACEBOOK", 9, "share_story_to_facebook");
        A0C = remoteStringSettingId10;
        RemoteStringSettingId remoteStringSettingId11 = new RemoteStringSettingId("SLEEP_MODE_WINDOW", 10, "sleep_mode_window");
        A0D = remoteStringSettingId11;
        RemoteStringSettingId remoteStringSettingId12 = new RemoteStringSettingId("TAGS_MENTIONS_WHO_CAN_MENTION", 11, "tags_mentions_who_can_mention");
        A0E = remoteStringSettingId12;
        RemoteStringSettingId remoteStringSettingId13 = new RemoteStringSettingId("TAGS_MENTIONS_WHO_CAN_TAG", 12, "tags_mentions_who_can_tag");
        A0F = remoteStringSettingId13;
        RemoteStringSettingId remoteStringSettingId14 = new RemoteStringSettingId("WHO_CAN_REMIX_OR_REUSE_YOUR_CONTENT", 13, "who_can_remix_or_reuse_your_content");
        A0H = remoteStringSettingId14;
        RemoteStringSettingId[] remoteStringSettingIdArr = {remoteStringSettingId, remoteStringSettingId2, remoteStringSettingId3, remoteStringSettingId4, remoteStringSettingId5, remoteStringSettingId6, remoteStringSettingId7, remoteStringSettingId8, remoteStringSettingId9, remoteStringSettingId10, remoteStringSettingId11, remoteStringSettingId12, remoteStringSettingId13, remoteStringSettingId14};
        A03 = remoteStringSettingIdArr;
        A02 = AbstractC12190kN.A00(remoteStringSettingIdArr);
        RemoteStringSettingId[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (RemoteStringSettingId remoteStringSettingId15 : values) {
            A18.put(remoteStringSettingId15.A00, remoteStringSettingId15);
        }
        A01 = A18;
        CREATOR = new C41855Ig9(91);
    }

    public static RemoteStringSettingId valueOf(String str) {
        return (RemoteStringSettingId) Enum.valueOf(RemoteStringSettingId.class, str);
    }

    public static RemoteStringSettingId[] values() {
        return (RemoteStringSettingId[]) A03.clone();
    }

    public RemoteStringSettingId(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
