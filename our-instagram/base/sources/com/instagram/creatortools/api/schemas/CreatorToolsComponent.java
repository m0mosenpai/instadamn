package com.instagram.creatortools.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CreatorToolsComponent implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorToolsComponent[] A03;
    public static final CreatorToolsComponent A04;
    public static final CreatorToolsComponent A05;
    public static final CreatorToolsComponent A06;
    public static final CreatorToolsComponent A07;
    public static final CreatorToolsComponent A08;
    public static final CreatorToolsComponent A09;
    public static final CreatorToolsComponent A0A;
    public static final CreatorToolsComponent A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorToolsComponent creatorToolsComponent = new CreatorToolsComponent("UNRECOGNIZED", 0, "CreatorToolsComponent_unspecified");
        A0B = creatorToolsComponent;
        CreatorToolsComponent creatorToolsComponent2 = new CreatorToolsComponent("COVER", 1, "cover");
        A04 = creatorToolsComponent2;
        CreatorToolsComponent creatorToolsComponent3 = new CreatorToolsComponent("FOOTER", 2, "footer");
        A05 = creatorToolsComponent3;
        CreatorToolsComponent creatorToolsComponent4 = new CreatorToolsComponent("INSIGHTS", 3, "insights");
        A06 = creatorToolsComponent4;
        CreatorToolsComponent creatorToolsComponent5 = new CreatorToolsComponent("INSPIRATION", 4, "inspiration");
        A07 = creatorToolsComponent5;
        CreatorToolsComponent creatorToolsComponent6 = new CreatorToolsComponent("MONETIZATION", 5, "monetization");
        A08 = creatorToolsComponent6;
        CreatorToolsComponent creatorToolsComponent7 = new CreatorToolsComponent("PRODUCT_ELIGIBILITY_CRITERIA", 6, "product_eligibility_criteria");
        A09 = creatorToolsComponent7;
        CreatorToolsComponent creatorToolsComponent8 = new CreatorToolsComponent("SECTION_HEADER", 7, "section_header");
        A0A = creatorToolsComponent8;
        CreatorToolsComponent[] creatorToolsComponentArr = {creatorToolsComponent, creatorToolsComponent2, creatorToolsComponent3, creatorToolsComponent4, creatorToolsComponent5, creatorToolsComponent6, creatorToolsComponent7, creatorToolsComponent8, new CreatorToolsComponent("PRODUCT_VALUE_PROPS", 8, "value_prop")};
        A03 = creatorToolsComponentArr;
        A02 = AbstractC12190kN.A00(creatorToolsComponentArr);
        CreatorToolsComponent[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorToolsComponent creatorToolsComponent9 : values) {
            A18.put(creatorToolsComponent9.A00, creatorToolsComponent9);
        }
        A01 = A18;
        CREATOR = new LNM(87);
    }

    public static CreatorToolsComponent valueOf(String str) {
        return (CreatorToolsComponent) Enum.valueOf(CreatorToolsComponent.class, str);
    }

    public static CreatorToolsComponent[] values() {
        return (CreatorToolsComponent[]) A03.clone();
    }

    public CreatorToolsComponent(String str, int i, String str2) {
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
