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
public final class FBTagType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FBTagType[] A03;
    public static final FBTagType A04;
    public static final FBTagType A05;
    public static final FBTagType A06;
    public static final FBTagType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FBTagType fBTagType = new FBTagType("UNRECOGNIZED", 0, "FBTagType_unspecified");
        A06 = fBTagType;
        FBTagType fBTagType2 = new FBTagType("HIDDEN_PHOTO_TAG", 1, "hidden_photo_tag");
        A04 = fBTagType2;
        FBTagType fBTagType3 = new FBTagType("PHOTO_TAG", 2, "photo_tag");
        A05 = fBTagType3;
        FBTagType fBTagType4 = new FBTagType("WITH_TAG", 3, "with_tag");
        A07 = fBTagType4;
        FBTagType[] fBTagTypeArr = {fBTagType, fBTagType2, fBTagType3, fBTagType4};
        A03 = fBTagTypeArr;
        A02 = AbstractC12190kN.A00(fBTagTypeArr);
        FBTagType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FBTagType fBTagType5 : values) {
            A18.put(fBTagType5.A00, fBTagType5);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(78);
    }

    public static FBTagType valueOf(String str) {
        return (FBTagType) Enum.valueOf(FBTagType.class, str);
    }

    public static FBTagType[] values() {
        return (FBTagType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FBTagType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
