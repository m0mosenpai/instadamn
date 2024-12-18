package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StoryEmojisEntryAnimationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryEmojisEntryAnimationType[] A03;
    public static final StoryEmojisEntryAnimationType A04;
    public static final StoryEmojisEntryAnimationType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryEmojisEntryAnimationType storyEmojisEntryAnimationType = new StoryEmojisEntryAnimationType("UNRECOGNIZED", 0, "StoryEmojisEntryAnimationType_unspecified");
        A05 = storyEmojisEntryAnimationType;
        StoryEmojisEntryAnimationType storyEmojisEntryAnimationType2 = new StoryEmojisEntryAnimationType("ANIMATE_WITH_EMOJI_POP_IN", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = storyEmojisEntryAnimationType2;
        StoryEmojisEntryAnimationType[] storyEmojisEntryAnimationTypeArr = {storyEmojisEntryAnimationType, storyEmojisEntryAnimationType2, new StoryEmojisEntryAnimationType("DEFAULT", 2, "0")};
        A03 = storyEmojisEntryAnimationTypeArr;
        A02 = AbstractC12190kN.A00(storyEmojisEntryAnimationTypeArr);
        StoryEmojisEntryAnimationType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StoryEmojisEntryAnimationType storyEmojisEntryAnimationType3 : values) {
            A18.put(storyEmojisEntryAnimationType3.A00, storyEmojisEntryAnimationType3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(15);
    }

    public static StoryEmojisEntryAnimationType valueOf(String str) {
        return (StoryEmojisEntryAnimationType) Enum.valueOf(StoryEmojisEntryAnimationType.class, str);
    }

    public static StoryEmojisEntryAnimationType[] values() {
        return (StoryEmojisEntryAnimationType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryEmojisEntryAnimationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
