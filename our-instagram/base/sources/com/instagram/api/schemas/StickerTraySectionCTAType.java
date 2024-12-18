package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class StickerTraySectionCTAType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StickerTraySectionCTAType[] A03;
    public static final StickerTraySectionCTAType A04;
    public static final StickerTraySectionCTAType A05;
    public static final StickerTraySectionCTAType A06;
    public static final StickerTraySectionCTAType A07;
    public static final StickerTraySectionCTAType A08;
    public static final StickerTraySectionCTAType A09;
    public static final StickerTraySectionCTAType A0A;
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
        StickerTraySectionCTAType stickerTraySectionCTAType = new StickerTraySectionCTAType("UNRECOGNIZED", 0, "StickerTraySectionCTAType_unspecified");
        A0A = stickerTraySectionCTAType;
        StickerTraySectionCTAType stickerTraySectionCTAType2 = new StickerTraySectionCTAType("CUTOUT_STICKERS", 1, "cutout_stickers");
        A04 = stickerTraySectionCTAType2;
        StickerTraySectionCTAType stickerTraySectionCTAType3 = new StickerTraySectionCTAType("EDIT", 2, "edit");
        A05 = stickerTraySectionCTAType3;
        StickerTraySectionCTAType stickerTraySectionCTAType4 = new StickerTraySectionCTAType("GIPHY", 3, "giphy");
        A06 = stickerTraySectionCTAType4;
        StickerTraySectionCTAType stickerTraySectionCTAType5 = new StickerTraySectionCTAType("MUSIC", 4, "music");
        A07 = stickerTraySectionCTAType5;
        StickerTraySectionCTAType stickerTraySectionCTAType6 = new StickerTraySectionCTAType("MUSIC_BROWSE", 5, "music_browse");
        A08 = stickerTraySectionCTAType6;
        StickerTraySectionCTAType stickerTraySectionCTAType7 = new StickerTraySectionCTAType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 6, NetInfoModule.CONNECTION_TYPE_NONE);
        A09 = stickerTraySectionCTAType7;
        StickerTraySectionCTAType[] stickerTraySectionCTATypeArr = {stickerTraySectionCTAType, stickerTraySectionCTAType2, stickerTraySectionCTAType3, stickerTraySectionCTAType4, stickerTraySectionCTAType5, stickerTraySectionCTAType6, stickerTraySectionCTAType7};
        A03 = stickerTraySectionCTATypeArr;
        A02 = AbstractC12190kN.A00(stickerTraySectionCTATypeArr);
        StickerTraySectionCTAType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (StickerTraySectionCTAType stickerTraySectionCTAType8 : values) {
            linkedHashMap.put(stickerTraySectionCTAType8.A00, stickerTraySectionCTAType8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(11);
    }

    public static StickerTraySectionCTAType valueOf(String str) {
        return (StickerTraySectionCTAType) Enum.valueOf(StickerTraySectionCTAType.class, str);
    }

    public static StickerTraySectionCTAType[] values() {
        return (StickerTraySectionCTAType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StickerTraySectionCTAType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
