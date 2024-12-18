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
public final class LiveUserPaySupportTier implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LiveUserPaySupportTier[] A03;
    public static final LiveUserPaySupportTier A04;
    public static final LiveUserPaySupportTier A05;
    public static final LiveUserPaySupportTier A06;
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
        LiveUserPaySupportTier liveUserPaySupportTier = new LiveUserPaySupportTier("UNRECOGNIZED", 0, "LiveUserPaySupportTier_unspecified");
        A06 = liveUserPaySupportTier;
        LiveUserPaySupportTier liveUserPaySupportTier2 = new LiveUserPaySupportTier("TIER1", 1, "tier_1");
        A04 = liveUserPaySupportTier2;
        LiveUserPaySupportTier liveUserPaySupportTier3 = new LiveUserPaySupportTier("TIER2", 2, "tier_2");
        A05 = liveUserPaySupportTier3;
        LiveUserPaySupportTier[] liveUserPaySupportTierArr = {liveUserPaySupportTier, liveUserPaySupportTier2, liveUserPaySupportTier3, new LiveUserPaySupportTier("TIER3", 3, "tier_3")};
        A03 = liveUserPaySupportTierArr;
        A02 = AbstractC12190kN.A00(liveUserPaySupportTierArr);
        LiveUserPaySupportTier[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (LiveUserPaySupportTier liveUserPaySupportTier4 : values) {
            linkedHashMap.put(liveUserPaySupportTier4.A00, liveUserPaySupportTier4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(37);
    }

    public static LiveUserPaySupportTier valueOf(String str) {
        return (LiveUserPaySupportTier) Enum.valueOf(LiveUserPaySupportTier.class, str);
    }

    public static LiveUserPaySupportTier[] values() {
        return (LiveUserPaySupportTier[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LiveUserPaySupportTier(String str, int i, String str2) {
        this.A00 = str2;
    }
}
