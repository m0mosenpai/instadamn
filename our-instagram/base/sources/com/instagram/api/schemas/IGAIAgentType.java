package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IGAIAgentType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAIAgentType[] A03;
    public static final IGAIAgentType A04;
    public static final IGAIAgentType A05;
    public static final IGAIAgentType A06;
    public static final IGAIAgentType A07;
    public static final IGAIAgentType A08;
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
        IGAIAgentType iGAIAgentType = new IGAIAgentType("UNRECOGNIZED", 0, "IGAIAgentType_unspecified");
        A07 = iGAIAgentType;
        IGAIAgentType iGAIAgentType2 = new IGAIAgentType("CREATOR_AGENT", 1, "ig_creator");
        A04 = iGAIAgentType2;
        IGAIAgentType iGAIAgentType3 = new IGAIAgentType("META_GENERATED_CONSUMER_AGENT", 2, "meta_generated_consumer_agent");
        A05 = iGAIAgentType3;
        IGAIAgentType iGAIAgentType4 = new IGAIAgentType("OFFICIAL_META_ASSISTANT", 3, "official_meta_assistant");
        A06 = iGAIAgentType4;
        IGAIAgentType iGAIAgentType5 = new IGAIAgentType("USER_GENERATED_CONSUMER_AGENT", 4, "user_generated_consumer_agent");
        A08 = iGAIAgentType5;
        IGAIAgentType[] iGAIAgentTypeArr = {iGAIAgentType, iGAIAgentType2, iGAIAgentType3, iGAIAgentType4, iGAIAgentType5};
        A03 = iGAIAgentTypeArr;
        A02 = AbstractC12190kN.A00(iGAIAgentTypeArr);
        IGAIAgentType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAIAgentType iGAIAgentType6 : values) {
            linkedHashMap.put(iGAIAgentType6.A00, iGAIAgentType6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(1);
    }

    public static IGAIAgentType valueOf(String str) {
        return (IGAIAgentType) Enum.valueOf(IGAIAgentType.class, str);
    }

    public static IGAIAgentType[] values() {
        return (IGAIAgentType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAIAgentType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
