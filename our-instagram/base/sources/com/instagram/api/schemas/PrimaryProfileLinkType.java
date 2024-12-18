package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PrimaryProfileLinkType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PrimaryProfileLinkType[] A03;
    public static final PrimaryProfileLinkType A04;
    public static final PrimaryProfileLinkType A05;
    public static final PrimaryProfileLinkType A06;
    public static final PrimaryProfileLinkType A07;
    public static final PrimaryProfileLinkType A08;
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
        PrimaryProfileLinkType primaryProfileLinkType = new PrimaryProfileLinkType("UNRECOGNIZED", 0, "PrimaryProfileLinkType_unspecified");
        A08 = primaryProfileLinkType;
        PrimaryProfileLinkType primaryProfileLinkType2 = new PrimaryProfileLinkType("DEFAULT", 1, "3");
        A04 = primaryProfileLinkType2;
        PrimaryProfileLinkType primaryProfileLinkType3 = new PrimaryProfileLinkType("EXTERNAL", 2, "0");
        A05 = primaryProfileLinkType3;
        PrimaryProfileLinkType primaryProfileLinkType4 = new PrimaryProfileLinkType("FACEBOOK", 3, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A06 = primaryProfileLinkType4;
        PrimaryProfileLinkType primaryProfileLinkType5 = new PrimaryProfileLinkType("FACEBOOK_PAGE", 4, "2");
        A07 = primaryProfileLinkType5;
        PrimaryProfileLinkType[] primaryProfileLinkTypeArr = {primaryProfileLinkType, primaryProfileLinkType2, primaryProfileLinkType3, primaryProfileLinkType4, primaryProfileLinkType5};
        A03 = primaryProfileLinkTypeArr;
        A02 = AbstractC12190kN.A00(primaryProfileLinkTypeArr);
        PrimaryProfileLinkType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (PrimaryProfileLinkType primaryProfileLinkType6 : values) {
            linkedHashMap.put(primaryProfileLinkType6.A00, primaryProfileLinkType6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(82);
    }

    public static PrimaryProfileLinkType valueOf(String str) {
        return (PrimaryProfileLinkType) Enum.valueOf(PrimaryProfileLinkType.class, str);
    }

    public static PrimaryProfileLinkType[] values() {
        return (PrimaryProfileLinkType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PrimaryProfileLinkType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
