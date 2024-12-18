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
public final class MediaControlSurfaceEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaControlSurfaceEnum[] A03;
    public static final MediaControlSurfaceEnum A04;
    public static final MediaControlSurfaceEnum A05;
    public static final MediaControlSurfaceEnum A06;
    public static final MediaControlSurfaceEnum A07;
    public static final MediaControlSurfaceEnum A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaControlSurfaceEnum mediaControlSurfaceEnum = new MediaControlSurfaceEnum("UNRECOGNIZED", 0, "MediaControlSurfaceEnum_unspecified");
        A08 = mediaControlSurfaceEnum;
        MediaControlSurfaceEnum mediaControlSurfaceEnum2 = new MediaControlSurfaceEnum("CONNECTED_FEED", 1, "connected_feed");
        A04 = mediaControlSurfaceEnum2;
        MediaControlSurfaceEnum mediaControlSurfaceEnum3 = new MediaControlSurfaceEnum("UNCONNECTED_FEED", 2, "unconnected_feed");
        A07 = mediaControlSurfaceEnum3;
        MediaControlSurfaceEnum mediaControlSurfaceEnum4 = new MediaControlSurfaceEnum("EXPLORE", 3, "explore");
        A05 = mediaControlSurfaceEnum4;
        MediaControlSurfaceEnum mediaControlSurfaceEnum5 = new MediaControlSurfaceEnum("REELS", 4, "reels");
        A06 = mediaControlSurfaceEnum5;
        MediaControlSurfaceEnum[] mediaControlSurfaceEnumArr = {mediaControlSurfaceEnum, mediaControlSurfaceEnum2, mediaControlSurfaceEnum3, mediaControlSurfaceEnum4, mediaControlSurfaceEnum5};
        A03 = mediaControlSurfaceEnumArr;
        A02 = AbstractC12190kN.A00(mediaControlSurfaceEnumArr);
        MediaControlSurfaceEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaControlSurfaceEnum mediaControlSurfaceEnum6 : values) {
            A18.put(mediaControlSurfaceEnum6.A00, mediaControlSurfaceEnum6);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(81);
    }

    public static MediaControlSurfaceEnum valueOf(String str) {
        return (MediaControlSurfaceEnum) Enum.valueOf(MediaControlSurfaceEnum.class, str);
    }

    public static MediaControlSurfaceEnum[] values() {
        return (MediaControlSurfaceEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaControlSurfaceEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
