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
/* loaded from: classes7.dex */
public final class AfiInterestsRecoStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AfiInterestsRecoStyle[] A03;
    public static final AfiInterestsRecoStyle A04;
    public static final AfiInterestsRecoStyle A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AfiInterestsRecoStyle afiInterestsRecoStyle = new AfiInterestsRecoStyle("UNRECOGNIZED", 0, "AfiInterestsRecoStyle_unspecified");
        A05 = afiInterestsRecoStyle;
        AfiInterestsRecoStyle afiInterestsRecoStyle2 = new AfiInterestsRecoStyle("HSCROLL", 1, "hscroll");
        A04 = afiInterestsRecoStyle2;
        AfiInterestsRecoStyle[] afiInterestsRecoStyleArr = {afiInterestsRecoStyle, afiInterestsRecoStyle2, new AfiInterestsRecoStyle("VERTICAL", 2, "vertical")};
        A03 = afiInterestsRecoStyleArr;
        A02 = AbstractC12190kN.A00(afiInterestsRecoStyleArr);
        AfiInterestsRecoStyle[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AfiInterestsRecoStyle afiInterestsRecoStyle3 : values) {
            A18.put(afiInterestsRecoStyle3.A00, afiInterestsRecoStyle3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(45);
    }

    public static AfiInterestsRecoStyle valueOf(String str) {
        return (AfiInterestsRecoStyle) Enum.valueOf(AfiInterestsRecoStyle.class, str);
    }

    public static AfiInterestsRecoStyle[] values() {
        return (AfiInterestsRecoStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AfiInterestsRecoStyle(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
