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
public final class MediaControlEventSourceEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaControlEventSourceEnum[] A03;
    public static final MediaControlEventSourceEnum A04;
    public static final MediaControlEventSourceEnum A05;
    public static final MediaControlEventSourceEnum A06;
    public static final MediaControlEventSourceEnum A07;
    public static final MediaControlEventSourceEnum A08;
    public static final MediaControlEventSourceEnum A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaControlEventSourceEnum mediaControlEventSourceEnum = new MediaControlEventSourceEnum("UNRECOGNIZED", 0, "MediaControlEventSourceEnum_unspecified");
        A09 = mediaControlEventSourceEnum;
        MediaControlEventSourceEnum mediaControlEventSourceEnum2 = new MediaControlEventSourceEnum("ON_IMPRESSION", 1, "on_impression");
        A05 = mediaControlEventSourceEnum2;
        MediaControlEventSourceEnum mediaControlEventSourceEnum3 = new MediaControlEventSourceEnum("THREE_DOT_MENU", 2, "three_dot_menu");
        A07 = mediaControlEventSourceEnum3;
        MediaControlEventSourceEnum mediaControlEventSourceEnum4 = new MediaControlEventSourceEnum("CENTRAL_PLACE_TO_MANAGE", 3, "central_place_to_manage");
        A04 = mediaControlEventSourceEnum4;
        MediaControlEventSourceEnum mediaControlEventSourceEnum5 = new MediaControlEventSourceEnum("SEE_LESS_TAP", 4, "see_less_tap");
        A06 = mediaControlEventSourceEnum5;
        MediaControlEventSourceEnum mediaControlEventSourceEnum6 = new MediaControlEventSourceEnum("UFI", 5, "ufi");
        A08 = mediaControlEventSourceEnum6;
        MediaControlEventSourceEnum[] mediaControlEventSourceEnumArr = {mediaControlEventSourceEnum, mediaControlEventSourceEnum2, mediaControlEventSourceEnum3, mediaControlEventSourceEnum4, mediaControlEventSourceEnum5, mediaControlEventSourceEnum6};
        A03 = mediaControlEventSourceEnumArr;
        A02 = AbstractC12190kN.A00(mediaControlEventSourceEnumArr);
        MediaControlEventSourceEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaControlEventSourceEnum mediaControlEventSourceEnum7 : values) {
            A18.put(mediaControlEventSourceEnum7.A00, mediaControlEventSourceEnum7);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(80);
    }

    public static MediaControlEventSourceEnum valueOf(String str) {
        return (MediaControlEventSourceEnum) Enum.valueOf(MediaControlEventSourceEnum.class, str);
    }

    public static MediaControlEventSourceEnum[] values() {
        return (MediaControlEventSourceEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaControlEventSourceEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
