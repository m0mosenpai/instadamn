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
public final class ClipsCuratedTrendFlowVariant implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsCuratedTrendFlowVariant[] A03;
    public static final ClipsCuratedTrendFlowVariant A04;
    public static final ClipsCuratedTrendFlowVariant A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsCuratedTrendFlowVariant clipsCuratedTrendFlowVariant = new ClipsCuratedTrendFlowVariant("UNRECOGNIZED", 0, "ClipsCuratedTrendFlowVariant_unspecified");
        A04 = clipsCuratedTrendFlowVariant;
        ClipsCuratedTrendFlowVariant clipsCuratedTrendFlowVariant2 = new ClipsCuratedTrendFlowVariant("WITH_GUIDANCE", 1, "with_guidance");
        A05 = clipsCuratedTrendFlowVariant2;
        ClipsCuratedTrendFlowVariant[] clipsCuratedTrendFlowVariantArr = {clipsCuratedTrendFlowVariant, clipsCuratedTrendFlowVariant2, new ClipsCuratedTrendFlowVariant("WITH_PLAYLIST", 2, "with_playlist")};
        A03 = clipsCuratedTrendFlowVariantArr;
        A02 = AbstractC12190kN.A00(clipsCuratedTrendFlowVariantArr);
        ClipsCuratedTrendFlowVariant[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsCuratedTrendFlowVariant clipsCuratedTrendFlowVariant3 : values) {
            A18.put(clipsCuratedTrendFlowVariant3.A00, clipsCuratedTrendFlowVariant3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(6);
    }

    public static ClipsCuratedTrendFlowVariant valueOf(String str) {
        return (ClipsCuratedTrendFlowVariant) Enum.valueOf(ClipsCuratedTrendFlowVariant.class, str);
    }

    public static ClipsCuratedTrendFlowVariant[] values() {
        return (ClipsCuratedTrendFlowVariant[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsCuratedTrendFlowVariant(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
