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
/* loaded from: classes9.dex */
public final class ClipsTemplateBrowserV2Type implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTemplateBrowserV2Type[] A03;
    public static final ClipsTemplateBrowserV2Type A04;
    public static final ClipsTemplateBrowserV2Type A05;
    public static final ClipsTemplateBrowserV2Type A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type = new ClipsTemplateBrowserV2Type("UNRECOGNIZED", 0, "ClipsTemplateBrowserV2Type_unspecified");
        A06 = clipsTemplateBrowserV2Type;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type2 = new ClipsTemplateBrowserV2Type("MAIN", 1, "main");
        A04 = clipsTemplateBrowserV2Type2;
        ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type3 = new ClipsTemplateBrowserV2Type("SAVED", 2, "saved");
        A05 = clipsTemplateBrowserV2Type3;
        ClipsTemplateBrowserV2Type[] clipsTemplateBrowserV2TypeArr = {clipsTemplateBrowserV2Type, clipsTemplateBrowserV2Type2, clipsTemplateBrowserV2Type3};
        A03 = clipsTemplateBrowserV2TypeArr;
        A02 = AbstractC12190kN.A00(clipsTemplateBrowserV2TypeArr);
        ClipsTemplateBrowserV2Type[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ClipsTemplateBrowserV2Type clipsTemplateBrowserV2Type4 : values) {
            A18.put(clipsTemplateBrowserV2Type4.A00, clipsTemplateBrowserV2Type4);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(15);
    }

    public static ClipsTemplateBrowserV2Type valueOf(String str) {
        return (ClipsTemplateBrowserV2Type) Enum.valueOf(ClipsTemplateBrowserV2Type.class, str);
    }

    public static ClipsTemplateBrowserV2Type[] values() {
        return (ClipsTemplateBrowserV2Type[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTemplateBrowserV2Type(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
