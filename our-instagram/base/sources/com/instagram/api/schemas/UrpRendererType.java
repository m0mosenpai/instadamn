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
public final class UrpRendererType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UrpRendererType[] A03;
    public static final UrpRendererType A04;
    public static final UrpRendererType A05;
    public static final UrpRendererType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        UrpRendererType urpRendererType = new UrpRendererType("UNRECOGNIZED", 0, "UrpRendererType_unspecified");
        A06 = urpRendererType;
        UrpRendererType urpRendererType2 = new UrpRendererType("BLOKS", 1, "BLOKS");
        A04 = urpRendererType2;
        UrpRendererType urpRendererType3 = new UrpRendererType("CONTENT", 2, "CONTENT");
        A05 = urpRendererType3;
        UrpRendererType[] urpRendererTypeArr = {urpRendererType, urpRendererType2, urpRendererType3, new UrpRendererType("KEYFRAMES", 3, "KEYFRAMES")};
        A03 = urpRendererTypeArr;
        A02 = AbstractC12190kN.A00(urpRendererTypeArr);
        UrpRendererType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UrpRendererType urpRendererType4 : values) {
            A18.put(urpRendererType4.A00, urpRendererType4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(78);
    }

    public static UrpRendererType valueOf(String str) {
        return (UrpRendererType) Enum.valueOf(UrpRendererType.class, str);
    }

    public static UrpRendererType[] values() {
        return (UrpRendererType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UrpRendererType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
