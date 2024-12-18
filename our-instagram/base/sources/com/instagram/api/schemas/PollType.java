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
/* loaded from: classes2.dex */
public final class PollType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PollType[] A03;
    public static final PollType A04;
    public static final PollType A05;
    public static final PollType A06;
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
        PollType pollType = new PollType("UNRECOGNIZED", 0, "PollType_unspecified");
        A06 = pollType;
        PollType pollType2 = new PollType("COMMENT_POLL", 1, "comment_poll");
        A04 = pollType2;
        PollType pollType3 = new PollType("POLL", 2, "");
        A05 = pollType3;
        PollType[] pollTypeArr = {pollType, pollType2, pollType3};
        A03 = pollTypeArr;
        A02 = AbstractC12190kN.A00(pollTypeArr);
        PollType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (PollType pollType4 : values) {
            linkedHashMap.put(pollType4.A00, pollType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(80);
    }

    public static PollType valueOf(String str) {
        return (PollType) Enum.valueOf(PollType.class, str);
    }

    public static PollType[] values() {
        return (PollType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PollType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
