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
/* loaded from: classes.dex */
public final class FanClubStoriesTeaserType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FanClubStoriesTeaserType[] A03;
    public static final FanClubStoriesTeaserType A04;
    public static final FanClubStoriesTeaserType A05;
    public static final FanClubStoriesTeaserType A06;
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
        FanClubStoriesTeaserType fanClubStoriesTeaserType = new FanClubStoriesTeaserType("UNRECOGNIZED", 0, "FanClubStoriesTeaserType_unspecified");
        A06 = fanClubStoriesTeaserType;
        FanClubStoriesTeaserType fanClubStoriesTeaserType2 = new FanClubStoriesTeaserType("FREE_TRIAL", 1, "free_trial");
        A04 = fanClubStoriesTeaserType2;
        FanClubStoriesTeaserType fanClubStoriesTeaserType3 = new FanClubStoriesTeaserType("ORIGINAL", 2, "original");
        A05 = fanClubStoriesTeaserType3;
        FanClubStoriesTeaserType[] fanClubStoriesTeaserTypeArr = {fanClubStoriesTeaserType, fanClubStoriesTeaserType2, fanClubStoriesTeaserType3};
        A03 = fanClubStoriesTeaserTypeArr;
        A02 = AbstractC12190kN.A00(fanClubStoriesTeaserTypeArr);
        FanClubStoriesTeaserType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (FanClubStoriesTeaserType fanClubStoriesTeaserType4 : values) {
            linkedHashMap.put(fanClubStoriesTeaserType4.A00, fanClubStoriesTeaserType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(92);
    }

    public static FanClubStoriesTeaserType valueOf(String str) {
        return (FanClubStoriesTeaserType) Enum.valueOf(FanClubStoriesTeaserType.class, str);
    }

    public static FanClubStoriesTeaserType[] values() {
        return (FanClubStoriesTeaserType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FanClubStoriesTeaserType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
