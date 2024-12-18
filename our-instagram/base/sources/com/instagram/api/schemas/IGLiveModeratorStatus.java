package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IGLiveModeratorStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveModeratorStatus[] A03;
    public static final IGLiveModeratorStatus A04;
    public static final IGLiveModeratorStatus A05;
    public static final IGLiveModeratorStatus A06;
    public static final IGLiveModeratorStatus A07;
    public static final IGLiveModeratorStatus A08;
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
        IGLiveModeratorStatus iGLiveModeratorStatus = new IGLiveModeratorStatus("UNRECOGNIZED", 0, "IGLiveModeratorStatus_unspecified");
        A08 = iGLiveModeratorStatus;
        IGLiveModeratorStatus iGLiveModeratorStatus2 = new IGLiveModeratorStatus("ACTIVE", 1, AppStateModule.APP_STATE_ACTIVE);
        A04 = iGLiveModeratorStatus2;
        IGLiveModeratorStatus iGLiveModeratorStatus3 = new IGLiveModeratorStatus("INACTIVE", 2, "inactive");
        A05 = iGLiveModeratorStatus3;
        IGLiveModeratorStatus iGLiveModeratorStatus4 = new IGLiveModeratorStatus("NOT_ASSIGNED", 3, "not_assigned");
        A06 = iGLiveModeratorStatus4;
        IGLiveModeratorStatus iGLiveModeratorStatus5 = new IGLiveModeratorStatus("RESIGNED", 4, "resigned");
        A07 = iGLiveModeratorStatus5;
        IGLiveModeratorStatus[] iGLiveModeratorStatusArr = {iGLiveModeratorStatus, iGLiveModeratorStatus2, iGLiveModeratorStatus3, iGLiveModeratorStatus4, iGLiveModeratorStatus5, new IGLiveModeratorStatus("REVOKED", 5, "revoked")};
        A03 = iGLiveModeratorStatusArr;
        A02 = AbstractC12190kN.A00(iGLiveModeratorStatusArr);
        IGLiveModeratorStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGLiveModeratorStatus iGLiveModeratorStatus6 : values) {
            linkedHashMap.put(iGLiveModeratorStatus6.A00, iGLiveModeratorStatus6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(19);
    }

    public static IGLiveModeratorStatus valueOf(String str) {
        return (IGLiveModeratorStatus) Enum.valueOf(IGLiveModeratorStatus.class, str);
    }

    public static IGLiveModeratorStatus[] values() {
        return (IGLiveModeratorStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveModeratorStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
