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
public final class IGNativeSmartTextOverlayBackgroundShape implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGNativeSmartTextOverlayBackgroundShape[] A03;
    public static final IGNativeSmartTextOverlayBackgroundShape A04;
    public static final IGNativeSmartTextOverlayBackgroundShape A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGNativeSmartTextOverlayBackgroundShape iGNativeSmartTextOverlayBackgroundShape = new IGNativeSmartTextOverlayBackgroundShape("UNRECOGNIZED", 0, "IGNativeSmartTextOverlayBackgroundShape_unspecified");
        A05 = iGNativeSmartTextOverlayBackgroundShape;
        IGNativeSmartTextOverlayBackgroundShape iGNativeSmartTextOverlayBackgroundShape2 = new IGNativeSmartTextOverlayBackgroundShape("DYNAMIC_LINE_WIDTH_ROUNDED_CORNER", 1, "DYNAMIC_LINE_WIDTH_ROUNDED_CORNER");
        A04 = iGNativeSmartTextOverlayBackgroundShape2;
        IGNativeSmartTextOverlayBackgroundShape[] iGNativeSmartTextOverlayBackgroundShapeArr = {iGNativeSmartTextOverlayBackgroundShape, iGNativeSmartTextOverlayBackgroundShape2, new IGNativeSmartTextOverlayBackgroundShape("RECTANGLE_FIXED_WIDTH", 2, "RECTANGLE_FIXED_WIDTH")};
        A03 = iGNativeSmartTextOverlayBackgroundShapeArr;
        A02 = AbstractC12190kN.A00(iGNativeSmartTextOverlayBackgroundShapeArr);
        IGNativeSmartTextOverlayBackgroundShape[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGNativeSmartTextOverlayBackgroundShape iGNativeSmartTextOverlayBackgroundShape3 : values) {
            A18.put(iGNativeSmartTextOverlayBackgroundShape3.A00, iGNativeSmartTextOverlayBackgroundShape3);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(40);
    }

    public static IGNativeSmartTextOverlayBackgroundShape valueOf(String str) {
        return (IGNativeSmartTextOverlayBackgroundShape) Enum.valueOf(IGNativeSmartTextOverlayBackgroundShape.class, str);
    }

    public static IGNativeSmartTextOverlayBackgroundShape[] values() {
        return (IGNativeSmartTextOverlayBackgroundShape[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGNativeSmartTextOverlayBackgroundShape(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
