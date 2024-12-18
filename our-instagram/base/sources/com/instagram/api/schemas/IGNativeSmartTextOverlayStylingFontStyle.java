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
public final class IGNativeSmartTextOverlayStylingFontStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGNativeSmartTextOverlayStylingFontStyle[] A03;
    public static final IGNativeSmartTextOverlayStylingFontStyle A04;
    public static final IGNativeSmartTextOverlayStylingFontStyle A05;
    public static final IGNativeSmartTextOverlayStylingFontStyle A06;
    public static final IGNativeSmartTextOverlayStylingFontStyle A07;
    public static final IGNativeSmartTextOverlayStylingFontStyle A08;
    public static final IGNativeSmartTextOverlayStylingFontStyle A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle = new IGNativeSmartTextOverlayStylingFontStyle("UNRECOGNIZED", 0, "IGNativeSmartTextOverlayStylingFontStyle_unspecified");
        A09 = iGNativeSmartTextOverlayStylingFontStyle;
        IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle2 = new IGNativeSmartTextOverlayStylingFontStyle("HOEFLER_TEXT_REGULAR", 1, "HOEFLER_TEXT_REGULAR");
        A04 = iGNativeSmartTextOverlayStylingFontStyle2;
        IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle3 = new IGNativeSmartTextOverlayStylingFontStyle("INSTAGRAM_SANS", 2, "INSTAGRAM_SANS");
        A05 = iGNativeSmartTextOverlayStylingFontStyle3;
        IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle4 = new IGNativeSmartTextOverlayStylingFontStyle("ROBOTO", 3, "ROBOTO");
        A06 = iGNativeSmartTextOverlayStylingFontStyle4;
        IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle5 = new IGNativeSmartTextOverlayStylingFontStyle("ROBOTO_BOLD", 4, "ROBOTO_BOLD");
        A07 = iGNativeSmartTextOverlayStylingFontStyle5;
        IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle6 = new IGNativeSmartTextOverlayStylingFontStyle("SF_PRO_BOLD_TEXT", 5, "SF_PRO_BOLD_TEXT");
        A08 = iGNativeSmartTextOverlayStylingFontStyle6;
        IGNativeSmartTextOverlayStylingFontStyle[] iGNativeSmartTextOverlayStylingFontStyleArr = {iGNativeSmartTextOverlayStylingFontStyle, iGNativeSmartTextOverlayStylingFontStyle2, iGNativeSmartTextOverlayStylingFontStyle3, iGNativeSmartTextOverlayStylingFontStyle4, iGNativeSmartTextOverlayStylingFontStyle5, iGNativeSmartTextOverlayStylingFontStyle6, new IGNativeSmartTextOverlayStylingFontStyle("SF_PRO_TEXT", 6, "SF_PRO_TEXT")};
        A03 = iGNativeSmartTextOverlayStylingFontStyleArr;
        A02 = AbstractC12190kN.A00(iGNativeSmartTextOverlayStylingFontStyleArr);
        IGNativeSmartTextOverlayStylingFontStyle[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGNativeSmartTextOverlayStylingFontStyle iGNativeSmartTextOverlayStylingFontStyle7 : values) {
            A18.put(iGNativeSmartTextOverlayStylingFontStyle7.A00, iGNativeSmartTextOverlayStylingFontStyle7);
        }
        A01 = A18;
        CREATOR = new C41858IgC(43);
    }

    public static IGNativeSmartTextOverlayStylingFontStyle valueOf(String str) {
        return (IGNativeSmartTextOverlayStylingFontStyle) Enum.valueOf(IGNativeSmartTextOverlayStylingFontStyle.class, str);
    }

    public static IGNativeSmartTextOverlayStylingFontStyle[] values() {
        return (IGNativeSmartTextOverlayStylingFontStyle[]) A03.clone();
    }

    public IGNativeSmartTextOverlayStylingFontStyle(String str, int i, String str2) {
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
