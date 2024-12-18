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
/* loaded from: classes3.dex */
public final class MomentAdsTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MomentAdsTypeEnum[] A03;
    public static final MomentAdsTypeEnum A04;
    public static final MomentAdsTypeEnum A05;
    public static final MomentAdsTypeEnum A06;
    public static final MomentAdsTypeEnum A07;
    public static final MomentAdsTypeEnum A08;
    public static final MomentAdsTypeEnum A09;
    public static final MomentAdsTypeEnum A0A;
    public static final MomentAdsTypeEnum A0B;
    public static final MomentAdsTypeEnum A0C;
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
        MomentAdsTypeEnum momentAdsTypeEnum = new MomentAdsTypeEnum("UNRECOGNIZED", 0, "MomentAdsTypeEnum_unspecified");
        A0C = momentAdsTypeEnum;
        MomentAdsTypeEnum momentAdsTypeEnum2 = new MomentAdsTypeEnum("FB_LIVE_SHOPPING", 1, "fb_live_shopping");
        A04 = momentAdsTypeEnum2;
        MomentAdsTypeEnum momentAdsTypeEnum3 = new MomentAdsTypeEnum("IG_DROPS", 2, "ig_drops");
        A05 = momentAdsTypeEnum3;
        MomentAdsTypeEnum momentAdsTypeEnum4 = new MomentAdsTypeEnum("IG_LIVE_SHOPPING", 3, "ig_live_shopping");
        A06 = momentAdsTypeEnum4;
        MomentAdsTypeEnum momentAdsTypeEnum5 = new MomentAdsTypeEnum("IG_ONLINE_EVENT", 4, "ig_online_event");
        A07 = momentAdsTypeEnum5;
        MomentAdsTypeEnum momentAdsTypeEnum6 = new MomentAdsTypeEnum("IG_OPTIONAL_ONLINE_EVENT", 5, "ig_optional_online_event");
        A08 = momentAdsTypeEnum6;
        MomentAdsTypeEnum momentAdsTypeEnum7 = new MomentAdsTypeEnum("IG_OPTIONAL_ONLINE_EVENT_WITH_REMIND_ME_CTA", 6, "ig_optional_online_event_with_remind_me_cta");
        A09 = momentAdsTypeEnum7;
        MomentAdsTypeEnum momentAdsTypeEnum8 = new MomentAdsTypeEnum("IG_OPTIONAL_ONLINE_EVENT_WITH_REMIND_ME_CTA_FALLBACK", 7, "ig_optional_online_event_with_remind_me_cta_fallback");
        A0A = momentAdsTypeEnum8;
        MomentAdsTypeEnum momentAdsTypeEnum9 = new MomentAdsTypeEnum("IG_SCHEDULED_LIVE", 8, "ig_scheduled_live");
        A0B = momentAdsTypeEnum9;
        MomentAdsTypeEnum[] momentAdsTypeEnumArr = {momentAdsTypeEnum, momentAdsTypeEnum2, momentAdsTypeEnum3, momentAdsTypeEnum4, momentAdsTypeEnum5, momentAdsTypeEnum6, momentAdsTypeEnum7, momentAdsTypeEnum8, momentAdsTypeEnum9, new MomentAdsTypeEnum("UNDEFINED", 9, "undefined")};
        A03 = momentAdsTypeEnumArr;
        A02 = AbstractC12190kN.A00(momentAdsTypeEnumArr);
        MomentAdsTypeEnum[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MomentAdsTypeEnum momentAdsTypeEnum10 : values) {
            linkedHashMap.put(momentAdsTypeEnum10.A00, momentAdsTypeEnum10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(49);
    }

    public static MomentAdsTypeEnum valueOf(String str) {
        return (MomentAdsTypeEnum) Enum.valueOf(MomentAdsTypeEnum.class, str);
    }

    public static MomentAdsTypeEnum[] values() {
        return (MomentAdsTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MomentAdsTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }
}
