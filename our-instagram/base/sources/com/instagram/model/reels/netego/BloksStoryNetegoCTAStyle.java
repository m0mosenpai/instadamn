package com.instagram.model.reels.netego;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BloksStoryNetegoCTAStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BloksStoryNetegoCTAStyle[] A03;
    public static final BloksStoryNetegoCTAStyle A04;
    public static final BloksStoryNetegoCTAStyle A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle = new BloksStoryNetegoCTAStyle("UNRECOGNIZED", 0, "BloksStoryNetegoCTAStyle_unspecified");
        A05 = bloksStoryNetegoCTAStyle;
        BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle2 = new BloksStoryNetegoCTAStyle("ANIMATED", 1, "animated");
        A04 = bloksStoryNetegoCTAStyle2;
        BloksStoryNetegoCTAStyle[] bloksStoryNetegoCTAStyleArr = {bloksStoryNetegoCTAStyle, bloksStoryNetegoCTAStyle2, new BloksStoryNetegoCTAStyle("SHUFFLE", 2, "shuffle")};
        A03 = bloksStoryNetegoCTAStyleArr;
        A02 = AbstractC12190kN.A00(bloksStoryNetegoCTAStyleArr);
        BloksStoryNetegoCTAStyle[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle3 : values) {
            A18.put(bloksStoryNetegoCTAStyle3.A00, bloksStoryNetegoCTAStyle3);
        }
        A01 = A18;
        CREATOR = C55343Oh9.A00(95);
    }

    public static BloksStoryNetegoCTAStyle valueOf(String str) {
        return (BloksStoryNetegoCTAStyle) Enum.valueOf(BloksStoryNetegoCTAStyle.class, str);
    }

    public static BloksStoryNetegoCTAStyle[] values() {
        return (BloksStoryNetegoCTAStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BloksStoryNetegoCTAStyle(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
