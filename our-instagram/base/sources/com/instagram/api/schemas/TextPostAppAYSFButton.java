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
public final class TextPostAppAYSFButton implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextPostAppAYSFButton[] A03;
    public static final TextPostAppAYSFButton A04;
    public static final TextPostAppAYSFButton A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextPostAppAYSFButton textPostAppAYSFButton = new TextPostAppAYSFButton("UNRECOGNIZED", 0, "TextPostAppAYSFButton_unspecified");
        A05 = textPostAppAYSFButton;
        TextPostAppAYSFButton textPostAppAYSFButton2 = new TextPostAppAYSFButton("FOLLOW_ALL", 1, "follow_all");
        A04 = textPostAppAYSFButton2;
        TextPostAppAYSFButton[] textPostAppAYSFButtonArr = {textPostAppAYSFButton, textPostAppAYSFButton2, new TextPostAppAYSFButton("SEE_ALL", 2, "see_all")};
        A03 = textPostAppAYSFButtonArr;
        A02 = AbstractC12190kN.A00(textPostAppAYSFButtonArr);
        TextPostAppAYSFButton[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextPostAppAYSFButton textPostAppAYSFButton3 : values) {
            A18.put(textPostAppAYSFButton3.A00, textPostAppAYSFButton3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(56);
    }

    public static TextPostAppAYSFButton valueOf(String str) {
        return (TextPostAppAYSFButton) Enum.valueOf(TextPostAppAYSFButton.class, str);
    }

    public static TextPostAppAYSFButton[] values() {
        return (TextPostAppAYSFButton[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextPostAppAYSFButton(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
