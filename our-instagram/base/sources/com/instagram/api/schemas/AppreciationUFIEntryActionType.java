package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AppreciationUFIEntryActionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AppreciationUFIEntryActionType[] A03;
    public static final AppreciationUFIEntryActionType A04;
    public static final AppreciationUFIEntryActionType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AppreciationUFIEntryActionType appreciationUFIEntryActionType = new AppreciationUFIEntryActionType("UNRECOGNIZED", 0, "AppreciationUFIEntryActionType_unspecified");
        A05 = appreciationUFIEntryActionType;
        AppreciationUFIEntryActionType appreciationUFIEntryActionType2 = new AppreciationUFIEntryActionType("GIFT_FEED", 1, "gift_feed");
        A04 = appreciationUFIEntryActionType2;
        AppreciationUFIEntryActionType[] appreciationUFIEntryActionTypeArr = {appreciationUFIEntryActionType, appreciationUFIEntryActionType2, new AppreciationUFIEntryActionType("GIFTING", 2, "gifting")};
        A03 = appreciationUFIEntryActionTypeArr;
        A02 = AbstractC12190kN.A00(appreciationUFIEntryActionTypeArr);
        AppreciationUFIEntryActionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AppreciationUFIEntryActionType appreciationUFIEntryActionType3 : values) {
            A18.put(appreciationUFIEntryActionType3.A00, appreciationUFIEntryActionType3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(51);
    }

    public static AppreciationUFIEntryActionType valueOf(String str) {
        return (AppreciationUFIEntryActionType) Enum.valueOf(AppreciationUFIEntryActionType.class, str);
    }

    public static AppreciationUFIEntryActionType[] values() {
        return (AppreciationUFIEntryActionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AppreciationUFIEntryActionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
