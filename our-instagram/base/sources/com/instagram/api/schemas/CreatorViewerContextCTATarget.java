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
public final class CreatorViewerContextCTATarget implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorViewerContextCTATarget[] A03;
    public static final CreatorViewerContextCTATarget A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorViewerContextCTATarget creatorViewerContextCTATarget = new CreatorViewerContextCTATarget("UNRECOGNIZED", 0, "CreatorViewerContextCTATarget_unspecified");
        A04 = creatorViewerContextCTATarget;
        CreatorViewerContextCTATarget[] creatorViewerContextCTATargetArr = {creatorViewerContextCTATarget, new CreatorViewerContextCTATarget("OPEN_RECIPE_SHEET", 1, "open_recipe_sheet")};
        A03 = creatorViewerContextCTATargetArr;
        A02 = AbstractC12190kN.A00(creatorViewerContextCTATargetArr);
        CreatorViewerContextCTATarget[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorViewerContextCTATarget creatorViewerContextCTATarget2 : values) {
            A18.put(creatorViewerContextCTATarget2.A00, creatorViewerContextCTATarget2);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(43);
    }

    public static CreatorViewerContextCTATarget valueOf(String str) {
        return (CreatorViewerContextCTATarget) Enum.valueOf(CreatorViewerContextCTATarget.class, str);
    }

    public static CreatorViewerContextCTATarget[] values() {
        return (CreatorViewerContextCTATarget[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorViewerContextCTATarget(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
