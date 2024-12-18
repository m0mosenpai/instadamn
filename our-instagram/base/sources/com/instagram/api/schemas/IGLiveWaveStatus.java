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
public final class IGLiveWaveStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveWaveStatus[] A03;
    public static final IGLiveWaveStatus A04;
    public static final IGLiveWaveStatus A05;
    public static final IGLiveWaveStatus A06;
    public static final IGLiveWaveStatus A07;
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
        IGLiveWaveStatus iGLiveWaveStatus = new IGLiveWaveStatus("UNRECOGNIZED", 0, "IGLiveWaveStatus_unspecified");
        A05 = iGLiveWaveStatus;
        IGLiveWaveStatus iGLiveWaveStatus2 = new IGLiveWaveStatus("NOT_ELIGIBLE", 1, "not_eligible");
        A04 = iGLiveWaveStatus2;
        IGLiveWaveStatus iGLiveWaveStatus3 = new IGLiveWaveStatus("WAVE_ALREADY_SENT", 2, "wave_already_sent");
        A06 = iGLiveWaveStatus3;
        IGLiveWaveStatus iGLiveWaveStatus4 = new IGLiveWaveStatus("WAVE_ELIGIBLE", 3, "wave_eligible");
        A07 = iGLiveWaveStatus4;
        IGLiveWaveStatus[] iGLiveWaveStatusArr = {iGLiveWaveStatus, iGLiveWaveStatus2, iGLiveWaveStatus3, iGLiveWaveStatus4};
        A03 = iGLiveWaveStatusArr;
        A02 = AbstractC12190kN.A00(iGLiveWaveStatusArr);
        IGLiveWaveStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGLiveWaveStatus iGLiveWaveStatus5 : values) {
            linkedHashMap.put(iGLiveWaveStatus5.A00, iGLiveWaveStatus5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(21);
    }

    public static IGLiveWaveStatus valueOf(String str) {
        return (IGLiveWaveStatus) Enum.valueOf(IGLiveWaveStatus.class, str);
    }

    public static IGLiveWaveStatus[] values() {
        return (IGLiveWaveStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveWaveStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
