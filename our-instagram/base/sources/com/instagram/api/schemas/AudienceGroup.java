package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AudienceGroup implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AudienceGroup[] A03;
    public static final AudienceGroup A04;
    public static final AudienceGroup A05;
    public static final AudienceGroup A06;
    public static final AudienceGroup A07;
    public static final AudienceGroup A08;
    public static final AudienceGroup A09;
    public static final AudienceGroup A0A;
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
        AudienceGroup audienceGroup = new AudienceGroup("UNRECOGNIZED", 0, "AudienceGroup_unspecified");
        A0A = audienceGroup;
        AudienceGroup audienceGroup2 = new AudienceGroup("CLOSE_FRIENDS", 1, "close_friends");
        A04 = audienceGroup2;
        AudienceGroup audienceGroup3 = new AudienceGroup("FOLLOWERS_YOU_FOLLOW_BACK", 2, "followers_you_follow_back");
        A05 = audienceGroup3;
        AudienceGroup audienceGroup4 = new AudienceGroup("INTERNAL", 3, "internal");
        A06 = audienceGroup4;
        AudienceGroup audienceGroup5 = new AudienceGroup("PRACTICE", 4, "practice");
        A07 = audienceGroup5;
        AudienceGroup audienceGroup6 = new AudienceGroup("PUBLIC", 5, "public");
        A08 = audienceGroup6;
        AudienceGroup audienceGroup7 = new AudienceGroup("PUBLIC_CHAT", 6, "public_chat");
        A09 = audienceGroup7;
        AudienceGroup[] audienceGroupArr = {audienceGroup, audienceGroup2, audienceGroup3, audienceGroup4, audienceGroup5, audienceGroup6, audienceGroup7, new AudienceGroup("SUBSCRIBERS", 7, "subscribers")};
        A03 = audienceGroupArr;
        A02 = AbstractC12190kN.A00(audienceGroupArr);
        AudienceGroup[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (AudienceGroup audienceGroup8 : values) {
            linkedHashMap.put(audienceGroup8.A00, audienceGroup8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(46);
    }

    public static AudienceGroup valueOf(String str) {
        return (AudienceGroup) Enum.valueOf(AudienceGroup.class, str);
    }

    public static AudienceGroup[] values() {
        return (AudienceGroup[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AudienceGroup(String str, int i, String str2) {
        this.A00 = str2;
    }
}
