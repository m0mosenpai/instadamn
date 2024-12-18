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
/* loaded from: classes5.dex */
public final class TextAppMessagingPrototypeEligibility implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppMessagingPrototypeEligibility[] A03;
    public static final TextAppMessagingPrototypeEligibility A04;
    public static final TextAppMessagingPrototypeEligibility A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppMessagingPrototypeEligibility textAppMessagingPrototypeEligibility = new TextAppMessagingPrototypeEligibility("UNRECOGNIZED", 0, "TextAppMessagingPrototypeEligibility_unspecified");
        A05 = textAppMessagingPrototypeEligibility;
        TextAppMessagingPrototypeEligibility textAppMessagingPrototypeEligibility2 = new TextAppMessagingPrototypeEligibility("ELIGIBLE", 1, "eligible");
        A04 = textAppMessagingPrototypeEligibility2;
        TextAppMessagingPrototypeEligibility[] textAppMessagingPrototypeEligibilityArr = {textAppMessagingPrototypeEligibility, textAppMessagingPrototypeEligibility2, new TextAppMessagingPrototypeEligibility("INELIGIBLE", 2, "ineligible")};
        A03 = textAppMessagingPrototypeEligibilityArr;
        A02 = AbstractC12190kN.A00(textAppMessagingPrototypeEligibilityArr);
        TextAppMessagingPrototypeEligibility[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextAppMessagingPrototypeEligibility textAppMessagingPrototypeEligibility3 : values) {
            A18.put(textAppMessagingPrototypeEligibility3.A00, textAppMessagingPrototypeEligibility3);
        }
        A01 = A18;
        CREATOR = new C41857IgB(47);
    }

    public static TextAppMessagingPrototypeEligibility valueOf(String str) {
        return (TextAppMessagingPrototypeEligibility) Enum.valueOf(TextAppMessagingPrototypeEligibility.class, str);
    }

    public static TextAppMessagingPrototypeEligibility[] values() {
        return (TextAppMessagingPrototypeEligibility[]) A03.clone();
    }

    public TextAppMessagingPrototypeEligibility(String str, int i, String str2) {
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
