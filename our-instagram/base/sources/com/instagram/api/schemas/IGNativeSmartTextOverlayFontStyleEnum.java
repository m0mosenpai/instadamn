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
/* loaded from: classes5.dex */
public final class IGNativeSmartTextOverlayFontStyleEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGNativeSmartTextOverlayFontStyleEnum[] A03;
    public static final IGNativeSmartTextOverlayFontStyleEnum A04;
    public static final IGNativeSmartTextOverlayFontStyleEnum A05;
    public static final IGNativeSmartTextOverlayFontStyleEnum A06;
    public static final IGNativeSmartTextOverlayFontStyleEnum A07;
    public static final IGNativeSmartTextOverlayFontStyleEnum A08;
    public static final IGNativeSmartTextOverlayFontStyleEnum A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum = new IGNativeSmartTextOverlayFontStyleEnum("UNRECOGNIZED", 0, "IGNativeSmartTextOverlayFontStyleEnum_unspecified");
        A09 = iGNativeSmartTextOverlayFontStyleEnum;
        IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum2 = new IGNativeSmartTextOverlayFontStyleEnum("HOEFLER_TEXT_REGULAR", 1, "HOEFLER_TEXT_REGULAR");
        A04 = iGNativeSmartTextOverlayFontStyleEnum2;
        IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum3 = new IGNativeSmartTextOverlayFontStyleEnum("INSTAGRAM_SANS", 2, "INSTAGRAM_SANS");
        A05 = iGNativeSmartTextOverlayFontStyleEnum3;
        IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum4 = new IGNativeSmartTextOverlayFontStyleEnum("ROBOTO", 3, "ROBOTO");
        A06 = iGNativeSmartTextOverlayFontStyleEnum4;
        IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum5 = new IGNativeSmartTextOverlayFontStyleEnum("ROBOTO_BOLD", 4, "ROBOTO_BOLD");
        A07 = iGNativeSmartTextOverlayFontStyleEnum5;
        IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum6 = new IGNativeSmartTextOverlayFontStyleEnum("SF_PRO_BOLD_TEXT", 5, "SF_PRO_BOLD_TEXT");
        A08 = iGNativeSmartTextOverlayFontStyleEnum6;
        IGNativeSmartTextOverlayFontStyleEnum[] iGNativeSmartTextOverlayFontStyleEnumArr = {iGNativeSmartTextOverlayFontStyleEnum, iGNativeSmartTextOverlayFontStyleEnum2, iGNativeSmartTextOverlayFontStyleEnum3, iGNativeSmartTextOverlayFontStyleEnum4, iGNativeSmartTextOverlayFontStyleEnum5, iGNativeSmartTextOverlayFontStyleEnum6, new IGNativeSmartTextOverlayFontStyleEnum("SF_PRO_TEXT", 6, "SF_PRO_TEXT")};
        A03 = iGNativeSmartTextOverlayFontStyleEnumArr;
        A02 = AbstractC12190kN.A00(iGNativeSmartTextOverlayFontStyleEnumArr);
        IGNativeSmartTextOverlayFontStyleEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGNativeSmartTextOverlayFontStyleEnum iGNativeSmartTextOverlayFontStyleEnum7 : values) {
            A18.put(iGNativeSmartTextOverlayFontStyleEnum7.A00, iGNativeSmartTextOverlayFontStyleEnum7);
        }
        A01 = A18;
        CREATOR = new C41858IgC(41);
    }

    public static IGNativeSmartTextOverlayFontStyleEnum valueOf(String str) {
        return (IGNativeSmartTextOverlayFontStyleEnum) Enum.valueOf(IGNativeSmartTextOverlayFontStyleEnum.class, str);
    }

    public static IGNativeSmartTextOverlayFontStyleEnum[] values() {
        return (IGNativeSmartTextOverlayFontStyleEnum[]) A03.clone();
    }

    public IGNativeSmartTextOverlayFontStyleEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
