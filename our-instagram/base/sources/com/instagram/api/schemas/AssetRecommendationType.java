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
/* loaded from: classes7.dex */
public final class AssetRecommendationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AssetRecommendationType[] A03;
    public static final AssetRecommendationType A04;
    public static final AssetRecommendationType A05;
    public static final AssetRecommendationType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AssetRecommendationType assetRecommendationType = new AssetRecommendationType("UNRECOGNIZED", 0, "AssetRecommendationType_unspecified");
        A06 = assetRecommendationType;
        AssetRecommendationType assetRecommendationType2 = new AssetRecommendationType("AUDIO", 1, MediaStreamTrack.AUDIO_TRACK_KIND);
        A04 = assetRecommendationType2;
        AssetRecommendationType assetRecommendationType3 = new AssetRecommendationType("EFFECT", 2, "effect");
        A05 = assetRecommendationType3;
        AssetRecommendationType[] assetRecommendationTypeArr = {assetRecommendationType, assetRecommendationType2, assetRecommendationType3};
        A03 = assetRecommendationTypeArr;
        A02 = AbstractC12190kN.A00(assetRecommendationTypeArr);
        AssetRecommendationType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AssetRecommendationType assetRecommendationType4 : values) {
            A18.put(assetRecommendationType4.A00, assetRecommendationType4);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(52);
    }

    public static AssetRecommendationType valueOf(String str) {
        return (AssetRecommendationType) Enum.valueOf(AssetRecommendationType.class, str);
    }

    public static AssetRecommendationType[] values() {
        return (AssetRecommendationType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AssetRecommendationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
