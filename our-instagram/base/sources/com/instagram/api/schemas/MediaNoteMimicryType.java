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
/* loaded from: classes3.dex */
public final class MediaNoteMimicryType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaNoteMimicryType[] A03;
    public static final MediaNoteMimicryType A04;
    public static final MediaNoteMimicryType A05;
    public static final MediaNoteMimicryType A06;
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
        MediaNoteMimicryType mediaNoteMimicryType = new MediaNoteMimicryType("UNRECOGNIZED", 0, "MediaNoteMimicryType_unspecified");
        A06 = mediaNoteMimicryType;
        MediaNoteMimicryType mediaNoteMimicryType2 = new MediaNoteMimicryType("MIMICRY_BUBBLE", 1, "mimicry_bubble");
        A04 = mediaNoteMimicryType2;
        MediaNoteMimicryType mediaNoteMimicryType3 = new MediaNoteMimicryType("UFI_NUDGE", 2, "ufi_nudge");
        A05 = mediaNoteMimicryType3;
        MediaNoteMimicryType[] mediaNoteMimicryTypeArr = {mediaNoteMimicryType, mediaNoteMimicryType2, mediaNoteMimicryType3};
        A03 = mediaNoteMimicryTypeArr;
        A02 = AbstractC12190kN.A00(mediaNoteMimicryTypeArr);
        MediaNoteMimicryType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MediaNoteMimicryType mediaNoteMimicryType4 : values) {
            linkedHashMap.put(mediaNoteMimicryType4.A00, mediaNoteMimicryType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(43);
    }

    public static MediaNoteMimicryType valueOf(String str) {
        return (MediaNoteMimicryType) Enum.valueOf(MediaNoteMimicryType.class, str);
    }

    public static MediaNoteMimicryType[] values() {
        return (MediaNoteMimicryType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaNoteMimicryType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
