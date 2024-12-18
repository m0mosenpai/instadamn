package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IGLiveGameStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveGameStatus[] A03;
    public static final IGLiveGameStatus A04;
    public static final IGLiveGameStatus A05;
    public static final IGLiveGameStatus A06;
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
        IGLiveGameStatus iGLiveGameStatus = new IGLiveGameStatus("UNRECOGNIZED", 0, "IGLiveGameStatus_unspecified");
        A06 = iGLiveGameStatus;
        IGLiveGameStatus iGLiveGameStatus2 = new IGLiveGameStatus("ACTIVE", 1, AppStateModule.APP_STATE_ACTIVE);
        A04 = iGLiveGameStatus2;
        IGLiveGameStatus iGLiveGameStatus3 = new IGLiveGameStatus("INACTIVE", 2, "inactive");
        A05 = iGLiveGameStatus3;
        IGLiveGameStatus[] iGLiveGameStatusArr = {iGLiveGameStatus, iGLiveGameStatus2, iGLiveGameStatus3, new IGLiveGameStatus("INITIATED", 3, "initiated")};
        A03 = iGLiveGameStatusArr;
        A02 = AbstractC12190kN.A00(iGLiveGameStatusArr);
        IGLiveGameStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGLiveGameStatus iGLiveGameStatus4 : values) {
            linkedHashMap.put(iGLiveGameStatus4.A00, iGLiveGameStatus4);
        }
        A01 = linkedHashMap;
        CREATOR = new C41858IgC(36);
    }

    public static IGLiveGameStatus valueOf(String str) {
        return (IGLiveGameStatus) Enum.valueOf(IGLiveGameStatus.class, str);
    }

    public static IGLiveGameStatus[] values() {
        return (IGLiveGameStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveGameStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
