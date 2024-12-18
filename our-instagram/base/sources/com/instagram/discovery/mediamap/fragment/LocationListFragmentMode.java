package com.instagram.discovery.mediamap.fragment;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class LocationListFragmentMode implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ LocationListFragmentMode[] A01;
    public static final LocationListFragmentMode A02;
    public static final LocationListFragmentMode A03;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LocationListFragmentMode locationListFragmentMode = new LocationListFragmentMode("QUERY_LIST", 0);
        A03 = locationListFragmentMode;
        LocationListFragmentMode locationListFragmentMode2 = new LocationListFragmentMode("PIN_LIST", 1);
        A02 = locationListFragmentMode2;
        LocationListFragmentMode[] locationListFragmentModeArr = {locationListFragmentMode, locationListFragmentMode2};
        A01 = locationListFragmentModeArr;
        A00 = AbstractC12190kN.A00(locationListFragmentModeArr);
        CREATOR = new LNL(58);
    }

    public static LocationListFragmentMode valueOf(String str) {
        return (LocationListFragmentMode) Enum.valueOf(LocationListFragmentMode.class, str);
    }

    public static LocationListFragmentMode[] values() {
        return (LocationListFragmentMode[]) A01.clone();
    }

    public LocationListFragmentMode(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
