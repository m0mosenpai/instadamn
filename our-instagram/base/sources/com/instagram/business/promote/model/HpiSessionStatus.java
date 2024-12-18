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
public final class HpiSessionStatus implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ HpiSessionStatus[] A01;
    public static final HpiSessionStatus A02;
    public static final HpiSessionStatus A03;
    public static final HpiSessionStatus A04;
    public static final HpiSessionStatus A05;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        HpiSessionStatus hpiSessionStatus = new HpiSessionStatus("ASSIGNMENT_SCHEDULED", 0);
        A02 = hpiSessionStatus;
        HpiSessionStatus hpiSessionStatus2 = new HpiSessionStatus("FINISHED", 1);
        A03 = hpiSessionStatus2;
        HpiSessionStatus hpiSessionStatus3 = new HpiSessionStatus("IN_PROGRESS", 2);
        A04 = hpiSessionStatus3;
        HpiSessionStatus hpiSessionStatus4 = new HpiSessionStatus("PENDING", 3);
        A05 = hpiSessionStatus4;
        HpiSessionStatus[] hpiSessionStatusArr = {hpiSessionStatus, hpiSessionStatus2, hpiSessionStatus3, hpiSessionStatus4, new HpiSessionStatus("SCHEDULED", 4)};
        A01 = hpiSessionStatusArr;
        A00 = AbstractC12190kN.A00(hpiSessionStatusArr);
        CREATOR = new C70220WId(52);
    }

    public static HpiSessionStatus valueOf(String str) {
        return (HpiSessionStatus) Enum.valueOf(HpiSessionStatus.class, str);
    }

    public static HpiSessionStatus[] values() {
        return (HpiSessionStatus[]) A01.clone();
    }

    public HpiSessionStatus(String str, int i) {
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
