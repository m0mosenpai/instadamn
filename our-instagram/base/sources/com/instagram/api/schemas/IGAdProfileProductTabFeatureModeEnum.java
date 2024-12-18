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
public final class IGAdProfileProductTabFeatureModeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAdProfileProductTabFeatureModeEnum[] A03;
    public static final IGAdProfileProductTabFeatureModeEnum A04;
    public static final IGAdProfileProductTabFeatureModeEnum A05;
    public static final IGAdProfileProductTabFeatureModeEnum A06;
    public static final IGAdProfileProductTabFeatureModeEnum A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum = new IGAdProfileProductTabFeatureModeEnum("UNRECOGNIZED", 0, "IGAdProfileProductTabFeatureModeEnum_unspecified");
        A07 = iGAdProfileProductTabFeatureModeEnum;
        IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum2 = new IGAdProfileProductTabFeatureModeEnum("HSCROLL_V1", 1, "HSCROLL_V1");
        A04 = iGAdProfileProductTabFeatureModeEnum2;
        IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum3 = new IGAdProfileProductTabFeatureModeEnum("HSCROLL_V2", 2, "HSCROLL_V2");
        A05 = iGAdProfileProductTabFeatureModeEnum3;
        IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum4 = new IGAdProfileProductTabFeatureModeEnum("PRODUCT_TAB_V1", 3, "PRODUCT_TAB_V1");
        A06 = iGAdProfileProductTabFeatureModeEnum4;
        IGAdProfileProductTabFeatureModeEnum[] iGAdProfileProductTabFeatureModeEnumArr = {iGAdProfileProductTabFeatureModeEnum, iGAdProfileProductTabFeatureModeEnum2, iGAdProfileProductTabFeatureModeEnum3, iGAdProfileProductTabFeatureModeEnum4, new IGAdProfileProductTabFeatureModeEnum("PRODUCT_TAB_V2", 4, "PRODUCT_TAB_V2")};
        A03 = iGAdProfileProductTabFeatureModeEnumArr;
        A02 = AbstractC12190kN.A00(iGAdProfileProductTabFeatureModeEnumArr);
        IGAdProfileProductTabFeatureModeEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGAdProfileProductTabFeatureModeEnum iGAdProfileProductTabFeatureModeEnum5 : values) {
            A18.put(iGAdProfileProductTabFeatureModeEnum5.A00, iGAdProfileProductTabFeatureModeEnum5);
        }
        A01 = A18;
        CREATOR = new C41858IgC(18);
    }

    public static IGAdProfileProductTabFeatureModeEnum valueOf(String str) {
        return (IGAdProfileProductTabFeatureModeEnum) Enum.valueOf(IGAdProfileProductTabFeatureModeEnum.class, str);
    }

    public static IGAdProfileProductTabFeatureModeEnum[] values() {
        return (IGAdProfileProductTabFeatureModeEnum[]) A03.clone();
    }

    public IGAdProfileProductTabFeatureModeEnum(String str, int i, String str2) {
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
