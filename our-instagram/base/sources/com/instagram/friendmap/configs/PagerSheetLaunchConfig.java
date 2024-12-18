package com.instagram.friendmap.configs;

import X.C14360o3;
import X.C50229MGk;
import X.C50230MGl;
import X.EnumC46298KeU;
import X.InterfaceC16820sZ;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class PagerSheetLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(84);
    public EnumC46298KeU A00;
    public InterfaceC16820sZ A01;
    public InterfaceC16820sZ A02;
    public boolean A03;
    public final Integer A04;

    public PagerSheetLaunchConfig(Integer num) {
        C14360o3.A0B(num, 1);
        this.A04 = num;
        this.A02 = C50230MGl.A00;
        this.A01 = C50229MGk.A00;
        this.A03 = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        switch (this.A04.intValue()) {
            case 0:
                str = "NUX";
                break;
            case 1:
                str = "CREATION_NOTE_LOCATION_EDUCATION";
                break;
            case 2:
                str = "SHARE_LOCATION_EDUCATION";
                break;
            default:
                str = "MAP_LOCATION_EDUCATION";
                break;
        }
        parcel.writeString(str);
    }
}
