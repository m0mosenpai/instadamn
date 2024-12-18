package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FanClubSubscriptionButtonType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FanClubSubscriptionButtonType[] A03;
    public static final FanClubSubscriptionButtonType A04;
    public static final FanClubSubscriptionButtonType A05;
    public static final FanClubSubscriptionButtonType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FanClubSubscriptionButtonType fanClubSubscriptionButtonType = new FanClubSubscriptionButtonType("UNRECOGNIZED", 0, "FanClubSubscriptionButtonType_unspecified");
        A06 = fanClubSubscriptionButtonType;
        FanClubSubscriptionButtonType fanClubSubscriptionButtonType2 = new FanClubSubscriptionButtonType("CREATOR_MANAGE", 1, "creator_manage");
        A04 = fanClubSubscriptionButtonType2;
        FanClubSubscriptionButtonType fanClubSubscriptionButtonType3 = new FanClubSubscriptionButtonType("FAN_MANAGE", 2, "fan_manage");
        A05 = fanClubSubscriptionButtonType3;
        FanClubSubscriptionButtonType[] fanClubSubscriptionButtonTypeArr = {fanClubSubscriptionButtonType, fanClubSubscriptionButtonType2, fanClubSubscriptionButtonType3, new FanClubSubscriptionButtonType("FAN_SUBSCRIBE", 3, "fan_subscribe")};
        A03 = fanClubSubscriptionButtonTypeArr;
        A02 = AbstractC12190kN.A00(fanClubSubscriptionButtonTypeArr);
        FanClubSubscriptionButtonType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FanClubSubscriptionButtonType fanClubSubscriptionButtonType4 : values) {
            A18.put(fanClubSubscriptionButtonType4.A00, fanClubSubscriptionButtonType4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(82);
    }

    public static FanClubSubscriptionButtonType valueOf(String str) {
        return (FanClubSubscriptionButtonType) Enum.valueOf(FanClubSubscriptionButtonType.class, str);
    }

    public static FanClubSubscriptionButtonType[] values() {
        return (FanClubSubscriptionButtonType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FanClubSubscriptionButtonType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
