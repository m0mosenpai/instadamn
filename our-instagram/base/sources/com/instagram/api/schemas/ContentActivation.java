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
public final class ContentActivation implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContentActivation[] A03;
    public static final ContentActivation A04;
    public static final ContentActivation A05;
    public static final ContentActivation A06;
    public static final ContentActivation A07;
    public static final ContentActivation A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ContentActivation contentActivation = new ContentActivation("UNRECOGNIZED", 0, "ContentActivation_unspecified");
        A06 = contentActivation;
        ContentActivation contentActivation2 = new ContentActivation("FASHION_MONTH", 1, "fashion_month");
        A05 = contentActivation2;
        ContentActivation contentActivation3 = new ContentActivation("COZY_SEASON", 2, "cozy_season");
        A04 = contentActivation3;
        ContentActivation contentActivation4 = new ContentActivation("VERTICALS_COMEDY", 3, "verticals_comedy");
        A08 = contentActivation4;
        ContentActivation contentActivation5 = new ContentActivation("VERTICALS_BASKETBALL", 4, "verticals_basketball");
        A07 = contentActivation5;
        ContentActivation[] contentActivationArr = {contentActivation, contentActivation2, contentActivation3, contentActivation4, contentActivation5, new ContentActivation("LIBRA_SZN", 5, "libra_szn")};
        A03 = contentActivationArr;
        A02 = AbstractC12190kN.A00(contentActivationArr);
        ContentActivation[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ContentActivation contentActivation6 : values) {
            A18.put(contentActivation6.A00, contentActivation6);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(30);
    }

    public static ContentActivation valueOf(String str) {
        return (ContentActivation) Enum.valueOf(ContentActivation.class, str);
    }

    public static ContentActivation[] values() {
        return (ContentActivation[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ContentActivation(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
