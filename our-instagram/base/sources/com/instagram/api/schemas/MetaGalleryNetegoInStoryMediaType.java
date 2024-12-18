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
public final class MetaGalleryNetegoInStoryMediaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MetaGalleryNetegoInStoryMediaType[] A03;
    public static final MetaGalleryNetegoInStoryMediaType A04;
    public static final MetaGalleryNetegoInStoryMediaType A05;
    public static final MetaGalleryNetegoInStoryMediaType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType = new MetaGalleryNetegoInStoryMediaType("UNRECOGNIZED", 0, "MetaGalleryNetegoInStoryMediaType_unspecified");
        A05 = metaGalleryNetegoInStoryMediaType;
        MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType2 = new MetaGalleryNetegoInStoryMediaType("IMAGE", 1, "IMAGE");
        A04 = metaGalleryNetegoInStoryMediaType2;
        MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType3 = new MetaGalleryNetegoInStoryMediaType("VIDEO", 2, "VIDEO");
        A06 = metaGalleryNetegoInStoryMediaType3;
        MetaGalleryNetegoInStoryMediaType[] metaGalleryNetegoInStoryMediaTypeArr = {metaGalleryNetegoInStoryMediaType, metaGalleryNetegoInStoryMediaType2, metaGalleryNetegoInStoryMediaType3};
        A03 = metaGalleryNetegoInStoryMediaTypeArr;
        A02 = AbstractC12190kN.A00(metaGalleryNetegoInStoryMediaTypeArr);
        MetaGalleryNetegoInStoryMediaType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType4 : values) {
            A18.put(metaGalleryNetegoInStoryMediaType4.A00, metaGalleryNetegoInStoryMediaType4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(93);
    }

    public static MetaGalleryNetegoInStoryMediaType valueOf(String str) {
        return (MetaGalleryNetegoInStoryMediaType) Enum.valueOf(MetaGalleryNetegoInStoryMediaType.class, str);
    }

    public static MetaGalleryNetegoInStoryMediaType[] values() {
        return (MetaGalleryNetegoInStoryMediaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MetaGalleryNetegoInStoryMediaType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
