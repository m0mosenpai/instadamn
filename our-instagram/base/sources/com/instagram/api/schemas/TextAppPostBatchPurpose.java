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
public final class TextAppPostBatchPurpose implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppPostBatchPurpose[] A03;
    public static final TextAppPostBatchPurpose A04;
    public static final TextAppPostBatchPurpose A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppPostBatchPurpose textAppPostBatchPurpose = new TextAppPostBatchPurpose("UNRECOGNIZED", 0, "TextAppPostBatchPurpose_unspecified");
        A05 = textAppPostBatchPurpose;
        TextAppPostBatchPurpose textAppPostBatchPurpose2 = new TextAppPostBatchPurpose("DYNAMIC_UFI", 1, "DYNAMIC_UFI");
        A04 = textAppPostBatchPurpose2;
        TextAppPostBatchPurpose[] textAppPostBatchPurposeArr = {textAppPostBatchPurpose, textAppPostBatchPurpose2, new TextAppPostBatchPurpose("PREFETCH_PERMALINK_TARGET", 2, "PREFETCH_PERMALINK_TARGET")};
        A03 = textAppPostBatchPurposeArr;
        A02 = AbstractC12190kN.A00(textAppPostBatchPurposeArr);
        TextAppPostBatchPurpose[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextAppPostBatchPurpose textAppPostBatchPurpose3 : values) {
            A18.put(textAppPostBatchPurpose3.A00, textAppPostBatchPurpose3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(49);
    }

    public static TextAppPostBatchPurpose valueOf(String str) {
        return (TextAppPostBatchPurpose) Enum.valueOf(TextAppPostBatchPurpose.class, str);
    }

    public static TextAppPostBatchPurpose[] values() {
        return (TextAppPostBatchPurpose[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextAppPostBatchPurpose(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
