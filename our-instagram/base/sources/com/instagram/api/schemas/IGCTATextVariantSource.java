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
/* loaded from: classes6.dex */
public final class IGCTATextVariantSource implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGCTATextVariantSource[] A03;
    public static final IGCTATextVariantSource A04;
    public static final IGCTATextVariantSource A05;
    public static final IGCTATextVariantSource A06;
    public static final IGCTATextVariantSource A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGCTATextVariantSource iGCTATextVariantSource = new IGCTATextVariantSource("UNRECOGNIZED", 0, "IGCTATextVariantSource_unspecified");
        A07 = iGCTATextVariantSource;
        IGCTATextVariantSource iGCTATextVariantSource2 = new IGCTATextVariantSource("CTA_GENAI_GENERATED_DYNAMIC_TEXT", 1, "cta_genai_generated_dynamic_text");
        A04 = iGCTATextVariantSource2;
        IGCTATextVariantSource iGCTATextVariantSource3 = new IGCTATextVariantSource("CTA_GENAI_L1_EXTRACTED_DYNAMIC_TEXT", 2, "cta_genai_l1_extracted_dynamic_text");
        A05 = iGCTATextVariantSource3;
        IGCTATextVariantSource iGCTATextVariantSource4 = new IGCTATextVariantSource("CTA_PREGENERATED_DYNAMIC_TEXT_ADVANCED", 3, "cta_pregenerated_cta_dynamic_text_advanced");
        A06 = iGCTATextVariantSource4;
        IGCTATextVariantSource[] iGCTATextVariantSourceArr = {iGCTATextVariantSource, iGCTATextVariantSource2, iGCTATextVariantSource3, iGCTATextVariantSource4, new IGCTATextVariantSource("CTA_PREGENERATED_DYNAMIC_TEXT_GENERIC", 4, "cta_pregenerated_cta_dynamic_text_generic")};
        A03 = iGCTATextVariantSourceArr;
        A02 = AbstractC12190kN.A00(iGCTATextVariantSourceArr);
        IGCTATextVariantSource[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGCTATextVariantSource iGCTATextVariantSource5 : values) {
            A18.put(iGCTATextVariantSource5.A00, iGCTATextVariantSource5);
        }
        A01 = A18;
        CREATOR = new C41858IgC(28);
    }

    public static IGCTATextVariantSource valueOf(String str) {
        return (IGCTATextVariantSource) Enum.valueOf(IGCTATextVariantSource.class, str);
    }

    public static IGCTATextVariantSource[] values() {
        return (IGCTATextVariantSource[]) A03.clone();
    }

    public IGCTATextVariantSource(String str, int i, String str2) {
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
