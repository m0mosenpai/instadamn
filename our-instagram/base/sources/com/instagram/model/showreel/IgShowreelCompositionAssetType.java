package com.instagram.model.showreel;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IgShowreelCompositionAssetType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IgShowreelCompositionAssetType[] A03;
    public static final IgShowreelCompositionAssetType A04;
    public static final IgShowreelCompositionAssetType A05;
    public static final IgShowreelCompositionAssetType A06;
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
        IgShowreelCompositionAssetType igShowreelCompositionAssetType = new IgShowreelCompositionAssetType("UNRECOGNIZED", 0, "IgShowreelCompositionAssetType_unspecified");
        A05 = igShowreelCompositionAssetType;
        IgShowreelCompositionAssetType igShowreelCompositionAssetType2 = new IgShowreelCompositionAssetType("IMAGE", 1, "image");
        A04 = igShowreelCompositionAssetType2;
        IgShowreelCompositionAssetType igShowreelCompositionAssetType3 = new IgShowreelCompositionAssetType("VIDEO", 2, MediaStreamTrack.VIDEO_TRACK_KIND);
        A06 = igShowreelCompositionAssetType3;
        IgShowreelCompositionAssetType[] igShowreelCompositionAssetTypeArr = {igShowreelCompositionAssetType, igShowreelCompositionAssetType2, igShowreelCompositionAssetType3};
        A03 = igShowreelCompositionAssetTypeArr;
        A02 = AbstractC12190kN.A00(igShowreelCompositionAssetTypeArr);
        IgShowreelCompositionAssetType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IgShowreelCompositionAssetType igShowreelCompositionAssetType4 : values) {
            linkedHashMap.put(igShowreelCompositionAssetType4.A00, igShowreelCompositionAssetType4);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(38);
    }

    public static IgShowreelCompositionAssetType valueOf(String str) {
        return (IgShowreelCompositionAssetType) Enum.valueOf(IgShowreelCompositionAssetType.class, str);
    }

    public static IgShowreelCompositionAssetType[] values() {
        return (IgShowreelCompositionAssetType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IgShowreelCompositionAssetType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
