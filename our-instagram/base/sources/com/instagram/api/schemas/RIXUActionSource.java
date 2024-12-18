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
public final class RIXUActionSource implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUActionSource[] A03;
    public static final RIXUActionSource A04;
    public static final RIXUActionSource A05;
    public static final RIXUActionSource A06;
    public static final RIXUActionSource A07;
    public static final RIXUActionSource A08;
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
        RIXUActionSource rIXUActionSource = new RIXUActionSource("UNRECOGNIZED", 0, "RIXUActionSource_unspecified");
        A08 = rIXUActionSource;
        RIXUActionSource rIXUActionSource2 = new RIXUActionSource("END_OF_FEED_SUGGESTIONS", 1, "end_of_feed_suggestions");
        A04 = rIXUActionSource2;
        RIXUActionSource rIXUActionSource3 = new RIXUActionSource("EXPLORE_MEDIA_CHAIN_SUGGESTED", 2, "explore_media_chain_suggested");
        A05 = rIXUActionSource3;
        RIXUActionSource rIXUActionSource4 = new RIXUActionSource("FEED_BLENDING", 3, "feed_blending");
        A06 = rIXUActionSource4;
        RIXUActionSource rIXUActionSource5 = new RIXUActionSource("FEED_NETEGO", 4, "feed_netego");
        A07 = rIXUActionSource5;
        RIXUActionSource[] rIXUActionSourceArr = {rIXUActionSource, rIXUActionSource2, rIXUActionSource3, rIXUActionSource4, rIXUActionSource5, new RIXUActionSource("UNKNOWN", 5, "unknown")};
        A03 = rIXUActionSourceArr;
        A02 = AbstractC12190kN.A00(rIXUActionSourceArr);
        RIXUActionSource[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXUActionSource rIXUActionSource6 : values) {
            linkedHashMap.put(rIXUActionSource6.A00, rIXUActionSource6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(90);
    }

    public static RIXUActionSource valueOf(String str) {
        return (RIXUActionSource) Enum.valueOf(RIXUActionSource.class, str);
    }

    public static RIXUActionSource[] values() {
        return (RIXUActionSource[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUActionSource(String str, int i, String str2) {
        this.A00 = str2;
    }
}
