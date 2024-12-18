package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class LinkStickerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LinkStickerType[] A03;
    public static final LinkStickerType A04;
    public static final LinkStickerType A05;
    public static final LinkStickerType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LinkStickerType linkStickerType = new LinkStickerType("UNRECOGNIZED", 0, "LinkStickerType_unspecified");
        A04 = linkStickerType;
        LinkStickerType linkStickerType2 = new LinkStickerType("WEBSITE", 1, "WEBSITE");
        A05 = linkStickerType2;
        LinkStickerType linkStickerType3 = new LinkStickerType("WHATSAPP", 2, "WHATSAPP");
        A06 = linkStickerType3;
        LinkStickerType[] linkStickerTypeArr = {linkStickerType, linkStickerType2, linkStickerType3};
        A03 = linkStickerTypeArr;
        A02 = AbstractC12190kN.A00(linkStickerTypeArr);
        LinkStickerType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (LinkStickerType linkStickerType4 : values) {
            linkedHashMap.put(linkStickerType4.A00, linkStickerType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C41858IgC(69);
    }

    public static LinkStickerType valueOf(String str) {
        return (LinkStickerType) Enum.valueOf(LinkStickerType.class, str);
    }

    public static LinkStickerType[] values() {
        return (LinkStickerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LinkStickerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
