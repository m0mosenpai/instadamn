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
/* loaded from: classes7.dex */
public final class MediaKitInsightType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaKitInsightType[] A03;
    public static final MediaKitInsightType A04;
    public static final MediaKitInsightType A05;
    public static final MediaKitInsightType A06;
    public static final MediaKitInsightType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaKitInsightType mediaKitInsightType = new MediaKitInsightType("UNRECOGNIZED", 0, "MediaKitInsightType_unspecified");
        A07 = mediaKitInsightType;
        MediaKitInsightType mediaKitInsightType2 = new MediaKitInsightType("DATE_JOINED", 1, "DATE_JOINED");
        A04 = mediaKitInsightType2;
        MediaKitInsightType mediaKitInsightType3 = new MediaKitInsightType("POSTS_CREATED", 2, "POSTS_CREATED");
        A05 = mediaKitInsightType3;
        MediaKitInsightType mediaKitInsightType4 = new MediaKitInsightType("TOTAL_FOLLOWERS", 3, "TOTAL_FOLLOWERS");
        A06 = mediaKitInsightType4;
        MediaKitInsightType[] mediaKitInsightTypeArr = {mediaKitInsightType, mediaKitInsightType2, mediaKitInsightType3, mediaKitInsightType4};
        A03 = mediaKitInsightTypeArr;
        A02 = AbstractC12190kN.A00(mediaKitInsightTypeArr);
        MediaKitInsightType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaKitInsightType mediaKitInsightType5 : values) {
            A18.put(mediaKitInsightType5.A00, mediaKitInsightType5);
        }
        A01 = A18;
        CREATOR = new C55343Oh9(46);
    }

    public static MediaKitInsightType valueOf(String str) {
        return (MediaKitInsightType) Enum.valueOf(MediaKitInsightType.class, str);
    }

    public static MediaKitInsightType[] values() {
        return (MediaKitInsightType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaKitInsightType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
