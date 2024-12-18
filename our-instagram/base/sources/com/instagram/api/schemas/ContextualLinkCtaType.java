package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ContextualLinkCtaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContextualLinkCtaType[] A03;
    public static final ContextualLinkCtaType A04;
    public static final ContextualLinkCtaType A05;
    public static final ContextualLinkCtaType A06;
    public static final ContextualLinkCtaType A07;
    public static final ContextualLinkCtaType A08;
    public static final ContextualLinkCtaType A09;
    public static final ContextualLinkCtaType A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ContextualLinkCtaType contextualLinkCtaType = new ContextualLinkCtaType("UNRECOGNIZED", 0, "ContextualLinkCtaType_unspecified");
        A0A = contextualLinkCtaType;
        ContextualLinkCtaType contextualLinkCtaType2 = new ContextualLinkCtaType("CONTENT_APPRECIATION", 1, "content_appreciation");
        A04 = contextualLinkCtaType2;
        ContextualLinkCtaType contextualLinkCtaType3 = new ContextualLinkCtaType("CREATOR_PICK", 2, "creator_pick");
        A05 = contextualLinkCtaType3;
        ContextualLinkCtaType contextualLinkCtaType4 = new ContextualLinkCtaType("MASHUP", 3, "mashup");
        A06 = contextualLinkCtaType4;
        ContextualLinkCtaType contextualLinkCtaType5 = new ContextualLinkCtaType("SEE_MORE_PROMPTS", 4, "see_more_prompts");
        A07 = contextualLinkCtaType5;
        ContextualLinkCtaType contextualLinkCtaType6 = new ContextualLinkCtaType("SEQUENCE", 5, "sequence");
        A08 = contextualLinkCtaType6;
        ContextualLinkCtaType contextualLinkCtaType7 = new ContextualLinkCtaType("TEMPLATE", 6, "template");
        A09 = contextualLinkCtaType7;
        ContextualLinkCtaType[] contextualLinkCtaTypeArr = {contextualLinkCtaType, contextualLinkCtaType2, contextualLinkCtaType3, contextualLinkCtaType4, contextualLinkCtaType5, contextualLinkCtaType6, contextualLinkCtaType7, new ContextualLinkCtaType("VIEW_INSIGHTS", 7, "view_insights")};
        A03 = contextualLinkCtaTypeArr;
        A02 = AbstractC12190kN.A00(contextualLinkCtaTypeArr);
        ContextualLinkCtaType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ContextualLinkCtaType contextualLinkCtaType8 : values) {
            A18.put(contextualLinkCtaType8.A00, contextualLinkCtaType8);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(38);
    }

    public static ContextualLinkCtaType valueOf(String str) {
        return (ContextualLinkCtaType) Enum.valueOf(ContextualLinkCtaType.class, str);
    }

    public static ContextualLinkCtaType[] values() {
        return (ContextualLinkCtaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ContextualLinkCtaType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
