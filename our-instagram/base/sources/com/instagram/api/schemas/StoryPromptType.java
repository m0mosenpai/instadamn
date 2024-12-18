package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class StoryPromptType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryPromptType[] A03;
    public static final StoryPromptType A04;
    public static final StoryPromptType A05;
    public static final StoryPromptType A06;
    public static final StoryPromptType A07;
    public static final StoryPromptType A08;
    public static final StoryPromptType A09;
    public static final StoryPromptType A0A;
    public static final StoryPromptType A0B;
    public static final StoryPromptType A0C;
    public static final StoryPromptType A0D;
    public static final StoryPromptType A0E;
    public static final StoryPromptType A0F;
    public static final StoryPromptType A0G;
    public static final StoryPromptType A0H;
    public static final StoryPromptType A0I;
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
        StoryPromptType storyPromptType = new StoryPromptType("UNRECOGNIZED", 0, "StoryPromptType_unspecified");
        A0I = storyPromptType;
        StoryPromptType storyPromptType2 = new StoryPromptType("BEFORE_AND_AFTER", 1, "2");
        A04 = storyPromptType2;
        StoryPromptType storyPromptType3 = new StoryPromptType("DEFAULT", 2, "0");
        A05 = storyPromptType3;
        StoryPromptType storyPromptType4 = new StoryPromptType("ELECTION", 3, "8");
        A06 = storyPromptType4;
        StoryPromptType storyPromptType5 = new StoryPromptType("IMAGINE", 4, "12");
        A07 = storyPromptType5;
        StoryPromptType storyPromptType6 = new StoryPromptType("IMAGINE_ME", 5, "13");
        A08 = storyPromptType6;
        StoryPromptType storyPromptType7 = new StoryPromptType("MAGIC_MOD_ADD_YOURS_WITH_BACKDROP", 6, "10");
        A09 = storyPromptType7;
        StoryPromptType storyPromptType8 = new StoryPromptType("MAGIC_MOD_BACKDROP", 7, "7");
        A0A = storyPromptType8;
        StoryPromptType storyPromptType9 = new StoryPromptType("MAGIC_MOD_BRUSH", 8, "6");
        A0B = storyPromptType9;
        StoryPromptType storyPromptType10 = new StoryPromptType("MAGIC_MOD_RESTYLE", 9, "5");
        A0C = storyPromptType10;
        StoryPromptType storyPromptType11 = new StoryPromptType("MUSIC_PICK", 10, "9");
        A0D = storyPromptType11;
        StoryPromptType storyPromptType12 = new StoryPromptType("POTATO", 11, "11");
        A0E = storyPromptType12;
        StoryPromptType storyPromptType13 = new StoryPromptType("SPEAKEASY", 12, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0F = storyPromptType13;
        StoryPromptType storyPromptType14 = new StoryPromptType("STORY_TEMPLATE", 13, "4");
        A0G = storyPromptType14;
        StoryPromptType storyPromptType15 = new StoryPromptType("TOP_THREE", 14, "3");
        A0H = storyPromptType15;
        StoryPromptType[] storyPromptTypeArr = {storyPromptType, storyPromptType2, storyPromptType3, storyPromptType4, storyPromptType5, storyPromptType6, storyPromptType7, storyPromptType8, storyPromptType9, storyPromptType10, storyPromptType11, storyPromptType12, storyPromptType13, storyPromptType14, storyPromptType15};
        A03 = storyPromptTypeArr;
        A02 = AbstractC12190kN.A00(storyPromptTypeArr);
        StoryPromptType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (StoryPromptType storyPromptType16 : values) {
            linkedHashMap.put(storyPromptType16.A00, storyPromptType16);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(17);
    }

    public static StoryPromptType valueOf(String str) {
        return (StoryPromptType) Enum.valueOf(StoryPromptType.class, str);
    }

    public static StoryPromptType[] values() {
        return (StoryPromptType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryPromptType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
