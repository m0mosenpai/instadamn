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
/* loaded from: classes7.dex */
public final class MediaDestinationEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaDestinationEnum[] A03;
    public static final MediaDestinationEnum A04;
    public static final MediaDestinationEnum A05;
    public static final MediaDestinationEnum A06;
    public static final MediaDestinationEnum A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaDestinationEnum mediaDestinationEnum = new MediaDestinationEnum("UNRECOGNIZED", 0, "MediaDestinationEnum_unspecified");
        A07 = mediaDestinationEnum;
        MediaDestinationEnum mediaDestinationEnum2 = new MediaDestinationEnum("CAMERA", 1, "camera");
        A04 = mediaDestinationEnum2;
        MediaDestinationEnum mediaDestinationEnum3 = new MediaDestinationEnum("DRAFT", 2, "draft");
        A05 = mediaDestinationEnum3;
        MediaDestinationEnum mediaDestinationEnum4 = new MediaDestinationEnum("GALLERY", 3, "gallery");
        A06 = mediaDestinationEnum4;
        MediaDestinationEnum[] mediaDestinationEnumArr = {mediaDestinationEnum, mediaDestinationEnum2, mediaDestinationEnum3, mediaDestinationEnum4};
        A03 = mediaDestinationEnumArr;
        A02 = AbstractC12190kN.A00(mediaDestinationEnumArr);
        MediaDestinationEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaDestinationEnum mediaDestinationEnum5 : values) {
            A18.put(mediaDestinationEnum5.A00, mediaDestinationEnum5);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(82);
    }

    public static MediaDestinationEnum valueOf(String str) {
        return (MediaDestinationEnum) Enum.valueOf(MediaDestinationEnum.class, str);
    }

    public static MediaDestinationEnum[] values() {
        return (MediaDestinationEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaDestinationEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
