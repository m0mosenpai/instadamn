package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class XDTFloatingContextItemType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XDTFloatingContextItemType[] A03;
    public static final XDTFloatingContextItemType A04;
    public static final XDTFloatingContextItemType A05;
    public static final XDTFloatingContextItemType A06;
    public static final XDTFloatingContextItemType A07;
    public static final XDTFloatingContextItemType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XDTFloatingContextItemType xDTFloatingContextItemType = new XDTFloatingContextItemType("UNRECOGNIZED", 0, "XDTFloatingContextItemType_unspecified");
        A08 = xDTFloatingContextItemType;
        XDTFloatingContextItemType xDTFloatingContextItemType2 = new XDTFloatingContextItemType("COMMENTED_BY", 1, "COMMENTED_BY");
        A04 = xDTFloatingContextItemType2;
        XDTFloatingContextItemType xDTFloatingContextItemType3 = new XDTFloatingContextItemType("COMMENT_VIEWER_BUBBLE", 2, "COMMENT_VIEWER_BUBBLE");
        A05 = xDTFloatingContextItemType3;
        XDTFloatingContextItemType xDTFloatingContextItemType4 = new XDTFloatingContextItemType("CONTENT_NOTE", 3, "CONTENT_NOTE");
        A06 = xDTFloatingContextItemType4;
        XDTFloatingContextItemType xDTFloatingContextItemType5 = new XDTFloatingContextItemType("LIKED_BY", 4, "LIKED_BY");
        A07 = xDTFloatingContextItemType5;
        XDTFloatingContextItemType[] xDTFloatingContextItemTypeArr = {xDTFloatingContextItemType, xDTFloatingContextItemType2, xDTFloatingContextItemType3, xDTFloatingContextItemType4, xDTFloatingContextItemType5, new XDTFloatingContextItemType("LIKED_VIEWER_BUBBLE", 5, "LIKED_VIEWER_BUBBLE")};
        A03 = xDTFloatingContextItemTypeArr;
        A02 = AbstractC12190kN.A00(xDTFloatingContextItemTypeArr);
        XDTFloatingContextItemType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XDTFloatingContextItemType xDTFloatingContextItemType6 : values) {
            A18.put(xDTFloatingContextItemType6.A00, xDTFloatingContextItemType6);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(89);
    }

    public static XDTFloatingContextItemType valueOf(String str) {
        return (XDTFloatingContextItemType) Enum.valueOf(XDTFloatingContextItemType.class, str);
    }

    public static XDTFloatingContextItemType[] values() {
        return (XDTFloatingContextItemType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XDTFloatingContextItemType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
