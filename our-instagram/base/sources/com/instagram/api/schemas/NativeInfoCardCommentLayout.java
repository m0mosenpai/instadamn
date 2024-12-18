package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class NativeInfoCardCommentLayout implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NativeInfoCardCommentLayout[] A03;
    public static final NativeInfoCardCommentLayout A04;
    public static final NativeInfoCardCommentLayout A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        NativeInfoCardCommentLayout nativeInfoCardCommentLayout = new NativeInfoCardCommentLayout("UNRECOGNIZED", 0, "NativeInfoCardCommentLayout_unspecified");
        A04 = nativeInfoCardCommentLayout;
        NativeInfoCardCommentLayout nativeInfoCardCommentLayout2 = new NativeInfoCardCommentLayout("horizontal", 1, "horizontal");
        A05 = nativeInfoCardCommentLayout2;
        NativeInfoCardCommentLayout[] nativeInfoCardCommentLayoutArr = {nativeInfoCardCommentLayout, nativeInfoCardCommentLayout2, new NativeInfoCardCommentLayout("vertical", 2, "vertical")};
        A03 = nativeInfoCardCommentLayoutArr;
        A02 = AbstractC12190kN.A00(nativeInfoCardCommentLayoutArr);
        NativeInfoCardCommentLayout[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (NativeInfoCardCommentLayout nativeInfoCardCommentLayout3 : values) {
            linkedHashMap.put(nativeInfoCardCommentLayout3.A00, nativeInfoCardCommentLayout3);
        }
        A01 = linkedHashMap;
        CREATOR = new C41855Ig9(10);
    }

    public static NativeInfoCardCommentLayout valueOf(String str) {
        return (NativeInfoCardCommentLayout) Enum.valueOf(NativeInfoCardCommentLayout.class, str);
    }

    public static NativeInfoCardCommentLayout[] values() {
        return (NativeInfoCardCommentLayout[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NativeInfoCardCommentLayout(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
