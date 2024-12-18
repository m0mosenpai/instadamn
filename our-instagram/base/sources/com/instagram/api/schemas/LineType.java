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
/* loaded from: classes3.dex */
public final class LineType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LineType[] A03;
    public static final LineType A04;
    public static final LineType A05;
    public static final LineType A06;
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
        LineType lineType = new LineType("UNRECOGNIZED", 0, "LineType_unspecified");
        A06 = lineType;
        LineType lineType2 = new LineType("LINE", 1, "line");
        A04 = lineType2;
        LineType lineType3 = new LineType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE);
        A05 = lineType3;
        LineType[] lineTypeArr = {lineType, lineType2, lineType3, new LineType("SQUIGGLE", 3, "squiggle")};
        A03 = lineTypeArr;
        A02 = AbstractC12190kN.A00(lineTypeArr);
        LineType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (LineType lineType4 : values) {
            linkedHashMap.put(lineType4.A00, lineType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(36);
    }

    public static LineType valueOf(String str) {
        return (LineType) Enum.valueOf(LineType.class, str);
    }

    public static LineType[] values() {
        return (LineType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LineType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
