package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NavBarCameraDestination implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ NavBarCameraDestination[] A03;
    public static final NavBarCameraDestination A04;
    public static final NavBarCameraDestination A05;
    public static final NavBarCameraDestination A06;
    public static final NavBarCameraDestination A07;
    public static final NavBarCameraDestination A08;
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
        NavBarCameraDestination navBarCameraDestination = new NavBarCameraDestination("UNRECOGNIZED", 0, "NavBarCameraDestination_unspecified");
        A08 = navBarCameraDestination;
        NavBarCameraDestination navBarCameraDestination2 = new NavBarCameraDestination("CLIPS", 1, "clips");
        A04 = navBarCameraDestination2;
        NavBarCameraDestination navBarCameraDestination3 = new NavBarCameraDestination("FEED", 2, "feed");
        A05 = navBarCameraDestination3;
        NavBarCameraDestination navBarCameraDestination4 = new NavBarCameraDestination("LIVE", 3, "live");
        A06 = navBarCameraDestination4;
        NavBarCameraDestination navBarCameraDestination5 = new NavBarCameraDestination("STORY", 4, "story");
        A07 = navBarCameraDestination5;
        NavBarCameraDestination[] navBarCameraDestinationArr = {navBarCameraDestination, navBarCameraDestination2, navBarCameraDestination3, navBarCameraDestination4, navBarCameraDestination5, new NavBarCameraDestination("UNKNOWN", 5, "unknown")};
        A03 = navBarCameraDestinationArr;
        A02 = AbstractC12190kN.A00(navBarCameraDestinationArr);
        NavBarCameraDestination[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (NavBarCameraDestination navBarCameraDestination6 : values) {
            linkedHashMap.put(navBarCameraDestination6.A00, navBarCameraDestination6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(63);
    }

    public static NavBarCameraDestination valueOf(String str) {
        return (NavBarCameraDestination) Enum.valueOf(NavBarCameraDestination.class, str);
    }

    public static NavBarCameraDestination[] values() {
        return (NavBarCameraDestination[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public NavBarCameraDestination(String str, int i, String str2) {
        this.A00 = str2;
    }
}
