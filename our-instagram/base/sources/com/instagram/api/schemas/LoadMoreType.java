package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class LoadMoreType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LoadMoreType[] A03;
    public static final LoadMoreType A04;
    public static final LoadMoreType A05;
    public static final LoadMoreType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LoadMoreType loadMoreType = new LoadMoreType("UNRECOGNIZED", 0, "LoadMoreType_unspecified");
        A06 = loadMoreType;
        LoadMoreType loadMoreType2 = new LoadMoreType("REPLIES", 1, "replies");
        A04 = loadMoreType2;
        LoadMoreType loadMoreType3 = new LoadMoreType("THREAD", 2, "thread");
        A05 = loadMoreType3;
        LoadMoreType[] loadMoreTypeArr = {loadMoreType, loadMoreType2, loadMoreType3, new LoadMoreType("PAGING", 3, "paging")};
        A03 = loadMoreTypeArr;
        A02 = AbstractC12190kN.A00(loadMoreTypeArr);
        LoadMoreType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (LoadMoreType loadMoreType4 : values) {
            A18.put(loadMoreType4.A00, loadMoreType4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(75);
    }

    public static LoadMoreType valueOf(String str) {
        return (LoadMoreType) Enum.valueOf(LoadMoreType.class, str);
    }

    public static LoadMoreType[] values() {
        return (LoadMoreType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LoadMoreType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
