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
public final class ThumbnailInteractionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ThumbnailInteractionType[] A03;
    public static final ThumbnailInteractionType A04;
    public static final ThumbnailInteractionType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ThumbnailInteractionType thumbnailInteractionType = new ThumbnailInteractionType("UNRECOGNIZED", 0, "ThumbnailInteractionType_unspecified");
        A05 = thumbnailInteractionType;
        ThumbnailInteractionType thumbnailInteractionType2 = new ThumbnailInteractionType("LIKES", 1, "likes");
        A04 = thumbnailInteractionType2;
        ThumbnailInteractionType[] thumbnailInteractionTypeArr = {thumbnailInteractionType, thumbnailInteractionType2, new ThumbnailInteractionType("RESHARES", 2, "reshares")};
        A03 = thumbnailInteractionTypeArr;
        A02 = AbstractC12190kN.A00(thumbnailInteractionTypeArr);
        ThumbnailInteractionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ThumbnailInteractionType thumbnailInteractionType3 : values) {
            A18.put(thumbnailInteractionType3.A00, thumbnailInteractionType3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(69);
    }

    public static ThumbnailInteractionType valueOf(String str) {
        return (ThumbnailInteractionType) Enum.valueOf(ThumbnailInteractionType.class, str);
    }

    public static ThumbnailInteractionType[] values() {
        return (ThumbnailInteractionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ThumbnailInteractionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
