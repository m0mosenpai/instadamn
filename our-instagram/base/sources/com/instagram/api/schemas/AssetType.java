package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class AssetType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AssetType[] A03;
    public static final AssetType A04;
    public static final AssetType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AssetType assetType = new AssetType("UNRECOGNIZED", 0, "AssetType_unspecified");
        A05 = assetType;
        AssetType assetType2 = new AssetType("PHOTO", 1, "photo");
        A04 = assetType2;
        AssetType[] assetTypeArr = {assetType, assetType2, new AssetType("VIDEO", 2, MediaStreamTrack.VIDEO_TRACK_KIND)};
        A03 = assetTypeArr;
        A02 = AbstractC12190kN.A00(assetTypeArr);
        AssetType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AssetType assetType3 : values) {
            A18.put(assetType3.A00, assetType3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(53);
    }

    public static AssetType valueOf(String str) {
        return (AssetType) Enum.valueOf(AssetType.class, str);
    }

    public static AssetType[] values() {
        return (AssetType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AssetType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
