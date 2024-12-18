package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RIXUCtaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUCtaType[] A03;
    public static final RIXUCtaType A04;
    public static final RIXUCtaType A05;
    public static final RIXUCtaType A06;
    public static final RIXUCtaType A07;
    public static final RIXUCtaType A08;
    public static final RIXUCtaType A09;
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
        RIXUCtaType rIXUCtaType = new RIXUCtaType("UNRECOGNIZED", 0, "RIXUCtaType_unspecified");
        A05 = rIXUCtaType;
        RIXUCtaType rIXUCtaType2 = new RIXUCtaType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, NetInfoModule.CONNECTION_TYPE_NONE);
        A04 = rIXUCtaType2;
        RIXUCtaType rIXUCtaType3 = new RIXUCtaType("WATCH_ALL", 2, "watch_all");
        A07 = rIXUCtaType3;
        RIXUCtaType rIXUCtaType4 = new RIXUCtaType("WATCH_REELS", 3, "watch_reels");
        A08 = rIXUCtaType4;
        RIXUCtaType rIXUCtaType5 = new RIXUCtaType("VIEW_ALL", 4, "view_all");
        A06 = rIXUCtaType5;
        RIXUCtaType rIXUCtaType6 = new RIXUCtaType("ZERO_BANNER", 5, "zero_banner");
        A09 = rIXUCtaType6;
        RIXUCtaType[] rIXUCtaTypeArr = {rIXUCtaType, rIXUCtaType2, rIXUCtaType3, rIXUCtaType4, rIXUCtaType5, rIXUCtaType6, new RIXUCtaType("CREATE_STORY", 6, "create_story")};
        A03 = rIXUCtaTypeArr;
        A02 = AbstractC12190kN.A00(rIXUCtaTypeArr);
        RIXUCtaType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (RIXUCtaType rIXUCtaType7 : values) {
            linkedHashMap.put(rIXUCtaType7.A00, rIXUCtaType7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(94);
    }

    public static RIXUCtaType valueOf(String str) {
        return (RIXUCtaType) Enum.valueOf(RIXUCtaType.class, str);
    }

    public static RIXUCtaType[] values() {
        return (RIXUCtaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUCtaType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
