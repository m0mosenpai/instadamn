package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SbgChannelName implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ SbgChannelName[] A01;
    public static final SbgChannelName A02;
    public static final SbgChannelName A03;
    public static final SbgChannelName A04;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SbgChannelName sbgChannelName = new SbgChannelName("LIVE_CALL", 0);
        A03 = sbgChannelName;
        SbgChannelName sbgChannelName2 = new SbgChannelName("SCHEDULED_CALL", 1);
        A04 = sbgChannelName2;
        SbgChannelName sbgChannelName3 = new SbgChannelName("IG_LIVE_CALL", 2);
        A02 = sbgChannelName3;
        SbgChannelName[] sbgChannelNameArr = {sbgChannelName, sbgChannelName2, sbgChannelName3, new SbgChannelName("IG_SCHEDULED_CALL", 3)};
        A01 = sbgChannelNameArr;
        A00 = AbstractC12190kN.A00(sbgChannelNameArr);
        CREATOR = new C70220WId(85);
    }

    public static SbgChannelName valueOf(String str) {
        return (SbgChannelName) Enum.valueOf(SbgChannelName.class, str);
    }

    public static SbgChannelName[] values() {
        return (SbgChannelName[]) A01.clone();
    }

    public SbgChannelName(String str, int i) {
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
