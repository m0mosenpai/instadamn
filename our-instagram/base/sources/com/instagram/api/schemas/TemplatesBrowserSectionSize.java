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
public final class TemplatesBrowserSectionSize implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TemplatesBrowserSectionSize[] A03;
    public static final TemplatesBrowserSectionSize A04;
    public static final TemplatesBrowserSectionSize A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TemplatesBrowserSectionSize templatesBrowserSectionSize = new TemplatesBrowserSectionSize("UNRECOGNIZED", 0, "TemplatesBrowserSectionSize_unspecified");
        A05 = templatesBrowserSectionSize;
        TemplatesBrowserSectionSize templatesBrowserSectionSize2 = new TemplatesBrowserSectionSize("LARGE", 1, "large");
        A04 = templatesBrowserSectionSize2;
        TemplatesBrowserSectionSize[] templatesBrowserSectionSizeArr = {templatesBrowserSectionSize, templatesBrowserSectionSize2, new TemplatesBrowserSectionSize("SMALL", 2, "small")};
        A03 = templatesBrowserSectionSizeArr;
        A02 = AbstractC12190kN.A00(templatesBrowserSectionSizeArr);
        TemplatesBrowserSectionSize[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TemplatesBrowserSectionSize templatesBrowserSectionSize3 : values) {
            A18.put(templatesBrowserSectionSize3.A00, templatesBrowserSectionSize3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(44);
    }

    public static TemplatesBrowserSectionSize valueOf(String str) {
        return (TemplatesBrowserSectionSize) Enum.valueOf(TemplatesBrowserSectionSize.class, str);
    }

    public static TemplatesBrowserSectionSize[] values() {
        return (TemplatesBrowserSectionSize[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TemplatesBrowserSectionSize(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
