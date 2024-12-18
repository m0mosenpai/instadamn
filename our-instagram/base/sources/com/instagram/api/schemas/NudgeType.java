package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class NudgeType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NudgeType[] A03;
    public static final NudgeType A04;
    public static final NudgeType A05;
    public static final NudgeType A06;
    public static final NudgeType A07;
    public static final NudgeType A08;
    public static final NudgeType A09;
    public static final NudgeType A0A;
    public static final NudgeType A0B;
    public static final NudgeType A0C;
    public static final NudgeType A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        NudgeType nudgeType = new NudgeType("UNRECOGNIZED", 0, "NudgeType_unspecified");
        A0D = nudgeType;
        NudgeType nudgeType2 = new NudgeType("BOTTOM_SHEET_FEED_REVIEW_RESPECTFUL", 1, "bottom_sheet_feed_review_respectful");
        A05 = nudgeType2;
        NudgeType nudgeType3 = new NudgeType("BOTTOM_SHEET_STORY_REPLY_RESPECTFUL", 2, "bottom_sheet_story_reply_respectful");
        A07 = nudgeType3;
        NudgeType nudgeType4 = new NudgeType("BOTTOM_SHEET_STORY_REVIEW_RESPECTFUL", 3, "bottom_sheet_story_review_respectful");
        A08 = nudgeType4;
        NudgeType nudgeType5 = new NudgeType("BOTTOM_SHEET_IG_LED", 4, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A06 = nudgeType5;
        NudgeType nudgeType6 = new NudgeType("DIRECT_CHANNEL_REPLY_NUDGE", 5, "direct_channel_reply_nudge");
        A09 = nudgeType6;
        NudgeType nudgeType7 = new NudgeType("BOTTOM_SHEET_EMPATHY", 6, "empathy_v1");
        A04 = nudgeType7;
        NudgeType nudgeType8 = new NudgeType("LIGHTWEIGHT_SET_TONE", 7, "lightweight_set_tone");
        A0A = nudgeType8;
        NudgeType nudgeType9 = new NudgeType("LIGHTWEIGHT_STORY_REPLY_RESPECTFUL", 8, "lightweight_story_reply_respectful");
        A0B = nudgeType9;
        NudgeType nudgeType10 = new NudgeType("LIGHTWEIGHT_WELCOME", 9, "lightweight_welcome");
        A0C = nudgeType10;
        NudgeType[] nudgeTypeArr = {nudgeType, nudgeType2, nudgeType3, nudgeType4, nudgeType5, nudgeType6, nudgeType7, nudgeType8, nudgeType9, nudgeType10, new NudgeType("LIGHTWEIGHT_COMMENT_REPLY_WARNING", 10, "lwn_comment_tray_opt2")};
        A03 = nudgeTypeArr;
        A02 = AbstractC12190kN.A00(nudgeTypeArr);
        NudgeType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (NudgeType nudgeType11 : values) {
            linkedHashMap.put(nudgeType11.A00, nudgeType11);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(66);
    }

    public static NudgeType valueOf(String str) {
        return (NudgeType) Enum.valueOf(NudgeType.class, str);
    }

    public static NudgeType[] values() {
        return (NudgeType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NudgeType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
