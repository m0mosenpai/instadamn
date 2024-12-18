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
public final class ClipsCameraSurface implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsCameraSurface[] A03;
    public static final ClipsCameraSurface A04;
    public static final ClipsCameraSurface A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsCameraSurface clipsCameraSurface = new ClipsCameraSurface("UNRECOGNIZED", 0, "ClipsCameraSurface_unspecified");
        A05 = clipsCameraSurface;
        ClipsCameraSurface clipsCameraSurface2 = new ClipsCameraSurface("CAMERA", 1, "camera");
        A04 = clipsCameraSurface2;
        ClipsCameraSurface[] clipsCameraSurfaceArr = {clipsCameraSurface, clipsCameraSurface2, new ClipsCameraSurface("GALLERY", 2, "gallery")};
        A03 = clipsCameraSurfaceArr;
        A02 = AbstractC12190kN.A00(clipsCameraSurfaceArr);
        ClipsCameraSurface[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsCameraSurface clipsCameraSurface3 : values) {
            A18.put(clipsCameraSurface3.A00, clipsCameraSurface3);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(5);
    }

    public static ClipsCameraSurface valueOf(String str) {
        return (ClipsCameraSurface) Enum.valueOf(ClipsCameraSurface.class, str);
    }

    public static ClipsCameraSurface[] values() {
        return (ClipsCameraSurface[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsCameraSurface(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
