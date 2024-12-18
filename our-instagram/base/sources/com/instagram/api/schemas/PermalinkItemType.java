package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PermalinkItemType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PermalinkItemType[] A03;
    public static final PermalinkItemType A04;
    public static final PermalinkItemType A05;
    public static final PermalinkItemType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PermalinkItemType permalinkItemType = new PermalinkItemType("UNRECOGNIZED", 0, "PermalinkItemType_unspecified");
        A06 = permalinkItemType;
        PermalinkItemType permalinkItemType2 = new PermalinkItemType("TARGET_POST", 1, "target_post");
        A05 = permalinkItemType2;
        PermalinkItemType permalinkItemType3 = new PermalinkItemType("POST", 2, "post");
        A04 = permalinkItemType3;
        PermalinkItemType[] permalinkItemTypeArr = {permalinkItemType, permalinkItemType2, permalinkItemType3, new PermalinkItemType("LOAD_MORE", 3, "load_more")};
        A03 = permalinkItemTypeArr;
        A02 = AbstractC12190kN.A00(permalinkItemTypeArr);
        PermalinkItemType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (PermalinkItemType permalinkItemType4 : values) {
            A18.put(permalinkItemType4.A00, permalinkItemType4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(34);
    }

    public static PermalinkItemType valueOf(String str) {
        return (PermalinkItemType) Enum.valueOf(PermalinkItemType.class, str);
    }

    public static PermalinkItemType[] values() {
        return (PermalinkItemType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PermalinkItemType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
