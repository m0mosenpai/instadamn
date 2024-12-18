package com.instagram.discovery.mediamap.intf;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class MapEntryPoint implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ MapEntryPoint[] A02;
    public static final MapEntryPoint A03;
    public static final MapEntryPoint A04;
    public static final MapEntryPoint A05;
    public static final MapEntryPoint A06;
    public static final MapEntryPoint A07;
    public static final MapEntryPoint A08;
    public static final MapEntryPoint A09;
    public static final MapEntryPoint A0A;
    public static final MapEntryPoint A0B;
    public static final MapEntryPoint A0C;
    public static final MapEntryPoint A0D;
    public static final MapEntryPoint A0E;
    public static final MapEntryPoint A0F;
    public static final MapEntryPoint A0G;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MapEntryPoint mapEntryPoint = new MapEntryPoint("EXTERNAL_URL", 0, "external_url");
        A06 = mapEntryPoint;
        MapEntryPoint mapEntryPoint2 = new MapEntryPoint("MAIN_FEED_QP", 1, "main_feed_qp");
        A0D = mapEntryPoint2;
        MapEntryPoint mapEntryPoint3 = new MapEntryPoint("EXPLORE_BUTTON", 2, "explore_button");
        A03 = mapEntryPoint3;
        MapEntryPoint mapEntryPoint4 = new MapEntryPoint("EXPLORE_PILL", 3, "explore_pill");
        A04 = mapEntryPoint4;
        MapEntryPoint mapEntryPoint5 = new MapEntryPoint("EXPLORE_SEARCH", 4, "explore_search");
        A05 = mapEntryPoint5;
        MapEntryPoint mapEntryPoint6 = new MapEntryPoint("GUIDE", 5, "guide");
        A07 = mapEntryPoint6;
        MapEntryPoint mapEntryPoint7 = new MapEntryPoint("HASHTAG_PAGE", 6, "hashtag_page");
        A08 = mapEntryPoint7;
        MapEntryPoint mapEntryPoint8 = new MapEntryPoint("LOCATION_PAGE_BUTTON", 7, "location_page_button");
        A09 = mapEntryPoint8;
        MapEntryPoint mapEntryPoint9 = new MapEntryPoint("LOCATION_PAGE_EFFECTS_BUTTON", 8, "location_page_effects_button");
        A0A = mapEntryPoint9;
        MapEntryPoint mapEntryPoint10 = new MapEntryPoint("LOCATION_PAGE_MAP", 9, "location_page_map");
        A0B = mapEntryPoint10;
        MapEntryPoint mapEntryPoint11 = new MapEntryPoint("LOCATION_PAGE_TAKEOVER", 10, "location_page");
        A0C = mapEntryPoint11;
        MapEntryPoint mapEntryPoint12 = new MapEntryPoint("STORY_VIEWER", 11, "story_viewer");
        A0G = mapEntryPoint12;
        MapEntryPoint mapEntryPoint13 = new MapEntryPoint("PLACES_HCM", 12, "places_hcm");
        A0E = mapEntryPoint13;
        MapEntryPoint mapEntryPoint14 = new MapEntryPoint("SAVE_HOME", 13, "save_home");
        A0F = mapEntryPoint14;
        MapEntryPoint[] mapEntryPointArr = {mapEntryPoint, mapEntryPoint2, mapEntryPoint3, mapEntryPoint4, mapEntryPoint5, mapEntryPoint6, mapEntryPoint7, mapEntryPoint8, mapEntryPoint9, mapEntryPoint10, mapEntryPoint11, mapEntryPoint12, mapEntryPoint13, mapEntryPoint14};
        A02 = mapEntryPointArr;
        A01 = AbstractC12190kN.A00(mapEntryPointArr);
        CREATOR = new LNL(59);
    }

    public static MapEntryPoint valueOf(String str) {
        return (MapEntryPoint) Enum.valueOf(MapEntryPoint.class, str);
    }

    public static MapEntryPoint[] values() {
        return (MapEntryPoint[]) A02.clone();
    }

    public MapEntryPoint(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
