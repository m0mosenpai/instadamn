package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CreatorSegmentation implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorSegmentation[] A03;
    public static final CreatorSegmentation A04;
    public static final CreatorSegmentation A05;
    public static final CreatorSegmentation A06;
    public static final CreatorSegmentation A07;
    public static final CreatorSegmentation A08;
    public static final CreatorSegmentation A09;
    public static final CreatorSegmentation A0A;
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
        CreatorSegmentation creatorSegmentation = new CreatorSegmentation("UNRECOGNIZED", 0, "CreatorSegmentation_unspecified");
        A0A = creatorSegmentation;
        CreatorSegmentation creatorSegmentation2 = new CreatorSegmentation("ASPIRING", 1, "aspiring");
        A04 = creatorSegmentation2;
        CreatorSegmentation creatorSegmentation3 = new CreatorSegmentation("EMERGING", 2, "emerging");
        A05 = creatorSegmentation3;
        CreatorSegmentation creatorSegmentation4 = new CreatorSegmentation("ESTABLISHED", 3, "established");
        A06 = creatorSegmentation4;
        CreatorSegmentation creatorSegmentation5 = new CreatorSegmentation("EXPERIMENTING", 4, "experimenting");
        A07 = creatorSegmentation5;
        CreatorSegmentation creatorSegmentation6 = new CreatorSegmentation("PREEXPERIMENTING", 5, "pre-experimenting");
        A08 = creatorSegmentation6;
        CreatorSegmentation creatorSegmentation7 = new CreatorSegmentation("SUPERSTAR", 6, "superstar");
        A09 = creatorSegmentation7;
        CreatorSegmentation[] creatorSegmentationArr = {creatorSegmentation, creatorSegmentation2, creatorSegmentation3, creatorSegmentation4, creatorSegmentation5, creatorSegmentation6, creatorSegmentation7, new CreatorSegmentation("UNKNOWN", 7, "unknown")};
        A03 = creatorSegmentationArr;
        A02 = AbstractC12190kN.A00(creatorSegmentationArr);
        CreatorSegmentation[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CreatorSegmentation creatorSegmentation8 : values) {
            linkedHashMap.put(creatorSegmentation8.A00, creatorSegmentation8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(83);
    }

    public static CreatorSegmentation valueOf(String str) {
        return (CreatorSegmentation) Enum.valueOf(CreatorSegmentation.class, str);
    }

    public static CreatorSegmentation[] values() {
        return (CreatorSegmentation[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorSegmentation(String str, int i, String str2) {
        this.A00 = str2;
    }
}
