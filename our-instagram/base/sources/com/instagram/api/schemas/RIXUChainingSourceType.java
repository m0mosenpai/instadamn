package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RIXUChainingSourceType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUChainingSourceType[] A03;
    public static final RIXUChainingSourceType A04;
    public static final RIXUChainingSourceType A05;
    public static final RIXUChainingSourceType A06;
    public static final RIXUChainingSourceType A07;
    public static final RIXUChainingSourceType A08;
    public static final RIXUChainingSourceType A09;
    public static final RIXUChainingSourceType A0A;
    public static final RIXUChainingSourceType A0B;
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
        RIXUChainingSourceType rIXUChainingSourceType = new RIXUChainingSourceType("UNRECOGNIZED", 0, "RIXUChainingSourceType_unspecified");
        A0B = rIXUChainingSourceType;
        RIXUChainingSourceType rIXUChainingSourceType2 = new RIXUChainingSourceType("ACCOUNTS_YOU_MAY_FOLLOW", 1, "accounts_you_may_follow");
        A04 = rIXUChainingSourceType2;
        RIXUChainingSourceType rIXUChainingSourceType3 = new RIXUChainingSourceType("CONNECTED", 2, RealtimeConstants.MQTT_CONNECTED);
        A05 = rIXUChainingSourceType3;
        RIXUChainingSourceType rIXUChainingSourceType4 = new RIXUChainingSourceType("CONTENT_NOTES", 3, "content_notes");
        A06 = rIXUChainingSourceType4;
        RIXUChainingSourceType rIXUChainingSourceType5 = new RIXUChainingSourceType("LIKED_BY_FOLLOWEE", 4, "liked_by_followee");
        A07 = rIXUChainingSourceType5;
        RIXUChainingSourceType rIXUChainingSourceType6 = new RIXUChainingSourceType("META_VERIFIED_CREATORS", 5, "meta_verified_creators");
        A08 = rIXUChainingSourceType6;
        RIXUChainingSourceType rIXUChainingSourceType7 = new RIXUChainingSourceType("TOP_RESHARED", 6, "top_reshared");
        A09 = rIXUChainingSourceType7;
        RIXUChainingSourceType rIXUChainingSourceType8 = new RIXUChainingSourceType("UNCONNECTED", 7, "unconnected");
        A0A = rIXUChainingSourceType8;
        RIXUChainingSourceType[] rIXUChainingSourceTypeArr = {rIXUChainingSourceType, rIXUChainingSourceType2, rIXUChainingSourceType3, rIXUChainingSourceType4, rIXUChainingSourceType5, rIXUChainingSourceType6, rIXUChainingSourceType7, rIXUChainingSourceType8};
        A03 = rIXUChainingSourceTypeArr;
        A02 = AbstractC12190kN.A00(rIXUChainingSourceTypeArr);
        RIXUChainingSourceType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXUChainingSourceType rIXUChainingSourceType9 : values) {
            linkedHashMap.put(rIXUChainingSourceType9.A00, rIXUChainingSourceType9);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(92);
    }

    public static RIXUChainingSourceType valueOf(String str) {
        return (RIXUChainingSourceType) Enum.valueOf(RIXUChainingSourceType.class, str);
    }

    public static RIXUChainingSourceType[] values() {
        return (RIXUChainingSourceType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUChainingSourceType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
