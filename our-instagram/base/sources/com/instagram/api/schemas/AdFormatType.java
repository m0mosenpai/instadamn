package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AdFormatType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdFormatType[] A03;
    public static final AdFormatType A04;
    public static final AdFormatType A05;
    public static final AdFormatType A06;
    public static final AdFormatType A07;
    public static final AdFormatType A08;
    public static final AdFormatType A09;
    public static final AdFormatType A0A;
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
        AdFormatType adFormatType = new AdFormatType("UNRECOGNIZED", 0, "AdFormatType_unspecified");
        A0A = adFormatType;
        AdFormatType adFormatType2 = new AdFormatType("GRID", 1, "3");
        A04 = adFormatType2;
        AdFormatType adFormatType3 = new AdFormatType("H_SCROLL", 2, "2");
        A05 = adFormatType3;
        AdFormatType adFormatType4 = new AdFormatType("MEGACARD", 3, "5");
        A06 = adFormatType4;
        AdFormatType adFormatType5 = new AdFormatType("NATIVE_CAROUSEL", 4, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A07 = adFormatType5;
        AdFormatType adFormatType6 = new AdFormatType("PEEK", 5, "6");
        A08 = adFormatType6;
        AdFormatType adFormatType7 = new AdFormatType("SLIDE_SCRUBBER", 6, "4");
        A09 = adFormatType7;
        AdFormatType[] adFormatTypeArr = {adFormatType, adFormatType2, adFormatType3, adFormatType4, adFormatType5, adFormatType6, adFormatType7, new AdFormatType("UNKNOWN", 7, "0")};
        A03 = adFormatTypeArr;
        A02 = AbstractC12190kN.A00(adFormatTypeArr);
        AdFormatType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (AdFormatType adFormatType8 : values) {
            linkedHashMap.put(adFormatType8.A00, adFormatType8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(42);
    }

    public static AdFormatType valueOf(String str) {
        return (AdFormatType) Enum.valueOf(AdFormatType.class, str);
    }

    public static AdFormatType[] values() {
        return (AdFormatType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdFormatType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
