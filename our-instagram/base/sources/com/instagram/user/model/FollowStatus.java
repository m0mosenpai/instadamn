package com.instagram.user.model;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FollowStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FollowStatus[] A03;
    public static final FollowStatus A04;
    public static final FollowStatus A05;
    public static final FollowStatus A06;
    public static final FollowStatus A07;
    public static final FollowStatus A08;
    public static final FollowStatus A09;
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
        FollowStatus followStatus = new FollowStatus("UNRECOGNIZED", 0, "FollowStatus_unspecified");
        A09 = followStatus;
        FollowStatus followStatus2 = new FollowStatus("FollowStatusUnknown", 1, "FollowStatusUnknown");
        A08 = followStatus2;
        FollowStatus followStatus3 = new FollowStatus("FollowStatusFetching", 2, "FollowStatusFetching");
        A04 = followStatus3;
        FollowStatus followStatus4 = new FollowStatus("FollowStatusNotFollowing", 3, "FollowStatusNotFollowing");
        A06 = followStatus4;
        FollowStatus followStatus5 = new FollowStatus("FollowStatusFollowing", 4, "FollowStatusFollowing");
        A05 = followStatus5;
        FollowStatus followStatus6 = new FollowStatus("FollowStatusRequested", 5, "FollowStatusRequested");
        A07 = followStatus6;
        FollowStatus[] followStatusArr = {followStatus, followStatus2, followStatus3, followStatus4, followStatus5, followStatus6};
        A03 = followStatusArr;
        A02 = AbstractC12190kN.A00(followStatusArr);
        FollowStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (FollowStatus followStatus7 : values) {
            linkedHashMap.put(followStatus7.A00, followStatus7);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(68);
    }

    public static FollowStatus valueOf(String str) {
        return (FollowStatus) Enum.valueOf(FollowStatus.class, str);
    }

    public static FollowStatus[] values() {
        return (FollowStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FollowStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
