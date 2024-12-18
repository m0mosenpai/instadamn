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

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AutoDubStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AutoDubStatus[] A03;
    public static final AutoDubStatus A04;
    public static final AutoDubStatus A05;
    public static final AutoDubStatus A06;
    public static final AutoDubStatus A07;
    public static final AutoDubStatus A08;
    public static final AutoDubStatus A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AutoDubStatus autoDubStatus = new AutoDubStatus("UNRECOGNIZED", 0, "AutoDubStatus_unspecified");
        A09 = autoDubStatus;
        AutoDubStatus autoDubStatus2 = new AutoDubStatus("FAILED", 1, "FAILED");
        A04 = autoDubStatus2;
        AutoDubStatus autoDubStatus3 = new AutoDubStatus("FINISHED", 2, "FINISHED");
        A05 = autoDubStatus3;
        AutoDubStatus autoDubStatus4 = new AutoDubStatus("INITIALIZED", 3, "INITIALIZED");
        A06 = autoDubStatus4;
        AutoDubStatus autoDubStatus5 = new AutoDubStatus("IN_PROGRESS", 4, "IN_PROGRESS");
        A07 = autoDubStatus5;
        AutoDubStatus autoDubStatus6 = new AutoDubStatus("READY_FOR_REVIEW", 5, "READY_FOR_REVIEW");
        A08 = autoDubStatus6;
        AutoDubStatus[] autoDubStatusArr = {autoDubStatus, autoDubStatus2, autoDubStatus3, autoDubStatus4, autoDubStatus5, autoDubStatus6, new AutoDubStatus("USER_APPROVED", 6, "USER_APPROVED")};
        A03 = autoDubStatusArr;
        A02 = AbstractC12190kN.A00(autoDubStatusArr);
        AutoDubStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AutoDubStatus autoDubStatus7 : values) {
            A18.put(autoDubStatus7.A00, autoDubStatus7);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(65);
    }

    public static AutoDubStatus valueOf(String str) {
        return (AutoDubStatus) Enum.valueOf(AutoDubStatus.class, str);
    }

    public static AutoDubStatus[] values() {
        return (AutoDubStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AutoDubStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
