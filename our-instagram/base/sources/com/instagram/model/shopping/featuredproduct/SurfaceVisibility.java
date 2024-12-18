package com.instagram.model.shopping.featuredproduct;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SurfaceVisibility implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SurfaceVisibility[] A03;
    public static final SurfaceVisibility A04;
    public static final SurfaceVisibility A05;
    public static final SurfaceVisibility A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SurfaceVisibility surfaceVisibility = new SurfaceVisibility("UNRECOGNIZED", 0, "SurfaceVisibility_unspecified");
        A06 = surfaceVisibility;
        SurfaceVisibility surfaceVisibility2 = new SurfaceVisibility("IG_ONLY", 1, "IG_ONLY");
        A04 = surfaceVisibility2;
        SurfaceVisibility surfaceVisibility3 = new SurfaceVisibility("INTEROP", 2, "INTEROP");
        A05 = surfaceVisibility3;
        SurfaceVisibility[] surfaceVisibilityArr = {surfaceVisibility, surfaceVisibility2, surfaceVisibility3, new SurfaceVisibility("VISIBILITY_UNSET", 3, "VISIBILITY_UNSET")};
        A03 = surfaceVisibilityArr;
        A02 = AbstractC12190kN.A00(surfaceVisibilityArr);
        SurfaceVisibility[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (SurfaceVisibility surfaceVisibility4 : values) {
            A18.put(surfaceVisibility4.A00, surfaceVisibility4);
        }
        A01 = A18;
        CREATOR = C41856IgA.A00(26);
    }

    public static SurfaceVisibility valueOf(String str) {
        return (SurfaceVisibility) Enum.valueOf(SurfaceVisibility.class, str);
    }

    public static SurfaceVisibility[] values() {
        return (SurfaceVisibility[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SurfaceVisibility(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
