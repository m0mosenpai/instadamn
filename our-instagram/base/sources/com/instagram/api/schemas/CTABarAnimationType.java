package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class CTABarAnimationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CTABarAnimationType[] A03;
    public static final CTABarAnimationType A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CTABarAnimationType cTABarAnimationType = new CTABarAnimationType("UNRECOGNIZED", 0, "CTABarAnimationType_unspecified");
        A04 = cTABarAnimationType;
        CTABarAnimationType[] cTABarAnimationTypeArr = {cTABarAnimationType, new CTABarAnimationType("HIGHLIGHT_BAR", 1, "highlight_bar")};
        A03 = cTABarAnimationTypeArr;
        A02 = AbstractC12190kN.A00(cTABarAnimationTypeArr);
        CTABarAnimationType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CTABarAnimationType cTABarAnimationType2 : values) {
            A18.put(cTABarAnimationType2.A00, cTABarAnimationType2);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(87);
    }

    public static CTABarAnimationType valueOf(String str) {
        return (CTABarAnimationType) Enum.valueOf(CTABarAnimationType.class, str);
    }

    public static CTABarAnimationType[] values() {
        return (CTABarAnimationType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CTABarAnimationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
