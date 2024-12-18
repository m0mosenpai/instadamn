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
public final class IGAIAgentVisibilityStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGAIAgentVisibilityStatus[] A03;
    public static final IGAIAgentVisibilityStatus A04;
    public static final IGAIAgentVisibilityStatus A05;
    public static final IGAIAgentVisibilityStatus A06;
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
        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus = new IGAIAgentVisibilityStatus("UNRECOGNIZED", 0, "IGAIAgentVisibilityStatus_unspecified");
        A06 = iGAIAgentVisibilityStatus;
        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus2 = new IGAIAgentVisibilityStatus("ONLY_ME", 1, "only_me");
        A04 = iGAIAgentVisibilityStatus2;
        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus3 = new IGAIAgentVisibilityStatus("PUBLIC", 2, "public");
        A05 = iGAIAgentVisibilityStatus3;
        IGAIAgentVisibilityStatus[] iGAIAgentVisibilityStatusArr = {iGAIAgentVisibilityStatus, iGAIAgentVisibilityStatus2, iGAIAgentVisibilityStatus3};
        A03 = iGAIAgentVisibilityStatusArr;
        A02 = AbstractC12190kN.A00(iGAIAgentVisibilityStatusArr);
        IGAIAgentVisibilityStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus4 : values) {
            linkedHashMap.put(iGAIAgentVisibilityStatus4.A00, iGAIAgentVisibilityStatus4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(2);
    }

    public static IGAIAgentVisibilityStatus valueOf(String str) {
        return (IGAIAgentVisibilityStatus) Enum.valueOf(IGAIAgentVisibilityStatus.class, str);
    }

    public static IGAIAgentVisibilityStatus[] values() {
        return (IGAIAgentVisibilityStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGAIAgentVisibilityStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
