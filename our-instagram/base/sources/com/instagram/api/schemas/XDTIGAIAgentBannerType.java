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
public final class XDTIGAIAgentBannerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XDTIGAIAgentBannerType[] A03;
    public static final XDTIGAIAgentBannerType A04;
    public static final XDTIGAIAgentBannerType A05;
    public static final XDTIGAIAgentBannerType A06;
    public static final XDTIGAIAgentBannerType A07;
    public static final XDTIGAIAgentBannerType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XDTIGAIAgentBannerType xDTIGAIAgentBannerType = new XDTIGAIAgentBannerType("UNRECOGNIZED", 0, "XDTIGAIAgentBannerType_unspecified");
        A08 = xDTIGAIAgentBannerType;
        XDTIGAIAgentBannerType xDTIGAIAgentBannerType2 = new XDTIGAIAgentBannerType("IN_REVIEW", 1, "in_review");
        A04 = xDTIGAIAgentBannerType2;
        XDTIGAIAgentBannerType xDTIGAIAgentBannerType3 = new XDTIGAIAgentBannerType("REJECTED", 2, "rejected");
        A05 = xDTIGAIAgentBannerType3;
        XDTIGAIAgentBannerType xDTIGAIAgentBannerType4 = new XDTIGAIAgentBannerType("SAFETY_WARNING", 3, "safety_warning");
        A06 = xDTIGAIAgentBannerType4;
        XDTIGAIAgentBannerType xDTIGAIAgentBannerType5 = new XDTIGAIAgentBannerType("TAKEN_DOWN", 4, "taken_down");
        A07 = xDTIGAIAgentBannerType5;
        XDTIGAIAgentBannerType[] xDTIGAIAgentBannerTypeArr = {xDTIGAIAgentBannerType, xDTIGAIAgentBannerType2, xDTIGAIAgentBannerType3, xDTIGAIAgentBannerType4, xDTIGAIAgentBannerType5, new XDTIGAIAgentBannerType("TURN_LIMITED", 5, "turn_limited")};
        A03 = xDTIGAIAgentBannerTypeArr;
        A02 = AbstractC12190kN.A00(xDTIGAIAgentBannerTypeArr);
        XDTIGAIAgentBannerType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XDTIGAIAgentBannerType xDTIGAIAgentBannerType6 : values) {
            A18.put(xDTIGAIAgentBannerType6.A00, xDTIGAIAgentBannerType6);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(90);
    }

    public static XDTIGAIAgentBannerType valueOf(String str) {
        return (XDTIGAIAgentBannerType) Enum.valueOf(XDTIGAIAgentBannerType.class, str);
    }

    public static XDTIGAIAgentBannerType[] values() {
        return (XDTIGAIAgentBannerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XDTIGAIAgentBannerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
