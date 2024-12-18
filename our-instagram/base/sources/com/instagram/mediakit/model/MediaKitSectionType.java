package com.instagram.mediakit.model;

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
public final class MediaKitSectionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaKitSectionType[] A03;
    public static final MediaKitSectionType A04;
    public static final MediaKitSectionType A05;
    public static final MediaKitSectionType A06;
    public static final MediaKitSectionType A07;
    public static final MediaKitSectionType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaKitSectionType mediaKitSectionType = new MediaKitSectionType("UNRECOGNIZED", 0, "MediaKitSectionType_unspecified");
        A08 = mediaKitSectionType;
        MediaKitSectionType mediaKitSectionType2 = new MediaKitSectionType("ACCOUNTS", 1, "ACCOUNTS");
        A04 = mediaKitSectionType2;
        MediaKitSectionType mediaKitSectionType3 = new MediaKitSectionType("INSIGHTS", 2, "INSIGHTS");
        A05 = mediaKitSectionType3;
        MediaKitSectionType mediaKitSectionType4 = new MediaKitSectionType("MEDIA_POSTS", 3, "MEDIA_POSTS");
        A06 = mediaKitSectionType4;
        MediaKitSectionType mediaKitSectionType5 = new MediaKitSectionType("TEXT", 4, "TEXT");
        A07 = mediaKitSectionType5;
        MediaKitSectionType[] mediaKitSectionTypeArr = {mediaKitSectionType, mediaKitSectionType2, mediaKitSectionType3, mediaKitSectionType4, mediaKitSectionType5};
        A03 = mediaKitSectionTypeArr;
        A02 = AbstractC12190kN.A00(mediaKitSectionTypeArr);
        MediaKitSectionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaKitSectionType mediaKitSectionType6 : values) {
            A18.put(mediaKitSectionType6.A00, mediaKitSectionType6);
        }
        A01 = A18;
        CREATOR = C55343Oh9.A00(47);
    }

    public static MediaKitSectionType valueOf(String str) {
        return (MediaKitSectionType) Enum.valueOf(MediaKitSectionType.class, str);
    }

    public static MediaKitSectionType[] values() {
        return (MediaKitSectionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaKitSectionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
