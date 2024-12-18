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
public final class CreatorViewerBottomCTAType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreatorViewerBottomCTAType[] A03;
    public static final CreatorViewerBottomCTAType A04;
    public static final CreatorViewerBottomCTAType A05;
    public static final CreatorViewerBottomCTAType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreatorViewerBottomCTAType creatorViewerBottomCTAType = new CreatorViewerBottomCTAType("UNRECOGNIZED", 0, "CreatorViewerBottomCTAType_unspecified");
        A06 = creatorViewerBottomCTAType;
        CreatorViewerBottomCTAType creatorViewerBottomCTAType2 = new CreatorViewerBottomCTAType("CREATE_CLIP", 1, "create_clip");
        A04 = creatorViewerBottomCTAType2;
        CreatorViewerBottomCTAType creatorViewerBottomCTAType3 = new CreatorViewerBottomCTAType("SAVE_CLIP", 2, "save_clip");
        A05 = creatorViewerBottomCTAType3;
        CreatorViewerBottomCTAType[] creatorViewerBottomCTATypeArr = {creatorViewerBottomCTAType, creatorViewerBottomCTAType2, creatorViewerBottomCTAType3};
        A03 = creatorViewerBottomCTATypeArr;
        A02 = AbstractC12190kN.A00(creatorViewerBottomCTATypeArr);
        CreatorViewerBottomCTAType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CreatorViewerBottomCTAType creatorViewerBottomCTAType4 : values) {
            A18.put(creatorViewerBottomCTAType4.A00, creatorViewerBottomCTAType4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(41);
    }

    public static CreatorViewerBottomCTAType valueOf(String str) {
        return (CreatorViewerBottomCTAType) Enum.valueOf(CreatorViewerBottomCTAType.class, str);
    }

    public static CreatorViewerBottomCTAType[] values() {
        return (CreatorViewerBottomCTAType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreatorViewerBottomCTAType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
