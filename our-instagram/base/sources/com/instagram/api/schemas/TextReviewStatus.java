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
public final class TextReviewStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextReviewStatus[] A03;
    public static final TextReviewStatus A04;
    public static final TextReviewStatus A05;
    public static final TextReviewStatus A06;
    public static final TextReviewStatus A07;
    public static final TextReviewStatus A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextReviewStatus textReviewStatus = new TextReviewStatus("UNRECOGNIZED", 0, "TextReviewStatus_unspecified");
        A08 = textReviewStatus;
        TextReviewStatus textReviewStatus2 = new TextReviewStatus("APPROVED", 1, "approved");
        A04 = textReviewStatus2;
        TextReviewStatus textReviewStatus3 = new TextReviewStatus("OUTDATED", 2, "outdated");
        A05 = textReviewStatus3;
        TextReviewStatus textReviewStatus4 = new TextReviewStatus("PENDING", 3, "pending");
        A06 = textReviewStatus4;
        TextReviewStatus textReviewStatus5 = new TextReviewStatus("REJECTED", 4, "rejected");
        A07 = textReviewStatus5;
        TextReviewStatus[] textReviewStatusArr = {textReviewStatus, textReviewStatus2, textReviewStatus3, textReviewStatus4, textReviewStatus5};
        A03 = textReviewStatusArr;
        A02 = AbstractC12190kN.A00(textReviewStatusArr);
        TextReviewStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextReviewStatus textReviewStatus6 : values) {
            A18.put(textReviewStatus6.A00, textReviewStatus6);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(62);
    }

    public static TextReviewStatus valueOf(String str) {
        return (TextReviewStatus) Enum.valueOf(TextReviewStatus.class, str);
    }

    public static TextReviewStatus[] values() {
        return (TextReviewStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextReviewStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
