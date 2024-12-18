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
public final class MetaGalleryAlbumType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MetaGalleryAlbumType[] A03;
    public static final MetaGalleryAlbumType A04;
    public static final MetaGalleryAlbumType A05;
    public static final MetaGalleryAlbumType A06;
    public static final MetaGalleryAlbumType A07;
    public static final MetaGalleryAlbumType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MetaGalleryAlbumType metaGalleryAlbumType = new MetaGalleryAlbumType("UNRECOGNIZED", 0, "MetaGalleryAlbumType_unspecified");
        A08 = metaGalleryAlbumType;
        MetaGalleryAlbumType metaGalleryAlbumType2 = new MetaGalleryAlbumType("AR_WRIST", 1, "AR_WRIST");
        A04 = metaGalleryAlbumType2;
        MetaGalleryAlbumType metaGalleryAlbumType3 = new MetaGalleryAlbumType("HORIZON", 2, "HORIZON");
        A05 = metaGalleryAlbumType3;
        MetaGalleryAlbumType metaGalleryAlbumType4 = new MetaGalleryAlbumType("MWA_TOP_CAPTURES", 3, "MWA_TOP_CAPTURES");
        A06 = metaGalleryAlbumType4;
        MetaGalleryAlbumType metaGalleryAlbumType5 = new MetaGalleryAlbumType("OCULUS", 4, "OCULUS");
        A07 = metaGalleryAlbumType5;
        MetaGalleryAlbumType[] metaGalleryAlbumTypeArr = {metaGalleryAlbumType, metaGalleryAlbumType2, metaGalleryAlbumType3, metaGalleryAlbumType4, metaGalleryAlbumType5, new MetaGalleryAlbumType("STELLA", 5, "STELLA")};
        A03 = metaGalleryAlbumTypeArr;
        A02 = AbstractC12190kN.A00(metaGalleryAlbumTypeArr);
        MetaGalleryAlbumType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MetaGalleryAlbumType metaGalleryAlbumType6 : values) {
            A18.put(metaGalleryAlbumType6.A00, metaGalleryAlbumType6);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(92);
    }

    public static MetaGalleryAlbumType valueOf(String str) {
        return (MetaGalleryAlbumType) Enum.valueOf(MetaGalleryAlbumType.class, str);
    }

    public static MetaGalleryAlbumType[] values() {
        return (MetaGalleryAlbumType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MetaGalleryAlbumType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
