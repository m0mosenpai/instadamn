package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RepostRestrictedReason implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RepostRestrictedReason[] A03;
    public static final RepostRestrictedReason A04;
    public static final RepostRestrictedReason A05;
    public static final RepostRestrictedReason A06;
    public static final RepostRestrictedReason A07;
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
        RepostRestrictedReason repostRestrictedReason = new RepostRestrictedReason("UNRECOGNIZED", 0, "RepostRestrictedReason_unspecified");
        A07 = repostRestrictedReason;
        RepostRestrictedReason repostRestrictedReason2 = new RepostRestrictedReason("CAROUSEL_SUB_ITEM", 1, "carousel_sub_item");
        A04 = repostRestrictedReason2;
        RepostRestrictedReason repostRestrictedReason3 = new RepostRestrictedReason("GENERIC", 2, "generic");
        A05 = repostRestrictedReason3;
        RepostRestrictedReason repostRestrictedReason4 = new RepostRestrictedReason("PRIVATE", 3, "private");
        A06 = repostRestrictedReason4;
        RepostRestrictedReason[] repostRestrictedReasonArr = {repostRestrictedReason, repostRestrictedReason2, repostRestrictedReason3, repostRestrictedReason4, new RepostRestrictedReason("PRIVATE_REPLY", 4, "private_reply")};
        A03 = repostRestrictedReasonArr;
        A02 = AbstractC12190kN.A00(repostRestrictedReasonArr);
        RepostRestrictedReason[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RepostRestrictedReason repostRestrictedReason5 : values) {
            linkedHashMap.put(repostRestrictedReason5.A00, repostRestrictedReason5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(0);
    }

    public static RepostRestrictedReason valueOf(String str) {
        return (RepostRestrictedReason) Enum.valueOf(RepostRestrictedReason.class, str);
    }

    public static RepostRestrictedReason[] values() {
        return (RepostRestrictedReason[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RepostRestrictedReason(String str, int i, String str2) {
        this.A00 = str2;
    }
}
