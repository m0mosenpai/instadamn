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
/* loaded from: classes5.dex */
public final class MidCardReelsChainCtaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MidCardReelsChainCtaType[] A03;
    public static final MidCardReelsChainCtaType A04;
    public static final MidCardReelsChainCtaType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MidCardReelsChainCtaType midCardReelsChainCtaType = new MidCardReelsChainCtaType("UNRECOGNIZED", 0, "MidCardReelsChainCtaType_unspecified");
        A05 = midCardReelsChainCtaType;
        MidCardReelsChainCtaType midCardReelsChainCtaType2 = new MidCardReelsChainCtaType("CAMERA_GALLERY", 1, "camera_gallery");
        A04 = midCardReelsChainCtaType2;
        MidCardReelsChainCtaType[] midCardReelsChainCtaTypeArr = {midCardReelsChainCtaType, midCardReelsChainCtaType2, new MidCardReelsChainCtaType("REELS_SAVE_CENTERED", 2, "reels_save_centered")};
        A03 = midCardReelsChainCtaTypeArr;
        A02 = AbstractC12190kN.A00(midCardReelsChainCtaTypeArr);
        MidCardReelsChainCtaType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MidCardReelsChainCtaType midCardReelsChainCtaType3 : values) {
            A18.put(midCardReelsChainCtaType3.A00, midCardReelsChainCtaType3);
        }
        A01 = A18;
        CREATOR = new C41858IgC(98);
    }

    public static MidCardReelsChainCtaType valueOf(String str) {
        return (MidCardReelsChainCtaType) Enum.valueOf(MidCardReelsChainCtaType.class, str);
    }

    public static MidCardReelsChainCtaType[] values() {
        return (MidCardReelsChainCtaType[]) A03.clone();
    }

    public MidCardReelsChainCtaType(String str, int i, String str2) {
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
