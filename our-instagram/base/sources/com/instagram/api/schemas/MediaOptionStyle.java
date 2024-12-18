package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MediaOptionStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaOptionStyle[] A03;
    public static final MediaOptionStyle A04;
    public static final MediaOptionStyle A05;
    public static final MediaOptionStyle A06;
    public static final MediaOptionStyle A07;
    public static final MediaOptionStyle A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        MediaOptionStyle mediaOptionStyle = new MediaOptionStyle("UNRECOGNIZED", 0, "MediaOptionStyle_unspecified");
        A08 = mediaOptionStyle;
        MediaOptionStyle mediaOptionStyle2 = new MediaOptionStyle("ACTION", 1, "action");
        A04 = mediaOptionStyle2;
        MediaOptionStyle mediaOptionStyle3 = new MediaOptionStyle("DESTRUCTIVE", 2, "destructive");
        A05 = mediaOptionStyle3;
        MediaOptionStyle mediaOptionStyle4 = new MediaOptionStyle("NORMAL", 3, "normal");
        A06 = mediaOptionStyle4;
        MediaOptionStyle mediaOptionStyle5 = new MediaOptionStyle("NORMAL_LEFT_ALIGNED", 4, "normal_left_aligned");
        A07 = mediaOptionStyle5;
        MediaOptionStyle[] mediaOptionStyleArr = {mediaOptionStyle, mediaOptionStyle2, mediaOptionStyle3, mediaOptionStyle4, mediaOptionStyle5};
        A03 = mediaOptionStyleArr;
        A02 = AbstractC12190kN.A00(mediaOptionStyleArr);
        MediaOptionStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MediaOptionStyle mediaOptionStyle6 : values) {
            linkedHashMap.put(mediaOptionStyle6.A00, mediaOptionStyle6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(44);
    }

    public static MediaOptionStyle valueOf(String str) {
        return (MediaOptionStyle) Enum.valueOf(MediaOptionStyle.class, str);
    }

    public static MediaOptionStyle[] values() {
        return (MediaOptionStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaOptionStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
