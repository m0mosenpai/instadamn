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
public final class MediaKitVisibility implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaKitVisibility[] A03;
    public static final MediaKitVisibility A04;
    public static final MediaKitVisibility A05;
    public static final MediaKitVisibility A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaKitVisibility mediaKitVisibility = new MediaKitVisibility("UNRECOGNIZED", 0, "MediaKitVisibility_unspecified");
        A06 = mediaKitVisibility;
        MediaKitVisibility mediaKitVisibility2 = new MediaKitVisibility("PRIVATE", 1, "PRIVATE");
        A04 = mediaKitVisibility2;
        MediaKitVisibility mediaKitVisibility3 = new MediaKitVisibility("PUBLIC", 2, "PUBLIC");
        A05 = mediaKitVisibility3;
        MediaKitVisibility[] mediaKitVisibilityArr = {mediaKitVisibility, mediaKitVisibility2, mediaKitVisibility3};
        A03 = mediaKitVisibilityArr;
        A02 = AbstractC12190kN.A00(mediaKitVisibilityArr);
        MediaKitVisibility[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaKitVisibility mediaKitVisibility4 : values) {
            A18.put(mediaKitVisibility4.A00, mediaKitVisibility4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(86);
    }

    public static MediaKitVisibility valueOf(String str) {
        return (MediaKitVisibility) Enum.valueOf(MediaKitVisibility.class, str);
    }

    public static MediaKitVisibility[] values() {
        return (MediaKitVisibility[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaKitVisibility(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
