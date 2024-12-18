package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AdsAPIInstagramPosition implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdsAPIInstagramPosition[] A03;
    public static final AdsAPIInstagramPosition A04;
    public static final AdsAPIInstagramPosition A05;
    public static final AdsAPIInstagramPosition A06;
    public static final AdsAPIInstagramPosition A07;
    public static final AdsAPIInstagramPosition A08;
    public static final AdsAPIInstagramPosition A09;
    public static final AdsAPIInstagramPosition A0A;
    public static final AdsAPIInstagramPosition A0B;
    public static final AdsAPIInstagramPosition A0C;
    public static final AdsAPIInstagramPosition A0D;
    public static final AdsAPIInstagramPosition A0E;
    public static final AdsAPIInstagramPosition A0F;
    public static final AdsAPIInstagramPosition A0G;
    public static final AdsAPIInstagramPosition A0H;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdsAPIInstagramPosition adsAPIInstagramPosition = new AdsAPIInstagramPosition("UNRECOGNIZED", 0, "AdsAPIInstagramPosition_unspecified");
        A0H = adsAPIInstagramPosition;
        AdsAPIInstagramPosition adsAPIInstagramPosition2 = new AdsAPIInstagramPosition("EFFECT_TRAY", 1, "EFFECT_TRAY");
        A04 = adsAPIInstagramPosition2;
        AdsAPIInstagramPosition adsAPIInstagramPosition3 = new AdsAPIInstagramPosition("EXPLORE", 2, "EXPLORE");
        A05 = adsAPIInstagramPosition3;
        AdsAPIInstagramPosition adsAPIInstagramPosition4 = new AdsAPIInstagramPosition("EXPLORE_HOME", 3, "EXPLORE_HOME");
        A06 = adsAPIInstagramPosition4;
        AdsAPIInstagramPosition adsAPIInstagramPosition5 = new AdsAPIInstagramPosition("IGTV", 4, "IGTV");
        A07 = adsAPIInstagramPosition5;
        AdsAPIInstagramPosition adsAPIInstagramPosition6 = new AdsAPIInstagramPosition("IG_SEARCH", 5, "IG_SEARCH");
        A08 = adsAPIInstagramPosition6;
        AdsAPIInstagramPosition adsAPIInstagramPosition7 = new AdsAPIInstagramPosition("LEAD_GEN_MULTI_SUBMIT", 6, "LEAD_GEN_MULTI_SUBMIT");
        A09 = adsAPIInstagramPosition7;
        AdsAPIInstagramPosition adsAPIInstagramPosition8 = new AdsAPIInstagramPosition("PROFILE_FEED", 7, "PROFILE_FEED");
        A0A = adsAPIInstagramPosition8;
        AdsAPIInstagramPosition adsAPIInstagramPosition9 = new AdsAPIInstagramPosition("PROFILE_REELS", 8, "PROFILE_REELS");
        A0B = adsAPIInstagramPosition9;
        AdsAPIInstagramPosition adsAPIInstagramPosition10 = new AdsAPIInstagramPosition("REELS", 9, "REELS");
        A0C = adsAPIInstagramPosition10;
        AdsAPIInstagramPosition adsAPIInstagramPosition11 = new AdsAPIInstagramPosition("REELS_OVERLAY", 10, "REELS_OVERLAY");
        A0D = adsAPIInstagramPosition11;
        AdsAPIInstagramPosition adsAPIInstagramPosition12 = new AdsAPIInstagramPosition("SHOP", 11, "SHOP");
        A0E = adsAPIInstagramPosition12;
        AdsAPIInstagramPosition adsAPIInstagramPosition13 = new AdsAPIInstagramPosition("STORY", 12, "STORY");
        A0F = adsAPIInstagramPosition13;
        AdsAPIInstagramPosition adsAPIInstagramPosition14 = new AdsAPIInstagramPosition("STREAM", 13, "STREAM");
        A0G = adsAPIInstagramPosition14;
        AdsAPIInstagramPosition[] adsAPIInstagramPositionArr = {adsAPIInstagramPosition, adsAPIInstagramPosition2, adsAPIInstagramPosition3, adsAPIInstagramPosition4, adsAPIInstagramPosition5, adsAPIInstagramPosition6, adsAPIInstagramPosition7, adsAPIInstagramPosition8, adsAPIInstagramPosition9, adsAPIInstagramPosition10, adsAPIInstagramPosition11, adsAPIInstagramPosition12, adsAPIInstagramPosition13, adsAPIInstagramPosition14};
        A03 = adsAPIInstagramPositionArr;
        A02 = AbstractC12190kN.A00(adsAPIInstagramPositionArr);
        AdsAPIInstagramPosition[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (AdsAPIInstagramPosition adsAPIInstagramPosition15 : values) {
            linkedHashMap.put(adsAPIInstagramPosition15.A00, adsAPIInstagramPosition15);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(39);
    }

    public static AdsAPIInstagramPosition valueOf(String str) {
        return (AdsAPIInstagramPosition) Enum.valueOf(AdsAPIInstagramPosition.class, str);
    }

    public static AdsAPIInstagramPosition[] values() {
        return (AdsAPIInstagramPosition[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdsAPIInstagramPosition(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
