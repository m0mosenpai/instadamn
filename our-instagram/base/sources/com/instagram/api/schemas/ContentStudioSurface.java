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
public final class ContentStudioSurface implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContentStudioSurface[] A03;
    public static final ContentStudioSurface A04;
    public static final ContentStudioSurface A05;
    public static final ContentStudioSurface A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ContentStudioSurface contentStudioSurface = new ContentStudioSurface("UNRECOGNIZED", 0, "ContentStudioSurface_unspecified");
        A06 = contentStudioSurface;
        ContentStudioSurface contentStudioSurface2 = new ContentStudioSurface("CREATOR_ACTIVATION_BOTTOM_SHEET", 1, "creator_activation_bottom_sheet");
        A04 = contentStudioSurface2;
        ContentStudioSurface contentStudioSurface3 = new ContentStudioSurface("CREATOR_ACTIVATION_FULL_SHEET", 2, "creator_activation_full_sheet");
        A05 = contentStudioSurface3;
        ContentStudioSurface[] contentStudioSurfaceArr = {contentStudioSurface, contentStudioSurface2, contentStudioSurface3};
        A03 = contentStudioSurfaceArr;
        A02 = AbstractC12190kN.A00(contentStudioSurfaceArr);
        ContentStudioSurface[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ContentStudioSurface contentStudioSurface4 : values) {
            A18.put(contentStudioSurface4.A00, contentStudioSurface4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(35);
    }

    public static ContentStudioSurface valueOf(String str) {
        return (ContentStudioSurface) Enum.valueOf(ContentStudioSurface.class, str);
    }

    public static ContentStudioSurface[] values() {
        return (ContentStudioSurface[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ContentStudioSurface(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
