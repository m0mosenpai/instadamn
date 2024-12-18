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
public final class IGNativeSmartTextOverlayStylingAlignment implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGNativeSmartTextOverlayStylingAlignment[] A03;
    public static final IGNativeSmartTextOverlayStylingAlignment A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment = new IGNativeSmartTextOverlayStylingAlignment("UNRECOGNIZED", 0, "IGNativeSmartTextOverlayStylingAlignment_unspecified");
        A04 = iGNativeSmartTextOverlayStylingAlignment;
        IGNativeSmartTextOverlayStylingAlignment[] iGNativeSmartTextOverlayStylingAlignmentArr = {iGNativeSmartTextOverlayStylingAlignment, new IGNativeSmartTextOverlayStylingAlignment("CENTER", 1, "CENTER")};
        A03 = iGNativeSmartTextOverlayStylingAlignmentArr;
        A02 = AbstractC12190kN.A00(iGNativeSmartTextOverlayStylingAlignmentArr);
        IGNativeSmartTextOverlayStylingAlignment[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGNativeSmartTextOverlayStylingAlignment iGNativeSmartTextOverlayStylingAlignment2 : values) {
            A18.put(iGNativeSmartTextOverlayStylingAlignment2.A00, iGNativeSmartTextOverlayStylingAlignment2);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(42);
    }

    public static IGNativeSmartTextOverlayStylingAlignment valueOf(String str) {
        return (IGNativeSmartTextOverlayStylingAlignment) Enum.valueOf(IGNativeSmartTextOverlayStylingAlignment.class, str);
    }

    public static IGNativeSmartTextOverlayStylingAlignment[] values() {
        return (IGNativeSmartTextOverlayStylingAlignment[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGNativeSmartTextOverlayStylingAlignment(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
